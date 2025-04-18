// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewaySettingsSettingsCustomCertificate {
    /**
     * @return Certificate status (internal).
     * 
     */
    private String bindingStatus;
    /**
     * @return Enable use of custom certificate authority for signing Gateway traffic.
     * 
     */
    private Boolean enabled;
    /**
     * @return UUID of certificate (ID from MTLS certificate store).
     * 
     */
    private String id;
    private String updatedAt;

    private GetZeroTrustGatewaySettingsSettingsCustomCertificate() {}
    /**
     * @return Certificate status (internal).
     * 
     */
    public String bindingStatus() {
        return this.bindingStatus;
    }
    /**
     * @return Enable use of custom certificate authority for signing Gateway traffic.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return UUID of certificate (ID from MTLS certificate store).
     * 
     */
    public String id() {
        return this.id;
    }
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewaySettingsSettingsCustomCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bindingStatus;
        private Boolean enabled;
        private String id;
        private String updatedAt;
        public Builder() {}
        public Builder(GetZeroTrustGatewaySettingsSettingsCustomCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingStatus = defaults.bindingStatus;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder bindingStatus(String bindingStatus) {
            if (bindingStatus == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsCustomCertificate", "bindingStatus");
            }
            this.bindingStatus = bindingStatus;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsCustomCertificate", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsCustomCertificate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsCustomCertificate", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetZeroTrustGatewaySettingsSettingsCustomCertificate build() {
            final var _resultValue = new GetZeroTrustGatewaySettingsSettingsCustomCertificate();
            _resultValue.bindingStatus = bindingStatus;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
