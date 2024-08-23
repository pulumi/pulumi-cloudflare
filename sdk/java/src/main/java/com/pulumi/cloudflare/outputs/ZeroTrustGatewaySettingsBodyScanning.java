// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZeroTrustGatewaySettingsBodyScanning {
    /**
     * @return Body scanning inspection mode. Available values: `deep`, `shallow`.
     * 
     */
    private String inspectionMode;

    private ZeroTrustGatewaySettingsBodyScanning() {}
    /**
     * @return Body scanning inspection mode. Available values: `deep`, `shallow`.
     * 
     */
    public String inspectionMode() {
        return this.inspectionMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustGatewaySettingsBodyScanning defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String inspectionMode;
        public Builder() {}
        public Builder(ZeroTrustGatewaySettingsBodyScanning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inspectionMode = defaults.inspectionMode;
        }

        @CustomType.Setter
        public Builder inspectionMode(String inspectionMode) {
            if (inspectionMode == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsBodyScanning", "inspectionMode");
            }
            this.inspectionMode = inspectionMode;
            return this;
        }
        public ZeroTrustGatewaySettingsBodyScanning build() {
            final var _resultValue = new ZeroTrustGatewaySettingsBodyScanning();
            _resultValue.inspectionMode = inspectionMode;
            return _resultValue;
        }
    }
}