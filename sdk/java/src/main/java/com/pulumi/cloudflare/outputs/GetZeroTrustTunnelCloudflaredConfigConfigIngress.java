// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequest;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustTunnelCloudflaredConfigConfigIngress {
    /**
     * @return Public hostname for this service.
     * 
     */
    private String hostname;
    /**
     * @return Configuration parameters for the public hostname specific connection settings between cloudflared and origin server.
     * 
     */
    private GetZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequest originRequest;
    /**
     * @return Requests with this path route to this public hostname.
     * 
     */
    private String path;
    /**
     * @return Protocol and address of destination server. Supported protocols: http://, https://, unix://, tcp://, ssh://, rdp://, unix+tls://, smb://. Alternatively can return a HTTP status code http*status:[code] e.g. &#39;http*status:404&#39;.
     * 
     */
    private String service;

    private GetZeroTrustTunnelCloudflaredConfigConfigIngress() {}
    /**
     * @return Public hostname for this service.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Configuration parameters for the public hostname specific connection settings between cloudflared and origin server.
     * 
     */
    public GetZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequest originRequest() {
        return this.originRequest;
    }
    /**
     * @return Requests with this path route to this public hostname.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Protocol and address of destination server. Supported protocols: http://, https://, unix://, tcp://, ssh://, rdp://, unix+tls://, smb://. Alternatively can return a HTTP status code http*status:[code] e.g. &#39;http*status:404&#39;.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustTunnelCloudflaredConfigConfigIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private GetZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequest originRequest;
        private String path;
        private String service;
        public Builder() {}
        public Builder(GetZeroTrustTunnelCloudflaredConfigConfigIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.originRequest = defaults.originRequest;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredConfigConfigIngress", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder originRequest(GetZeroTrustTunnelCloudflaredConfigConfigIngressOriginRequest originRequest) {
            if (originRequest == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredConfigConfigIngress", "originRequest");
            }
            this.originRequest = originRequest;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredConfigConfigIngress", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredConfigConfigIngress", "service");
            }
            this.service = service;
            return this;
        }
        public GetZeroTrustTunnelCloudflaredConfigConfigIngress build() {
            final var _resultValue = new GetZeroTrustTunnelCloudflaredConfigConfigIngress();
            _resultValue.hostname = hostname;
            _resultValue.originRequest = originRequest;
            _resultValue.path = path;
            _resultValue.service = service;
            return _resultValue;
        }
    }
}
