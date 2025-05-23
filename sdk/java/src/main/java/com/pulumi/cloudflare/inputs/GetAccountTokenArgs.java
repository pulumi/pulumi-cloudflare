// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetAccountTokenFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountTokenArgs Empty = new GetAccountTokenArgs();

    /**
     * Account identifier tag.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account identifier tag.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="filter")
    private @Nullable Output<GetAccountTokenFilterArgs> filter;

    public Optional<Output<GetAccountTokenFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Token identifier tag.
     * 
     */
    @Import(name="tokenId")
    private @Nullable Output<String> tokenId;

    /**
     * @return Token identifier tag.
     * 
     */
    public Optional<Output<String>> tokenId() {
        return Optional.ofNullable(this.tokenId);
    }

    private GetAccountTokenArgs() {}

    private GetAccountTokenArgs(GetAccountTokenArgs $) {
        this.accountId = $.accountId;
        this.filter = $.filter;
        this.tokenId = $.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountTokenArgs $;

        public Builder() {
            $ = new GetAccountTokenArgs();
        }

        public Builder(GetAccountTokenArgs defaults) {
            $ = new GetAccountTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder filter(@Nullable Output<GetAccountTokenFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(GetAccountTokenFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param tokenId Token identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder tokenId(@Nullable Output<String> tokenId) {
            $.tokenId = tokenId;
            return this;
        }

        /**
         * @param tokenId Token identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder tokenId(String tokenId) {
            return tokenId(Output.of(tokenId));
        }

        public GetAccountTokenArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetAccountTokenArgs", "accountId");
            }
            return $;
        }
    }

}
