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
    public sealed class GetStreamsResultInputResult
    {
        /// <summary>
        /// The video height in pixels. A value of `-1` means the height is unknown. The value becomes available after the upload and before the video is ready.
        /// </summary>
        public readonly int Height;
        /// <summary>
        /// The video width in pixels. A value of `-1` means the width is unknown. The value becomes available after the upload and before the video is ready.
        /// </summary>
        public readonly int Width;

        [OutputConstructor]
        private GetStreamsResultInputResult(
            int height,

            int width)
        {
            Height = height;
            Width = width;
        }
    }
}
