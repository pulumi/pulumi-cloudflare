// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationPolicyIncludeGroup {
    /**
     * @return The ID of a previously created Access group.
     * 
     */
    private String id;

    private GetZeroTrustAccessApplicationPolicyIncludeGroup() {}
    /**
     * @return The ID of a previously created Access group.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationPolicyIncludeGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationPolicyIncludeGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationPolicyIncludeGroup", "id");
            }
            this.id = id;
            return this;
        }
        public GetZeroTrustAccessApplicationPolicyIncludeGroup build() {
            final var _resultValue = new GetZeroTrustAccessApplicationPolicyIncludeGroup();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
