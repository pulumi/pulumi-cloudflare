// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetAccessRuleFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccessRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessRulePlainArgs Empty = new GetAccessRulePlainArgs();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable String accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="filter")
    private @Nullable GetAccessRuleFilter filter;

    public Optional<GetAccessRuleFilter> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Unique identifier for a rule.
     * 
     */
    @Import(name="ruleId")
    private @Nullable String ruleId;

    /**
     * @return Unique identifier for a rule.
     * 
     */
    public Optional<String> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetAccessRulePlainArgs() {}

    private GetAccessRulePlainArgs(GetAccessRulePlainArgs $) {
        this.accountId = $.accountId;
        this.filter = $.filter;
        this.ruleId = $.ruleId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessRulePlainArgs $;

        public Builder() {
            $ = new GetAccessRulePlainArgs();
        }

        public Builder(GetAccessRulePlainArgs defaults) {
            $ = new GetAccessRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable String accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder filter(@Nullable GetAccessRuleFilter filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param ruleId Unique identifier for a rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable String ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetAccessRulePlainArgs build() {
            return $;
        }
    }

}
