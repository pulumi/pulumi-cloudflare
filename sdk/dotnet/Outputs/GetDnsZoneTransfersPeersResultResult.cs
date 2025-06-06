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
    public sealed class GetDnsZoneTransfersPeersResultResult
    {
        public readonly string Id;
        /// <summary>
        /// IPv4/IPv6 address of primary or secondary nameserver, depending on what zone this peer is linked to. For primary zones this IP defines the IP of the secondary nameserver Cloudflare will NOTIFY upon zone changes. For secondary zones this IP defines the IP of the primary nameserver Cloudflare will send AXFR/IXFR requests to.
        /// </summary>
        public readonly string Ip;
        /// <summary>
        /// Enable IXFR transfer protocol, default is AXFR. Only applicable to secondary zones.
        /// </summary>
        public readonly bool IxfrEnable;
        /// <summary>
        /// The name of the peer.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// DNS port of primary or secondary nameserver, depending on what zone this peer is linked to.
        /// </summary>
        public readonly double Port;
        /// <summary>
        /// TSIG authentication will be used for zone transfer if configured.
        /// </summary>
        public readonly string TsigId;

        [OutputConstructor]
        private GetDnsZoneTransfersPeersResultResult(
            string id,

            string ip,

            bool ixfrEnable,

            string name,

            double port,

            string tsigId)
        {
            Id = id;
            Ip = ip;
            IxfrEnable = ixfrEnable;
            Name = name;
            Port = port;
            TsigId = tsigId;
        }
    }
}
