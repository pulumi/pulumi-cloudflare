// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersCacheKeyCustomKeyHost {
    /**
     * @return Use the resolved host in the cache key. A value of true will use the resolved host, while a value or false will use the original host.
     * 
     */
    private @Nullable Boolean resolved;

    private RulesetRuleActionParametersCacheKeyCustomKeyHost() {}
    /**
     * @return Use the resolved host in the cache key. A value of true will use the resolved host, while a value or false will use the original host.
     * 
     */
    public Optional<Boolean> resolved() {
        return Optional.ofNullable(this.resolved);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKeyHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean resolved;
        public Builder() {}
        public Builder(RulesetRuleActionParametersCacheKeyCustomKeyHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolved = defaults.resolved;
        }

        @CustomType.Setter
        public Builder resolved(@Nullable Boolean resolved) {

            this.resolved = resolved;
            return this;
        }
        public RulesetRuleActionParametersCacheKeyCustomKeyHost build() {
            final var _resultValue = new RulesetRuleActionParametersCacheKeyCustomKeyHost();
            _resultValue.resolved = resolved;
            return _resultValue;
        }
    }
}
