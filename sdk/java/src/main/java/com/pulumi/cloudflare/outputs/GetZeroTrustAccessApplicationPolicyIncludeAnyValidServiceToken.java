// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken {
    private GetZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken build() {
            final var _resultValue = new GetZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken();
            return _resultValue;
        }
    }
}
