// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class WorkersScriptKvNamespaceBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersScriptKvNamespaceBindingArgs Empty = new WorkersScriptKvNamespaceBindingArgs();

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

    /**
     * ID of the KV namespace you want to use.
     * 
     */
    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    /**
     * @return ID of the KV namespace you want to use.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    private WorkersScriptKvNamespaceBindingArgs() {}

    private WorkersScriptKvNamespaceBindingArgs(WorkersScriptKvNamespaceBindingArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersScriptKvNamespaceBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersScriptKvNamespaceBindingArgs $;

        public Builder() {
            $ = new WorkersScriptKvNamespaceBindingArgs();
        }

        public Builder(WorkersScriptKvNamespaceBindingArgs defaults) {
            $ = new WorkersScriptKvNamespaceBindingArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param namespaceId ID of the KV namespace you want to use.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId ID of the KV namespace you want to use.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public WorkersScriptKvNamespaceBindingArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("WorkersScriptKvNamespaceBindingArgs", "name");
            }
            if ($.namespaceId == null) {
                throw new MissingRequiredPropertyException("WorkersScriptKvNamespaceBindingArgs", "namespaceId");
            }
            return $;
        }
    }

}
