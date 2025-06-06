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
    public sealed class ZeroTrustDlpCustomProfileProfileContextAwareness
    {
        /// <summary>
        /// If true, scan the context of predefined entries to only return matches surrounded by keywords.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Content types to exclude from context analysis and return all matches.
        /// </summary>
        public readonly Outputs.ZeroTrustDlpCustomProfileProfileContextAwarenessSkip Skip;

        [OutputConstructor]
        private ZeroTrustDlpCustomProfileProfileContextAwareness(
            bool enabled,

            Outputs.ZeroTrustDlpCustomProfileProfileContextAwarenessSkip skip)
        {
            Enabled = enabled;
            Skip = skip;
        }
    }
}
