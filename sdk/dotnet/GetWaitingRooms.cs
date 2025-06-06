// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetWaitingRooms
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
        ///     var exampleWaitingRooms = Cloudflare.GetWaitingRooms.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         ZoneId = "zone_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWaitingRoomsResult> InvokeAsync(GetWaitingRoomsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWaitingRoomsResult>("cloudflare:index/getWaitingRooms:getWaitingRooms", args ?? new GetWaitingRoomsArgs(), options.WithDefaults());

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
        ///     var exampleWaitingRooms = Cloudflare.GetWaitingRooms.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         ZoneId = "zone_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWaitingRoomsResult> Invoke(GetWaitingRoomsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWaitingRoomsResult>("cloudflare:index/getWaitingRooms:getWaitingRooms", args ?? new GetWaitingRoomsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleWaitingRooms = Cloudflare.GetWaitingRooms.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         ZoneId = "zone_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWaitingRoomsResult> Invoke(GetWaitingRoomsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWaitingRoomsResult>("cloudflare:index/getWaitingRooms:getWaitingRooms", args ?? new GetWaitingRoomsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWaitingRoomsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetWaitingRoomsArgs()
        {
        }
        public static new GetWaitingRoomsArgs Empty => new GetWaitingRoomsArgs();
    }

    public sealed class GetWaitingRoomsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetWaitingRoomsInvokeArgs()
        {
        }
        public static new GetWaitingRoomsInvokeArgs Empty => new GetWaitingRoomsInvokeArgs();
    }


    [OutputType]
    public sealed class GetWaitingRoomsResult
    {
        /// <summary>
        /// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        /// </summary>
        public readonly string? AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWaitingRoomsResultResult> Results;
        /// <summary>
        /// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetWaitingRoomsResult(
            string? accountId,

            string id,

            int? maxItems,

            ImmutableArray<Outputs.GetWaitingRoomsResultResult> results,

            string? zoneId)
        {
            AccountId = accountId;
            Id = id;
            MaxItems = maxItems;
            Results = results;
            ZoneId = zoneId;
        }
    }
}
