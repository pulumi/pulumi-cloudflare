// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStreamKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamKeyArgs Empty = new GetStreamKeyArgs();

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

    private GetStreamKeyArgs() {}

    private GetStreamKeyArgs(GetStreamKeyArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamKeyArgs $;

        public Builder() {
            $ = new GetStreamKeyArgs();
        }

        public Builder(GetStreamKeyArgs defaults) {
            $ = new GetStreamKeyArgs(Objects.requireNonNull(defaults));
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

        public GetStreamKeyArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetStreamKeyArgs", "accountId");
            }
            return $;
        }
    }

}
