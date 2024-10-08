// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZeroTrustTunnelVirtualNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustTunnelVirtualNetworkPlainArgs Empty = new GetZeroTrustTunnelVirtualNetworkPlainArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * The Virtual Network Name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The Virtual Network Name.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetZeroTrustTunnelVirtualNetworkPlainArgs() {}

    private GetZeroTrustTunnelVirtualNetworkPlainArgs(GetZeroTrustTunnelVirtualNetworkPlainArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustTunnelVirtualNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustTunnelVirtualNetworkPlainArgs $;

        public Builder() {
            $ = new GetZeroTrustTunnelVirtualNetworkPlainArgs();
        }

        public Builder(GetZeroTrustTunnelVirtualNetworkPlainArgs defaults) {
            $ = new GetZeroTrustTunnelVirtualNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param name The Virtual Network Name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetZeroTrustTunnelVirtualNetworkPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelVirtualNetworkPlainArgs", "accountId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelVirtualNetworkPlainArgs", "name");
            }
            return $;
        }
    }

}
