// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewaySettingsSettingsBrowserIsolation {
    /**
     * @return Enable non-identity onramp support for Browser Isolation.
     * 
     */
    private Boolean nonIdentityEnabled;
    /**
     * @return Enable Clientless Browser Isolation.
     * 
     */
    private Boolean urlBrowserIsolationEnabled;

    private GetZeroTrustGatewaySettingsSettingsBrowserIsolation() {}
    /**
     * @return Enable non-identity onramp support for Browser Isolation.
     * 
     */
    public Boolean nonIdentityEnabled() {
        return this.nonIdentityEnabled;
    }
    /**
     * @return Enable Clientless Browser Isolation.
     * 
     */
    public Boolean urlBrowserIsolationEnabled() {
        return this.urlBrowserIsolationEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewaySettingsSettingsBrowserIsolation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean nonIdentityEnabled;
        private Boolean urlBrowserIsolationEnabled;
        public Builder() {}
        public Builder(GetZeroTrustGatewaySettingsSettingsBrowserIsolation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonIdentityEnabled = defaults.nonIdentityEnabled;
    	      this.urlBrowserIsolationEnabled = defaults.urlBrowserIsolationEnabled;
        }

        @CustomType.Setter
        public Builder nonIdentityEnabled(Boolean nonIdentityEnabled) {
            if (nonIdentityEnabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsBrowserIsolation", "nonIdentityEnabled");
            }
            this.nonIdentityEnabled = nonIdentityEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder urlBrowserIsolationEnabled(Boolean urlBrowserIsolationEnabled) {
            if (urlBrowserIsolationEnabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewaySettingsSettingsBrowserIsolation", "urlBrowserIsolationEnabled");
            }
            this.urlBrowserIsolationEnabled = urlBrowserIsolationEnabled;
            return this;
        }
        public GetZeroTrustGatewaySettingsSettingsBrowserIsolation build() {
            final var _resultValue = new GetZeroTrustGatewaySettingsSettingsBrowserIsolation();
            _resultValue.nonIdentityEnabled = nonIdentityEnabled;
            _resultValue.urlBrowserIsolationEnabled = urlBrowserIsolationEnabled;
            return _resultValue;
        }
    }
}
