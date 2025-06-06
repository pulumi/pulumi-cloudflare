// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetWorkersCustomDomainFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Worker environment associated with the zone and hostname.
        /// </summary>
        [Input("environment")]
        public string? Environment { get; set; }

        /// <summary>
        /// Hostname of the Worker Domain.
        /// </summary>
        [Input("hostname")]
        public string? Hostname { get; set; }

        /// <summary>
        /// Worker service associated with the zone and hostname.
        /// </summary>
        [Input("service")]
        public string? Service { get; set; }

        /// <summary>
        /// Identifier of the zone.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        /// <summary>
        /// Name of the zone.
        /// </summary>
        [Input("zoneName")]
        public string? ZoneName { get; set; }

        public GetWorkersCustomDomainFilterArgs()
        {
        }
        public static new GetWorkersCustomDomainFilterArgs Empty => new GetWorkersCustomDomainFilterArgs();
    }
}
