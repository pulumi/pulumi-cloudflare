// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetAccountDnsSettingsInternalViewFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Direction to order DNS views in.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// Whether to match all search requirements or at least one (any). If set to `all`, acts like a logical AND between filters. If set to `any`, acts like a logical OR instead.
        /// Available values: "any", "all".
        /// </summary>
        [Input("match", required: true)]
        public Input<string> Match { get; set; } = null!;

        [Input("name")]
        public Input<Inputs.GetAccountDnsSettingsInternalViewFilterNameInputArgs>? Name { get; set; }

        /// <summary>
        /// Field to order DNS views by.
        /// Available values: "name", "created*on", "modified*on".
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// A zone ID that exists in the zones list for the view.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        /// <summary>
        /// A zone name that exists in the zones list for the view.
        /// </summary>
        [Input("zoneName")]
        public Input<string>? ZoneName { get; set; }

        public GetAccountDnsSettingsInternalViewFilterInputArgs()
        {
        }
        public static new GetAccountDnsSettingsInternalViewFilterInputArgs Empty => new GetAccountDnsSettingsInternalViewFilterInputArgs();
    }
}
