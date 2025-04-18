// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetPagesProjectCanonicalDeploymentBuildConfig;
import com.pulumi.cloudflare.outputs.GetPagesProjectCanonicalDeploymentDeploymentTrigger;
import com.pulumi.cloudflare.outputs.GetPagesProjectCanonicalDeploymentEnvVars;
import com.pulumi.cloudflare.outputs.GetPagesProjectCanonicalDeploymentLatestStage;
import com.pulumi.cloudflare.outputs.GetPagesProjectCanonicalDeploymentSource;
import com.pulumi.cloudflare.outputs.GetPagesProjectCanonicalDeploymentStage;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPagesProjectCanonicalDeployment {
    /**
     * @return A list of alias URLs pointing to this deployment.
     * 
     */
    private List<String> aliases;
    /**
     * @return Configs for the project build process.
     * 
     */
    private GetPagesProjectCanonicalDeploymentBuildConfig buildConfig;
    /**
     * @return When the deployment was created.
     * 
     */
    private String createdOn;
    /**
     * @return Info about what caused the deployment.
     * 
     */
    private GetPagesProjectCanonicalDeploymentDeploymentTrigger deploymentTrigger;
    /**
     * @return Environment variables used for builds and Pages Functions.
     * 
     */
    private Map<String,GetPagesProjectCanonicalDeploymentEnvVars> envVars;
    /**
     * @return Type of deploy.
     * Available values: &#34;preview&#34;, &#34;production&#34;.
     * 
     */
    private String environment;
    /**
     * @return Id of the deployment.
     * 
     */
    private String id;
    /**
     * @return If the deployment has been skipped.
     * 
     */
    private Boolean isSkipped;
    /**
     * @return The status of the deployment.
     * 
     */
    private GetPagesProjectCanonicalDeploymentLatestStage latestStage;
    /**
     * @return When the deployment was last modified.
     * 
     */
    private String modifiedOn;
    /**
     * @return Id of the project.
     * 
     */
    private String projectId;
    /**
     * @return Name of the project.
     * 
     */
    private String projectName;
    /**
     * @return Short Id (8 character) of the deployment.
     * 
     */
    private String shortId;
    private GetPagesProjectCanonicalDeploymentSource source;
    /**
     * @return List of past stages.
     * 
     */
    private List<GetPagesProjectCanonicalDeploymentStage> stages;
    /**
     * @return The live URL to view this deployment.
     * 
     */
    private String url;

    private GetPagesProjectCanonicalDeployment() {}
    /**
     * @return A list of alias URLs pointing to this deployment.
     * 
     */
    public List<String> aliases() {
        return this.aliases;
    }
    /**
     * @return Configs for the project build process.
     * 
     */
    public GetPagesProjectCanonicalDeploymentBuildConfig buildConfig() {
        return this.buildConfig;
    }
    /**
     * @return When the deployment was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return Info about what caused the deployment.
     * 
     */
    public GetPagesProjectCanonicalDeploymentDeploymentTrigger deploymentTrigger() {
        return this.deploymentTrigger;
    }
    /**
     * @return Environment variables used for builds and Pages Functions.
     * 
     */
    public Map<String,GetPagesProjectCanonicalDeploymentEnvVars> envVars() {
        return this.envVars;
    }
    /**
     * @return Type of deploy.
     * Available values: &#34;preview&#34;, &#34;production&#34;.
     * 
     */
    public String environment() {
        return this.environment;
    }
    /**
     * @return Id of the deployment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If the deployment has been skipped.
     * 
     */
    public Boolean isSkipped() {
        return this.isSkipped;
    }
    /**
     * @return The status of the deployment.
     * 
     */
    public GetPagesProjectCanonicalDeploymentLatestStage latestStage() {
        return this.latestStage;
    }
    /**
     * @return When the deployment was last modified.
     * 
     */
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return Id of the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Name of the project.
     * 
     */
    public String projectName() {
        return this.projectName;
    }
    /**
     * @return Short Id (8 character) of the deployment.
     * 
     */
    public String shortId() {
        return this.shortId;
    }
    public GetPagesProjectCanonicalDeploymentSource source() {
        return this.source;
    }
    /**
     * @return List of past stages.
     * 
     */
    public List<GetPagesProjectCanonicalDeploymentStage> stages() {
        return this.stages;
    }
    /**
     * @return The live URL to view this deployment.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesProjectCanonicalDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> aliases;
        private GetPagesProjectCanonicalDeploymentBuildConfig buildConfig;
        private String createdOn;
        private GetPagesProjectCanonicalDeploymentDeploymentTrigger deploymentTrigger;
        private Map<String,GetPagesProjectCanonicalDeploymentEnvVars> envVars;
        private String environment;
        private String id;
        private Boolean isSkipped;
        private GetPagesProjectCanonicalDeploymentLatestStage latestStage;
        private String modifiedOn;
        private String projectId;
        private String projectName;
        private String shortId;
        private GetPagesProjectCanonicalDeploymentSource source;
        private List<GetPagesProjectCanonicalDeploymentStage> stages;
        private String url;
        public Builder() {}
        public Builder(GetPagesProjectCanonicalDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.buildConfig = defaults.buildConfig;
    	      this.createdOn = defaults.createdOn;
    	      this.deploymentTrigger = defaults.deploymentTrigger;
    	      this.envVars = defaults.envVars;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
    	      this.isSkipped = defaults.isSkipped;
    	      this.latestStage = defaults.latestStage;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.projectId = defaults.projectId;
    	      this.projectName = defaults.projectName;
    	      this.shortId = defaults.shortId;
    	      this.source = defaults.source;
    	      this.stages = defaults.stages;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder aliases(List<String> aliases) {
            if (aliases == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "aliases");
            }
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }
        @CustomType.Setter
        public Builder buildConfig(GetPagesProjectCanonicalDeploymentBuildConfig buildConfig) {
            if (buildConfig == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "buildConfig");
            }
            this.buildConfig = buildConfig;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder deploymentTrigger(GetPagesProjectCanonicalDeploymentDeploymentTrigger deploymentTrigger) {
            if (deploymentTrigger == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "deploymentTrigger");
            }
            this.deploymentTrigger = deploymentTrigger;
            return this;
        }
        @CustomType.Setter
        public Builder envVars(Map<String,GetPagesProjectCanonicalDeploymentEnvVars> envVars) {
            if (envVars == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "envVars");
            }
            this.envVars = envVars;
            return this;
        }
        @CustomType.Setter
        public Builder environment(String environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isSkipped(Boolean isSkipped) {
            if (isSkipped == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "isSkipped");
            }
            this.isSkipped = isSkipped;
            return this;
        }
        @CustomType.Setter
        public Builder latestStage(GetPagesProjectCanonicalDeploymentLatestStage latestStage) {
            if (latestStage == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "latestStage");
            }
            this.latestStage = latestStage;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder projectName(String projectName) {
            if (projectName == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "projectName");
            }
            this.projectName = projectName;
            return this;
        }
        @CustomType.Setter
        public Builder shortId(String shortId) {
            if (shortId == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "shortId");
            }
            this.shortId = shortId;
            return this;
        }
        @CustomType.Setter
        public Builder source(GetPagesProjectCanonicalDeploymentSource source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "source");
            }
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder stages(List<GetPagesProjectCanonicalDeploymentStage> stages) {
            if (stages == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "stages");
            }
            this.stages = stages;
            return this;
        }
        public Builder stages(GetPagesProjectCanonicalDeploymentStage... stages) {
            return stages(List.of(stages));
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeployment", "url");
            }
            this.url = url;
            return this;
        }
        public GetPagesProjectCanonicalDeployment build() {
            final var _resultValue = new GetPagesProjectCanonicalDeployment();
            _resultValue.aliases = aliases;
            _resultValue.buildConfig = buildConfig;
            _resultValue.createdOn = createdOn;
            _resultValue.deploymentTrigger = deploymentTrigger;
            _resultValue.envVars = envVars;
            _resultValue.environment = environment;
            _resultValue.id = id;
            _resultValue.isSkipped = isSkipped;
            _resultValue.latestStage = latestStage;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.projectId = projectId;
            _resultValue.projectName = projectName;
            _resultValue.shortId = shortId;
            _resultValue.source = source;
            _resultValue.stages = stages;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
