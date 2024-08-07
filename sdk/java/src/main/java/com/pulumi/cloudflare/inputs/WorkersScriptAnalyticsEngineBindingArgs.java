// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class WorkersScriptAnalyticsEngineBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersScriptAnalyticsEngineBindingArgs Empty = new WorkersScriptAnalyticsEngineBindingArgs();

    /**
     * The name of the Analytics Engine dataset to write to.
     * 
     */
    @Import(name="dataset", required=true)
    private Output<String> dataset;

    /**
     * @return The name of the Analytics Engine dataset to write to.
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }

    /**
     * The global variable for the binding in your Worker code.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private WorkersScriptAnalyticsEngineBindingArgs() {}

    private WorkersScriptAnalyticsEngineBindingArgs(WorkersScriptAnalyticsEngineBindingArgs $) {
        this.dataset = $.dataset;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersScriptAnalyticsEngineBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersScriptAnalyticsEngineBindingArgs $;

        public Builder() {
            $ = new WorkersScriptAnalyticsEngineBindingArgs();
        }

        public Builder(WorkersScriptAnalyticsEngineBindingArgs defaults) {
            $ = new WorkersScriptAnalyticsEngineBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset The name of the Analytics Engine dataset to write to.
         * 
         * @return builder
         * 
         */
        public Builder dataset(Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset The name of the Analytics Engine dataset to write to.
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param name The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WorkersScriptAnalyticsEngineBindingArgs build() {
            if ($.dataset == null) {
                throw new MissingRequiredPropertyException("WorkersScriptAnalyticsEngineBindingArgs", "dataset");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("WorkersScriptAnalyticsEngineBindingArgs", "name");
            }
            return $;
        }
    }

}
