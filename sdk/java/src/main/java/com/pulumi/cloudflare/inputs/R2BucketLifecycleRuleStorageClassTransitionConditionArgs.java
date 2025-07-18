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


public final class R2BucketLifecycleRuleStorageClassTransitionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final R2BucketLifecycleRuleStorageClassTransitionConditionArgs Empty = new R2BucketLifecycleRuleStorageClassTransitionConditionArgs();

    @Import(name="date")
    private @Nullable Output<String> date;

    public Optional<Output<String>> date() {
        return Optional.ofNullable(this.date);
    }

    @Import(name="maxAge")
    private @Nullable Output<Integer> maxAge;

    public Optional<Output<Integer>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    /**
     * Available values: &#34;Age&#34;, &#34;Date&#34;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Available values: &#34;Age&#34;, &#34;Date&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private R2BucketLifecycleRuleStorageClassTransitionConditionArgs() {}

    private R2BucketLifecycleRuleStorageClassTransitionConditionArgs(R2BucketLifecycleRuleStorageClassTransitionConditionArgs $) {
        this.date = $.date;
        this.maxAge = $.maxAge;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(R2BucketLifecycleRuleStorageClassTransitionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private R2BucketLifecycleRuleStorageClassTransitionConditionArgs $;

        public Builder() {
            $ = new R2BucketLifecycleRuleStorageClassTransitionConditionArgs();
        }

        public Builder(R2BucketLifecycleRuleStorageClassTransitionConditionArgs defaults) {
            $ = new R2BucketLifecycleRuleStorageClassTransitionConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder date(@Nullable Output<String> date) {
            $.date = date;
            return this;
        }

        public Builder date(String date) {
            return date(Output.of(date));
        }

        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        public Builder maxAge(Integer maxAge) {
            return maxAge(Output.of(maxAge));
        }

        /**
         * @param type Available values: &#34;Age&#34;, &#34;Date&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Available values: &#34;Age&#34;, &#34;Date&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public R2BucketLifecycleRuleStorageClassTransitionConditionArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("R2BucketLifecycleRuleStorageClassTransitionConditionArgs", "type");
            }
            return $;
        }
    }

}
