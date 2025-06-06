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
    public sealed class GetPagesProjectDeploymentConfigsProductionResult
    {
        /// <summary>
        /// Constellation bindings used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionAiBindingsResult> AiBindings;
        /// <summary>
        /// Analytics Engine bindings used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionAnalyticsEngineDatasetsResult> AnalyticsEngineDatasets;
        /// <summary>
        /// Browser bindings used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionBrowsersResult> Browsers;
        /// <summary>
        /// Compatibility date used for Pages Functions.
        /// </summary>
        public readonly string CompatibilityDate;
        /// <summary>
        /// Compatibility flags used for Pages Functions.
        /// </summary>
        public readonly ImmutableArray<string> CompatibilityFlags;
        /// <summary>
        /// D1 databases used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionD1DatabasesResult> D1Databases;
        /// <summary>
        /// Durable Object namespaces used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionDurableObjectNamespacesResult> DurableObjectNamespaces;
        /// <summary>
        /// Environment variables used for builds and Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionEnvVarsResult> EnvVars;
        /// <summary>
        /// Hyperdrive bindings used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionHyperdriveBindingsResult> HyperdriveBindings;
        /// <summary>
        /// KV namespaces used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionKvNamespacesResult> KvNamespaces;
        /// <summary>
        /// mTLS bindings used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionMtlsCertificatesResult> MtlsCertificates;
        /// <summary>
        /// Placement setting used for Pages Functions.
        /// </summary>
        public readonly Outputs.GetPagesProjectDeploymentConfigsProductionPlacementResult Placement;
        /// <summary>
        /// Queue Producer bindings used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionQueueProducersResult> QueueProducers;
        /// <summary>
        /// R2 buckets used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionR2BucketsResult> R2Buckets;
        /// <summary>
        /// Services used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionServicesResult> Services;
        /// <summary>
        /// Vectorize bindings used for Pages Functions.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionVectorizeBindingsResult> VectorizeBindings;

        [OutputConstructor]
        private GetPagesProjectDeploymentConfigsProductionResult(
            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionAiBindingsResult> aiBindings,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionAnalyticsEngineDatasetsResult> analyticsEngineDatasets,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionBrowsersResult> browsers,

            string compatibilityDate,

            ImmutableArray<string> compatibilityFlags,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionD1DatabasesResult> d1Databases,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionDurableObjectNamespacesResult> durableObjectNamespaces,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionEnvVarsResult> envVars,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionHyperdriveBindingsResult> hyperdriveBindings,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionKvNamespacesResult> kvNamespaces,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionMtlsCertificatesResult> mtlsCertificates,

            Outputs.GetPagesProjectDeploymentConfigsProductionPlacementResult placement,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionQueueProducersResult> queueProducers,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionR2BucketsResult> r2Buckets,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionServicesResult> services,

            ImmutableDictionary<string, Outputs.GetPagesProjectDeploymentConfigsProductionVectorizeBindingsResult> vectorizeBindings)
        {
            AiBindings = aiBindings;
            AnalyticsEngineDatasets = analyticsEngineDatasets;
            Browsers = browsers;
            CompatibilityDate = compatibilityDate;
            CompatibilityFlags = compatibilityFlags;
            D1Databases = d1Databases;
            DurableObjectNamespaces = durableObjectNamespaces;
            EnvVars = envVars;
            HyperdriveBindings = hyperdriveBindings;
            KvNamespaces = kvNamespaces;
            MtlsCertificates = mtlsCertificates;
            Placement = placement;
            QueueProducers = queueProducers;
            R2Buckets = r2Buckets;
            Services = services;
            VectorizeBindings = vectorizeBindings;
        }
    }
}
