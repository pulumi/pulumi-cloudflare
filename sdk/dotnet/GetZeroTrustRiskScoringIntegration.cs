// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustRiskScoringIntegration
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
        ///     var exampleZeroTrustRiskScoringIntegration = Cloudflare.GetZeroTrustRiskScoringIntegration.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         IntegrationId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustRiskScoringIntegrationResult> InvokeAsync(GetZeroTrustRiskScoringIntegrationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustRiskScoringIntegrationResult>("cloudflare:index/getZeroTrustRiskScoringIntegration:getZeroTrustRiskScoringIntegration", args ?? new GetZeroTrustRiskScoringIntegrationArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustRiskScoringIntegration = Cloudflare.GetZeroTrustRiskScoringIntegration.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         IntegrationId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustRiskScoringIntegrationResult> Invoke(GetZeroTrustRiskScoringIntegrationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustRiskScoringIntegrationResult>("cloudflare:index/getZeroTrustRiskScoringIntegration:getZeroTrustRiskScoringIntegration", args ?? new GetZeroTrustRiskScoringIntegrationInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustRiskScoringIntegration = Cloudflare.GetZeroTrustRiskScoringIntegration.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         IntegrationId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustRiskScoringIntegrationResult> Invoke(GetZeroTrustRiskScoringIntegrationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustRiskScoringIntegrationResult>("cloudflare:index/getZeroTrustRiskScoringIntegration:getZeroTrustRiskScoringIntegration", args ?? new GetZeroTrustRiskScoringIntegrationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustRiskScoringIntegrationArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("integrationId")]
        public string? IntegrationId { get; set; }

        public GetZeroTrustRiskScoringIntegrationArgs()
        {
        }
        public static new GetZeroTrustRiskScoringIntegrationArgs Empty => new GetZeroTrustRiskScoringIntegrationArgs();
    }

    public sealed class GetZeroTrustRiskScoringIntegrationInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("integrationId")]
        public Input<string>? IntegrationId { get; set; }

        public GetZeroTrustRiskScoringIntegrationInvokeArgs()
        {
        }
        public static new GetZeroTrustRiskScoringIntegrationInvokeArgs Empty => new GetZeroTrustRiskScoringIntegrationInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustRiskScoringIntegrationResult
    {
        public readonly string AccountId;
        /// <summary>
        /// The Cloudflare account tag.
        /// </summary>
        public readonly string AccountTag;
        /// <summary>
        /// Whether this integration is enabled and should export changes in risk score.
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// When the integration was created in RFC3339 format.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        public readonly string? IntegrationId;
        /// <summary>
        /// Available values: "Okta".
        /// </summary>
        public readonly string IntegrationType;
        /// <summary>
        /// A reference ID defined by the client.
        /// Should be set to the Access-Okta IDP integration ID.
        /// Useful when the risk-score integration needs to be associated with a secondary asset and recalled using that ID.
        /// </summary>
        public readonly string ReferenceId;
        /// <summary>
        /// The base URL for the tenant. E.g. "https://tenant.okta.com".
        /// </summary>
        public readonly string TenantUrl;
        /// <summary>
        /// The URL for the Shared Signals Framework configuration, e.g. "/.well-known/sse-configuration/{integration*uuid}/". https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
        /// </summary>
        public readonly string WellKnownUrl;

        [OutputConstructor]
        private GetZeroTrustRiskScoringIntegrationResult(
            string accountId,

            string accountTag,

            bool active,

            string createdAt,

            string id,

            string? integrationId,

            string integrationType,

            string referenceId,

            string tenantUrl,

            string wellKnownUrl)
        {
            AccountId = accountId;
            AccountTag = accountTag;
            Active = active;
            CreatedAt = createdAt;
            Id = id;
            IntegrationId = integrationId;
            IntegrationType = integrationType;
            ReferenceId = referenceId;
            TenantUrl = tenantUrl;
            WellKnownUrl = wellKnownUrl;
        }
    }
}
