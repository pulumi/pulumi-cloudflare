// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetLogpullRetention
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
        ///     var exampleLogpullRetention = Cloudflare.GetLogpullRetention.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLogpullRetentionResult> InvokeAsync(GetLogpullRetentionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLogpullRetentionResult>("cloudflare:index/getLogpullRetention:getLogpullRetention", args ?? new GetLogpullRetentionArgs(), options.WithDefaults());

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
        ///     var exampleLogpullRetention = Cloudflare.GetLogpullRetention.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLogpullRetentionResult> Invoke(GetLogpullRetentionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogpullRetentionResult>("cloudflare:index/getLogpullRetention:getLogpullRetention", args ?? new GetLogpullRetentionInvokeArgs(), options.WithDefaults());

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
        ///     var exampleLogpullRetention = Cloudflare.GetLogpullRetention.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLogpullRetentionResult> Invoke(GetLogpullRetentionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogpullRetentionResult>("cloudflare:index/getLogpullRetention:getLogpullRetention", args ?? new GetLogpullRetentionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLogpullRetentionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetLogpullRetentionArgs()
        {
        }
        public static new GetLogpullRetentionArgs Empty => new GetLogpullRetentionArgs();
    }

    public sealed class GetLogpullRetentionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetLogpullRetentionInvokeArgs()
        {
        }
        public static new GetLogpullRetentionInvokeArgs Empty => new GetLogpullRetentionInvokeArgs();
    }


    [OutputType]
    public sealed class GetLogpullRetentionResult
    {
        /// <summary>
        /// The log retention flag for Logpull API.
        /// </summary>
        public readonly bool Flag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetLogpullRetentionResult(
            bool flag,

            string id,

            string zoneId)
        {
            Flag = flag;
            Id = id;
            ZoneId = zoneId;
        }
    }
}
