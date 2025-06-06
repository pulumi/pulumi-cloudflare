// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetWeb3Hostname
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
        ///     var exampleWeb3Hostname = Cloudflare.GetWeb3Hostname.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Identifier = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWeb3HostnameResult> InvokeAsync(GetWeb3HostnameArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWeb3HostnameResult>("cloudflare:index/getWeb3Hostname:getWeb3Hostname", args ?? new GetWeb3HostnameArgs(), options.WithDefaults());

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
        ///     var exampleWeb3Hostname = Cloudflare.GetWeb3Hostname.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Identifier = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWeb3HostnameResult> Invoke(GetWeb3HostnameInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWeb3HostnameResult>("cloudflare:index/getWeb3Hostname:getWeb3Hostname", args ?? new GetWeb3HostnameInvokeArgs(), options.WithDefaults());

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
        ///     var exampleWeb3Hostname = Cloudflare.GetWeb3Hostname.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Identifier = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWeb3HostnameResult> Invoke(GetWeb3HostnameInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWeb3HostnameResult>("cloudflare:index/getWeb3Hostname:getWeb3Hostname", args ?? new GetWeb3HostnameInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWeb3HostnameArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specify the identifier of the hostname.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// Specify the identifier of the hostname.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetWeb3HostnameArgs()
        {
        }
        public static new GetWeb3HostnameArgs Empty => new GetWeb3HostnameArgs();
    }

    public sealed class GetWeb3HostnameInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specify the identifier of the hostname.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Specify the identifier of the hostname.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetWeb3HostnameInvokeArgs()
        {
        }
        public static new GetWeb3HostnameInvokeArgs Empty => new GetWeb3HostnameInvokeArgs();
    }


    [OutputType]
    public sealed class GetWeb3HostnameResult
    {
        public readonly string CreatedOn;
        /// <summary>
        /// Specify an optional description of the hostname.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Specify the DNSLink value used if the target is ipfs.
        /// </summary>
        public readonly string Dnslink;
        /// <summary>
        /// Specify the identifier of the hostname.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specify the identifier of the hostname.
        /// </summary>
        public readonly string? Identifier;
        public readonly string ModifiedOn;
        /// <summary>
        /// Specify the hostname that points to the target gateway via CNAME.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Specifies the status of the hostname's activation.
        /// Available values: "active", "pending", "deleting", "error".
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Specify the target gateway of the hostname.
        /// Available values: "ethereum", "ipfs", "ipfs*universal*path".
        /// </summary>
        public readonly string Target;
        /// <summary>
        /// Specify the identifier of the hostname.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetWeb3HostnameResult(
            string createdOn,

            string description,

            string dnslink,

            string id,

            string? identifier,

            string modifiedOn,

            string name,

            string status,

            string target,

            string zoneId)
        {
            CreatedOn = createdOn;
            Description = description;
            Dnslink = dnslink;
            Id = id;
            Identifier = identifier;
            ModifiedOn = modifiedOn;
            Name = name;
            Status = status;
            Target = target;
            ZoneId = zoneId;
        }
    }
}
