// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessShortLivedCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessShortLivedCertificateState Empty = new ZeroTrustAccessShortLivedCertificateState();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The Access Application ID to associate with the CA certificate.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The Access Application ID to associate with the CA certificate.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Application Audience (AUD) Tag of the CA certificate.
     * 
     */
    @Import(name="aud")
    private @Nullable Output<String> aud;

    /**
     * @return Application Audience (AUD) Tag of the CA certificate.
     * 
     */
    public Optional<Output<String>> aud() {
        return Optional.ofNullable(this.aud);
    }

    /**
     * Cryptographic public key of the generated CA certificate.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return Cryptographic public key of the generated CA certificate.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ZeroTrustAccessShortLivedCertificateState() {}

    private ZeroTrustAccessShortLivedCertificateState(ZeroTrustAccessShortLivedCertificateState $) {
        this.accountId = $.accountId;
        this.applicationId = $.applicationId;
        this.aud = $.aud;
        this.publicKey = $.publicKey;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessShortLivedCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessShortLivedCertificateState $;

        public Builder() {
            $ = new ZeroTrustAccessShortLivedCertificateState();
        }

        public Builder(ZeroTrustAccessShortLivedCertificateState defaults) {
            $ = new ZeroTrustAccessShortLivedCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param applicationId The Access Application ID to associate with the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The Access Application ID to associate with the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param aud Application Audience (AUD) Tag of the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder aud(@Nullable Output<String> aud) {
            $.aud = aud;
            return this;
        }

        /**
         * @param aud Application Audience (AUD) Tag of the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder aud(String aud) {
            return aud(Output.of(aud));
        }

        /**
         * @param publicKey Cryptographic public key of the generated CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey Cryptographic public key of the generated CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZeroTrustAccessShortLivedCertificateState build() {
            return $;
        }
    }

}
