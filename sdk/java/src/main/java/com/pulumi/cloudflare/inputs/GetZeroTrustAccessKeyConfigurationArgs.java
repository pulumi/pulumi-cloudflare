// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZeroTrustAccessKeyConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustAccessKeyConfigurationArgs Empty = new GetZeroTrustAccessKeyConfigurationArgs();

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

    private GetZeroTrustAccessKeyConfigurationArgs() {}

    private GetZeroTrustAccessKeyConfigurationArgs(GetZeroTrustAccessKeyConfigurationArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustAccessKeyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustAccessKeyConfigurationArgs $;

        public Builder() {
            $ = new GetZeroTrustAccessKeyConfigurationArgs();
        }

        public Builder(GetZeroTrustAccessKeyConfigurationArgs defaults) {
            $ = new GetZeroTrustAccessKeyConfigurationArgs(Objects.requireNonNull(defaults));
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

        public GetZeroTrustAccessKeyConfigurationArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustAccessKeyConfigurationArgs", "accountId");
            }
            return $;
        }
    }

}
