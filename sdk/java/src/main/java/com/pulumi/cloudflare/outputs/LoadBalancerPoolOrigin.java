// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.LoadBalancerPoolOriginHeader;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerPoolOrigin {
    /**
     * @return The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname.
     * 
     */
    private String address;
    /**
     * @return Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return HTTP request headers.
     * 
     */
    private @Nullable List<LoadBalancerPoolOriginHeader> headers;
    /**
     * @return A human-identifiable name for the origin.
     * 
     */
    private String name;
    /**
     * @return The virtual network subnet ID the origin belongs in. Virtual network must also belong to the account.
     * 
     */
    private @Nullable String virtualNetworkId;
    /**
     * @return The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. When `origin_steering.policy=&#34;least_outstanding_requests&#34;`, weight is used to scale the origin&#39;s outstanding requests. When `origin_steering.policy=&#34;least_connections&#34;`, weight is used to scale the origin&#39;s open connections. Defaults to `1`.
     * 
     */
    private @Nullable Double weight;

    private LoadBalancerPoolOrigin() {}
    /**
     * @return The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return HTTP request headers.
     * 
     */
    public List<LoadBalancerPoolOriginHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return A human-identifiable name for the origin.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The virtual network subnet ID the origin belongs in. Virtual network must also belong to the account.
     * 
     */
    public Optional<String> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }
    /**
     * @return The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. When `origin_steering.policy=&#34;least_outstanding_requests&#34;`, weight is used to scale the origin&#39;s outstanding requests. When `origin_steering.policy=&#34;least_connections&#34;`, weight is used to scale the origin&#39;s open connections. Defaults to `1`.
     * 
     */
    public Optional<Double> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerPoolOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable Boolean enabled;
        private @Nullable List<LoadBalancerPoolOriginHeader> headers;
        private String name;
        private @Nullable String virtualNetworkId;
        private @Nullable Double weight;
        public Builder() {}
        public Builder(LoadBalancerPoolOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.enabled = defaults.enabled;
    	      this.headers = defaults.headers;
    	      this.name = defaults.name;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("LoadBalancerPoolOrigin", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<LoadBalancerPoolOriginHeader> headers) {

            this.headers = headers;
            return this;
        }
        public Builder headers(LoadBalancerPoolOriginHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("LoadBalancerPoolOrigin", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkId(@Nullable String virtualNetworkId) {

            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Double weight) {

            this.weight = weight;
            return this;
        }
        public LoadBalancerPoolOrigin build() {
            final var _resultValue = new LoadBalancerPoolOrigin();
            _resultValue.address = address;
            _resultValue.enabled = enabled;
            _resultValue.headers = headers;
            _resultValue.name = name;
            _resultValue.virtualNetworkId = virtualNetworkId;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
