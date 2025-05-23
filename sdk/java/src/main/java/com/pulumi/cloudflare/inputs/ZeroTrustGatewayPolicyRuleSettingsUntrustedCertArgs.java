// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs Empty = new ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs();

    /**
     * The action performed when an untrusted certificate is seen. The default action is an error with HTTP code 526.
     * Available values: &#34;pass_through&#34;, &#34;block&#34;, &#34;error&#34;.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The action performed when an untrusted certificate is seen. The default action is an error with HTTP code 526.
     * Available values: &#34;pass_through&#34;, &#34;block&#34;, &#34;error&#34;.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    private ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs() {}

    private ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs(ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs $) {
        this.action = $.action;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs $;

        public Builder() {
            $ = new ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs();
        }

        public Builder(ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs defaults) {
            $ = new ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action performed when an untrusted certificate is seen. The default action is an error with HTTP code 526.
         * Available values: &#34;pass_through&#34;, &#34;block&#34;, &#34;error&#34;.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action performed when an untrusted certificate is seen. The default action is an error with HTTP code 526.
         * Available values: &#34;pass_through&#34;, &#34;block&#34;, &#34;error&#34;.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        public ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs build() {
            return $;
        }
    }

}
