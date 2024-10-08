/*
 *  Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  This file contains code derived from Envoy Gateway,
 *  https://github.com/envoyproxy/gateway
 *  and is provided here subject to the following:
 *  Copyright Project Envoy Gateway Authors
 *
 */

package bootstrap

import (
	// Register embed
	_ "embed"
	"fmt"
	"strconv"
	"strings"
	"text/template"

	"github.com/wso2/apk/adapter/config"
	egv1a1 "github.com/wso2/apk/adapter/internal/operator/gateway-api/v1alpha1"
	"github.com/wso2/apk/adapter/pkg/utils/regex"
	"k8s.io/apimachinery/pkg/util/sets"
)

const (
	// envoyCfgFileName is the name of the Envoy configuration file.
	envoyCfgFileName = "bootstrap.yaml"
	// EnvoyAdminAddress is the listening address of the envoy admin interface.
	EnvoyAdminAddress = "0.0.0.0"
	// EnvoyAdminPort is the port used to expose admin interface.
	EnvoyAdminPort = 19000
	// envoyAdminAccessLogPath is the path used to expose admin access log.
	envoyAdminAccessLogPath = "/dev/null"

	envoyReadinessAddress = "0.0.0.0"
	EnvoyReadinessPort    = 19001
	EnvoyReadinessPath    = "/ready"
)

//go:embed bootstrap.yaml.tpl
var bootstrapTmplStr string

var bootstrapTmpl = template.Must(template.New(envoyCfgFileName).Parse(bootstrapTmplStr))

// envoyBootstrap defines the envoy Bootstrap configuration.
type bootstrapConfig struct {
	// parameters defines configurable bootstrap configuration parameters.
	parameters bootstrapParameters
	// rendered is the rendered bootstrap configuration.
	rendered string
}

// envoyBootstrap defines the envoy Bootstrap configuration.
type bootstrapParameters struct {
	// XdsServer defines the configuration of the XDS server.
	XdsServer xdsServerParameters
	// AdminServer defines the configuration of the Envoy admin interface.
	AdminServer adminServerParameters
	// ReadyServer defines the configuration for health check ready listener
	ReadyServer readyServerParameters
	// EnablePrometheus defines whether to enable metrics endpoint for prometheus.
	EnablePrometheus bool
	// OtelMetricSinks defines the configuration of the OpenTelemetry sinks.
	OtelMetricSinks []metricSink
	// EnableStatConfig defines whether to to customize the Envoy proxy stats.
	EnableStatConfig bool
	// StatsMatcher is to control creation of custom Envoy stats with prefix,
	// suffix, and regex expressions match on the name of the stats.
	StatsMatcher *StatsMatcherParameters
}

type xdsServerParameters struct {
	// Address is the address of the XDS Server that Envoy is managed by.
	Address string
	// Port is the port of the XDS Server that Envoy is managed by.
	Port int32
}

type metricSink struct {
	// Address is the address of the XDS Server that Envoy is managed by.
	Address string
	// Port is the port of the XDS Server that Envoy is managed by.
	Port int32
}

type adminServerParameters struct {
	// Address is the address of the Envoy admin interface.
	Address string
	// Port is the port of the Envoy admin interface.
	Port int32
	// AccessLogPath is the path of the Envoy admin access log.
	AccessLogPath string
}

type readyServerParameters struct {
	// Address is the address of the Envoy readiness probe
	Address string
	// Port is the port of envoy readiness probe
	Port int32
	// ReadinessPath is the path for the envoy readiness probe
	ReadinessPath string
}

type StatsMatcherParameters struct {
	Exacts             []string
	Prefixs            []string
	Suffixs            []string
	RegularExpressions []string
}

// render the stringified bootstrap config in yaml format.
func (b *bootstrapConfig) render() error {
	buf := new(strings.Builder)
	if err := bootstrapTmpl.Execute(buf, b.parameters); err != nil {
		return fmt.Errorf("failed to render bootstrap config: %w", err)
	}
	b.rendered = buf.String()

	return nil
}

// GetRenderedBootstrapConfig renders the bootstrap YAML string
func GetRenderedBootstrapConfig(proxyMetrics *egv1a1.ProxyMetrics) (string, error) {
	var (
		enablePrometheus = true
		metricSinks      []metricSink
		StatsMatcher     StatsMatcherParameters
	)

	if proxyMetrics != nil {
		if proxyMetrics.Prometheus != nil {
			enablePrometheus = !proxyMetrics.Prometheus.Disable
		}

		addresses := sets.NewString()
		for _, sink := range proxyMetrics.Sinks {
			if sink.OpenTelemetry == nil {
				continue
			}

			// skip duplicate sinks
			addr := fmt.Sprintf("%s:%d", sink.OpenTelemetry.Host, sink.OpenTelemetry.Port)
			if addresses.Has(addr) {
				continue
			}
			addresses.Insert(addr)

			metricSinks = append(metricSinks, metricSink{
				Address: sink.OpenTelemetry.Host,
				Port:    sink.OpenTelemetry.Port,
			})
		}

		if proxyMetrics.Matches != nil {
			// Add custom envoy proxy stats
			for _, match := range proxyMetrics.Matches {
				// matchType default to exact
				matchType := egv1a1.StringMatchExact
				if match.Type != nil {
					matchType = *match.Type
				}
				switch matchType {
				case egv1a1.StringMatchExact:
					StatsMatcher.Exacts = append(StatsMatcher.Exacts, match.Value)
				case egv1a1.StringMatchPrefix:
					StatsMatcher.Prefixs = append(StatsMatcher.Prefixs, match.Value)
				case egv1a1.StringMatchSuffix:
					StatsMatcher.Suffixs = append(StatsMatcher.Suffixs, match.Value)
				case egv1a1.StringMatchRegularExpression:
					if err := regex.Validate(match.Value); err != nil {
						return "", err
					}
					StatsMatcher.RegularExpressions = append(StatsMatcher.RegularExpressions, match.Value)
				}
			}
		}
	}
	conf := config.ReadConfigs()
	xdsport, _ := strconv.Atoi(conf.Deployment.Gateway.AdapterEnvoyXDSPort)
	cfg := &bootstrapConfig{
		parameters: bootstrapParameters{
			XdsServer: xdsServerParameters{
				Address: conf.Deployment.Gateway.AdapterHost,
				Port:    int32(xdsport),
			},
			AdminServer: adminServerParameters{
				Address:       EnvoyAdminAddress,
				Port:          EnvoyAdminPort,
				AccessLogPath: envoyAdminAccessLogPath,
			},
			ReadyServer: readyServerParameters{
				Address:       envoyReadinessAddress,
				Port:          EnvoyReadinessPort,
				ReadinessPath: EnvoyReadinessPath,
			},
			EnablePrometheus: enablePrometheus,
			OtelMetricSinks:  metricSinks,
		},
	}
	if proxyMetrics != nil && proxyMetrics.Matches != nil {
		cfg.parameters.StatsMatcher = &StatsMatcher
	}

	if err := cfg.render(); err != nil {
		return "", err
	}

	return cfg.rendered, nil
}
