// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetBotnetFeedConfigAsnArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotnetFeedConfigAsnArgs Empty = new GetBotnetFeedConfigAsnArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    private GetBotnetFeedConfigAsnArgs() {}

    private GetBotnetFeedConfigAsnArgs(GetBotnetFeedConfigAsnArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotnetFeedConfigAsnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotnetFeedConfigAsnArgs $;

        public Builder() {
            $ = new GetBotnetFeedConfigAsnArgs();
        }

        public Builder(GetBotnetFeedConfigAsnArgs defaults) {
            $ = new GetBotnetFeedConfigAsnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public GetBotnetFeedConfigAsnArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetBotnetFeedConfigAsnArgs", "accountId");
            }
            return $;
        }
    }

}
