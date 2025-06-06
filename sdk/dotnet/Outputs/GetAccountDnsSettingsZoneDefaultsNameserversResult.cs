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
    public sealed class GetAccountDnsSettingsZoneDefaultsNameserversResult
    {
        /// <summary>
        /// Nameserver type
        /// Available values: "cloudflare.standard", "cloudflare.standard.random", "custom.account", "custom.tenant".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAccountDnsSettingsZoneDefaultsNameserversResult(string type)
        {
            Type = type;
        }
    }
}
