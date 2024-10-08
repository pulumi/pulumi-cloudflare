// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDnsLocationNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDnsLocationNetworkArgs Empty = new ZeroTrustDnsLocationNetworkArgs();

    /**
     * The ID of this resource.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of this resource.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * CIDR notation representation of the network IP.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return CIDR notation representation of the network IP.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    private ZeroTrustDnsLocationNetworkArgs() {}

    private ZeroTrustDnsLocationNetworkArgs(ZeroTrustDnsLocationNetworkArgs $) {
        this.id = $.id;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDnsLocationNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDnsLocationNetworkArgs $;

        public Builder() {
            $ = new ZeroTrustDnsLocationNetworkArgs();
        }

        public Builder(ZeroTrustDnsLocationNetworkArgs defaults) {
            $ = new ZeroTrustDnsLocationNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param network CIDR notation representation of the network IP.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network CIDR notation representation of the network IP.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        public ZeroTrustDnsLocationNetworkArgs build() {
            if ($.network == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDnsLocationNetworkArgs", "network");
            }
            return $;
        }
    }

}
