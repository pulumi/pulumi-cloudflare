// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessGroupExcludeGeo {
    /**
     * @return The country code that should be matched.
     * 
     */
    private String countryCode;

    private GetZeroTrustAccessGroupExcludeGeo() {}
    /**
     * @return The country code that should be matched.
     * 
     */
    public String countryCode() {
        return this.countryCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessGroupExcludeGeo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String countryCode;
        public Builder() {}
        public Builder(GetZeroTrustAccessGroupExcludeGeo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
        }

        @CustomType.Setter
        public Builder countryCode(String countryCode) {
            if (countryCode == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupExcludeGeo", "countryCode");
            }
            this.countryCode = countryCode;
            return this;
        }
        public GetZeroTrustAccessGroupExcludeGeo build() {
            final var _resultValue = new GetZeroTrustAccessGroupExcludeGeo();
            _resultValue.countryCode = countryCode;
            return _resultValue;
        }
    }
}
