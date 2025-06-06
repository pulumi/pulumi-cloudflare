// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetAccounts
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
        ///     var exampleAccounts = Cloudflare.GetAccounts.Invoke(new()
        ///     {
        ///         Direction = "desc",
        ///         Name = "example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAccountsResult> InvokeAsync(GetAccountsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountsResult>("cloudflare:index/getAccounts:getAccounts", args ?? new GetAccountsArgs(), options.WithDefaults());

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
        ///     var exampleAccounts = Cloudflare.GetAccounts.Invoke(new()
        ///     {
        ///         Direction = "desc",
        ///         Name = "example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountsResult> Invoke(GetAccountsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountsResult>("cloudflare:index/getAccounts:getAccounts", args ?? new GetAccountsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleAccounts = Cloudflare.GetAccounts.Invoke(new()
        ///     {
        ///         Direction = "desc",
        ///         Name = "example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountsResult> Invoke(GetAccountsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountsResult>("cloudflare:index/getAccounts:getAccounts", args ?? new GetAccountsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Direction to order results.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public string? Direction { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        /// <summary>
        /// Name of the account.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetAccountsArgs()
        {
        }
        public static new GetAccountsArgs Empty => new GetAccountsArgs();
    }

    public sealed class GetAccountsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Direction to order results.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        /// <summary>
        /// Name of the account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetAccountsInvokeArgs()
        {
        }
        public static new GetAccountsInvokeArgs Empty => new GetAccountsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountsResult
    {
        /// <summary>
        /// Direction to order results.
        /// Available values: "asc", "desc".
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// Name of the account.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccountsResultResult> Results;

        [OutputConstructor]
        private GetAccountsResult(
            string? direction,

            string id,

            int? maxItems,

            string? name,

            ImmutableArray<Outputs.GetAccountsResultResult> results)
        {
            Direction = direction;
            Id = id;
            MaxItems = maxItems;
            Name = name;
            Results = results;
        }
    }
}
