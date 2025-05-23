// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationEndpointsDohNetwork;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZeroTrustDnsLocationEndpointsDoh {
    /**
     * @return True if the endpoint is enabled for this location.
     * 
     */
    private Boolean enabled;
    /**
     * @return A list of allowed source IP network ranges for this endpoint. When empty, all source IPs are allowed. A non-empty list is only effective if the endpoint is enabled for this location.
     * 
     */
    private List<GetZeroTrustDnsLocationEndpointsDohNetwork> networks;
    /**
     * @return True if the endpoint requires [user identity](https://developers.cloudflare.com/cloudflare-one/connections/connect-devices/agentless/dns/dns-over-https/#filter-doh-requests-by-user) authentication.
     * 
     */
    private Boolean requireToken;

    private GetZeroTrustDnsLocationEndpointsDoh() {}
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
    public List<GetZeroTrustDnsLocationEndpointsDohNetwork> networks() {
        return this.networks;
    }
    /**
     * @return True if the endpoint requires [user identity](https://developers.cloudflare.com/cloudflare-one/connections/connect-devices/agentless/dns/dns-over-https/#filter-doh-requests-by-user) authentication.
     * 
     */
    public Boolean requireToken() {
        return this.requireToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustDnsLocationEndpointsDoh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private List<GetZeroTrustDnsLocationEndpointsDohNetwork> networks;
        private Boolean requireToken;
        public Builder() {}
        public Builder(GetZeroTrustDnsLocationEndpointsDoh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.networks = defaults.networks;
    	      this.requireToken = defaults.requireToken;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDnsLocationEndpointsDoh", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<GetZeroTrustDnsLocationEndpointsDohNetwork> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDnsLocationEndpointsDoh", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(GetZeroTrustDnsLocationEndpointsDohNetwork... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder requireToken(Boolean requireToken) {
            if (requireToken == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDnsLocationEndpointsDoh", "requireToken");
            }
            this.requireToken = requireToken;
            return this;
        }
        public GetZeroTrustDnsLocationEndpointsDoh build() {
            final var _resultValue = new GetZeroTrustDnsLocationEndpointsDoh();
            _resultValue.enabled = enabled;
            _resultValue.networks = networks;
            _resultValue.requireToken = requireToken;
            return _resultValue;
        }
    }
}
