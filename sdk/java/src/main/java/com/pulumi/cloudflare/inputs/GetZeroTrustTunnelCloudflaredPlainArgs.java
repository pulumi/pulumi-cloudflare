// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredFilter;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetZeroTrustTunnelCloudflaredPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustTunnelCloudflaredPlainArgs Empty = new GetZeroTrustTunnelCloudflaredPlainArgs();

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

    @Import(name="filter")
    private @Nullable GetZeroTrustTunnelCloudflaredFilter filter;

    public Optional<GetZeroTrustTunnelCloudflaredFilter> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * UUID of the tunnel.
     * 
     */
    @Import(name="tunnelId")
    private @Nullable String tunnelId;

    /**
     * @return UUID of the tunnel.
     * 
     */
    public Optional<String> tunnelId() {
        return Optional.ofNullable(this.tunnelId);
    }

    private GetZeroTrustTunnelCloudflaredPlainArgs() {}

    private GetZeroTrustTunnelCloudflaredPlainArgs(GetZeroTrustTunnelCloudflaredPlainArgs $) {
        this.accountId = $.accountId;
        this.filter = $.filter;
        this.tunnelId = $.tunnelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustTunnelCloudflaredPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustTunnelCloudflaredPlainArgs $;

        public Builder() {
            $ = new GetZeroTrustTunnelCloudflaredPlainArgs();
        }

        public Builder(GetZeroTrustTunnelCloudflaredPlainArgs defaults) {
            $ = new GetZeroTrustTunnelCloudflaredPlainArgs(Objects.requireNonNull(defaults));
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

        public Builder filter(@Nullable GetZeroTrustTunnelCloudflaredFilter filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param tunnelId UUID of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(@Nullable String tunnelId) {
            $.tunnelId = tunnelId;
            return this;
        }

        public GetZeroTrustTunnelCloudflaredPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredPlainArgs", "accountId");
            }
            return $;
        }
    }

}
