// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustInfrastructureAccessTargetIpIpv6Args extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustInfrastructureAccessTargetIpIpv6Args Empty = new ZeroTrustInfrastructureAccessTargetIpIpv6Args();

    /**
     * The IP address of the target.
     * 
     */
    @Import(name="ipAddr", required=true)
    private Output<String> ipAddr;

    /**
     * @return The IP address of the target.
     * 
     */
    public Output<String> ipAddr() {
        return this.ipAddr;
    }

    /**
     * The private virtual network identifier for the target.
     * 
     */
    @Import(name="virtualNetworkId", required=true)
    private Output<String> virtualNetworkId;

    /**
     * @return The private virtual network identifier for the target.
     * 
     */
    public Output<String> virtualNetworkId() {
        return this.virtualNetworkId;
    }

    private ZeroTrustInfrastructureAccessTargetIpIpv6Args() {}

    private ZeroTrustInfrastructureAccessTargetIpIpv6Args(ZeroTrustInfrastructureAccessTargetIpIpv6Args $) {
        this.ipAddr = $.ipAddr;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustInfrastructureAccessTargetIpIpv6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustInfrastructureAccessTargetIpIpv6Args $;

        public Builder() {
            $ = new ZeroTrustInfrastructureAccessTargetIpIpv6Args();
        }

        public Builder(ZeroTrustInfrastructureAccessTargetIpIpv6Args defaults) {
            $ = new ZeroTrustInfrastructureAccessTargetIpIpv6Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddr The IP address of the target.
         * 
         * @return builder
         * 
         */
        public Builder ipAddr(Output<String> ipAddr) {
            $.ipAddr = ipAddr;
            return this;
        }

        /**
         * @param ipAddr The IP address of the target.
         * 
         * @return builder
         * 
         */
        public Builder ipAddr(String ipAddr) {
            return ipAddr(Output.of(ipAddr));
        }

        /**
         * @param virtualNetworkId The private virtual network identifier for the target.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(Output<String> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId The private virtual network identifier for the target.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(String virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public ZeroTrustInfrastructureAccessTargetIpIpv6Args build() {
            if ($.ipAddr == null) {
                throw new MissingRequiredPropertyException("ZeroTrustInfrastructureAccessTargetIpIpv6Args", "ipAddr");
            }
            if ($.virtualNetworkId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustInfrastructureAccessTargetIpIpv6Args", "virtualNetworkId");
            }
            return $;
        }
    }

}
