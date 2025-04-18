// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MagicTransitSiteWanStaticAddressing {
    /**
     * @return A valid CIDR notation representing an IP range.
     * 
     */
    private String address;
    /**
     * @return A valid IPv4 address.
     * 
     */
    private String gatewayAddress;
    /**
     * @return A valid CIDR notation representing an IP range.
     * 
     */
    private @Nullable String secondaryAddress;

    private MagicTransitSiteWanStaticAddressing() {}
    /**
     * @return A valid CIDR notation representing an IP range.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return A valid IPv4 address.
     * 
     */
    public String gatewayAddress() {
        return this.gatewayAddress;
    }
    /**
     * @return A valid CIDR notation representing an IP range.
     * 
     */
    public Optional<String> secondaryAddress() {
        return Optional.ofNullable(this.secondaryAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagicTransitSiteWanStaticAddressing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String gatewayAddress;
        private @Nullable String secondaryAddress;
        public Builder() {}
        public Builder(MagicTransitSiteWanStaticAddressing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.gatewayAddress = defaults.gatewayAddress;
    	      this.secondaryAddress = defaults.secondaryAddress;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("MagicTransitSiteWanStaticAddressing", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder gatewayAddress(String gatewayAddress) {
            if (gatewayAddress == null) {
              throw new MissingRequiredPropertyException("MagicTransitSiteWanStaticAddressing", "gatewayAddress");
            }
            this.gatewayAddress = gatewayAddress;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryAddress(@Nullable String secondaryAddress) {

            this.secondaryAddress = secondaryAddress;
            return this;
        }
        public MagicTransitSiteWanStaticAddressing build() {
            final var _resultValue = new MagicTransitSiteWanStaticAddressing();
            _resultValue.address = address;
            _resultValue.gatewayAddress = gatewayAddress;
            _resultValue.secondaryAddress = secondaryAddress;
            return _resultValue;
        }
    }
}
