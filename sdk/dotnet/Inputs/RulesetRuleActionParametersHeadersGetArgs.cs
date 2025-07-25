// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersHeadersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expression for the header value.
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        /// <summary>
        /// Available values: "remove", "add", "set".
        /// </summary>
        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        /// <summary>
        /// Static value for the header.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public RulesetRuleActionParametersHeadersGetArgs()
        {
        }
        public static new RulesetRuleActionParametersHeadersGetArgs Empty => new RulesetRuleActionParametersHeadersGetArgs();
    }
}
