// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkerCronTriggerScheduleArgs : global::Pulumi.ResourceArgs
    {
        [Input("cron", required: true)]
        public Input<string> Cron { get; set; } = null!;

        public WorkerCronTriggerScheduleArgs()
        {
        }
        public static new WorkerCronTriggerScheduleArgs Empty => new WorkerCronTriggerScheduleArgs();
    }
}
