// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PageRuleActionsForwardingUrlGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status code to use for the redirection.
        /// </summary>
        [Input("statusCode", required: true)]
        public Input<int> StatusCode { get; set; } = null!;

        /// <summary>
        /// The URL to which the page rule should forward.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public PageRuleActionsForwardingUrlGetArgs()
        {
        }
        public static new PageRuleActionsForwardingUrlGetArgs Empty => new PageRuleActionsForwardingUrlGetArgs();
    }
}
