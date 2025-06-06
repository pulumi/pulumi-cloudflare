// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.R2BucketLifecycleRuleAbortMultipartUploadsTransition;
import com.pulumi.cloudflare.outputs.R2BucketLifecycleRuleConditions;
import com.pulumi.cloudflare.outputs.R2BucketLifecycleRuleDeleteObjectsTransition;
import com.pulumi.cloudflare.outputs.R2BucketLifecycleRuleStorageClassTransition;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class R2BucketLifecycleRule {
    /**
     * @return Transition to abort ongoing multipart uploads.
     * 
     */
    private @Nullable R2BucketLifecycleRuleAbortMultipartUploadsTransition abortMultipartUploadsTransition;
    /**
     * @return Conditions that apply to all transitions of this rule.
     * 
     */
    private R2BucketLifecycleRuleConditions conditions;
    /**
     * @return Transition to delete objects.
     * 
     */
    private @Nullable R2BucketLifecycleRuleDeleteObjectsTransition deleteObjectsTransition;
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
     * @return Transitions to change the storage class of objects.
     * 
     */
    private @Nullable List<R2BucketLifecycleRuleStorageClassTransition> storageClassTransitions;

    private R2BucketLifecycleRule() {}
    /**
     * @return Transition to abort ongoing multipart uploads.
     * 
     */
    public Optional<R2BucketLifecycleRuleAbortMultipartUploadsTransition> abortMultipartUploadsTransition() {
        return Optional.ofNullable(this.abortMultipartUploadsTransition);
    }
    /**
     * @return Conditions that apply to all transitions of this rule.
     * 
     */
    public R2BucketLifecycleRuleConditions conditions() {
        return this.conditions;
    }
    /**
     * @return Transition to delete objects.
     * 
     */
    public Optional<R2BucketLifecycleRuleDeleteObjectsTransition> deleteObjectsTransition() {
        return Optional.ofNullable(this.deleteObjectsTransition);
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
     * @return Transitions to change the storage class of objects.
     * 
     */
    public List<R2BucketLifecycleRuleStorageClassTransition> storageClassTransitions() {
        return this.storageClassTransitions == null ? List.of() : this.storageClassTransitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(R2BucketLifecycleRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable R2BucketLifecycleRuleAbortMultipartUploadsTransition abortMultipartUploadsTransition;
        private R2BucketLifecycleRuleConditions conditions;
        private @Nullable R2BucketLifecycleRuleDeleteObjectsTransition deleteObjectsTransition;
        private Boolean enabled;
        private String id;
        private @Nullable List<R2BucketLifecycleRuleStorageClassTransition> storageClassTransitions;
        public Builder() {}
        public Builder(R2BucketLifecycleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortMultipartUploadsTransition = defaults.abortMultipartUploadsTransition;
    	      this.conditions = defaults.conditions;
    	      this.deleteObjectsTransition = defaults.deleteObjectsTransition;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.storageClassTransitions = defaults.storageClassTransitions;
        }

        @CustomType.Setter
        public Builder abortMultipartUploadsTransition(@Nullable R2BucketLifecycleRuleAbortMultipartUploadsTransition abortMultipartUploadsTransition) {

            this.abortMultipartUploadsTransition = abortMultipartUploadsTransition;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(R2BucketLifecycleRuleConditions conditions) {
            if (conditions == null) {
              throw new MissingRequiredPropertyException("R2BucketLifecycleRule", "conditions");
            }
            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder deleteObjectsTransition(@Nullable R2BucketLifecycleRuleDeleteObjectsTransition deleteObjectsTransition) {

            this.deleteObjectsTransition = deleteObjectsTransition;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("R2BucketLifecycleRule", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("R2BucketLifecycleRule", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder storageClassTransitions(@Nullable List<R2BucketLifecycleRuleStorageClassTransition> storageClassTransitions) {

            this.storageClassTransitions = storageClassTransitions;
            return this;
        }
        public Builder storageClassTransitions(R2BucketLifecycleRuleStorageClassTransition... storageClassTransitions) {
            return storageClassTransitions(List.of(storageClassTransitions));
        }
        public R2BucketLifecycleRule build() {
            final var _resultValue = new R2BucketLifecycleRule();
            _resultValue.abortMultipartUploadsTransition = abortMultipartUploadsTransition;
            _resultValue.conditions = conditions;
            _resultValue.deleteObjectsTransition = deleteObjectsTransition;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.storageClassTransitions = storageClassTransitions;
            return _resultValue;
        }
    }
}
