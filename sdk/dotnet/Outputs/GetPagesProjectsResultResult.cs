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
    public sealed class GetPagesProjectsResultResult
    {
        /// <summary>
        /// A list of alias URLs pointing to this deployment.
        /// </summary>
        public readonly ImmutableArray<string> Aliases;
        /// <summary>
        /// Configs for the project build process.
        /// </summary>
        public readonly Outputs.GetPagesProjectsResultBuildConfigResult BuildConfig;
        /// <summary>
        /// When the deployment was created.
        /// </summary>
        public readonly string CreatedOn;
        /// <summary>
        /// Info about what caused the deployment.
        /// </summary>
        public readonly Outputs.GetPagesProjectsResultDeploymentTriggerResult DeploymentTrigger;
        /// <summary>
        /// Environment variables used for builds and Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectsResultEnvVarsResult> EnvVars;
        /// <summary>
        /// Type of deploy.
        /// Available values: "preview", "production".
        /// </summary>
        public readonly string Environment;
        /// <summary>
        /// Id of the deployment.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// If the deployment has been skipped.
        /// </summary>
        public readonly bool IsSkipped;
        /// <summary>
        /// The status of the deployment.
        /// </summary>
        public readonly Outputs.GetPagesProjectsResultLatestStageResult LatestStage;
        /// <summary>
        /// When the deployment was last modified.
        /// </summary>
        public readonly string ModifiedOn;
        /// <summary>
        /// Id of the project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Name of the project.
        /// </summary>
        public readonly string ProjectName;
        /// <summary>
        /// Short Id (8 character) of the deployment.
        /// </summary>
        public readonly string ShortId;
        public readonly Outputs.GetPagesProjectsResultSourceResult Source;
        /// <summary>
        /// List of past stages.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPagesProjectsResultStageResult> Stages;
        /// <summary>
        /// The live URL to view this deployment.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetPagesProjectsResultResult(
            ImmutableArray<string> aliases,

            Outputs.GetPagesProjectsResultBuildConfigResult buildConfig,

            string createdOn,

            Outputs.GetPagesProjectsResultDeploymentTriggerResult deploymentTrigger,

            ImmutableDictionary<string, Outputs.GetPagesProjectsResultEnvVarsResult> envVars,

            string environment,

            string id,

            bool isSkipped,

            Outputs.GetPagesProjectsResultLatestStageResult latestStage,

            string modifiedOn,

            string projectId,

            string projectName,

            string shortId,

            Outputs.GetPagesProjectsResultSourceResult source,

            ImmutableArray<Outputs.GetPagesProjectsResultStageResult> stages,

            string url)
        {
            Aliases = aliases;
            BuildConfig = buildConfig;
            CreatedOn = createdOn;
            DeploymentTrigger = deploymentTrigger;
            EnvVars = envVars;
            Environment = environment;
            Id = id;
            IsSkipped = isSkipped;
            LatestStage = latestStage;
            ModifiedOn = modifiedOn;
            ProjectId = projectId;
            ProjectName = projectName;
            ShortId = shortId;
            Source = source;
            Stages = stages;
            Url = url;
        }
    }
}
