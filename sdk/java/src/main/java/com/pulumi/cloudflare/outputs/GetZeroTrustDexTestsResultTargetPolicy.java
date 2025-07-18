// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustDexTestsResultTargetPolicy {
    /**
     * @return Whether the DEX rule is the account default
     * 
     */
    private Boolean default_;
    /**
     * @return The id of the DEX rule
     * 
     */
    private String id;
    /**
     * @return The name of the DEX rule
     * 
     */
    private String name;

    private GetZeroTrustDexTestsResultTargetPolicy() {}
    /**
     * @return Whether the DEX rule is the account default
     * 
     */
    public Boolean default_() {
        return this.default_;
    }
    /**
     * @return The id of the DEX rule
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the DEX rule
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustDexTestsResultTargetPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean default_;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetZeroTrustDexTestsResultTargetPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResultTargetPolicy", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResultTargetPolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResultTargetPolicy", "name");
            }
            this.name = name;
            return this;
        }
        public GetZeroTrustDexTestsResultTargetPolicy build() {
            final var _resultValue = new GetZeroTrustDexTestsResultTargetPolicy();
            _resultValue.default_ = default_;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
