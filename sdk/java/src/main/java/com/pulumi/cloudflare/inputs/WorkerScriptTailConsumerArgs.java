// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerScriptTailConsumerArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerScriptTailConsumerArgs Empty = new WorkerScriptTailConsumerArgs();

    /**
     * Optional environment if the Worker utilizes one.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return Optional environment if the Worker utilizes one.
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Optional dispatch namespace the script belongs to.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Optional dispatch namespace the script belongs to.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Name of Worker that is to be the consumer.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Name of Worker that is to be the consumer.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private WorkerScriptTailConsumerArgs() {}

    private WorkerScriptTailConsumerArgs(WorkerScriptTailConsumerArgs $) {
        this.environment = $.environment;
        this.namespace = $.namespace;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerScriptTailConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerScriptTailConsumerArgs $;

        public Builder() {
            $ = new WorkerScriptTailConsumerArgs();
        }

        public Builder(WorkerScriptTailConsumerArgs defaults) {
            $ = new WorkerScriptTailConsumerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environment Optional environment if the Worker utilizes one.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Optional environment if the Worker utilizes one.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param namespace Optional dispatch namespace the script belongs to.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Optional dispatch namespace the script belongs to.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param service Name of Worker that is to be the consumer.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Name of Worker that is to be the consumer.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public WorkerScriptTailConsumerArgs build() {
            if ($.service == null) {
                throw new MissingRequiredPropertyException("WorkerScriptTailConsumerArgs", "service");
            }
            return $;
        }
    }

}
