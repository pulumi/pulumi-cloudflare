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
    public sealed class RulesetRuleActionParametersCacheKeyCustomKeyUser
    {
        /// <summary>
        /// Add device type to the custom key.
        /// </summary>
        public readonly bool? DeviceType;
        /// <summary>
        /// Add geo data to the custom key.
        /// </summary>
        public readonly bool? Geo;
        /// <summary>
        /// Add language data to the custom key.
        /// </summary>
        public readonly bool? Lang;

        [OutputConstructor]
        private RulesetRuleActionParametersCacheKeyCustomKeyUser(
            bool? deviceType,

            bool? geo,

            bool? lang)
        {
            DeviceType = deviceType;
            Geo = geo;
            Lang = lang;
        }
    }
}
