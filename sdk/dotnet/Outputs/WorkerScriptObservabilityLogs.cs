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
    public sealed class WorkerScriptObservabilityLogs
    {
        /// <summary>
        /// Whether logs are enabled for the Worker.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The sampling rate for logs. From 0 to 1 (1 = 100%, 0.1 = 10%). Default is 1.
        /// </summary>
        public readonly double? HeadSamplingRate;
        /// <summary>
        /// Whether [invocation logs](https://developers.cloudflare.com/workers/observability/logs/workers-logs/#invocation-logs) are enabled for the Worker.
        /// </summary>
        public readonly bool InvocationLogs;

        [OutputConstructor]
        private WorkerScriptObservabilityLogs(
            bool enabled,

            double? headSamplingRate,

            bool invocationLogs)
        {
            Enabled = enabled;
            HeadSamplingRate = headSamplingRate;
            InvocationLogs = invocationLogs;
        }
    }
}
