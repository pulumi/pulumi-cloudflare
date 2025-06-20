// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationAbortMultipartUploadsTransition;
import com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationConditions;
import com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationDeleteObjectsTransition;
import com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationStorageClassTransition;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetR2BucketEventNotificationResult {
    /**
     * @return Transition to abort ongoing multipart uploads.
     * 
     */
    private GetR2BucketEventNotificationAbortMultipartUploadsTransition abortMultipartUploadsTransition;
    /**
     * @return Account ID.
     * 
     */
    private String accountId;
    /**
     * @return Name of the bucket.
     * 
     */
    private String bucketName;
    /**
     * @return Conditions that apply to all transitions of this rule.
     * 
     */
    private GetR2BucketEventNotificationConditions conditions;
    /**
     * @return Transition to delete objects.
     * 
     */
    private GetR2BucketEventNotificationDeleteObjectsTransition deleteObjectsTransition;
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
     * @return Queue ID.
     * 
     */
    private String queueId;
    /**
     * @return Transitions to change the storage class of objects.
     * 
     */
    private List<GetR2BucketEventNotificationStorageClassTransition> storageClassTransitions;

    private GetR2BucketEventNotificationResult() {}
    /**
     * @return Transition to abort ongoing multipart uploads.
     * 
     */
    public GetR2BucketEventNotificationAbortMultipartUploadsTransition abortMultipartUploadsTransition() {
        return this.abortMultipartUploadsTransition;
    }
    /**
     * @return Account ID.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Name of the bucket.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return Conditions that apply to all transitions of this rule.
     * 
     */
    public GetR2BucketEventNotificationConditions conditions() {
        return this.conditions;
    }
    /**
     * @return Transition to delete objects.
     * 
     */
    public GetR2BucketEventNotificationDeleteObjectsTransition deleteObjectsTransition() {
        return this.deleteObjectsTransition;
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
     * @return Queue ID.
     * 
     */
    public String queueId() {
        return this.queueId;
    }
    /**
     * @return Transitions to change the storage class of objects.
     * 
     */
    public List<GetR2BucketEventNotificationStorageClassTransition> storageClassTransitions() {
        return this.storageClassTransitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetR2BucketEventNotificationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetR2BucketEventNotificationAbortMultipartUploadsTransition abortMultipartUploadsTransition;
        private String accountId;
        private String bucketName;
        private GetR2BucketEventNotificationConditions conditions;
        private GetR2BucketEventNotificationDeleteObjectsTransition deleteObjectsTransition;
        private Boolean enabled;
        private String id;
        private String queueId;
        private List<GetR2BucketEventNotificationStorageClassTransition> storageClassTransitions;
        public Builder() {}
        public Builder(GetR2BucketEventNotificationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortMultipartUploadsTransition = defaults.abortMultipartUploadsTransition;
    	      this.accountId = defaults.accountId;
    	      this.bucketName = defaults.bucketName;
    	      this.conditions = defaults.conditions;
    	      this.deleteObjectsTransition = defaults.deleteObjectsTransition;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.queueId = defaults.queueId;
    	      this.storageClassTransitions = defaults.storageClassTransitions;
        }

        @CustomType.Setter
        public Builder abortMultipartUploadsTransition(GetR2BucketEventNotificationAbortMultipartUploadsTransition abortMultipartUploadsTransition) {
            if (abortMultipartUploadsTransition == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "abortMultipartUploadsTransition");
            }
            this.abortMultipartUploadsTransition = abortMultipartUploadsTransition;
            return this;
        }
        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            if (bucketName == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "bucketName");
            }
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(GetR2BucketEventNotificationConditions conditions) {
            if (conditions == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "conditions");
            }
            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder deleteObjectsTransition(GetR2BucketEventNotificationDeleteObjectsTransition deleteObjectsTransition) {
            if (deleteObjectsTransition == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "deleteObjectsTransition");
            }
            this.deleteObjectsTransition = deleteObjectsTransition;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder queueId(String queueId) {
            if (queueId == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "queueId");
            }
            this.queueId = queueId;
            return this;
        }
        @CustomType.Setter
        public Builder storageClassTransitions(List<GetR2BucketEventNotificationStorageClassTransition> storageClassTransitions) {
            if (storageClassTransitions == null) {
              throw new MissingRequiredPropertyException("GetR2BucketEventNotificationResult", "storageClassTransitions");
            }
            this.storageClassTransitions = storageClassTransitions;
            return this;
        }
        public Builder storageClassTransitions(GetR2BucketEventNotificationStorageClassTransition... storageClassTransitions) {
            return storageClassTransitions(List.of(storageClassTransitions));
        }
        public GetR2BucketEventNotificationResult build() {
            final var _resultValue = new GetR2BucketEventNotificationResult();
            _resultValue.abortMultipartUploadsTransition = abortMultipartUploadsTransition;
            _resultValue.accountId = accountId;
            _resultValue.bucketName = bucketName;
            _resultValue.conditions = conditions;
            _resultValue.deleteObjectsTransition = deleteObjectsTransition;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.queueId = queueId;
            _resultValue.storageClassTransitions = storageClassTransitions;
            return _resultValue;
        }
    }
}
