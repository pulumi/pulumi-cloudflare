// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs Empty = new ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs();

    /**
     * The common name to match.
     * 
     */
    @Import(name="commonName", required=true)
    private Output<String> commonName;

    /**
     * @return The common name to match.
     * 
     */
    public Output<String> commonName() {
        return this.commonName;
    }

    private ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs() {}

    private ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs(ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs $) {
        this.commonName = $.commonName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs $;

        public Builder() {
            $ = new ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs();
        }

        public Builder(ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs defaults) {
            $ = new ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonName The common name to match.
         * 
         * @return builder
         * 
         */
        public Builder commonName(Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName The common name to match.
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        public ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs build() {
            if ($.commonName == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationPolicyIncludeCommonNameArgs", "commonName");
            }
            return $;
        }
    }

}
