// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsAnalytics;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsBilling;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsCachePurge;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsDns;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsDnsRecords;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsLb;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsLogs;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsOrganization;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsSsl;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsWaf;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsZoneSettings;
import com.pulumi.cloudflare.outputs.GetAccountRolePermissionsZones;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetAccountRolePermissions {
    private GetAccountRolePermissionsAnalytics analytics;
    private GetAccountRolePermissionsBilling billing;
    private GetAccountRolePermissionsCachePurge cachePurge;
    private GetAccountRolePermissionsDns dns;
    private GetAccountRolePermissionsDnsRecords dnsRecords;
    private GetAccountRolePermissionsLb lb;
    private GetAccountRolePermissionsLogs logs;
    private GetAccountRolePermissionsOrganization organization;
    private GetAccountRolePermissionsSsl ssl;
    private GetAccountRolePermissionsWaf waf;
    private GetAccountRolePermissionsZoneSettings zoneSettings;
    private GetAccountRolePermissionsZones zones;

    private GetAccountRolePermissions() {}
    public GetAccountRolePermissionsAnalytics analytics() {
        return this.analytics;
    }
    public GetAccountRolePermissionsBilling billing() {
        return this.billing;
    }
    public GetAccountRolePermissionsCachePurge cachePurge() {
        return this.cachePurge;
    }
    public GetAccountRolePermissionsDns dns() {
        return this.dns;
    }
    public GetAccountRolePermissionsDnsRecords dnsRecords() {
        return this.dnsRecords;
    }
    public GetAccountRolePermissionsLb lb() {
        return this.lb;
    }
    public GetAccountRolePermissionsLogs logs() {
        return this.logs;
    }
    public GetAccountRolePermissionsOrganization organization() {
        return this.organization;
    }
    public GetAccountRolePermissionsSsl ssl() {
        return this.ssl;
    }
    public GetAccountRolePermissionsWaf waf() {
        return this.waf;
    }
    public GetAccountRolePermissionsZoneSettings zoneSettings() {
        return this.zoneSettings;
    }
    public GetAccountRolePermissionsZones zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountRolePermissions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetAccountRolePermissionsAnalytics analytics;
        private GetAccountRolePermissionsBilling billing;
        private GetAccountRolePermissionsCachePurge cachePurge;
        private GetAccountRolePermissionsDns dns;
        private GetAccountRolePermissionsDnsRecords dnsRecords;
        private GetAccountRolePermissionsLb lb;
        private GetAccountRolePermissionsLogs logs;
        private GetAccountRolePermissionsOrganization organization;
        private GetAccountRolePermissionsSsl ssl;
        private GetAccountRolePermissionsWaf waf;
        private GetAccountRolePermissionsZoneSettings zoneSettings;
        private GetAccountRolePermissionsZones zones;
        public Builder() {}
        public Builder(GetAccountRolePermissions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analytics = defaults.analytics;
    	      this.billing = defaults.billing;
    	      this.cachePurge = defaults.cachePurge;
    	      this.dns = defaults.dns;
    	      this.dnsRecords = defaults.dnsRecords;
    	      this.lb = defaults.lb;
    	      this.logs = defaults.logs;
    	      this.organization = defaults.organization;
    	      this.ssl = defaults.ssl;
    	      this.waf = defaults.waf;
    	      this.zoneSettings = defaults.zoneSettings;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder analytics(GetAccountRolePermissionsAnalytics analytics) {
            if (analytics == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "analytics");
            }
            this.analytics = analytics;
            return this;
        }
        @CustomType.Setter
        public Builder billing(GetAccountRolePermissionsBilling billing) {
            if (billing == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "billing");
            }
            this.billing = billing;
            return this;
        }
        @CustomType.Setter
        public Builder cachePurge(GetAccountRolePermissionsCachePurge cachePurge) {
            if (cachePurge == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "cachePurge");
            }
            this.cachePurge = cachePurge;
            return this;
        }
        @CustomType.Setter
        public Builder dns(GetAccountRolePermissionsDns dns) {
            if (dns == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "dns");
            }
            this.dns = dns;
            return this;
        }
        @CustomType.Setter
        public Builder dnsRecords(GetAccountRolePermissionsDnsRecords dnsRecords) {
            if (dnsRecords == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "dnsRecords");
            }
            this.dnsRecords = dnsRecords;
            return this;
        }
        @CustomType.Setter
        public Builder lb(GetAccountRolePermissionsLb lb) {
            if (lb == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "lb");
            }
            this.lb = lb;
            return this;
        }
        @CustomType.Setter
        public Builder logs(GetAccountRolePermissionsLogs logs) {
            if (logs == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "logs");
            }
            this.logs = logs;
            return this;
        }
        @CustomType.Setter
        public Builder organization(GetAccountRolePermissionsOrganization organization) {
            if (organization == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "organization");
            }
            this.organization = organization;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(GetAccountRolePermissionsSsl ssl) {
            if (ssl == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "ssl");
            }
            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder waf(GetAccountRolePermissionsWaf waf) {
            if (waf == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "waf");
            }
            this.waf = waf;
            return this;
        }
        @CustomType.Setter
        public Builder zoneSettings(GetAccountRolePermissionsZoneSettings zoneSettings) {
            if (zoneSettings == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "zoneSettings");
            }
            this.zoneSettings = zoneSettings;
            return this;
        }
        @CustomType.Setter
        public Builder zones(GetAccountRolePermissionsZones zones) {
            if (zones == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissions", "zones");
            }
            this.zones = zones;
            return this;
        }
        public GetAccountRolePermissions build() {
            final var _resultValue = new GetAccountRolePermissions();
            _resultValue.analytics = analytics;
            _resultValue.billing = billing;
            _resultValue.cachePurge = cachePurge;
            _resultValue.dns = dns;
            _resultValue.dnsRecords = dnsRecords;
            _resultValue.lb = lb;
            _resultValue.logs = logs;
            _resultValue.organization = organization;
            _resultValue.ssl = ssl;
            _resultValue.waf = waf;
            _resultValue.zoneSettings = zoneSettings;
            _resultValue.zones = zones;
            return _resultValue;
        }
    }
}
