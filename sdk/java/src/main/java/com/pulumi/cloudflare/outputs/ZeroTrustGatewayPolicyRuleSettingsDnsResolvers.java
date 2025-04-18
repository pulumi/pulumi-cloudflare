// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4;
import com.pulumi.cloudflare.outputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustGatewayPolicyRuleSettingsDnsResolvers {
    private @Nullable List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s;
    private @Nullable List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s;

    private ZeroTrustGatewayPolicyRuleSettingsDnsResolvers() {}
    public List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s() {
        return this.ipv4s == null ? List.of() : this.ipv4s;
    }
    public List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s() {
        return this.ipv6s == null ? List.of() : this.ipv6s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustGatewayPolicyRuleSettingsDnsResolvers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s;
        private @Nullable List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s;
        public Builder() {}
        public Builder(ZeroTrustGatewayPolicyRuleSettingsDnsResolvers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4s = defaults.ipv4s;
    	      this.ipv6s = defaults.ipv6s;
        }

        @CustomType.Setter
        public Builder ipv4s(@Nullable List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4> ipv4s) {

            this.ipv4s = ipv4s;
            return this;
        }
        public Builder ipv4s(ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv4... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }
        @CustomType.Setter
        public Builder ipv6s(@Nullable List<ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6> ipv6s) {

            this.ipv6s = ipv6s;
            return this;
        }
        public Builder ipv6s(ZeroTrustGatewayPolicyRuleSettingsDnsResolversIpv6... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }
        public ZeroTrustGatewayPolicyRuleSettingsDnsResolvers build() {
            final var _resultValue = new ZeroTrustGatewayPolicyRuleSettingsDnsResolvers();
            _resultValue.ipv4s = ipv4s;
            _resultValue.ipv6s = ipv6s;
            return _resultValue;
        }
    }
}
