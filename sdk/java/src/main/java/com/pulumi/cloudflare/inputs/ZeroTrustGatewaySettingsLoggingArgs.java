// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class ZeroTrustGatewaySettingsLoggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsLoggingArgs Empty = new ZeroTrustGatewaySettingsLoggingArgs();

    /**
     * Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    @Import(name="redactPii", required=true)
    private Output<Boolean> redactPii;

    /**
     * @return Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    public Output<Boolean> redactPii() {
        return this.redactPii;
    }

    /**
     * Represents whether all requests are logged or only the blocked requests are slogged in DNS, HTTP and L4 filters.
     * 
     */
    @Import(name="settingsByRuleType", required=true)
    private Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs> settingsByRuleType;

    /**
     * @return Represents whether all requests are logged or only the blocked requests are slogged in DNS, HTTP and L4 filters.
     * 
     */
    public Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs> settingsByRuleType() {
        return this.settingsByRuleType;
    }

    private ZeroTrustGatewaySettingsLoggingArgs() {}

    private ZeroTrustGatewaySettingsLoggingArgs(ZeroTrustGatewaySettingsLoggingArgs $) {
        this.redactPii = $.redactPii;
        this.settingsByRuleType = $.settingsByRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsLoggingArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsLoggingArgs();
        }

        public Builder(ZeroTrustGatewaySettingsLoggingArgs defaults) {
            $ = new ZeroTrustGatewaySettingsLoggingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param redactPii Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
         * 
         * @return builder
         * 
         */
        public Builder redactPii(Output<Boolean> redactPii) {
            $.redactPii = redactPii;
            return this;
        }

        /**
         * @param redactPii Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
         * 
         * @return builder
         * 
         */
        public Builder redactPii(Boolean redactPii) {
            return redactPii(Output.of(redactPii));
        }

        /**
         * @param settingsByRuleType Represents whether all requests are logged or only the blocked requests are slogged in DNS, HTTP and L4 filters.
         * 
         * @return builder
         * 
         */
        public Builder settingsByRuleType(Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs> settingsByRuleType) {
            $.settingsByRuleType = settingsByRuleType;
            return this;
        }

        /**
         * @param settingsByRuleType Represents whether all requests are logged or only the blocked requests are slogged in DNS, HTTP and L4 filters.
         * 
         * @return builder
         * 
         */
        public Builder settingsByRuleType(ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs settingsByRuleType) {
            return settingsByRuleType(Output.of(settingsByRuleType));
        }

        public ZeroTrustGatewaySettingsLoggingArgs build() {
            if ($.redactPii == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsLoggingArgs", "redactPii");
            }
            if ($.settingsByRuleType == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsLoggingArgs", "settingsByRuleType");
            }
            return $;
        }
    }

}
