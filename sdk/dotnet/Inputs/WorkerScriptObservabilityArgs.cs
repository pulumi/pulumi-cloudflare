// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkerScriptObservabilityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether observability is enabled for the Worker.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The sampling rate for incoming requests. From 0 to 1 (1 = 100%, 0.1 = 10%). Default is 1.
        /// </summary>
        [Input("headSamplingRate")]
        public Input<double>? HeadSamplingRate { get; set; }

        /// <summary>
        /// Log settings for the Worker.
        /// </summary>
        [Input("logs")]
        public Input<Inputs.WorkerScriptObservabilityLogsArgs>? Logs { get; set; }

        public WorkerScriptObservabilityArgs()
        {
        }
        public static new WorkerScriptObservabilityArgs Empty => new WorkerScriptObservabilityArgs();
    }
}
