// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersUriQuery {
    /**
     * @return Expression to evaluate for the replacement value.
     * 
     */
    private @Nullable String expression;
    /**
     * @return Predefined replacement value.
     * 
     */
    private @Nullable String value;

    private RulesetRuleActionParametersUriQuery() {}
    /**
     * @return Expression to evaluate for the replacement value.
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return Predefined replacement value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersUriQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private @Nullable String value;
        public Builder() {}
        public Builder(RulesetRuleActionParametersUriQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {

            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public RulesetRuleActionParametersUriQuery build() {
            final var _resultValue = new RulesetRuleActionParametersUriQuery();
            _resultValue.expression = expression;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
