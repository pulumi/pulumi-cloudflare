// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserOrganization {
    /**
     * @return Identifier
     * 
     */
    private @Nullable String id;
    /**
     * @return Organization name.
     * 
     */
    private @Nullable String name;
    /**
     * @return Access permissions for this User.
     * 
     */
    private @Nullable List<String> permissions;
    /**
     * @return List of roles that a user has within an organization.
     * 
     */
    private @Nullable List<String> roles;
    /**
     * @return Whether the user is a member of the organization or has an invitation pending.
     * Available values: &#34;member&#34;, &#34;invited&#34;.
     * 
     */
    private @Nullable String status;

    private UserOrganization() {}
    /**
     * @return Identifier
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Organization name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Access permissions for this User.
     * 
     */
    public List<String> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * @return List of roles that a user has within an organization.
     * 
     */
    public List<String> roles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * @return Whether the user is a member of the organization or has an invitation pending.
     * Available values: &#34;member&#34;, &#34;invited&#34;.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserOrganization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<String> permissions;
        private @Nullable List<String> roles;
        private @Nullable String status;
        public Builder() {}
        public Builder(UserOrganization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.roles = defaults.roles;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(@Nullable List<String> permissions) {

            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder roles(@Nullable List<String> roles) {

            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public UserOrganization build() {
            final var _resultValue = new UserOrganization();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.permissions = permissions;
            _resultValue.roles = roles;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
