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
    public sealed class R2BucketLifecycleRule
    {
        /// <summary>
        /// Transition to abort ongoing multipart uploads.
        /// </summary>
        public readonly Outputs.R2BucketLifecycleRuleAbortMultipartUploadsTransition? AbortMultipartUploadsTransition;
        /// <summary>
        /// Conditions that apply to all transitions of this rule.
        /// </summary>
        public readonly Outputs.R2BucketLifecycleRuleConditions Conditions;
        /// <summary>
        /// Transition to delete objects.
        /// </summary>
        public readonly Outputs.R2BucketLifecycleRuleDeleteObjectsTransition? DeleteObjectsTransition;
        /// <summary>
        /// Whether or not this rule is in effect.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Unique identifier for this rule.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Transitions to change the storage class of objects.
        /// </summary>
        public readonly ImmutableArray<Outputs.R2BucketLifecycleRuleStorageClassTransition> StorageClassTransitions;

        [OutputConstructor]
        private R2BucketLifecycleRule(
            Outputs.R2BucketLifecycleRuleAbortMultipartUploadsTransition? abortMultipartUploadsTransition,

            Outputs.R2BucketLifecycleRuleConditions conditions,

            Outputs.R2BucketLifecycleRuleDeleteObjectsTransition? deleteObjectsTransition,

            bool enabled,

            string id,

            ImmutableArray<Outputs.R2BucketLifecycleRuleStorageClassTransition> storageClassTransitions)
        {
            AbortMultipartUploadsTransition = abortMultipartUploadsTransition;
            Conditions = conditions;
            DeleteObjectsTransition = deleteObjectsTransition;
            Enabled = enabled;
            Id = id;
            StorageClassTransitions = storageClassTransitions;
        }
    }
}
