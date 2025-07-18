// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationsResultConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustDevicePostureIntegrationsResult {
    /**
     * @return The configuration object containing third-party integration information.
     * 
     */
    private GetZeroTrustDevicePostureIntegrationsResultConfig config;
    /**
     * @return API UUID.
     * 
     */
    private String id;
    /**
     * @return The interval between each posture check with the third-party API. Use `m` for minutes (e.g. `5m`) and `h` for hours (e.g. `12h`).
     * 
     */
    private String interval;
    /**
     * @return The name of the device posture integration.
     * 
     */
    private String name;
    /**
     * @return The type of device posture integration.
     * Available values: &#34;workspace*one&#34;, &#34;crowdstrike*s2s&#34;, &#34;uptycs&#34;, &#34;intune&#34;, &#34;kolide&#34;, &#34;tanium*s2s&#34;, &#34;sentinelone*s2s&#34;, &#34;custom_s2s&#34;.
     * 
     */
    private String type;

    private GetZeroTrustDevicePostureIntegrationsResult() {}
    /**
     * @return The configuration object containing third-party integration information.
     * 
     */
    public GetZeroTrustDevicePostureIntegrationsResultConfig config() {
        return this.config;
    }
    /**
     * @return API UUID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The interval between each posture check with the third-party API. Use `m` for minutes (e.g. `5m`) and `h` for hours (e.g. `12h`).
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return The name of the device posture integration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of device posture integration.
     * Available values: &#34;workspace*one&#34;, &#34;crowdstrike*s2s&#34;, &#34;uptycs&#34;, &#34;intune&#34;, &#34;kolide&#34;, &#34;tanium*s2s&#34;, &#34;sentinelone*s2s&#34;, &#34;custom_s2s&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustDevicePostureIntegrationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetZeroTrustDevicePostureIntegrationsResultConfig config;
        private String id;
        private String interval;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetZeroTrustDevicePostureIntegrationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder config(GetZeroTrustDevicePostureIntegrationsResultConfig config) {
            if (config == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDevicePostureIntegrationsResult", "config");
            }
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDevicePostureIntegrationsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interval(String interval) {
            if (interval == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDevicePostureIntegrationsResult", "interval");
            }
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDevicePostureIntegrationsResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDevicePostureIntegrationsResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetZeroTrustDevicePostureIntegrationsResult build() {
            final var _resultValue = new GetZeroTrustDevicePostureIntegrationsResult();
            _resultValue.config = config;
            _resultValue.id = id;
            _resultValue.interval = interval;
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
