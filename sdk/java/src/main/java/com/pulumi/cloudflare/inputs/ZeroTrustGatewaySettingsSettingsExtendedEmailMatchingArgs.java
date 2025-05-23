// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs Empty = new ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs();

    /**
     * Enable matching all variants of user emails (with + or . modifiers) used as criteria in Firewall policies.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable matching all variants of user emails (with + or . modifiers) used as criteria in Firewall policies.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs() {}

    private ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs(ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs();
        }

        public Builder(ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs defaults) {
            $ = new ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable matching all variants of user emails (with + or . modifiers) used as criteria in Firewall policies.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable matching all variants of user emails (with + or . modifiers) used as criteria in Firewall policies.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs build() {
            return $;
        }
    }

}
