// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZoneDnsSettingsNameservers {
    /**
     * @return Configured nameserver set to be used for this zone
     * 
     */
    private Integer nsSet;
    /**
     * @return Nameserver type
     * Available values: &#34;cloudflare.standard&#34;, &#34;custom.account&#34;, &#34;custom.tenant&#34;, &#34;custom.zone&#34;.
     * 
     */
    private String type;

    private GetZoneDnsSettingsNameservers() {}
    /**
     * @return Configured nameserver set to be used for this zone
     * 
     */
    public Integer nsSet() {
        return this.nsSet;
    }
    /**
     * @return Nameserver type
     * Available values: &#34;cloudflare.standard&#34;, &#34;custom.account&#34;, &#34;custom.tenant&#34;, &#34;custom.zone&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneDnsSettingsNameservers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer nsSet;
        private String type;
        public Builder() {}
        public Builder(GetZoneDnsSettingsNameservers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nsSet = defaults.nsSet;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder nsSet(Integer nsSet) {
            if (nsSet == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsNameservers", "nsSet");
            }
            this.nsSet = nsSet;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetZoneDnsSettingsNameservers", "type");
            }
            this.type = type;
            return this;
        }
        public GetZoneDnsSettingsNameservers build() {
            final var _resultValue = new GetZoneDnsSettingsNameservers();
            _resultValue.nsSet = nsSet;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
