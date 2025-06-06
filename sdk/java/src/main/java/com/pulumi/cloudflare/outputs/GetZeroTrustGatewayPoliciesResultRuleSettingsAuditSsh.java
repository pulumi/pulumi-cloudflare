// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh {
    /**
     * @return Enable to turn on SSH command logging.
     * 
     */
    private Boolean commandLogging;

    private GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh() {}
    /**
     * @return Enable to turn on SSH command logging.
     * 
     */
    public Boolean commandLogging() {
        return this.commandLogging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean commandLogging;
        public Builder() {}
        public Builder(GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLogging = defaults.commandLogging;
        }

        @CustomType.Setter
        public Builder commandLogging(Boolean commandLogging) {
            if (commandLogging == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh", "commandLogging");
            }
            this.commandLogging = commandLogging;
            return this;
        }
        public GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh build() {
            final var _resultValue = new GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh();
            _resultValue.commandLogging = commandLogging;
            return _resultValue;
        }
    }
}
