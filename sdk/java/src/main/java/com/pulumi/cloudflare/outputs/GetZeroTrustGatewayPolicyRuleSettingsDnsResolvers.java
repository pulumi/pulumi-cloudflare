// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers {
    private List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s;
    private List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s;

    private GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers() {}
    public List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s() {
        return this.ipv4s;
    }
    public List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s() {
        return this.ipv6s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s;
        private List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s;
        public Builder() {}
        public Builder(GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4s = defaults.ipv4s;
    	      this.ipv6s = defaults.ipv6s;
        }

        @CustomType.Setter
        public Builder ipv4s(List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s) {
            if (ipv4s == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers", "ipv4s");
            }
            this.ipv4s = ipv4s;
            return this;
        }
        public Builder ipv4s(GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }
        @CustomType.Setter
        public Builder ipv6s(List<GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s) {
            if (ipv6s == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers", "ipv6s");
            }
            this.ipv6s = ipv6s;
            return this;
        }
        public Builder ipv6s(GetZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }
        public GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers build() {
            final var _resultValue = new GetZeroTrustGatewayPolicyRuleSettingsDnsResolvers();
            _resultValue.ipv4s = ipv4s;
            _resultValue.ipv6s = ipv6s;
            return _resultValue;
        }
    }
}
