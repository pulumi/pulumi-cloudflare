// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ManagedHeadersManagedRequestHeader
    {
        /// <summary>
        /// Whether the headers rule is active.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Unique headers rule identifier.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private ManagedHeadersManagedRequestHeader(
            bool enabled,

            string id)
        {
            Enabled = enabled;
            Id = id;
        }
    }
}