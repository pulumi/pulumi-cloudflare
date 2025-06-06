// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersOverridesCategory {
    /**
     * @return The action to override rules in the category with.
     * 
     */
    private @Nullable String action;
    /**
     * @return The name of the category to override.
     * 
     */
    private String category;
    /**
     * @return Whether to enable execution of rules in the category.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The sensitivity level to use for rules in the category.
     * Available values: &#34;default&#34;, &#34;medium&#34;, &#34;low&#34;, &#34;eoff&#34;.
     * 
     */
    private @Nullable String sensitivityLevel;

    private RulesetRuleActionParametersOverridesCategory() {}
    /**
     * @return The action to override rules in the category with.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The name of the category to override.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return Whether to enable execution of rules in the category.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The sensitivity level to use for rules in the category.
     * Available values: &#34;default&#34;, &#34;medium&#34;, &#34;low&#34;, &#34;eoff&#34;.
     * 
     */
    public Optional<String> sensitivityLevel() {
        return Optional.ofNullable(this.sensitivityLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersOverridesCategory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private String category;
        private @Nullable Boolean enabled;
        private @Nullable String sensitivityLevel;
        public Builder() {}
        public Builder(RulesetRuleActionParametersOverridesCategory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.sensitivityLevel = defaults.sensitivityLevel;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("RulesetRuleActionParametersOverridesCategory", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder sensitivityLevel(@Nullable String sensitivityLevel) {

            this.sensitivityLevel = sensitivityLevel;
            return this;
        }
        public RulesetRuleActionParametersOverridesCategory build() {
            final var _resultValue = new RulesetRuleActionParametersOverridesCategory();
            _resultValue.action = action;
            _resultValue.category = category;
            _resultValue.enabled = enabled;
            _resultValue.sensitivityLevel = sensitivityLevel;
            return _resultValue;
        }
    }
}
