// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessOrganizationCustomPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessOrganizationCustomPageArgs Empty = new ZeroTrustAccessOrganizationCustomPageArgs();

    /**
     * The id of the forbidden page.
     * 
     */
    @Import(name="forbidden")
    private @Nullable Output<String> forbidden;

    /**
     * @return The id of the forbidden page.
     * 
     */
    public Optional<Output<String>> forbidden() {
        return Optional.ofNullable(this.forbidden);
    }

    /**
     * The id of the identity denied page.
     * 
     */
    @Import(name="identityDenied")
    private @Nullable Output<String> identityDenied;

    /**
     * @return The id of the identity denied page.
     * 
     */
    public Optional<Output<String>> identityDenied() {
        return Optional.ofNullable(this.identityDenied);
    }

    private ZeroTrustAccessOrganizationCustomPageArgs() {}

    private ZeroTrustAccessOrganizationCustomPageArgs(ZeroTrustAccessOrganizationCustomPageArgs $) {
        this.forbidden = $.forbidden;
        this.identityDenied = $.identityDenied;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessOrganizationCustomPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessOrganizationCustomPageArgs $;

        public Builder() {
            $ = new ZeroTrustAccessOrganizationCustomPageArgs();
        }

        public Builder(ZeroTrustAccessOrganizationCustomPageArgs defaults) {
            $ = new ZeroTrustAccessOrganizationCustomPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forbidden The id of the forbidden page.
         * 
         * @return builder
         * 
         */
        public Builder forbidden(@Nullable Output<String> forbidden) {
            $.forbidden = forbidden;
            return this;
        }

        /**
         * @param forbidden The id of the forbidden page.
         * 
         * @return builder
         * 
         */
        public Builder forbidden(String forbidden) {
            return forbidden(Output.of(forbidden));
        }

        /**
         * @param identityDenied The id of the identity denied page.
         * 
         * @return builder
         * 
         */
        public Builder identityDenied(@Nullable Output<String> identityDenied) {
            $.identityDenied = identityDenied;
            return this;
        }

        /**
         * @param identityDenied The id of the identity denied page.
         * 
         * @return builder
         * 
         */
        public Builder identityDenied(String identityDenied) {
            return identityDenied(Output.of(identityDenied));
        }

        public ZeroTrustAccessOrganizationCustomPageArgs build() {
            return $;
        }
    }

}
