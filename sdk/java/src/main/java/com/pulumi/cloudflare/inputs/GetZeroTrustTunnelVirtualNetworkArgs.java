// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZeroTrustTunnelVirtualNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustTunnelVirtualNetworkArgs Empty = new GetZeroTrustTunnelVirtualNetworkArgs();

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
     * The Virtual Network Name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Virtual Network Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetZeroTrustTunnelVirtualNetworkArgs() {}

    private GetZeroTrustTunnelVirtualNetworkArgs(GetZeroTrustTunnelVirtualNetworkArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustTunnelVirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustTunnelVirtualNetworkArgs $;

        public Builder() {
            $ = new GetZeroTrustTunnelVirtualNetworkArgs();
        }

        public Builder(GetZeroTrustTunnelVirtualNetworkArgs defaults) {
            $ = new GetZeroTrustTunnelVirtualNetworkArgs(Objects.requireNonNull(defaults));
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
         * @param name The Virtual Network Name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Virtual Network Name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetZeroTrustTunnelVirtualNetworkArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelVirtualNetworkArgs", "accountId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelVirtualNetworkArgs", "name");
            }
            return $;
        }
    }

}