// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZoneDnsSettingsNameserversGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configured nameserver set to be used for this zone
        /// </summary>
        [Input("nsSet")]
        public Input<int>? NsSet { get; set; }

        /// <summary>
        /// Nameserver type
        /// Available values: "cloudflare.standard", "custom.account", "custom.tenant", "custom.zone".
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ZoneDnsSettingsNameserversGetArgs()
        {
        }
        public static new ZoneDnsSettingsNameserversGetArgs Empty => new ZoneDnsSettingsNameserversGetArgs();
    }
}
