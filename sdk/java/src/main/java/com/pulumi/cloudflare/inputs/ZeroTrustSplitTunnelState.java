// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustSplitTunnelTunnelArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustSplitTunnelState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustSplitTunnelState Empty = new ZeroTrustSplitTunnelState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The mode of the split tunnel policy. Available values: `include`, `exclude`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode of the split tunnel policy. Available values: `include`, `exclude`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The settings policy for which to configure this split tunnel policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The settings policy for which to configure this split tunnel policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * The value of the tunnel attributes.
     * 
     */
    @Import(name="tunnels")
    private @Nullable Output<List<ZeroTrustSplitTunnelTunnelArgs>> tunnels;

    /**
     * @return The value of the tunnel attributes.
     * 
     */
    public Optional<Output<List<ZeroTrustSplitTunnelTunnelArgs>>> tunnels() {
        return Optional.ofNullable(this.tunnels);
    }

    private ZeroTrustSplitTunnelState() {}

    private ZeroTrustSplitTunnelState(ZeroTrustSplitTunnelState $) {
        this.accountId = $.accountId;
        this.mode = $.mode;
        this.policyId = $.policyId;
        this.tunnels = $.tunnels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustSplitTunnelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustSplitTunnelState $;

        public Builder() {
            $ = new ZeroTrustSplitTunnelState();
        }

        public Builder(ZeroTrustSplitTunnelState defaults) {
            $ = new ZeroTrustSplitTunnelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
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
         * @param mode The mode of the split tunnel policy. Available values: `include`, `exclude`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode of the split tunnel policy. Available values: `include`, `exclude`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param policyId The settings policy for which to configure this split tunnel policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The settings policy for which to configure this split tunnel policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param tunnels The value of the tunnel attributes.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(@Nullable Output<List<ZeroTrustSplitTunnelTunnelArgs>> tunnels) {
            $.tunnels = tunnels;
            return this;
        }

        /**
         * @param tunnels The value of the tunnel attributes.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(List<ZeroTrustSplitTunnelTunnelArgs> tunnels) {
            return tunnels(Output.of(tunnels));
        }

        /**
         * @param tunnels The value of the tunnel attributes.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(ZeroTrustSplitTunnelTunnelArgs... tunnels) {
            return tunnels(List.of(tunnels));
        }

        public ZeroTrustSplitTunnelState build() {
            return $;
        }
    }

}
