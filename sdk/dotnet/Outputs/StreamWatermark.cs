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
    public sealed class StreamWatermark
    {
        /// <summary>
        /// The date and a time a watermark profile was created.
        /// </summary>
        public readonly string? Created;
        /// <summary>
        /// The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
        /// </summary>
        public readonly string? DownloadedFrom;
        /// <summary>
        /// The height of the image in pixels.
        /// </summary>
        public readonly int? Height;
        /// <summary>
        /// A short description of the watermark profile.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
        /// </summary>
        public readonly double? Opacity;
        /// <summary>
        /// The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
        /// </summary>
        public readonly double? Padding;
        /// <summary>
        /// The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
        /// </summary>
        public readonly string? Position;
        /// <summary>
        /// The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
        /// </summary>
        public readonly double? Scale;
        /// <summary>
        /// The size of the image in bytes.
        /// </summary>
        public readonly double? Size;
        /// <summary>
        /// The unique identifier for a watermark profile.
        /// </summary>
        public readonly string? Uid;
        /// <summary>
        /// The width of the image in pixels.
        /// </summary>
        public readonly int? Width;

        [OutputConstructor]
        private StreamWatermark(
            string? created,

            string? downloadedFrom,

            int? height,

            string? name,

            double? opacity,

            double? padding,

            string? position,

            double? scale,

            double? size,

            string? uid,

            int? width)
        {
            Created = created;
            DownloadedFrom = downloadedFrom;
            Height = height;
            Name = name;
            Opacity = opacity;
            Padding = padding;
            Position = position;
            Scale = scale;
            Size = size;
            Uid = uid;
            Width = width;
        }
    }
}
