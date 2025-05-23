// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class R2ManagedDomainState extends com.pulumi.resources.ResourceArgs {

    public static final R2ManagedDomainState Empty = new R2ManagedDomainState();

    /**
     * Account ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account ID.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Bucket ID.
     * 
     */
    @Import(name="bucketId")
    private @Nullable Output<String> bucketId;

    /**
     * @return Bucket ID.
     * 
     */
    public Optional<Output<String>> bucketId() {
        return Optional.ofNullable(this.bucketId);
    }

    /**
     * Name of the bucket.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return Name of the bucket.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Domain name of the bucket&#39;s r2.dev domain.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Domain name of the bucket&#39;s r2.dev domain.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Whether to enable public bucket access at the r2.dev domain.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable public bucket access at the r2.dev domain.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Jurisdiction of the bucket
     * 
     */
    @Import(name="jurisdiction")
    private @Nullable Output<String> jurisdiction;

    /**
     * @return Jurisdiction of the bucket
     * 
     */
    public Optional<Output<String>> jurisdiction() {
        return Optional.ofNullable(this.jurisdiction);
    }

    private R2ManagedDomainState() {}

    private R2ManagedDomainState(R2ManagedDomainState $) {
        this.accountId = $.accountId;
        this.bucketId = $.bucketId;
        this.bucketName = $.bucketName;
        this.domain = $.domain;
        this.enabled = $.enabled;
        this.jurisdiction = $.jurisdiction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(R2ManagedDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private R2ManagedDomainState $;

        public Builder() {
            $ = new R2ManagedDomainState();
        }

        public Builder(R2ManagedDomainState defaults) {
            $ = new R2ManagedDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param bucketId Bucket ID.
         * 
         * @return builder
         * 
         */
        public Builder bucketId(@Nullable Output<String> bucketId) {
            $.bucketId = bucketId;
            return this;
        }

        /**
         * @param bucketId Bucket ID.
         * 
         * @return builder
         * 
         */
        public Builder bucketId(String bucketId) {
            return bucketId(Output.of(bucketId));
        }

        /**
         * @param bucketName Name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName Name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param domain Domain name of the bucket&#39;s r2.dev domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Domain name of the bucket&#39;s r2.dev domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param enabled Whether to enable public bucket access at the r2.dev domain.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable public bucket access at the r2.dev domain.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param jurisdiction Jurisdiction of the bucket
         * 
         * @return builder
         * 
         */
        public Builder jurisdiction(@Nullable Output<String> jurisdiction) {
            $.jurisdiction = jurisdiction;
            return this;
        }

        /**
         * @param jurisdiction Jurisdiction of the bucket
         * 
         * @return builder
         * 
         */
        public Builder jurisdiction(String jurisdiction) {
            return jurisdiction(Output.of(jurisdiction));
        }

        public R2ManagedDomainState build() {
            return $;
        }
    }

}
