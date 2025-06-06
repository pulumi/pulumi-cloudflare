// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustAccessPolicy
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
        ///     var exampleZeroTrustAccessPolicy = Cloudflare.GetZeroTrustAccessPolicy.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         PolicyId = "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustAccessPolicyResult> InvokeAsync(GetZeroTrustAccessPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustAccessPolicyResult>("cloudflare:index/getZeroTrustAccessPolicy:getZeroTrustAccessPolicy", args ?? new GetZeroTrustAccessPolicyArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustAccessPolicy = Cloudflare.GetZeroTrustAccessPolicy.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         PolicyId = "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustAccessPolicyResult> Invoke(GetZeroTrustAccessPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustAccessPolicyResult>("cloudflare:index/getZeroTrustAccessPolicy:getZeroTrustAccessPolicy", args ?? new GetZeroTrustAccessPolicyInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustAccessPolicy = Cloudflare.GetZeroTrustAccessPolicy.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         PolicyId = "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustAccessPolicyResult> Invoke(GetZeroTrustAccessPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustAccessPolicyResult>("cloudflare:index/getZeroTrustAccessPolicy:getZeroTrustAccessPolicy", args ?? new GetZeroTrustAccessPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustAccessPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// The UUID of the policy
        /// </summary>
        [Input("policyId")]
        public string? PolicyId { get; set; }

        public GetZeroTrustAccessPolicyArgs()
        {
        }
        public static new GetZeroTrustAccessPolicyArgs Empty => new GetZeroTrustAccessPolicyArgs();
    }

    public sealed class GetZeroTrustAccessPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The UUID of the policy
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        public GetZeroTrustAccessPolicyInvokeArgs()
        {
        }
        public static new GetZeroTrustAccessPolicyInvokeArgs Empty => new GetZeroTrustAccessPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustAccessPolicyResult
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Number of access applications currently using this policy.
        /// </summary>
        public readonly int AppCount;
        /// <summary>
        /// Administrators who can approve a temporary authentication request.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZeroTrustAccessPolicyApprovalGroupResult> ApprovalGroups;
        /// <summary>
        /// Requires the user to request access from an administrator at the start of each session.
        /// </summary>
        public readonly bool ApprovalRequired;
        public readonly string CreatedAt;
        /// <summary>
        /// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
        /// Available values: "allow", "deny", "non_identity", "bypass".
        /// </summary>
        public readonly string Decision;
        /// <summary>
        /// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZeroTrustAccessPolicyExcludeResult> Excludes;
        /// <summary>
        /// The UUID of the policy
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZeroTrustAccessPolicyIncludeResult> Includes;
        /// <summary>
        /// Require this application to be served in an isolated browser for users matching this policy. 'Client Web Isolation' must be on for the account in order to use this feature.
        /// </summary>
        public readonly bool IsolationRequired;
        /// <summary>
        /// The name of the Access policy.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The UUID of the policy
        /// </summary>
        public readonly string? PolicyId;
        /// <summary>
        /// A custom message that will appear on the purpose justification screen.
        /// </summary>
        public readonly string PurposeJustificationPrompt;
        /// <summary>
        /// Require users to enter a justification when they log in to the application.
        /// </summary>
        public readonly bool PurposeJustificationRequired;
        /// <summary>
        /// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZeroTrustAccessPolicyRequireResult> Requires;
        public readonly bool Reusable;
        /// <summary>
        /// The amount of time that tokens issued for the application will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
        /// </summary>
        public readonly string SessionDuration;
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetZeroTrustAccessPolicyResult(
            string accountId,

            int appCount,

            ImmutableArray<Outputs.GetZeroTrustAccessPolicyApprovalGroupResult> approvalGroups,

            bool approvalRequired,

            string createdAt,

            string decision,

            ImmutableArray<Outputs.GetZeroTrustAccessPolicyExcludeResult> excludes,

            string id,

            ImmutableArray<Outputs.GetZeroTrustAccessPolicyIncludeResult> includes,

            bool isolationRequired,

            string name,

            string? policyId,

            string purposeJustificationPrompt,

            bool purposeJustificationRequired,

            ImmutableArray<Outputs.GetZeroTrustAccessPolicyRequireResult> requires,

            bool reusable,

            string sessionDuration,

            string updatedAt)
        {
            AccountId = accountId;
            AppCount = appCount;
            ApprovalGroups = approvalGroups;
            ApprovalRequired = approvalRequired;
            CreatedAt = createdAt;
            Decision = decision;
            Excludes = excludes;
            Id = id;
            Includes = includes;
            IsolationRequired = isolationRequired;
            Name = name;
            PolicyId = policyId;
            PurposeJustificationPrompt = purposeJustificationPrompt;
            PurposeJustificationRequired = purposeJustificationRequired;
            Requires = requires;
            Reusable = reusable;
            SessionDuration = sessionDuration;
            UpdatedAt = updatedAt;
        }
    }
}
