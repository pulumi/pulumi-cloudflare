// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessSkipArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class ZeroTrustDlpCustomProfileContextAwarenessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDlpCustomProfileContextAwarenessArgs Empty = new ZeroTrustDlpCustomProfileContextAwarenessArgs();

    /**
     * If true, scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return If true, scan the context of predefined entries to only return matches surrounded by keywords.
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
    private Output<ZeroTrustDlpCustomProfileContextAwarenessSkipArgs> skip;

    /**
     * @return Content types to exclude from context analysis and return all matches.
     * 
     */
    public Output<ZeroTrustDlpCustomProfileContextAwarenessSkipArgs> skip() {
        return this.skip;
    }

    private ZeroTrustDlpCustomProfileContextAwarenessArgs() {}

    private ZeroTrustDlpCustomProfileContextAwarenessArgs(ZeroTrustDlpCustomProfileContextAwarenessArgs $) {
        this.enabled = $.enabled;
        this.skip = $.skip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDlpCustomProfileContextAwarenessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDlpCustomProfileContextAwarenessArgs $;

        public Builder() {
            $ = new ZeroTrustDlpCustomProfileContextAwarenessArgs();
        }

        public Builder(ZeroTrustDlpCustomProfileContextAwarenessArgs defaults) {
            $ = new ZeroTrustDlpCustomProfileContextAwarenessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled If true, scan the context of predefined entries to only return matches surrounded by keywords.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If true, scan the context of predefined entries to only return matches surrounded by keywords.
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
        public Builder skip(Output<ZeroTrustDlpCustomProfileContextAwarenessSkipArgs> skip) {
            $.skip = skip;
            return this;
        }

        /**
         * @param skip Content types to exclude from context analysis and return all matches.
         * 
         * @return builder
         * 
         */
        public Builder skip(ZeroTrustDlpCustomProfileContextAwarenessSkipArgs skip) {
            return skip(Output.of(skip));
        }

        public ZeroTrustDlpCustomProfileContextAwarenessArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpCustomProfileContextAwarenessArgs", "enabled");
            }
            if ($.skip == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpCustomProfileContextAwarenessArgs", "skip");
            }
            return $;
        }
    }

}
