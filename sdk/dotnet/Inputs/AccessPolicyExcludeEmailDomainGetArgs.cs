// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessPolicyExcludeEmailDomainGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email domain to match.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        public AccessPolicyExcludeEmailDomainGetArgs()
        {
        }
        public static new AccessPolicyExcludeEmailDomainGetArgs Empty => new AccessPolicyExcludeEmailDomainGetArgs();
    }
}
