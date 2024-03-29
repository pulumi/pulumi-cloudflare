// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersCacheKeyCustomKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cookie parameters for the custom key.
        /// </summary>
        [Input("cookie")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyCookieGetArgs>? Cookie { get; set; }

        /// <summary>
        /// Header parameters for the custom key.
        /// </summary>
        [Input("header")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyHeaderGetArgs>? Header { get; set; }

        /// <summary>
        /// Host parameters for the custom key.
        /// </summary>
        [Input("host")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyHostGetArgs>? Host { get; set; }

        /// <summary>
        /// Query string parameters for the custom key.
        /// </summary>
        [Input("queryString")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringGetArgs>? QueryString { get; set; }

        /// <summary>
        /// User parameters for the custom key.
        /// </summary>
        [Input("user")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyCustomKeyUserGetArgs>? User { get; set; }

        public RulesetRuleActionParametersCacheKeyCustomKeyGetArgs()
        {
        }
        public static new RulesetRuleActionParametersCacheKeyCustomKeyGetArgs Empty => new RulesetRuleActionParametersCacheKeyCustomKeyGetArgs();
    }
}
