// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewaySettingsSettingsSandbox {
    /**
     * @return Enable sandbox.
     * 
     */
    private Boolean enabled;
    /**
     * @return Action to take when the file cannot be scanned.
     * Available values: &#34;allow&#34;, &#34;block&#34;.
     * 
     */
    private String fallbackAction;

    private GetZeroTrustGatewaySettingsSettingsSandbox() {}
    /**
     * @return Enable sandbox.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Action to take when the file cannot be scanned.
     * Available values: &#34;allow&#34;, &#34;block&#34;.
     * 
     */
    public String fallbackAction() {
        return this.fallbackAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewaySettingsSettingsSandbox defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String fallbackAction;
        public Builder() {}
        public Builder(GetZeroTrustGatewaySettingsSettingsSandbox defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.fallbackAction = defaults.fallbackAction;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsSandbox", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder fallbackAction(String fallbackAction) {
            if (fallbackAction == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsSandbox", "fallbackAction");
            }
            this.fallbackAction = fallbackAction;
            return this;
        }
        public GetZeroTrustGatewaySettingsSettingsSandbox build() {
            final var _resultValue = new GetZeroTrustGatewaySettingsSettingsSandbox();
            _resultValue.enabled = enabled;
            _resultValue.fallbackAction = fallbackAction;
            return _resultValue;
        }
    }
}
