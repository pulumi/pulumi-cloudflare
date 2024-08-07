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
    public sealed class HyperdriveConfigOrigin
    {
        /// <summary>
        /// Client ID associated with the Cloudflare Access Service Token used to connect via Access.
        /// </summary>
        public readonly string? AccessClientId;
        /// <summary>
        /// Client Secret associated with the Cloudflare Access Service Token used to connect via Access.
        /// </summary>
        public readonly string? AccessClientSecret;
        /// <summary>
        /// The name of your origin database.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The host (hostname or IP) of your origin database.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// The password of the Hyperdrive configuration.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The port (default: 5432 for Postgres) of your origin database.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// Specifies the URL scheme used to connect to your origin database.
        /// </summary>
        public readonly string Scheme;
        /// <summary>
        /// The user of your origin database.
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private HyperdriveConfigOrigin(
            string? accessClientId,

            string? accessClientSecret,

            string database,

            string host,

            string password,

            int? port,

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
