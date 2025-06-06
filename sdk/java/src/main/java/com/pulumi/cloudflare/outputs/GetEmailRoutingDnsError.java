// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetEmailRoutingDnsErrorSource;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEmailRoutingDnsError {
    private Integer code;
    private String documentationUrl;
    private String message;
    private GetEmailRoutingDnsErrorSource source;

    private GetEmailRoutingDnsError() {}
    public Integer code() {
        return this.code;
    }
    public String documentationUrl() {
        return this.documentationUrl;
    }
    public String message() {
        return this.message;
    }
    public GetEmailRoutingDnsErrorSource source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEmailRoutingDnsError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer code;
        private String documentationUrl;
        private String message;
        private GetEmailRoutingDnsErrorSource source;
        public Builder() {}
        public Builder(GetEmailRoutingDnsError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.message = defaults.message;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder code(Integer code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetEmailRoutingDnsError", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder documentationUrl(String documentationUrl) {
            if (documentationUrl == null) {
              throw new MissingRequiredPropertyException("GetEmailRoutingDnsError", "documentationUrl");
            }
            this.documentationUrl = documentationUrl;
            return this;
        }
        @CustomType.Setter
        public Builder message(String message) {
            if (message == null) {
              throw new MissingRequiredPropertyException("GetEmailRoutingDnsError", "message");
            }
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder source(GetEmailRoutingDnsErrorSource source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetEmailRoutingDnsError", "source");
            }
            this.source = source;
            return this;
        }
        public GetEmailRoutingDnsError build() {
            final var _resultValue = new GetEmailRoutingDnsError();
            _resultValue.code = code;
            _resultValue.documentationUrl = documentationUrl;
            _resultValue.message = message;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
