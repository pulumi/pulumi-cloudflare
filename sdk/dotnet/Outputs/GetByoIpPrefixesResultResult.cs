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
    public sealed class GetByoIpPrefixesResultResult
    {
        /// <summary>
        /// Identifier of a Cloudflare account.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Prefix advertisement status to the Internet. This field is only not 'null' if on demand is enabled.
        /// </summary>
        public readonly bool Advertised;
        /// <summary>
        /// Last time the advertisement status was changed. This field is only not 'null' if on demand is enabled.
        /// </summary>
        public readonly string AdvertisedModifiedAt;
        /// <summary>
        /// Approval state of the prefix (P = pending, V = active).
        /// </summary>
        public readonly string Approved;
        /// <summary>
        /// Autonomous System Number (ASN) the prefix will be advertised under.
        /// </summary>
        public readonly int Asn;
        /// <summary>
        /// IP Prefix in Classless Inter-Domain Routing format.
        /// </summary>
        public readonly string Cidr;
        public readonly string CreatedAt;
        /// <summary>
        /// Description of the prefix.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Identifier of an IP Prefix.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier for the uploaded LOA document.
        /// </summary>
        public readonly string LoaDocumentId;
        public readonly string ModifiedAt;
        /// <summary>
        /// Whether advertisement of the prefix to the Internet may be dynamically enabled or disabled.
        /// </summary>
        public readonly bool OnDemandEnabled;
        /// <summary>
        /// Whether advertisement status of the prefix is locked, meaning it cannot be changed.
        /// </summary>
        public readonly bool OnDemandLocked;

        [OutputConstructor]
        private GetByoIpPrefixesResultResult(
            string accountId,

            bool advertised,

            string advertisedModifiedAt,

            string approved,

            int asn,

            string cidr,

            string createdAt,

            string description,

            string id,

            string loaDocumentId,

            string modifiedAt,

            bool onDemandEnabled,

            bool onDemandLocked)
        {
            AccountId = accountId;
            Advertised = advertised;
            AdvertisedModifiedAt = advertisedModifiedAt;
            Approved = approved;
            Asn = asn;
            Cidr = cidr;
            CreatedAt = createdAt;
            Description = description;
            Id = id;
            LoaDocumentId = loaDocumentId;
            ModifiedAt = modifiedAt;
            OnDemandEnabled = onDemandEnabled;
            OnDemandLocked = onDemandLocked;
        }
    }
}
