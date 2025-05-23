// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationsResultEndpointsDotNetwork;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZeroTrustDnsLocationsResultEndpointsDot {
    /**
     * @return True if the endpoint is enabled for this location.
     * 
     */
    private Boolean enabled;
    /**
     * @return A list of allowed source IP network ranges for this endpoint. When empty, all source IPs are allowed. A non-empty list is only effective if the endpoint is enabled for this location.
     * 
     */
    private List<GetZeroTrustDnsLocationsResultEndpointsDotNetwork> networks;

    private GetZeroTrustDnsLocationsResultEndpointsDot() {}
    /**
     * @return True if the endpoint is enabled for this location.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A list of allowed source IP network ranges for this endpoint. When empty, all source IPs are allowed. A non-empty list is only effective if the endpoint is enabled for this location.
     * 
     */
    public List<GetZeroTrustDnsLocationsResultEndpointsDotNetwork> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustDnsLocationsResultEndpointsDot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private List<GetZeroTrustDnsLocationsResultEndpointsDotNetwork> networks;
        public Builder() {}
        public Builder(GetZeroTrustDnsLocationsResultEndpointsDot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDnsLocationsResultEndpointsDot", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<GetZeroTrustDnsLocationsResultEndpointsDotNetwork> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDnsLocationsResultEndpointsDot", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(GetZeroTrustDnsLocationsResultEndpointsDotNetwork... networks) {
            return networks(List.of(networks));
        }
        public GetZeroTrustDnsLocationsResultEndpointsDot build() {
            final var _resultValue = new GetZeroTrustDnsLocationsResultEndpointsDot();
            _resultValue.enabled = enabled;
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}
