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
    public sealed class AccountMemberPolicyPermissionGroup
    {
        /// <summary>
        /// Identifier of the group.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private AccountMemberPolicyPermissionGroup(string id)
        {
            Id = id;
        }
    }
}
