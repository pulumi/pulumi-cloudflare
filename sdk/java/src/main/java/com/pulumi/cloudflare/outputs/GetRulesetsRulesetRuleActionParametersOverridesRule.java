// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersOverridesRule {
    /**
     * @return Action to perform in the rule-level override. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`
     * 
     */
    private @Nullable String action;
    /**
     * @return Defines if the current rule-level override enables or disables the rule.
     * 
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    private @Nullable Boolean enabled;
    /**
     * @return The ID of this resource.
     * 
     */
    private @Nullable String id;
    /**
     * @return Anomaly score threshold to apply in the ruleset rule override. Only applicable to modsecurity-based rulesets.
     * 
     */
    private @Nullable Integer scoreThreshold;
    /**
     * @return Sensitivity level for a ruleset rule override.
     * 
     */
    private @Nullable String sensitivityLevel;
    /**
     * @return Defines if the current rule-level override enables or disables the rule. Available values: `enabled`, `disabled`
     * 
     */
    private @Nullable String status;

    private GetRulesetsRulesetRuleActionParametersOverridesRule() {}
    /**
     * @return Action to perform in the rule-level override. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Defines if the current rule-level override enables or disables the rule.
     * 
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Anomaly score threshold to apply in the ruleset rule override. Only applicable to modsecurity-based rulesets.
     * 
     */
    public Optional<Integer> scoreThreshold() {
        return Optional.ofNullable(this.scoreThreshold);
    }
    /**
     * @return Sensitivity level for a ruleset rule override.
     * 
     */
    public Optional<String> sensitivityLevel() {
        return Optional.ofNullable(this.sensitivityLevel);
    }
    /**
     * @return Defines if the current rule-level override enables or disables the rule. Available values: `enabled`, `disabled`
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersOverridesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable Boolean enabled;
        private @Nullable String id;
        private @Nullable Integer scoreThreshold;
        private @Nullable String sensitivityLevel;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersOverridesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.scoreThreshold = defaults.scoreThreshold;
    	      this.sensitivityLevel = defaults.sensitivityLevel;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder scoreThreshold(@Nullable Integer scoreThreshold) {

            this.scoreThreshold = scoreThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder sensitivityLevel(@Nullable String sensitivityLevel) {

            this.sensitivityLevel = sensitivityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersOverridesRule build() {
            final var _resultValue = new GetRulesetsRulesetRuleActionParametersOverridesRule();
            _resultValue.action = action;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.scoreThreshold = scoreThreshold;
            _resultValue.sensitivityLevel = sensitivityLevel;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
