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
    public sealed class GetHyperdriveConfigsResultOriginResult
    {
        /// <summary>
        /// Defines the Client ID of the Access token to use when connecting to the origin database.
        /// </summary>
        public readonly string AccessClientId;
        /// <summary>
        /// Defines the Client Secret of the Access Token to use when connecting to the origin database. The API never returns this write-only value.
        /// </summary>
        public readonly string AccessClientSecret;
        /// <summary>
        /// Set the name of your origin database.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// Defines the host (hostname or IP) of your origin database.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// Set the password needed to access your origin database. The API never returns this write-only value.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// Defines the port (default: 5432 for Postgres) of your origin database.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Specifies the URL scheme used to connect to your origin database.
        /// Available values: "postgres", "postgresql", "mysql".
        /// </summary>
        public readonly string Scheme;
        /// <summary>
        /// Set the user of your origin database.
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private GetHyperdriveConfigsResultOriginResult(
            string accessClientId,

            string accessClientSecret,

            string database,

            string host,

            string password,

            int port,

            string scheme,

            string user)
        {
            AccessClientId = accessClientId;
            AccessClientSecret = accessClientSecret;
            Database = database;
            Host = host;
            Password = password;
            Port = port;
            Scheme = scheme;
            User = user;
        }
    }
}
