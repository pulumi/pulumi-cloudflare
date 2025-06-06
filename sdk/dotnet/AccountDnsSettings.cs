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
    [CloudflareResourceType("cloudflare:index/accountDnsSettings:AccountDnsSettings")]
    public partial class AccountDnsSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("zoneDefaults")]
        public Output<Outputs.AccountDnsSettingsZoneDefaults?> ZoneDefaults { get; private set; } = null!;


        /// <summary>
        /// Create a AccountDnsSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountDnsSettings(string name, AccountDnsSettingsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accountDnsSettings:AccountDnsSettings", name, args ?? new AccountDnsSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountDnsSettings(string name, Input<string> id, AccountDnsSettingsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accountDnsSettings:AccountDnsSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountDnsSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountDnsSettings Get(string name, Input<string> id, AccountDnsSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountDnsSettings(name, id, state, options);
        }
    }

    public sealed class AccountDnsSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("zoneDefaults")]
        public Input<Inputs.AccountDnsSettingsZoneDefaultsArgs>? ZoneDefaults { get; set; }

        public AccountDnsSettingsArgs()
        {
        }
        public static new AccountDnsSettingsArgs Empty => new AccountDnsSettingsArgs();
    }

    public sealed class AccountDnsSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("zoneDefaults")]
        public Input<Inputs.AccountDnsSettingsZoneDefaultsGetArgs>? ZoneDefaults { get; set; }

        public AccountDnsSettingsState()
        {
        }
        public static new AccountDnsSettingsState Empty => new AccountDnsSettingsState();
    }
}
