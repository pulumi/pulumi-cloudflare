// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs Empty = new GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs();

    @Import(name="accountId", required=true)
    private String accountId;

    public String accountId() {
        return this.accountId;
    }

    private GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs() {}

    private GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs(GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs $;

        public Builder() {
            $ = new GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs();
        }

        public Builder(GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs defaults) {
            $ = new GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs", "accountId");
            }
            return $;
        }
    }

}
