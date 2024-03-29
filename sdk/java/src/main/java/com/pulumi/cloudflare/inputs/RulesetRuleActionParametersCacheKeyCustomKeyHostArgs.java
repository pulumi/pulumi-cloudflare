// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersCacheKeyCustomKeyHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersCacheKeyCustomKeyHostArgs Empty = new RulesetRuleActionParametersCacheKeyCustomKeyHostArgs();

    /**
     * Resolve hostname to IP address.
     * 
     */
    @Import(name="resolved")
    private @Nullable Output<Boolean> resolved;

    /**
     * @return Resolve hostname to IP address.
     * 
     */
    public Optional<Output<Boolean>> resolved() {
        return Optional.ofNullable(this.resolved);
    }

    private RulesetRuleActionParametersCacheKeyCustomKeyHostArgs() {}

    private RulesetRuleActionParametersCacheKeyCustomKeyHostArgs(RulesetRuleActionParametersCacheKeyCustomKeyHostArgs $) {
        this.resolved = $.resolved;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKeyHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersCacheKeyCustomKeyHostArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyHostArgs();
        }

        public Builder(RulesetRuleActionParametersCacheKeyCustomKeyHostArgs defaults) {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resolved Resolve hostname to IP address.
         * 
         * @return builder
         * 
         */
        public Builder resolved(@Nullable Output<Boolean> resolved) {
            $.resolved = resolved;
            return this;
        }

        /**
         * @param resolved Resolve hostname to IP address.
         * 
         * @return builder
         * 
         */
        public Builder resolved(Boolean resolved) {
            return resolved(Output.of(resolved));
        }

        public RulesetRuleActionParametersCacheKeyCustomKeyHostArgs build() {
            return $;
        }
    }

}
