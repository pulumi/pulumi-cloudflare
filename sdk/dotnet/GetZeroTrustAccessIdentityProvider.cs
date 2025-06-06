// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustAccessIdentityProvider
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZeroTrustAccessIdentityProvider = Cloudflare.GetZeroTrustAccessIdentityProvider.Invoke(new()
        ///     {
        ///         IdentityProviderId = "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        ///         AccountId = "account_id",
        ///         ZoneId = "zone_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustAccessIdentityProviderResult> InvokeAsync(GetZeroTrustAccessIdentityProviderArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustAccessIdentityProviderResult>("cloudflare:index/getZeroTrustAccessIdentityProvider:getZeroTrustAccessIdentityProvider", args ?? new GetZeroTrustAccessIdentityProviderArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZeroTrustAccessIdentityProvider = Cloudflare.GetZeroTrustAccessIdentityProvider.Invoke(new()
        ///     {
        ///         IdentityProviderId = "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        ///         AccountId = "account_id",
        ///         ZoneId = "zone_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustAccessIdentityProviderResult> Invoke(GetZeroTrustAccessIdentityProviderInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustAccessIdentityProviderResult>("cloudflare:index/getZeroTrustAccessIdentityProvider:getZeroTrustAccessIdentityProvider", args ?? new GetZeroTrustAccessIdentityProviderInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZeroTrustAccessIdentityProvider = Cloudflare.GetZeroTrustAccessIdentityProvider.Invoke(new()
        ///     {
        ///         IdentityProviderId = "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        ///         AccountId = "account_id",
        ///         ZoneId = "zone_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustAccessIdentityProviderResult> Invoke(GetZeroTrustAccessIdentityProviderInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustAccessIdentityProviderResult>("cloudflare:index/getZeroTrustAccessIdentityProvider:getZeroTrustAccessIdentityProvider", args ?? new GetZeroTrustAccessIdentityProviderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustAccessIdentityProviderArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        [Input("filter")]
        public Inputs.GetZeroTrustAccessIdentityProviderFilterArgs? Filter { get; set; }

        /// <summary>
        /// UUID.
        /// </summary>
        [Input("identityProviderId")]
        public string? IdentityProviderId { get; set; }

        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetZeroTrustAccessIdentityProviderArgs()
        {
        }
        public static new GetZeroTrustAccessIdentityProviderArgs Empty => new GetZeroTrustAccessIdentityProviderArgs();
    }

    public sealed class GetZeroTrustAccessIdentityProviderInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("filter")]
        public Input<Inputs.GetZeroTrustAccessIdentityProviderFilterInputArgs>? Filter { get; set; }

        /// <summary>
        /// UUID.
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetZeroTrustAccessIdentityProviderInvokeArgs()
        {
        }
        public static new GetZeroTrustAccessIdentityProviderInvokeArgs Empty => new GetZeroTrustAccessIdentityProviderInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustAccessIdentityProviderResult
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        public readonly string? AccountId;
        /// <summary>
        /// The configuration parameters for the identity provider. To view the required parameters for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessIdentityProviderConfigResult Config;
        public readonly Outputs.GetZeroTrustAccessIdentityProviderFilterResult? Filter;
        /// <summary>
        /// UUID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// UUID.
        /// </summary>
        public readonly string? IdentityProviderId;
        /// <summary>
        /// The name of the identity provider, shown to users on the login page.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The configuration settings for enabling a System for Cross-Domain Identity Management (SCIM) with the identity provider.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessIdentityProviderScimConfigResult ScimConfig;
        /// <summary>
        /// The type of identity provider. To determine the value for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
        /// Available values: "onetimepin", "azureAD", "saml", "centrify", "facebook", "github", "google-apps", "google", "linkedin", "oidc", "okta", "onelogin", "pingone", "yandex".
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetZeroTrustAccessIdentityProviderResult(
            string? accountId,

            Outputs.GetZeroTrustAccessIdentityProviderConfigResult config,

            Outputs.GetZeroTrustAccessIdentityProviderFilterResult? filter,

            string id,

            string? identityProviderId,

            string name,

            Outputs.GetZeroTrustAccessIdentityProviderScimConfigResult scimConfig,

            string type,

            string? zoneId)
        {
            AccountId = accountId;
            Config = config;
            Filter = filter;
            Id = id;
            IdentityProviderId = identityProviderId;
            Name = name;
            ScimConfig = scimConfig;
            Type = type;
            ZoneId = zoneId;
        }
    }
}
