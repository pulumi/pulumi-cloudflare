// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationPolicyRequireEmail {
    /**
     * @return The email of the user.
     * 
     */
    private String email;

    private GetZeroTrustAccessApplicationPolicyRequireEmail() {}
    /**
     * @return The email of the user.
     * 
     */
    public String email() {
        return this.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationPolicyRequireEmail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationPolicyRequireEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationPolicyRequireEmail", "email");
            }
            this.email = email;
            return this;
        }
        public GetZeroTrustAccessApplicationPolicyRequireEmail build() {
            final var _resultValue = new GetZeroTrustAccessApplicationPolicyRequireEmail();
            _resultValue.email = email;
            return _resultValue;
        }
    }
}
