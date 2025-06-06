// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessApplicationPolicyExcludeEmail {
    /**
     * @return The email of the user.
     * 
     */
    private String email;

    private AccessApplicationPolicyExcludeEmail() {}
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

    public static Builder builder(AccessApplicationPolicyExcludeEmail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        public Builder() {}
        public Builder(AccessApplicationPolicyExcludeEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("AccessApplicationPolicyExcludeEmail", "email");
            }
            this.email = email;
            return this;
        }
        public AccessApplicationPolicyExcludeEmail build() {
            final var _resultValue = new AccessApplicationPolicyExcludeEmail();
            _resultValue.email = email;
            return _resultValue;
        }
    }
}
