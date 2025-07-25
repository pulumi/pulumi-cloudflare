// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class R2BucketLockRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final R2BucketLockRuleConditionArgs Empty = new R2BucketLockRuleConditionArgs();

    @Import(name="date")
    private @Nullable Output<String> date;

    public Optional<Output<String>> date() {
        return Optional.ofNullable(this.date);
    }

    @Import(name="maxAgeSeconds")
    private @Nullable Output<Integer> maxAgeSeconds;

    public Optional<Output<Integer>> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    /**
     * Available values: &#34;Age&#34;, &#34;Date&#34;, &#34;Indefinite&#34;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Available values: &#34;Age&#34;, &#34;Date&#34;, &#34;Indefinite&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private R2BucketLockRuleConditionArgs() {}

    private R2BucketLockRuleConditionArgs(R2BucketLockRuleConditionArgs $) {
        this.date = $.date;
        this.maxAgeSeconds = $.maxAgeSeconds;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(R2BucketLockRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private R2BucketLockRuleConditionArgs $;

        public Builder() {
            $ = new R2BucketLockRuleConditionArgs();
        }

        public Builder(R2BucketLockRuleConditionArgs defaults) {
            $ = new R2BucketLockRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder date(@Nullable Output<String> date) {
            $.date = date;
            return this;
        }

        public Builder date(String date) {
            return date(Output.of(date));
        }

        public Builder maxAgeSeconds(@Nullable Output<Integer> maxAgeSeconds) {
            $.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        public Builder maxAgeSeconds(Integer maxAgeSeconds) {
            return maxAgeSeconds(Output.of(maxAgeSeconds));
        }

        /**
         * @param type Available values: &#34;Age&#34;, &#34;Date&#34;, &#34;Indefinite&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Available values: &#34;Age&#34;, &#34;Date&#34;, &#34;Indefinite&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public R2BucketLockRuleConditionArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("R2BucketLockRuleConditionArgs", "type");
            }
            return $;
        }
    }

}
