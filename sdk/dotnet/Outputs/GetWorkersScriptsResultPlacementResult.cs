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
    public sealed class GetWorkersScriptsResultPlacementResult
    {
        /// <summary>
        /// The last time the script was analyzed for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement).
        /// </summary>
        public readonly string LastAnalyzedAt;
        /// <summary>
        /// Enables [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement).
        /// Available values: "smart".
        /// </summary>
        public readonly string Mode;
        /// <summary>
        /// Status of [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement).
        /// Available values: "SUCCESS", "UNSUPPORTED*APPLICATION", "INSUFFICIENT*INVOCATIONS".
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetWorkersScriptsResultPlacementResult(
            string lastAnalyzedAt,

            string mode,

            string status)
        {
            LastAnalyzedAt = lastAnalyzedAt;
            Mode = mode;
            Status = status;
        }
    }
}
