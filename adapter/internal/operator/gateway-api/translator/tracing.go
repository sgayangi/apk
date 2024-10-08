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

package translator

import (
	"errors"
	"fmt"
	"sort"

	corev3 "github.com/envoyproxy/go-control-plane/envoy/config/core/v3"
	tracecfg "github.com/envoyproxy/go-control-plane/envoy/config/trace/v3"
	hcm "github.com/envoyproxy/go-control-plane/envoy/extensions/filters/network/http_connection_manager/v3"
	tracingtype "github.com/envoyproxy/go-control-plane/envoy/type/tracing/v3"
	xdstype "github.com/envoyproxy/go-control-plane/envoy/type/v3"
	"google.golang.org/protobuf/types/known/wrapperspb"
	"k8s.io/utils/ptr"

	"github.com/wso2/apk/adapter/internal/operator/gateway-api/ir"
	egv1a1 "github.com/wso2/apk/adapter/internal/operator/gateway-api/v1alpha1"
	"github.com/wso2/apk/adapter/internal/types"
	"github.com/wso2/apk/adapter/pkg/utils/protocov"
)

func buildHCMTracing(tracing *ir.Tracing) (*hcm.HttpConnectionManager_Tracing, error) {
	if tracing == nil {
		return nil, nil
	}

	oc := &tracecfg.OpenTelemetryConfig{
		GrpcService: &corev3.GrpcService{
			TargetSpecifier: &corev3.GrpcService_EnvoyGrpc_{
				EnvoyGrpc: &corev3.GrpcService_EnvoyGrpc{
					ClusterName: buildClusterName("tracing", tracing.Provider.Host, uint32(tracing.Provider.Port)),
					Authority:   tracing.Provider.Host,
				},
			},
		},
		ServiceName: tracing.ServiceName,
	}

	ocAny, err := protocov.ToAnyWithError(oc)
	if err != nil {
		return nil, fmt.Errorf("failed to marshal OpenTelemetryConfig: %w", err)
	}

	tags := []*tracingtype.CustomTag{}
	// TODO: consider add some default tags for better UX
	for k, v := range tracing.CustomTags {
		switch v.Type {
		case egv1a1.CustomTagTypeLiteral:
			tags = append(tags, &tracingtype.CustomTag{
				Tag: k,
				Type: &tracingtype.CustomTag_Literal_{
					Literal: &tracingtype.CustomTag_Literal{
						Value: v.Literal.Value,
					},
				},
			})
		case egv1a1.CustomTagTypeEnvironment:
			defaultVal := ""
			if v.Environment.DefaultValue != nil {
				defaultVal = *v.Environment.DefaultValue
			}

			tags = append(tags, &tracingtype.CustomTag{
				Tag: k,
				Type: &tracingtype.CustomTag_Environment_{
					Environment: &tracingtype.CustomTag_Environment{
						Name:         v.Environment.Name,
						DefaultValue: defaultVal,
					},
				},
			})
		case egv1a1.CustomTagTypeRequestHeader:
			defaultVal := ""
			if v.RequestHeader.DefaultValue != nil {
				defaultVal = *v.RequestHeader.DefaultValue
			}

			tags = append(tags, &tracingtype.CustomTag{
				Tag: k,
				Type: &tracingtype.CustomTag_RequestHeader{
					RequestHeader: &tracingtype.CustomTag_Header{
						Name:         v.RequestHeader.Name,
						DefaultValue: defaultVal,
					},
				},
			})
		default:
			return nil, fmt.Errorf("unknown custom tag type: %s", v.Type)
		}
	}
	// sort tags by tag name, make result consistent
	sort.Slice(tags, func(i, j int) bool {
		return tags[i].Tag < tags[j].Tag
	})

	return &hcm.HttpConnectionManager_Tracing{
		ClientSampling: &xdstype.Percent{
			Value: 100.0,
		},
		OverallSampling: &xdstype.Percent{
			Value: 100.0,
		},
		RandomSampling: &xdstype.Percent{
			Value: float64(*tracing.SamplingRate),
		},
		Provider: &tracecfg.Tracing_Http{
			Name: "envoy.tracers.opentelemetry",
			ConfigType: &tracecfg.Tracing_Http_TypedConfig{
				TypedConfig: ocAny,
			},
		},
		CustomTags:        tags,
		SpawnUpstreamSpan: wrapperspb.Bool(true),
	}, nil
}

func processClusterForTracing(tCtx *types.ResourceVersionTable, tracing *ir.Tracing) error {
	if tracing == nil {
		return nil
	}

	clusterName := buildClusterName("tracing", tracing.Provider.Host, uint32(tracing.Provider.Port))

	ds := &ir.DestinationSetting{
		Weight:    ptr.To[uint32](1),
		Protocol:  ir.GRPC,
		Endpoints: []*ir.DestinationEndpoint{ir.NewDestEndpoint(tracing.Provider.Host, uint32(tracing.Provider.Port))},
	}
	if err := addXdsCluster(tCtx, &xdsClusterArgs{
		name:         clusterName,
		settings:     []*ir.DestinationSetting{ds},
		tSocket:      nil,
		endpointType: EndpointTypeDNS,
	}); err != nil && !errors.Is(err, ErrXdsClusterExists) {
		return err
	}
	return nil
}
