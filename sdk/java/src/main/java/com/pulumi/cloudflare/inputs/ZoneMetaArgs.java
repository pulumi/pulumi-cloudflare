// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneMetaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneMetaArgs Empty = new ZoneMetaArgs();

    /**
     * The zone is only configured for CDN.
     * 
     */
    @Import(name="cdnOnly")
    private @Nullable Output<Boolean> cdnOnly;

    /**
     * @return The zone is only configured for CDN.
     * 
     */
    public Optional<Output<Boolean>> cdnOnly() {
        return Optional.ofNullable(this.cdnOnly);
    }

    /**
     * Number of Custom Certificates the zone can have.
     * 
     */
    @Import(name="customCertificateQuota")
    private @Nullable Output<Integer> customCertificateQuota;

    /**
     * @return Number of Custom Certificates the zone can have.
     * 
     */
    public Optional<Output<Integer>> customCertificateQuota() {
        return Optional.ofNullable(this.customCertificateQuota);
    }

    /**
     * The zone is only configured for DNS.
     * 
     */
    @Import(name="dnsOnly")
    private @Nullable Output<Boolean> dnsOnly;

    /**
     * @return The zone is only configured for DNS.
     * 
     */
    public Optional<Output<Boolean>> dnsOnly() {
        return Optional.ofNullable(this.dnsOnly);
    }

    /**
     * The zone is setup with Foundation DNS.
     * 
     */
    @Import(name="foundationDns")
    private @Nullable Output<Boolean> foundationDns;

    /**
     * @return The zone is setup with Foundation DNS.
     * 
     */
    public Optional<Output<Boolean>> foundationDns() {
        return Optional.ofNullable(this.foundationDns);
    }

    /**
     * Number of Page Rules a zone can have.
     * 
     */
    @Import(name="pageRuleQuota")
    private @Nullable Output<Integer> pageRuleQuota;

    /**
     * @return Number of Page Rules a zone can have.
     * 
     */
    public Optional<Output<Integer>> pageRuleQuota() {
        return Optional.ofNullable(this.pageRuleQuota);
    }

    /**
     * The zone has been flagged for phishing.
     * 
     */
    @Import(name="phishingDetected")
    private @Nullable Output<Boolean> phishingDetected;

    /**
     * @return The zone has been flagged for phishing.
     * 
     */
    public Optional<Output<Boolean>> phishingDetected() {
        return Optional.ofNullable(this.phishingDetected);
    }

    @Import(name="step")
    private @Nullable Output<Integer> step;

    public Optional<Output<Integer>> step() {
        return Optional.ofNullable(this.step);
    }

    private ZoneMetaArgs() {}

    private ZoneMetaArgs(ZoneMetaArgs $) {
        this.cdnOnly = $.cdnOnly;
        this.customCertificateQuota = $.customCertificateQuota;
        this.dnsOnly = $.dnsOnly;
        this.foundationDns = $.foundationDns;
        this.pageRuleQuota = $.pageRuleQuota;
        this.phishingDetected = $.phishingDetected;
        this.step = $.step;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneMetaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneMetaArgs $;

        public Builder() {
            $ = new ZoneMetaArgs();
        }

        public Builder(ZoneMetaArgs defaults) {
            $ = new ZoneMetaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdnOnly The zone is only configured for CDN.
         * 
         * @return builder
         * 
         */
        public Builder cdnOnly(@Nullable Output<Boolean> cdnOnly) {
            $.cdnOnly = cdnOnly;
            return this;
        }

        /**
         * @param cdnOnly The zone is only configured for CDN.
         * 
         * @return builder
         * 
         */
        public Builder cdnOnly(Boolean cdnOnly) {
            return cdnOnly(Output.of(cdnOnly));
        }

        /**
         * @param customCertificateQuota Number of Custom Certificates the zone can have.
         * 
         * @return builder
         * 
         */
        public Builder customCertificateQuota(@Nullable Output<Integer> customCertificateQuota) {
            $.customCertificateQuota = customCertificateQuota;
            return this;
        }

        /**
         * @param customCertificateQuota Number of Custom Certificates the zone can have.
         * 
         * @return builder
         * 
         */
        public Builder customCertificateQuota(Integer customCertificateQuota) {
            return customCertificateQuota(Output.of(customCertificateQuota));
        }

        /**
         * @param dnsOnly The zone is only configured for DNS.
         * 
         * @return builder
         * 
         */
        public Builder dnsOnly(@Nullable Output<Boolean> dnsOnly) {
            $.dnsOnly = dnsOnly;
            return this;
        }

        /**
         * @param dnsOnly The zone is only configured for DNS.
         * 
         * @return builder
         * 
         */
        public Builder dnsOnly(Boolean dnsOnly) {
            return dnsOnly(Output.of(dnsOnly));
        }

        /**
         * @param foundationDns The zone is setup with Foundation DNS.
         * 
         * @return builder
         * 
         */
        public Builder foundationDns(@Nullable Output<Boolean> foundationDns) {
            $.foundationDns = foundationDns;
            return this;
        }

        /**
         * @param foundationDns The zone is setup with Foundation DNS.
         * 
         * @return builder
         * 
         */
        public Builder foundationDns(Boolean foundationDns) {
            return foundationDns(Output.of(foundationDns));
        }

        /**
         * @param pageRuleQuota Number of Page Rules a zone can have.
         * 
         * @return builder
         * 
         */
        public Builder pageRuleQuota(@Nullable Output<Integer> pageRuleQuota) {
            $.pageRuleQuota = pageRuleQuota;
            return this;
        }

        /**
         * @param pageRuleQuota Number of Page Rules a zone can have.
         * 
         * @return builder
         * 
         */
        public Builder pageRuleQuota(Integer pageRuleQuota) {
            return pageRuleQuota(Output.of(pageRuleQuota));
        }

        /**
         * @param phishingDetected The zone has been flagged for phishing.
         * 
         * @return builder
         * 
         */
        public Builder phishingDetected(@Nullable Output<Boolean> phishingDetected) {
            $.phishingDetected = phishingDetected;
            return this;
        }

        /**
         * @param phishingDetected The zone has been flagged for phishing.
         * 
         * @return builder
         * 
         */
        public Builder phishingDetected(Boolean phishingDetected) {
            return phishingDetected(Output.of(phishingDetected));
        }

        public Builder step(@Nullable Output<Integer> step) {
            $.step = step;
            return this;
        }

        public Builder step(Integer step) {
            return step(Output.of(step));
        }

        public ZoneMetaArgs build() {
            return $;
        }
    }

}
