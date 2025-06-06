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
    public sealed class GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsResult
    {
        /// <summary>
        /// Upper and lower bound for percentile estimate
        /// </summary>
        public readonly Outputs.GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Result P90;
        /// <summary>
        /// Upper and lower bound for percentile estimate
        /// </summary>
        public readonly Outputs.GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Result P95;
        /// <summary>
        /// Upper and lower bound for percentile estimate
        /// </summary>
        public readonly Outputs.GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Result P99;

        [OutputConstructor]
        private GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsResult(
            Outputs.GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Result p90,

            Outputs.GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Result p95,

            Outputs.GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Result p99)
        {
            P90 = p90;
            P95 = p95;
            P99 = p99;
        }
    }
}
