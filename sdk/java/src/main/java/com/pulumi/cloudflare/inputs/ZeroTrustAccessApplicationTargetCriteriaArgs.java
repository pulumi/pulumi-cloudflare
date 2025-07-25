// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class ZeroTrustAccessApplicationTargetCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessApplicationTargetCriteriaArgs Empty = new ZeroTrustAccessApplicationTargetCriteriaArgs();

    /**
     * The port that the targets use for the chosen communication protocol. A port cannot be assigned to multiple protocols.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port that the targets use for the chosen communication protocol. A port cannot be assigned to multiple protocols.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The communication protocol your application secures.
     * Available values: &#34;SSH&#34;.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The communication protocol your application secures.
     * Available values: &#34;SSH&#34;.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Contains a map of target attribute keys to target attribute values.
     * 
     */
    @Import(name="targetAttributes", required=true)
    private Output<Map<String,List<String>>> targetAttributes;

    /**
     * @return Contains a map of target attribute keys to target attribute values.
     * 
     */
    public Output<Map<String,List<String>>> targetAttributes() {
        return this.targetAttributes;
    }

    private ZeroTrustAccessApplicationTargetCriteriaArgs() {}

    private ZeroTrustAccessApplicationTargetCriteriaArgs(ZeroTrustAccessApplicationTargetCriteriaArgs $) {
        this.port = $.port;
        this.protocol = $.protocol;
        this.targetAttributes = $.targetAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessApplicationTargetCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessApplicationTargetCriteriaArgs $;

        public Builder() {
            $ = new ZeroTrustAccessApplicationTargetCriteriaArgs();
        }

        public Builder(ZeroTrustAccessApplicationTargetCriteriaArgs defaults) {
            $ = new ZeroTrustAccessApplicationTargetCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The port that the targets use for the chosen communication protocol. A port cannot be assigned to multiple protocols.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port that the targets use for the chosen communication protocol. A port cannot be assigned to multiple protocols.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The communication protocol your application secures.
         * Available values: &#34;SSH&#34;.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The communication protocol your application secures.
         * Available values: &#34;SSH&#34;.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param targetAttributes Contains a map of target attribute keys to target attribute values.
         * 
         * @return builder
         * 
         */
        public Builder targetAttributes(Output<Map<String,List<String>>> targetAttributes) {
            $.targetAttributes = targetAttributes;
            return this;
        }

        /**
         * @param targetAttributes Contains a map of target attribute keys to target attribute values.
         * 
         * @return builder
         * 
         */
        public Builder targetAttributes(Map<String,List<String>> targetAttributes) {
            return targetAttributes(Output.of(targetAttributes));
        }

        public ZeroTrustAccessApplicationTargetCriteriaArgs build() {
            if ($.port == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationTargetCriteriaArgs", "port");
            }
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationTargetCriteriaArgs", "protocol");
            }
            if ($.targetAttributes == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationTargetCriteriaArgs", "targetAttributes");
            }
            return $;
        }
    }

}
