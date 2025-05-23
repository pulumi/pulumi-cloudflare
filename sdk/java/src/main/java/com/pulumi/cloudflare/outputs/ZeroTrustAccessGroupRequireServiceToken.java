// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZeroTrustAccessGroupRequireServiceToken {
    /**
     * @return The ID of a Service Token.
     * 
     */
    private String tokenId;

    private ZeroTrustAccessGroupRequireServiceToken() {}
    /**
     * @return The ID of a Service Token.
     * 
     */
    public String tokenId() {
        return this.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessGroupRequireServiceToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tokenId;
        public Builder() {}
        public Builder(ZeroTrustAccessGroupRequireServiceToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tokenId = defaults.tokenId;
        }

        @CustomType.Setter
        public Builder tokenId(String tokenId) {
            if (tokenId == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessGroupRequireServiceToken", "tokenId");
            }
            this.tokenId = tokenId;
            return this;
        }
        public ZeroTrustAccessGroupRequireServiceToken build() {
            final var _resultValue = new ZeroTrustAccessGroupRequireServiceToken();
            _resultValue.tokenId = tokenId;
            return _resultValue;
        }
    }
}
