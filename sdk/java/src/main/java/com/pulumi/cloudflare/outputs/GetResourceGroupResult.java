// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetResourceGroupMeta;
import com.pulumi.cloudflare.outputs.GetResourceGroupScope;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourceGroupResult {
    /**
     * @return Account identifier tag.
     * 
     */
    private String accountId;
    /**
     * @return Identifier of the resource group.
     * 
     */
    private String id;
    /**
     * @return Attributes associated to the resource group.
     * 
     */
    private GetResourceGroupMeta meta;
    /**
     * @return Name of the resource group.
     * 
     */
    private String name;
    /**
     * @return Resource Group identifier tag.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The scope associated to the resource group
     * 
     */
    private List<GetResourceGroupScope> scopes;

    private GetResourceGroupResult() {}
    /**
     * @return Account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Identifier of the resource group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Attributes associated to the resource group.
     * 
     */
    public GetResourceGroupMeta meta() {
        return this.meta;
    }
    /**
     * @return Name of the resource group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource Group identifier tag.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The scope associated to the resource group
     * 
     */
    public List<GetResourceGroupScope> scopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private GetResourceGroupMeta meta;
        private String name;
        private String resourceGroupId;
        private List<GetResourceGroupScope> scopes;
        public Builder() {}
        public Builder(GetResourceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.scopes = defaults.scopes;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder meta(GetResourceGroupMeta meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(List<GetResourceGroupScope> scopes) {
            if (scopes == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResult", "scopes");
            }
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(GetResourceGroupScope... scopes) {
            return scopes(List.of(scopes));
        }
        public GetResourceGroupResult build() {
            final var _resultValue = new GetResourceGroupResult();
            _resultValue.accountId = accountId;
            _resultValue.id = id;
            _resultValue.meta = meta;
            _resultValue.name = name;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.scopes = scopes;
            return _resultValue;
        }
    }
}
