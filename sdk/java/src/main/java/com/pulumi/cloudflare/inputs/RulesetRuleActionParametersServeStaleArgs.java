// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersServeStaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersServeStaleArgs Empty = new RulesetRuleActionParametersServeStaleArgs();

    @Import(name="disableStaleWhileUpdating")
    private @Nullable Output<Boolean> disableStaleWhileUpdating;

    public Optional<Output<Boolean>> disableStaleWhileUpdating() {
        return Optional.ofNullable(this.disableStaleWhileUpdating);
    }

    private RulesetRuleActionParametersServeStaleArgs() {}

    private RulesetRuleActionParametersServeStaleArgs(RulesetRuleActionParametersServeStaleArgs $) {
        this.disableStaleWhileUpdating = $.disableStaleWhileUpdating;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersServeStaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersServeStaleArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersServeStaleArgs();
        }

        public Builder(RulesetRuleActionParametersServeStaleArgs defaults) {
            $ = new RulesetRuleActionParametersServeStaleArgs(Objects.requireNonNull(defaults));
        }

        public Builder disableStaleWhileUpdating(@Nullable Output<Boolean> disableStaleWhileUpdating) {
            $.disableStaleWhileUpdating = disableStaleWhileUpdating;
            return this;
        }

        public Builder disableStaleWhileUpdating(Boolean disableStaleWhileUpdating) {
            return disableStaleWhileUpdating(Output.of(disableStaleWhileUpdating));
        }

        public RulesetRuleActionParametersServeStaleArgs build() {
            return $;
        }
    }

}