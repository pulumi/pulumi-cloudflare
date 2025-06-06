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
    public sealed class WorkersDeploymentDeploymentAnnotations
    {
        /// <summary>
        /// Human-readable message about the deployment. Truncated to 100 bytes.
        /// </summary>
        public readonly string? WorkersMessage;

        [OutputConstructor]
        private WorkersDeploymentDeploymentAnnotations(string? workersMessage)
        {
            WorkersMessage = workersMessage;
        }
    }
}
