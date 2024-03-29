// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApplicationFooterLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationFooterLinkArgs Empty = new AccessApplicationFooterLinkArgs();

    /**
     * The name of the footer link.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the footer link.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the footer link.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the footer link.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
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
         * @param name The name of the footer link.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the footer link.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param url The URL of the footer link.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the footer link.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public AccessApplicationFooterLinkArgs build() {
            return $;
        }
    }

}
