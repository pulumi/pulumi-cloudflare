// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessGroupExcludeIpListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of a previously created IP list.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public AccessGroupExcludeIpListArgs()
        {
        }
        public static new AccessGroupExcludeIpListArgs Empty => new AccessGroupExcludeIpListArgs();
    }
}
