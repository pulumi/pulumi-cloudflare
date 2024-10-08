// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustDeviceCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDeviceCertificatesArgs Empty = new ZeroTrustDeviceCertificatesArgs();

    /**
     * `true` if certificate generation is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return `true` if certificate generation is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ZeroTrustDeviceCertificatesArgs() {}

    private ZeroTrustDeviceCertificatesArgs(ZeroTrustDeviceCertificatesArgs $) {
        this.enabled = $.enabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDeviceCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDeviceCertificatesArgs $;

        public Builder() {
            $ = new ZeroTrustDeviceCertificatesArgs();
        }

        public Builder(ZeroTrustDeviceCertificatesArgs defaults) {
            $ = new ZeroTrustDeviceCertificatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled `true` if certificate generation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
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
        public Builder zoneId(Output<String> zoneId) {
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

        public ZeroTrustDeviceCertificatesArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDeviceCertificatesArgs", "enabled");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDeviceCertificatesArgs", "zoneId");
            }
            return $;
        }
    }

}
