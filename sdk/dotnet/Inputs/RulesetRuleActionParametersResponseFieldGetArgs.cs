// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersResponseFieldGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the field.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Whether to log duplicate values of the same header.
        /// </summary>
        [Input("preserveDuplicates")]
        public Input<bool>? PreserveDuplicates { get; set; }

        public RulesetRuleActionParametersResponseFieldGetArgs()
        {
        }
        public static new RulesetRuleActionParametersResponseFieldGetArgs Empty => new RulesetRuleActionParametersResponseFieldGetArgs();
    }
}
