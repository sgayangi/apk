<p>Packages:</p>
<ul>
<li>
<a href="#dp.wso2.com%2fv1alpha2">dp.wso2.com/v1alpha2</a>
</li>
</ul>
<h2 id="dp.wso2.com/v1alpha2">dp.wso2.com/v1alpha2</h2>
<p>
<p>Package v1alpha2 contains the API Schema definitions for WSO2 APK.</p>
</p>
Resource Types:
<ul><li>
<a href="#dp.wso2.com/v1alpha2.API">API</a>
</li><li>
<a href="#dp.wso2.com/v1alpha2.APIPolicy">APIPolicy</a>
</li><li>
<a href="#dp.wso2.com/v1alpha2.Authentication">Authentication</a>
</li><li>
<a href="#dp.wso2.com/v1alpha2.TokenIssuer">TokenIssuer</a>
</li></ul>
<h3 id="dp.wso2.com/v1alpha2.API">API
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.API" title="Permanent link">¶</a>
</h3>
<p>
<p>API is the Schema for the apis API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>apiVersion</code></br>
string</td>
<td>
<code>
dp.wso2.com/v1alpha2
</code>
</td>
</tr>
<tr>
<td>
<code>kind</code></br>
string
</td>
<td><code>API</code></td>
</tr>
<tr>
<td>
<code>metadata</code></br>
<em>
<a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#objectmeta-v1-meta">
Kubernetes meta/v1.ObjectMeta
</a>
</em>
</td>
<td>
Refer to the Kubernetes API documentation for the fields of the
<code>metadata</code> field.
</td>
</tr>
<tr>
<td>
<code>spec</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.APISpec">
APISpec
</a>
</em>
</td>
<td>
<br/>
<br/>
<table>
<tr>
<td>
<code>apiName</code></br>
<em>
string
</em>
</td>
<td>
<p>APIName is the unique name of the API
can be used to uniquely identify an API.</p>
</td>
</tr>
<tr>
<td>
<code>apiVersion</code></br>
<em>
string
</em>
</td>
<td>
<p>APIVersion is the version number of the API.</p>
</td>
</tr>
<tr>
<td>
<code>isDefaultVersion</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>IsDefaultVersion indicates whether this API version should be used as a default API</p>
</td>
</tr>
<tr>
<td>
<code>definitionFileRef</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>DefinitionFileRef contains the OpenAPI 3 or Swagger
definition of the API in a ConfigMap.</p>
</td>
</tr>
<tr>
<td>
<code>definitionPath</code></br>
<em>
string
</em>
</td>
<td>
<p>DefinitionPath contains the path to expose the API definition.</p>
</td>
</tr>
<tr>
<td>
<code>production</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.EnvConfig">
[]EnvConfig
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Production contains a list of references to HttpRoutes
of type HttpRoute.
xref: <a href="https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go">https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go</a></p>
</td>
</tr>
<tr>
<td>
<code>sandbox</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.EnvConfig">
[]EnvConfig
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Sandbox contains a list of references to HttpRoutes
of type HttpRoute.
xref: <a href="https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go">https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go</a></p>
</td>
</tr>
<tr>
<td>
<code>apiType</code></br>
<em>
string
</em>
</td>
<td>
<p>APIType denotes the type of the API.
Possible values could be REST, GraphQL, Async</p>
</td>
</tr>
<tr>
<td>
<code>basePath</code></br>
<em>
string
</em>
</td>
<td>
<p>BasePath denotes the basepath of the API.
e.g: /pet-store-api/1.0.6</p>
</td>
</tr>
<tr>
<td>
<code>organization</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Organization denotes the organization.
related to the API</p>
</td>
</tr>
<tr>
<td>
<code>systemAPI</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>SystemAPI denotes if it is an internal system API.</p>
</td>
</tr>
<tr>
<td>
<code>apiProperties</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.Property">
[]Property
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>APIProperties denotes the custom properties of the API.</p>
</td>
</tr>
<tr>
<td>
<code>environment</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Environment denotes the environment of the API.</p>
</td>
</tr>
</table>
</td>
</tr>
<tr>
<td>
<code>status</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.APIStatus">
APIStatus
</a>
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.APIPolicy">APIPolicy
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.APIPolicy" title="Permanent link">¶</a>
</h3>
<p>
<p>APIPolicy is the Schema for the apipolicies API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>apiVersion</code></br>
string</td>
<td>
<code>
dp.wso2.com/v1alpha2
</code>
</td>
</tr>
<tr>
<td>
<code>kind</code></br>
string
</td>
<td><code>APIPolicy</code></td>
</tr>
<tr>
<td>
<code>metadata</code></br>
<em>
<a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#objectmeta-v1-meta">
Kubernetes meta/v1.ObjectMeta
</a>
</em>
</td>
<td>
Refer to the Kubernetes API documentation for the fields of the
<code>metadata</code> field.
</td>
</tr>
<tr>
<td>
<code>spec</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.APIPolicySpec">
APIPolicySpec
</a>
</em>
</td>
<td>
<br/>
<br/>
<table>
<tr>
<td>
<code>default</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.PolicySpec">
PolicySpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>override</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.PolicySpec">
PolicySpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>targetRef</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1alpha2.PolicyTargetReference
</em>
</td>
<td>
</td>
</tr>
</table>
</td>
</tr>
<tr>
<td>
<code>status</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.APIPolicyStatus">
APIPolicyStatus
</a>
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.Authentication">Authentication
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.Authentication" title="Permanent link">¶</a>
</h3>
<p>
<p>Authentication is the Schema for the authentications API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>apiVersion</code></br>
string</td>
<td>
<code>
dp.wso2.com/v1alpha2
</code>
</td>
</tr>
<tr>
<td>
<code>kind</code></br>
string
</td>
<td><code>Authentication</code></td>
</tr>
<tr>
<td>
<code>metadata</code></br>
<em>
<a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#objectmeta-v1-meta">
Kubernetes meta/v1.ObjectMeta
</a>
</em>
</td>
<td>
Refer to the Kubernetes API documentation for the fields of the
<code>metadata</code> field.
</td>
</tr>
<tr>
<td>
<code>spec</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.AuthenticationSpec">
AuthenticationSpec
</a>
</em>
</td>
<td>
<br/>
<br/>
<table>
<tr>
<td>
<code>default</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.AuthSpec">
AuthSpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>override</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.AuthSpec">
AuthSpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>targetRef</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1alpha2.PolicyTargetReference
</em>
</td>
<td>
</td>
</tr>
</table>
</td>
</tr>
<tr>
<td>
<code>status</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.AuthenticationStatus">
AuthenticationStatus
</a>
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.TokenIssuer">TokenIssuer
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.TokenIssuer" title="Permanent link">¶</a>
</h3>
<p>
<p>TokenIssuer is the Schema for the tokenissuers API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>apiVersion</code></br>
string</td>
<td>
<code>
dp.wso2.com/v1alpha2
</code>
</td>
</tr>
<tr>
<td>
<code>kind</code></br>
string
</td>
<td><code>TokenIssuer</code></td>
</tr>
<tr>
<td>
<code>metadata</code></br>
<em>
<a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#objectmeta-v1-meta">
Kubernetes meta/v1.ObjectMeta
</a>
</em>
</td>
<td>
Refer to the Kubernetes API documentation for the fields of the
<code>metadata</code> field.
</td>
</tr>
<tr>
<td>
<code>spec</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.TokenIssuerSpec">
TokenIssuerSpec
</a>
</em>
</td>
<td>
<br/>
<br/>
<table>
<tr>
<td>
<code>name</code></br>
<em>
string
</em>
</td>
<td>
<p>Name is the unique name of the Token Issuer in
the Organization defined . &ldquo;Organization/Name&rdquo; can
be used to uniquely identify an Issuer.</p>
</td>
</tr>
<tr>
<td>
<code>organization</code></br>
<em>
string
</em>
</td>
<td>
<p>Organization denotes the organization of the Token Issuer.</p>
</td>
</tr>
<tr>
<td>
<code>issuer</code></br>
<em>
string
</em>
</td>
<td>
<p>Issuer denotes the issuer of the Token Issuer.</p>
</td>
</tr>
<tr>
<td>
<code>consumerKeyClaim</code></br>
<em>
string
</em>
</td>
<td>
<p>ConsumerKeyClaim denotes the claim key of the consumer key.</p>
</td>
</tr>
<tr>
<td>
<code>scopesClaim</code></br>
<em>
string
</em>
</td>
<td>
<p>ScopesClaim denotes the claim key of the scopes.</p>
</td>
</tr>
<tr>
<td>
<code>signatureValidation</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.SignatureValidation">
SignatureValidation
</a>
</em>
</td>
<td>
<p>SignatureValidation denotes the signature validation method of jwt</p>
</td>
</tr>
<tr>
<td>
<code>claimMappings</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.[]github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.ClaimMapping">
[]github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.ClaimMapping
</a>
</em>
</td>
<td>
<p>ClaimMappings denotes the claim mappings of the jwt</p>
</td>
</tr>
<tr>
<td>
<code>targetRef</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1alpha2.PolicyTargetReference
</em>
</td>
<td>
<p>TargetRef denotes the reference to the which gateway it applies to</p>
</td>
</tr>
<tr>
<td>
<code>environments</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Environments denotes the environments that are applicable for the token issuer.</p>
</td>
</tr>
</table>
</td>
</tr>
<tr>
<td>
<code>status</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.TokenIssuerStatus">
TokenIssuerStatus
</a>
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.APIAuth">APIAuth
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.APIAuth" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.AuthSpec">AuthSpec</a>)
</p>
<p>
<p>APIAuth Authentication scheme type and details</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>oauth2</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.Oauth2Auth">
Oauth2Auth
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Oauth2 is to specify the Oauth2 authentication scheme details</p>
</td>
</tr>
<tr>
<td>
<code>apiKey</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.APIKeyAuth">
[]APIKeyAuth
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>APIKey is to specify the APIKey authentication scheme details</p>
</td>
</tr>
<tr>
<td>
<code>jwt</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.JWT">
JWT
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>JWT is to specify the JWT authentication scheme details</p>
</td>
</tr>
<tr>
<td>
<code>mtls</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.MutualSSLConfig">
MutualSSLConfig
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>MutualSSL is to specify the features and certificates for mutual SSL</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.APIKeyAuth">APIKeyAuth
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.APIKeyAuth" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIAuth">APIAuth</a>)
</p>
<p>
<p>APIKeyAuth APIKey Authentication scheme details</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>in</code></br>
<em>
string
</em>
</td>
<td>
<p>In is to specify how the APIKey is passed to the request</p>
</td>
</tr>
<tr>
<td>
<code>name</code></br>
<em>
string
</em>
</td>
<td>
<p>Name is the name of the header or query parameter to be used</p>
</td>
</tr>
<tr>
<td>
<code>sendTokenToUpstream</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>SendTokenToUpstream is to specify whether the APIKey should be sent to the upstream</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.APIPolicySpec">APIPolicySpec
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.APIPolicySpec" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIPolicy">APIPolicy</a>)
</p>
<p>
<p>APIPolicySpec defines the desired state of APIPolicy</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>default</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.PolicySpec">
PolicySpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>override</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.PolicySpec">
PolicySpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>targetRef</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1alpha2.PolicyTargetReference
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.APIPolicyStatus">APIPolicyStatus
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.APIPolicyStatus" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIPolicy">APIPolicy</a>)
</p>
<p>
<p>APIPolicyStatus defines the observed state of APIPolicy</p>
</p>
<h3 id="dp.wso2.com/v1alpha2.APISpec">APISpec
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.APISpec" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.API">API</a>)
</p>
<p>
<p>APISpec defines the desired state of API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>apiName</code></br>
<em>
string
</em>
</td>
<td>
<p>APIName is the unique name of the API
can be used to uniquely identify an API.</p>
</td>
</tr>
<tr>
<td>
<code>apiVersion</code></br>
<em>
string
</em>
</td>
<td>
<p>APIVersion is the version number of the API.</p>
</td>
</tr>
<tr>
<td>
<code>isDefaultVersion</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>IsDefaultVersion indicates whether this API version should be used as a default API</p>
</td>
</tr>
<tr>
<td>
<code>definitionFileRef</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>DefinitionFileRef contains the OpenAPI 3 or Swagger
definition of the API in a ConfigMap.</p>
</td>
</tr>
<tr>
<td>
<code>definitionPath</code></br>
<em>
string
</em>
</td>
<td>
<p>DefinitionPath contains the path to expose the API definition.</p>
</td>
</tr>
<tr>
<td>
<code>production</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.EnvConfig">
[]EnvConfig
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Production contains a list of references to HttpRoutes
of type HttpRoute.
xref: <a href="https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go">https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go</a></p>
</td>
</tr>
<tr>
<td>
<code>sandbox</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.EnvConfig">
[]EnvConfig
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Sandbox contains a list of references to HttpRoutes
of type HttpRoute.
xref: <a href="https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go">https://github.com/kubernetes-sigs/gateway-api/blob/main/apis/v1beta1/httproute_types.go</a></p>
</td>
</tr>
<tr>
<td>
<code>apiType</code></br>
<em>
string
</em>
</td>
<td>
<p>APIType denotes the type of the API.
Possible values could be REST, GraphQL, Async</p>
</td>
</tr>
<tr>
<td>
<code>basePath</code></br>
<em>
string
</em>
</td>
<td>
<p>BasePath denotes the basepath of the API.
e.g: /pet-store-api/1.0.6</p>
</td>
</tr>
<tr>
<td>
<code>organization</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Organization denotes the organization.
related to the API</p>
</td>
</tr>
<tr>
<td>
<code>systemAPI</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>SystemAPI denotes if it is an internal system API.</p>
</td>
</tr>
<tr>
<td>
<code>apiProperties</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.Property">
[]Property
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>APIProperties denotes the custom properties of the API.</p>
</td>
</tr>
<tr>
<td>
<code>environment</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Environment denotes the environment of the API.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.APIStatus">APIStatus
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.APIStatus" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.API">API</a>)
</p>
<p>
<p>APIStatus defines the observed state of API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>deploymentStatus</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.DeploymentStatus">
DeploymentStatus
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>DeploymentStatus denotes the deployment status of the API</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.AuthSpec">AuthSpec
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.AuthSpec" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.AuthenticationSpec">AuthenticationSpec</a>)
</p>
<p>
<p>AuthSpec specification of the authentication service</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>disabled</code></br>
<em>
bool
</em>
</td>
<td>
<p>Disabled is to disable all authentications</p>
</td>
</tr>
<tr>
<td>
<code>authTypes</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.APIAuth">
APIAuth
</a>
</em>
</td>
<td>
<p>AuthTypes is to specify the authentication scheme types and details</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.AuthenticationSpec">AuthenticationSpec
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.AuthenticationSpec" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.Authentication">Authentication</a>)
</p>
<p>
<p>AuthenticationSpec defines the desired state of Authentication</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>default</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.AuthSpec">
AuthSpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>override</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.AuthSpec">
AuthSpec
</a>
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>targetRef</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1alpha2.PolicyTargetReference
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.AuthenticationStatus">AuthenticationStatus
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.AuthenticationStatus" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.Authentication">Authentication</a>)
</p>
<p>
<p>AuthenticationStatus defines the observed state of Authentication</p>
</p>
<h3 id="dp.wso2.com/v1alpha2.BackendJWTToken">BackendJWTToken
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.BackendJWTToken" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.PolicySpec">PolicySpec</a>)
</p>
<p>
<p>BackendJWTToken holds backend JWT token information</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>name</code></br>
<em>
string
</em>
</td>
<td>
<p>Name holds the name of the BackendJWT resource.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.CERTConfig">CERTConfig
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.CERTConfig" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.JWKS">JWKS</a>, 
<a href="#dp.wso2.com/v1alpha2.SignatureValidation">SignatureValidation</a>)
</p>
<p>
<p>CERTConfig defines the certificate configuration</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>certificateInline</code></br>
<em>
string
</em>
</td>
<td>
<p>CertificateInline is the Inline Certificate entry</p>
</td>
</tr>
<tr>
<td>
<code>secretRef</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.RefConfig">
RefConfig
</a>
</em>
</td>
<td>
<p>SecretRef denotes the reference to the Secret that contains the Certificate</p>
</td>
</tr>
<tr>
<td>
<code>configMapRef</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.RefConfig">
RefConfig
</a>
</em>
</td>
<td>
<p>ConfigMapRef denotes the reference to the ConfigMap that contains the Certificate</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.CORSPolicy">CORSPolicy
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.CORSPolicy" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.PolicySpec">PolicySpec</a>)
</p>
<p>
<p>CORSPolicy holds CORS policy information</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>accessControlAllowCredentials</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>AllowCredentials indicates whether the request can include user credentials like
cookies, HTTP authentication or client side SSL certificates.</p>
</td>
</tr>
<tr>
<td>
<code>accessControlAllowHeaders</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>AccessControlAllowHeaders indicates which headers can be used
during the actual request.</p>
</td>
</tr>
<tr>
<td>
<code>accessControlAllowMethods</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>AccessControlAllowMethods indicates which methods can be used
during the actual request.</p>
</td>
</tr>
<tr>
<td>
<code>accessControlAllowOrigins</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>AccessControlAllowOrigins indicates which origins can be used
during the actual request.</p>
</td>
</tr>
<tr>
<td>
<code>accessControlExposeHeaders</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>AccessControlExposeHeaders indicates which headers can be exposed
as part of the response by listing their names.</p>
</td>
</tr>
<tr>
<td>
<code>accessControlMaxAge</code></br>
<em>
int
</em>
</td>
<td>
<em>(Optional)</em>
<p>AccessControlMaxAge indicates how long the results of a preflight request
can be cached in a preflight result cache.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.ClaimMapping">ClaimMapping
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.ClaimMapping" title="Permanent link">¶</a>
</h3>
<p>
<p>ClaimMapping defines the reference configuration</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>remoteClaim</code></br>
<em>
string
</em>
</td>
<td>
<p>RemoteClaim denotes the remote claim</p>
</td>
</tr>
<tr>
<td>
<code>localClaim</code></br>
<em>
string
</em>
</td>
<td>
<p>LocalClaim denotes the local claim</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.DeploymentStatus">DeploymentStatus
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.DeploymentStatus" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIStatus">APIStatus</a>)
</p>
<p>
<p>DeploymentStatus contains the status of the API deployment</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>status</code></br>
<em>
string
</em>
</td>
<td>
<p>Status denotes the state of the API in its lifecycle.
Possible values could be Accepted, Invalid, Deploy etc.</p>
</td>
</tr>
<tr>
<td>
<code>message</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Message represents a user friendly message that explains the
current state of the API.</p>
</td>
</tr>
<tr>
<td>
<code>accepted</code></br>
<em>
bool
</em>
</td>
<td>
<p>Accepted represents whether the API is accepted or not.</p>
</td>
</tr>
<tr>
<td>
<code>transitionTime</code></br>
<em>
<a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#time-v1-meta">
Kubernetes meta/v1.Time
</a>
</em>
</td>
<td>
<p>TransitionTime represents the last known transition timestamp.</p>
</td>
</tr>
<tr>
<td>
<code>events</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Events contains a list of events related to the API.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.EnvConfig">EnvConfig
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.EnvConfig" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APISpec">APISpec</a>)
</p>
<p>
<p>EnvConfig contains the environment specific configuration</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>httpRouteRefs</code></br>
<em>
[]string
</em>
</td>
<td>
<p>HTTPRouteRefs denotes the environment of the API.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.GQLRoute">GQLRoute
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.GQLRoute" title="Permanent link">¶</a>
</h3>
<p>
<p>GQLRoute is the Schema for the gqlroutes API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>metadata</code></br>
<em>
<a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#objectmeta-v1-meta">
Kubernetes meta/v1.ObjectMeta
</a>
</em>
</td>
<td>
Refer to the Kubernetes API documentation for the fields of the
<code>metadata</code> field.
</td>
</tr>
<tr>
<td>
<code>spec</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteSpec">
GQLRouteSpec
</a>
</em>
</td>
<td>
<br/>
<br/>
<table>
<tr>
<td>
<code>CommonRouteSpec</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1beta1.CommonRouteSpec
</em>
</td>
<td>
<p>
(Members of <code>CommonRouteSpec</code> are embedded into this type.)
</p>
</td>
</tr>
<tr>
<td>
<code>hostnames</code></br>
<em>
[]sigs.k8s.io/gateway-api/apis/v1beta1.Hostname
</em>
</td>
<td>
<em>(Optional)</em>
<p>Hostnames defines a set of hostname that should match against the HTTP Host
header to select a GQLRoute used to process the request.</p>
</td>
</tr>
<tr>
<td>
<code>backendRefs</code></br>
<em>
[]sigs.k8s.io/gateway-api/apis/v1beta1.HTTPBackendRef
</em>
</td>
<td>
<p>BackendRefs defines the backend(s) where matching requests should be
sent.</p>
</td>
</tr>
<tr>
<td>
<code>rules</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteRules">
[]GQLRouteRules
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Rules are a list of GraphQL resources, filters and actions.</p>
</td>
</tr>
</table>
</td>
</tr>
<tr>
<td>
<code>status</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteStatus">
GQLRouteStatus
</a>
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.GQLRouteFilter">GQLRouteFilter
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.GQLRouteFilter" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteRules">GQLRouteRules</a>)
</p>
<p>
<p>GQLRouteFilter defines the filter to be applied to a request.</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>extensionRef</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1beta1.LocalObjectReference
</em>
</td>
<td>
<em>(Optional)</em>
<p>ExtensionRef is an optional, implementation-specific extension to the
&ldquo;filter&rdquo; behavior.  For example, resource &ldquo;myroutefilter&rdquo; in group
&ldquo;networking.example.net&rdquo;). ExtensionRef MUST NOT be used for core and
extended filters.</p>
<p>Support: Implementation-specific</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.GQLRouteMatch">GQLRouteMatch
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.GQLRouteMatch" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteRules">GQLRouteRules</a>)
</p>
<p>
<p>GQLRouteMatch defines the predicate used to match requests to a given
action.</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>type</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.GQLType">
GQLType
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Type specifies GQL typematcher.
When specified, this route will be matched only if the request has the
specified method.</p>
<p>Support: Extended</p>
</td>
</tr>
<tr>
<td>
<code>path</code></br>
<em>
string
</em>
</td>
<td>
<p>Path specifies a GQL request resource matcher.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.GQLRouteRules">GQLRouteRules
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.GQLRouteRules" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteSpec">GQLRouteSpec</a>)
</p>
<p>
<p>GQLRouteRules defines semantics for matching an GraphQL request based on
conditions (matches), processing it (filters), and forwarding the request to
an API object (backendRefs).</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>matches</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteMatch">
[]GQLRouteMatch
</a>
</em>
</td>
<td>
<p>Matches define conditions used for matching the rule against incoming
graphQL requests. Each match is independent, i.e. this rule will be matched
if <strong>any</strong> one of the matches is satisfied.</p>
</td>
</tr>
<tr>
<td>
<code>filters</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteFilter">
[]GQLRouteFilter
</a>
</em>
</td>
<td>
<p>Filters define the filters that are applied to requests that match
this rule.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.GQLRouteSpec">GQLRouteSpec
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.GQLRouteSpec" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.GQLRoute">GQLRoute</a>)
</p>
<p>
<p>GQLRouteSpec defines the desired state of GQLRoute</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>CommonRouteSpec</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1beta1.CommonRouteSpec
</em>
</td>
<td>
<p>
(Members of <code>CommonRouteSpec</code> are embedded into this type.)
</p>
</td>
</tr>
<tr>
<td>
<code>hostnames</code></br>
<em>
[]sigs.k8s.io/gateway-api/apis/v1beta1.Hostname
</em>
</td>
<td>
<em>(Optional)</em>
<p>Hostnames defines a set of hostname that should match against the HTTP Host
header to select a GQLRoute used to process the request.</p>
</td>
</tr>
<tr>
<td>
<code>backendRefs</code></br>
<em>
[]sigs.k8s.io/gateway-api/apis/v1beta1.HTTPBackendRef
</em>
</td>
<td>
<p>BackendRefs defines the backend(s) where matching requests should be
sent.</p>
</td>
</tr>
<tr>
<td>
<code>rules</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteRules">
[]GQLRouteRules
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>Rules are a list of GraphQL resources, filters and actions.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.GQLRouteStatus">GQLRouteStatus
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.GQLRouteStatus" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.GQLRoute">GQLRoute</a>)
</p>
<p>
<p>GQLRouteStatus defines the observed state of GQLRoute</p>
</p>
<h3 id="dp.wso2.com/v1alpha2.GQLType">GQLType
(<code>string</code> alias)</p><a class="headerlink" href="#dp.wso2.com%2fv1alpha2.GQLType" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.GQLRouteMatch">GQLRouteMatch</a>)
</p>
<p>
<p>GQLType describes how to select a GQL request by matching the GQL Type.
The value is expected in upper case.</p>
<p>Note that values may be added to this enum, implementations
must ensure that unknown values will not cause a crash.</p>
<p>Unknown values here must result in the implementation setting the
Accepted Condition for the Route to <code>status: False</code>, with a
Reason of <code>UnsupportedValue</code>.</p>
</p>
<h3 id="dp.wso2.com/v1alpha2.InterceptorReference">InterceptorReference
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.InterceptorReference" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.PolicySpec">PolicySpec</a>)
</p>
<p>
<p>InterceptorReference holds InterceptorService reference using name and namespace</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>name</code></br>
<em>
string
</em>
</td>
<td>
<p>Name is the referced CR&rsquo;s name of InterceptorService resource.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.JWKS">JWKS
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.JWKS" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.SignatureValidation">SignatureValidation</a>)
</p>
<p>
<p>JWKS defines the JWKS endpoint</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>url</code></br>
<em>
string
</em>
</td>
<td>
<p>URL is the URL of the JWKS endpoint</p>
</td>
</tr>
<tr>
<td>
<code>tls</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.CERTConfig">
CERTConfig
</a>
</em>
</td>
<td>
<p>TLS denotes the TLS configuration of the JWKS endpoint</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.JWT">JWT
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.JWT" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIAuth">APIAuth</a>)
</p>
<p>
<p>JWT Json Web Token Authentication scheme details</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>disabled</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>Disabled is to disable JWT authentication</p>
</td>
</tr>
<tr>
<td>
<code>header</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Header is the header name used to pass the JWT</p>
</td>
</tr>
<tr>
<td>
<code>sendTokenToUpstream</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>SendTokenToUpstream is to specify whether the JWT should be sent to the upstream</p>
</td>
</tr>
<tr>
<td>
<code>audience</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Audience who can invoke a corresponding API</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.MutualSSL">MutualSSL
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.MutualSSL" title="Permanent link">¶</a>
</h3>
<p>
<p>MutualSSL defines the mutual SSL configurations for an API</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>Disabled</code></br>
<em>
bool
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>Required</code></br>
<em>
string
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>ClientCertificates</code></br>
<em>
[]string
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.MutualSSLConfig">MutualSSLConfig
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.MutualSSLConfig" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIAuth">APIAuth</a>)
</p>
<p>
<p>MutualSSLConfig scheme type and details</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>disabled</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>Disabled is to disable mTLS authentication</p>
</td>
</tr>
<tr>
<td>
<code>required</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Required indicates whether mutualSSL is mandatory or optional</p>
</td>
</tr>
<tr>
<td>
<code>certificatesInline</code></br>
<em>
[]*string
</em>
</td>
<td>
<p>CertificatesInline is the Inline Certificate entry</p>
</td>
</tr>
<tr>
<td>
<code>secretRefs</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.*github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.RefConfig">
[]*github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.RefConfig
</a>
</em>
</td>
<td>
<p>SecretRefs denotes the reference to the Secret that contains the Certificate</p>
</td>
</tr>
<tr>
<td>
<code>configMapRefs</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.*github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.RefConfig">
[]*github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.RefConfig
</a>
</em>
</td>
<td>
<p>ConfigMapRefs denotes the reference to the ConfigMap that contains the Certificate</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.Oauth2Auth">Oauth2Auth
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.Oauth2Auth" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIAuth">APIAuth</a>)
</p>
<p>
<p>Oauth2Auth OAuth2 Authentication scheme details</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>required</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Required indicates whether OAuth2 is mandatory or optional</p>
</td>
</tr>
<tr>
<td>
<code>disabled</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>Disabled is to disable OAuth2 authentication</p>
</td>
</tr>
<tr>
<td>
<code>header</code></br>
<em>
string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Header is the header name used to pass the OAuth2 token</p>
</td>
</tr>
<tr>
<td>
<code>sendTokenToUpstream</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>SendTokenToUpstream is to specify whether the OAuth2 token should be sent to the upstream</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.PolicySpec">PolicySpec
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.PolicySpec" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APIPolicySpec">APIPolicySpec</a>)
</p>
<p>
<p>PolicySpec contains API policies</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>requestInterceptors</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.InterceptorReference">
[]InterceptorReference
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>RequestInterceptors referenced to intercetor services to be applied
to the request flow.</p>
</td>
</tr>
<tr>
<td>
<code>responseInterceptors</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.InterceptorReference">
[]InterceptorReference
</a>
</em>
</td>
<td>
<em>(Optional)</em>
<p>ResponseInterceptors referenced to intercetor services to be applied
to the response flow.</p>
</td>
</tr>
<tr>
<td>
<code>backendJwtPolicy</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.BackendJWTToken">
BackendJWTToken
</a>
</em>
</td>
<td>
<p>BackendJWTPolicy holds reference to backendJWT policy configurations</p>
</td>
</tr>
<tr>
<td>
<code>cORSPolicy</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.CORSPolicy">
CORSPolicy
</a>
</em>
</td>
<td>
<p>CORS policy to be applied to the API.</p>
</td>
</tr>
<tr>
<td>
<code>subscriptionValidation</code></br>
<em>
bool
</em>
</td>
<td>
<em>(Optional)</em>
<p>SubscriptionValidation denotes whether subscription validation is enabled for the API</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.Property">Property
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.Property" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.APISpec">APISpec</a>)
</p>
<p>
<p>Property holds key value pair of APIProperties</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>name</code></br>
<em>
string
</em>
</td>
<td>
</td>
</tr>
<tr>
<td>
<code>value</code></br>
<em>
string
</em>
</td>
<td>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.RefConfig">RefConfig
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.RefConfig" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.CERTConfig">CERTConfig</a>)
</p>
<p>
<p>RefConfig holds a config for a secret or a configmap</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>name</code></br>
<em>
string
</em>
</td>
<td>
<p>Name of the secret or configmap</p>
</td>
</tr>
<tr>
<td>
<code>key</code></br>
<em>
string
</em>
</td>
<td>
<p>Key of the secret or configmap</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.SignatureValidation">SignatureValidation
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.SignatureValidation" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.TokenIssuerSpec">TokenIssuerSpec</a>)
</p>
<p>
<p>SignatureValidation defines the signature validation method</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>jwks</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.JWKS">
JWKS
</a>
</em>
</td>
<td>
<p>JWKS denotes the JWKS endpoint information</p>
</td>
</tr>
<tr>
<td>
<code>certificate</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.CERTConfig">
CERTConfig
</a>
</em>
</td>
<td>
<p>Certificate denotes the certificate information</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.TokenIssuerSpec">TokenIssuerSpec
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.TokenIssuerSpec" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.TokenIssuer">TokenIssuer</a>)
</p>
<p>
<p>TokenIssuerSpec defines the desired state of TokenIssuer</p>
</p>
<table>
<thead>
<tr>
<th>Field</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
<code>name</code></br>
<em>
string
</em>
</td>
<td>
<p>Name is the unique name of the Token Issuer in
the Organization defined . &ldquo;Organization/Name&rdquo; can
be used to uniquely identify an Issuer.</p>
</td>
</tr>
<tr>
<td>
<code>organization</code></br>
<em>
string
</em>
</td>
<td>
<p>Organization denotes the organization of the Token Issuer.</p>
</td>
</tr>
<tr>
<td>
<code>issuer</code></br>
<em>
string
</em>
</td>
<td>
<p>Issuer denotes the issuer of the Token Issuer.</p>
</td>
</tr>
<tr>
<td>
<code>consumerKeyClaim</code></br>
<em>
string
</em>
</td>
<td>
<p>ConsumerKeyClaim denotes the claim key of the consumer key.</p>
</td>
</tr>
<tr>
<td>
<code>scopesClaim</code></br>
<em>
string
</em>
</td>
<td>
<p>ScopesClaim denotes the claim key of the scopes.</p>
</td>
</tr>
<tr>
<td>
<code>signatureValidation</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.SignatureValidation">
SignatureValidation
</a>
</em>
</td>
<td>
<p>SignatureValidation denotes the signature validation method of jwt</p>
</td>
</tr>
<tr>
<td>
<code>claimMappings</code></br>
<em>
<a href="#dp.wso2.com/v1alpha2.[]github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.ClaimMapping">
[]github.com/wso2/apk/common-go-libs/apis/dp/v1alpha2.ClaimMapping
</a>
</em>
</td>
<td>
<p>ClaimMappings denotes the claim mappings of the jwt</p>
</td>
</tr>
<tr>
<td>
<code>targetRef</code></br>
<em>
sigs.k8s.io/gateway-api/apis/v1alpha2.PolicyTargetReference
</em>
</td>
<td>
<p>TargetRef denotes the reference to the which gateway it applies to</p>
</td>
</tr>
<tr>
<td>
<code>environments</code></br>
<em>
[]string
</em>
</td>
<td>
<em>(Optional)</em>
<p>Environments denotes the environments that are applicable for the token issuer.</p>
</td>
</tr>
</tbody>
</table>
<h3 id="dp.wso2.com/v1alpha2.TokenIssuerStatus">TokenIssuerStatus
<a class="headerlink" href="#dp.wso2.com%2fv1alpha2.TokenIssuerStatus" title="Permanent link">¶</a>
</h3>
<p>
(<em>Appears on:</em>
<a href="#dp.wso2.com/v1alpha2.TokenIssuer">TokenIssuer</a>)
</p>
<p>
<p>TokenIssuerStatus defines the observed state of TokenIssuer</p>
</p>
<hr/>
<p><em>
Generated with <code>gen-crd-api-reference-docs</code>.
</em></p>
