// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeDns;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeHttp;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayLoggingSettingsByRuleTypeL4;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewayLoggingSettingsByRuleType {
    private GetZeroTrustGatewayLoggingSettingsByRuleTypeDns dns;
    private GetZeroTrustGatewayLoggingSettingsByRuleTypeHttp http;
    private GetZeroTrustGatewayLoggingSettingsByRuleTypeL4 l4;

    private GetZeroTrustGatewayLoggingSettingsByRuleType() {}
    public GetZeroTrustGatewayLoggingSettingsByRuleTypeDns dns() {
        return this.dns;
    }
    public GetZeroTrustGatewayLoggingSettingsByRuleTypeHttp http() {
        return this.http;
    }
    public GetZeroTrustGatewayLoggingSettingsByRuleTypeL4 l4() {
        return this.l4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewayLoggingSettingsByRuleType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetZeroTrustGatewayLoggingSettingsByRuleTypeDns dns;
        private GetZeroTrustGatewayLoggingSettingsByRuleTypeHttp http;
        private GetZeroTrustGatewayLoggingSettingsByRuleTypeL4 l4;
        public Builder() {}
        public Builder(GetZeroTrustGatewayLoggingSettingsByRuleType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dns = defaults.dns;
    	      this.http = defaults.http;
    	      this.l4 = defaults.l4;
        }

        @CustomType.Setter
        public Builder dns(GetZeroTrustGatewayLoggingSettingsByRuleTypeDns dns) {
            if (dns == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayLoggingSettingsByRuleType", "dns");
            }
            this.dns = dns;
            return this;
        }
        @CustomType.Setter
        public Builder http(GetZeroTrustGatewayLoggingSettingsByRuleTypeHttp http) {
            if (http == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayLoggingSettingsByRuleType", "http");
            }
            this.http = http;
            return this;
        }
        @CustomType.Setter
        public Builder l4(GetZeroTrustGatewayLoggingSettingsByRuleTypeL4 l4) {
            if (l4 == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayLoggingSettingsByRuleType", "l4");
            }
            this.l4 = l4;
            return this;
        }
        public GetZeroTrustGatewayLoggingSettingsByRuleType build() {
            final var _resultValue = new GetZeroTrustGatewayLoggingSettingsByRuleType();
            _resultValue.dns = dns;
            _resultValue.http = http;
            _resultValue.l4 = l4;
            return _resultValue;
        }
    }
}
