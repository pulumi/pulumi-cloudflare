// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ZeroTrustAccessApplicationSaasApp
    {
        /// <summary>
        /// The lifetime of the Access Token after creation. Valid units are `m` and `h`. Must be greater than or equal to 1m and less than or equal to 24h.
        /// </summary>
        public readonly string? AccessTokenLifetime;
        /// <summary>
        /// Allow PKCE flow without a client secret.
        /// </summary>
        public readonly bool? AllowPkceWithoutClientSecret;
        /// <summary>
        /// The URL where this applications tile redirects users.
        /// </summary>
        public readonly string? AppLauncherUrl;
        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public readonly string? AuthType;
        /// <summary>
        /// The application client id.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The application client secret, only returned on initial apply.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// The service provider's endpoint that is responsible for receiving and parsing a SAML assertion.
        /// </summary>
        public readonly string? ConsumerServiceUrl;
        /// <summary>
        /// Custom attribute mapped from IDPs.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustAccessApplicationSaasAppCustomAttribute> CustomAttributes;
        /// <summary>
        /// Custom claim mapped from IDPs.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustAccessApplicationSaasAppCustomClaim> CustomClaims;
        /// <summary>
        /// The relay state used if not provided by the identity provider.
        /// </summary>
        public readonly string? DefaultRelayState;
        /// <summary>
        /// The OIDC flows supported by this application.
        /// </summary>
        public readonly ImmutableArray<string> GrantTypes;
        /// <summary>
        /// A regex to filter Cloudflare groups returned in ID token and userinfo endpoint.
        /// </summary>
        public readonly string? GroupFilterRegex;
        /// <summary>
        /// Hybrid and Implicit Flow options.
        /// </summary>
        public readonly Outputs.ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions? HybridAndImplicitOptions;
        /// <summary>
        /// The unique identifier for the SaaS application.
        /// </summary>
        public readonly string? IdpEntityId;
        /// <summary>
        /// The format of the name identifier sent to the SaaS application.
        /// </summary>
        public readonly string? NameIdFormat;
        /// <summary>
        /// A [JSONata](https://jsonata.org/) expression that transforms an application's user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
        /// </summary>
        public readonly string? NameIdTransformJsonata;
        /// <summary>
        /// The public certificate that will be used to verify identities.
        /// </summary>
        public readonly string? PublicKey;
        /// <summary>
        /// The permitted URL's for Cloudflare to return Authorization codes and Access/ID tokens.
        /// </summary>
        public readonly ImmutableArray<string> RedirectUris;
        /// <summary>
        /// Refresh token grant options.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustAccessApplicationSaasAppRefreshTokenOption> RefreshTokenOptions;
        /// <summary>
        /// A [JSONata](https://jsonata.org/) expression that transforms an application's user identities into attribute assertions in the SAML response. The expression can transform id, email, name, and groups values. It can also transform fields listed in the saml*attributes or oidc*fields of the identity provider used to authenticate. The output of this expression must be a JSON object.
        /// </summary>
        public readonly string? SamlAttributeTransformJsonata;
        /// <summary>
        /// Define the user information shared with access.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// A globally unique name for an identity or service provider.
        /// </summary>
        public readonly string? SpEntityId;
        /// <summary>
        /// The endpoint where the SaaS application will send login requests.
        /// </summary>
        public readonly string? SsoEndpoint;

        [OutputConstructor]
        private ZeroTrustAccessApplicationSaasApp(
            string? accessTokenLifetime,

            bool? allowPkceWithoutClientSecret,

            string? appLauncherUrl,

            string? authType,

            string? clientId,

            string? clientSecret,

            string? consumerServiceUrl,

            ImmutableArray<Outputs.ZeroTrustAccessApplicationSaasAppCustomAttribute> customAttributes,

            ImmutableArray<Outputs.ZeroTrustAccessApplicationSaasAppCustomClaim> customClaims,

            string? defaultRelayState,

            ImmutableArray<string> grantTypes,

            string? groupFilterRegex,

            Outputs.ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions? hybridAndImplicitOptions,

            string? idpEntityId,

            string? nameIdFormat,

            string? nameIdTransformJsonata,

            string? publicKey,

            ImmutableArray<string> redirectUris,

            ImmutableArray<Outputs.ZeroTrustAccessApplicationSaasAppRefreshTokenOption> refreshTokenOptions,

            string? samlAttributeTransformJsonata,

            ImmutableArray<string> scopes,

            string? spEntityId,

            string? ssoEndpoint)
        {
            AccessTokenLifetime = accessTokenLifetime;
            AllowPkceWithoutClientSecret = allowPkceWithoutClientSecret;
            AppLauncherUrl = appLauncherUrl;
            AuthType = authType;
            ClientId = clientId;
            ClientSecret = clientSecret;
            ConsumerServiceUrl = consumerServiceUrl;
            CustomAttributes = customAttributes;
            CustomClaims = customClaims;
            DefaultRelayState = defaultRelayState;
            GrantTypes = grantTypes;
            GroupFilterRegex = groupFilterRegex;
            HybridAndImplicitOptions = hybridAndImplicitOptions;
            IdpEntityId = idpEntityId;
            NameIdFormat = nameIdFormat;
            NameIdTransformJsonata = nameIdTransformJsonata;
            PublicKey = publicKey;
            RedirectUris = redirectUris;
            RefreshTokenOptions = refreshTokenOptions;
            SamlAttributeTransformJsonata = samlAttributeTransformJsonata;
            Scopes = scopes;
            SpEntityId = spEntityId;
            SsoEndpoint = ssoEndpoint;
        }
    }
}
