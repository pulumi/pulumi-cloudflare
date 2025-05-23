// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetApiShieldDiscoveryOperationsResultFeaturesTrafficStats;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetApiShieldDiscoveryOperationsResultFeatures {
    private GetApiShieldDiscoveryOperationsResultFeaturesTrafficStats trafficStats;

    private GetApiShieldDiscoveryOperationsResultFeatures() {}
    public GetApiShieldDiscoveryOperationsResultFeaturesTrafficStats trafficStats() {
        return this.trafficStats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiShieldDiscoveryOperationsResultFeatures defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApiShieldDiscoveryOperationsResultFeaturesTrafficStats trafficStats;
        public Builder() {}
        public Builder(GetApiShieldDiscoveryOperationsResultFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trafficStats = defaults.trafficStats;
        }

        @CustomType.Setter
        public Builder trafficStats(GetApiShieldDiscoveryOperationsResultFeaturesTrafficStats trafficStats) {
            if (trafficStats == null) {
              throw new MissingRequiredPropertyException("GetApiShieldDiscoveryOperationsResultFeatures", "trafficStats");
            }
            this.trafficStats = trafficStats;
            return this;
        }
        public GetApiShieldDiscoveryOperationsResultFeatures build() {
            final var _resultValue = new GetApiShieldDiscoveryOperationsResultFeatures();
            _resultValue.trafficStats = trafficStats;
            return _resultValue;
        }
    }
}
