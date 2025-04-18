// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs Empty = new PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs();

    /**
     * ID of the Durable Object namespace.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return ID of the Durable Object namespace.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    private PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs() {}

    private PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs(PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs $) {
        this.namespaceId = $.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs $;

        public Builder() {
            $ = new PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs();
        }

        public Builder(PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs defaults) {
            $ = new PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceId ID of the Durable Object namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId ID of the Durable Object namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public PagesProjectDeploymentConfigsProductionDurableObjectNamespacesArgs build() {
            return $;
        }
    }

}
