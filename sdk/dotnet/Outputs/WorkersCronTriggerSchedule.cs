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
    public sealed class WorkersCronTriggerSchedule
    {
        public readonly string? CreatedOn;
        public readonly string Cron;
        public readonly string? ModifiedOn;

        [OutputConstructor]
        private WorkersCronTriggerSchedule(
            string? createdOn,

            string cron,

            string? modifiedOn)
        {
            CreatedOn = createdOn;
            Cron = cron;
            ModifiedOn = modifiedOn;
        }
    }
}
