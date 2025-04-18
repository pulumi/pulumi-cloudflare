// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionAiBindings;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionAnalyticsEngineDatasets;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionBrowsers;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionD1Databases;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionDurableObjectNamespaces;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionEnvVars;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionHyperdriveBindings;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionKvNamespaces;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionMtlsCertificates;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionPlacement;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionQueueProducers;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionR2Buckets;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionServices;
import com.pulumi.cloudflare.outputs.GetPagesProjectDeploymentConfigsProductionVectorizeBindings;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPagesProjectDeploymentConfigsProduction {
    /**
     * @return Constellation bindings used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionAiBindings> aiBindings;
    /**
     * @return Analytics Engine bindings used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionAnalyticsEngineDatasets> analyticsEngineDatasets;
    /**
     * @return Browser bindings used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionBrowsers> browsers;
    /**
     * @return Compatibility date used for Pages Functions.
     * 
     */
    private String compatibilityDate;
    /**
     * @return Compatibility flags used for Pages Functions.
     * 
     */
    private List<String> compatibilityFlags;
    /**
     * @return D1 databases used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionD1Databases> d1Databases;
    /**
     * @return Durable Object namespaces used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionDurableObjectNamespaces> durableObjectNamespaces;
    /**
     * @return Environment variables used for builds and Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionEnvVars> envVars;
    /**
     * @return Hyperdrive bindings used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionHyperdriveBindings> hyperdriveBindings;
    /**
     * @return KV namespaces used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionKvNamespaces> kvNamespaces;
    /**
     * @return mTLS bindings used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionMtlsCertificates> mtlsCertificates;
    /**
     * @return Placement setting used for Pages Functions.
     * 
     */
    private GetPagesProjectDeploymentConfigsProductionPlacement placement;
    /**
     * @return Queue Producer bindings used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionQueueProducers> queueProducers;
    /**
     * @return R2 buckets used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionR2Buckets> r2Buckets;
    /**
     * @return Services used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionServices> services;
    /**
     * @return Vectorize bindings used for Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectDeploymentConfigsProductionVectorizeBindings> vectorizeBindings;

    private GetPagesProjectDeploymentConfigsProduction() {}
    /**
     * @return Constellation bindings used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionAiBindings> aiBindings() {
        return this.aiBindings;
    }
    /**
     * @return Analytics Engine bindings used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionAnalyticsEngineDatasets> analyticsEngineDatasets() {
        return this.analyticsEngineDatasets;
    }
    /**
     * @return Browser bindings used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionBrowsers> browsers() {
        return this.browsers;
    }
    /**
     * @return Compatibility date used for Pages Functions.
     * 
     */
    public String compatibilityDate() {
        return this.compatibilityDate;
    }
    /**
     * @return Compatibility flags used for Pages Functions.
     * 
     */
    public List<String> compatibilityFlags() {
        return this.compatibilityFlags;
    }
    /**
     * @return D1 databases used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionD1Databases> d1Databases() {
        return this.d1Databases;
    }
    /**
     * @return Durable Object namespaces used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionDurableObjectNamespaces> durableObjectNamespaces() {
        return this.durableObjectNamespaces;
    }
    /**
     * @return Environment variables used for builds and Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionEnvVars> envVars() {
        return this.envVars;
    }
    /**
     * @return Hyperdrive bindings used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionHyperdriveBindings> hyperdriveBindings() {
        return this.hyperdriveBindings;
    }
    /**
     * @return KV namespaces used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionKvNamespaces> kvNamespaces() {
        return this.kvNamespaces;
    }
    /**
     * @return mTLS bindings used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionMtlsCertificates> mtlsCertificates() {
        return this.mtlsCertificates;
    }
    /**
     * @return Placement setting used for Pages Functions.
     * 
     */
    public GetPagesProjectDeploymentConfigsProductionPlacement placement() {
        return this.placement;
    }
    /**
     * @return Queue Producer bindings used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionQueueProducers> queueProducers() {
        return this.queueProducers;
    }
    /**
     * @return R2 buckets used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionR2Buckets> r2Buckets() {
        return this.r2Buckets;
    }
    /**
     * @return Services used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionServices> services() {
        return this.services;
    }
    /**
     * @return Vectorize bindings used for Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectDeploymentConfigsProductionVectorizeBindings> vectorizeBindings() {
        return this.vectorizeBindings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesProjectDeploymentConfigsProduction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,GetPagesProjectDeploymentConfigsProductionAiBindings> aiBindings;
        private Map<String,GetPagesProjectDeploymentConfigsProductionAnalyticsEngineDatasets> analyticsEngineDatasets;
        private Map<String,GetPagesProjectDeploymentConfigsProductionBrowsers> browsers;
        private String compatibilityDate;
        private List<String> compatibilityFlags;
        private Map<String,GetPagesProjectDeploymentConfigsProductionD1Databases> d1Databases;
        private Map<String,GetPagesProjectDeploymentConfigsProductionDurableObjectNamespaces> durableObjectNamespaces;
        private Map<String,GetPagesProjectDeploymentConfigsProductionEnvVars> envVars;
        private Map<String,GetPagesProjectDeploymentConfigsProductionHyperdriveBindings> hyperdriveBindings;
        private Map<String,GetPagesProjectDeploymentConfigsProductionKvNamespaces> kvNamespaces;
        private Map<String,GetPagesProjectDeploymentConfigsProductionMtlsCertificates> mtlsCertificates;
        private GetPagesProjectDeploymentConfigsProductionPlacement placement;
        private Map<String,GetPagesProjectDeploymentConfigsProductionQueueProducers> queueProducers;
        private Map<String,GetPagesProjectDeploymentConfigsProductionR2Buckets> r2Buckets;
        private Map<String,GetPagesProjectDeploymentConfigsProductionServices> services;
        private Map<String,GetPagesProjectDeploymentConfigsProductionVectorizeBindings> vectorizeBindings;
        public Builder() {}
        public Builder(GetPagesProjectDeploymentConfigsProduction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiBindings = defaults.aiBindings;
    	      this.analyticsEngineDatasets = defaults.analyticsEngineDatasets;
    	      this.browsers = defaults.browsers;
    	      this.compatibilityDate = defaults.compatibilityDate;
    	      this.compatibilityFlags = defaults.compatibilityFlags;
    	      this.d1Databases = defaults.d1Databases;
    	      this.durableObjectNamespaces = defaults.durableObjectNamespaces;
    	      this.envVars = defaults.envVars;
    	      this.hyperdriveBindings = defaults.hyperdriveBindings;
    	      this.kvNamespaces = defaults.kvNamespaces;
    	      this.mtlsCertificates = defaults.mtlsCertificates;
    	      this.placement = defaults.placement;
    	      this.queueProducers = defaults.queueProducers;
    	      this.r2Buckets = defaults.r2Buckets;
    	      this.services = defaults.services;
    	      this.vectorizeBindings = defaults.vectorizeBindings;
        }

        @CustomType.Setter
        public Builder aiBindings(Map<String,GetPagesProjectDeploymentConfigsProductionAiBindings> aiBindings) {
            if (aiBindings == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "aiBindings");
            }
            this.aiBindings = aiBindings;
            return this;
        }
        @CustomType.Setter
        public Builder analyticsEngineDatasets(Map<String,GetPagesProjectDeploymentConfigsProductionAnalyticsEngineDatasets> analyticsEngineDatasets) {
            if (analyticsEngineDatasets == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "analyticsEngineDatasets");
            }
            this.analyticsEngineDatasets = analyticsEngineDatasets;
            return this;
        }
        @CustomType.Setter
        public Builder browsers(Map<String,GetPagesProjectDeploymentConfigsProductionBrowsers> browsers) {
            if (browsers == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "browsers");
            }
            this.browsers = browsers;
            return this;
        }
        @CustomType.Setter
        public Builder compatibilityDate(String compatibilityDate) {
            if (compatibilityDate == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "compatibilityDate");
            }
            this.compatibilityDate = compatibilityDate;
            return this;
        }
        @CustomType.Setter
        public Builder compatibilityFlags(List<String> compatibilityFlags) {
            if (compatibilityFlags == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "compatibilityFlags");
            }
            this.compatibilityFlags = compatibilityFlags;
            return this;
        }
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }
        @CustomType.Setter
        public Builder d1Databases(Map<String,GetPagesProjectDeploymentConfigsProductionD1Databases> d1Databases) {
            if (d1Databases == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "d1Databases");
            }
            this.d1Databases = d1Databases;
            return this;
        }
        @CustomType.Setter
        public Builder durableObjectNamespaces(Map<String,GetPagesProjectDeploymentConfigsProductionDurableObjectNamespaces> durableObjectNamespaces) {
            if (durableObjectNamespaces == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "durableObjectNamespaces");
            }
            this.durableObjectNamespaces = durableObjectNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder envVars(Map<String,GetPagesProjectDeploymentConfigsProductionEnvVars> envVars) {
            if (envVars == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "envVars");
            }
            this.envVars = envVars;
            return this;
        }
        @CustomType.Setter
        public Builder hyperdriveBindings(Map<String,GetPagesProjectDeploymentConfigsProductionHyperdriveBindings> hyperdriveBindings) {
            if (hyperdriveBindings == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "hyperdriveBindings");
            }
            this.hyperdriveBindings = hyperdriveBindings;
            return this;
        }
        @CustomType.Setter
        public Builder kvNamespaces(Map<String,GetPagesProjectDeploymentConfigsProductionKvNamespaces> kvNamespaces) {
            if (kvNamespaces == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "kvNamespaces");
            }
            this.kvNamespaces = kvNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder mtlsCertificates(Map<String,GetPagesProjectDeploymentConfigsProductionMtlsCertificates> mtlsCertificates) {
            if (mtlsCertificates == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "mtlsCertificates");
            }
            this.mtlsCertificates = mtlsCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder placement(GetPagesProjectDeploymentConfigsProductionPlacement placement) {
            if (placement == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "placement");
            }
            this.placement = placement;
            return this;
        }
        @CustomType.Setter
        public Builder queueProducers(Map<String,GetPagesProjectDeploymentConfigsProductionQueueProducers> queueProducers) {
            if (queueProducers == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "queueProducers");
            }
            this.queueProducers = queueProducers;
            return this;
        }
        @CustomType.Setter
        public Builder r2Buckets(Map<String,GetPagesProjectDeploymentConfigsProductionR2Buckets> r2Buckets) {
            if (r2Buckets == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "r2Buckets");
            }
            this.r2Buckets = r2Buckets;
            return this;
        }
        @CustomType.Setter
        public Builder services(Map<String,GetPagesProjectDeploymentConfigsProductionServices> services) {
            if (services == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "services");
            }
            this.services = services;
            return this;
        }
        @CustomType.Setter
        public Builder vectorizeBindings(Map<String,GetPagesProjectDeploymentConfigsProductionVectorizeBindings> vectorizeBindings) {
            if (vectorizeBindings == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProduction", "vectorizeBindings");
            }
            this.vectorizeBindings = vectorizeBindings;
            return this;
        }
        public GetPagesProjectDeploymentConfigsProduction build() {
            final var _resultValue = new GetPagesProjectDeploymentConfigsProduction();
            _resultValue.aiBindings = aiBindings;
            _resultValue.analyticsEngineDatasets = analyticsEngineDatasets;
            _resultValue.browsers = browsers;
            _resultValue.compatibilityDate = compatibilityDate;
            _resultValue.compatibilityFlags = compatibilityFlags;
            _resultValue.d1Databases = d1Databases;
            _resultValue.durableObjectNamespaces = durableObjectNamespaces;
            _resultValue.envVars = envVars;
            _resultValue.hyperdriveBindings = hyperdriveBindings;
            _resultValue.kvNamespaces = kvNamespaces;
            _resultValue.mtlsCertificates = mtlsCertificates;
            _resultValue.placement = placement;
            _resultValue.queueProducers = queueProducers;
            _resultValue.r2Buckets = r2Buckets;
            _resultValue.services = services;
            _resultValue.vectorizeBindings = vectorizeBindings;
            return _resultValue;
        }
    }
}
