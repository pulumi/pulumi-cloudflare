// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class CustomHostnameOwnershipVerificationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DNS Name for record.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// DNS Record type.
        /// Available values: "txt".
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Content for the record.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public CustomHostnameOwnershipVerificationGetArgs()
        {
        }
        public static new CustomHostnameOwnershipVerificationGetArgs Empty => new CustomHostnameOwnershipVerificationGetArgs();
    }
}
