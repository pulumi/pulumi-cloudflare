// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudConnectorRulesListResultParameters {
    /**
     * @return Host to perform Cloud Connection to
     * 
     */
    private String host;

    private GetCloudConnectorRulesListResultParameters() {}
    /**
     * @return Host to perform Cloud Connection to
     * 
     */
    public String host() {
        return this.host;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudConnectorRulesListResultParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        public Builder() {}
        public Builder(GetCloudConnectorRulesListResultParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetCloudConnectorRulesListResultParameters", "host");
            }
            this.host = host;
            return this;
        }
        public GetCloudConnectorRulesListResultParameters build() {
            final var _resultValue = new GetCloudConnectorRulesListResultParameters();
            _resultValue.host = host;
            return _resultValue;
        }
    }
}
