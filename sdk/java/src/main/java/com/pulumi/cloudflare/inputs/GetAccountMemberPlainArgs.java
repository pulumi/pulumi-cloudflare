// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetAccountMemberFilter;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountMemberPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountMemberPlainArgs Empty = new GetAccountMemberPlainArgs();

    /**
     * Account identifier tag.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    @Import(name="filter")
    private @Nullable GetAccountMemberFilter filter;

    public Optional<GetAccountMemberFilter> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Membership identifier tag.
     * 
     */
    @Import(name="memberId")
    private @Nullable String memberId;

    /**
     * @return Membership identifier tag.
     * 
     */
    public Optional<String> memberId() {
        return Optional.ofNullable(this.memberId);
    }

    private GetAccountMemberPlainArgs() {}

    private GetAccountMemberPlainArgs(GetAccountMemberPlainArgs $) {
        this.accountId = $.accountId;
        this.filter = $.filter;
        this.memberId = $.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountMemberPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountMemberPlainArgs $;

        public Builder() {
            $ = new GetAccountMemberPlainArgs();
        }

        public Builder(GetAccountMemberPlainArgs defaults) {
            $ = new GetAccountMemberPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder filter(@Nullable GetAccountMemberFilter filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param memberId Membership identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder memberId(@Nullable String memberId) {
            $.memberId = memberId;
            return this;
        }

        public GetAccountMemberPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetAccountMemberPlainArgs", "accountId");
            }
            return $;
        }
    }

}
