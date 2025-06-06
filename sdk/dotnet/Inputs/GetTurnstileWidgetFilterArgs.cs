// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetTurnstileWidgetFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Direction to order widgets.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// Field to order widgets by.
        /// Available values: "id", "sitekey", "name", "created*on", "modified*on".
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        public GetTurnstileWidgetFilterInputArgs()
        {
        }
        public static new GetTurnstileWidgetFilterInputArgs Empty => new GetTurnstileWidgetFilterInputArgs();
    }
}
