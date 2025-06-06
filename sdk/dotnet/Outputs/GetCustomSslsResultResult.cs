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
    public sealed class GetCustomSslsResultResult
    {
        /// <summary>
        /// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
        /// Available values: "ubiquitous", "optimal", "force".
        /// </summary>
        public readonly string BundleMethod;
        /// <summary>
        /// When the certificate from the authority expires.
        /// </summary>
        public readonly string ExpiresOn;
        /// <summary>
        /// Specify the region where your private key can be held locally for optimal TLS performance. HTTPS connections to any excluded data center will still be fully encrypted, but will incur some latency while Keyless SSL is used to complete the handshake with the nearest allowed data center. Options allow distribution to only to U.S. data centers, only to E.U. data centers, or only to highest security data centers. Default distribution is to all Cloudflare datacenters, for optimal performance.
        /// </summary>
        public readonly Outputs.GetCustomSslsResultGeoRestrictionsResult GeoRestrictions;
        public readonly ImmutableArray<string> Hosts;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The certificate authority that issued the certificate.
        /// </summary>
        public readonly string Issuer;
        public readonly Outputs.GetCustomSslsResultKeylessServerResult KeylessServer;
        /// <summary>
        /// When the certificate was last modified.
        /// </summary>
        public readonly string ModifiedOn;
        /// <summary>
        /// Specify the policy that determines the region where your private key will be held locally. HTTPS connections to any excluded data center will still be fully encrypted, but will incur some latency while Keyless SSL is used to complete the handshake with the nearest allowed data center. Any combination of countries, specified by their two letter country code (https://en.wikipedia.org/wiki/ISO*3166-1*alpha-2#Officially*assigned*code_elements) can be chosen, such as 'country: IN', as well as 'region: EU' which refers to the EU region. If there are too few data centers satisfying the policy, it will be rejected.
        /// </summary>
        public readonly string Policy;
        /// <summary>
        /// The order/priority in which the certificate will be used in a request. The higher priority will break ties across overlapping 'legacy*custom' certificates, but 'legacy*custom' certificates will always supercede 'sni_custom' certificates.
        /// </summary>
        public readonly double Priority;
        /// <summary>
        /// The type of hash used for the certificate.
        /// </summary>
        public readonly string Signature;
        /// <summary>
        /// Status of the zone's custom SSL.
        /// Available values: "active", "expired", "deleted", "pending", "initializing".
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// When the certificate was uploaded to Cloudflare.
        /// </summary>
        public readonly string UploadedOn;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetCustomSslsResultResult(
            string bundleMethod,

            string expiresOn,

            Outputs.GetCustomSslsResultGeoRestrictionsResult geoRestrictions,

            ImmutableArray<string> hosts,

            string id,

            string issuer,

            Outputs.GetCustomSslsResultKeylessServerResult keylessServer,

            string modifiedOn,

            string policy,

            double priority,

            string signature,

            string status,

            string uploadedOn,

            string zoneId)
        {
            BundleMethod = bundleMethod;
            ExpiresOn = expiresOn;
            GeoRestrictions = geoRestrictions;
            Hosts = hosts;
            Id = id;
            Issuer = issuer;
            KeylessServer = keylessServer;
            ModifiedOn = modifiedOn;
            Policy = policy;
            Priority = priority;
            Signature = signature;
            Status = status;
            UploadedOn = uploadedOn;
            ZoneId = zoneId;
        }
    }
}
