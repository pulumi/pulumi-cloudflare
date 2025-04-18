// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs Empty = new RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs();

    /**
     * Checks for the presence of these header names. The presence of these headers is used in building the cache key.
     * 
     */
    @Import(name="checkPresences")
    private @Nullable Output<List<String>> checkPresences;

    /**
     * @return Checks for the presence of these header names. The presence of these headers is used in building the cache key.
     * 
     */
    public Optional<Output<List<String>>> checkPresences() {
        return Optional.ofNullable(this.checkPresences);
    }

    /**
     * For each header name and list of values combination, check if the request header contains any of the values provided. The presence of the request header and whether any of the values provided are contained in the request header value is used in building the cache key.
     * 
     */
    @Import(name="contains")
    private @Nullable Output<Map<String,List<String>>> contains;

    /**
     * @return For each header name and list of values combination, check if the request header contains any of the values provided. The presence of the request header and whether any of the values provided are contained in the request header value is used in building the cache key.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> contains() {
        return Optional.ofNullable(this.contains);
    }

    /**
     * Whether or not to include the origin header. A value of true will exclude the origin header in the cache key.
     * 
     */
    @Import(name="excludeOrigin")
    private @Nullable Output<Boolean> excludeOrigin;

    /**
     * @return Whether or not to include the origin header. A value of true will exclude the origin header in the cache key.
     * 
     */
    public Optional<Output<Boolean>> excludeOrigin() {
        return Optional.ofNullable(this.excludeOrigin);
    }

    /**
     * Include these headers&#39; names and their values.
     * 
     */
    @Import(name="includes")
    private @Nullable Output<List<String>> includes;

    /**
     * @return Include these headers&#39; names and their values.
     * 
     */
    public Optional<Output<List<String>>> includes() {
        return Optional.ofNullable(this.includes);
    }

    private RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs() {}

    private RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs $) {
        this.checkPresences = $.checkPresences;
        this.contains = $.contains;
        this.excludeOrigin = $.excludeOrigin;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs();
        }

        public Builder(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs defaults) {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkPresences Checks for the presence of these header names. The presence of these headers is used in building the cache key.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(@Nullable Output<List<String>> checkPresences) {
            $.checkPresences = checkPresences;
            return this;
        }

        /**
         * @param checkPresences Checks for the presence of these header names. The presence of these headers is used in building the cache key.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(List<String> checkPresences) {
            return checkPresences(Output.of(checkPresences));
        }

        /**
         * @param checkPresences Checks for the presence of these header names. The presence of these headers is used in building the cache key.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(String... checkPresences) {
            return checkPresences(List.of(checkPresences));
        }

        /**
         * @param contains For each header name and list of values combination, check if the request header contains any of the values provided. The presence of the request header and whether any of the values provided are contained in the request header value is used in building the cache key.
         * 
         * @return builder
         * 
         */
        public Builder contains(@Nullable Output<Map<String,List<String>>> contains) {
            $.contains = contains;
            return this;
        }

        /**
         * @param contains For each header name and list of values combination, check if the request header contains any of the values provided. The presence of the request header and whether any of the values provided are contained in the request header value is used in building the cache key.
         * 
         * @return builder
         * 
         */
        public Builder contains(Map<String,List<String>> contains) {
            return contains(Output.of(contains));
        }

        /**
         * @param excludeOrigin Whether or not to include the origin header. A value of true will exclude the origin header in the cache key.
         * 
         * @return builder
         * 
         */
        public Builder excludeOrigin(@Nullable Output<Boolean> excludeOrigin) {
            $.excludeOrigin = excludeOrigin;
            return this;
        }

        /**
         * @param excludeOrigin Whether or not to include the origin header. A value of true will exclude the origin header in the cache key.
         * 
         * @return builder
         * 
         */
        public Builder excludeOrigin(Boolean excludeOrigin) {
            return excludeOrigin(Output.of(excludeOrigin));
        }

        /**
         * @param includes Include these headers&#39; names and their values.
         * 
         * @return builder
         * 
         */
        public Builder includes(@Nullable Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes Include these headers&#39; names and their values.
         * 
         * @return builder
         * 
         */
        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        /**
         * @param includes Include these headers&#39; names and their values.
         * 
         * @return builder
         * 
         */
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs build() {
            return $;
        }
    }

}
