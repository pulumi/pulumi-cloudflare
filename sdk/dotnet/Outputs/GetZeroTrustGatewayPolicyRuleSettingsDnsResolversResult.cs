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
    public sealed class GetZeroTrustGatewayPolicyRuleSettingsDnsResolversResult
    {
        public readonly ImmutableArray<Outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4Result> Ipv4s;
        public readonly ImmutableArray<Outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6Result> Ipv6s;

        [OutputConstructor]
        private GetZeroTrustGatewayPolicyRuleSettingsDnsResolversResult(
            ImmutableArray<Outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4Result> ipv4s,

            ImmutableArray<Outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6Result> ipv6s)
        {
            Ipv4s = ipv4s;
            Ipv6s = ipv6s;
        }
    }
}
