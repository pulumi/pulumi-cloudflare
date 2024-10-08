// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleType;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ZeroTrustGatewaySettingsLogging {
    /**
     * @return Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    private Boolean redactPii;
    /**
     * @return Represents whether all requests are logged or only the blocked requests are slogged in DNS, HTTP and L4 filters.
     * 
     */
    private ZeroTrustGatewaySettingsLoggingSettingsByRuleType settingsByRuleType;

    private ZeroTrustGatewaySettingsLogging() {}
    /**
     * @return Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    public Boolean redactPii() {
        return this.redactPii;
    }
    /**
     * @return Represents whether all requests are logged or only the blocked requests are slogged in DNS, HTTP and L4 filters.
     * 
     */
    public ZeroTrustGatewaySettingsLoggingSettingsByRuleType settingsByRuleType() {
        return this.settingsByRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustGatewaySettingsLogging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean redactPii;
        private ZeroTrustGatewaySettingsLoggingSettingsByRuleType settingsByRuleType;
        public Builder() {}
        public Builder(ZeroTrustGatewaySettingsLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redactPii = defaults.redactPii;
    	      this.settingsByRuleType = defaults.settingsByRuleType;
        }

        @CustomType.Setter
        public Builder redactPii(Boolean redactPii) {
            if (redactPii == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsLogging", "redactPii");
            }
            this.redactPii = redactPii;
            return this;
        }
        @CustomType.Setter
        public Builder settingsByRuleType(ZeroTrustGatewaySettingsLoggingSettingsByRuleType settingsByRuleType) {
            if (settingsByRuleType == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsLogging", "settingsByRuleType");
            }
            this.settingsByRuleType = settingsByRuleType;
            return this;
        }
        public ZeroTrustGatewaySettingsLogging build() {
            final var _resultValue = new ZeroTrustGatewaySettingsLogging();
            _resultValue.redactPii = redactPii;
            _resultValue.settingsByRuleType = settingsByRuleType;
            return _resultValue;
        }
    }
}
