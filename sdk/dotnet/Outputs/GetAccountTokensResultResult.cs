// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetAccountTokensResultResult
    {
        public readonly Outputs.GetAccountTokensResultConditionResult Condition;
        /// <summary>
        /// The expiration time on or after which the JWT MUST NOT be accepted for processing.
        /// </summary>
        public readonly string ExpiresOn;
        /// <summary>
        /// Token identifier tag.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The time on which the token was created.
        /// </summary>
        public readonly string IssuedOn;
        /// <summary>
        /// Last time the token was used.
        /// </summary>
        public readonly string LastUsedOn;
        /// <summary>
        /// Last time the token was modified.
        /// </summary>
        public readonly string ModifiedOn;
        /// <summary>
        /// Token name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The time before which the token MUST NOT be accepted for processing.
        /// </summary>
        public readonly string NotBefore;
        /// <summary>
        /// List of access policies assigned to the token.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccountTokensResultPolicyResult> Policies;
        /// <summary>
        /// Status of the token.
        /// Available values: "active", "disabled", "expired".
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetAccountTokensResultResult(
            Outputs.GetAccountTokensResultConditionResult condition,

            string expiresOn,

            string id,

            string issuedOn,

            string lastUsedOn,

            string modifiedOn,

            string name,

            string notBefore,

            ImmutableArray<Outputs.GetAccountTokensResultPolicyResult> policies,

            string status)
        {
            Condition = condition;
            ExpiresOn = expiresOn;
            Id = id;
            IssuedOn = issuedOn;
            LastUsedOn = lastUsedOn;
            ModifiedOn = modifiedOn;
            Name = name;
            NotBefore = notBefore;
            Policies = policies;
            Status = status;
        }
    }
}
