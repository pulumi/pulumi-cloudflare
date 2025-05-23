// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetManagedTransformsManagedRequestHeader;
import com.pulumi.cloudflare.outputs.GetManagedTransformsManagedResponseHeader;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetManagedTransformsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The list of Managed Request Transforms.
     * 
     */
    private List<GetManagedTransformsManagedRequestHeader> managedRequestHeaders;
    /**
     * @return The list of Managed Response Transforms.
     * 
     */
    private List<GetManagedTransformsManagedResponseHeader> managedResponseHeaders;
    /**
     * @return The unique ID of the zone.
     * 
     */
    private String zoneId;

    private GetManagedTransformsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of Managed Request Transforms.
     * 
     */
    public List<GetManagedTransformsManagedRequestHeader> managedRequestHeaders() {
        return this.managedRequestHeaders;
    }
    /**
     * @return The list of Managed Response Transforms.
     * 
     */
    public List<GetManagedTransformsManagedResponseHeader> managedResponseHeaders() {
        return this.managedResponseHeaders;
    }
    /**
     * @return The unique ID of the zone.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedTransformsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetManagedTransformsManagedRequestHeader> managedRequestHeaders;
        private List<GetManagedTransformsManagedResponseHeader> managedResponseHeaders;
        private String zoneId;
        public Builder() {}
        public Builder(GetManagedTransformsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.managedRequestHeaders = defaults.managedRequestHeaders;
    	      this.managedResponseHeaders = defaults.managedResponseHeaders;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetManagedTransformsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder managedRequestHeaders(List<GetManagedTransformsManagedRequestHeader> managedRequestHeaders) {
            if (managedRequestHeaders == null) {
              throw new MissingRequiredPropertyException("GetManagedTransformsResult", "managedRequestHeaders");
            }
            this.managedRequestHeaders = managedRequestHeaders;
            return this;
        }
        public Builder managedRequestHeaders(GetManagedTransformsManagedRequestHeader... managedRequestHeaders) {
            return managedRequestHeaders(List.of(managedRequestHeaders));
        }
        @CustomType.Setter
        public Builder managedResponseHeaders(List<GetManagedTransformsManagedResponseHeader> managedResponseHeaders) {
            if (managedResponseHeaders == null) {
              throw new MissingRequiredPropertyException("GetManagedTransformsResult", "managedResponseHeaders");
            }
            this.managedResponseHeaders = managedResponseHeaders;
            return this;
        }
        public Builder managedResponseHeaders(GetManagedTransformsManagedResponseHeader... managedResponseHeaders) {
            return managedResponseHeaders(List.of(managedResponseHeaders));
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetManagedTransformsResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetManagedTransformsResult build() {
            final var _resultValue = new GetManagedTransformsResult();
            _resultValue.id = id;
            _resultValue.managedRequestHeaders = managedRequestHeaders;
            _resultValue.managedResponseHeaders = managedResponseHeaders;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
