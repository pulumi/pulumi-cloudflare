// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetCustomSslKeylessServerTunnel;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomSslKeylessServer {
    /**
     * @return When the Keyless SSL was created.
     * 
     */
    private String createdOn;
    /**
     * @return Whether or not the Keyless SSL is on or off.
     * 
     */
    private Boolean enabled;
    /**
     * @return The keyless SSL name.
     * 
     */
    private String host;
    /**
     * @return Keyless certificate identifier tag.
     * 
     */
    private String id;
    /**
     * @return When the Keyless SSL was last modified.
     * 
     */
    private String modifiedOn;
    /**
     * @return The keyless SSL name.
     * 
     */
    private String name;
    /**
     * @return Available permissions for the Keyless SSL for the current user requesting the item.
     * 
     */
    private List<String> permissions;
    /**
     * @return The keyless SSL port used to communicate between Cloudflare and the client&#39;s Keyless SSL server.
     * 
     */
    private Double port;
    /**
     * @return Status of the Keyless SSL.
     * Available values: &#34;active&#34;, &#34;deleted&#34;.
     * 
     */
    private String status;
    /**
     * @return Configuration for using Keyless SSL through a Cloudflare Tunnel
     * 
     */
    private GetCustomSslKeylessServerTunnel tunnel;

    private GetCustomSslKeylessServer() {}
    /**
     * @return When the Keyless SSL was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return Whether or not the Keyless SSL is on or off.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The keyless SSL name.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Keyless certificate identifier tag.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return When the Keyless SSL was last modified.
     * 
     */
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return The keyless SSL name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Available permissions for the Keyless SSL for the current user requesting the item.
     * 
     */
    public List<String> permissions() {
        return this.permissions;
    }
    /**
     * @return The keyless SSL port used to communicate between Cloudflare and the client&#39;s Keyless SSL server.
     * 
     */
    public Double port() {
        return this.port;
    }
    /**
     * @return Status of the Keyless SSL.
     * Available values: &#34;active&#34;, &#34;deleted&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Configuration for using Keyless SSL through a Cloudflare Tunnel
     * 
     */
    public GetCustomSslKeylessServerTunnel tunnel() {
        return this.tunnel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomSslKeylessServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdOn;
        private Boolean enabled;
        private String host;
        private String id;
        private String modifiedOn;
        private String name;
        private List<String> permissions;
        private Double port;
        private String status;
        private GetCustomSslKeylessServerTunnel tunnel;
        public Builder() {}
        public Builder(GetCustomSslKeylessServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.enabled = defaults.enabled;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.port = defaults.port;
    	      this.status = defaults.status;
    	      this.tunnel = defaults.tunnel;
        }

        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(List<String> permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder port(Double port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tunnel(GetCustomSslKeylessServerTunnel tunnel) {
            if (tunnel == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServer", "tunnel");
            }
            this.tunnel = tunnel;
            return this;
        }
        public GetCustomSslKeylessServer build() {
            final var _resultValue = new GetCustomSslKeylessServer();
            _resultValue.createdOn = createdOn;
            _resultValue.enabled = enabled;
            _resultValue.host = host;
            _resultValue.id = id;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.name = name;
            _resultValue.permissions = permissions;
            _resultValue.port = port;
            _resultValue.status = status;
            _resultValue.tunnel = tunnel;
            return _resultValue;
        }
    }
}
