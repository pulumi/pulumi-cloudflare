// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessPolicyIncludeCertificate {
    private GetZeroTrustAccessPolicyIncludeCertificate() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessPolicyIncludeCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetZeroTrustAccessPolicyIncludeCertificate defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetZeroTrustAccessPolicyIncludeCertificate build() {
            final var _resultValue = new GetZeroTrustAccessPolicyIncludeCertificate();
            return _resultValue;
        }
    }
}
