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
    public sealed class GetZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyResult
    {
        /// <summary>
        /// The fallback behavior to apply when the internal DNS response code is different from 'NOERROR' or when the response data only contains CNAME records for 'A' or 'AAAA' queries.
        /// Available values: "none", "public_dns".
        /// </summary>
        public readonly string Fallback;
        /// <summary>
        /// The internal DNS view identifier that's passed to the internal DNS service.
        /// </summary>
        public readonly string ViewId;

        [OutputConstructor]
        private GetZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyResult(
            string fallback,

            string viewId)
        {
            Fallback = fallback;
            ViewId = viewId;
        }
    }
}
