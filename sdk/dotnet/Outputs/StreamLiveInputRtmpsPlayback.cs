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
    public sealed class StreamLiveInputRtmpsPlayback
    {
        /// <summary>
        /// The secret key to use for playback via RTMPS.
        /// </summary>
        public readonly string? StreamKey;
        /// <summary>
        /// The URL used to play live video over RTMPS.
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private StreamLiveInputRtmpsPlayback(
            string? streamKey,

            string? url)
        {
            StreamKey = streamKey;
            Url = url;
        }
    }
}
