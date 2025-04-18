// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewayLoggingState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewayLoggingState Empty = new ZeroTrustGatewayLoggingState();

    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    @Import(name="redactPii")
    private @Nullable Output<Boolean> redactPii;

    /**
     * @return Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    public Optional<Output<Boolean>> redactPii() {
        return Optional.ofNullable(this.redactPii);
    }

    /**
     * Logging settings by rule type.
     * 
     */
    @Import(name="settingsByRuleType")
    private @Nullable Output<ZeroTrustGatewayLoggingSettingsByRuleTypeArgs> settingsByRuleType;

    /**
     * @return Logging settings by rule type.
     * 
     */
    public Optional<Output<ZeroTrustGatewayLoggingSettingsByRuleTypeArgs>> settingsByRuleType() {
        return Optional.ofNullable(this.settingsByRuleType);
    }

    private ZeroTrustGatewayLoggingState() {}

    private ZeroTrustGatewayLoggingState(ZeroTrustGatewayLoggingState $) {
        this.accountId = $.accountId;
        this.redactPii = $.redactPii;
        this.settingsByRuleType = $.settingsByRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewayLoggingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewayLoggingState $;

        public Builder() {
            $ = new ZeroTrustGatewayLoggingState();
        }

        public Builder(ZeroTrustGatewayLoggingState defaults) {
            $ = new ZeroTrustGatewayLoggingState(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param redactPii Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
         * 
         * @return builder
         * 
         */
        public Builder redactPii(@Nullable Output<Boolean> redactPii) {
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
         * @param settingsByRuleType Logging settings by rule type.
         * 
         * @return builder
         * 
         */
        public Builder settingsByRuleType(@Nullable Output<ZeroTrustGatewayLoggingSettingsByRuleTypeArgs> settingsByRuleType) {
            $.settingsByRuleType = settingsByRuleType;
            return this;
        }

        /**
         * @param settingsByRuleType Logging settings by rule type.
         * 
         * @return builder
         * 
         */
        public Builder settingsByRuleType(ZeroTrustGatewayLoggingSettingsByRuleTypeArgs settingsByRuleType) {
            return settingsByRuleType(Output.of(settingsByRuleType));
        }

        public ZeroTrustGatewayLoggingState build() {
            return $;
        }
    }

}
