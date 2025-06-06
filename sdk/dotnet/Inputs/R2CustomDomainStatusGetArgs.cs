// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class R2CustomDomainStatusGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ownership status of the domain.
        /// Available values: "pending", "active", "deactivated", "blocked", "error", "unknown".
        /// </summary>
        [Input("ownership")]
        public Input<string>? Ownership { get; set; }

        /// <summary>
        /// SSL certificate status.
        /// Available values: "initializing", "pending", "active", "deactivated", "error", "unknown".
        /// </summary>
        [Input("ssl")]
        public Input<string>? Ssl { get; set; }

        public R2CustomDomainStatusGetArgs()
        {
        }
        public static new R2CustomDomainStatusGetArgs Empty => new R2CustomDomainStatusGetArgs();
    }
}
