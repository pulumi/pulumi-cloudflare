// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDeviceDefaultProfileCertificatesState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDeviceDefaultProfileCertificatesState Empty = new ZeroTrustDeviceDefaultProfileCertificatesState();

    /**
     * The current status of the device policy certificate provisioning feature for WARP clients.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The current status of the device policy certificate provisioning feature for WARP clients.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ZeroTrustDeviceDefaultProfileCertificatesState() {}

    private ZeroTrustDeviceDefaultProfileCertificatesState(ZeroTrustDeviceDefaultProfileCertificatesState $) {
        this.enabled = $.enabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDeviceDefaultProfileCertificatesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDeviceDefaultProfileCertificatesState $;

        public Builder() {
            $ = new ZeroTrustDeviceDefaultProfileCertificatesState();
        }

        public Builder(ZeroTrustDeviceDefaultProfileCertificatesState defaults) {
            $ = new ZeroTrustDeviceDefaultProfileCertificatesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled The current status of the device policy certificate provisioning feature for WARP clients.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The current status of the device policy certificate provisioning feature for WARP clients.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZeroTrustDeviceDefaultProfileCertificatesState build() {
            return $;
        }
    }

}
