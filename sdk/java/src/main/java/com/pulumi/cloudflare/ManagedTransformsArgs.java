// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ManagedTransformsManagedRequestHeaderArgs;
import com.pulumi.cloudflare.inputs.ManagedTransformsManagedResponseHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ManagedTransformsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedTransformsArgs Empty = new ManagedTransformsArgs();

    /**
     * The list of Managed Request Transforms.
     * 
     */
    @Import(name="managedRequestHeaders", required=true)
    private Output<List<ManagedTransformsManagedRequestHeaderArgs>> managedRequestHeaders;

    /**
     * @return The list of Managed Request Transforms.
     * 
     */
    public Output<List<ManagedTransformsManagedRequestHeaderArgs>> managedRequestHeaders() {
        return this.managedRequestHeaders;
    }

    /**
     * The list of Managed Response Transforms.
     * 
     */
    @Import(name="managedResponseHeaders", required=true)
    private Output<List<ManagedTransformsManagedResponseHeaderArgs>> managedResponseHeaders;

    /**
     * @return The list of Managed Response Transforms.
     * 
     */
    public Output<List<ManagedTransformsManagedResponseHeaderArgs>> managedResponseHeaders() {
        return this.managedResponseHeaders;
    }

    /**
     * The unique ID of the zone.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The unique ID of the zone.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ManagedTransformsArgs() {}

    private ManagedTransformsArgs(ManagedTransformsArgs $) {
        this.managedRequestHeaders = $.managedRequestHeaders;
        this.managedResponseHeaders = $.managedResponseHeaders;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedTransformsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedTransformsArgs $;

        public Builder() {
            $ = new ManagedTransformsArgs();
        }

        public Builder(ManagedTransformsArgs defaults) {
            $ = new ManagedTransformsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedRequestHeaders The list of Managed Request Transforms.
         * 
         * @return builder
         * 
         */
        public Builder managedRequestHeaders(Output<List<ManagedTransformsManagedRequestHeaderArgs>> managedRequestHeaders) {
            $.managedRequestHeaders = managedRequestHeaders;
            return this;
        }

        /**
         * @param managedRequestHeaders The list of Managed Request Transforms.
         * 
         * @return builder
         * 
         */
        public Builder managedRequestHeaders(List<ManagedTransformsManagedRequestHeaderArgs> managedRequestHeaders) {
            return managedRequestHeaders(Output.of(managedRequestHeaders));
        }

        /**
         * @param managedRequestHeaders The list of Managed Request Transforms.
         * 
         * @return builder
         * 
         */
        public Builder managedRequestHeaders(ManagedTransformsManagedRequestHeaderArgs... managedRequestHeaders) {
            return managedRequestHeaders(List.of(managedRequestHeaders));
        }

        /**
         * @param managedResponseHeaders The list of Managed Response Transforms.
         * 
         * @return builder
         * 
         */
        public Builder managedResponseHeaders(Output<List<ManagedTransformsManagedResponseHeaderArgs>> managedResponseHeaders) {
            $.managedResponseHeaders = managedResponseHeaders;
            return this;
        }

        /**
         * @param managedResponseHeaders The list of Managed Response Transforms.
         * 
         * @return builder
         * 
         */
        public Builder managedResponseHeaders(List<ManagedTransformsManagedResponseHeaderArgs> managedResponseHeaders) {
            return managedResponseHeaders(Output.of(managedResponseHeaders));
        }

        /**
         * @param managedResponseHeaders The list of Managed Response Transforms.
         * 
         * @return builder
         * 
         */
        public Builder managedResponseHeaders(ManagedTransformsManagedResponseHeaderArgs... managedResponseHeaders) {
            return managedResponseHeaders(List.of(managedResponseHeaders));
        }

        /**
         * @param zoneId The unique ID of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The unique ID of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ManagedTransformsArgs build() {
            if ($.managedRequestHeaders == null) {
                throw new MissingRequiredPropertyException("ManagedTransformsArgs", "managedRequestHeaders");
            }
            if ($.managedResponseHeaders == null) {
                throw new MissingRequiredPropertyException("ManagedTransformsArgs", "managedResponseHeaders");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("ManagedTransformsArgs", "zoneId");
            }
            return $;
        }
    }

}
