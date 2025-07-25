// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersHeaders {
    /**
     * @return Expression for the header value.
     * 
     */
    private @Nullable String expression;
    /**
     * @return Available values: &#34;remove&#34;, &#34;add&#34;, &#34;set&#34;.
     * 
     */
    private String operation;
    /**
     * @return Static value for the header.
     * 
     */
    private @Nullable String value;

    private RulesetRuleActionParametersHeaders() {}
    /**
     * @return Expression for the header value.
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return Available values: &#34;remove&#34;, &#34;add&#34;, &#34;set&#34;.
     * 
     */
    public String operation() {
        return this.operation;
    }
    /**
     * @return Static value for the header.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersHeaders defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private String operation;
        private @Nullable String value;
        public Builder() {}
        public Builder(RulesetRuleActionParametersHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.operation = defaults.operation;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {

            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder operation(String operation) {
            if (operation == null) {
              throw new MissingRequiredPropertyException("RulesetRuleActionParametersHeaders", "operation");
            }
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public RulesetRuleActionParametersHeaders build() {
            final var _resultValue = new RulesetRuleActionParametersHeaders();
            _resultValue.expression = expression;
            _resultValue.operation = operation;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
