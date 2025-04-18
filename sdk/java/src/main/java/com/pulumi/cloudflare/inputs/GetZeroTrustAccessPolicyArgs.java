// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetZeroTrustAccessPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustAccessPolicyArgs Empty = new GetZeroTrustAccessPolicyArgs();

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

    /**
     * The UUID of the policy
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The UUID of the policy
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    private GetZeroTrustAccessPolicyArgs() {}

    private GetZeroTrustAccessPolicyArgs(GetZeroTrustAccessPolicyArgs $) {
        this.accountId = $.accountId;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustAccessPolicyArgs $;

        public Builder() {
            $ = new GetZeroTrustAccessPolicyArgs();
        }

        public Builder(GetZeroTrustAccessPolicyArgs defaults) {
            $ = new GetZeroTrustAccessPolicyArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param policyId The UUID of the policy
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The UUID of the policy
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public GetZeroTrustAccessPolicyArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustAccessPolicyArgs", "accountId");
            }
            return $;
        }
    }

}
