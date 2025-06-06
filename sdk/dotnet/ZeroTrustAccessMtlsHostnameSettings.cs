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
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings")]
    public partial class ZeroTrustAccessMtlsHostnameSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
        /// </summary>
        [Output("chinaNetwork")]
        public Output<bool> ChinaNetwork { get; private set; } = null!;

        /// <summary>
        /// Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
        /// </summary>
        [Output("clientCertificateForwarding")]
        public Output<bool> ClientCertificateForwarding { get; private set; } = null!;

        /// <summary>
        /// The hostname that these settings apply to.
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        [Output("settings")]
        public Output<ImmutableArray<Outputs.ZeroTrustAccessMtlsHostnameSettingsSetting>> Settings { get; private set; } = null!;

        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustAccessMtlsHostnameSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustAccessMtlsHostnameSettings(string name, ZeroTrustAccessMtlsHostnameSettingsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings", name, args ?? new ZeroTrustAccessMtlsHostnameSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustAccessMtlsHostnameSettings(string name, Input<string> id, ZeroTrustAccessMtlsHostnameSettingsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ZeroTrustAccessMtlsHostnameSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustAccessMtlsHostnameSettings Get(string name, Input<string> id, ZeroTrustAccessMtlsHostnameSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustAccessMtlsHostnameSettings(name, id, state, options);
        }
    }

    public sealed class ZeroTrustAccessMtlsHostnameSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("settings", required: true)]
        private InputList<Inputs.ZeroTrustAccessMtlsHostnameSettingsSettingArgs>? _settings;
        public InputList<Inputs.ZeroTrustAccessMtlsHostnameSettingsSettingArgs> Settings
        {
            get => _settings ?? (_settings = new InputList<Inputs.ZeroTrustAccessMtlsHostnameSettingsSettingArgs>());
            set => _settings = value;
        }

        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZeroTrustAccessMtlsHostnameSettingsArgs()
        {
        }
        public static new ZeroTrustAccessMtlsHostnameSettingsArgs Empty => new ZeroTrustAccessMtlsHostnameSettingsArgs();
    }

    public sealed class ZeroTrustAccessMtlsHostnameSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
        /// </summary>
        [Input("chinaNetwork")]
        public Input<bool>? ChinaNetwork { get; set; }

        /// <summary>
        /// Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
        /// </summary>
        [Input("clientCertificateForwarding")]
        public Input<bool>? ClientCertificateForwarding { get; set; }

        /// <summary>
        /// The hostname that these settings apply to.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("settings")]
        private InputList<Inputs.ZeroTrustAccessMtlsHostnameSettingsSettingGetArgs>? _settings;
        public InputList<Inputs.ZeroTrustAccessMtlsHostnameSettingsSettingGetArgs> Settings
        {
            get => _settings ?? (_settings = new InputList<Inputs.ZeroTrustAccessMtlsHostnameSettingsSettingGetArgs>());
            set => _settings = value;
        }

        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZeroTrustAccessMtlsHostnameSettingsState()
        {
        }
        public static new ZeroTrustAccessMtlsHostnameSettingsState Empty => new ZeroTrustAccessMtlsHostnameSettingsState();
    }
}
