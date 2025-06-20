// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class R2BucketLifecycleRuleDeleteObjectsTransitionCondition {
    private @Nullable String date;
    private @Nullable Integer maxAge;
    /**
     * @return Available values: &#34;Age&#34;, &#34;Date&#34;.
     * 
     */
    private String type;

    private R2BucketLifecycleRuleDeleteObjectsTransitionCondition() {}
    public Optional<String> date() {
        return Optional.ofNullable(this.date);
    }
    public Optional<Integer> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }
    /**
     * @return Available values: &#34;Age&#34;, &#34;Date&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(R2BucketLifecycleRuleDeleteObjectsTransitionCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String date;
        private @Nullable Integer maxAge;
        private String type;
        public Builder() {}
        public Builder(R2BucketLifecycleRuleDeleteObjectsTransitionCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.maxAge = defaults.maxAge;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder date(@Nullable String date) {

            this.date = date;
            return this;
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable Integer maxAge) {

            this.maxAge = maxAge;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("R2BucketLifecycleRuleDeleteObjectsTransitionCondition", "type");
            }
            this.type = type;
            return this;
        }
        public R2BucketLifecycleRuleDeleteObjectsTransitionCondition build() {
            final var _resultValue = new R2BucketLifecycleRuleDeleteObjectsTransitionCondition();
            _resultValue.date = date;
            _resultValue.maxAge = maxAge;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
