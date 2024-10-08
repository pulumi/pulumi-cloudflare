// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationCorsHeaderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value to determine whether all HTTP headers are exposed.
        /// </summary>
        [Input("allowAllHeaders")]
        public Input<bool>? AllowAllHeaders { get; set; }

        /// <summary>
        /// Value to determine whether all methods are exposed.
        /// </summary>
        [Input("allowAllMethods")]
        public Input<bool>? AllowAllMethods { get; set; }

        /// <summary>
        /// Value to determine whether all origins are permitted to make CORS requests.
        /// </summary>
        [Input("allowAllOrigins")]
        public Input<bool>? AllowAllOrigins { get; set; }

        /// <summary>
        /// Value to determine if credentials (cookies, authorization headers, or TLS client certificates) are included with requests.
        /// </summary>
        [Input("allowCredentials")]
        public Input<bool>? AllowCredentials { get; set; }

        [Input("allowedHeaders")]
        private InputList<string>? _allowedHeaders;

        /// <summary>
        /// List of HTTP headers to expose via CORS.
        /// </summary>
        public InputList<string> AllowedHeaders
        {
            get => _allowedHeaders ?? (_allowedHeaders = new InputList<string>());
            set => _allowedHeaders = value;
        }

        [Input("allowedMethods")]
        private InputList<string>? _allowedMethods;

        /// <summary>
        /// List of methods to expose via CORS.
        /// </summary>
        public InputList<string> AllowedMethods
        {
            get => _allowedMethods ?? (_allowedMethods = new InputList<string>());
            set => _allowedMethods = value;
        }

        [Input("allowedOrigins")]
        private InputList<string>? _allowedOrigins;

        /// <summary>
        /// List of origins permitted to make CORS requests.
        /// </summary>
        public InputList<string> AllowedOrigins
        {
            get => _allowedOrigins ?? (_allowedOrigins = new InputList<string>());
            set => _allowedOrigins = value;
        }

        /// <summary>
        /// The maximum time a preflight request will be cached.
        /// </summary>
        [Input("maxAge")]
        public Input<int>? MaxAge { get; set; }

        public ZeroTrustAccessApplicationCorsHeaderArgs()
        {
        }
        public static new ZeroTrustAccessApplicationCorsHeaderArgs Empty => new ZeroTrustAccessApplicationCorsHeaderArgs();
    }
}
