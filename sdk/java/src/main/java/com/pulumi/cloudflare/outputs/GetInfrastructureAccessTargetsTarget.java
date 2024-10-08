// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetInfrastructureAccessTargetsTargetIp;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInfrastructureAccessTargetsTarget {
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    private String accountId;
    /**
     * @return The date and time at which the target was created.
     * 
     */
    private String createdAt;
    /**
     * @return A non-unique field that refers to a target.
     * 
     */
    private String hostname;
    /**
     * @return The identifier of this resource. This is target&#39;s unique identifier.
     * 
     */
    private String id;
    /**
     * @return The IPv4/IPv6 address that identifies where to reach a target.
     * 
     */
    private GetInfrastructureAccessTargetsTargetIp ip;
    /**
     * @return The date and time at which the target was last modified.
     * 
     */
    private String modifiedAt;

    private GetInfrastructureAccessTargetsTarget() {}
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The date and time at which the target was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return A non-unique field that refers to a target.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The identifier of this resource. This is target&#39;s unique identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The IPv4/IPv6 address that identifies where to reach a target.
     * 
     */
    public GetInfrastructureAccessTargetsTargetIp ip() {
        return this.ip;
    }
    /**
     * @return The date and time at which the target was last modified.
     * 
     */
    public String modifiedAt() {
        return this.modifiedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureAccessTargetsTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String createdAt;
        private String hostname;
        private String id;
        private GetInfrastructureAccessTargetsTargetIp ip;
        private String modifiedAt;
        public Builder() {}
        public Builder(GetInfrastructureAccessTargetsTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.createdAt = defaults.createdAt;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.modifiedAt = defaults.modifiedAt;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsTarget", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsTarget", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsTarget", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsTarget", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ip(GetInfrastructureAccessTargetsTargetIp ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsTarget", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedAt(String modifiedAt) {
            if (modifiedAt == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsTarget", "modifiedAt");
            }
            this.modifiedAt = modifiedAt;
            return this;
        }
        public GetInfrastructureAccessTargetsTarget build() {
            final var _resultValue = new GetInfrastructureAccessTargetsTarget();
            _resultValue.accountId = accountId;
            _resultValue.createdAt = createdAt;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.ip = ip;
            _resultValue.modifiedAt = modifiedAt;
            return _resultValue;
        }
    }
}
