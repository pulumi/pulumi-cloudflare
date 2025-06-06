// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetAccountMemberRolePermissionsSsl {
    private Boolean read;
    private Boolean write;

    private GetAccountMemberRolePermissionsSsl() {}
    public Boolean read() {
        return this.read;
    }
    public Boolean write() {
        return this.write;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountMemberRolePermissionsSsl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean read;
        private Boolean write;
        public Builder() {}
        public Builder(GetAccountMemberRolePermissionsSsl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.read = defaults.read;
    	      this.write = defaults.write;
        }

        @CustomType.Setter
        public Builder read(Boolean read) {
            if (read == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberRolePermissionsSsl", "read");
            }
            this.read = read;
            return this;
        }
        @CustomType.Setter
        public Builder write(Boolean write) {
            if (write == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberRolePermissionsSsl", "write");
            }
            this.write = write;
            return this;
        }
        public GetAccountMemberRolePermissionsSsl build() {
            final var _resultValue = new GetAccountMemberRolePermissionsSsl();
            _resultValue.read = read;
            _resultValue.write = write;
            return _resultValue;
        }
    }
}
