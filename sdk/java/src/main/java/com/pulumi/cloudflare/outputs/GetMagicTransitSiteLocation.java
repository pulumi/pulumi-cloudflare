// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMagicTransitSiteLocation {
    /**
     * @return Latitude
     * 
     */
    private String lat;
    /**
     * @return Longitude
     * 
     */
    private String lon;

    private GetMagicTransitSiteLocation() {}
    /**
     * @return Latitude
     * 
     */
    public String lat() {
        return this.lat;
    }
    /**
     * @return Longitude
     * 
     */
    public String lon() {
        return this.lon;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMagicTransitSiteLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lat;
        private String lon;
        public Builder() {}
        public Builder(GetMagicTransitSiteLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lat = defaults.lat;
    	      this.lon = defaults.lon;
        }

        @CustomType.Setter
        public Builder lat(String lat) {
            if (lat == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteLocation", "lat");
            }
            this.lat = lat;
            return this;
        }
        @CustomType.Setter
        public Builder lon(String lon) {
            if (lon == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteLocation", "lon");
            }
            this.lon = lon;
            return this;
        }
        public GetMagicTransitSiteLocation build() {
            final var _resultValue = new GetMagicTransitSiteLocation();
            _resultValue.lat = lat;
            _resultValue.lon = lon;
            return _resultValue;
        }
    }
}
