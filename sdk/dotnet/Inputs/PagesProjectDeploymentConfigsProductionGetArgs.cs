// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PagesProjectDeploymentConfigsProductionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aiBindings")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionAiBindingsGetArgs>? _aiBindings;

        /// <summary>
        /// Constellation bindings used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionAiBindingsGetArgs> AiBindings
        {
            get => _aiBindings ?? (_aiBindings = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionAiBindingsGetArgs>());
            set => _aiBindings = value;
        }

        [Input("analyticsEngineDatasets")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionAnalyticsEngineDatasetsGetArgs>? _analyticsEngineDatasets;

        /// <summary>
        /// Analytics Engine bindings used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionAnalyticsEngineDatasetsGetArgs> AnalyticsEngineDatasets
        {
            get => _analyticsEngineDatasets ?? (_analyticsEngineDatasets = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionAnalyticsEngineDatasetsGetArgs>());
            set => _analyticsEngineDatasets = value;
        }

        [Input("browsers")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionBrowsersGetArgs>? _browsers;

        /// <summary>
        /// Browser bindings used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionBrowsersGetArgs> Browsers
        {
            get => _browsers ?? (_browsers = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionBrowsersGetArgs>());
            set => _browsers = value;
        }

        /// <summary>
        /// Compatibility date used for Pages Functions.
        /// </summary>
        [Input("compatibilityDate")]
        public Input<string>? CompatibilityDate { get; set; }

        [Input("compatibilityFlags")]
        private InputList<string>? _compatibilityFlags;

        /// <summary>
        /// Compatibility flags used for Pages Functions.
        /// </summary>
        public InputList<string> CompatibilityFlags
        {
            get => _compatibilityFlags ?? (_compatibilityFlags = new InputList<string>());
            set => _compatibilityFlags = value;
        }

        [Input("d1Databases")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionD1DatabasesGetArgs>? _d1Databases;

        /// <summary>
        /// D1 databases used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionD1DatabasesGetArgs> D1Databases
        {
            get => _d1Databases ?? (_d1Databases = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionD1DatabasesGetArgs>());
            set => _d1Databases = value;
        }

        [Input("durableObjectNamespaces")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionDurableObjectNamespacesGetArgs>? _durableObjectNamespaces;

        /// <summary>
        /// Durable Object namespaces used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionDurableObjectNamespacesGetArgs> DurableObjectNamespaces
        {
            get => _durableObjectNamespaces ?? (_durableObjectNamespaces = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionDurableObjectNamespacesGetArgs>());
            set => _durableObjectNamespaces = value;
        }

        [Input("envVars")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionEnvVarsGetArgs>? _envVars;

        /// <summary>
        /// Environment variables used for builds and Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionEnvVarsGetArgs> EnvVars
        {
            get => _envVars ?? (_envVars = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionEnvVarsGetArgs>());
            set => _envVars = value;
        }

        [Input("hyperdriveBindings")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionHyperdriveBindingsGetArgs>? _hyperdriveBindings;

        /// <summary>
        /// Hyperdrive bindings used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionHyperdriveBindingsGetArgs> HyperdriveBindings
        {
            get => _hyperdriveBindings ?? (_hyperdriveBindings = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionHyperdriveBindingsGetArgs>());
            set => _hyperdriveBindings = value;
        }

        [Input("kvNamespaces")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionKvNamespacesGetArgs>? _kvNamespaces;

        /// <summary>
        /// KV namespaces used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionKvNamespacesGetArgs> KvNamespaces
        {
            get => _kvNamespaces ?? (_kvNamespaces = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionKvNamespacesGetArgs>());
            set => _kvNamespaces = value;
        }

        [Input("mtlsCertificates")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionMtlsCertificatesGetArgs>? _mtlsCertificates;

        /// <summary>
        /// mTLS bindings used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionMtlsCertificatesGetArgs> MtlsCertificates
        {
            get => _mtlsCertificates ?? (_mtlsCertificates = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionMtlsCertificatesGetArgs>());
            set => _mtlsCertificates = value;
        }

        /// <summary>
        /// Placement setting used for Pages Functions.
        /// </summary>
        [Input("placement")]
        public Input<Inputs.PagesProjectDeploymentConfigsProductionPlacementGetArgs>? Placement { get; set; }

        [Input("queueProducers")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionQueueProducersGetArgs>? _queueProducers;

        /// <summary>
        /// Queue Producer bindings used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionQueueProducersGetArgs> QueueProducers
        {
            get => _queueProducers ?? (_queueProducers = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionQueueProducersGetArgs>());
            set => _queueProducers = value;
        }

        [Input("r2Buckets")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionR2BucketsGetArgs>? _r2Buckets;

        /// <summary>
        /// R2 buckets used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionR2BucketsGetArgs> R2Buckets
        {
            get => _r2Buckets ?? (_r2Buckets = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionR2BucketsGetArgs>());
            set => _r2Buckets = value;
        }

        [Input("services")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionServicesGetArgs>? _services;

        /// <summary>
        /// Services used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionServicesGetArgs> Services
        {
            get => _services ?? (_services = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionServicesGetArgs>());
            set => _services = value;
        }

        [Input("vectorizeBindings")]
        private InputMap<Inputs.PagesProjectDeploymentConfigsProductionVectorizeBindingsGetArgs>? _vectorizeBindings;

        /// <summary>
        /// Vectorize bindings used for Pages Functions.
        /// </summary>
        public InputMap<Inputs.PagesProjectDeploymentConfigsProductionVectorizeBindingsGetArgs> VectorizeBindings
        {
            get => _vectorizeBindings ?? (_vectorizeBindings = new InputMap<Inputs.PagesProjectDeploymentConfigsProductionVectorizeBindingsGetArgs>());
            set => _vectorizeBindings = value;
        }

        public PagesProjectDeploymentConfigsProductionGetArgs()
        {
        }
        public static new PagesProjectDeploymentConfigsProductionGetArgs Empty => new PagesProjectDeploymentConfigsProductionGetArgs();
    }
}
