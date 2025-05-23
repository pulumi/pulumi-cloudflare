// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZeroTrustAccessGroupExcludeGeo {
    /**
     * @return The country code that should be matched.
     * 
     */
    private String countryCode;

    private ZeroTrustAccessGroupExcludeGeo() {}
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

    public static Builder builder(ZeroTrustAccessGroupExcludeGeo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String countryCode;
        public Builder() {}
        public Builder(ZeroTrustAccessGroupExcludeGeo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
        }

        @CustomType.Setter
        public Builder countryCode(String countryCode) {
            if (countryCode == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessGroupExcludeGeo", "countryCode");
            }
            this.countryCode = countryCode;
            return this;
        }
        public ZeroTrustAccessGroupExcludeGeo build() {
            final var _resultValue = new ZeroTrustAccessGroupExcludeGeo();
            _resultValue.countryCode = countryCode;
            return _resultValue;
        }
    }
}
