// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetLoadBalancerPoolOriginHeader;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerPoolOrigin {
    /**
     * @return The IP address (IPv4 or IPv6) of the origin, or its publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare. To set an internal/reserved address, virtual*network*id must also be set.
     * 
     */
    private String address;
    /**
     * @return This field shows up only if the origin is disabled. This field is set with the time the origin was disabled.
     * 
     */
    private String disabledAt;
    /**
     * @return Whether to enable (the default) this origin within the pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
     * 
     */
    private Boolean enabled;
    /**
     * @return The request header is used to pass additional information with an HTTP request. Currently supported header is &#39;Host&#39;.
     * 
     */
    private GetLoadBalancerPoolOriginHeader header;
    /**
     * @return A human-identifiable name for the origin.
     * 
     */
    private String name;
    /**
     * @return The port for upstream connections. A value of 0 means the default port for the protocol will be used.
     * 
     */
    private Integer port;
    /**
     * @return The virtual network subnet ID the origin belongs in. Virtual network must also belong to the account.
     * 
     */
    private String virtualNetworkId;
    /**
     * @return The weight of this origin relative to other origins in the pool. Based on the configured weight the total traffic is distributed among origins within the pool.
     * 
     */
    private Double weight;

    private GetLoadBalancerPoolOrigin() {}
    /**
     * @return The IP address (IPv4 or IPv6) of the origin, or its publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare. To set an internal/reserved address, virtual*network*id must also be set.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return This field shows up only if the origin is disabled. This field is set with the time the origin was disabled.
     * 
     */
    public String disabledAt() {
        return this.disabledAt;
    }
    /**
     * @return Whether to enable (the default) this origin within the pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The request header is used to pass additional information with an HTTP request. Currently supported header is &#39;Host&#39;.
     * 
     */
    public GetLoadBalancerPoolOriginHeader header() {
        return this.header;
    }
    /**
     * @return A human-identifiable name for the origin.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The port for upstream connections. A value of 0 means the default port for the protocol will be used.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The virtual network subnet ID the origin belongs in. Virtual network must also belong to the account.
     * 
     */
    public String virtualNetworkId() {
        return this.virtualNetworkId;
    }
    /**
     * @return The weight of this origin relative to other origins in the pool. Based on the configured weight the total traffic is distributed among origins within the pool.
     * 
     */
    public Double weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerPoolOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String disabledAt;
        private Boolean enabled;
        private GetLoadBalancerPoolOriginHeader header;
        private String name;
        private Integer port;
        private String virtualNetworkId;
        private Double weight;
        public Builder() {}
        public Builder(GetLoadBalancerPoolOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.disabledAt = defaults.disabledAt;
    	      this.enabled = defaults.enabled;
    	      this.header = defaults.header;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder disabledAt(String disabledAt) {
            if (disabledAt == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "disabledAt");
            }
            this.disabledAt = disabledAt;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder header(GetLoadBalancerPoolOriginHeader header) {
            if (header == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "header");
            }
            this.header = header;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkId(String virtualNetworkId) {
            if (virtualNetworkId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "virtualNetworkId");
            }
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        @CustomType.Setter
        public Builder weight(Double weight) {
            if (weight == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOrigin", "weight");
            }
            this.weight = weight;
            return this;
        }
        public GetLoadBalancerPoolOrigin build() {
            final var _resultValue = new GetLoadBalancerPoolOrigin();
            _resultValue.address = address;
            _resultValue.disabledAt = disabledAt;
            _resultValue.enabled = enabled;
            _resultValue.header = header;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.virtualNetworkId = virtualNetworkId;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
