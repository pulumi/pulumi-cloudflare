// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationScimConfigAuthentication;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationScimConfigMapping;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessApplicationScimConfig {
    /**
     * @return Attributes for configuring HTTP Basic, OAuth Bearer token, or OAuth 2 authentication schemes for SCIM provisioning to an application.
     * 
     */
    private @Nullable ZeroTrustAccessApplicationScimConfigAuthentication authentication;
    /**
     * @return If false, propagates DELETE requests to the target application for SCIM resources. If true, sets &#39;active&#39; to false on the SCIM resource. Note: Some targets do not support DELETE operations.
     * 
     */
    private @Nullable Boolean deactivateOnDelete;
    /**
     * @return Whether SCIM provisioning is turned on for this application.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The UID of the IdP to use as the source for SCIM resources to provision to this application.
     * 
     */
    private String idpUid;
    /**
     * @return A list of mappings to apply to SCIM resources before provisioning them in this application. These can transform or filter the resources to be provisioned.
     * 
     */
    private @Nullable List<ZeroTrustAccessApplicationScimConfigMapping> mappings;
    /**
     * @return The base URI for the application&#39;s SCIM-compatible API.
     * 
     */
    private String remoteUri;

    private ZeroTrustAccessApplicationScimConfig() {}
    /**
     * @return Attributes for configuring HTTP Basic, OAuth Bearer token, or OAuth 2 authentication schemes for SCIM provisioning to an application.
     * 
     */
    public Optional<ZeroTrustAccessApplicationScimConfigAuthentication> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * @return If false, propagates DELETE requests to the target application for SCIM resources. If true, sets &#39;active&#39; to false on the SCIM resource. Note: Some targets do not support DELETE operations.
     * 
     */
    public Optional<Boolean> deactivateOnDelete() {
        return Optional.ofNullable(this.deactivateOnDelete);
    }
    /**
     * @return Whether SCIM provisioning is turned on for this application.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The UID of the IdP to use as the source for SCIM resources to provision to this application.
     * 
     */
    public String idpUid() {
        return this.idpUid;
    }
    /**
     * @return A list of mappings to apply to SCIM resources before provisioning them in this application. These can transform or filter the resources to be provisioned.
     * 
     */
    public List<ZeroTrustAccessApplicationScimConfigMapping> mappings() {
        return this.mappings == null ? List.of() : this.mappings;
    }
    /**
     * @return The base URI for the application&#39;s SCIM-compatible API.
     * 
     */
    public String remoteUri() {
        return this.remoteUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessApplicationScimConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ZeroTrustAccessApplicationScimConfigAuthentication authentication;
        private @Nullable Boolean deactivateOnDelete;
        private @Nullable Boolean enabled;
        private String idpUid;
        private @Nullable List<ZeroTrustAccessApplicationScimConfigMapping> mappings;
        private String remoteUri;
        public Builder() {}
        public Builder(ZeroTrustAccessApplicationScimConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.deactivateOnDelete = defaults.deactivateOnDelete;
    	      this.enabled = defaults.enabled;
    	      this.idpUid = defaults.idpUid;
    	      this.mappings = defaults.mappings;
    	      this.remoteUri = defaults.remoteUri;
        }

        @CustomType.Setter
        public Builder authentication(@Nullable ZeroTrustAccessApplicationScimConfigAuthentication authentication) {

            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder deactivateOnDelete(@Nullable Boolean deactivateOnDelete) {

            this.deactivateOnDelete = deactivateOnDelete;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder idpUid(String idpUid) {
            if (idpUid == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationScimConfig", "idpUid");
            }
            this.idpUid = idpUid;
            return this;
        }
        @CustomType.Setter
        public Builder mappings(@Nullable List<ZeroTrustAccessApplicationScimConfigMapping> mappings) {

            this.mappings = mappings;
            return this;
        }
        public Builder mappings(ZeroTrustAccessApplicationScimConfigMapping... mappings) {
            return mappings(List.of(mappings));
        }
        @CustomType.Setter
        public Builder remoteUri(String remoteUri) {
            if (remoteUri == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationScimConfig", "remoteUri");
            }
            this.remoteUri = remoteUri;
            return this;
        }
        public ZeroTrustAccessApplicationScimConfig build() {
            final var _resultValue = new ZeroTrustAccessApplicationScimConfig();
            _resultValue.authentication = authentication;
            _resultValue.deactivateOnDelete = deactivateOnDelete;
            _resultValue.enabled = enabled;
            _resultValue.idpUid = idpUid;
            _resultValue.mappings = mappings;
            _resultValue.remoteUri = remoteUri;
            return _resultValue;
        }
    }
}