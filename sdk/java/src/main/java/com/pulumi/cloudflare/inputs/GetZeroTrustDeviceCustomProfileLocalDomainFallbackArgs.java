// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs Empty = new GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="policyId", required=true)
    private Output<String> policyId;

    public Output<String> policyId() {
        return this.policyId;
    }

    private GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs() {}

    private GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs(GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs $) {
        this.accountId = $.accountId;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs $;

        public Builder() {
            $ = new GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs();
        }

        public Builder(GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs defaults) {
            $ = new GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs", "accountId");
            }
            if ($.policyId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs", "policyId");
            }
            return $;
        }
    }

}
