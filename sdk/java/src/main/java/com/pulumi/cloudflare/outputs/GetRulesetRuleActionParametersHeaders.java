// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesetRuleActionParametersHeaders {
    /**
     * @return Expression for the header value.
     * 
     */
    private String expression;
    /**
     * @return Available values: &#34;remove&#34;, &#34;add&#34;, &#34;set&#34;.
     * 
     */
    private String operation;
    /**
     * @return Static value for the header.
     * 
     */
    private String value;

    private GetRulesetRuleActionParametersHeaders() {}
    /**
     * @return Expression for the header value.
     * 
     */
    public String expression() {
        return this.expression;
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
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetRuleActionParametersHeaders defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expression;
        private String operation;
        private String value;
        public Builder() {}
        public Builder(GetRulesetRuleActionParametersHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.operation = defaults.operation;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder expression(String expression) {
            if (expression == null) {
              throw new MissingRequiredPropertyException("GetRulesetRuleActionParametersHeaders", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder operation(String operation) {
            if (operation == null) {
              throw new MissingRequiredPropertyException("GetRulesetRuleActionParametersHeaders", "operation");
            }
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetRulesetRuleActionParametersHeaders", "value");
            }
            this.value = value;
            return this;
        }
        public GetRulesetRuleActionParametersHeaders build() {
            final var _resultValue = new GetRulesetRuleActionParametersHeaders();
            _resultValue.expression = expression;
            _resultValue.operation = operation;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
