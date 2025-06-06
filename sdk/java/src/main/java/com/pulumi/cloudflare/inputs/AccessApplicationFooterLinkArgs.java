// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessApplicationFooterLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationFooterLinkArgs Empty = new AccessApplicationFooterLinkArgs();

    /**
     * The hypertext in the footer link.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The hypertext in the footer link.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * the hyperlink in the footer link.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return the hyperlink in the footer link.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private AccessApplicationFooterLinkArgs() {}

    private AccessApplicationFooterLinkArgs(AccessApplicationFooterLinkArgs $) {
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationFooterLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationFooterLinkArgs $;

        public Builder() {
            $ = new AccessApplicationFooterLinkArgs();
        }

        public Builder(AccessApplicationFooterLinkArgs defaults) {
            $ = new AccessApplicationFooterLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The hypertext in the footer link.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The hypertext in the footer link.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param url the hyperlink in the footer link.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url the hyperlink in the footer link.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public AccessApplicationFooterLinkArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AccessApplicationFooterLinkArgs", "name");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("AccessApplicationFooterLinkArgs", "url");
            }
            return $;
        }
    }

}
