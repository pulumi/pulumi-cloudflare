// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken {
    private ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken build() {
            final var _resultValue = new ZeroTrustAccessApplicationPolicyIncludeAnyValidServiceToken();
            return _resultValue;
        }
    }
}
