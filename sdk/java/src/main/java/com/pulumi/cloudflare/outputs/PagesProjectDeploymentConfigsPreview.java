// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewAiBindings;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewAnalyticsEngineDatasets;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewBrowsers;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewD1Databases;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewDurableObjectNamespaces;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewEnvVars;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewHyperdriveBindings;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewKvNamespaces;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewMtlsCertificates;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewPlacement;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewQueueProducers;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewR2Buckets;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewServices;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreviewVectorizeBindings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagesProjectDeploymentConfigsPreview {
    /**
     * @return Constellation bindings used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewAiBindings> aiBindings;
    /**
     * @return Analytics Engine bindings used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewAnalyticsEngineDatasets> analyticsEngineDatasets;
    /**
     * @return Browser bindings used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewBrowsers> browsers;
    /**
     * @return Compatibility date used for Pages Functions.
     * 
     */
    private @Nullable String compatibilityDate;
    /**
     * @return Compatibility flags used for Pages Functions.
     * 
     */
    private @Nullable List<String> compatibilityFlags;
    /**
     * @return D1 databases used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewD1Databases> d1Databases;
    /**
     * @return Durable Object namespaces used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewDurableObjectNamespaces> durableObjectNamespaces;
    /**
     * @return Environment variables used for builds and Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewEnvVars> envVars;
    /**
     * @return Hyperdrive bindings used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewHyperdriveBindings> hyperdriveBindings;
    /**
     * @return KV namespaces used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewKvNamespaces> kvNamespaces;
    /**
     * @return mTLS bindings used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewMtlsCertificates> mtlsCertificates;
    /**
     * @return Placement setting used for Pages Functions.
     * 
     */
    private @Nullable PagesProjectDeploymentConfigsPreviewPlacement placement;
    /**
     * @return Queue Producer bindings used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewQueueProducers> queueProducers;
    /**
     * @return R2 buckets used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewR2Buckets> r2Buckets;
    /**
     * @return Services used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewServices> services;
    /**
     * @return Vectorize bindings used for Pages Functions.
     * 
     */
    private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewVectorizeBindings> vectorizeBindings;

    private PagesProjectDeploymentConfigsPreview() {}
    /**
     * @return Constellation bindings used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewAiBindings> aiBindings() {
        return this.aiBindings == null ? Map.of() : this.aiBindings;
    }
    /**
     * @return Analytics Engine bindings used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewAnalyticsEngineDatasets> analyticsEngineDatasets() {
        return this.analyticsEngineDatasets == null ? Map.of() : this.analyticsEngineDatasets;
    }
    /**
     * @return Browser bindings used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewBrowsers> browsers() {
        return this.browsers == null ? Map.of() : this.browsers;
    }
    /**
     * @return Compatibility date used for Pages Functions.
     * 
     */
    public Optional<String> compatibilityDate() {
        return Optional.ofNullable(this.compatibilityDate);
    }
    /**
     * @return Compatibility flags used for Pages Functions.
     * 
     */
    public List<String> compatibilityFlags() {
        return this.compatibilityFlags == null ? List.of() : this.compatibilityFlags;
    }
    /**
     * @return D1 databases used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewD1Databases> d1Databases() {
        return this.d1Databases == null ? Map.of() : this.d1Databases;
    }
    /**
     * @return Durable Object namespaces used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewDurableObjectNamespaces> durableObjectNamespaces() {
        return this.durableObjectNamespaces == null ? Map.of() : this.durableObjectNamespaces;
    }
    /**
     * @return Environment variables used for builds and Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewEnvVars> envVars() {
        return this.envVars == null ? Map.of() : this.envVars;
    }
    /**
     * @return Hyperdrive bindings used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewHyperdriveBindings> hyperdriveBindings() {
        return this.hyperdriveBindings == null ? Map.of() : this.hyperdriveBindings;
    }
    /**
     * @return KV namespaces used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewKvNamespaces> kvNamespaces() {
        return this.kvNamespaces == null ? Map.of() : this.kvNamespaces;
    }
    /**
     * @return mTLS bindings used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewMtlsCertificates> mtlsCertificates() {
        return this.mtlsCertificates == null ? Map.of() : this.mtlsCertificates;
    }
    /**
     * @return Placement setting used for Pages Functions.
     * 
     */
    public Optional<PagesProjectDeploymentConfigsPreviewPlacement> placement() {
        return Optional.ofNullable(this.placement);
    }
    /**
     * @return Queue Producer bindings used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewQueueProducers> queueProducers() {
        return this.queueProducers == null ? Map.of() : this.queueProducers;
    }
    /**
     * @return R2 buckets used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewR2Buckets> r2Buckets() {
        return this.r2Buckets == null ? Map.of() : this.r2Buckets;
    }
    /**
     * @return Services used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewServices> services() {
        return this.services == null ? Map.of() : this.services;
    }
    /**
     * @return Vectorize bindings used for Pages Functions.
     * 
     */
    public Map<String,PagesProjectDeploymentConfigsPreviewVectorizeBindings> vectorizeBindings() {
        return this.vectorizeBindings == null ? Map.of() : this.vectorizeBindings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesProjectDeploymentConfigsPreview defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewAiBindings> aiBindings;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewAnalyticsEngineDatasets> analyticsEngineDatasets;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewBrowsers> browsers;
        private @Nullable String compatibilityDate;
        private @Nullable List<String> compatibilityFlags;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewD1Databases> d1Databases;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewDurableObjectNamespaces> durableObjectNamespaces;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewEnvVars> envVars;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewHyperdriveBindings> hyperdriveBindings;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewKvNamespaces> kvNamespaces;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewMtlsCertificates> mtlsCertificates;
        private @Nullable PagesProjectDeploymentConfigsPreviewPlacement placement;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewQueueProducers> queueProducers;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewR2Buckets> r2Buckets;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewServices> services;
        private @Nullable Map<String,PagesProjectDeploymentConfigsPreviewVectorizeBindings> vectorizeBindings;
        public Builder() {}
        public Builder(PagesProjectDeploymentConfigsPreview defaults) {
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
        public Builder aiBindings(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewAiBindings> aiBindings) {

            this.aiBindings = aiBindings;
            return this;
        }
        @CustomType.Setter
        public Builder analyticsEngineDatasets(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewAnalyticsEngineDatasets> analyticsEngineDatasets) {

            this.analyticsEngineDatasets = analyticsEngineDatasets;
            return this;
        }
        @CustomType.Setter
        public Builder browsers(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewBrowsers> browsers) {

            this.browsers = browsers;
            return this;
        }
        @CustomType.Setter
        public Builder compatibilityDate(@Nullable String compatibilityDate) {

            this.compatibilityDate = compatibilityDate;
            return this;
        }
        @CustomType.Setter
        public Builder compatibilityFlags(@Nullable List<String> compatibilityFlags) {

            this.compatibilityFlags = compatibilityFlags;
            return this;
        }
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }
        @CustomType.Setter
        public Builder d1Databases(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewD1Databases> d1Databases) {

            this.d1Databases = d1Databases;
            return this;
        }
        @CustomType.Setter
        public Builder durableObjectNamespaces(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewDurableObjectNamespaces> durableObjectNamespaces) {

            this.durableObjectNamespaces = durableObjectNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder envVars(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewEnvVars> envVars) {

            this.envVars = envVars;
            return this;
        }
        @CustomType.Setter
        public Builder hyperdriveBindings(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewHyperdriveBindings> hyperdriveBindings) {

            this.hyperdriveBindings = hyperdriveBindings;
            return this;
        }
        @CustomType.Setter
        public Builder kvNamespaces(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewKvNamespaces> kvNamespaces) {

            this.kvNamespaces = kvNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder mtlsCertificates(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewMtlsCertificates> mtlsCertificates) {

            this.mtlsCertificates = mtlsCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder placement(@Nullable PagesProjectDeploymentConfigsPreviewPlacement placement) {

            this.placement = placement;
            return this;
        }
        @CustomType.Setter
        public Builder queueProducers(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewQueueProducers> queueProducers) {

            this.queueProducers = queueProducers;
            return this;
        }
        @CustomType.Setter
        public Builder r2Buckets(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewR2Buckets> r2Buckets) {

            this.r2Buckets = r2Buckets;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewServices> services) {

            this.services = services;
            return this;
        }
        @CustomType.Setter
        public Builder vectorizeBindings(@Nullable Map<String,PagesProjectDeploymentConfigsPreviewVectorizeBindings> vectorizeBindings) {

            this.vectorizeBindings = vectorizeBindings;
            return this;
        }
        public PagesProjectDeploymentConfigsPreview build() {
            final var _resultValue = new PagesProjectDeploymentConfigsPreview();
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
