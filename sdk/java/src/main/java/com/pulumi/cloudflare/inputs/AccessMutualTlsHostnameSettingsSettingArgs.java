// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class AccessMutualTlsHostnameSettingsSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessMutualTlsHostnameSettingsSettingArgs Empty = new AccessMutualTlsHostnameSettingsSettingArgs();

    /**
     * Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
     * 
     */
    @Import(name="chinaNetwork", required=true)
    private Output<Boolean> chinaNetwork;

    /**
     * @return Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
     * 
     */
    public Output<Boolean> chinaNetwork() {
        return this.chinaNetwork;
    }

    /**
     * Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
     * 
     */
    @Import(name="clientCertificateForwarding", required=true)
    private Output<Boolean> clientCertificateForwarding;

    /**
     * @return Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
     * 
     */
    public Output<Boolean> clientCertificateForwarding() {
        return this.clientCertificateForwarding;
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

    private AccessMutualTlsHostnameSettingsSettingArgs() {}

    private AccessMutualTlsHostnameSettingsSettingArgs(AccessMutualTlsHostnameSettingsSettingArgs $) {
        this.chinaNetwork = $.chinaNetwork;
        this.clientCertificateForwarding = $.clientCertificateForwarding;
        this.hostname = $.hostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessMutualTlsHostnameSettingsSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessMutualTlsHostnameSettingsSettingArgs $;

        public Builder() {
            $ = new AccessMutualTlsHostnameSettingsSettingArgs();
        }

        public Builder(AccessMutualTlsHostnameSettingsSettingArgs defaults) {
            $ = new AccessMutualTlsHostnameSettingsSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chinaNetwork Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
         * 
         * @return builder
         * 
         */
        public Builder chinaNetwork(Output<Boolean> chinaNetwork) {
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
        public Builder clientCertificateForwarding(Output<Boolean> clientCertificateForwarding) {
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

        public AccessMutualTlsHostnameSettingsSettingArgs build() {
            if ($.chinaNetwork == null) {
                throw new MissingRequiredPropertyException("AccessMutualTlsHostnameSettingsSettingArgs", "chinaNetwork");
            }
            if ($.clientCertificateForwarding == null) {
                throw new MissingRequiredPropertyException("AccessMutualTlsHostnameSettingsSettingArgs", "clientCertificateForwarding");
            }
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("AccessMutualTlsHostnameSettingsSettingArgs", "hostname");
            }
            return $;
        }
    }

}
