// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessCustomPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessCustomPageArgs Empty = new AccessCustomPageArgs();

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
     * Number of apps the custom page is assigned to.
     * 
     */
    @Import(name="appCount")
    private @Nullable Output<Integer> appCount;

    /**
     * @return Number of apps the custom page is assigned to.
     * 
     */
    public Optional<Output<Integer>> appCount() {
        return Optional.ofNullable(this.appCount);
    }

    /**
     * Custom page HTML.
     * 
     */
    @Import(name="customHtml", required=true)
    private Output<String> customHtml;

    /**
     * @return Custom page HTML.
     * 
     */
    public Output<String> customHtml() {
        return this.customHtml;
    }

    /**
     * Custom page name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Custom page name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Custom page type.
     * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Custom page type.
     * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AccessCustomPageArgs() {}

    private AccessCustomPageArgs(AccessCustomPageArgs $) {
        this.accountId = $.accountId;
        this.appCount = $.appCount;
        this.customHtml = $.customHtml;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessCustomPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessCustomPageArgs $;

        public Builder() {
            $ = new AccessCustomPageArgs();
        }

        public Builder(AccessCustomPageArgs defaults) {
            $ = new AccessCustomPageArgs(Objects.requireNonNull(defaults));
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
         * @param appCount Number of apps the custom page is assigned to.
         * 
         * @return builder
         * 
         */
        public Builder appCount(@Nullable Output<Integer> appCount) {
            $.appCount = appCount;
            return this;
        }

        /**
         * @param appCount Number of apps the custom page is assigned to.
         * 
         * @return builder
         * 
         */
        public Builder appCount(Integer appCount) {
            return appCount(Output.of(appCount));
        }

        /**
         * @param customHtml Custom page HTML.
         * 
         * @return builder
         * 
         */
        public Builder customHtml(Output<String> customHtml) {
            $.customHtml = customHtml;
            return this;
        }

        /**
         * @param customHtml Custom page HTML.
         * 
         * @return builder
         * 
         */
        public Builder customHtml(String customHtml) {
            return customHtml(Output.of(customHtml));
        }

        /**
         * @param name Custom page name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Custom page name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Custom page type.
         * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Custom page type.
         * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AccessCustomPageArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("AccessCustomPageArgs", "accountId");
            }
            if ($.customHtml == null) {
                throw new MissingRequiredPropertyException("AccessCustomPageArgs", "customHtml");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AccessCustomPageArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AccessCustomPageArgs", "type");
            }
            return $;
        }
    }

}
