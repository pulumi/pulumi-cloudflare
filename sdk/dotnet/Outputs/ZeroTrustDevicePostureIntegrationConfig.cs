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
    public sealed class ZeroTrustDevicePostureIntegrationConfig
    {
        /// <summary>
        /// If present, this id will be passed in the `CF-Access-Client-ID` header when hitting the `api_url`.
        /// </summary>
        public readonly string? AccessClientId;
        /// <summary>
        /// If present, this secret will be passed in the `CF-Access-Client-Secret` header when hitting the `api_url`.
        /// </summary>
        public readonly string? AccessClientSecret;
        /// <summary>
        /// The Workspace One API URL provided in the Workspace One Admin Dashboard.
        /// </summary>
        public readonly string? ApiUrl;
        /// <summary>
        /// The Workspace One Authorization URL depending on your region.
        /// </summary>
        public readonly string? AuthUrl;
        /// <summary>
        /// The Workspace One client ID provided in the Workspace One Admin Dashboard.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The Uptycs client secret.
        /// </summary>
        public readonly string? ClientKey;
        /// <summary>
        /// The Workspace One client secret provided in the Workspace One Admin Dashboard.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// The Crowdstrike customer ID.
        /// </summary>
        public readonly string? CustomerId;

        [OutputConstructor]
        private ZeroTrustDevicePostureIntegrationConfig(
            string? accessClientId,

            string? accessClientSecret,

            string? apiUrl,

            string? authUrl,

            string? clientId,

            string? clientKey,

            string? clientSecret,

            string? customerId)
        {
            AccessClientId = accessClientId;
            AccessClientSecret = accessClientSecret;
            ApiUrl = apiUrl;
            AuthUrl = authUrl;
            ClientId = clientId;
            ClientKey = clientKey;
            ClientSecret = clientSecret;
            CustomerId = customerId;
        }
    }
}
