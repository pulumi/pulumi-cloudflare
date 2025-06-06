// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EmailRoutingCatchAllMatcher {
    /**
     * @return Type of matcher. Default is &#39;all&#39;.
     * Available values: &#34;all&#34;.
     * 
     */
    private String type;

    private EmailRoutingCatchAllMatcher() {}
    /**
     * @return Type of matcher. Default is &#39;all&#39;.
     * Available values: &#34;all&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailRoutingCatchAllMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(EmailRoutingCatchAllMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("EmailRoutingCatchAllMatcher", "type");
            }
            this.type = type;
            return this;
        }
        public EmailRoutingCatchAllMatcher build() {
            final var _resultValue = new EmailRoutingCatchAllMatcher();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
