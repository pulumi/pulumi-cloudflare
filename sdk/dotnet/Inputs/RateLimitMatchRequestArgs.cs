// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RateLimitMatchRequestArgs : global::Pulumi.ResourceArgs
    {
        [Input("methods")]
        private InputList<string>? _methods;

        /// <summary>
        /// The HTTP methods to match. You can specify a subset (for example, `['POST','PUT']`) or all methods (`['_ALL_']`). This field is optional when creating a rate limit.
        /// </summary>
        public InputList<string> Methods
        {
            get => _methods ?? (_methods = new InputList<string>());
            set => _methods = value;
        }

        [Input("schemes")]
        private InputList<string>? _schemes;

        /// <summary>
        /// The HTTP schemes to match. You can specify one scheme (`['HTTPS']`), both schemes (`['HTTP','HTTPS']`), or all schemes (`['_ALL_']`). This field is optional.
        /// </summary>
        public InputList<string> Schemes
        {
            get => _schemes ?? (_schemes = new InputList<string>());
            set => _schemes = value;
        }

        /// <summary>
        /// The URL pattern to match, composed of a host and a path such as `example.org/path*`. Normalization is applied before the pattern is matched. `*` wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to `*` to match all traffic to your zone.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public RateLimitMatchRequestArgs()
        {
        }
        public static new RateLimitMatchRequestArgs Empty => new RateLimitMatchRequestArgs();
    }
}
