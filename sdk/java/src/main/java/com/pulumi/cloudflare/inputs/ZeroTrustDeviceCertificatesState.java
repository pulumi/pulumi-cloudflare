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


public final class ZeroTrustDeviceCertificatesState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDeviceCertificatesState Empty = new ZeroTrustDeviceCertificatesState();

    /**
     * `true` if certificate generation is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return `true` if certificate generation is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ZeroTrustDeviceCertificatesState() {}

    private ZeroTrustDeviceCertificatesState(ZeroTrustDeviceCertificatesState $) {
        this.enabled = $.enabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDeviceCertificatesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDeviceCertificatesState $;

        public Builder() {
            $ = new ZeroTrustDeviceCertificatesState();
        }

        public Builder(ZeroTrustDeviceCertificatesState defaults) {
            $ = new ZeroTrustDeviceCertificatesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled `true` if certificate generation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled `true` if certificate generation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZeroTrustDeviceCertificatesState build() {
            return $;
        }
    }

}
