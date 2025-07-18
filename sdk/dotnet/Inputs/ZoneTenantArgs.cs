// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZoneTenantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the Tenant account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ZoneTenantArgs()
        {
        }
        public static new ZoneTenantArgs Empty => new ZoneTenantArgs();
    }
}
