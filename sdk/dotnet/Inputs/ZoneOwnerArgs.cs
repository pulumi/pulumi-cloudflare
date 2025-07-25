// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZoneOwnerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the owner.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of owner.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ZoneOwnerArgs()
        {
        }
        public static new ZoneOwnerArgs Empty => new ZoneOwnerArgs();
    }
}
