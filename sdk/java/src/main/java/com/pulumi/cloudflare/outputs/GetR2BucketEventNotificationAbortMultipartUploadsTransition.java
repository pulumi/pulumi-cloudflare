// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationAbortMultipartUploadsTransitionCondition;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetR2BucketEventNotificationAbortMultipartUploadsTransition {
    /**
     * @return Condition for lifecycle transitions to apply after an object reaches an age in seconds.
     * 
     */
    private GetR2BucketEventNotificationAbortMultipartUploadsTransitionCondition condition;

    private GetR2BucketEventNotificationAbortMultipartUploadsTransition() {}
    /**
     * @return Condition for lifecycle transitions to apply after an object reaches an age in seconds.
     * 
     */
    public GetR2BucketEventNotificationAbortMultipartUploadsTransitionCondition condition() {
        return this.condition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetR2BucketEventNotificationAbortMultipartUploadsTransition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetR2BucketEventNotificationAbortMultipartUploadsTransitionCondition condition;
        public Builder() {}
        public Builder(GetR2BucketEventNotificationAbortMultipartUploadsTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
        }

        @CustomType.Setter
        public Builder condition(GetR2BucketEventNotificationAbortMultipartUploadsTransitionCondition condition) {
            if (condition == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationAbortMultipartUploadsTransition", "condition");
            }
            this.condition = condition;
            return this;
        }
        public GetR2BucketEventNotificationAbortMultipartUploadsTransition build() {
            final var _resultValue = new GetR2BucketEventNotificationAbortMultipartUploadsTransition();
            _resultValue.condition = condition;
            return _resultValue;
        }
    }
}
