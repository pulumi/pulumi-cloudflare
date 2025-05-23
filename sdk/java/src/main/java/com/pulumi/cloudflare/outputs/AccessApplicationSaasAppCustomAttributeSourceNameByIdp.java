// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessApplicationSaasAppCustomAttributeSourceNameByIdp {
    /**
     * @return The UID of the IdP.
     * 
     */
    private @Nullable String idpId;
    /**
     * @return The name of the IdP provided attribute.
     * 
     */
    private @Nullable String sourceName;

    private AccessApplicationSaasAppCustomAttributeSourceNameByIdp() {}
    /**
     * @return The UID of the IdP.
     * 
     */
    public Optional<String> idpId() {
        return Optional.ofNullable(this.idpId);
    }
    /**
     * @return The name of the IdP provided attribute.
     * 
     */
    public Optional<String> sourceName() {
        return Optional.ofNullable(this.sourceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApplicationSaasAppCustomAttributeSourceNameByIdp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String idpId;
        private @Nullable String sourceName;
        public Builder() {}
        public Builder(AccessApplicationSaasAppCustomAttributeSourceNameByIdp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idpId = defaults.idpId;
    	      this.sourceName = defaults.sourceName;
        }

        @CustomType.Setter
        public Builder idpId(@Nullable String idpId) {

            this.idpId = idpId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceName(@Nullable String sourceName) {

            this.sourceName = sourceName;
            return this;
        }
        public AccessApplicationSaasAppCustomAttributeSourceNameByIdp build() {
            final var _resultValue = new AccessApplicationSaasAppCustomAttributeSourceNameByIdp();
            _resultValue.idpId = idpId;
            _resultValue.sourceName = sourceName;
            return _resultValue;
        }
    }
}
