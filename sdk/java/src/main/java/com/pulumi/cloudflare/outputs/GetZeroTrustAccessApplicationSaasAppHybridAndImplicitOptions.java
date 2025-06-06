// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions {
    /**
     * @return If an Access Token should be returned from the OIDC Authorization endpoint
     * 
     */
    private Boolean returnAccessTokenFromAuthorizationEndpoint;
    /**
     * @return If an ID Token should be returned from the OIDC Authorization endpoint
     * 
     */
    private Boolean returnIdTokenFromAuthorizationEndpoint;

    private GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions() {}
    /**
     * @return If an Access Token should be returned from the OIDC Authorization endpoint
     * 
     */
    public Boolean returnAccessTokenFromAuthorizationEndpoint() {
        return this.returnAccessTokenFromAuthorizationEndpoint;
    }
    /**
     * @return If an ID Token should be returned from the OIDC Authorization endpoint
     * 
     */
    public Boolean returnIdTokenFromAuthorizationEndpoint() {
        return this.returnIdTokenFromAuthorizationEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean returnAccessTokenFromAuthorizationEndpoint;
        private Boolean returnIdTokenFromAuthorizationEndpoint;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.returnAccessTokenFromAuthorizationEndpoint = defaults.returnAccessTokenFromAuthorizationEndpoint;
    	      this.returnIdTokenFromAuthorizationEndpoint = defaults.returnIdTokenFromAuthorizationEndpoint;
        }

        @CustomType.Setter
        public Builder returnAccessTokenFromAuthorizationEndpoint(Boolean returnAccessTokenFromAuthorizationEndpoint) {
            if (returnAccessTokenFromAuthorizationEndpoint == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions", "returnAccessTokenFromAuthorizationEndpoint");
            }
            this.returnAccessTokenFromAuthorizationEndpoint = returnAccessTokenFromAuthorizationEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder returnIdTokenFromAuthorizationEndpoint(Boolean returnIdTokenFromAuthorizationEndpoint) {
            if (returnIdTokenFromAuthorizationEndpoint == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions", "returnIdTokenFromAuthorizationEndpoint");
            }
            this.returnIdTokenFromAuthorizationEndpoint = returnIdTokenFromAuthorizationEndpoint;
            return this;
        }
        public GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions build() {
            final var _resultValue = new GetZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions();
            _resultValue.returnAccessTokenFromAuthorizationEndpoint = returnAccessTokenFromAuthorizationEndpoint;
            _resultValue.returnIdTokenFromAuthorizationEndpoint = returnIdTokenFromAuthorizationEndpoint;
            return _resultValue;
        }
    }
}
