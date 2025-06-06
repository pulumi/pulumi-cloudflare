// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ApiShieldOperationFeaturesSchemaInfoActiveSchemaGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// UUID.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// True if schema is Cloudflare-provided.
        /// </summary>
        [Input("isLearned")]
        public Input<bool>? IsLearned { get; set; }

        /// <summary>
        /// Schema file name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ApiShieldOperationFeaturesSchemaInfoActiveSchemaGetArgs()
        {
        }
        public static new ApiShieldOperationFeaturesSchemaInfoActiveSchemaGetArgs Empty => new ApiShieldOperationFeaturesSchemaInfoActiveSchemaGetArgs();
    }
}
