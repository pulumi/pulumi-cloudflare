// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTunnelResult {
    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    private String accountId;
    /**
     * @return ID of the tunnel.
     * 
     */
    private String id;
    /**
     * @return Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    private String name;
    /**
     * @return Whether the tunnel can be configured remotely from the Zero Trust dashboard.
     * 
     */
    private Boolean remoteConfig;
    /**
     * @return The status of the tunnel. Available values: `inactive`, `degraded`, `healthy`, `down`.
     * 
     */
    private String status;
    /**
     * @return The type of the tunnel. Available values: `cfd_tunnel`, `warp_connector`.
     * 
     */
    private String tunnelType;

    private GetTunnelResult() {}
    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return ID of the tunnel.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Whether the tunnel can be configured remotely from the Zero Trust dashboard.
     * 
     */
    public Boolean remoteConfig() {
        return this.remoteConfig;
    }
    /**
     * @return The status of the tunnel. Available values: `inactive`, `degraded`, `healthy`, `down`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The type of the tunnel. Available values: `cfd_tunnel`, `warp_connector`.
     * 
     */
    public String tunnelType() {
        return this.tunnelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTunnelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private String name;
        private Boolean remoteConfig;
        private String status;
        private String tunnelType;
        public Builder() {}
        public Builder(GetTunnelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.remoteConfig = defaults.remoteConfig;
    	      this.status = defaults.status;
    	      this.tunnelType = defaults.tunnelType;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder remoteConfig(Boolean remoteConfig) {
            this.remoteConfig = Objects.requireNonNull(remoteConfig);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tunnelType(String tunnelType) {
            this.tunnelType = Objects.requireNonNull(tunnelType);
            return this;
        }
        public GetTunnelResult build() {
            final var o = new GetTunnelResult();
            o.accountId = accountId;
            o.id = id;
            o.name = name;
            o.remoteConfig = remoteConfig;
            o.status = status;
            o.tunnelType = tunnelType;
            return o;
        }
    }
}