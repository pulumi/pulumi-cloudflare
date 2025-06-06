// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZeroTrustTunnelCloudflaredVirtualNetworkResult {
    /**
     * @return Cloudflare account ID
     * 
     */
    private String accountId;
    /**
     * @return Optional remark describing the virtual network.
     * 
     */
    private String comment;
    /**
     * @return Timestamp of when the resource was created.
     * 
     */
    private String createdAt;
    /**
     * @return Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
     * 
     */
    private String deletedAt;
    private @Nullable GetZeroTrustTunnelCloudflaredVirtualNetworkFilter filter;
    /**
     * @return UUID of the virtual network.
     * 
     */
    private String id;
    /**
     * @return If `true`, this virtual network is the default for the account.
     * 
     */
    private Boolean isDefaultNetwork;
    /**
     * @return A user-friendly name for the virtual network.
     * 
     */
    private String name;
    /**
     * @return UUID of the virtual network.
     * 
     */
    private @Nullable String virtualNetworkId;

    private GetZeroTrustTunnelCloudflaredVirtualNetworkResult() {}
    /**
     * @return Cloudflare account ID
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Optional remark describing the virtual network.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return Timestamp of when the resource was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
     * 
     */
    public String deletedAt() {
        return this.deletedAt;
    }
    public Optional<GetZeroTrustTunnelCloudflaredVirtualNetworkFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return UUID of the virtual network.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If `true`, this virtual network is the default for the account.
     * 
     */
    public Boolean isDefaultNetwork() {
        return this.isDefaultNetwork;
    }
    /**
     * @return A user-friendly name for the virtual network.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return UUID of the virtual network.
     * 
     */
    public Optional<String> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustTunnelCloudflaredVirtualNetworkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String comment;
        private String createdAt;
        private String deletedAt;
        private @Nullable GetZeroTrustTunnelCloudflaredVirtualNetworkFilter filter;
        private String id;
        private Boolean isDefaultNetwork;
        private String name;
        private @Nullable String virtualNetworkId;
        public Builder() {}
        public Builder(GetZeroTrustTunnelCloudflaredVirtualNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.comment = defaults.comment;
    	      this.createdAt = defaults.createdAt;
    	      this.deletedAt = defaults.deletedAt;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.isDefaultNetwork = defaults.isDefaultNetwork;
    	      this.name = defaults.name;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredVirtualNetworkResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredVirtualNetworkResult", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredVirtualNetworkResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder deletedAt(String deletedAt) {
            if (deletedAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredVirtualNetworkResult", "deletedAt");
            }
            this.deletedAt = deletedAt;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable GetZeroTrustTunnelCloudflaredVirtualNetworkFilter filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredVirtualNetworkResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isDefaultNetwork(Boolean isDefaultNetwork) {
            if (isDefaultNetwork == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredVirtualNetworkResult", "isDefaultNetwork");
            }
            this.isDefaultNetwork = isDefaultNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredVirtualNetworkResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkId(@Nullable String virtualNetworkId) {

            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public GetZeroTrustTunnelCloudflaredVirtualNetworkResult build() {
            final var _resultValue = new GetZeroTrustTunnelCloudflaredVirtualNetworkResult();
            _resultValue.accountId = accountId;
            _resultValue.comment = comment;
            _resultValue.createdAt = createdAt;
            _resultValue.deletedAt = deletedAt;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.isDefaultNetwork = isDefaultNetwork;
            _resultValue.name = name;
            _resultValue.virtualNetworkId = virtualNetworkId;
            return _resultValue;
        }
    }
}
