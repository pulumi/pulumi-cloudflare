// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetImageVariant
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
        ///     var exampleImageVariant = Cloudflare.GetImageVariant.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         VariantId = "hero",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetImageVariantResult> InvokeAsync(GetImageVariantArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetImageVariantResult>("cloudflare:index/getImageVariant:getImageVariant", args ?? new GetImageVariantArgs(), options.WithDefaults());

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
        ///     var exampleImageVariant = Cloudflare.GetImageVariant.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         VariantId = "hero",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetImageVariantResult> Invoke(GetImageVariantInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetImageVariantResult>("cloudflare:index/getImageVariant:getImageVariant", args ?? new GetImageVariantInvokeArgs(), options.WithDefaults());

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
        ///     var exampleImageVariant = Cloudflare.GetImageVariant.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         VariantId = "hero",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetImageVariantResult> Invoke(GetImageVariantInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetImageVariantResult>("cloudflare:index/getImageVariant:getImageVariant", args ?? new GetImageVariantInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImageVariantArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier tag.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("variantId", required: true)]
        public string VariantId { get; set; } = null!;

        public GetImageVariantArgs()
        {
        }
        public static new GetImageVariantArgs Empty => new GetImageVariantArgs();
    }

    public sealed class GetImageVariantInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier tag.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("variantId", required: true)]
        public Input<string> VariantId { get; set; } = null!;

        public GetImageVariantInvokeArgs()
        {
        }
        public static new GetImageVariantInvokeArgs Empty => new GetImageVariantInvokeArgs();
    }


    [OutputType]
    public sealed class GetImageVariantResult
    {
        /// <summary>
        /// Account identifier tag.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetImageVariantVariantResult Variant;
        public readonly string VariantId;

        [OutputConstructor]
        private GetImageVariantResult(
            string accountId,

            string id,

            Outputs.GetImageVariantVariantResult variant,

            string variantId)
        {
            AccountId = accountId;
            Id = id;
            Variant = variant;
            VariantId = variantId;
        }
    }
}
