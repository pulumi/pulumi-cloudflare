// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class AccessPolicyRequireAnyValidServiceToken {
    private AccessPolicyRequireAnyValidServiceToken() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyRequireAnyValidServiceToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(AccessPolicyRequireAnyValidServiceToken defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public AccessPolicyRequireAnyValidServiceToken build() {
            final var _resultValue = new AccessPolicyRequireAnyValidServiceToken();
            return _resultValue;
        }
    }
}
