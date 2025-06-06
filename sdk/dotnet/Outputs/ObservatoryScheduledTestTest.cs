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
    public sealed class ObservatoryScheduledTestTest
    {
        public readonly string? Date;
        /// <summary>
        /// The Lighthouse report.
        /// </summary>
        public readonly Outputs.ObservatoryScheduledTestTestDesktopReport? DesktopReport;
        /// <summary>
        /// UUID.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The Lighthouse report.
        /// </summary>
        public readonly Outputs.ObservatoryScheduledTestTestMobileReport? MobileReport;
        /// <summary>
        /// A test region with a label.
        /// </summary>
        public readonly Outputs.ObservatoryScheduledTestTestRegion? Region;
        /// <summary>
        /// The frequency of the test.
        /// Available values: "DAILY", "WEEKLY".
        /// </summary>
        public readonly string? ScheduleFrequency;
        /// <summary>
        /// A URL.
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private ObservatoryScheduledTestTest(
            string? date,

            Outputs.ObservatoryScheduledTestTestDesktopReport? desktopReport,

            string? id,

            Outputs.ObservatoryScheduledTestTestMobileReport? mobileReport,

            Outputs.ObservatoryScheduledTestTestRegion? region,

            string? scheduleFrequency,

            string? url)
        {
            Date = date;
            DesktopReport = desktopReport;
            Id = id;
            MobileReport = mobileReport;
            Region = region;
            ScheduleFrequency = scheduleFrequency;
            Url = url;
        }
    }
}
