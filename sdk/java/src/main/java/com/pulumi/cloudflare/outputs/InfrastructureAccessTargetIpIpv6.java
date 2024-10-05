// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InfrastructureAccessTargetIpIpv6 {
    /**
     * @return The IP address of the target.
     * 
     */
    private String ipAddr;
    /**
     * @return The private virtual network identifier for the target.
     * 
     */
    private String virtualNetworkId;

    private InfrastructureAccessTargetIpIpv6() {}
    /**
     * @return The IP address of the target.
     * 
     */
    public String ipAddr() {
        return this.ipAddr;
    }
    /**
     * @return The private virtual network identifier for the target.
     * 
     */
    public String virtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureAccessTargetIpIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddr;
        private String virtualNetworkId;
        public Builder() {}
        public Builder(InfrastructureAccessTargetIpIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddr = defaults.ipAddr;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
        }

        @CustomType.Setter
        public Builder ipAddr(String ipAddr) {
            if (ipAddr == null) {
              throw new MissingRequiredPropertyException("InfrastructureAccessTargetIpIpv6", "ipAddr");
            }
            this.ipAddr = ipAddr;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkId(String virtualNetworkId) {
            if (virtualNetworkId == null) {
              throw new MissingRequiredPropertyException("InfrastructureAccessTargetIpIpv6", "virtualNetworkId");
            }
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public InfrastructureAccessTargetIpIpv6 build() {
            final var _resultValue = new InfrastructureAccessTargetIpIpv6();
            _resultValue.ipAddr = ipAddr;
            _resultValue.virtualNetworkId = virtualNetworkId;
            return _resultValue;
        }
    }
}