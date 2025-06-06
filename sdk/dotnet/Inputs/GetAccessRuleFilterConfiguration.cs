// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetAccessRuleFilterConfigurationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Defines the target to search in existing rules.
        /// Available values: "ip", "ip_range", "asn", "country".
        /// </summary>
        [Input("target")]
        public string? Target { get; set; }

        /// <summary>
        /// Defines the target value to search for in existing rules: an IP address, an IP address range, or a country code, depending on the provided `configuration.target`.
        /// Notes: You can search for a single IPv4 address, an IP address range with a subnet of '/16' or '/24', or a two-letter ISO-3166-1 alpha-2 country code.
        /// </summary>
        [Input("value")]
        public string? Value { get; set; }

        public GetAccessRuleFilterConfigurationArgs()
        {
        }
        public static new GetAccessRuleFilterConfigurationArgs Empty => new GetAccessRuleFilterConfigurationArgs();
    }
}
