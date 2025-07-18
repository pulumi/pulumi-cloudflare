// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountTokenPolicyPermissionGroupMeta;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountTokenPolicyPermissionGroup {
    /**
     * @return Identifier of the permission group.
     * 
     */
    private String id;
    /**
     * @return Attributes associated to the permission group.
     * 
     */
    private GetAccountTokenPolicyPermissionGroupMeta meta;
    /**
     * @return Name of the permission group.
     * 
     */
    private String name;

    private GetAccountTokenPolicyPermissionGroup() {}
    /**
     * @return Identifier of the permission group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Attributes associated to the permission group.
     * 
     */
    public GetAccountTokenPolicyPermissionGroupMeta meta() {
        return this.meta;
    }
    /**
     * @return Name of the permission group.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountTokenPolicyPermissionGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetAccountTokenPolicyPermissionGroupMeta meta;
        private String name;
        public Builder() {}
        public Builder(GetAccountTokenPolicyPermissionGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenPolicyPermissionGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder meta(GetAccountTokenPolicyPermissionGroupMeta meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenPolicyPermissionGroup", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenPolicyPermissionGroup", "name");
            }
            this.name = name;
            return this;
        }
        public GetAccountTokenPolicyPermissionGroup build() {
            final var _resultValue = new GetAccountTokenPolicyPermissionGroup();
            _resultValue.id = id;
            _resultValue.meta = meta;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
