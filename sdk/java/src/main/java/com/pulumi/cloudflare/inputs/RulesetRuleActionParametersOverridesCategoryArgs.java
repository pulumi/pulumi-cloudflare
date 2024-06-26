// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersOverridesCategoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersOverridesCategoryArgs Empty = new RulesetRuleActionParametersOverridesCategoryArgs();

    /**
     * Action to perform in the tag-level override. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Action to perform in the tag-level override. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Tag name to apply the ruleset rule override to.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return Tag name to apply the ruleset rule override to.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * Defines if the current tag-level override enables or disables the ruleset rules with the specified tag.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Defines if the current tag-level override enables or disables the ruleset rules with the specified tag.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private RulesetRuleActionParametersOverridesCategoryArgs() {}

    private RulesetRuleActionParametersOverridesCategoryArgs(RulesetRuleActionParametersOverridesCategoryArgs $) {
        this.action = $.action;
        this.category = $.category;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersOverridesCategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersOverridesCategoryArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersOverridesCategoryArgs();
        }

        public Builder(RulesetRuleActionParametersOverridesCategoryArgs defaults) {
            $ = new RulesetRuleActionParametersOverridesCategoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to perform in the tag-level override. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to perform in the tag-level override. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param category Tag name to apply the ruleset rule override to.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Tag name to apply the ruleset rule override to.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param enabled Defines if the current tag-level override enables or disables the ruleset rules with the specified tag.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Defines if the current tag-level override enables or disables the ruleset rules with the specified tag.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public RulesetRuleActionParametersOverridesCategoryArgs build() {
            return $;
        }
    }

}
