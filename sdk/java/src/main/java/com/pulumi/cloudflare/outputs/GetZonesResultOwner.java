// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZonesResultOwner {
    /**
     * @return Identifier
     * 
     */
    private String id;
    /**
     * @return Name of the owner.
     * 
     */
    private String name;
    /**
     * @return The type of owner.
     * 
     */
    private String type;

    private GetZonesResultOwner() {}
    /**
     * @return Identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the owner.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of owner.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesResultOwner defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetZonesResultOwner defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZonesResultOwner", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZonesResultOwner", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetZonesResultOwner", "type");
            }
            this.type = type;
            return this;
        }
        public GetZonesResultOwner build() {
            final var _resultValue = new GetZonesResultOwner();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
