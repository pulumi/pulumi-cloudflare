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
    public sealed class PagesProjectDeploymentConfigsProductionPlacement
    {
        /// <summary>
        /// Placement mode.
        /// </summary>
        public readonly string? Mode;

        [OutputConstructor]
        private PagesProjectDeploymentConfigsProductionPlacement(string? mode)
        {
            Mode = mode;
        }
    }
}
