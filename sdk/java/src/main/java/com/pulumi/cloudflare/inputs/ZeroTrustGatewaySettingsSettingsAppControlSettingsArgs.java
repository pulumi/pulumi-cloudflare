// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs Empty = new ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs();

    /**
     * Enable App Control
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable App Control
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs() {}

    private ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs(ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs();
        }

        public Builder(ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs defaults) {
            $ = new ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable App Control
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable App Control
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs build() {
            return $;
        }
    }

}
