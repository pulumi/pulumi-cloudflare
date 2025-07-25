// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.QueueConsumerSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QueueConsumer {
    /**
     * @return A Resource identifier.
     * 
     */
    private @Nullable String consumerId;
    private @Nullable String createdOn;
    /**
     * @return A Resource identifier.
     * 
     */
    private @Nullable String queueId;
    /**
     * @return Name of a Worker
     * 
     */
    private @Nullable String script;
    /**
     * @return Name of a Worker
     * 
     */
    private @Nullable String scriptName;
    private @Nullable QueueConsumerSettings settings;
    /**
     * @return Available values: &#34;worker&#34;, &#34;http_pull&#34;.
     * 
     */
    private @Nullable String type;

    private QueueConsumer() {}
    /**
     * @return A Resource identifier.
     * 
     */
    public Optional<String> consumerId() {
        return Optional.ofNullable(this.consumerId);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    /**
     * @return A Resource identifier.
     * 
     */
    public Optional<String> queueId() {
        return Optional.ofNullable(this.queueId);
    }
    /**
     * @return Name of a Worker
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }
    /**
     * @return Name of a Worker
     * 
     */
    public Optional<String> scriptName() {
        return Optional.ofNullable(this.scriptName);
    }
    public Optional<QueueConsumerSettings> settings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * @return Available values: &#34;worker&#34;, &#34;http_pull&#34;.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueConsumer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String consumerId;
        private @Nullable String createdOn;
        private @Nullable String queueId;
        private @Nullable String script;
        private @Nullable String scriptName;
        private @Nullable QueueConsumerSettings settings;
        private @Nullable String type;
        public Builder() {}
        public Builder(QueueConsumer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerId = defaults.consumerId;
    	      this.createdOn = defaults.createdOn;
    	      this.queueId = defaults.queueId;
    	      this.script = defaults.script;
    	      this.scriptName = defaults.scriptName;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder consumerId(@Nullable String consumerId) {

            this.consumerId = consumerId;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(@Nullable String createdOn) {

            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder queueId(@Nullable String queueId) {

            this.queueId = queueId;
            return this;
        }
        @CustomType.Setter
        public Builder script(@Nullable String script) {

            this.script = script;
            return this;
        }
        @CustomType.Setter
        public Builder scriptName(@Nullable String scriptName) {

            this.scriptName = scriptName;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable QueueConsumerSettings settings) {

            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public QueueConsumer build() {
            final var _resultValue = new QueueConsumer();
            _resultValue.consumerId = consumerId;
            _resultValue.createdOn = createdOn;
            _resultValue.queueId = queueId;
            _resultValue.script = script;
            _resultValue.scriptName = scriptName;
            _resultValue.settings = settings;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
