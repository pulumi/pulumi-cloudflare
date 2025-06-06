// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.AccountMemberPolicyPermissionGroup;
import com.pulumi.cloudflare.outputs.AccountMemberPolicyResourceGroup;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountMemberPolicy {
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
    private @Nullable String id;
    /**
     * @return A set of permission groups that are specified to the policy.
     * 
     */
    private List<AccountMemberPolicyPermissionGroup> permissionGroups;
    /**
     * @return A list of resource groups that the policy applies to.
     * 
     */
    private List<AccountMemberPolicyResourceGroup> resourceGroups;

    private AccountMemberPolicy() {}
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
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A set of permission groups that are specified to the policy.
     * 
     */
    public List<AccountMemberPolicyPermissionGroup> permissionGroups() {
        return this.permissionGroups;
    }
    /**
     * @return A list of resource groups that the policy applies to.
     * 
     */
    public List<AccountMemberPolicyResourceGroup> resourceGroups() {
        return this.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountMemberPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String access;
        private @Nullable String id;
        private List<AccountMemberPolicyPermissionGroup> permissionGroups;
        private List<AccountMemberPolicyResourceGroup> resourceGroups;
        public Builder() {}
        public Builder(AccountMemberPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.id = defaults.id;
    	      this.permissionGroups = defaults.permissionGroups;
    	      this.resourceGroups = defaults.resourceGroups;
        }

        @CustomType.Setter
        public Builder access(String access) {
            if (access == null) {
              throw new MissingRequiredPropertyException("AccountMemberPolicy", "access");
            }
            this.access = access;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder permissionGroups(List<AccountMemberPolicyPermissionGroup> permissionGroups) {
            if (permissionGroups == null) {
              throw new MissingRequiredPropertyException("AccountMemberPolicy", "permissionGroups");
            }
            this.permissionGroups = permissionGroups;
            return this;
        }
        public Builder permissionGroups(AccountMemberPolicyPermissionGroup... permissionGroups) {
            return permissionGroups(List.of(permissionGroups));
        }
        @CustomType.Setter
        public Builder resourceGroups(List<AccountMemberPolicyResourceGroup> resourceGroups) {
            if (resourceGroups == null) {
              throw new MissingRequiredPropertyException("AccountMemberPolicy", "resourceGroups");
            }
            this.resourceGroups = resourceGroups;
            return this;
        }
        public Builder resourceGroups(AccountMemberPolicyResourceGroup... resourceGroups) {
            return resourceGroups(List.of(resourceGroups));
        }
        public AccountMemberPolicy build() {
            final var _resultValue = new AccountMemberPolicy();
            _resultValue.access = access;
            _resultValue.id = id;
            _resultValue.permissionGroups = permissionGroups;
            _resultValue.resourceGroups = resourceGroups;
            return _resultValue;
        }
    }
}
