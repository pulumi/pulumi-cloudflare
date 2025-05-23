// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpRangesResult {
    /**
     * @return A digest of the IP data. Useful for determining if the data has changed.
     * 
     */
    private String etag;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of Cloudflare IPv4 CIDR addresses.
     * 
     */
    private List<String> ipv4Cidrs;
    /**
     * @return List of Cloudflare IPv6 CIDR addresses.
     * 
     */
    private List<String> ipv6Cidrs;
    /**
     * @return List IPv4 and IPv6 CIDRs, only populated if `?networks=jdcloud` is used.
     * 
     */
    private List<String> jdcloudCidrs;
    /**
     * @return Specified as `jdcloud` to list IPs used by JD Cloud data centers.
     * 
     */
    private @Nullable String networks;

    private GetIpRangesResult() {}
    /**
     * @return A digest of the IP data. Useful for determining if the data has changed.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of Cloudflare IPv4 CIDR addresses.
     * 
     */
    public List<String> ipv4Cidrs() {
        return this.ipv4Cidrs;
    }
    /**
     * @return List of Cloudflare IPv6 CIDR addresses.
     * 
     */
    public List<String> ipv6Cidrs() {
        return this.ipv6Cidrs;
    }
    /**
     * @return List IPv4 and IPv6 CIDRs, only populated if `?networks=jdcloud` is used.
     * 
     */
    public List<String> jdcloudCidrs() {
        return this.jdcloudCidrs;
    }
    /**
     * @return Specified as `jdcloud` to list IPs used by JD Cloud data centers.
     * 
     */
    public Optional<String> networks() {
        return Optional.ofNullable(this.networks);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpRangesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String etag;
        private String id;
        private List<String> ipv4Cidrs;
        private List<String> ipv6Cidrs;
        private List<String> jdcloudCidrs;
        private @Nullable String networks;
        public Builder() {}
        public Builder(GetIpRangesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipv4Cidrs = defaults.ipv4Cidrs;
    	      this.ipv6Cidrs = defaults.ipv6Cidrs;
    	      this.jdcloudCidrs = defaults.jdcloudCidrs;
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder etag(String etag) {
            if (etag == null) {
              throw new MissingRequiredPropertyException("GetIpRangesResult", "etag");
            }
            this.etag = etag;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpRangesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Cidrs(List<String> ipv4Cidrs) {
            if (ipv4Cidrs == null) {
              throw new MissingRequiredPropertyException("GetIpRangesResult", "ipv4Cidrs");
            }
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }
        public Builder ipv4Cidrs(String... ipv4Cidrs) {
            return ipv4Cidrs(List.of(ipv4Cidrs));
        }
        @CustomType.Setter
        public Builder ipv6Cidrs(List<String> ipv6Cidrs) {
            if (ipv6Cidrs == null) {
              throw new MissingRequiredPropertyException("GetIpRangesResult", "ipv6Cidrs");
            }
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }
        public Builder ipv6Cidrs(String... ipv6Cidrs) {
            return ipv6Cidrs(List.of(ipv6Cidrs));
        }
        @CustomType.Setter
        public Builder jdcloudCidrs(List<String> jdcloudCidrs) {
            if (jdcloudCidrs == null) {
              throw new MissingRequiredPropertyException("GetIpRangesResult", "jdcloudCidrs");
            }
            this.jdcloudCidrs = jdcloudCidrs;
            return this;
        }
        public Builder jdcloudCidrs(String... jdcloudCidrs) {
            return jdcloudCidrs(List.of(jdcloudCidrs));
        }
        @CustomType.Setter
        public Builder networks(@Nullable String networks) {

            this.networks = networks;
            return this;
        }
        public GetIpRangesResult build() {
            final var _resultValue = new GetIpRangesResult();
            _resultValue.etag = etag;
            _resultValue.id = id;
            _resultValue.ipv4Cidrs = ipv4Cidrs;
            _resultValue.ipv6Cidrs = ipv6Cidrs;
            _resultValue.jdcloudCidrs = jdcloudCidrs;
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}
