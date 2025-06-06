// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetColumn;
import com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetUpload;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZeroTrustDlpDatasetResult {
    private String accountId;
    private Boolean caseSensitive;
    private List<GetZeroTrustDlpDatasetColumn> columns;
    private String createdAt;
    private String datasetId;
    /**
     * @return The description of the dataset.
     * 
     */
    private String description;
    private Integer encodingVersion;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    private String name;
    private Integer numCells;
    private Boolean secret;
    /**
     * @return Available values: &#34;empty&#34;, &#34;uploading&#34;, &#34;processing&#34;, &#34;failed&#34;, &#34;complete&#34;.
     * 
     */
    private String status;
    /**
     * @return When the dataset was last updated.
     * 
     */
    private String updatedAt;
    private List<GetZeroTrustDlpDatasetUpload> uploads;

    private GetZeroTrustDlpDatasetResult() {}
    public String accountId() {
        return this.accountId;
    }
    public Boolean caseSensitive() {
        return this.caseSensitive;
    }
    public List<GetZeroTrustDlpDatasetColumn> columns() {
        return this.columns;
    }
    public String createdAt() {
        return this.createdAt;
    }
    public String datasetId() {
        return this.datasetId;
    }
    /**
     * @return The description of the dataset.
     * 
     */
    public String description() {
        return this.description;
    }
    public Integer encodingVersion() {
        return this.encodingVersion;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public Integer numCells() {
        return this.numCells;
    }
    public Boolean secret() {
        return this.secret;
    }
    /**
     * @return Available values: &#34;empty&#34;, &#34;uploading&#34;, &#34;processing&#34;, &#34;failed&#34;, &#34;complete&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return When the dataset was last updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }
    public List<GetZeroTrustDlpDatasetUpload> uploads() {
        return this.uploads;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustDlpDatasetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private Boolean caseSensitive;
        private List<GetZeroTrustDlpDatasetColumn> columns;
        private String createdAt;
        private String datasetId;
        private String description;
        private Integer encodingVersion;
        private String id;
        private String name;
        private Integer numCells;
        private Boolean secret;
        private String status;
        private String updatedAt;
        private List<GetZeroTrustDlpDatasetUpload> uploads;
        public Builder() {}
        public Builder(GetZeroTrustDlpDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.caseSensitive = defaults.caseSensitive;
    	      this.columns = defaults.columns;
    	      this.createdAt = defaults.createdAt;
    	      this.datasetId = defaults.datasetId;
    	      this.description = defaults.description;
    	      this.encodingVersion = defaults.encodingVersion;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.numCells = defaults.numCells;
    	      this.secret = defaults.secret;
    	      this.status = defaults.status;
    	      this.updatedAt = defaults.updatedAt;
    	      this.uploads = defaults.uploads;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder caseSensitive(Boolean caseSensitive) {
            if (caseSensitive == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "caseSensitive");
            }
            this.caseSensitive = caseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder columns(List<GetZeroTrustDlpDatasetColumn> columns) {
            if (columns == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "columns");
            }
            this.columns = columns;
            return this;
        }
        public Builder columns(GetZeroTrustDlpDatasetColumn... columns) {
            return columns(List.of(columns));
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder datasetId(String datasetId) {
            if (datasetId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "datasetId");
            }
            this.datasetId = datasetId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder encodingVersion(Integer encodingVersion) {
            if (encodingVersion == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "encodingVersion");
            }
            this.encodingVersion = encodingVersion;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder numCells(Integer numCells) {
            if (numCells == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "numCells");
            }
            this.numCells = numCells;
            return this;
        }
        @CustomType.Setter
        public Builder secret(Boolean secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder uploads(List<GetZeroTrustDlpDatasetUpload> uploads) {
            if (uploads == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDlpDatasetResult", "uploads");
            }
            this.uploads = uploads;
            return this;
        }
        public Builder uploads(GetZeroTrustDlpDatasetUpload... uploads) {
            return uploads(List.of(uploads));
        }
        public GetZeroTrustDlpDatasetResult build() {
            final var _resultValue = new GetZeroTrustDlpDatasetResult();
            _resultValue.accountId = accountId;
            _resultValue.caseSensitive = caseSensitive;
            _resultValue.columns = columns;
            _resultValue.createdAt = createdAt;
            _resultValue.datasetId = datasetId;
            _resultValue.description = description;
            _resultValue.encodingVersion = encodingVersion;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.numCells = numCells;
            _resultValue.secret = secret;
            _resultValue.status = status;
            _resultValue.updatedAt = updatedAt;
            _resultValue.uploads = uploads;
            return _resultValue;
        }
    }
}
