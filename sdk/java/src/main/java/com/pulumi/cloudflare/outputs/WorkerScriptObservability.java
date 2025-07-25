// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.WorkerScriptObservabilityLogs;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkerScriptObservability {
    /**
     * @return Whether observability is enabled for the Worker.
     * 
     */
    private Boolean enabled;
    /**
     * @return The sampling rate for incoming requests. From 0 to 1 (1 = 100%, 0.1 = 10%). Default is 1.
     * 
     */
    private @Nullable Double headSamplingRate;
    /**
     * @return Log settings for the Worker.
     * 
     */
    private @Nullable WorkerScriptObservabilityLogs logs;

    private WorkerScriptObservability() {}
    /**
     * @return Whether observability is enabled for the Worker.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The sampling rate for incoming requests. From 0 to 1 (1 = 100%, 0.1 = 10%). Default is 1.
     * 
     */
    public Optional<Double> headSamplingRate() {
        return Optional.ofNullable(this.headSamplingRate);
    }
    /**
     * @return Log settings for the Worker.
     * 
     */
    public Optional<WorkerScriptObservabilityLogs> logs() {
        return Optional.ofNullable(this.logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerScriptObservability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable Double headSamplingRate;
        private @Nullable WorkerScriptObservabilityLogs logs;
        public Builder() {}
        public Builder(WorkerScriptObservability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.headSamplingRate = defaults.headSamplingRate;
    	      this.logs = defaults.logs;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("WorkerScriptObservability", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder headSamplingRate(@Nullable Double headSamplingRate) {

            this.headSamplingRate = headSamplingRate;
            return this;
        }
        @CustomType.Setter
        public Builder logs(@Nullable WorkerScriptObservabilityLogs logs) {

            this.logs = logs;
            return this;
        }
        public WorkerScriptObservability build() {
            final var _resultValue = new WorkerScriptObservability();
            _resultValue.enabled = enabled;
            _resultValue.headSamplingRate = headSamplingRate;
            _resultValue.logs = logs;
            return _resultValue;
        }
    }
}
