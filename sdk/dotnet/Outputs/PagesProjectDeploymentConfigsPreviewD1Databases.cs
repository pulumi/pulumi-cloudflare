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
    public sealed class PagesProjectDeploymentConfigsPreviewD1Databases
    {
        /// <summary>
        /// UUID of the D1 database.
        /// </summary>
        public readonly string? Id;

        [OutputConstructor]
        private PagesProjectDeploymentConfigsPreviewD1Databases(string? id)
        {
            Id = id;
        }
    }
}
