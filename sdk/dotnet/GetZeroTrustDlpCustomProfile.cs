// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustDlpCustomProfile
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
        ///     var exampleZeroTrustDlpCustomProfile = Cloudflare.GetZeroTrustDlpCustomProfile.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         ProfileId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustDlpCustomProfileResult> InvokeAsync(GetZeroTrustDlpCustomProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustDlpCustomProfileResult>("cloudflare:index/getZeroTrustDlpCustomProfile:getZeroTrustDlpCustomProfile", args ?? new GetZeroTrustDlpCustomProfileArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustDlpCustomProfile = Cloudflare.GetZeroTrustDlpCustomProfile.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         ProfileId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustDlpCustomProfileResult> Invoke(GetZeroTrustDlpCustomProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustDlpCustomProfileResult>("cloudflare:index/getZeroTrustDlpCustomProfile:getZeroTrustDlpCustomProfile", args ?? new GetZeroTrustDlpCustomProfileInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustDlpCustomProfile = Cloudflare.GetZeroTrustDlpCustomProfile.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         ProfileId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustDlpCustomProfileResult> Invoke(GetZeroTrustDlpCustomProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustDlpCustomProfileResult>("cloudflare:index/getZeroTrustDlpCustomProfile:getZeroTrustDlpCustomProfile", args ?? new GetZeroTrustDlpCustomProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustDlpCustomProfileArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("profileId", required: true)]
        public string ProfileId { get; set; } = null!;

        public GetZeroTrustDlpCustomProfileArgs()
        {
        }
        public static new GetZeroTrustDlpCustomProfileArgs Empty => new GetZeroTrustDlpCustomProfileArgs();
    }

    public sealed class GetZeroTrustDlpCustomProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("profileId", required: true)]
        public Input<string> ProfileId { get; set; } = null!;

        public GetZeroTrustDlpCustomProfileInvokeArgs()
        {
        }
        public static new GetZeroTrustDlpCustomProfileInvokeArgs Empty => new GetZeroTrustDlpCustomProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustDlpCustomProfileResult
    {
        public readonly string AccountId;
        public readonly bool AiContextEnabled;
        /// <summary>
        /// Related DLP policies will trigger when the match count exceeds the number set.
        /// </summary>
        public readonly int AllowedMatchCount;
        /// <summary>
        /// Available values: "low", "medium", "high", "very_high".
        /// </summary>
        public readonly string ConfidenceThreshold;
        /// <summary>
        /// Scan the context of predefined entries to only return matches surrounded by keywords.
        /// </summary>
        public readonly Outputs.GetZeroTrustDlpCustomProfileContextAwarenessResult ContextAwareness;
        /// <summary>
        /// When the profile was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The description of the profile.
        /// </summary>
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetZeroTrustDlpCustomProfileEntryResult> Entries;
        /// <summary>
        /// The id of the profile (uuid).
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the profile.
        /// </summary>
        public readonly string Name;
        public readonly bool OcrEnabled;
        /// <summary>
        /// Whether this profile can be accessed by anyone.
        /// </summary>
        public readonly bool OpenAccess;
        public readonly string ProfileId;
        /// <summary>
        /// Available values: "custom", "predefined", "integration".
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// When the profile was lasted updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetZeroTrustDlpCustomProfileResult(
            string accountId,

            bool aiContextEnabled,

            int allowedMatchCount,

            string confidenceThreshold,

            Outputs.GetZeroTrustDlpCustomProfileContextAwarenessResult contextAwareness,

            string createdAt,

            string description,

            ImmutableArray<Outputs.GetZeroTrustDlpCustomProfileEntryResult> entries,

            string id,

            string name,

            bool ocrEnabled,

            bool openAccess,

            string profileId,

            string type,

            string updatedAt)
        {
            AccountId = accountId;
            AiContextEnabled = aiContextEnabled;
            AllowedMatchCount = allowedMatchCount;
            ConfidenceThreshold = confidenceThreshold;
            ContextAwareness = contextAwareness;
            CreatedAt = createdAt;
            Description = description;
            Entries = entries;
            Id = id;
            Name = name;
            OcrEnabled = ocrEnabled;
            OpenAccess = openAccess;
            ProfileId = profileId;
            Type = type;
            UpdatedAt = updatedAt;
        }
    }
}
