// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudforceOneRequestAssetResult {
    /**
     * @return Identifier.
     * 
     */
    private String accountId;
    /**
     * @return UUID.
     * 
     */
    private String assetId;
    /**
     * @return Defines the asset creation time.
     * 
     */
    private String created;
    /**
     * @return Asset description.
     * 
     */
    private String description;
    /**
     * @return Asset file type.
     * 
     */
    private String fileType;
    /**
     * @return Asset ID.
     * 
     */
    private Integer id;
    /**
     * @return Asset name.
     * 
     */
    private String name;
    /**
     * @return UUID.
     * 
     */
    private String requestId;

    private GetCloudforceOneRequestAssetResult() {}
    /**
     * @return Identifier.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return UUID.
     * 
     */
    public String assetId() {
        return this.assetId;
    }
    /**
     * @return Defines the asset creation time.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Asset description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Asset file type.
     * 
     */
    public String fileType() {
        return this.fileType;
    }
    /**
     * @return Asset ID.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Asset name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return UUID.
     * 
     */
    public String requestId() {
        return this.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudforceOneRequestAssetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String assetId;
        private String created;
        private String description;
        private String fileType;
        private Integer id;
        private String name;
        private String requestId;
        public Builder() {}
        public Builder(GetCloudforceOneRequestAssetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.assetId = defaults.assetId;
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.fileType = defaults.fileType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder assetId(String assetId) {
            if (assetId == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "assetId");
            }
            this.assetId = assetId;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder fileType(String fileType) {
            if (fileType == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "fileType");
            }
            this.fileType = fileType;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            if (requestId == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestAssetResult", "requestId");
            }
            this.requestId = requestId;
            return this;
        }
        public GetCloudforceOneRequestAssetResult build() {
            final var _resultValue = new GetCloudforceOneRequestAssetResult();
            _resultValue.accountId = accountId;
            _resultValue.assetId = assetId;
            _resultValue.created = created;
            _resultValue.description = description;
            _resultValue.fileType = fileType;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.requestId = requestId;
            return _resultValue;
        }
    }
}
