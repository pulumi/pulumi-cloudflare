// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessPolicyExcludeGithubOrganizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of your Github identity provider.
        /// </summary>
        [Input("identityProviderId", required: true)]
        public Input<string> IdentityProviderId { get; set; } = null!;

        /// <summary>
        /// The name of the organization.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the team
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        public AccessPolicyExcludeGithubOrganizationArgs()
        {
        }
        public static new AccessPolicyExcludeGithubOrganizationArgs Empty => new AccessPolicyExcludeGithubOrganizationArgs();
    }
}
