// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationPolicyRequireCommonName {
    /**
     * @return The common name to match.
     * 
     */
    private String commonName;

    private GetZeroTrustAccessApplicationPolicyRequireCommonName() {}
    /**
     * @return The common name to match.
     * 
     */
    public String commonName() {
        return this.commonName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationPolicyRequireCommonName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String commonName;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationPolicyRequireCommonName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
        }

        @CustomType.Setter
        public Builder commonName(String commonName) {
            if (commonName == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationPolicyRequireCommonName", "commonName");
            }
            this.commonName = commonName;
            return this;
        }
        public GetZeroTrustAccessApplicationPolicyRequireCommonName build() {
            final var _resultValue = new GetZeroTrustAccessApplicationPolicyRequireCommonName();
            _resultValue.commonName = commonName;
            return _resultValue;
        }
    }
}
