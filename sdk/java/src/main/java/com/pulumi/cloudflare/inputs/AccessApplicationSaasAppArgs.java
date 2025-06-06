// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeArgs;
import com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimArgs;
import com.pulumi.cloudflare.inputs.AccessApplicationSaasAppHybridAndImplicitOptionsArgs;
import com.pulumi.cloudflare.inputs.AccessApplicationSaasAppRefreshTokenOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApplicationSaasAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationSaasAppArgs Empty = new AccessApplicationSaasAppArgs();

    /**
     * The lifetime of the OIDC Access Token after creation. Valid units are m,h. Must be greater than or equal to 1m and less than or equal to 24h.
     * 
     */
    @Import(name="accessTokenLifetime")
    private @Nullable Output<String> accessTokenLifetime;

    /**
     * @return The lifetime of the OIDC Access Token after creation. Valid units are m,h. Must be greater than or equal to 1m and less than or equal to 24h.
     * 
     */
    public Optional<Output<String>> accessTokenLifetime() {
        return Optional.ofNullable(this.accessTokenLifetime);
    }

    /**
     * If client secret should be required on the token endpoint when authorization*code*with_pkce grant is used.
     * 
     */
    @Import(name="allowPkceWithoutClientSecret")
    private @Nullable Output<Boolean> allowPkceWithoutClientSecret;

    /**
     * @return If client secret should be required on the token endpoint when authorization*code*with_pkce grant is used.
     * 
     */
    public Optional<Output<Boolean>> allowPkceWithoutClientSecret() {
        return Optional.ofNullable(this.allowPkceWithoutClientSecret);
    }

    /**
     * The URL where this applications tile redirects users
     * 
     */
    @Import(name="appLauncherUrl")
    private @Nullable Output<String> appLauncherUrl;

    /**
     * @return The URL where this applications tile redirects users
     * 
     */
    public Optional<Output<String>> appLauncherUrl() {
        return Optional.ofNullable(this.appLauncherUrl);
    }

    /**
     * Optional identifier indicating the authentication protocol used for the saas app. Required for OIDC. Default if unset is &#34;saml&#34;
     * Available values: &#34;saml&#34;, &#34;oidc&#34;.
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return Optional identifier indicating the authentication protocol used for the saas app. Required for OIDC. Default if unset is &#34;saml&#34;
     * Available values: &#34;saml&#34;, &#34;oidc&#34;.
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * The application client id
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The application client id
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The application client secret, only returned on POST request.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The application client secret, only returned on POST request.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    @Import(name="consumerServiceUrl")
    private @Nullable Output<String> consumerServiceUrl;

    /**
     * @return The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    public Optional<Output<String>> consumerServiceUrl() {
        return Optional.ofNullable(this.consumerServiceUrl);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="customAttributes")
    private @Nullable Output<List<AccessApplicationSaasAppCustomAttributeArgs>> customAttributes;

    public Optional<Output<List<AccessApplicationSaasAppCustomAttributeArgs>>> customAttributes() {
        return Optional.ofNullable(this.customAttributes);
    }

    @Import(name="customClaims")
    private @Nullable Output<List<AccessApplicationSaasAppCustomClaimArgs>> customClaims;

    public Optional<Output<List<AccessApplicationSaasAppCustomClaimArgs>>> customClaims() {
        return Optional.ofNullable(this.customClaims);
    }

    /**
     * The URL that the user will be redirected to after a successful login for IDP initiated logins.
     * 
     */
    @Import(name="defaultRelayState")
    private @Nullable Output<String> defaultRelayState;

    /**
     * @return The URL that the user will be redirected to after a successful login for IDP initiated logins.
     * 
     */
    public Optional<Output<String>> defaultRelayState() {
        return Optional.ofNullable(this.defaultRelayState);
    }

    /**
     * The OIDC flows supported by this application
     * 
     */
    @Import(name="grantTypes")
    private @Nullable Output<List<String>> grantTypes;

    /**
     * @return The OIDC flows supported by this application
     * 
     */
    public Optional<Output<List<String>>> grantTypes() {
        return Optional.ofNullable(this.grantTypes);
    }

    /**
     * A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
     * 
     */
    @Import(name="groupFilterRegex")
    private @Nullable Output<String> groupFilterRegex;

    /**
     * @return A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
     * 
     */
    public Optional<Output<String>> groupFilterRegex() {
        return Optional.ofNullable(this.groupFilterRegex);
    }

    @Import(name="hybridAndImplicitOptions")
    private @Nullable Output<AccessApplicationSaasAppHybridAndImplicitOptionsArgs> hybridAndImplicitOptions;

    public Optional<Output<AccessApplicationSaasAppHybridAndImplicitOptionsArgs>> hybridAndImplicitOptions() {
        return Optional.ofNullable(this.hybridAndImplicitOptions);
    }

    /**
     * The unique identifier for your SaaS application.
     * 
     */
    @Import(name="idpEntityId")
    private @Nullable Output<String> idpEntityId;

    /**
     * @return The unique identifier for your SaaS application.
     * 
     */
    public Optional<Output<String>> idpEntityId() {
        return Optional.ofNullable(this.idpEntityId);
    }

    /**
     * The format of the name identifier sent to the SaaS application.
     * Available values: &#34;id&#34;, &#34;email&#34;.
     * 
     */
    @Import(name="nameIdFormat")
    private @Nullable Output<String> nameIdFormat;

    /**
     * @return The format of the name identifier sent to the SaaS application.
     * Available values: &#34;id&#34;, &#34;email&#34;.
     * 
     */
    public Optional<Output<String>> nameIdFormat() {
        return Optional.ofNullable(this.nameIdFormat);
    }

    /**
     * A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    @Import(name="nameIdTransformJsonata")
    private @Nullable Output<String> nameIdTransformJsonata;

    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    public Optional<Output<String>> nameIdTransformJsonata() {
        return Optional.ofNullable(this.nameIdTransformJsonata);
    }

    /**
     * The Access public certificate that will be used to verify your identity.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The Access public certificate that will be used to verify your identity.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
     * 
     */
    @Import(name="redirectUris")
    private @Nullable Output<List<String>> redirectUris;

    /**
     * @return The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
     * 
     */
    public Optional<Output<List<String>>> redirectUris() {
        return Optional.ofNullable(this.redirectUris);
    }

    @Import(name="refreshTokenOptions")
    private @Nullable Output<AccessApplicationSaasAppRefreshTokenOptionsArgs> refreshTokenOptions;

    public Optional<Output<AccessApplicationSaasAppRefreshTokenOptionsArgs>> refreshTokenOptions() {
        return Optional.ofNullable(this.refreshTokenOptions);
    }

    /**
     * A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into attribute assertions in the SAML response. The expression can transform id, email, name, and groups values. It can also transform fields listed in the saml*attributes or oidc*fields of the identity provider used to authenticate. The output of this expression must be a JSON object.
     * 
     */
    @Import(name="samlAttributeTransformJsonata")
    private @Nullable Output<String> samlAttributeTransformJsonata;

    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into attribute assertions in the SAML response. The expression can transform id, email, name, and groups values. It can also transform fields listed in the saml*attributes or oidc*fields of the identity provider used to authenticate. The output of this expression must be a JSON object.
     * 
     */
    public Optional<Output<String>> samlAttributeTransformJsonata() {
        return Optional.ofNullable(this.samlAttributeTransformJsonata);
    }

    /**
     * Define the user information shared with access, &#34;offline_access&#34; scope will be automatically enabled if refresh tokens are enabled
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return Define the user information shared with access, &#34;offline_access&#34; scope will be automatically enabled if refresh tokens are enabled
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * A globally unique name for an identity or service provider.
     * 
     */
    @Import(name="spEntityId")
    private @Nullable Output<String> spEntityId;

    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    public Optional<Output<String>> spEntityId() {
        return Optional.ofNullable(this.spEntityId);
    }

    /**
     * The endpoint where your SaaS application will send login requests.
     * 
     */
    @Import(name="ssoEndpoint")
    private @Nullable Output<String> ssoEndpoint;

    /**
     * @return The endpoint where your SaaS application will send login requests.
     * 
     */
    public Optional<Output<String>> ssoEndpoint() {
        return Optional.ofNullable(this.ssoEndpoint);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private AccessApplicationSaasAppArgs() {}

    private AccessApplicationSaasAppArgs(AccessApplicationSaasAppArgs $) {
        this.accessTokenLifetime = $.accessTokenLifetime;
        this.allowPkceWithoutClientSecret = $.allowPkceWithoutClientSecret;
        this.appLauncherUrl = $.appLauncherUrl;
        this.authType = $.authType;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.consumerServiceUrl = $.consumerServiceUrl;
        this.createdAt = $.createdAt;
        this.customAttributes = $.customAttributes;
        this.customClaims = $.customClaims;
        this.defaultRelayState = $.defaultRelayState;
        this.grantTypes = $.grantTypes;
        this.groupFilterRegex = $.groupFilterRegex;
        this.hybridAndImplicitOptions = $.hybridAndImplicitOptions;
        this.idpEntityId = $.idpEntityId;
        this.nameIdFormat = $.nameIdFormat;
        this.nameIdTransformJsonata = $.nameIdTransformJsonata;
        this.publicKey = $.publicKey;
        this.redirectUris = $.redirectUris;
        this.refreshTokenOptions = $.refreshTokenOptions;
        this.samlAttributeTransformJsonata = $.samlAttributeTransformJsonata;
        this.scopes = $.scopes;
        this.spEntityId = $.spEntityId;
        this.ssoEndpoint = $.ssoEndpoint;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationSaasAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationSaasAppArgs $;

        public Builder() {
            $ = new AccessApplicationSaasAppArgs();
        }

        public Builder(AccessApplicationSaasAppArgs defaults) {
            $ = new AccessApplicationSaasAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessTokenLifetime The lifetime of the OIDC Access Token after creation. Valid units are m,h. Must be greater than or equal to 1m and less than or equal to 24h.
         * 
         * @return builder
         * 
         */
        public Builder accessTokenLifetime(@Nullable Output<String> accessTokenLifetime) {
            $.accessTokenLifetime = accessTokenLifetime;
            return this;
        }

        /**
         * @param accessTokenLifetime The lifetime of the OIDC Access Token after creation. Valid units are m,h. Must be greater than or equal to 1m and less than or equal to 24h.
         * 
         * @return builder
         * 
         */
        public Builder accessTokenLifetime(String accessTokenLifetime) {
            return accessTokenLifetime(Output.of(accessTokenLifetime));
        }

        /**
         * @param allowPkceWithoutClientSecret If client secret should be required on the token endpoint when authorization*code*with_pkce grant is used.
         * 
         * @return builder
         * 
         */
        public Builder allowPkceWithoutClientSecret(@Nullable Output<Boolean> allowPkceWithoutClientSecret) {
            $.allowPkceWithoutClientSecret = allowPkceWithoutClientSecret;
            return this;
        }

        /**
         * @param allowPkceWithoutClientSecret If client secret should be required on the token endpoint when authorization*code*with_pkce grant is used.
         * 
         * @return builder
         * 
         */
        public Builder allowPkceWithoutClientSecret(Boolean allowPkceWithoutClientSecret) {
            return allowPkceWithoutClientSecret(Output.of(allowPkceWithoutClientSecret));
        }

        /**
         * @param appLauncherUrl The URL where this applications tile redirects users
         * 
         * @return builder
         * 
         */
        public Builder appLauncherUrl(@Nullable Output<String> appLauncherUrl) {
            $.appLauncherUrl = appLauncherUrl;
            return this;
        }

        /**
         * @param appLauncherUrl The URL where this applications tile redirects users
         * 
         * @return builder
         * 
         */
        public Builder appLauncherUrl(String appLauncherUrl) {
            return appLauncherUrl(Output.of(appLauncherUrl));
        }

        /**
         * @param authType Optional identifier indicating the authentication protocol used for the saas app. Required for OIDC. Default if unset is &#34;saml&#34;
         * Available values: &#34;saml&#34;, &#34;oidc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType Optional identifier indicating the authentication protocol used for the saas app. Required for OIDC. Default if unset is &#34;saml&#34;
         * Available values: &#34;saml&#34;, &#34;oidc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param clientId The application client id
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The application client id
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The application client secret, only returned on POST request.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The application client secret, only returned on POST request.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param consumerServiceUrl The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
         * 
         * @return builder
         * 
         */
        public Builder consumerServiceUrl(@Nullable Output<String> consumerServiceUrl) {
            $.consumerServiceUrl = consumerServiceUrl;
            return this;
        }

        /**
         * @param consumerServiceUrl The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
         * 
         * @return builder
         * 
         */
        public Builder consumerServiceUrl(String consumerServiceUrl) {
            return consumerServiceUrl(Output.of(consumerServiceUrl));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder customAttributes(@Nullable Output<List<AccessApplicationSaasAppCustomAttributeArgs>> customAttributes) {
            $.customAttributes = customAttributes;
            return this;
        }

        public Builder customAttributes(List<AccessApplicationSaasAppCustomAttributeArgs> customAttributes) {
            return customAttributes(Output.of(customAttributes));
        }

        public Builder customAttributes(AccessApplicationSaasAppCustomAttributeArgs... customAttributes) {
            return customAttributes(List.of(customAttributes));
        }

        public Builder customClaims(@Nullable Output<List<AccessApplicationSaasAppCustomClaimArgs>> customClaims) {
            $.customClaims = customClaims;
            return this;
        }

        public Builder customClaims(List<AccessApplicationSaasAppCustomClaimArgs> customClaims) {
            return customClaims(Output.of(customClaims));
        }

        public Builder customClaims(AccessApplicationSaasAppCustomClaimArgs... customClaims) {
            return customClaims(List.of(customClaims));
        }

        /**
         * @param defaultRelayState The URL that the user will be redirected to after a successful login for IDP initiated logins.
         * 
         * @return builder
         * 
         */
        public Builder defaultRelayState(@Nullable Output<String> defaultRelayState) {
            $.defaultRelayState = defaultRelayState;
            return this;
        }

        /**
         * @param defaultRelayState The URL that the user will be redirected to after a successful login for IDP initiated logins.
         * 
         * @return builder
         * 
         */
        public Builder defaultRelayState(String defaultRelayState) {
            return defaultRelayState(Output.of(defaultRelayState));
        }

        /**
         * @param grantTypes The OIDC flows supported by this application
         * 
         * @return builder
         * 
         */
        public Builder grantTypes(@Nullable Output<List<String>> grantTypes) {
            $.grantTypes = grantTypes;
            return this;
        }

        /**
         * @param grantTypes The OIDC flows supported by this application
         * 
         * @return builder
         * 
         */
        public Builder grantTypes(List<String> grantTypes) {
            return grantTypes(Output.of(grantTypes));
        }

        /**
         * @param grantTypes The OIDC flows supported by this application
         * 
         * @return builder
         * 
         */
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }

        /**
         * @param groupFilterRegex A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
         * 
         * @return builder
         * 
         */
        public Builder groupFilterRegex(@Nullable Output<String> groupFilterRegex) {
            $.groupFilterRegex = groupFilterRegex;
            return this;
        }

        /**
         * @param groupFilterRegex A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
         * 
         * @return builder
         * 
         */
        public Builder groupFilterRegex(String groupFilterRegex) {
            return groupFilterRegex(Output.of(groupFilterRegex));
        }

        public Builder hybridAndImplicitOptions(@Nullable Output<AccessApplicationSaasAppHybridAndImplicitOptionsArgs> hybridAndImplicitOptions) {
            $.hybridAndImplicitOptions = hybridAndImplicitOptions;
            return this;
        }

        public Builder hybridAndImplicitOptions(AccessApplicationSaasAppHybridAndImplicitOptionsArgs hybridAndImplicitOptions) {
            return hybridAndImplicitOptions(Output.of(hybridAndImplicitOptions));
        }

        /**
         * @param idpEntityId The unique identifier for your SaaS application.
         * 
         * @return builder
         * 
         */
        public Builder idpEntityId(@Nullable Output<String> idpEntityId) {
            $.idpEntityId = idpEntityId;
            return this;
        }

        /**
         * @param idpEntityId The unique identifier for your SaaS application.
         * 
         * @return builder
         * 
         */
        public Builder idpEntityId(String idpEntityId) {
            return idpEntityId(Output.of(idpEntityId));
        }

        /**
         * @param nameIdFormat The format of the name identifier sent to the SaaS application.
         * Available values: &#34;id&#34;, &#34;email&#34;.
         * 
         * @return builder
         * 
         */
        public Builder nameIdFormat(@Nullable Output<String> nameIdFormat) {
            $.nameIdFormat = nameIdFormat;
            return this;
        }

        /**
         * @param nameIdFormat The format of the name identifier sent to the SaaS application.
         * Available values: &#34;id&#34;, &#34;email&#34;.
         * 
         * @return builder
         * 
         */
        public Builder nameIdFormat(String nameIdFormat) {
            return nameIdFormat(Output.of(nameIdFormat));
        }

        /**
         * @param nameIdTransformJsonata A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
         * 
         * @return builder
         * 
         */
        public Builder nameIdTransformJsonata(@Nullable Output<String> nameIdTransformJsonata) {
            $.nameIdTransformJsonata = nameIdTransformJsonata;
            return this;
        }

        /**
         * @param nameIdTransformJsonata A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
         * 
         * @return builder
         * 
         */
        public Builder nameIdTransformJsonata(String nameIdTransformJsonata) {
            return nameIdTransformJsonata(Output.of(nameIdTransformJsonata));
        }

        /**
         * @param publicKey The Access public certificate that will be used to verify your identity.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The Access public certificate that will be used to verify your identity.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param redirectUris The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
         * 
         * @return builder
         * 
         */
        public Builder redirectUris(@Nullable Output<List<String>> redirectUris) {
            $.redirectUris = redirectUris;
            return this;
        }

        /**
         * @param redirectUris The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
         * 
         * @return builder
         * 
         */
        public Builder redirectUris(List<String> redirectUris) {
            return redirectUris(Output.of(redirectUris));
        }

        /**
         * @param redirectUris The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
         * 
         * @return builder
         * 
         */
        public Builder redirectUris(String... redirectUris) {
            return redirectUris(List.of(redirectUris));
        }

        public Builder refreshTokenOptions(@Nullable Output<AccessApplicationSaasAppRefreshTokenOptionsArgs> refreshTokenOptions) {
            $.refreshTokenOptions = refreshTokenOptions;
            return this;
        }

        public Builder refreshTokenOptions(AccessApplicationSaasAppRefreshTokenOptionsArgs refreshTokenOptions) {
            return refreshTokenOptions(Output.of(refreshTokenOptions));
        }

        /**
         * @param samlAttributeTransformJsonata A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into attribute assertions in the SAML response. The expression can transform id, email, name, and groups values. It can also transform fields listed in the saml*attributes or oidc*fields of the identity provider used to authenticate. The output of this expression must be a JSON object.
         * 
         * @return builder
         * 
         */
        public Builder samlAttributeTransformJsonata(@Nullable Output<String> samlAttributeTransformJsonata) {
            $.samlAttributeTransformJsonata = samlAttributeTransformJsonata;
            return this;
        }

        /**
         * @param samlAttributeTransformJsonata A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into attribute assertions in the SAML response. The expression can transform id, email, name, and groups values. It can also transform fields listed in the saml*attributes or oidc*fields of the identity provider used to authenticate. The output of this expression must be a JSON object.
         * 
         * @return builder
         * 
         */
        public Builder samlAttributeTransformJsonata(String samlAttributeTransformJsonata) {
            return samlAttributeTransformJsonata(Output.of(samlAttributeTransformJsonata));
        }

        /**
         * @param scopes Define the user information shared with access, &#34;offline_access&#34; scope will be automatically enabled if refresh tokens are enabled
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Define the user information shared with access, &#34;offline_access&#34; scope will be automatically enabled if refresh tokens are enabled
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Define the user information shared with access, &#34;offline_access&#34; scope will be automatically enabled if refresh tokens are enabled
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param spEntityId A globally unique name for an identity or service provider.
         * 
         * @return builder
         * 
         */
        public Builder spEntityId(@Nullable Output<String> spEntityId) {
            $.spEntityId = spEntityId;
            return this;
        }

        /**
         * @param spEntityId A globally unique name for an identity or service provider.
         * 
         * @return builder
         * 
         */
        public Builder spEntityId(String spEntityId) {
            return spEntityId(Output.of(spEntityId));
        }

        /**
         * @param ssoEndpoint The endpoint where your SaaS application will send login requests.
         * 
         * @return builder
         * 
         */
        public Builder ssoEndpoint(@Nullable Output<String> ssoEndpoint) {
            $.ssoEndpoint = ssoEndpoint;
            return this;
        }

        /**
         * @param ssoEndpoint The endpoint where your SaaS application will send login requests.
         * 
         * @return builder
         * 
         */
        public Builder ssoEndpoint(String ssoEndpoint) {
            return ssoEndpoint(Output.of(ssoEndpoint));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public AccessApplicationSaasAppArgs build() {
            return $;
        }
    }

}
