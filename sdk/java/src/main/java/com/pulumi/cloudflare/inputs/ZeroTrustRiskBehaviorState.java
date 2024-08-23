// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustRiskBehaviorBehaviorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustRiskBehaviorState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustRiskBehaviorState Empty = new ZeroTrustRiskBehaviorState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Zero Trust risk behaviors configured on this account
     * 
     */
    @Import(name="behaviors")
    private @Nullable Output<List<ZeroTrustRiskBehaviorBehaviorArgs>> behaviors;

    /**
     * @return Zero Trust risk behaviors configured on this account
     * 
     */
    public Optional<Output<List<ZeroTrustRiskBehaviorBehaviorArgs>>> behaviors() {
        return Optional.ofNullable(this.behaviors);
    }

    private ZeroTrustRiskBehaviorState() {}

    private ZeroTrustRiskBehaviorState(ZeroTrustRiskBehaviorState $) {
        this.accountId = $.accountId;
        this.behaviors = $.behaviors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustRiskBehaviorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustRiskBehaviorState $;

        public Builder() {
            $ = new ZeroTrustRiskBehaviorState();
        }

        public Builder(ZeroTrustRiskBehaviorState defaults) {
            $ = new ZeroTrustRiskBehaviorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
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
        public Builder behaviors(@Nullable Output<List<ZeroTrustRiskBehaviorBehaviorArgs>> behaviors) {
            $.behaviors = behaviors;
            return this;
        }

        /**
         * @param behaviors Zero Trust risk behaviors configured on this account
         * 
         * @return builder
         * 
         */
        public Builder behaviors(List<ZeroTrustRiskBehaviorBehaviorArgs> behaviors) {
            return behaviors(Output.of(behaviors));
        }

        /**
         * @param behaviors Zero Trust risk behaviors configured on this account
         * 
         * @return builder
         * 
         */
        public Builder behaviors(ZeroTrustRiskBehaviorBehaviorArgs... behaviors) {
            return behaviors(List.of(behaviors));
        }

        public ZeroTrustRiskBehaviorState build() {
            return $;
        }
    }

}