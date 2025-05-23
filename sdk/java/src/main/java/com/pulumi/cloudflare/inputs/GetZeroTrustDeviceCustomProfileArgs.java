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


public final class GetZeroTrustDeviceCustomProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustDeviceCustomProfileArgs Empty = new GetZeroTrustDeviceCustomProfileArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    private GetZeroTrustDeviceCustomProfileArgs() {}

    private GetZeroTrustDeviceCustomProfileArgs(GetZeroTrustDeviceCustomProfileArgs $) {
        this.accountId = $.accountId;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustDeviceCustomProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustDeviceCustomProfileArgs $;

        public Builder() {
            $ = new GetZeroTrustDeviceCustomProfileArgs();
        }

        public Builder(GetZeroTrustDeviceCustomProfileArgs defaults) {
            $ = new GetZeroTrustDeviceCustomProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public GetZeroTrustDeviceCustomProfileArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustDeviceCustomProfileArgs", "accountId");
            }
            return $;
        }
    }

}
