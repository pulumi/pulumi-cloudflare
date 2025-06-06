// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetR2BucketCors
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
        ///     var exampleR2BucketCors = Cloudflare.GetR2BucketCors.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         BucketName = "example-bucket",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetR2BucketCorsResult> InvokeAsync(GetR2BucketCorsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetR2BucketCorsResult>("cloudflare:index/getR2BucketCors:getR2BucketCors", args ?? new GetR2BucketCorsArgs(), options.WithDefaults());

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
        ///     var exampleR2BucketCors = Cloudflare.GetR2BucketCors.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         BucketName = "example-bucket",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetR2BucketCorsResult> Invoke(GetR2BucketCorsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetR2BucketCorsResult>("cloudflare:index/getR2BucketCors:getR2BucketCors", args ?? new GetR2BucketCorsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleR2BucketCors = Cloudflare.GetR2BucketCors.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         BucketName = "example-bucket",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetR2BucketCorsResult> Invoke(GetR2BucketCorsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetR2BucketCorsResult>("cloudflare:index/getR2BucketCors:getR2BucketCors", args ?? new GetR2BucketCorsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetR2BucketCorsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account ID.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("bucketName", required: true)]
        public string BucketName { get; set; } = null!;

        public GetR2BucketCorsArgs()
        {
        }
        public static new GetR2BucketCorsArgs Empty => new GetR2BucketCorsArgs();
    }

    public sealed class GetR2BucketCorsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account ID.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        public GetR2BucketCorsInvokeArgs()
        {
        }
        public static new GetR2BucketCorsInvokeArgs Empty => new GetR2BucketCorsInvokeArgs();
    }


    [OutputType]
    public sealed class GetR2BucketCorsResult
    {
        /// <summary>
        /// Account ID.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetR2BucketCorsRuleResult> Rules;

        [OutputConstructor]
        private GetR2BucketCorsResult(
            string accountId,

            string bucketName,

            string id,

            ImmutableArray<Outputs.GetR2BucketCorsRuleResult> rules)
        {
            AccountId = accountId;
            BucketName = bucketName;
            Id = id;
            Rules = rules;
        }
    }
}
