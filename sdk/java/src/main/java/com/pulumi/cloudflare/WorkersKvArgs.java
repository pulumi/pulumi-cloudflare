// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkersKvArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersKvArgs Empty = new WorkersKvArgs();

    /**
     * The key name
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key name
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The ID of the Workers KV namespace in which you want to create the KV pair
     * 
     */
    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    /**
     * @return The ID of the Workers KV namespace in which you want to create the KV pair
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    /**
     * The string value to be stored in the key
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The string value to be stored in the key
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private WorkersKvArgs() {}

    private WorkersKvArgs(WorkersKvArgs $) {
        this.key = $.key;
        this.namespaceId = $.namespaceId;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersKvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersKvArgs $;

        public Builder() {
            $ = new WorkersKvArgs();
        }

        public Builder(WorkersKvArgs defaults) {
            $ = new WorkersKvArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key name
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key name
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param namespaceId The ID of the Workers KV namespace in which you want to create the KV pair
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The ID of the Workers KV namespace in which you want to create the KV pair
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param value The string value to be stored in the key
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The string value to be stored in the key
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public WorkersKvArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}