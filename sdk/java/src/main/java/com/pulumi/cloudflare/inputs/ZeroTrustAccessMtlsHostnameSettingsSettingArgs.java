// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessMtlsHostnameSettingsSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessMtlsHostnameSettingsSettingArgs Empty = new ZeroTrustAccessMtlsHostnameSettingsSettingArgs();

    /**
     * Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
     * 
     */
    @Import(name="chinaNetwork")
    private @Nullable Output<Boolean> chinaNetwork;

    /**
     * @return Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
     * 
     */
    public Optional<Output<Boolean>> chinaNetwork() {
        return Optional.ofNullable(this.chinaNetwork);
    }

    /**
     * Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
     * 
     */
    @Import(name="clientCertificateForwarding")
    private @Nullable Output<Boolean> clientCertificateForwarding;

    /**
     * @return Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
     * 
     */
    public Optional<Output<Boolean>> clientCertificateForwarding() {
        return Optional.ofNullable(this.clientCertificateForwarding);
    }

    /**
     * The hostname that these settings apply to.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return The hostname that these settings apply to.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    private ZeroTrustAccessMtlsHostnameSettingsSettingArgs() {}

    private ZeroTrustAccessMtlsHostnameSettingsSettingArgs(ZeroTrustAccessMtlsHostnameSettingsSettingArgs $) {
        this.chinaNetwork = $.chinaNetwork;
        this.clientCertificateForwarding = $.clientCertificateForwarding;
        this.hostname = $.hostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessMtlsHostnameSettingsSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessMtlsHostnameSettingsSettingArgs $;

        public Builder() {
            $ = new ZeroTrustAccessMtlsHostnameSettingsSettingArgs();
        }

        public Builder(ZeroTrustAccessMtlsHostnameSettingsSettingArgs defaults) {
            $ = new ZeroTrustAccessMtlsHostnameSettingsSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chinaNetwork Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
         * 
         * @return builder
         * 
         */
        public Builder chinaNetwork(@Nullable Output<Boolean> chinaNetwork) {
            $.chinaNetwork = chinaNetwork;
            return this;
        }

        /**
         * @param chinaNetwork Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
         * 
         * @return builder
         * 
         */
        public Builder chinaNetwork(Boolean chinaNetwork) {
            return chinaNetwork(Output.of(chinaNetwork));
        }

        /**
         * @param clientCertificateForwarding Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateForwarding(@Nullable Output<Boolean> clientCertificateForwarding) {
            $.clientCertificateForwarding = clientCertificateForwarding;
            return this;
        }

        /**
         * @param clientCertificateForwarding Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateForwarding(Boolean clientCertificateForwarding) {
            return clientCertificateForwarding(Output.of(clientCertificateForwarding));
        }

        /**
         * @param hostname The hostname that these settings apply to.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname that these settings apply to.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        public ZeroTrustAccessMtlsHostnameSettingsSettingArgs build() {
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessMtlsHostnameSettingsSettingArgs", "hostname");
            }
            return $;
        }
    }

}