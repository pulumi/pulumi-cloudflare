// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessPoliciesResultIncludeGroup {
    /**
     * @return The ID of a previously created Access group.
     * 
     */
    private String id;

    private GetZeroTrustAccessPoliciesResultIncludeGroup() {}
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

    public static Builder builder(GetZeroTrustAccessPoliciesResultIncludeGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetZeroTrustAccessPoliciesResultIncludeGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultIncludeGroup", "id");
            }
            this.id = id;
            return this;
        }
        public GetZeroTrustAccessPoliciesResultIncludeGroup build() {
            final var _resultValue = new GetZeroTrustAccessPoliciesResultIncludeGroup();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
