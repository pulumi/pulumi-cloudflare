// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileExclude;
import com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileFallbackDomain;
import com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileInclude;
import com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileServiceModeV2;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZeroTrustDeviceDefaultProfileResult {
    private String accountId;
    /**
     * @return Whether to allow the user to switch WARP between modes.
     * 
     */
    private Boolean allowModeSwitch;
    /**
     * @return Whether to receive update notifications when a new version of the client is available.
     * 
     */
    private Boolean allowUpdates;
    /**
     * @return Whether to allow devices to leave the organization.
     * 
     */
    private Boolean allowedToLeave;
    /**
     * @return The amount of time in seconds to reconnect after having been disabled.
     * 
     */
    private Double autoConnect;
    /**
     * @return Turn on the captive portal after the specified amount of time.
     * 
     */
    private Double captivePortal;
    /**
     * @return Whether the policy will be applied to matching devices.
     * 
     */
    private Boolean default_;
    /**
     * @return If the `dns_server` field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to `true`.
     * 
     */
    private Boolean disableAutoFallback;
    /**
     * @return Whether the policy will be applied to matching devices.
     * 
     */
    private Boolean enabled;
    /**
     * @return Whether to add Microsoft IPs to Split Tunnel exclusions.
     * 
     */
    private Boolean excludeOfficeIps;
    /**
     * @return List of routes excluded in the WARP client&#39;s tunnel.
     * 
     */
    private List<GetZeroTrustDeviceDefaultProfileExclude> excludes;
    private List<GetZeroTrustDeviceDefaultProfileFallbackDomain> fallbackDomains;
    private String gatewayUniqueId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of routes included in the WARP client&#39;s tunnel.
     * 
     */
    private List<GetZeroTrustDeviceDefaultProfileInclude> includes;
    /**
     * @return Determines if the operating system will register WARP&#39;s local interface IP with your on-premises DNS server.
     * 
     */
    private Boolean registerInterfaceIpWithDns;
    /**
     * @return Determines whether the WARP client indicates to SCCM that it is inside a VPN boundary. (Windows only).
     * 
     */
    private Boolean sccmVpnBoundarySupport;
    private GetZeroTrustDeviceDefaultProfileServiceModeV2 serviceModeV2;
    /**
     * @return The URL to launch when the Send Feedback button is clicked.
     * 
     */
    private String supportUrl;
    /**
     * @return Whether to allow the user to turn off the WARP switch and disconnect the client.
     * 
     */
    private Boolean switchLocked;
    /**
     * @return Determines which tunnel protocol to use.
     * 
     */
    private String tunnelProtocol;

    private GetZeroTrustDeviceDefaultProfileResult() {}
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Whether to allow the user to switch WARP between modes.
     * 
     */
    public Boolean allowModeSwitch() {
        return this.allowModeSwitch;
    }
    /**
     * @return Whether to receive update notifications when a new version of the client is available.
     * 
     */
    public Boolean allowUpdates() {
        return this.allowUpdates;
    }
    /**
     * @return Whether to allow devices to leave the organization.
     * 
     */
    public Boolean allowedToLeave() {
        return this.allowedToLeave;
    }
    /**
     * @return The amount of time in seconds to reconnect after having been disabled.
     * 
     */
    public Double autoConnect() {
        return this.autoConnect;
    }
    /**
     * @return Turn on the captive portal after the specified amount of time.
     * 
     */
    public Double captivePortal() {
        return this.captivePortal;
    }
    /**
     * @return Whether the policy will be applied to matching devices.
     * 
     */
    public Boolean default_() {
        return this.default_;
    }
    /**
     * @return If the `dns_server` field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to `true`.
     * 
     */
    public Boolean disableAutoFallback() {
        return this.disableAutoFallback;
    }
    /**
     * @return Whether the policy will be applied to matching devices.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Whether to add Microsoft IPs to Split Tunnel exclusions.
     * 
     */
    public Boolean excludeOfficeIps() {
        return this.excludeOfficeIps;
    }
    /**
     * @return List of routes excluded in the WARP client&#39;s tunnel.
     * 
     */
    public List<GetZeroTrustDeviceDefaultProfileExclude> excludes() {
        return this.excludes;
    }
    public List<GetZeroTrustDeviceDefaultProfileFallbackDomain> fallbackDomains() {
        return this.fallbackDomains;
    }
    public String gatewayUniqueId() {
        return this.gatewayUniqueId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of routes included in the WARP client&#39;s tunnel.
     * 
     */
    public List<GetZeroTrustDeviceDefaultProfileInclude> includes() {
        return this.includes;
    }
    /**
     * @return Determines if the operating system will register WARP&#39;s local interface IP with your on-premises DNS server.
     * 
     */
    public Boolean registerInterfaceIpWithDns() {
        return this.registerInterfaceIpWithDns;
    }
    /**
     * @return Determines whether the WARP client indicates to SCCM that it is inside a VPN boundary. (Windows only).
     * 
     */
    public Boolean sccmVpnBoundarySupport() {
        return this.sccmVpnBoundarySupport;
    }
    public GetZeroTrustDeviceDefaultProfileServiceModeV2 serviceModeV2() {
        return this.serviceModeV2;
    }
    /**
     * @return The URL to launch when the Send Feedback button is clicked.
     * 
     */
    public String supportUrl() {
        return this.supportUrl;
    }
    /**
     * @return Whether to allow the user to turn off the WARP switch and disconnect the client.
     * 
     */
    public Boolean switchLocked() {
        return this.switchLocked;
    }
    /**
     * @return Determines which tunnel protocol to use.
     * 
     */
    public String tunnelProtocol() {
        return this.tunnelProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustDeviceDefaultProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private Boolean allowModeSwitch;
        private Boolean allowUpdates;
        private Boolean allowedToLeave;
        private Double autoConnect;
        private Double captivePortal;
        private Boolean default_;
        private Boolean disableAutoFallback;
        private Boolean enabled;
        private Boolean excludeOfficeIps;
        private List<GetZeroTrustDeviceDefaultProfileExclude> excludes;
        private List<GetZeroTrustDeviceDefaultProfileFallbackDomain> fallbackDomains;
        private String gatewayUniqueId;
        private String id;
        private List<GetZeroTrustDeviceDefaultProfileInclude> includes;
        private Boolean registerInterfaceIpWithDns;
        private Boolean sccmVpnBoundarySupport;
        private GetZeroTrustDeviceDefaultProfileServiceModeV2 serviceModeV2;
        private String supportUrl;
        private Boolean switchLocked;
        private String tunnelProtocol;
        public Builder() {}
        public Builder(GetZeroTrustDeviceDefaultProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.allowModeSwitch = defaults.allowModeSwitch;
    	      this.allowUpdates = defaults.allowUpdates;
    	      this.allowedToLeave = defaults.allowedToLeave;
    	      this.autoConnect = defaults.autoConnect;
    	      this.captivePortal = defaults.captivePortal;
    	      this.default_ = defaults.default_;
    	      this.disableAutoFallback = defaults.disableAutoFallback;
    	      this.enabled = defaults.enabled;
    	      this.excludeOfficeIps = defaults.excludeOfficeIps;
    	      this.excludes = defaults.excludes;
    	      this.fallbackDomains = defaults.fallbackDomains;
    	      this.gatewayUniqueId = defaults.gatewayUniqueId;
    	      this.id = defaults.id;
    	      this.includes = defaults.includes;
    	      this.registerInterfaceIpWithDns = defaults.registerInterfaceIpWithDns;
    	      this.sccmVpnBoundarySupport = defaults.sccmVpnBoundarySupport;
    	      this.serviceModeV2 = defaults.serviceModeV2;
    	      this.supportUrl = defaults.supportUrl;
    	      this.switchLocked = defaults.switchLocked;
    	      this.tunnelProtocol = defaults.tunnelProtocol;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder allowModeSwitch(Boolean allowModeSwitch) {
            if (allowModeSwitch == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "allowModeSwitch");
            }
            this.allowModeSwitch = allowModeSwitch;
            return this;
        }
        @CustomType.Setter
        public Builder allowUpdates(Boolean allowUpdates) {
            if (allowUpdates == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "allowUpdates");
            }
            this.allowUpdates = allowUpdates;
            return this;
        }
        @CustomType.Setter
        public Builder allowedToLeave(Boolean allowedToLeave) {
            if (allowedToLeave == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "allowedToLeave");
            }
            this.allowedToLeave = allowedToLeave;
            return this;
        }
        @CustomType.Setter
        public Builder autoConnect(Double autoConnect) {
            if (autoConnect == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "autoConnect");
            }
            this.autoConnect = autoConnect;
            return this;
        }
        @CustomType.Setter
        public Builder captivePortal(Double captivePortal) {
            if (captivePortal == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "captivePortal");
            }
            this.captivePortal = captivePortal;
            return this;
        }
        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder disableAutoFallback(Boolean disableAutoFallback) {
            if (disableAutoFallback == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "disableAutoFallback");
            }
            this.disableAutoFallback = disableAutoFallback;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder excludeOfficeIps(Boolean excludeOfficeIps) {
            if (excludeOfficeIps == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "excludeOfficeIps");
            }
            this.excludeOfficeIps = excludeOfficeIps;
            return this;
        }
        @CustomType.Setter
        public Builder excludes(List<GetZeroTrustDeviceDefaultProfileExclude> excludes) {
            if (excludes == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "excludes");
            }
            this.excludes = excludes;
            return this;
        }
        public Builder excludes(GetZeroTrustDeviceDefaultProfileExclude... excludes) {
            return excludes(List.of(excludes));
        }
        @CustomType.Setter
        public Builder fallbackDomains(List<GetZeroTrustDeviceDefaultProfileFallbackDomain> fallbackDomains) {
            if (fallbackDomains == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "fallbackDomains");
            }
            this.fallbackDomains = fallbackDomains;
            return this;
        }
        public Builder fallbackDomains(GetZeroTrustDeviceDefaultProfileFallbackDomain... fallbackDomains) {
            return fallbackDomains(List.of(fallbackDomains));
        }
        @CustomType.Setter
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            if (gatewayUniqueId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "gatewayUniqueId");
            }
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includes(List<GetZeroTrustDeviceDefaultProfileInclude> includes) {
            if (includes == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "includes");
            }
            this.includes = includes;
            return this;
        }
        public Builder includes(GetZeroTrustDeviceDefaultProfileInclude... includes) {
            return includes(List.of(includes));
        }
        @CustomType.Setter
        public Builder registerInterfaceIpWithDns(Boolean registerInterfaceIpWithDns) {
            if (registerInterfaceIpWithDns == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "registerInterfaceIpWithDns");
            }
            this.registerInterfaceIpWithDns = registerInterfaceIpWithDns;
            return this;
        }
        @CustomType.Setter
        public Builder sccmVpnBoundarySupport(Boolean sccmVpnBoundarySupport) {
            if (sccmVpnBoundarySupport == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "sccmVpnBoundarySupport");
            }
            this.sccmVpnBoundarySupport = sccmVpnBoundarySupport;
            return this;
        }
        @CustomType.Setter
        public Builder serviceModeV2(GetZeroTrustDeviceDefaultProfileServiceModeV2 serviceModeV2) {
            if (serviceModeV2 == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "serviceModeV2");
            }
            this.serviceModeV2 = serviceModeV2;
            return this;
        }
        @CustomType.Setter
        public Builder supportUrl(String supportUrl) {
            if (supportUrl == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "supportUrl");
            }
            this.supportUrl = supportUrl;
            return this;
        }
        @CustomType.Setter
        public Builder switchLocked(Boolean switchLocked) {
            if (switchLocked == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "switchLocked");
            }
            this.switchLocked = switchLocked;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelProtocol(String tunnelProtocol) {
            if (tunnelProtocol == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDeviceDefaultProfileResult", "tunnelProtocol");
            }
            this.tunnelProtocol = tunnelProtocol;
            return this;
        }
        public GetZeroTrustDeviceDefaultProfileResult build() {
            final var _resultValue = new GetZeroTrustDeviceDefaultProfileResult();
            _resultValue.accountId = accountId;
            _resultValue.allowModeSwitch = allowModeSwitch;
            _resultValue.allowUpdates = allowUpdates;
            _resultValue.allowedToLeave = allowedToLeave;
            _resultValue.autoConnect = autoConnect;
            _resultValue.captivePortal = captivePortal;
            _resultValue.default_ = default_;
            _resultValue.disableAutoFallback = disableAutoFallback;
            _resultValue.enabled = enabled;
            _resultValue.excludeOfficeIps = excludeOfficeIps;
            _resultValue.excludes = excludes;
            _resultValue.fallbackDomains = fallbackDomains;
            _resultValue.gatewayUniqueId = gatewayUniqueId;
            _resultValue.id = id;
            _resultValue.includes = includes;
            _resultValue.registerInterfaceIpWithDns = registerInterfaceIpWithDns;
            _resultValue.sccmVpnBoundarySupport = sccmVpnBoundarySupport;
            _resultValue.serviceModeV2 = serviceModeV2;
            _resultValue.supportUrl = supportUrl;
            _resultValue.switchLocked = switchLocked;
            _resultValue.tunnelProtocol = tunnelProtocol;
            return _resultValue;
        }
    }
}
