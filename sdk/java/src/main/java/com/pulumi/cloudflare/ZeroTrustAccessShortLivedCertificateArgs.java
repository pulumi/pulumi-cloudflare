// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessShortLivedCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessShortLivedCertificateArgs Empty = new ZeroTrustAccessShortLivedCertificateArgs();

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
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return The Access Application ID to associate with the CA certificate.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
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

    private ZeroTrustAccessShortLivedCertificateArgs() {}

    private ZeroTrustAccessShortLivedCertificateArgs(ZeroTrustAccessShortLivedCertificateArgs $) {
        this.accountId = $.accountId;
        this.applicationId = $.applicationId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessShortLivedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessShortLivedCertificateArgs $;

        public Builder() {
            $ = new ZeroTrustAccessShortLivedCertificateArgs();
        }

        public Builder(ZeroTrustAccessShortLivedCertificateArgs defaults) {
            $ = new ZeroTrustAccessShortLivedCertificateArgs(Objects.requireNonNull(defaults));
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
        public Builder applicationId(Output<String> applicationId) {
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

        public ZeroTrustAccessShortLivedCertificateArgs build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessShortLivedCertificateArgs", "applicationId");
            }
            return $;
        }
    }

}
