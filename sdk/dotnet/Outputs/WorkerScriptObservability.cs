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
    public sealed class WorkerScriptObservability
    {
        /// <summary>
        /// Whether observability is enabled for the Worker.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The sampling rate for incoming requests. From 0 to 1 (1 = 100%, 0.1 = 10%). Default is 1.
        /// </summary>
        public readonly double? HeadSamplingRate;
        /// <summary>
        /// Log settings for the Worker.
        /// </summary>
        public readonly Outputs.WorkerScriptObservabilityLogs? Logs;

        [OutputConstructor]
        private WorkerScriptObservability(
            bool enabled,

            double? headSamplingRate,

            Outputs.WorkerScriptObservabilityLogs? logs)
        {
            Enabled = enabled;
            HeadSamplingRate = headSamplingRate;
            Logs = logs;
        }
    }
}
