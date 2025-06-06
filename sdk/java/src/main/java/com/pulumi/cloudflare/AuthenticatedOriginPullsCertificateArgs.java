// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AuthenticatedOriginPullsCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticatedOriginPullsCertificateArgs Empty = new AuthenticatedOriginPullsCertificateArgs();

    /**
     * The zone&#39;s leaf certificate.
     * 
     */
    @Import(name="certificate", required=true)
    private Output<String> certificate;

    /**
     * @return The zone&#39;s leaf certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }

    /**
     * The zone&#39;s private key.
     * 
     */
    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    /**
     * @return The zone&#39;s private key.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private AuthenticatedOriginPullsCertificateArgs() {}

    private AuthenticatedOriginPullsCertificateArgs(AuthenticatedOriginPullsCertificateArgs $) {
        this.certificate = $.certificate;
        this.privateKey = $.privateKey;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticatedOriginPullsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticatedOriginPullsCertificateArgs $;

        public Builder() {
            $ = new AuthenticatedOriginPullsCertificateArgs();
        }

        public Builder(AuthenticatedOriginPullsCertificateArgs defaults) {
            $ = new AuthenticatedOriginPullsCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The zone&#39;s leaf certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The zone&#39;s leaf certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param privateKey The zone&#39;s private key.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The zone&#39;s private key.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AuthenticatedOriginPullsCertificateArgs build() {
            if ($.certificate == null) {
                throw new MissingRequiredPropertyException("AuthenticatedOriginPullsCertificateArgs", "certificate");
            }
            if ($.privateKey == null) {
                throw new MissingRequiredPropertyException("AuthenticatedOriginPullsCertificateArgs", "privateKey");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("AuthenticatedOriginPullsCertificateArgs", "zoneId");
            }
            return $;
        }
    }

}
