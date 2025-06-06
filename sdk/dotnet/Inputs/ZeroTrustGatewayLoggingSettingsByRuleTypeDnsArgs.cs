// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustGatewayLoggingSettingsByRuleTypeDnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Log all requests to this service.
        /// </summary>
        [Input("logAll")]
        public Input<bool>? LogAll { get; set; }

        /// <summary>
        /// Log only blocking requests to this service.
        /// </summary>
        [Input("logBlocks")]
        public Input<bool>? LogBlocks { get; set; }

        public ZeroTrustGatewayLoggingSettingsByRuleTypeDnsArgs()
        {
        }
        public static new ZeroTrustGatewayLoggingSettingsByRuleTypeDnsArgs Empty => new ZeroTrustGatewayLoggingSettingsByRuleTypeDnsArgs();
    }
}
