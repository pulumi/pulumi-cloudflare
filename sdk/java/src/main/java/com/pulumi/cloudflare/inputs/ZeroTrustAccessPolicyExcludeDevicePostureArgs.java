// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustAccessPolicyExcludeDevicePostureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessPolicyExcludeDevicePostureArgs Empty = new ZeroTrustAccessPolicyExcludeDevicePostureArgs();

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

    private ZeroTrustAccessPolicyExcludeDevicePostureArgs() {}

    private ZeroTrustAccessPolicyExcludeDevicePostureArgs(ZeroTrustAccessPolicyExcludeDevicePostureArgs $) {
        this.integrationUid = $.integrationUid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessPolicyExcludeDevicePostureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessPolicyExcludeDevicePostureArgs $;

        public Builder() {
            $ = new ZeroTrustAccessPolicyExcludeDevicePostureArgs();
        }

        public Builder(ZeroTrustAccessPolicyExcludeDevicePostureArgs defaults) {
            $ = new ZeroTrustAccessPolicyExcludeDevicePostureArgs(Objects.requireNonNull(defaults));
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

        public ZeroTrustAccessPolicyExcludeDevicePostureArgs build() {
            if ($.integrationUid == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessPolicyExcludeDevicePostureArgs", "integrationUid");
            }
            return $;
        }
    }

}
