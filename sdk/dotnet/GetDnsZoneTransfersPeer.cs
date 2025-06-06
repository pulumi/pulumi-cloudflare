// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetDnsZoneTransfersPeer
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleDnsZoneTransfersPeer = Cloudflare.GetDnsZoneTransfersPeer.Invoke(new()
        ///     {
        ///         AccountId = "01a7362d577a6c3019a474fd6f485823",
        ///         PeerId = "23ff594956f20c2a721606e94745a8aa",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDnsZoneTransfersPeerResult> InvokeAsync(GetDnsZoneTransfersPeerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDnsZoneTransfersPeerResult>("cloudflare:index/getDnsZoneTransfersPeer:getDnsZoneTransfersPeer", args ?? new GetDnsZoneTransfersPeerArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleDnsZoneTransfersPeer = Cloudflare.GetDnsZoneTransfersPeer.Invoke(new()
        ///     {
        ///         AccountId = "01a7362d577a6c3019a474fd6f485823",
        ///         PeerId = "23ff594956f20c2a721606e94745a8aa",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDnsZoneTransfersPeerResult> Invoke(GetDnsZoneTransfersPeerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDnsZoneTransfersPeerResult>("cloudflare:index/getDnsZoneTransfersPeer:getDnsZoneTransfersPeer", args ?? new GetDnsZoneTransfersPeerInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleDnsZoneTransfersPeer = Cloudflare.GetDnsZoneTransfersPeer.Invoke(new()
        ///     {
        ///         AccountId = "01a7362d577a6c3019a474fd6f485823",
        ///         PeerId = "23ff594956f20c2a721606e94745a8aa",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDnsZoneTransfersPeerResult> Invoke(GetDnsZoneTransfersPeerInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDnsZoneTransfersPeerResult>("cloudflare:index/getDnsZoneTransfersPeer:getDnsZoneTransfersPeer", args ?? new GetDnsZoneTransfersPeerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDnsZoneTransfersPeerArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("peerId")]
        public string? PeerId { get; set; }

        public GetDnsZoneTransfersPeerArgs()
        {
        }
        public static new GetDnsZoneTransfersPeerArgs Empty => new GetDnsZoneTransfersPeerArgs();
    }

    public sealed class GetDnsZoneTransfersPeerInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("peerId")]
        public Input<string>? PeerId { get; set; }

        public GetDnsZoneTransfersPeerInvokeArgs()
        {
        }
        public static new GetDnsZoneTransfersPeerInvokeArgs Empty => new GetDnsZoneTransfersPeerInvokeArgs();
    }


    [OutputType]
    public sealed class GetDnsZoneTransfersPeerResult
    {
        public readonly string AccountId;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
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
        public readonly string? PeerId;
        /// <summary>
        /// DNS port of primary or secondary nameserver, depending on what zone this peer is linked to.
        /// </summary>
        public readonly double Port;
        /// <summary>
        /// TSIG authentication will be used for zone transfer if configured.
        /// </summary>
        public readonly string TsigId;

        [OutputConstructor]
        private GetDnsZoneTransfersPeerResult(
            string accountId,

            string id,

            string ip,

            bool ixfrEnable,

            string name,

            string? peerId,

            double port,

            string tsigId)
        {
            AccountId = accountId;
            Id = id;
            Ip = ip;
            IxfrEnable = ixfrEnable;
            Name = name;
            PeerId = peerId;
            Port = port;
            TsigId = tsigId;
        }
    }
}
