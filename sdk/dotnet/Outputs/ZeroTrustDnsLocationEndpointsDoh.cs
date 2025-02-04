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
    public sealed class ZeroTrustDnsLocationEndpointsDoh
    {
        public readonly bool? AuthenticationEnabled;
        public readonly bool Enabled;
        public readonly ImmutableArray<Outputs.ZeroTrustDnsLocationEndpointsDohNetwork> Networks;
        public readonly bool? RequireToken;

        [OutputConstructor]
        private ZeroTrustDnsLocationEndpointsDoh(
            bool? authenticationEnabled,

            bool enabled,

            ImmutableArray<Outputs.ZeroTrustDnsLocationEndpointsDohNetwork> networks,

            bool? requireToken)
        {
            AuthenticationEnabled = authenticationEnabled;
            Enabled = enabled;
            Networks = networks;
            RequireToken = requireToken;
        }
    }
}
