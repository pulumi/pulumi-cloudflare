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
    public sealed class TeamsAccountCustomCertificate
    {
        /// <summary>
        /// Whether TLS encryption should use a custom certificate.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// ID of custom certificate.
        /// </summary>
        public readonly string? Id;
        public readonly string? UpdatedAt;

        [OutputConstructor]
        private TeamsAccountCustomCertificate(
            bool enabled,

            string? id,

            string? updatedAt)
        {
            Enabled = enabled;
            Id = id;
            UpdatedAt = updatedAt;
        }
    }
}