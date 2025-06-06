// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class LoadBalancerPoolOriginHeader
    {
        /// <summary>
        /// The 'Host' header allows to override the hostname set in the HTTP request. Current support is 1 'Host' header override per origin.
        /// </summary>
        public readonly ImmutableArray<string> Hosts;

        [OutputConstructor]
        private LoadBalancerPoolOriginHeader(ImmutableArray<string> hosts)
        {
            Hosts = hosts;
        }
    }
}
