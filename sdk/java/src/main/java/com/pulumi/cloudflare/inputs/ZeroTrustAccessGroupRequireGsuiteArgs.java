// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustAccessGroupRequireGsuiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessGroupRequireGsuiteArgs Empty = new ZeroTrustAccessGroupRequireGsuiteArgs();

    /**
     * The email of the Google Workspace group.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email of the Google Workspace group.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * The ID of your Google Workspace identity provider.
     * 
     */
    @Import(name="identityProviderId", required=true)
    private Output<String> identityProviderId;

    /**
     * @return The ID of your Google Workspace identity provider.
     * 
     */
    public Output<String> identityProviderId() {
        return this.identityProviderId;
    }

    private ZeroTrustAccessGroupRequireGsuiteArgs() {}

    private ZeroTrustAccessGroupRequireGsuiteArgs(ZeroTrustAccessGroupRequireGsuiteArgs $) {
        this.email = $.email;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessGroupRequireGsuiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessGroupRequireGsuiteArgs $;

        public Builder() {
            $ = new ZeroTrustAccessGroupRequireGsuiteArgs();
        }

        public Builder(ZeroTrustAccessGroupRequireGsuiteArgs defaults) {
            $ = new ZeroTrustAccessGroupRequireGsuiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email of the Google Workspace group.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email of the Google Workspace group.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param identityProviderId The ID of your Google Workspace identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param identityProviderId The ID of your Google Workspace identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public ZeroTrustAccessGroupRequireGsuiteArgs build() {
            if ($.email == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessGroupRequireGsuiteArgs", "email");
            }
            if ($.identityProviderId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessGroupRequireGsuiteArgs", "identityProviderId");
            }
            return $;
        }
    }

}
