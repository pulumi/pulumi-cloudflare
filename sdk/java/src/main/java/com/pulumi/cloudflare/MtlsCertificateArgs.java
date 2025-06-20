// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MtlsCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final MtlsCertificateArgs Empty = new MtlsCertificateArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Indicates whether the certificate is a CA or leaf certificate.
     * 
     */
    @Import(name="ca", required=true)
    private Output<Boolean> ca;

    /**
     * @return Indicates whether the certificate is a CA or leaf certificate.
     * 
     */
    public Output<Boolean> ca() {
        return this.ca;
    }

    /**
     * The uploaded root CA certificate.
     * 
     */
    @Import(name="certificates", required=true)
    private Output<String> certificates;

    /**
     * @return The uploaded root CA certificate.
     * 
     */
    public Output<String> certificates() {
        return this.certificates;
    }

    /**
     * Optional unique name for the certificate. Only used for human readability.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optional unique name for the certificate. Only used for human readability.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust&#39;s block page.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust&#39;s block page.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    private MtlsCertificateArgs() {}

    private MtlsCertificateArgs(MtlsCertificateArgs $) {
        this.accountId = $.accountId;
        this.ca = $.ca;
        this.certificates = $.certificates;
        this.name = $.name;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MtlsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MtlsCertificateArgs $;

        public Builder() {
            $ = new MtlsCertificateArgs();
        }

        public Builder(MtlsCertificateArgs defaults) {
            $ = new MtlsCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param ca Indicates whether the certificate is a CA or leaf certificate.
         * 
         * @return builder
         * 
         */
        public Builder ca(Output<Boolean> ca) {
            $.ca = ca;
            return this;
        }

        /**
         * @param ca Indicates whether the certificate is a CA or leaf certificate.
         * 
         * @return builder
         * 
         */
        public Builder ca(Boolean ca) {
            return ca(Output.of(ca));
        }

        /**
         * @param certificates The uploaded root CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificates(Output<String> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates The uploaded root CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificates(String certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param name Optional unique name for the certificate. Only used for human readability.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optional unique name for the certificate. Only used for human readability.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateKey The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust&#39;s block page.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust&#39;s block page.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public MtlsCertificateArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("MtlsCertificateArgs", "accountId");
            }
            if ($.ca == null) {
                throw new MissingRequiredPropertyException("MtlsCertificateArgs", "ca");
            }
            if ($.certificates == null) {
                throw new MissingRequiredPropertyException("MtlsCertificateArgs", "certificates");
            }
            return $;
        }
    }

}
