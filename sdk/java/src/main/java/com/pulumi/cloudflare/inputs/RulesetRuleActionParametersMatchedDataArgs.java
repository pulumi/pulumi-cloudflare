// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RulesetRuleActionParametersMatchedDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersMatchedDataArgs Empty = new RulesetRuleActionParametersMatchedDataArgs();

    /**
     * The public key to encrypt matched data logs with.
     * 
     */
    @Import(name="publicKey", required=true)
    private Output<String> publicKey;

    /**
     * @return The public key to encrypt matched data logs with.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }

    private RulesetRuleActionParametersMatchedDataArgs() {}

    private RulesetRuleActionParametersMatchedDataArgs(RulesetRuleActionParametersMatchedDataArgs $) {
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersMatchedDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersMatchedDataArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersMatchedDataArgs();
        }

        public Builder(RulesetRuleActionParametersMatchedDataArgs defaults) {
            $ = new RulesetRuleActionParametersMatchedDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicKey The public key to encrypt matched data logs with.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The public key to encrypt matched data logs with.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public RulesetRuleActionParametersMatchedDataArgs build() {
            if ($.publicKey == null) {
                throw new MissingRequiredPropertyException("RulesetRuleActionParametersMatchedDataArgs", "publicKey");
            }
            return $;
        }
    }

}
