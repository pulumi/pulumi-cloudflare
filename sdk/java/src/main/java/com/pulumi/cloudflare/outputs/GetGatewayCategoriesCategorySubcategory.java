// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayCategoriesCategorySubcategory {
    /**
     * @return True if the subcategory is in beta and subject to change.
     * 
     */
    private Boolean beta;
    /**
     * @return Which account types are allowed to create policies based on this subcategory.
     * 
     */
    private String class_;
    /**
     * @return A short summary of domains in the subcategory.
     * 
     */
    private String description;
    /**
     * @return The identifier for this subcategory. There is only one subcategory per ID.
     * 
     */
    private Integer id;
    /**
     * @return The name of the subcategory.
     * 
     */
    private String name;

    private GetGatewayCategoriesCategorySubcategory() {}
    /**
     * @return True if the subcategory is in beta and subject to change.
     * 
     */
    public Boolean beta() {
        return this.beta;
    }
    /**
     * @return Which account types are allowed to create policies based on this subcategory.
     * 
     */
    public String class_() {
        return this.class_;
    }
    /**
     * @return A short summary of domains in the subcategory.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The identifier for this subcategory. There is only one subcategory per ID.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The name of the subcategory.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayCategoriesCategorySubcategory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean beta;
        private String class_;
        private String description;
        private Integer id;
        private String name;
        public Builder() {}
        public Builder(GetGatewayCategoriesCategorySubcategory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beta = defaults.beta;
    	      this.class_ = defaults.class_;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder beta(Boolean beta) {
            if (beta == null) {
              throw new MissingRequiredPropertyException("GetGatewayCategoriesCategorySubcategory", "beta");
            }
            this.beta = beta;
            return this;
        }
        @CustomType.Setter("class")
        public Builder class_(String class_) {
            if (class_ == null) {
              throw new MissingRequiredPropertyException("GetGatewayCategoriesCategorySubcategory", "class_");
            }
            this.class_ = class_;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetGatewayCategoriesCategorySubcategory", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGatewayCategoriesCategorySubcategory", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGatewayCategoriesCategorySubcategory", "name");
            }
            this.name = name;
            return this;
        }
        public GetGatewayCategoriesCategorySubcategory build() {
            final var _resultValue = new GetGatewayCategoriesCategorySubcategory();
            _resultValue.beta = beta;
            _resultValue.class_ = class_;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}