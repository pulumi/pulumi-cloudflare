// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs Empty = new ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs();

    /**
     * The ID of a device posture integration.
     * 
     */
    @Import(name="integrationUid", required=true)
    private Output<String> integrationUid;

    /**
     * @return The ID of a device posture integration.
     * 
     */
    public Output<String> integrationUid() {
        return this.integrationUid;
    }

    private ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs() {}

    private ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs(ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs $) {
        this.integrationUid = $.integrationUid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs $;

        public Builder() {
            $ = new ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs();
        }

        public Builder(ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs defaults) {
            $ = new ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationUid The ID of a device posture integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationUid(Output<String> integrationUid) {
            $.integrationUid = integrationUid;
            return this;
        }

        /**
         * @param integrationUid The ID of a device posture integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationUid(String integrationUid) {
            return integrationUid(Output.of(integrationUid));
        }

        public ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs build() {
            if ($.integrationUid == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationPolicyIncludeDevicePostureArgs", "integrationUid");
            }
            return $;
        }
    }

}
