// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ApiTokenPolicyPermissionGroup;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiTokenPolicy {
    /**
     * @return Allow or deny operations against the resources.
     * Available values: &#34;allow&#34;, &#34;deny&#34;.
     * 
     */
    private String effect;
    /**
     * @return Policy identifier.
     * 
     */
    private @Nullable String id;
    /**
     * @return A set of permission groups that are specified to the policy.
     * 
     */
    private List<ApiTokenPolicyPermissionGroup> permissionGroups;
    /**
     * @return A list of resource names that the policy applies to.
     * 
     */
    private Map<String,String> resources;

    private ApiTokenPolicy() {}
    /**
     * @return Allow or deny operations against the resources.
     * Available values: &#34;allow&#34;, &#34;deny&#34;.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return Policy identifier.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A set of permission groups that are specified to the policy.
     * 
     */
    public List<ApiTokenPolicyPermissionGroup> permissionGroups() {
        return this.permissionGroups;
    }
    /**
     * @return A list of resource names that the policy applies to.
     * 
     */
    public Map<String,String> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiTokenPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private @Nullable String id;
        private List<ApiTokenPolicyPermissionGroup> permissionGroups;
        private Map<String,String> resources;
        public Builder() {}
        public Builder(ApiTokenPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.id = defaults.id;
    	      this.permissionGroups = defaults.permissionGroups;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("ApiTokenPolicy", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder permissionGroups(List<ApiTokenPolicyPermissionGroup> permissionGroups) {
            if (permissionGroups == null) {
              throw new MissingRequiredPropertyException("ApiTokenPolicy", "permissionGroups");
            }
            this.permissionGroups = permissionGroups;
            return this;
        }
        public Builder permissionGroups(ApiTokenPolicyPermissionGroup... permissionGroups) {
            return permissionGroups(List.of(permissionGroups));
        }
        @CustomType.Setter
        public Builder resources(Map<String,String> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("ApiTokenPolicy", "resources");
            }
            this.resources = resources;
            return this;
        }
        public ApiTokenPolicy build() {
            final var _resultValue = new ApiTokenPolicy();
            _resultValue.effect = effect;
            _resultValue.id = id;
            _resultValue.permissionGroups = permissionGroups;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}
