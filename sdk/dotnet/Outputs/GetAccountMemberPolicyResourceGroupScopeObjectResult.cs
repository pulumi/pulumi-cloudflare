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
    public sealed class GetAccountMemberPolicyResourceGroupScopeObjectResult
    {
        /// <summary>
        /// This is a combination of pre-defined resource name and identifier (like Zone ID etc.)
        /// </summary>
        public readonly string Key;

        [OutputConstructor]
        private GetAccountMemberPolicyResourceGroupScopeObjectResult(string key)
        {
            Key = key;
        }
    }
}
