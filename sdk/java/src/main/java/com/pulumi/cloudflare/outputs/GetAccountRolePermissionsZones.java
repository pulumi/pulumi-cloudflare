// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetAccountRolePermissionsZones {
    private Boolean read;
    private Boolean write;

    private GetAccountRolePermissionsZones() {}
    public Boolean read() {
        return this.read;
    }
    public Boolean write() {
        return this.write;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountRolePermissionsZones defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean read;
        private Boolean write;
        public Builder() {}
        public Builder(GetAccountRolePermissionsZones defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.read = defaults.read;
    	      this.write = defaults.write;
        }

        @CustomType.Setter
        public Builder read(Boolean read) {
            if (read == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissionsZones", "read");
            }
            this.read = read;
            return this;
        }
        @CustomType.Setter
        public Builder write(Boolean write) {
            if (write == null) {
              throw new MissingRequiredPropertyException("GetAccountRolePermissionsZones", "write");
            }
            this.write = write;
            return this;
        }
        public GetAccountRolePermissionsZones build() {
            final var _resultValue = new GetAccountRolePermissionsZones();
            _resultValue.read = read;
            _resultValue.write = write;
            return _resultValue;
        }
    }
}
