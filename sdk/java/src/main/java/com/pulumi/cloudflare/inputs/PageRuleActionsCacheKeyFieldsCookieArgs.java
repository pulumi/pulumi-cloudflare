// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PageRuleActionsCacheKeyFieldsCookieArgs extends com.pulumi.resources.ResourceArgs {

    public static final PageRuleActionsCacheKeyFieldsCookieArgs Empty = new PageRuleActionsCacheKeyFieldsCookieArgs();

    /**
     * Check for presence of specified cookies, without including their actual values.
     * 
     */
    @Import(name="checkPresences")
    private @Nullable Output<List<String>> checkPresences;

    /**
     * @return Check for presence of specified cookies, without including their actual values.
     * 
     */
    public Optional<Output<List<String>>> checkPresences() {
        return Optional.ofNullable(this.checkPresences);
    }

    /**
     * Use values of specified cookies in Cache Key.
     * 
     */
    @Import(name="includes")
    private @Nullable Output<List<String>> includes;

    /**
     * @return Use values of specified cookies in Cache Key.
     * 
     */
    public Optional<Output<List<String>>> includes() {
        return Optional.ofNullable(this.includes);
    }

    private PageRuleActionsCacheKeyFieldsCookieArgs() {}

    private PageRuleActionsCacheKeyFieldsCookieArgs(PageRuleActionsCacheKeyFieldsCookieArgs $) {
        this.checkPresences = $.checkPresences;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PageRuleActionsCacheKeyFieldsCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PageRuleActionsCacheKeyFieldsCookieArgs $;

        public Builder() {
            $ = new PageRuleActionsCacheKeyFieldsCookieArgs();
        }

        public Builder(PageRuleActionsCacheKeyFieldsCookieArgs defaults) {
            $ = new PageRuleActionsCacheKeyFieldsCookieArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkPresences Check for presence of specified cookies, without including their actual values.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(@Nullable Output<List<String>> checkPresences) {
            $.checkPresences = checkPresences;
            return this;
        }

        /**
         * @param checkPresences Check for presence of specified cookies, without including their actual values.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(List<String> checkPresences) {
            return checkPresences(Output.of(checkPresences));
        }

        /**
         * @param checkPresences Check for presence of specified cookies, without including their actual values.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(String... checkPresences) {
            return checkPresences(List.of(checkPresences));
        }

        /**
         * @param includes Use values of specified cookies in Cache Key.
         * 
         * @return builder
         * 
         */
        public Builder includes(@Nullable Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes Use values of specified cookies in Cache Key.
         * 
         * @return builder
         * 
         */
        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        /**
         * @param includes Use values of specified cookies in Cache Key.
         * 
         * @return builder
         * 
         */
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public PageRuleActionsCacheKeyFieldsCookieArgs build() {
            return $;
        }
    }

}
