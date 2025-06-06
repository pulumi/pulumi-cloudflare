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
    public sealed class GetZeroTrustAccessApplicationsResultPolicyConnectionRulesResult
    {
        /// <summary>
        /// The SSH-specific rules that define how users may connect to the targets secured by your application.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSshResult Ssh;

        [OutputConstructor]
        private GetZeroTrustAccessApplicationsResultPolicyConnectionRulesResult(Outputs.GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSshResult ssh)
        {
            Ssh = ssh;
        }
    }
}
