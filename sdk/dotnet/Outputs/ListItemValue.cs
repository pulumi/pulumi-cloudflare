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
    public sealed class ListItemValue
    {
        public readonly int? Asn;
        public readonly ImmutableArray<Outputs.ListItemValueHostname> Hostnames;
        public readonly string? Ip;
        public readonly ImmutableArray<Outputs.ListItemValueRedirect> Redirects;

        [OutputConstructor]
        private ListItemValue(
            int? asn,

            ImmutableArray<Outputs.ListItemValueHostname> hostnames,

            string? ip,

            ImmutableArray<Outputs.ListItemValueRedirect> redirects)
        {
            Asn = asn;
            Hostnames = hostnames;
            Ip = ip;
            Redirects = redirects;
        }
    }
}
