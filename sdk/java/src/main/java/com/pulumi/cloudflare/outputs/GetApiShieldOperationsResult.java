// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetApiShieldOperationsResultFeatures;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApiShieldOperationsResult {
    /**
     * @return The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
     * 
     */
    private String endpoint;
    private GetApiShieldOperationsResultFeatures features;
    /**
     * @return RFC3986-compliant host.
     * 
     */
    private String host;
    private String lastUpdated;
    /**
     * @return The HTTP method used to access the endpoint.
     * Available values: &#34;GET&#34;, &#34;POST&#34;, &#34;HEAD&#34;, &#34;OPTIONS&#34;, &#34;PUT&#34;, &#34;DELETE&#34;, &#34;CONNECT&#34;, &#34;PATCH&#34;, &#34;TRACE&#34;.
     * 
     */
    private String method;
    /**
     * @return UUID.
     * 
     */
    private String operationId;

    private GetApiShieldOperationsResult() {}
    /**
     * @return The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    public GetApiShieldOperationsResultFeatures features() {
        return this.features;
    }
    /**
     * @return RFC3986-compliant host.
     * 
     */
    public String host() {
        return this.host;
    }
    public String lastUpdated() {
        return this.lastUpdated;
    }
    /**
     * @return The HTTP method used to access the endpoint.
     * Available values: &#34;GET&#34;, &#34;POST&#34;, &#34;HEAD&#34;, &#34;OPTIONS&#34;, &#34;PUT&#34;, &#34;DELETE&#34;, &#34;CONNECT&#34;, &#34;PATCH&#34;, &#34;TRACE&#34;.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return UUID.
     * 
     */
    public String operationId() {
        return this.operationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiShieldOperationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private GetApiShieldOperationsResultFeatures features;
        private String host;
        private String lastUpdated;
        private String method;
        private String operationId;
        public Builder() {}
        public Builder(GetApiShieldOperationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.features = defaults.features;
    	      this.host = defaults.host;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.method = defaults.method;
    	      this.operationId = defaults.operationId;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResult", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder features(GetApiShieldOperationsResultFeatures features) {
            if (features == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResult", "features");
            }
            this.features = features;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResult", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdated(String lastUpdated) {
            if (lastUpdated == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResult", "lastUpdated");
            }
            this.lastUpdated = lastUpdated;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResult", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder operationId(String operationId) {
            if (operationId == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResult", "operationId");
            }
            this.operationId = operationId;
            return this;
        }
        public GetApiShieldOperationsResult build() {
            final var _resultValue = new GetApiShieldOperationsResult();
            _resultValue.endpoint = endpoint;
            _resultValue.features = features;
            _resultValue.host = host;
            _resultValue.lastUpdated = lastUpdated;
            _resultValue.method = method;
            _resultValue.operationId = operationId;
            return _resultValue;
        }
    }
}
