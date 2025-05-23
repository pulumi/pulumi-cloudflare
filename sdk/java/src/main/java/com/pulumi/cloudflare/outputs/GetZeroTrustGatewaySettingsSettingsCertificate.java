// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewaySettingsSettingsCertificate {
    /**
     * @return UUID of certificate to be used for interception. Certificate must be available (previously called &#39;active&#39;) on the edge. A nil UUID will indicate the Cloudflare Root CA should be used.
     * 
     */
    private String id;

    private GetZeroTrustGatewaySettingsSettingsCertificate() {}
    /**
     * @return UUID of certificate to be used for interception. Certificate must be available (previously called &#39;active&#39;) on the edge. A nil UUID will indicate the Cloudflare Root CA should be used.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewaySettingsSettingsCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetZeroTrustGatewaySettingsSettingsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsCertificate", "id");
            }
            this.id = id;
            return this;
        }
        public GetZeroTrustGatewaySettingsSettingsCertificate build() {
            final var _resultValue = new GetZeroTrustGatewaySettingsSettingsCertificate();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
