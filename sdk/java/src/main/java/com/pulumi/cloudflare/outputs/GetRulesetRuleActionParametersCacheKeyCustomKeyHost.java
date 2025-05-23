// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetRulesetRuleActionParametersCacheKeyCustomKeyHost {
    /**
     * @return Use the resolved host in the cache key. A value of true will use the resolved host, while a value or false will use the original host.
     * 
     */
    private Boolean resolved;

    private GetRulesetRuleActionParametersCacheKeyCustomKeyHost() {}
    /**
     * @return Use the resolved host in the cache key. A value of true will use the resolved host, while a value or false will use the original host.
     * 
     */
    public Boolean resolved() {
        return this.resolved;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetRuleActionParametersCacheKeyCustomKeyHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean resolved;
        public Builder() {}
        public Builder(GetRulesetRuleActionParametersCacheKeyCustomKeyHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolved = defaults.resolved;
        }

        @CustomType.Setter
        public Builder resolved(Boolean resolved) {
            if (resolved == null) {
              throw new MissingRequiredPropertyException("GetRulesetRuleActionParametersCacheKeyCustomKeyHost", "resolved");
            }
            this.resolved = resolved;
            return this;
        }
        public GetRulesetRuleActionParametersCacheKeyCustomKeyHost build() {
            final var _resultValue = new GetRulesetRuleActionParametersCacheKeyCustomKeyHost();
            _resultValue.resolved = resolved;
            return _resultValue;
        }
    }
}
