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
    public sealed class GetR2BucketEventNotificationConditionsResult
    {
        /// <summary>
        /// Transitions will only apply to objects/uploads in the bucket that start with the given prefix, an empty prefix can be provided to scope rule to all objects/uploads.
        /// </summary>
        public readonly string Prefix;

        [OutputConstructor]
        private GetR2BucketEventNotificationConditionsResult(string prefix)
        {
            Prefix = prefix;
        }
    }
}
