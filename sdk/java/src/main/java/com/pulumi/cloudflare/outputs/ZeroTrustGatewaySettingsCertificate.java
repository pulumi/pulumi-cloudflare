// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZeroTrustGatewaySettingsCertificate {
    /**
     * @return ID of certificate for TLS interception.
     * 
     */
    private String id;

    private ZeroTrustGatewaySettingsCertificate() {}
    /**
     * @return ID of certificate for TLS interception.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustGatewaySettingsCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(ZeroTrustGatewaySettingsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsCertificate", "id");
            }
            this.id = id;
            return this;
        }
        public ZeroTrustGatewaySettingsCertificate build() {
            final var _resultValue = new ZeroTrustGatewaySettingsCertificate();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}