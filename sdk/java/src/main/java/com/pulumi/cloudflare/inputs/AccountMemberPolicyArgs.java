// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccountMemberPolicyPermissionGroupArgs;
import com.pulumi.cloudflare.inputs.AccountMemberPolicyResourceGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountMemberPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountMemberPolicyArgs Empty = new AccountMemberPolicyArgs();

    /**
     * Allow or deny operations against the resources.
     * Available values: &#34;allow&#34;, &#34;deny&#34;.
     * 
     */
    @Import(name="access", required=true)
    private Output<String> access;

    /**
     * @return Allow or deny operations against the resources.
     * Available values: &#34;allow&#34;, &#34;deny&#34;.
     * 
     */
    public Output<String> access() {
        return this.access;
    }

    /**
     * Policy identifier.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Policy identifier.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A set of permission groups that are specified to the policy.
     * 
     */
    @Import(name="permissionGroups", required=true)
    private Output<List<AccountMemberPolicyPermissionGroupArgs>> permissionGroups;

    /**
     * @return A set of permission groups that are specified to the policy.
     * 
     */
    public Output<List<AccountMemberPolicyPermissionGroupArgs>> permissionGroups() {
        return this.permissionGroups;
    }

    /**
     * A list of resource groups that the policy applies to.
     * 
     */
    @Import(name="resourceGroups", required=true)
    private Output<List<AccountMemberPolicyResourceGroupArgs>> resourceGroups;

    /**
     * @return A list of resource groups that the policy applies to.
     * 
     */
    public Output<List<AccountMemberPolicyResourceGroupArgs>> resourceGroups() {
        return this.resourceGroups;
    }

    private AccountMemberPolicyArgs() {}

    private AccountMemberPolicyArgs(AccountMemberPolicyArgs $) {
        this.access = $.access;
        this.id = $.id;
        this.permissionGroups = $.permissionGroups;
        this.resourceGroups = $.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountMemberPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountMemberPolicyArgs $;

        public Builder() {
            $ = new AccountMemberPolicyArgs();
        }

        public Builder(AccountMemberPolicyArgs defaults) {
            $ = new AccountMemberPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access Allow or deny operations against the resources.
         * Available values: &#34;allow&#34;, &#34;deny&#34;.
         * 
         * @return builder
         * 
         */
        public Builder access(Output<String> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access Allow or deny operations against the resources.
         * Available values: &#34;allow&#34;, &#34;deny&#34;.
         * 
         * @return builder
         * 
         */
        public Builder access(String access) {
            return access(Output.of(access));
        }

        /**
         * @param id Policy identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Policy identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param permissionGroups A set of permission groups that are specified to the policy.
         * 
         * @return builder
         * 
         */
        public Builder permissionGroups(Output<List<AccountMemberPolicyPermissionGroupArgs>> permissionGroups) {
            $.permissionGroups = permissionGroups;
            return this;
        }

        /**
         * @param permissionGroups A set of permission groups that are specified to the policy.
         * 
         * @return builder
         * 
         */
        public Builder permissionGroups(List<AccountMemberPolicyPermissionGroupArgs> permissionGroups) {
            return permissionGroups(Output.of(permissionGroups));
        }

        /**
         * @param permissionGroups A set of permission groups that are specified to the policy.
         * 
         * @return builder
         * 
         */
        public Builder permissionGroups(AccountMemberPolicyPermissionGroupArgs... permissionGroups) {
            return permissionGroups(List.of(permissionGroups));
        }

        /**
         * @param resourceGroups A list of resource groups that the policy applies to.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(Output<List<AccountMemberPolicyResourceGroupArgs>> resourceGroups) {
            $.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * @param resourceGroups A list of resource groups that the policy applies to.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(List<AccountMemberPolicyResourceGroupArgs> resourceGroups) {
            return resourceGroups(Output.of(resourceGroups));
        }

        /**
         * @param resourceGroups A list of resource groups that the policy applies to.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(AccountMemberPolicyResourceGroupArgs... resourceGroups) {
            return resourceGroups(List.of(resourceGroups));
        }

        public AccountMemberPolicyArgs build() {
            if ($.access == null) {
                throw new MissingRequiredPropertyException("AccountMemberPolicyArgs", "access");
            }
            if ($.permissionGroups == null) {
                throw new MissingRequiredPropertyException("AccountMemberPolicyArgs", "permissionGroups");
            }
            if ($.resourceGroups == null) {
                throw new MissingRequiredPropertyException("AccountMemberPolicyArgs", "resourceGroups");
            }
            return $;
        }
    }

}
