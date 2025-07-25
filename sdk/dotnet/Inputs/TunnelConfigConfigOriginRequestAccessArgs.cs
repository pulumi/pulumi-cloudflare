// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TunnelConfigConfigOriginRequestAccessArgs : global::Pulumi.ResourceArgs
    {
        [Input("audTags", required: true)]
        private InputList<string>? _audTags;

        /// <summary>
        /// Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API.
        /// </summary>
        public InputList<string> AudTags
        {
            get => _audTags ?? (_audTags = new InputList<string>());
            set => _audTags = value;
        }

        /// <summary>
        /// Deny traffic that has not fulfilled Access authorization.
        /// </summary>
        [Input("required")]
        public Input<bool>? Required { get; set; }

        [Input("teamName", required: true)]
        public Input<string> TeamName { get; set; } = null!;

        public TunnelConfigConfigOriginRequestAccessArgs()
        {
        }
        public static new TunnelConfigConfigOriginRequestAccessArgs Empty => new TunnelConfigConfigOriginRequestAccessArgs();
    }
}
