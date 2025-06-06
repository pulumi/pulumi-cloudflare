// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetCustomHostnameFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Direction to order hostnames.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// Fully qualified domain name to match against. This parameter cannot be used with the 'id' parameter.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Hostname ID to match against. This ID was generated and returned during the initial custom_hostname creation. This parameter cannot be used with the 'hostname' parameter.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Field to order hostnames by.
        /// Available values: "ssl", "ssl_status".
        /// </summary>
        [Input("order", required: true)]
        public Input<string> Order { get; set; } = null!;

        /// <summary>
        /// Whether to filter hostnames based on if they have SSL enabled.
        /// Available values: 0, 1.
        /// </summary>
        [Input("ssl")]
        public Input<double>? Ssl { get; set; }

        public GetCustomHostnameFilterInputArgs()
        {
        }
        public static new GetCustomHostnameFilterInputArgs Empty => new GetCustomHostnameFilterInputArgs();
    }
}
