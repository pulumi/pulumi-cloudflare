// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersBrowserTtlArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersBrowserTtlArgs Empty = new RulesetRuleActionParametersBrowserTtlArgs();

    /**
     * The TTL (in seconds) if you choose override_origin mode.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Integer> default_;

    /**
     * @return The TTL (in seconds) if you choose override_origin mode.
     * 
     */
    public Optional<Output<Integer>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * Determines which browser ttl mode to use.
     * Available values: &#34;respect*origin&#34;, &#34;bypass*by*default&#34;, &#34;override*origin&#34;.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return Determines which browser ttl mode to use.
     * Available values: &#34;respect*origin&#34;, &#34;bypass*by*default&#34;, &#34;override*origin&#34;.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    private RulesetRuleActionParametersBrowserTtlArgs() {}

    private RulesetRuleActionParametersBrowserTtlArgs(RulesetRuleActionParametersBrowserTtlArgs $) {
        this.default_ = $.default_;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersBrowserTtlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersBrowserTtlArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersBrowserTtlArgs();
        }

        public Builder(RulesetRuleActionParametersBrowserTtlArgs defaults) {
            $ = new RulesetRuleActionParametersBrowserTtlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ The TTL (in seconds) if you choose override_origin mode.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Integer> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ The TTL (in seconds) if you choose override_origin mode.
         * 
         * @return builder
         * 
         */
        public Builder default_(Integer default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param mode Determines which browser ttl mode to use.
         * Available values: &#34;respect*origin&#34;, &#34;bypass*by*default&#34;, &#34;override*origin&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Determines which browser ttl mode to use.
         * Available values: &#34;respect*origin&#34;, &#34;bypass*by*default&#34;, &#34;override*origin&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public RulesetRuleActionParametersBrowserTtlArgs build() {
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("RulesetRuleActionParametersBrowserTtlArgs", "mode");
            }
            return $;
        }
    }

}
