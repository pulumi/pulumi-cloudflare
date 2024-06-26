// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.RiskBehaviorBehaviorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RiskBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final RiskBehaviorArgs Empty = new RiskBehaviorArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Zero Trust risk behaviors configured on this account
     * 
     */
    @Import(name="behaviors")
    private @Nullable Output<List<RiskBehaviorBehaviorArgs>> behaviors;

    /**
     * @return Zero Trust risk behaviors configured on this account
     * 
     */
    public Optional<Output<List<RiskBehaviorBehaviorArgs>>> behaviors() {
        return Optional.ofNullable(this.behaviors);
    }

    private RiskBehaviorArgs() {}

    private RiskBehaviorArgs(RiskBehaviorArgs $) {
        this.accountId = $.accountId;
        this.behaviors = $.behaviors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RiskBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RiskBehaviorArgs $;

        public Builder() {
            $ = new RiskBehaviorArgs();
        }

        public Builder(RiskBehaviorArgs defaults) {
            $ = new RiskBehaviorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param behaviors Zero Trust risk behaviors configured on this account
         * 
         * @return builder
         * 
         */
        public Builder behaviors(@Nullable Output<List<RiskBehaviorBehaviorArgs>> behaviors) {
            $.behaviors = behaviors;
            return this;
        }

        /**
         * @param behaviors Zero Trust risk behaviors configured on this account
         * 
         * @return builder
         * 
         */
        public Builder behaviors(List<RiskBehaviorBehaviorArgs> behaviors) {
            return behaviors(Output.of(behaviors));
        }

        /**
         * @param behaviors Zero Trust risk behaviors configured on this account
         * 
         * @return builder
         * 
         */
        public Builder behaviors(RiskBehaviorBehaviorArgs... behaviors) {
            return behaviors(List.of(behaviors));
        }

        public RiskBehaviorArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("RiskBehaviorArgs", "accountId");
            }
            return $;
        }
    }

}
