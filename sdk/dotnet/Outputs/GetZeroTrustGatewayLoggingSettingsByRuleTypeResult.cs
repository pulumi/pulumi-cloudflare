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
    public sealed class GetZeroTrustGatewayLoggingSettingsByRuleTypeResult
    {
        public readonly Outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeDnsResult Dns;
        public readonly Outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeHttpResult Http;
        public readonly Outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeL4Result L4;

        [OutputConstructor]
        private GetZeroTrustGatewayLoggingSettingsByRuleTypeResult(
            Outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeDnsResult dns,

            Outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeHttpResult http,

            Outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeL4Result l4)
        {
            Dns = dns;
            Http = http;
            L4 = l4;
        }
    }
}
