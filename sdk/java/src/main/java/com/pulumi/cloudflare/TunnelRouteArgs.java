// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TunnelRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final TunnelRouteArgs Empty = new TunnelRouteArgs();

    /**
     * Cloudflare account ID
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Cloudflare account ID
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Optional remark describing the route.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Optional remark describing the route.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The private IPv4 or IPv6 range connected by the route, in CIDR notation.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The private IPv4 or IPv6 range connected by the route, in CIDR notation.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * UUID of the tunnel.
     * 
     */
    @Import(name="tunnelId", required=true)
    private Output<String> tunnelId;

    /**
     * @return UUID of the tunnel.
     * 
     */
    public Output<String> tunnelId() {
        return this.tunnelId;
    }

    /**
     * UUID of the virtual network.
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<String> virtualNetworkId;

    /**
     * @return UUID of the virtual network.
     * 
     */
    public Optional<Output<String>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    private TunnelRouteArgs() {}

    private TunnelRouteArgs(TunnelRouteArgs $) {
        this.accountId = $.accountId;
        this.comment = $.comment;
        this.network = $.network;
        this.tunnelId = $.tunnelId;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TunnelRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TunnelRouteArgs $;

        public Builder() {
            $ = new TunnelRouteArgs();
        }

        public Builder(TunnelRouteArgs defaults) {
            $ = new TunnelRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Cloudflare account ID
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Cloudflare account ID
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param comment Optional remark describing the route.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Optional remark describing the route.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param network The private IPv4 or IPv6 range connected by the route, in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The private IPv4 or IPv6 range connected by the route, in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param tunnelId UUID of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(Output<String> tunnelId) {
            $.tunnelId = tunnelId;
            return this;
        }

        /**
         * @param tunnelId UUID of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(String tunnelId) {
            return tunnelId(Output.of(tunnelId));
        }

        /**
         * @param virtualNetworkId UUID of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(@Nullable Output<String> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId UUID of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(String virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public TunnelRouteArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("TunnelRouteArgs", "accountId");
            }
            if ($.network == null) {
                throw new MissingRequiredPropertyException("TunnelRouteArgs", "network");
            }
            if ($.tunnelId == null) {
                throw new MissingRequiredPropertyException("TunnelRouteArgs", "tunnelId");
            }
            return $;
        }
    }

}
