// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationsResultPolicyIncludeDevicePosture {
    /**
     * @return The ID of a device posture integration.
     * 
     */
    private String integrationUid;

    private GetZeroTrustAccessApplicationsResultPolicyIncludeDevicePosture() {}
    /**
     * @return The ID of a device posture integration.
     * 
     */
    public String integrationUid() {
        return this.integrationUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationsResultPolicyIncludeDevicePosture defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String integrationUid;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationsResultPolicyIncludeDevicePosture defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationUid = defaults.integrationUid;
        }

        @CustomType.Setter
        public Builder integrationUid(String integrationUid) {
            if (integrationUid == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultPolicyIncludeDevicePosture", "integrationUid");
            }
            this.integrationUid = integrationUid;
            return this;
        }
        public GetZeroTrustAccessApplicationsResultPolicyIncludeDevicePosture build() {
            final var _resultValue = new GetZeroTrustAccessApplicationsResultPolicyIncludeDevicePosture();
            _resultValue.integrationUid = integrationUid;
            return _resultValue;
        }
    }
}
