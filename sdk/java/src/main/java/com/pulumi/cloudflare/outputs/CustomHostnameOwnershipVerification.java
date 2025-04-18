// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomHostnameOwnershipVerification {
    /**
     * @return DNS Name for record.
     * 
     */
    private @Nullable String name;
    /**
     * @return DNS Record type.
     * Available values: &#34;txt&#34;.
     * 
     */
    private @Nullable String type;
    /**
     * @return Content for the record.
     * 
     */
    private @Nullable String value;

    private CustomHostnameOwnershipVerification() {}
    /**
     * @return DNS Name for record.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return DNS Record type.
     * Available values: &#34;txt&#34;.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Content for the record.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHostnameOwnershipVerification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(CustomHostnameOwnershipVerification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public CustomHostnameOwnershipVerification build() {
            final var _resultValue = new CustomHostnameOwnershipVerification();
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
