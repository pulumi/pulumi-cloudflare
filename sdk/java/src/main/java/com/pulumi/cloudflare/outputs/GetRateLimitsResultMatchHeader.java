// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRateLimitsResultMatchHeader {
    /**
     * @return The name of the response header to match.
     * 
     */
    private String name;
    /**
     * @return The operator used when matching: `eq` means &#34;equal&#34; and `ne` means &#34;not equal&#34;.
     * Available values: &#34;eq&#34;, &#34;ne&#34;.
     * 
     */
    private String op;
    /**
     * @return The value of the response header, which must match exactly.
     * 
     */
    private String value;

    private GetRateLimitsResultMatchHeader() {}
    /**
     * @return The name of the response header to match.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The operator used when matching: `eq` means &#34;equal&#34; and `ne` means &#34;not equal&#34;.
     * Available values: &#34;eq&#34;, &#34;ne&#34;.
     * 
     */
    public String op() {
        return this.op;
    }
    /**
     * @return The value of the response header, which must match exactly.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRateLimitsResultMatchHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String op;
        private String value;
        public Builder() {}
        public Builder(GetRateLimitsResultMatchHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.op = defaults.op;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRateLimitsResultMatchHeader", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder op(String op) {
            if (op == null) {
              throw new MissingRequiredPropertyException("GetRateLimitsResultMatchHeader", "op");
            }
            this.op = op;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetRateLimitsResultMatchHeader", "value");
            }
            this.value = value;
            return this;
        }
        public GetRateLimitsResultMatchHeader build() {
            final var _resultValue = new GetRateLimitsResultMatchHeader();
            _resultValue.name = name;
            _resultValue.op = op;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
