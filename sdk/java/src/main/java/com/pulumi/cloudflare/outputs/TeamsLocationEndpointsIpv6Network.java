// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TeamsLocationEndpointsIpv6Network {
    /**
     * @return CIDR notation representation of the network IP.
     * 
     */
    private String network;

    private TeamsLocationEndpointsIpv6Network() {}
    /**
     * @return CIDR notation representation of the network IP.
     * 
     */
    public String network() {
        return this.network;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsLocationEndpointsIpv6Network defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String network;
        public Builder() {}
        public Builder(TeamsLocationEndpointsIpv6Network defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
        }

        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("TeamsLocationEndpointsIpv6Network", "network");
            }
            this.network = network;
            return this;
        }
        public TeamsLocationEndpointsIpv6Network build() {
            final var _resultValue = new TeamsLocationEndpointsIpv6Network();
            _resultValue.network = network;
            return _resultValue;
        }
    }
}