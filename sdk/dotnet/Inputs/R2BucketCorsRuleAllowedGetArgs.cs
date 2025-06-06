// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class R2BucketCorsRuleAllowedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("headers")]
        private InputList<string>? _headers;

        /// <summary>
        /// Specifies the value for the Access-Control-Allow-Headers header R2 sets when requesting objects in this bucket from a browser. Cross-origin requests that include custom headers (e.g. x-user-id) should specify these headers as AllowedHeaders.
        /// </summary>
        public InputList<string> Headers
        {
            get => _headers ?? (_headers = new InputList<string>());
            set => _headers = value;
        }

        [Input("methods", required: true)]
        private InputList<string>? _methods;

        /// <summary>
        /// Specifies the value for the Access-Control-Allow-Methods header R2 sets when requesting objects in a bucket from a browser.
        /// </summary>
        public InputList<string> Methods
        {
            get => _methods ?? (_methods = new InputList<string>());
            set => _methods = value;
        }

        [Input("origins", required: true)]
        private InputList<string>? _origins;

        /// <summary>
        /// Specifies the value for the Access-Control-Allow-Origin header R2 sets when requesting objects in a bucket from a browser.
        /// </summary>
        public InputList<string> Origins
        {
            get => _origins ?? (_origins = new InputList<string>());
            set => _origins = value;
        }

        public R2BucketCorsRuleAllowedGetArgs()
        {
        }
        public static new R2BucketCorsRuleAllowedGetArgs Empty => new R2BucketCorsRuleAllowedGetArgs();
    }
}
