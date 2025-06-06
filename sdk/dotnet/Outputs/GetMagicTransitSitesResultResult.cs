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
    public sealed class GetMagicTransitSitesResultResult
    {
        /// <summary>
        /// Magic Connector identifier tag.
        /// </summary>
        public readonly string ConnectorId;
        public readonly string Description;
        /// <summary>
        /// Site high availability mode. If set to true, the site can have two connectors and runs in high availability mode.
        /// </summary>
        public readonly bool HaMode;
        /// <summary>
        /// Identifier
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Location of site in latitude and longitude.
        /// </summary>
        public readonly Outputs.GetMagicTransitSitesResultLocationResult Location;
        /// <summary>
        /// The name of the site.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Magic Connector identifier tag. Used when high availability mode is on.
        /// </summary>
        public readonly string SecondaryConnectorId;

        [OutputConstructor]
        private GetMagicTransitSitesResultResult(
            string connectorId,

            string description,

            bool haMode,

            string id,

            Outputs.GetMagicTransitSitesResultLocationResult location,

            string name,

            string secondaryConnectorId)
        {
            ConnectorId = connectorId;
            Description = description;
            HaMode = haMode;
            Id = id;
            Location = location;
            Name = name;
            SecondaryConnectorId = secondaryConnectorId;
        }
    }
}
