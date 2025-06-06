// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustDnsLocationEndpointsDotNetwork;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustDnsLocationEndpointsDot {
    /**
     * @return True if the endpoint is enabled for this location.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return A list of allowed source IP network ranges for this endpoint. When empty, all source IPs are allowed. A non-empty list is only effective if the endpoint is enabled for this location.
     * 
     */
    private @Nullable List<ZeroTrustDnsLocationEndpointsDotNetwork> networks;

    private ZeroTrustDnsLocationEndpointsDot() {}
    /**
     * @return True if the endpoint is enabled for this location.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return A list of allowed source IP network ranges for this endpoint. When empty, all source IPs are allowed. A non-empty list is only effective if the endpoint is enabled for this location.
     * 
     */
    public List<ZeroTrustDnsLocationEndpointsDotNetwork> networks() {
        return this.networks == null ? List.of() : this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustDnsLocationEndpointsDot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<ZeroTrustDnsLocationEndpointsDotNetwork> networks;
        public Builder() {}
        public Builder(ZeroTrustDnsLocationEndpointsDot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder networks(@Nullable List<ZeroTrustDnsLocationEndpointsDotNetwork> networks) {

            this.networks = networks;
            return this;
        }
        public Builder networks(ZeroTrustDnsLocationEndpointsDotNetwork... networks) {
            return networks(List.of(networks));
        }
        public ZeroTrustDnsLocationEndpointsDot build() {
            final var _resultValue = new ZeroTrustDnsLocationEndpointsDot();
            _resultValue.enabled = enabled;
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}
