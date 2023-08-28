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
    public sealed class AccessOrganizationCustomPage
    {
        /// <summary>
        /// The id of the forbidden page.
        /// </summary>
        public readonly string? Forbidden;
        /// <summary>
        /// The id of the identity denied page.
        /// </summary>
        public readonly string? IdentityDenied;

        [OutputConstructor]
        private AccessOrganizationCustomPage(
            string? forbidden,

            string? identityDenied)
        {
            Forbidden = forbidden;
            IdentityDenied = identityDenied;
        }
    }
}