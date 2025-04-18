// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetMagicTransitSiteWanStaticAddressing;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMagicTransitSiteWanResult {
    /**
     * @return Identifier
     * 
     */
    private String accountId;
    /**
     * @return Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
     * Available values: &#34;low&#34;, &#34;mid&#34;, &#34;high&#34;.
     * 
     */
    private String healthCheckRate;
    /**
     * @return Identifier
     * 
     */
    private String id;
    private String name;
    private Integer physport;
    /**
     * @return Priority of WAN for traffic loadbalancing.
     * 
     */
    private Integer priority;
    /**
     * @return Identifier
     * 
     */
    private String siteId;
    /**
     * @return (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
     * 
     */
    private GetMagicTransitSiteWanStaticAddressing staticAddressing;
    /**
     * @return VLAN ID. Use zero for untagged.
     * 
     */
    private Integer vlanTag;
    /**
     * @return Identifier
     * 
     */
    private @Nullable String wanId;

    private GetMagicTransitSiteWanResult() {}
    /**
     * @return Identifier
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
     * Available values: &#34;low&#34;, &#34;mid&#34;, &#34;high&#34;.
     * 
     */
    public String healthCheckRate() {
        return this.healthCheckRate;
    }
    /**
     * @return Identifier
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public Integer physport() {
        return this.physport;
    }
    /**
     * @return Priority of WAN for traffic loadbalancing.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Identifier
     * 
     */
    public String siteId() {
        return this.siteId;
    }
    /**
     * @return (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
     * 
     */
    public GetMagicTransitSiteWanStaticAddressing staticAddressing() {
        return this.staticAddressing;
    }
    /**
     * @return VLAN ID. Use zero for untagged.
     * 
     */
    public Integer vlanTag() {
        return this.vlanTag;
    }
    /**
     * @return Identifier
     * 
     */
    public Optional<String> wanId() {
        return Optional.ofNullable(this.wanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMagicTransitSiteWanResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String healthCheckRate;
        private String id;
        private String name;
        private Integer physport;
        private Integer priority;
        private String siteId;
        private GetMagicTransitSiteWanStaticAddressing staticAddressing;
        private Integer vlanTag;
        private @Nullable String wanId;
        public Builder() {}
        public Builder(GetMagicTransitSiteWanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.healthCheckRate = defaults.healthCheckRate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.physport = defaults.physport;
    	      this.priority = defaults.priority;
    	      this.siteId = defaults.siteId;
    	      this.staticAddressing = defaults.staticAddressing;
    	      this.vlanTag = defaults.vlanTag;
    	      this.wanId = defaults.wanId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckRate(String healthCheckRate) {
            if (healthCheckRate == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "healthCheckRate");
            }
            this.healthCheckRate = healthCheckRate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder physport(Integer physport) {
            if (physport == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "physport");
            }
            this.physport = physport;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder siteId(String siteId) {
            if (siteId == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "siteId");
            }
            this.siteId = siteId;
            return this;
        }
        @CustomType.Setter
        public Builder staticAddressing(GetMagicTransitSiteWanStaticAddressing staticAddressing) {
            if (staticAddressing == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "staticAddressing");
            }
            this.staticAddressing = staticAddressing;
            return this;
        }
        @CustomType.Setter
        public Builder vlanTag(Integer vlanTag) {
            if (vlanTag == null) {
              throw new MissingRequiredPropertyException("GetMagicTransitSiteWanResult", "vlanTag");
            }
            this.vlanTag = vlanTag;
            return this;
        }
        @CustomType.Setter
        public Builder wanId(@Nullable String wanId) {

            this.wanId = wanId;
            return this;
        }
        public GetMagicTransitSiteWanResult build() {
            final var _resultValue = new GetMagicTransitSiteWanResult();
            _resultValue.accountId = accountId;
            _resultValue.healthCheckRate = healthCheckRate;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.physport = physport;
            _resultValue.priority = priority;
            _resultValue.siteId = siteId;
            _resultValue.staticAddressing = staticAddressing;
            _resultValue.vlanTag = vlanTag;
            _resultValue.wanId = wanId;
            return _resultValue;
        }
    }
}
