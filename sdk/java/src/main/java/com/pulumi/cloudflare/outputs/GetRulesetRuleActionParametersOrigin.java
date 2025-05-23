// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesetRuleActionParametersOrigin {
    /**
     * @return Override the resolved hostname.
     * 
     */
    private String host;
    /**
     * @return Override the destination port.
     * 
     */
    private Double port;

    private GetRulesetRuleActionParametersOrigin() {}
    /**
     * @return Override the resolved hostname.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Override the destination port.
     * 
     */
    public Double port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetRuleActionParametersOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private Double port;
        public Builder() {}
        public Builder(GetRulesetRuleActionParametersOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetRulesetRuleActionParametersOrigin", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(Double port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetRulesetRuleActionParametersOrigin", "port");
            }
            this.port = port;
            return this;
        }
        public GetRulesetRuleActionParametersOrigin build() {
            final var _resultValue = new GetRulesetRuleActionParametersOrigin();
            _resultValue.host = host;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
