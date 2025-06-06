// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationLandingPageDesignGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The background color of the log in button on the landing page.
        /// </summary>
        [Input("buttonColor")]
        public Input<string>? ButtonColor { get; set; }

        /// <summary>
        /// The color of the text in the log in button on the landing page.
        /// </summary>
        [Input("buttonTextColor")]
        public Input<string>? ButtonTextColor { get; set; }

        /// <summary>
        /// The URL of the image shown on the landing page.
        /// </summary>
        [Input("imageUrl")]
        public Input<string>? ImageUrl { get; set; }

        /// <summary>
        /// The message shown on the landing page.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// The title shown on the landing page.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        public ZeroTrustAccessApplicationLandingPageDesignGetArgs()
        {
        }
        public static new ZeroTrustAccessApplicationLandingPageDesignGetArgs Empty => new ZeroTrustAccessApplicationLandingPageDesignGetArgs();
    }
}
