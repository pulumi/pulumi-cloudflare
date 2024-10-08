// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustTunnelCloudflaredConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustTunnelCloudflaredConfigArgs Empty = new ZeroTrustTunnelCloudflaredConfigArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Configuration block for Tunnel Configuration.
     * 
     */
    @Import(name="config", required=true)
    private Output<ZeroTrustTunnelCloudflaredConfigConfigArgs> config;

    /**
     * @return Configuration block for Tunnel Configuration.
     * 
     */
    public Output<ZeroTrustTunnelCloudflaredConfigConfigArgs> config() {
        return this.config;
    }

    /**
     * Identifier of the Tunnel to target for this configuration.
     * 
     */
    @Import(name="tunnelId", required=true)
    private Output<String> tunnelId;

    /**
     * @return Identifier of the Tunnel to target for this configuration.
     * 
     */
    public Output<String> tunnelId() {
        return this.tunnelId;
    }

    private ZeroTrustTunnelCloudflaredConfigArgs() {}

    private ZeroTrustTunnelCloudflaredConfigArgs(ZeroTrustTunnelCloudflaredConfigArgs $) {
        this.accountId = $.accountId;
        this.config = $.config;
        this.tunnelId = $.tunnelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustTunnelCloudflaredConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustTunnelCloudflaredConfigArgs $;

        public Builder() {
            $ = new ZeroTrustTunnelCloudflaredConfigArgs();
        }

        public Builder(ZeroTrustTunnelCloudflaredConfigArgs defaults) {
            $ = new ZeroTrustTunnelCloudflaredConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param config Configuration block for Tunnel Configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<ZeroTrustTunnelCloudflaredConfigConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Configuration block for Tunnel Configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(ZeroTrustTunnelCloudflaredConfigConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param tunnelId Identifier of the Tunnel to target for this configuration.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(Output<String> tunnelId) {
            $.tunnelId = tunnelId;
            return this;
        }

        /**
         * @param tunnelId Identifier of the Tunnel to target for this configuration.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(String tunnelId) {
            return tunnelId(Output.of(tunnelId));
        }

        public ZeroTrustTunnelCloudflaredConfigArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelCloudflaredConfigArgs", "accountId");
            }
            if ($.config == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelCloudflaredConfigArgs", "config");
            }
            if ($.tunnelId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelCloudflaredConfigArgs", "tunnelId");
            }
            return $;
        }
    }

}
