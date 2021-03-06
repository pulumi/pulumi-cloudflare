// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class PageRuleActionsForwardingUrl
    {
        /// <summary>
        /// The status code to use for the redirection.
        /// </summary>
        public readonly int StatusCode;
        /// <summary>
        /// The URL to which the page rule should forward.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private PageRuleActionsForwardingUrl(
            int statusCode,

            string url)
        {
            StatusCode = statusCode;
            Url = url;
        }
    }
}
