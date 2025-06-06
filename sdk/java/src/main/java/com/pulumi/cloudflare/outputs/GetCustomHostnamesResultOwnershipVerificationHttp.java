// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCustomHostnamesResultOwnershipVerificationHttp {
    /**
     * @return Token to be served.
     * 
     */
    private String httpBody;
    /**
     * @return The HTTP URL that will be checked during custom hostname verification and where the customer should host the token.
     * 
     */
    private String httpUrl;

    private GetCustomHostnamesResultOwnershipVerificationHttp() {}
    /**
     * @return Token to be served.
     * 
     */
    public String httpBody() {
        return this.httpBody;
    }
    /**
     * @return The HTTP URL that will be checked during custom hostname verification and where the customer should host the token.
     * 
     */
    public String httpUrl() {
        return this.httpUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomHostnamesResultOwnershipVerificationHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String httpBody;
        private String httpUrl;
        public Builder() {}
        public Builder(GetCustomHostnamesResultOwnershipVerificationHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpBody = defaults.httpBody;
    	      this.httpUrl = defaults.httpUrl;
        }

        @CustomType.Setter
        public Builder httpBody(String httpBody) {
            if (httpBody == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultOwnershipVerificationHttp", "httpBody");
            }
            this.httpBody = httpBody;
            return this;
        }
        @CustomType.Setter
        public Builder httpUrl(String httpUrl) {
            if (httpUrl == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultOwnershipVerificationHttp", "httpUrl");
            }
            this.httpUrl = httpUrl;
            return this;
        }
        public GetCustomHostnamesResultOwnershipVerificationHttp build() {
            final var _resultValue = new GetCustomHostnamesResultOwnershipVerificationHttp();
            _resultValue.httpBody = httpBody;
            _resultValue.httpUrl = httpUrl;
            return _resultValue;
        }
    }
}
