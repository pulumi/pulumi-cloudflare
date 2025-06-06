// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TeamsLocationEndpointsDohNetwork {
    /**
     * @return The IP address or IP CIDR.
     * 
     */
    private String network;

    private TeamsLocationEndpointsDohNetwork() {}
    /**
     * @return The IP address or IP CIDR.
     * 
     */
    public String network() {
        return this.network;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsLocationEndpointsDohNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String network;
        public Builder() {}
        public Builder(TeamsLocationEndpointsDohNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
        }

        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("TeamsLocationEndpointsDohNetwork", "network");
            }
            this.network = network;
            return this;
        }
        public TeamsLocationEndpointsDohNetwork build() {
            final var _resultValue = new TeamsLocationEndpointsDohNetwork();
            _resultValue.network = network;
            return _resultValue;
        }
    }
}
