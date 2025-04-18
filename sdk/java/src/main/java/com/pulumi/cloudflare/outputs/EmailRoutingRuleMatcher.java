// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EmailRoutingRuleMatcher {
    /**
     * @return Field for type matcher.
     * Available values: &#34;to&#34;.
     * 
     */
    private String field;
    /**
     * @return Type of matcher.
     * Available values: &#34;literal&#34;.
     * 
     */
    private String type;
    /**
     * @return Value for matcher.
     * 
     */
    private String value;

    private EmailRoutingRuleMatcher() {}
    /**
     * @return Field for type matcher.
     * Available values: &#34;to&#34;.
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return Type of matcher.
     * Available values: &#34;literal&#34;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Value for matcher.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailRoutingRuleMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String field;
        private String type;
        private String value;
        public Builder() {}
        public Builder(EmailRoutingRuleMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder field(String field) {
            if (field == null) {
              throw new MissingRequiredPropertyException("EmailRoutingRuleMatcher", "field");
            }
            this.field = field;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("EmailRoutingRuleMatcher", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("EmailRoutingRuleMatcher", "value");
            }
            this.value = value;
            return this;
        }
        public EmailRoutingRuleMatcher build() {
            final var _resultValue = new EmailRoutingRuleMatcher();
            _resultValue.field = field;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
