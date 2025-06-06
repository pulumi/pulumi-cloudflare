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
    public sealed class GetZeroTrustGatewayAppTypesListResultResult
    {
        /// <summary>
        /// The identifier for the type of this application. There can be many applications with the same type. This refers to the `id` of a returned application type.
        /// </summary>
        public readonly int ApplicationTypeId;
        public readonly string CreatedAt;
        /// <summary>
        /// A short summary of applications with this type.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The identifier for this application. There is only one application per ID.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The name of the application or application type.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetZeroTrustGatewayAppTypesListResultResult(
            int applicationTypeId,

            string createdAt,

            string description,

            int id,

            string name)
        {
            ApplicationTypeId = applicationTypeId;
            CreatedAt = createdAt;
            Description = description;
            Id = id;
            Name = name;
        }
    }
}
