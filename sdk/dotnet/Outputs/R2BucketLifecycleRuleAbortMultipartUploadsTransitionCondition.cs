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
    public sealed class R2BucketLifecycleRuleAbortMultipartUploadsTransitionCondition
    {
        public readonly int MaxAge;
        /// <summary>
        /// Available values: "Age".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private R2BucketLifecycleRuleAbortMultipartUploadsTransitionCondition(
            int maxAge,

            string type)
        {
            MaxAge = maxAge;
            Type = type;
        }
    }
}
