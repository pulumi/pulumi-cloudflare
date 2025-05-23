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


public final class R2ManagedDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final R2ManagedDomainArgs Empty = new R2ManagedDomainArgs();

    /**
     * Account ID.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account ID.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Name of the bucket.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return Name of the bucket.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * Whether to enable public bucket access at the r2.dev domain.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable public bucket access at the r2.dev domain.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
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

    private R2ManagedDomainArgs() {}

    private R2ManagedDomainArgs(R2ManagedDomainArgs $) {
        this.accountId = $.accountId;
        this.bucketName = $.bucketName;
        this.enabled = $.enabled;
        this.jurisdiction = $.jurisdiction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(R2ManagedDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private R2ManagedDomainArgs $;

        public Builder() {
            $ = new R2ManagedDomainArgs();
        }

        public Builder(R2ManagedDomainArgs defaults) {
            $ = new R2ManagedDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
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
         * @param bucketName Name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
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
         * @param enabled Whether to enable public bucket access at the r2.dev domain.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
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

        public R2ManagedDomainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("R2ManagedDomainArgs", "accountId");
            }
            if ($.bucketName == null) {
                throw new MissingRequiredPropertyException("R2ManagedDomainArgs", "bucketName");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("R2ManagedDomainArgs", "enabled");
            }
            return $;
        }
    }

}
