// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetGatewayAppTypes
    {
        /// <summary>
        /// Use this data source to retrieve all Gateway application types for an account.
        /// 
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
        ///     var example = Cloudflare.GetGatewayAppTypes.Invoke(new()
        ///     {
        ///         AccountId = "f037e56e89293a057740de681ac9abbe",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGatewayAppTypesResult> InvokeAsync(GetGatewayAppTypesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGatewayAppTypesResult>("cloudflare:index/getGatewayAppTypes:getGatewayAppTypes", args ?? new GetGatewayAppTypesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve all Gateway application types for an account.
        /// 
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
        ///     var example = Cloudflare.GetGatewayAppTypes.Invoke(new()
        ///     {
        ///         AccountId = "f037e56e89293a057740de681ac9abbe",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGatewayAppTypesResult> Invoke(GetGatewayAppTypesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGatewayAppTypesResult>("cloudflare:index/getGatewayAppTypes:getGatewayAppTypes", args ?? new GetGatewayAppTypesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve all Gateway application types for an account.
        /// 
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
        ///     var example = Cloudflare.GetGatewayAppTypes.Invoke(new()
        ///     {
        ///         AccountId = "f037e56e89293a057740de681ac9abbe",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGatewayAppTypesResult> Invoke(GetGatewayAppTypesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGatewayAppTypesResult>("cloudflare:index/getGatewayAppTypes:getGatewayAppTypes", args ?? new GetGatewayAppTypesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGatewayAppTypesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account ID to fetch Gateway App Types from.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        public GetGatewayAppTypesArgs()
        {
        }
        public static new GetGatewayAppTypesArgs Empty => new GetGatewayAppTypesArgs();
    }

    public sealed class GetGatewayAppTypesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account ID to fetch Gateway App Types from.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        public GetGatewayAppTypesInvokeArgs()
        {
        }
        public static new GetGatewayAppTypesInvokeArgs Empty => new GetGatewayAppTypesInvokeArgs();
    }


    [OutputType]
    public sealed class GetGatewayAppTypesResult
    {
        /// <summary>
        /// The account ID to fetch Gateway App Types from.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// A list of Gateway App Types.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGatewayAppTypesAppTypeResult> AppTypes;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetGatewayAppTypesResult(
            string accountId,

            ImmutableArray<Outputs.GetGatewayAppTypesAppTypeResult> appTypes,

            string id)
        {
            AccountId = accountId;
            AppTypes = appTypes;
            Id = id;
        }
    }
}
