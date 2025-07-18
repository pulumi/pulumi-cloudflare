// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZoneAccount;
import com.pulumi.cloudflare.outputs.GetZoneFilter;
import com.pulumi.cloudflare.outputs.GetZoneMeta;
import com.pulumi.cloudflare.outputs.GetZoneOwner;
import com.pulumi.cloudflare.outputs.GetZonePlan;
import com.pulumi.cloudflare.outputs.GetZoneTenant;
import com.pulumi.cloudflare.outputs.GetZoneTenantUnit;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZoneResult {
    private GetZoneAccount account;
    private String activatedOn;
    private String cnameSuffix;
    private String createdOn;
    private Double developmentMode;
    private @Nullable GetZoneFilter filter;
    private String id;
    private GetZoneMeta meta;
    private String modifiedOn;
    private String name;
    private List<String> nameServers;
    private String originalDnshost;
    private List<String> originalNameServers;
    private String originalRegistrar;
    private GetZoneOwner owner;
    private Boolean paused;
    /**
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    private List<String> permissions;
    /**
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    private GetZonePlan plan;
    private String status;
    private GetZoneTenant tenant;
    private GetZoneTenantUnit tenantUnit;
    private String type;
    private List<String> vanityNameServers;
    private String verificationKey;
    private @Nullable String zoneId;

    private GetZoneResult() {}
    public GetZoneAccount account() {
        return this.account;
    }
    public String activatedOn() {
        return this.activatedOn;
    }
    public String cnameSuffix() {
        return this.cnameSuffix;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public Double developmentMode() {
        return this.developmentMode;
    }
    public Optional<GetZoneFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    public String id() {
        return this.id;
    }
    public GetZoneMeta meta() {
        return this.meta;
    }
    public String modifiedOn() {
        return this.modifiedOn;
    }
    public String name() {
        return this.name;
    }
    public List<String> nameServers() {
        return this.nameServers;
    }
    public String originalDnshost() {
        return this.originalDnshost;
    }
    public List<String> originalNameServers() {
        return this.originalNameServers;
    }
    public String originalRegistrar() {
        return this.originalRegistrar;
    }
    public GetZoneOwner owner() {
        return this.owner;
    }
    public Boolean paused() {
        return this.paused;
    }
    /**
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    public List<String> permissions() {
        return this.permissions;
    }
    /**
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    public GetZonePlan plan() {
        return this.plan;
    }
    public String status() {
        return this.status;
    }
    public GetZoneTenant tenant() {
        return this.tenant;
    }
    public GetZoneTenantUnit tenantUnit() {
        return this.tenantUnit;
    }
    public String type() {
        return this.type;
    }
    public List<String> vanityNameServers() {
        return this.vanityNameServers;
    }
    public String verificationKey() {
        return this.verificationKey;
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetZoneAccount account;
        private String activatedOn;
        private String cnameSuffix;
        private String createdOn;
        private Double developmentMode;
        private @Nullable GetZoneFilter filter;
        private String id;
        private GetZoneMeta meta;
        private String modifiedOn;
        private String name;
        private List<String> nameServers;
        private String originalDnshost;
        private List<String> originalNameServers;
        private String originalRegistrar;
        private GetZoneOwner owner;
        private Boolean paused;
        private List<String> permissions;
        private GetZonePlan plan;
        private String status;
        private GetZoneTenant tenant;
        private GetZoneTenantUnit tenantUnit;
        private String type;
        private List<String> vanityNameServers;
        private String verificationKey;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.activatedOn = defaults.activatedOn;
    	      this.cnameSuffix = defaults.cnameSuffix;
    	      this.createdOn = defaults.createdOn;
    	      this.developmentMode = defaults.developmentMode;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.meta = defaults.meta;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.originalDnshost = defaults.originalDnshost;
    	      this.originalNameServers = defaults.originalNameServers;
    	      this.originalRegistrar = defaults.originalRegistrar;
    	      this.owner = defaults.owner;
    	      this.paused = defaults.paused;
    	      this.permissions = defaults.permissions;
    	      this.plan = defaults.plan;
    	      this.status = defaults.status;
    	      this.tenant = defaults.tenant;
    	      this.tenantUnit = defaults.tenantUnit;
    	      this.type = defaults.type;
    	      this.vanityNameServers = defaults.vanityNameServers;
    	      this.verificationKey = defaults.verificationKey;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder account(GetZoneAccount account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "account");
            }
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder activatedOn(String activatedOn) {
            if (activatedOn == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "activatedOn");
            }
            this.activatedOn = activatedOn;
            return this;
        }
        @CustomType.Setter
        public Builder cnameSuffix(String cnameSuffix) {
            if (cnameSuffix == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "cnameSuffix");
            }
            this.cnameSuffix = cnameSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder developmentMode(Double developmentMode) {
            if (developmentMode == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "developmentMode");
            }
            this.developmentMode = developmentMode;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable GetZoneFilter filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder meta(GetZoneMeta meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameServers(List<String> nameServers) {
            if (nameServers == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "nameServers");
            }
            this.nameServers = nameServers;
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }
        @CustomType.Setter
        public Builder originalDnshost(String originalDnshost) {
            if (originalDnshost == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "originalDnshost");
            }
            this.originalDnshost = originalDnshost;
            return this;
        }
        @CustomType.Setter
        public Builder originalNameServers(List<String> originalNameServers) {
            if (originalNameServers == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "originalNameServers");
            }
            this.originalNameServers = originalNameServers;
            return this;
        }
        public Builder originalNameServers(String... originalNameServers) {
            return originalNameServers(List.of(originalNameServers));
        }
        @CustomType.Setter
        public Builder originalRegistrar(String originalRegistrar) {
            if (originalRegistrar == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "originalRegistrar");
            }
            this.originalRegistrar = originalRegistrar;
            return this;
        }
        @CustomType.Setter
        public Builder owner(GetZoneOwner owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder paused(Boolean paused) {
            if (paused == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "paused");
            }
            this.paused = paused;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(List<String> permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder plan(GetZonePlan plan) {
            if (plan == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "plan");
            }
            this.plan = plan;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tenant(GetZoneTenant tenant) {
            if (tenant == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "tenant");
            }
            this.tenant = tenant;
            return this;
        }
        @CustomType.Setter
        public Builder tenantUnit(GetZoneTenantUnit tenantUnit) {
            if (tenantUnit == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "tenantUnit");
            }
            this.tenantUnit = tenantUnit;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vanityNameServers(List<String> vanityNameServers) {
            if (vanityNameServers == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "vanityNameServers");
            }
            this.vanityNameServers = vanityNameServers;
            return this;
        }
        public Builder vanityNameServers(String... vanityNameServers) {
            return vanityNameServers(List.of(vanityNameServers));
        }
        @CustomType.Setter
        public Builder verificationKey(String verificationKey) {
            if (verificationKey == null) {
              throw new MissingRequiredPropertyException("GetZoneResult", "verificationKey");
            }
            this.verificationKey = verificationKey;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public GetZoneResult build() {
            final var _resultValue = new GetZoneResult();
            _resultValue.account = account;
            _resultValue.activatedOn = activatedOn;
            _resultValue.cnameSuffix = cnameSuffix;
            _resultValue.createdOn = createdOn;
            _resultValue.developmentMode = developmentMode;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.meta = meta;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.name = name;
            _resultValue.nameServers = nameServers;
            _resultValue.originalDnshost = originalDnshost;
            _resultValue.originalNameServers = originalNameServers;
            _resultValue.originalRegistrar = originalRegistrar;
            _resultValue.owner = owner;
            _resultValue.paused = paused;
            _resultValue.permissions = permissions;
            _resultValue.plan = plan;
            _resultValue.status = status;
            _resultValue.tenant = tenant;
            _resultValue.tenantUnit = tenantUnit;
            _resultValue.type = type;
            _resultValue.vanityNameServers = vanityNameServers;
            _resultValue.verificationKey = verificationKey;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
