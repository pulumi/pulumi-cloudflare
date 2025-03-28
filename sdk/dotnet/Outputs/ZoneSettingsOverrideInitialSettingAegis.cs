// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ZoneSettingsOverrideInitialSettingAegis
    {
        /// <summary>
        /// Whether Aegis zone setting is enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Egress pool id which refers to a grouping of dedicated egress IPs through which Cloudflare will connect to origin.
        /// </summary>
        public readonly string? PoolId;

        [OutputConstructor]
        private ZoneSettingsOverrideInitialSettingAegis(
            bool? enabled,

            string? poolId)
        {
            Enabled = enabled;
            PoolId = poolId;
        }
    }
}
