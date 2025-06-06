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
    public sealed class GetPagesProjectCanonicalDeploymentDeploymentTriggerResult
    {
        /// <summary>
        /// Additional info about the trigger.
        /// </summary>
        public readonly Outputs.GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadataResult Metadata;
        /// <summary>
        /// What caused the deployment.
        /// Available values: "push", "ad_hoc".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPagesProjectCanonicalDeploymentDeploymentTriggerResult(
            Outputs.GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadataResult metadata,

            string type)
        {
            Metadata = metadata;
            Type = type;
        }
    }
}
