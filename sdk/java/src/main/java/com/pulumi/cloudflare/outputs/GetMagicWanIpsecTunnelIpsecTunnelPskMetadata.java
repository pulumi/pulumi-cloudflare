// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMagicWanIpsecTunnelIpsecTunnelPskMetadata {
    /**
     * @return The date and time the tunnel was last modified.
     * 
     */
    private String lastGeneratedOn;

    private GetMagicWanIpsecTunnelIpsecTunnelPskMetadata() {}
    /**
     * @return The date and time the tunnel was last modified.
     * 
     */
    public String lastGeneratedOn() {
        return this.lastGeneratedOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMagicWanIpsecTunnelIpsecTunnelPskMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lastGeneratedOn;
        public Builder() {}
        public Builder(GetMagicWanIpsecTunnelIpsecTunnelPskMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastGeneratedOn = defaults.lastGeneratedOn;
        }

        @CustomType.Setter
        public Builder lastGeneratedOn(String lastGeneratedOn) {
            if (lastGeneratedOn == null) {
              throw new MissingRequiredPropertyException("GetMagicWanIpsecTunnelIpsecTunnelPskMetadata", "lastGeneratedOn");
            }
            this.lastGeneratedOn = lastGeneratedOn;
            return this;
        }
        public GetMagicWanIpsecTunnelIpsecTunnelPskMetadata build() {
            final var _resultValue = new GetMagicWanIpsecTunnelIpsecTunnelPskMetadata();
            _resultValue.lastGeneratedOn = lastGeneratedOn;
            return _resultValue;
        }
    }
}
