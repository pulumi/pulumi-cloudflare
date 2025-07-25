// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApiShieldAuthIdCharacteristic {
    /**
     * @return The name of the characteristic field, i.e., the header or cookie name.
     * 
     */
    private String name;
    /**
     * @return The type of characteristic.
     * Available values: &#34;header&#34;, &#34;cookie&#34;, &#34;jwt&#34;.
     * 
     */
    private String type;

    private GetApiShieldAuthIdCharacteristic() {}
    /**
     * @return The name of the characteristic field, i.e., the header or cookie name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of characteristic.
     * Available values: &#34;header&#34;, &#34;cookie&#34;, &#34;jwt&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiShieldAuthIdCharacteristic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetApiShieldAuthIdCharacteristic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApiShieldAuthIdCharacteristic", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetApiShieldAuthIdCharacteristic", "type");
            }
            this.type = type;
            return this;
        }
        public GetApiShieldAuthIdCharacteristic build() {
            final var _resultValue = new GetApiShieldAuthIdCharacteristic();
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
