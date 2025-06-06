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


public final class R2CustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final R2CustomDomainArgs Empty = new R2CustomDomainArgs();

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
     * Name of the custom domain to be added.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return Name of the custom domain to be added.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * Whether to enable public bucket access at the custom domain. If undefined, the domain will be enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable public bucket access at the custom domain. If undefined, the domain will be enabled.
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

    /**
     * Minimum TLS Version the custom domain will accept for incoming connections. If not set, defaults to 1.0.
     * Available values: &#34;1.0&#34;, &#34;1.1&#34;, &#34;1.2&#34;, &#34;1.3&#34;.
     * 
     */
    @Import(name="minTls")
    private @Nullable Output<String> minTls;

    /**
     * @return Minimum TLS Version the custom domain will accept for incoming connections. If not set, defaults to 1.0.
     * Available values: &#34;1.0&#34;, &#34;1.1&#34;, &#34;1.2&#34;, &#34;1.3&#34;.
     * 
     */
    public Optional<Output<String>> minTls() {
        return Optional.ofNullable(this.minTls);
    }

    /**
     * Zone ID of the custom domain.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Zone ID of the custom domain.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private R2CustomDomainArgs() {}

    private R2CustomDomainArgs(R2CustomDomainArgs $) {
        this.accountId = $.accountId;
        this.bucketName = $.bucketName;
        this.domain = $.domain;
        this.enabled = $.enabled;
        this.jurisdiction = $.jurisdiction;
        this.minTls = $.minTls;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(R2CustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private R2CustomDomainArgs $;

        public Builder() {
            $ = new R2CustomDomainArgs();
        }

        public Builder(R2CustomDomainArgs defaults) {
            $ = new R2CustomDomainArgs(Objects.requireNonNull(defaults));
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
         * @param domain Name of the custom domain to be added.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Name of the custom domain to be added.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param enabled Whether to enable public bucket access at the custom domain. If undefined, the domain will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable public bucket access at the custom domain. If undefined, the domain will be enabled.
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

        /**
         * @param minTls Minimum TLS Version the custom domain will accept for incoming connections. If not set, defaults to 1.0.
         * Available values: &#34;1.0&#34;, &#34;1.1&#34;, &#34;1.2&#34;, &#34;1.3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minTls(@Nullable Output<String> minTls) {
            $.minTls = minTls;
            return this;
        }

        /**
         * @param minTls Minimum TLS Version the custom domain will accept for incoming connections. If not set, defaults to 1.0.
         * Available values: &#34;1.0&#34;, &#34;1.1&#34;, &#34;1.2&#34;, &#34;1.3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minTls(String minTls) {
            return minTls(Output.of(minTls));
        }

        /**
         * @param zoneId Zone ID of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Zone ID of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public R2CustomDomainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("R2CustomDomainArgs", "accountId");
            }
            if ($.bucketName == null) {
                throw new MissingRequiredPropertyException("R2CustomDomainArgs", "bucketName");
            }
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("R2CustomDomainArgs", "domain");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("R2CustomDomainArgs", "enabled");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("R2CustomDomainArgs", "zoneId");
            }
            return $;
        }
    }

}
