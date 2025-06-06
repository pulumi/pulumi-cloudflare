// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
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
    ///     var exampleZeroTrustRiskScoringIntegration = new Cloudflare.ZeroTrustRiskScoringIntegration("example_zero_trust_risk_scoring_integration", new()
    ///     {
    ///         AccountId = "account_id",
    ///         IntegrationType = "Okta",
    ///         TenantUrl = "https://example.com",
    ///         ReferenceId = "reference_id",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration example '&lt;account_id&gt;/&lt;integration_id&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration")]
    public partial class ZeroTrustRiskScoringIntegration : global::Pulumi.CustomResource
    {
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The Cloudflare account tag.
        /// </summary>
        [Output("accountTag")]
        public Output<string> AccountTag { get; private set; } = null!;

        /// <summary>
        /// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// When the integration was created in RFC3339 format.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Available values: "Okta".
        /// </summary>
        [Output("integrationType")]
        public Output<string> IntegrationType { get; private set; } = null!;

        /// <summary>
        /// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
        /// https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        /// </summary>
        [Output("referenceId")]
        public Output<string?> ReferenceId { get; private set; } = null!;

        /// <summary>
        /// The base url of the tenant, e.g. "https://tenant.okta.com".
        /// </summary>
        [Output("tenantUrl")]
        public Output<string> TenantUrl { get; private set; } = null!;

        /// <summary>
        /// The URL for the Shared Signals Framework configuration, e.g. "/.well-known/sse-configuration/{integration*uuid}/". https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
        /// </summary>
        [Output("wellKnownUrl")]
        public Output<string> WellKnownUrl { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustRiskScoringIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustRiskScoringIntegration(string name, ZeroTrustRiskScoringIntegrationArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration", name, args ?? new ZeroTrustRiskScoringIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustRiskScoringIntegration(string name, Input<string> id, ZeroTrustRiskScoringIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ZeroTrustRiskScoringIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustRiskScoringIntegration Get(string name, Input<string> id, ZeroTrustRiskScoringIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustRiskScoringIntegration(name, id, state, options);
        }
    }

    public sealed class ZeroTrustRiskScoringIntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Available values: "Okta".
        /// </summary>
        [Input("integrationType", required: true)]
        public Input<string> IntegrationType { get; set; } = null!;

        /// <summary>
        /// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
        /// https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        /// </summary>
        [Input("referenceId")]
        public Input<string>? ReferenceId { get; set; }

        /// <summary>
        /// The base url of the tenant, e.g. "https://tenant.okta.com".
        /// </summary>
        [Input("tenantUrl", required: true)]
        public Input<string> TenantUrl { get; set; } = null!;

        public ZeroTrustRiskScoringIntegrationArgs()
        {
        }
        public static new ZeroTrustRiskScoringIntegrationArgs Empty => new ZeroTrustRiskScoringIntegrationArgs();
    }

    public sealed class ZeroTrustRiskScoringIntegrationState : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The Cloudflare account tag.
        /// </summary>
        [Input("accountTag")]
        public Input<string>? AccountTag { get; set; }

        /// <summary>
        /// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// When the integration was created in RFC3339 format.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Available values: "Okta".
        /// </summary>
        [Input("integrationType")]
        public Input<string>? IntegrationType { get; set; }

        /// <summary>
        /// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
        /// https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        /// </summary>
        [Input("referenceId")]
        public Input<string>? ReferenceId { get; set; }

        /// <summary>
        /// The base url of the tenant, e.g. "https://tenant.okta.com".
        /// </summary>
        [Input("tenantUrl")]
        public Input<string>? TenantUrl { get; set; }

        /// <summary>
        /// The URL for the Shared Signals Framework configuration, e.g. "/.well-known/sse-configuration/{integration*uuid}/". https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
        /// </summary>
        [Input("wellKnownUrl")]
        public Input<string>? WellKnownUrl { get; set; }

        public ZeroTrustRiskScoringIntegrationState()
        {
        }
        public static new ZeroTrustRiskScoringIntegrationState Empty => new ZeroTrustRiskScoringIntegrationState();
    }
}
