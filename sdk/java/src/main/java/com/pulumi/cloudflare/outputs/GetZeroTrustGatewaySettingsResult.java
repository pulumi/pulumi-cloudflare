// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustGatewaySettingsSettings;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewaySettingsResult {
    private String accountId;
    private String createdAt;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Account settings
     * 
     */
    private GetZeroTrustGatewaySettingsSettings settings;
    private String updatedAt;

    private GetZeroTrustGatewaySettingsResult() {}
    public String accountId() {
        return this.accountId;
    }
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Account settings
     * 
     */
    public GetZeroTrustGatewaySettingsSettings settings() {
        return this.settings;
    }
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewaySettingsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String createdAt;
        private String id;
        private GetZeroTrustGatewaySettingsSettings settings;
        private String updatedAt;
        public Builder() {}
        public Builder(GetZeroTrustGatewaySettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.settings = defaults.settings;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder settings(GetZeroTrustGatewaySettingsSettings settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsResult", "settings");
            }
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsResult", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetZeroTrustGatewaySettingsResult build() {
            final var _resultValue = new GetZeroTrustGatewaySettingsResult();
            _resultValue.accountId = accountId;
            _resultValue.createdAt = createdAt;
            _resultValue.id = id;
            _resultValue.settings = settings;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
