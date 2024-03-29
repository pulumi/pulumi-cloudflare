// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApiTokenPermissionGroupsResult {
    /**
     * @return Map of permissions for account level resources.
     * 
     */
    private Map<String,String> account;
    /**
     * @return Checksum of permissions.
     * 
     */
    private String id;
    /**
     * @return Map of all permissions available. Should not be used as some permissions will overlap resource scope. Instead, use resource level specific attributes.
     * 
     * @deprecated
     * Use specific account, zone or user attributes instead.
     * 
     */
    @Deprecated /* Use specific account, zone or user attributes instead. */
    private Map<String,String> permissions;
    /**
     * @return Map of permissions for r2 level resources.
     * 
     */
    private Map<String,String> r2;
    /**
     * @return Map of permissions for user level resources.
     * 
     */
    private Map<String,String> user;
    /**
     * @return Map of permissions for zone level resources.
     * 
     */
    private Map<String,String> zone;

    private GetApiTokenPermissionGroupsResult() {}
    /**
     * @return Map of permissions for account level resources.
     * 
     */
    public Map<String,String> account() {
        return this.account;
    }
    /**
     * @return Checksum of permissions.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Map of all permissions available. Should not be used as some permissions will overlap resource scope. Instead, use resource level specific attributes.
     * 
     * @deprecated
     * Use specific account, zone or user attributes instead.
     * 
     */
    @Deprecated /* Use specific account, zone or user attributes instead. */
    public Map<String,String> permissions() {
        return this.permissions;
    }
    /**
     * @return Map of permissions for r2 level resources.
     * 
     */
    public Map<String,String> r2() {
        return this.r2;
    }
    /**
     * @return Map of permissions for user level resources.
     * 
     */
    public Map<String,String> user() {
        return this.user;
    }
    /**
     * @return Map of permissions for zone level resources.
     * 
     */
    public Map<String,String> zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiTokenPermissionGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> account;
        private String id;
        private Map<String,String> permissions;
        private Map<String,String> r2;
        private Map<String,String> user;
        private Map<String,String> zone;
        public Builder() {}
        public Builder(GetApiTokenPermissionGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.r2 = defaults.r2;
    	      this.user = defaults.user;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder account(Map<String,String> account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetApiTokenPermissionGroupsResult", "account");
            }
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApiTokenPermissionGroupsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(Map<String,String> permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetApiTokenPermissionGroupsResult", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        @CustomType.Setter
        public Builder r2(Map<String,String> r2) {
            if (r2 == null) {
              throw new MissingRequiredPropertyException("GetApiTokenPermissionGroupsResult", "r2");
            }
            this.r2 = r2;
            return this;
        }
        @CustomType.Setter
        public Builder user(Map<String,String> user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetApiTokenPermissionGroupsResult", "user");
            }
            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder zone(Map<String,String> zone) {
            if (zone == null) {
              throw new MissingRequiredPropertyException("GetApiTokenPermissionGroupsResult", "zone");
            }
            this.zone = zone;
            return this;
        }
        public GetApiTokenPermissionGroupsResult build() {
            final var _resultValue = new GetApiTokenPermissionGroupsResult();
            _resultValue.account = account;
            _resultValue.id = id;
            _resultValue.permissions = permissions;
            _resultValue.r2 = r2;
            _resultValue.user = user;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
