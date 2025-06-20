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
    public sealed class GetZeroTrustDevicePostureIntegrationsResultResult
    {
        /// <summary>
        /// The configuration object containing third-party integration information.
        /// </summary>
        public readonly Outputs.GetZeroTrustDevicePostureIntegrationsResultConfigResult Config;
        /// <summary>
        /// API UUID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The interval between each posture check with the third-party API. Use `m` for minutes (e.g. `5m`) and `h` for hours (e.g. `12h`).
        /// </summary>
        public readonly string Interval;
        /// <summary>
        /// The name of the device posture integration.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The type of device posture integration.
        /// Available values: "workspace*one", "crowdstrike*s2s", "uptycs", "intune", "kolide", "tanium*s2s", "sentinelone*s2s", "custom_s2s".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetZeroTrustDevicePostureIntegrationsResultResult(
            Outputs.GetZeroTrustDevicePostureIntegrationsResultConfigResult config,

            string id,

            string interval,

            string name,

            string type)
        {
            Config = config;
            Id = id;
            Interval = interval;
            Name = name;
            Type = type;
        }
    }
}
