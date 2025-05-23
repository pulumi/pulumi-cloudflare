// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZoneDnsSettingsInternalDns;
import com.pulumi.cloudflare.outputs.GetZoneDnsSettingsNameservers;
import com.pulumi.cloudflare.outputs.GetZoneDnsSettingsSoa;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZoneDnsSettingsResult {
    /**
     * @return Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
     * 
     */
    private Boolean flattenAllCnames;
    /**
     * @return Whether to enable Foundation DNS Advanced Nameservers on the zone.
     * 
     */
    private Boolean foundationDns;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Settings for this internal zone.
     * 
     */
    private GetZoneDnsSettingsInternalDns internalDns;
    /**
     * @return Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
     * 
     */
    private Boolean multiProvider;
    /**
     * @return Settings determining the nameservers through which the zone should be available.
     * 
     */
    private GetZoneDnsSettingsNameservers nameservers;
    /**
     * @return The time to live (TTL) of the zone&#39;s nameserver (NS) records.
     * 
     */
    private Double nsTtl;
    /**
     * @return Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
     * 
     */
    private Boolean secondaryOverrides;
    /**
     * @return Components of the zone&#39;s SOA record.
     * 
     */
    private GetZoneDnsSettingsSoa soa;
    /**
     * @return Identifier.
     * 
     */
    private String zoneId;
    /**
     * @return Whether the zone mode is a regular or CDN/DNS only zone.
     * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
     * 
     */
    private String zoneMode;

    private GetZoneDnsSettingsResult() {}
    /**
     * @return Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
     * 
     */
    public Boolean flattenAllCnames() {
        return this.flattenAllCnames;
    }
    /**
     * @return Whether to enable Foundation DNS Advanced Nameservers on the zone.
     * 
     */
    public Boolean foundationDns() {
        return this.foundationDns;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Settings for this internal zone.
     * 
     */
    public GetZoneDnsSettingsInternalDns internalDns() {
        return this.internalDns;
    }
    /**
     * @return Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
     * 
     */
    public Boolean multiProvider() {
        return this.multiProvider;
    }
    /**
     * @return Settings determining the nameservers through which the zone should be available.
     * 
     */
    public GetZoneDnsSettingsNameservers nameservers() {
        return this.nameservers;
    }
    /**
     * @return The time to live (TTL) of the zone&#39;s nameserver (NS) records.
     * 
     */
    public Double nsTtl() {
        return this.nsTtl;
    }
    /**
     * @return Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
     * 
     */
    public Boolean secondaryOverrides() {
        return this.secondaryOverrides;
    }
    /**
     * @return Components of the zone&#39;s SOA record.
     * 
     */
    public GetZoneDnsSettingsSoa soa() {
        return this.soa;
    }
    /**
     * @return Identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }
    /**
     * @return Whether the zone mode is a regular or CDN/DNS only zone.
     * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
     * 
     */
    public String zoneMode() {
        return this.zoneMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneDnsSettingsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean flattenAllCnames;
        private Boolean foundationDns;
        private String id;
        private GetZoneDnsSettingsInternalDns internalDns;
        private Boolean multiProvider;
        private GetZoneDnsSettingsNameservers nameservers;
        private Double nsTtl;
        private Boolean secondaryOverrides;
        private GetZoneDnsSettingsSoa soa;
        private String zoneId;
        private String zoneMode;
        public Builder() {}
        public Builder(GetZoneDnsSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flattenAllCnames = defaults.flattenAllCnames;
    	      this.foundationDns = defaults.foundationDns;
    	      this.id = defaults.id;
    	      this.internalDns = defaults.internalDns;
    	      this.multiProvider = defaults.multiProvider;
    	      this.nameservers = defaults.nameservers;
    	      this.nsTtl = defaults.nsTtl;
    	      this.secondaryOverrides = defaults.secondaryOverrides;
    	      this.soa = defaults.soa;
    	      this.zoneId = defaults.zoneId;
    	      this.zoneMode = defaults.zoneMode;
        }

        @CustomType.Setter
        public Builder flattenAllCnames(Boolean flattenAllCnames) {
            if (flattenAllCnames == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "flattenAllCnames");
            }
            this.flattenAllCnames = flattenAllCnames;
            return this;
        }
        @CustomType.Setter
        public Builder foundationDns(Boolean foundationDns) {
            if (foundationDns == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "foundationDns");
            }
            this.foundationDns = foundationDns;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder internalDns(GetZoneDnsSettingsInternalDns internalDns) {
            if (internalDns == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "internalDns");
            }
            this.internalDns = internalDns;
            return this;
        }
        @CustomType.Setter
        public Builder multiProvider(Boolean multiProvider) {
            if (multiProvider == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "multiProvider");
            }
            this.multiProvider = multiProvider;
            return this;
        }
        @CustomType.Setter
        public Builder nameservers(GetZoneDnsSettingsNameservers nameservers) {
            if (nameservers == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "nameservers");
            }
            this.nameservers = nameservers;
            return this;
        }
        @CustomType.Setter
        public Builder nsTtl(Double nsTtl) {
            if (nsTtl == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "nsTtl");
            }
            this.nsTtl = nsTtl;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryOverrides(Boolean secondaryOverrides) {
            if (secondaryOverrides == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "secondaryOverrides");
            }
            this.secondaryOverrides = secondaryOverrides;
            return this;
        }
        @CustomType.Setter
        public Builder soa(GetZoneDnsSettingsSoa soa) {
            if (soa == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "soa");
            }
            this.soa = soa;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneMode(String zoneMode) {
            if (zoneMode == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsResult", "zoneMode");
            }
            this.zoneMode = zoneMode;
            return this;
        }
        public GetZoneDnsSettingsResult build() {
            final var _resultValue = new GetZoneDnsSettingsResult();
            _resultValue.flattenAllCnames = flattenAllCnames;
            _resultValue.foundationDns = foundationDns;
            _resultValue.id = id;
            _resultValue.internalDns = internalDns;
            _resultValue.multiProvider = multiProvider;
            _resultValue.nameservers = nameservers;
            _resultValue.nsTtl = nsTtl;
            _resultValue.secondaryOverrides = secondaryOverrides;
            _resultValue.soa = soa;
            _resultValue.zoneId = zoneId;
            _resultValue.zoneMode = zoneMode;
            return _resultValue;
        }
    }
}
