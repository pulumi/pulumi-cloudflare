// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare Teams Gateway Certificate resource. A Teams Certificate can
    /// be specified for Gateway TLS interception and block pages.
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustGatewayCertificate:ZeroTrustGatewayCertificate")]
    public partial class ZeroTrustGatewayCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether or not to activate a certificate. A certificate must be activated to use in Gateway certificate settings. Defaults to `false`.
        /// </summary>
        [Output("activate")]
        public Output<bool?> Activate { get; private set; } = null!;

        /// <summary>
        /// The deployment status of the certificate on the edge Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
        /// </summary>
        [Output("bindingStatus")]
        public Output<string> BindingStatus { get; private set; } = null!;

        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
        /// </summary>
        [Output("custom")]
        public Output<bool?> Custom { get; private set; } = null!;

        [Output("expiresOn")]
        public Output<string> ExpiresOn { get; private set; } = null!;

        /// <summary>
        /// The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
        /// </summary>
        [Output("gatewayManaged")]
        public Output<bool?> GatewayManaged { get; private set; } = null!;

        /// <summary>
        /// Whether the certificate is in use by Gateway for TLS interception and the block page.
        /// </summary>
        [Output("inUse")]
        public Output<bool> InUse { get; private set; } = null!;

        [Output("qsPackId")]
        public Output<string> QsPackId { get; private set; } = null!;

        [Output("uploadedOn")]
        public Output<string> UploadedOn { get; private set; } = null!;

        /// <summary>
        /// Number of days the generated certificate will be valid, minimum 1 day and maximum 30 years. Defaults to 5 years. Defaults to `1826`. Required when using `gateway_managed`. Conflicts with `custom`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("validityPeriodDays")]
        public Output<int?> ValidityPeriodDays { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustGatewayCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustGatewayCertificate(string name, ZeroTrustGatewayCertificateArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustGatewayCertificate:ZeroTrustGatewayCertificate", name, args ?? new ZeroTrustGatewayCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustGatewayCertificate(string name, Input<string> id, ZeroTrustGatewayCertificateState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustGatewayCertificate:ZeroTrustGatewayCertificate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZeroTrustGatewayCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustGatewayCertificate Get(string name, Input<string> id, ZeroTrustGatewayCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustGatewayCertificate(name, id, state, options);
        }
    }

    public sealed class ZeroTrustGatewayCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether or not to activate a certificate. A certificate must be activated to use in Gateway certificate settings. Defaults to `false`.
        /// </summary>
        [Input("activate")]
        public Input<bool>? Activate { get; set; }

        /// <summary>
        /// The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
        /// </summary>
        [Input("custom")]
        public Input<bool>? Custom { get; set; }

        /// <summary>
        /// The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
        /// </summary>
        [Input("gatewayManaged")]
        public Input<bool>? GatewayManaged { get; set; }

        /// <summary>
        /// Number of days the generated certificate will be valid, minimum 1 day and maximum 30 years. Defaults to 5 years. Defaults to `1826`. Required when using `gateway_managed`. Conflicts with `custom`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("validityPeriodDays")]
        public Input<int>? ValidityPeriodDays { get; set; }

        public ZeroTrustGatewayCertificateArgs()
        {
        }
        public static new ZeroTrustGatewayCertificateArgs Empty => new ZeroTrustGatewayCertificateArgs();
    }

    public sealed class ZeroTrustGatewayCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether or not to activate a certificate. A certificate must be activated to use in Gateway certificate settings. Defaults to `false`.
        /// </summary>
        [Input("activate")]
        public Input<bool>? Activate { get; set; }

        /// <summary>
        /// The deployment status of the certificate on the edge Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
        /// </summary>
        [Input("bindingStatus")]
        public Input<string>? BindingStatus { get; set; }

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
        /// </summary>
        [Input("custom")]
        public Input<bool>? Custom { get; set; }

        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        /// <summary>
        /// The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
        /// </summary>
        [Input("gatewayManaged")]
        public Input<bool>? GatewayManaged { get; set; }

        /// <summary>
        /// Whether the certificate is in use by Gateway for TLS interception and the block page.
        /// </summary>
        [Input("inUse")]
        public Input<bool>? InUse { get; set; }

        [Input("qsPackId")]
        public Input<string>? QsPackId { get; set; }

        [Input("uploadedOn")]
        public Input<string>? UploadedOn { get; set; }

        /// <summary>
        /// Number of days the generated certificate will be valid, minimum 1 day and maximum 30 years. Defaults to 5 years. Defaults to `1826`. Required when using `gateway_managed`. Conflicts with `custom`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("validityPeriodDays")]
        public Input<int>? ValidityPeriodDays { get; set; }

        public ZeroTrustGatewayCertificateState()
        {
        }
        public static new ZeroTrustGatewayCertificateState Empty => new ZeroTrustGatewayCertificateState();
    }
}
