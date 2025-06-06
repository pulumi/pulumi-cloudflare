// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.R2BucketLockRuleCondition;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class R2BucketLockRule {
    /**
     * @return Condition to apply a lock rule to an object for how long in seconds.
     * 
     */
    private R2BucketLockRuleCondition condition;
    /**
     * @return Whether or not this rule is in effect.
     * 
     */
    private Boolean enabled;
    /**
     * @return Unique identifier for this rule.
     * 
     */
    private String id;
    /**
     * @return Rule will only apply to objects/uploads in the bucket that start with the given prefix, an empty prefix can be provided to scope rule to all objects/uploads.
     * 
     */
    private @Nullable String prefix;

    private R2BucketLockRule() {}
    /**
     * @return Condition to apply a lock rule to an object for how long in seconds.
     * 
     */
    public R2BucketLockRuleCondition condition() {
        return this.condition;
    }
    /**
     * @return Whether or not this rule is in effect.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Unique identifier for this rule.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Rule will only apply to objects/uploads in the bucket that start with the given prefix, an empty prefix can be provided to scope rule to all objects/uploads.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(R2BucketLockRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private R2BucketLockRuleCondition condition;
        private Boolean enabled;
        private String id;
        private @Nullable String prefix;
        public Builder() {}
        public Builder(R2BucketLockRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder condition(R2BucketLockRuleCondition condition) {
            if (condition == null) {
              throw new MissingRequiredPropertyException("R2BucketLockRule", "condition");
            }
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("R2BucketLockRule", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("R2BucketLockRule", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        public R2BucketLockRule build() {
            final var _resultValue = new R2BucketLockRule();
            _resultValue.condition = condition;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.prefix = prefix;
            return _resultValue;
        }
    }
}
