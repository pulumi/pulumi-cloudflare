// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustDlpProfileContextAwarenessSkipArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class ZeroTrustDlpProfileContextAwarenessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDlpProfileContextAwarenessArgs Empty = new ZeroTrustDlpProfileContextAwarenessArgs();

    /**
     * Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Content types to exclude from context analysis and return all matches.
     * 
     */
    @Import(name="skip", required=true)
    private Output<ZeroTrustDlpProfileContextAwarenessSkipArgs> skip;

    /**
     * @return Content types to exclude from context analysis and return all matches.
     * 
     */
    public Output<ZeroTrustDlpProfileContextAwarenessSkipArgs> skip() {
        return this.skip;
    }

    private ZeroTrustDlpProfileContextAwarenessArgs() {}

    private ZeroTrustDlpProfileContextAwarenessArgs(ZeroTrustDlpProfileContextAwarenessArgs $) {
        this.enabled = $.enabled;
        this.skip = $.skip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDlpProfileContextAwarenessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDlpProfileContextAwarenessArgs $;

        public Builder() {
            $ = new ZeroTrustDlpProfileContextAwarenessArgs();
        }

        public Builder(ZeroTrustDlpProfileContextAwarenessArgs defaults) {
            $ = new ZeroTrustDlpProfileContextAwarenessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Scan the context of predefined entries to only return matches surrounded by keywords.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Scan the context of predefined entries to only return matches surrounded by keywords.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param skip Content types to exclude from context analysis and return all matches.
         * 
         * @return builder
         * 
         */
        public Builder skip(Output<ZeroTrustDlpProfileContextAwarenessSkipArgs> skip) {
            $.skip = skip;
            return this;
        }

        /**
         * @param skip Content types to exclude from context analysis and return all matches.
         * 
         * @return builder
         * 
         */
        public Builder skip(ZeroTrustDlpProfileContextAwarenessSkipArgs skip) {
            return skip(Output.of(skip));
        }

        public ZeroTrustDlpProfileContextAwarenessArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpProfileContextAwarenessArgs", "enabled");
            }
            if ($.skip == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpProfileContextAwarenessArgs", "skip");
            }
            return $;
        }
    }

}
