// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountMembersResultPolicyResourceGroupScopeObject;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountMembersResultPolicyResourceGroupScope {
    /**
     * @return This is a combination of pre-defined resource name and identifier (like Account ID etc.)
     * 
     */
    private String key;
    /**
     * @return A list of scope objects for additional context.
     * 
     */
    private List<GetAccountMembersResultPolicyResourceGroupScopeObject> objects;

    private GetAccountMembersResultPolicyResourceGroupScope() {}
    /**
     * @return This is a combination of pre-defined resource name and identifier (like Account ID etc.)
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return A list of scope objects for additional context.
     * 
     */
    public List<GetAccountMembersResultPolicyResourceGroupScopeObject> objects() {
        return this.objects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountMembersResultPolicyResourceGroupScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private List<GetAccountMembersResultPolicyResourceGroupScopeObject> objects;
        public Builder() {}
        public Builder(GetAccountMembersResultPolicyResourceGroupScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.objects = defaults.objects;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetAccountMembersResultPolicyResourceGroupScope", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder objects(List<GetAccountMembersResultPolicyResourceGroupScopeObject> objects) {
            if (objects == null) {
              throw new MissingRequiredPropertyException("GetAccountMembersResultPolicyResourceGroupScope", "objects");
            }
            this.objects = objects;
            return this;
        }
        public Builder objects(GetAccountMembersResultPolicyResourceGroupScopeObject... objects) {
            return objects(List.of(objects));
        }
        public GetAccountMembersResultPolicyResourceGroupScope build() {
            final var _resultValue = new GetAccountMembersResultPolicyResourceGroupScope();
            _resultValue.key = key;
            _resultValue.objects = objects;
            return _resultValue;
        }
    }
}
