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
    public sealed class GetPageShieldConnectionsListResultResult
    {
        public readonly string AddedAt;
        public readonly bool DomainReportedMalicious;
        public readonly string FirstPageUrl;
        public readonly string FirstSeenAt;
        public readonly string Host;
        /// <summary>
        /// Identifier
        /// </summary>
        public readonly string Id;
        public readonly string LastSeenAt;
        public readonly ImmutableArray<string> MaliciousDomainCategories;
        public readonly ImmutableArray<string> MaliciousUrlCategories;
        public readonly ImmutableArray<string> PageUrls;
        public readonly string Url;
        public readonly bool UrlContainsCdnCgiPath;
        public readonly bool UrlReportedMalicious;

        [OutputConstructor]
        private GetPageShieldConnectionsListResultResult(
            string addedAt,

            bool domainReportedMalicious,

            string firstPageUrl,

            string firstSeenAt,

            string host,

            string id,

            string lastSeenAt,

            ImmutableArray<string> maliciousDomainCategories,

            ImmutableArray<string> maliciousUrlCategories,

            ImmutableArray<string> pageUrls,

            string url,

            bool urlContainsCdnCgiPath,

            bool urlReportedMalicious)
        {
            AddedAt = addedAt;
            DomainReportedMalicious = domainReportedMalicious;
            FirstPageUrl = firstPageUrl;
            FirstSeenAt = firstSeenAt;
            Host = host;
            Id = id;
            LastSeenAt = lastSeenAt;
            MaliciousDomainCategories = maliciousDomainCategories;
            MaliciousUrlCategories = maliciousUrlCategories;
            PageUrls = pageUrls;
            Url = url;
            UrlContainsCdnCgiPath = urlContainsCdnCgiPath;
            UrlReportedMalicious = urlReportedMalicious;
        }
    }
}
