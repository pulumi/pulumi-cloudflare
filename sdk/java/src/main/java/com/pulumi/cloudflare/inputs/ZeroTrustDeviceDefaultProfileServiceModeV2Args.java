// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDeviceDefaultProfileServiceModeV2Args extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDeviceDefaultProfileServiceModeV2Args Empty = new ZeroTrustDeviceDefaultProfileServiceModeV2Args();

    /**
     * The mode to run the WARP client under.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode to run the WARP client under.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The port number when used with proxy mode.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Double> port;

    /**
     * @return The port number when used with proxy mode.
     * 
     */
    public Optional<Output<Double>> port() {
        return Optional.ofNullable(this.port);
    }

    private ZeroTrustDeviceDefaultProfileServiceModeV2Args() {}

    private ZeroTrustDeviceDefaultProfileServiceModeV2Args(ZeroTrustDeviceDefaultProfileServiceModeV2Args $) {
        this.mode = $.mode;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDeviceDefaultProfileServiceModeV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDeviceDefaultProfileServiceModeV2Args $;

        public Builder() {
            $ = new ZeroTrustDeviceDefaultProfileServiceModeV2Args();
        }

        public Builder(ZeroTrustDeviceDefaultProfileServiceModeV2Args defaults) {
            $ = new ZeroTrustDeviceDefaultProfileServiceModeV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode The mode to run the WARP client under.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode to run the WARP client under.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param port The port number when used with proxy mode.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Double> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number when used with proxy mode.
         * 
         * @return builder
         * 
         */
        public Builder port(Double port) {
            return port(Output.of(port));
        }

        public ZeroTrustDeviceDefaultProfileServiceModeV2Args build() {
            return $;
        }
    }

}
