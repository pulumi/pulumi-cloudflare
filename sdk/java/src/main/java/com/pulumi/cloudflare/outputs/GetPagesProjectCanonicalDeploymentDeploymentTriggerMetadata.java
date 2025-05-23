// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata {
    /**
     * @return Where the trigger happened.
     * 
     */
    private String branch;
    /**
     * @return Hash of the deployment trigger commit.
     * 
     */
    private String commitHash;
    /**
     * @return Message of the deployment trigger commit.
     * 
     */
    private String commitMessage;

    private GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata() {}
    /**
     * @return Where the trigger happened.
     * 
     */
    public String branch() {
        return this.branch;
    }
    /**
     * @return Hash of the deployment trigger commit.
     * 
     */
    public String commitHash() {
        return this.commitHash;
    }
    /**
     * @return Message of the deployment trigger commit.
     * 
     */
    public String commitMessage() {
        return this.commitMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String branch;
        private String commitHash;
        private String commitMessage;
        public Builder() {}
        public Builder(GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commitHash = defaults.commitHash;
    	      this.commitMessage = defaults.commitMessage;
        }

        @CustomType.Setter
        public Builder branch(String branch) {
            if (branch == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata", "branch");
            }
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder commitHash(String commitHash) {
            if (commitHash == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata", "commitHash");
            }
            this.commitHash = commitHash;
            return this;
        }
        @CustomType.Setter
        public Builder commitMessage(String commitMessage) {
            if (commitMessage == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata", "commitMessage");
            }
            this.commitMessage = commitMessage;
            return this;
        }
        public GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata build() {
            final var _resultValue = new GetPagesProjectCanonicalDeploymentDeploymentTriggerMetadata();
            _resultValue.branch = branch;
            _resultValue.commitHash = commitHash;
            _resultValue.commitMessage = commitMessage;
            return _resultValue;
        }
    }
}
