// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustGatewaySettingsSettingsCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsSettingsCertificateArgs Empty = new ZeroTrustGatewaySettingsSettingsCertificateArgs();

    /**
     * UUID of certificate to be used for interception. Certificate must be available (previously called &#39;active&#39;) on the edge. A nil UUID will indicate the Cloudflare Root CA should be used.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return UUID of certificate to be used for interception. Certificate must be available (previously called &#39;active&#39;) on the edge. A nil UUID will indicate the Cloudflare Root CA should be used.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private ZeroTrustGatewaySettingsSettingsCertificateArgs() {}

    private ZeroTrustGatewaySettingsSettingsCertificateArgs(ZeroTrustGatewaySettingsSettingsCertificateArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsSettingsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsSettingsCertificateArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsSettingsCertificateArgs();
        }

        public Builder(ZeroTrustGatewaySettingsSettingsCertificateArgs defaults) {
            $ = new ZeroTrustGatewaySettingsSettingsCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id UUID of certificate to be used for interception. Certificate must be available (previously called &#39;active&#39;) on the edge. A nil UUID will indicate the Cloudflare Root CA should be used.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id UUID of certificate to be used for interception. Certificate must be available (previously called &#39;active&#39;) on the edge. A nil UUID will indicate the Cloudflare Root CA should be used.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ZeroTrustGatewaySettingsSettingsCertificateArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsSettingsCertificateArgs", "id");
            }
            return $;
        }
    }

}
