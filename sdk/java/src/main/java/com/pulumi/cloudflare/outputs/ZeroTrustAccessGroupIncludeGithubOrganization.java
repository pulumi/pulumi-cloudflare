// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessGroupIncludeGithubOrganization {
    /**
     * @return The ID of your Github identity provider.
     * 
     */
    private String identityProviderId;
    /**
     * @return The name of the organization.
     * 
     */
    private String name;
    /**
     * @return The name of the team
     * 
     */
    private @Nullable String team;

    private ZeroTrustAccessGroupIncludeGithubOrganization() {}
    /**
     * @return The ID of your Github identity provider.
     * 
     */
    public String identityProviderId() {
        return this.identityProviderId;
    }
    /**
     * @return The name of the organization.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the team
     * 
     */
    public Optional<String> team() {
        return Optional.ofNullable(this.team);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessGroupIncludeGithubOrganization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identityProviderId;
        private String name;
        private @Nullable String team;
        public Builder() {}
        public Builder(ZeroTrustAccessGroupIncludeGithubOrganization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProviderId = defaults.identityProviderId;
    	      this.name = defaults.name;
    	      this.team = defaults.team;
        }

        @CustomType.Setter
        public Builder identityProviderId(String identityProviderId) {
            if (identityProviderId == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessGroupIncludeGithubOrganization", "identityProviderId");
            }
            this.identityProviderId = identityProviderId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessGroupIncludeGithubOrganization", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder team(@Nullable String team) {

            this.team = team;
            return this;
        }
        public ZeroTrustAccessGroupIncludeGithubOrganization build() {
            final var _resultValue = new ZeroTrustAccessGroupIncludeGithubOrganization();
            _resultValue.identityProviderId = identityProviderId;
            _resultValue.name = name;
            _resultValue.team = team;
            return _resultValue;
        }
    }
}
