// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCustomSslKeylessServerTunnel {
    /**
     * @return Private IP of the Key Server Host
     * 
     */
    private String privateIp;
    /**
     * @return Cloudflare Tunnel Virtual Network ID
     * 
     */
    private String vnetId;

    private GetCustomSslKeylessServerTunnel() {}
    /**
     * @return Private IP of the Key Server Host
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return Cloudflare Tunnel Virtual Network ID
     * 
     */
    public String vnetId() {
        return this.vnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomSslKeylessServerTunnel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateIp;
        private String vnetId;
        public Builder() {}
        public Builder(GetCustomSslKeylessServerTunnel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIp = defaults.privateIp;
    	      this.vnetId = defaults.vnetId;
        }

        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            if (privateIp == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServerTunnel", "privateIp");
            }
            this.privateIp = privateIp;
            return this;
        }
        @CustomType.Setter
        public Builder vnetId(String vnetId) {
            if (vnetId == null) {
              throw new MissingRequiredPropertyException("GetCustomSslKeylessServerTunnel", "vnetId");
            }
            this.vnetId = vnetId;
            return this;
        }
        public GetCustomSslKeylessServerTunnel build() {
            final var _resultValue = new GetCustomSslKeylessServerTunnel();
            _resultValue.privateIp = privateIp;
            _resultValue.vnetId = vnetId;
            return _resultValue;
        }
    }
}
