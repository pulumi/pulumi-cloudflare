// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession {
    /**
     * @return Configure how fresh the session needs to be to be considered valid.
     * 
     */
    private String duration;
    /**
     * @return Set to true to enable session enforcement.
     * 
     */
    private Boolean enforce;

    private GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession() {}
    /**
     * @return Configure how fresh the session needs to be to be considered valid.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Set to true to enable session enforcement.
     * 
     */
    public Boolean enforce() {
        return this.enforce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String duration;
        private Boolean enforce;
        public Builder() {}
        public Builder(GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enforce = defaults.enforce;
        }

        @CustomType.Setter
        public Builder duration(String duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder enforce(Boolean enforce) {
            if (enforce == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession", "enforce");
            }
            this.enforce = enforce;
            return this;
        }
        public GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession build() {
            final var _resultValue = new GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession();
            _resultValue.duration = duration;
            _resultValue.enforce = enforce;
            return _resultValue;
        }
    }
}
