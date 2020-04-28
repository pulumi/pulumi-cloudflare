// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RateLimitActionResponseGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The body to return, the content here should conform to the content_type.
        /// </summary>
        [Input("body", required: true)]
        public Input<string> Body { get; set; } = null!;

        /// <summary>
        /// The content-type of the body, must be one of: 'text/plain', 'text/xml', 'application/json'.
        /// </summary>
        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        public RateLimitActionResponseGetArgs()
        {
        }
    }
}