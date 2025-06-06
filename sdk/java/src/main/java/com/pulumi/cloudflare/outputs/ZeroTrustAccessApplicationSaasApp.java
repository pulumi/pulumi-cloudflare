// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationSaasAppCustomAttribute;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationSaasAppCustomClaim;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationSaasAppRefreshTokenOptions;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessApplicationSaasApp {
    /**
     * @return The lifetime of the OIDC Access Token after creation. Valid units are m,h. Must be greater than or equal to 1m and less than or equal to 24h.
     * 
     */
    private @Nullable String accessTokenLifetime;
    /**
     * @return If client secret should be required on the token endpoint when authorization*code*with_pkce grant is used.
     * 
     */
    private @Nullable Boolean allowPkceWithoutClientSecret;
    /**
     * @return The URL where this applications tile redirects users
     * 
     */
    private @Nullable String appLauncherUrl;
    /**
     * @return Optional identifier indicating the authentication protocol used for the saas app. Required for OIDC. Default if unset is &#34;saml&#34;
     * Available values: &#34;saml&#34;, &#34;oidc&#34;.
     * 
     */
    private @Nullable String authType;
    /**
     * @return The application client id
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The application client secret, only returned on POST request.
     * 
     */
    private @Nullable String clientSecret;
    /**
     * @return The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    private @Nullable String consumerServiceUrl;
    private @Nullable String createdAt;
    private @Nullable List<ZeroTrustAccessApplicationSaasAppCustomAttribute> customAttributes;
    private @Nullable List<ZeroTrustAccessApplicationSaasAppCustomClaim> customClaims;
    /**
     * @return The URL that the user will be redirected to after a successful login for IDP initiated logins.
     * 
     */
    private @Nullable String defaultRelayState;
    /**
     * @return The OIDC flows supported by this application
     * 
     */
    private @Nullable List<String> grantTypes;
    /**
     * @return A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
     * 
     */
    private @Nullable String groupFilterRegex;
    private @Nullable ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions hybridAndImplicitOptions;
    /**
     * @return The unique identifier for your SaaS application.
     * 
     */
    private @Nullable String idpEntityId;
    /**
     * @return The format of the name identifier sent to the SaaS application.
     * Available values: &#34;id&#34;, &#34;email&#34;.
     * 
     */
    private @Nullable String nameIdFormat;
    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    private @Nullable String nameIdTransformJsonata;
    /**
     * @return The Access public certificate that will be used to verify your identity.
     * 
     */
    private @Nullable String publicKey;
    /**
     * @return The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
     * 
     */
    private @Nullable List<String> redirectUris;
    private @Nullable ZeroTrustAccessApplicationSaasAppRefreshTokenOptions refreshTokenOptions;
    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into attribute assertions in the SAML response. The expression can transform id, email, name, and groups values. It can also transform fields listed in the saml*attributes or oidc*fields of the identity provider used to authenticate. The output of this expression must be a JSON object.
     * 
     */
    private @Nullable String samlAttributeTransformJsonata;
    /**
     * @return Define the user information shared with access, &#34;offline_access&#34; scope will be automatically enabled if refresh tokens are enabled
     * 
     */
    private @Nullable List<String> scopes;
    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    private @Nullable String spEntityId;
    /**
     * @return The endpoint where your SaaS application will send login requests.
     * 
     */
    private @Nullable String ssoEndpoint;
    private @Nullable String updatedAt;

    private ZeroTrustAccessApplicationSaasApp() {}
    /**
     * @return The lifetime of the OIDC Access Token after creation. Valid units are m,h. Must be greater than or equal to 1m and less than or equal to 24h.
     * 
     */
    public Optional<String> accessTokenLifetime() {
        return Optional.ofNullable(this.accessTokenLifetime);
    }
    /**
     * @return If client secret should be required on the token endpoint when authorization*code*with_pkce grant is used.
     * 
     */
    public Optional<Boolean> allowPkceWithoutClientSecret() {
        return Optional.ofNullable(this.allowPkceWithoutClientSecret);
    }
    /**
     * @return The URL where this applications tile redirects users
     * 
     */
    public Optional<String> appLauncherUrl() {
        return Optional.ofNullable(this.appLauncherUrl);
    }
    /**
     * @return Optional identifier indicating the authentication protocol used for the saas app. Required for OIDC. Default if unset is &#34;saml&#34;
     * Available values: &#34;saml&#34;, &#34;oidc&#34;.
     * 
     */
    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }
    /**
     * @return The application client id
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The application client secret, only returned on POST request.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    public Optional<String> consumerServiceUrl() {
        return Optional.ofNullable(this.consumerServiceUrl);
    }
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public List<ZeroTrustAccessApplicationSaasAppCustomAttribute> customAttributes() {
        return this.customAttributes == null ? List.of() : this.customAttributes;
    }
    public List<ZeroTrustAccessApplicationSaasAppCustomClaim> customClaims() {
        return this.customClaims == null ? List.of() : this.customClaims;
    }
    /**
     * @return The URL that the user will be redirected to after a successful login for IDP initiated logins.
     * 
     */
    public Optional<String> defaultRelayState() {
        return Optional.ofNullable(this.defaultRelayState);
    }
    /**
     * @return The OIDC flows supported by this application
     * 
     */
    public List<String> grantTypes() {
        return this.grantTypes == null ? List.of() : this.grantTypes;
    }
    /**
     * @return A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
     * 
     */
    public Optional<String> groupFilterRegex() {
        return Optional.ofNullable(this.groupFilterRegex);
    }
    public Optional<ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions> hybridAndImplicitOptions() {
        return Optional.ofNullable(this.hybridAndImplicitOptions);
    }
    /**
     * @return The unique identifier for your SaaS application.
     * 
     */
    public Optional<String> idpEntityId() {
        return Optional.ofNullable(this.idpEntityId);
    }
    /**
     * @return The format of the name identifier sent to the SaaS application.
     * Available values: &#34;id&#34;, &#34;email&#34;.
     * 
     */
    public Optional<String> nameIdFormat() {
        return Optional.ofNullable(this.nameIdFormat);
    }
    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    public Optional<String> nameIdTransformJsonata() {
        return Optional.ofNullable(this.nameIdTransformJsonata);
    }
    /**
     * @return The Access public certificate that will be used to verify your identity.
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
     * 
     */
    public List<String> redirectUris() {
        return this.redirectUris == null ? List.of() : this.redirectUris;
    }
    public Optional<ZeroTrustAccessApplicationSaasAppRefreshTokenOptions> refreshTokenOptions() {
        return Optional.ofNullable(this.refreshTokenOptions);
    }
    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into attribute assertions in the SAML response. The expression can transform id, email, name, and groups values. It can also transform fields listed in the saml*attributes or oidc*fields of the identity provider used to authenticate. The output of this expression must be a JSON object.
     * 
     */
    public Optional<String> samlAttributeTransformJsonata() {
        return Optional.ofNullable(this.samlAttributeTransformJsonata);
    }
    /**
     * @return Define the user information shared with access, &#34;offline_access&#34; scope will be automatically enabled if refresh tokens are enabled
     * 
     */
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    public Optional<String> spEntityId() {
        return Optional.ofNullable(this.spEntityId);
    }
    /**
     * @return The endpoint where your SaaS application will send login requests.
     * 
     */
    public Optional<String> ssoEndpoint() {
        return Optional.ofNullable(this.ssoEndpoint);
    }
    public Optional<String> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessApplicationSaasApp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessTokenLifetime;
        private @Nullable Boolean allowPkceWithoutClientSecret;
        private @Nullable String appLauncherUrl;
        private @Nullable String authType;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String consumerServiceUrl;
        private @Nullable String createdAt;
        private @Nullable List<ZeroTrustAccessApplicationSaasAppCustomAttribute> customAttributes;
        private @Nullable List<ZeroTrustAccessApplicationSaasAppCustomClaim> customClaims;
        private @Nullable String defaultRelayState;
        private @Nullable List<String> grantTypes;
        private @Nullable String groupFilterRegex;
        private @Nullable ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions hybridAndImplicitOptions;
        private @Nullable String idpEntityId;
        private @Nullable String nameIdFormat;
        private @Nullable String nameIdTransformJsonata;
        private @Nullable String publicKey;
        private @Nullable List<String> redirectUris;
        private @Nullable ZeroTrustAccessApplicationSaasAppRefreshTokenOptions refreshTokenOptions;
        private @Nullable String samlAttributeTransformJsonata;
        private @Nullable List<String> scopes;
        private @Nullable String spEntityId;
        private @Nullable String ssoEndpoint;
        private @Nullable String updatedAt;
        public Builder() {}
        public Builder(ZeroTrustAccessApplicationSaasApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTokenLifetime = defaults.accessTokenLifetime;
    	      this.allowPkceWithoutClientSecret = defaults.allowPkceWithoutClientSecret;
    	      this.appLauncherUrl = defaults.appLauncherUrl;
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.consumerServiceUrl = defaults.consumerServiceUrl;
    	      this.createdAt = defaults.createdAt;
    	      this.customAttributes = defaults.customAttributes;
    	      this.customClaims = defaults.customClaims;
    	      this.defaultRelayState = defaults.defaultRelayState;
    	      this.grantTypes = defaults.grantTypes;
    	      this.groupFilterRegex = defaults.groupFilterRegex;
    	      this.hybridAndImplicitOptions = defaults.hybridAndImplicitOptions;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.nameIdFormat = defaults.nameIdFormat;
    	      this.nameIdTransformJsonata = defaults.nameIdTransformJsonata;
    	      this.publicKey = defaults.publicKey;
    	      this.redirectUris = defaults.redirectUris;
    	      this.refreshTokenOptions = defaults.refreshTokenOptions;
    	      this.samlAttributeTransformJsonata = defaults.samlAttributeTransformJsonata;
    	      this.scopes = defaults.scopes;
    	      this.spEntityId = defaults.spEntityId;
    	      this.ssoEndpoint = defaults.ssoEndpoint;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder accessTokenLifetime(@Nullable String accessTokenLifetime) {

            this.accessTokenLifetime = accessTokenLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder allowPkceWithoutClientSecret(@Nullable Boolean allowPkceWithoutClientSecret) {

            this.allowPkceWithoutClientSecret = allowPkceWithoutClientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder appLauncherUrl(@Nullable String appLauncherUrl) {

            this.appLauncherUrl = appLauncherUrl;
            return this;
        }
        @CustomType.Setter
        public Builder authType(@Nullable String authType) {

            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(@Nullable String clientSecret) {

            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder consumerServiceUrl(@Nullable String consumerServiceUrl) {

            this.consumerServiceUrl = consumerServiceUrl;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(@Nullable String createdAt) {

            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder customAttributes(@Nullable List<ZeroTrustAccessApplicationSaasAppCustomAttribute> customAttributes) {

            this.customAttributes = customAttributes;
            return this;
        }
        public Builder customAttributes(ZeroTrustAccessApplicationSaasAppCustomAttribute... customAttributes) {
            return customAttributes(List.of(customAttributes));
        }
        @CustomType.Setter
        public Builder customClaims(@Nullable List<ZeroTrustAccessApplicationSaasAppCustomClaim> customClaims) {

            this.customClaims = customClaims;
            return this;
        }
        public Builder customClaims(ZeroTrustAccessApplicationSaasAppCustomClaim... customClaims) {
            return customClaims(List.of(customClaims));
        }
        @CustomType.Setter
        public Builder defaultRelayState(@Nullable String defaultRelayState) {

            this.defaultRelayState = defaultRelayState;
            return this;
        }
        @CustomType.Setter
        public Builder grantTypes(@Nullable List<String> grantTypes) {

            this.grantTypes = grantTypes;
            return this;
        }
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }
        @CustomType.Setter
        public Builder groupFilterRegex(@Nullable String groupFilterRegex) {

            this.groupFilterRegex = groupFilterRegex;
            return this;
        }
        @CustomType.Setter
        public Builder hybridAndImplicitOptions(@Nullable ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions hybridAndImplicitOptions) {

            this.hybridAndImplicitOptions = hybridAndImplicitOptions;
            return this;
        }
        @CustomType.Setter
        public Builder idpEntityId(@Nullable String idpEntityId) {

            this.idpEntityId = idpEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder nameIdFormat(@Nullable String nameIdFormat) {

            this.nameIdFormat = nameIdFormat;
            return this;
        }
        @CustomType.Setter
        public Builder nameIdTransformJsonata(@Nullable String nameIdTransformJsonata) {

            this.nameIdTransformJsonata = nameIdTransformJsonata;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(@Nullable String publicKey) {

            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder redirectUris(@Nullable List<String> redirectUris) {

            this.redirectUris = redirectUris;
            return this;
        }
        public Builder redirectUris(String... redirectUris) {
            return redirectUris(List.of(redirectUris));
        }
        @CustomType.Setter
        public Builder refreshTokenOptions(@Nullable ZeroTrustAccessApplicationSaasAppRefreshTokenOptions refreshTokenOptions) {

            this.refreshTokenOptions = refreshTokenOptions;
            return this;
        }
        @CustomType.Setter
        public Builder samlAttributeTransformJsonata(@Nullable String samlAttributeTransformJsonata) {

            this.samlAttributeTransformJsonata = samlAttributeTransformJsonata;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(@Nullable List<String> scopes) {

            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder spEntityId(@Nullable String spEntityId) {

            this.spEntityId = spEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder ssoEndpoint(@Nullable String ssoEndpoint) {

            this.ssoEndpoint = ssoEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(@Nullable String updatedAt) {

            this.updatedAt = updatedAt;
            return this;
        }
        public ZeroTrustAccessApplicationSaasApp build() {
            final var _resultValue = new ZeroTrustAccessApplicationSaasApp();
            _resultValue.accessTokenLifetime = accessTokenLifetime;
            _resultValue.allowPkceWithoutClientSecret = allowPkceWithoutClientSecret;
            _resultValue.appLauncherUrl = appLauncherUrl;
            _resultValue.authType = authType;
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.consumerServiceUrl = consumerServiceUrl;
            _resultValue.createdAt = createdAt;
            _resultValue.customAttributes = customAttributes;
            _resultValue.customClaims = customClaims;
            _resultValue.defaultRelayState = defaultRelayState;
            _resultValue.grantTypes = grantTypes;
            _resultValue.groupFilterRegex = groupFilterRegex;
            _resultValue.hybridAndImplicitOptions = hybridAndImplicitOptions;
            _resultValue.idpEntityId = idpEntityId;
            _resultValue.nameIdFormat = nameIdFormat;
            _resultValue.nameIdTransformJsonata = nameIdTransformJsonata;
            _resultValue.publicKey = publicKey;
            _resultValue.redirectUris = redirectUris;
            _resultValue.refreshTokenOptions = refreshTokenOptions;
            _resultValue.samlAttributeTransformJsonata = samlAttributeTransformJsonata;
            _resultValue.scopes = scopes;
            _resultValue.spEntityId = spEntityId;
            _resultValue.ssoEndpoint = ssoEndpoint;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
