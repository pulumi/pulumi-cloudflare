// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsAccountSettingsExtendedEmailMatchingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable matching all variants of user emails (with + or . modifiers) used as criteria in Firewall policies.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public TeamsAccountSettingsExtendedEmailMatchingGetArgs()
        {
        }
        public static new TeamsAccountSettingsExtendedEmailMatchingGetArgs Empty => new TeamsAccountSettingsExtendedEmailMatchingGetArgs();
    }
}
