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
    public sealed class GetZeroTrustAccessApplicationsResultFooterLinkResult
    {
        /// <summary>
        /// The hypertext in the footer link.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// the hyperlink in the footer link.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetZeroTrustAccessApplicationsResultFooterLinkResult(
            string name,

            string url)
        {
            Name = name;
            Url = url;
        }
    }
}
