// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountMembersResultPolicyPermissionGroup;
import com.pulumi.cloudflare.outputs.GetAccountMembersResultPolicyResourceGroup;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountMembersResultPolicy {
    /**
     * @return Allow or deny operations against the resources.
     * Available values: &#34;allow&#34;, &#34;deny&#34;.
     * 
     */
    private String access;
    /**
     * @return Policy identifier.
     * 
     */
    private String id;
    /**
     * @return A set of permission groups that are specified to the policy.
     * 
     */
    private List<GetAccountMembersResultPolicyPermissionGroup> permissionGroups;
    /**
     * @return A list of resource groups that the policy applies to.
     * 
     */
    private List<GetAccountMembersResultPolicyResourceGroup> resourceGroups;

    private GetAccountMembersResultPolicy() {}
    /**
     * @return Allow or deny operations against the resources.
     * Available values: &#34;allow&#34;, &#34;deny&#34;.
     * 
     */
    public String access() {
        return this.access;
    }
    /**
     * @return Policy identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A set of permission groups that are specified to the policy.
     * 
     */
    public List<GetAccountMembersResultPolicyPermissionGroup> permissionGroups() {
        return this.permissionGroups;
    }
    /**
     * @return A list of resource groups that the policy applies to.
     * 
     */
    public List<GetAccountMembersResultPolicyResourceGroup> resourceGroups() {
        return this.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountMembersResultPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String access;
        private String id;
        private List<GetAccountMembersResultPolicyPermissionGroup> permissionGroups;
        private List<GetAccountMembersResultPolicyResourceGroup> resourceGroups;
        public Builder() {}
        public Builder(GetAccountMembersResultPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.id = defaults.id;
    	      this.permissionGroups = defaults.permissionGroups;
    	      this.resourceGroups = defaults.resourceGroups;
        }

        @CustomType.Setter
        public Builder access(String access) {
            if (access == null) {
              throw new MissingRequiredPropertyException("GetAccountMembersResultPolicy", "access");
            }
            this.access = access;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountMembersResultPolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder permissionGroups(List<GetAccountMembersResultPolicyPermissionGroup> permissionGroups) {
            if (permissionGroups == null) {
              throw new MissingRequiredPropertyException("GetAccountMembersResultPolicy", "permissionGroups");
            }
            this.permissionGroups = permissionGroups;
            return this;
        }
        public Builder permissionGroups(GetAccountMembersResultPolicyPermissionGroup... permissionGroups) {
            return permissionGroups(List.of(permissionGroups));
        }
        @CustomType.Setter
        public Builder resourceGroups(List<GetAccountMembersResultPolicyResourceGroup> resourceGroups) {
            if (resourceGroups == null) {
              throw new MissingRequiredPropertyException("GetAccountMembersResultPolicy", "resourceGroups");
            }
            this.resourceGroups = resourceGroups;
            return this;
        }
        public Builder resourceGroups(GetAccountMembersResultPolicyResourceGroup... resourceGroups) {
            return resourceGroups(List.of(resourceGroups));
        }
        public GetAccountMembersResultPolicy build() {
            final var _resultValue = new GetAccountMembersResultPolicy();
            _resultValue.access = access;
            _resultValue.id = id;
            _resultValue.permissionGroups = permissionGroups;
            _resultValue.resourceGroups = resourceGroups;
            return _resultValue;
        }
    }
}
