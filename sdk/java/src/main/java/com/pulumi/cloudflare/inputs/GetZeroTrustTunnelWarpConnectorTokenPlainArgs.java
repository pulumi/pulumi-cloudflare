// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZeroTrustTunnelWarpConnectorTokenPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustTunnelWarpConnectorTokenPlainArgs Empty = new GetZeroTrustTunnelWarpConnectorTokenPlainArgs();

    /**
     * Cloudflare account ID
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Cloudflare account ID
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * UUID of the tunnel.
     * 
     */
    @Import(name="tunnelId", required=true)
    private String tunnelId;

    /**
     * @return UUID of the tunnel.
     * 
     */
    public String tunnelId() {
        return this.tunnelId;
    }

    private GetZeroTrustTunnelWarpConnectorTokenPlainArgs() {}

    private GetZeroTrustTunnelWarpConnectorTokenPlainArgs(GetZeroTrustTunnelWarpConnectorTokenPlainArgs $) {
        this.accountId = $.accountId;
        this.tunnelId = $.tunnelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustTunnelWarpConnectorTokenPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustTunnelWarpConnectorTokenPlainArgs $;

        public Builder() {
            $ = new GetZeroTrustTunnelWarpConnectorTokenPlainArgs();
        }

        public Builder(GetZeroTrustTunnelWarpConnectorTokenPlainArgs defaults) {
            $ = new GetZeroTrustTunnelWarpConnectorTokenPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Cloudflare account ID
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param tunnelId UUID of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(String tunnelId) {
            $.tunnelId = tunnelId;
            return this;
        }

        public GetZeroTrustTunnelWarpConnectorTokenPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelWarpConnectorTokenPlainArgs", "accountId");
            }
            if ($.tunnelId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelWarpConnectorTokenPlainArgs", "tunnelId");
            }
            return $;
        }
    }

}
