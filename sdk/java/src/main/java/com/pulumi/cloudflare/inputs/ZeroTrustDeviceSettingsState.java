// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDeviceSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDeviceSettingsState Empty = new ZeroTrustDeviceSettingsState();

    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Sets the time limit, in seconds, that a user can use an override code to bypass WARP.
     * 
     */
    @Import(name="disableForTime")
    private @Nullable Output<Double> disableForTime;

    /**
     * @return Sets the time limit, in seconds, that a user can use an override code to bypass WARP.
     * 
     */
    public Optional<Output<Double>> disableForTime() {
        return Optional.ofNullable(this.disableForTime);
    }

    /**
     * Enable gateway proxy filtering on TCP.
     * 
     */
    @Import(name="gatewayProxyEnabled")
    private @Nullable Output<Boolean> gatewayProxyEnabled;

    /**
     * @return Enable gateway proxy filtering on TCP.
     * 
     */
    public Optional<Output<Boolean>> gatewayProxyEnabled() {
        return Optional.ofNullable(this.gatewayProxyEnabled);
    }

    /**
     * Enable gateway proxy filtering on UDP.
     * 
     */
    @Import(name="gatewayUdpProxyEnabled")
    private @Nullable Output<Boolean> gatewayUdpProxyEnabled;

    /**
     * @return Enable gateway proxy filtering on UDP.
     * 
     */
    public Optional<Output<Boolean>> gatewayUdpProxyEnabled() {
        return Optional.ofNullable(this.gatewayUdpProxyEnabled);
    }

    /**
     * Enable installation of cloudflare managed root certificate.
     * 
     */
    @Import(name="rootCertificateInstallationEnabled")
    private @Nullable Output<Boolean> rootCertificateInstallationEnabled;

    /**
     * @return Enable installation of cloudflare managed root certificate.
     * 
     */
    public Optional<Output<Boolean>> rootCertificateInstallationEnabled() {
        return Optional.ofNullable(this.rootCertificateInstallationEnabled);
    }

    /**
     * Enable using CGNAT virtual IPv4.
     * 
     */
    @Import(name="useZtVirtualIp")
    private @Nullable Output<Boolean> useZtVirtualIp;

    /**
     * @return Enable using CGNAT virtual IPv4.
     * 
     */
    public Optional<Output<Boolean>> useZtVirtualIp() {
        return Optional.ofNullable(this.useZtVirtualIp);
    }

    private ZeroTrustDeviceSettingsState() {}

    private ZeroTrustDeviceSettingsState(ZeroTrustDeviceSettingsState $) {
        this.accountId = $.accountId;
        this.disableForTime = $.disableForTime;
        this.gatewayProxyEnabled = $.gatewayProxyEnabled;
        this.gatewayUdpProxyEnabled = $.gatewayUdpProxyEnabled;
        this.rootCertificateInstallationEnabled = $.rootCertificateInstallationEnabled;
        this.useZtVirtualIp = $.useZtVirtualIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDeviceSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDeviceSettingsState $;

        public Builder() {
            $ = new ZeroTrustDeviceSettingsState();
        }

        public Builder(ZeroTrustDeviceSettingsState defaults) {
            $ = new ZeroTrustDeviceSettingsState(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param disableForTime Sets the time limit, in seconds, that a user can use an override code to bypass WARP.
         * 
         * @return builder
         * 
         */
        public Builder disableForTime(@Nullable Output<Double> disableForTime) {
            $.disableForTime = disableForTime;
            return this;
        }

        /**
         * @param disableForTime Sets the time limit, in seconds, that a user can use an override code to bypass WARP.
         * 
         * @return builder
         * 
         */
        public Builder disableForTime(Double disableForTime) {
            return disableForTime(Output.of(disableForTime));
        }

        /**
         * @param gatewayProxyEnabled Enable gateway proxy filtering on TCP.
         * 
         * @return builder
         * 
         */
        public Builder gatewayProxyEnabled(@Nullable Output<Boolean> gatewayProxyEnabled) {
            $.gatewayProxyEnabled = gatewayProxyEnabled;
            return this;
        }

        /**
         * @param gatewayProxyEnabled Enable gateway proxy filtering on TCP.
         * 
         * @return builder
         * 
         */
        public Builder gatewayProxyEnabled(Boolean gatewayProxyEnabled) {
            return gatewayProxyEnabled(Output.of(gatewayProxyEnabled));
        }

        /**
         * @param gatewayUdpProxyEnabled Enable gateway proxy filtering on UDP.
         * 
         * @return builder
         * 
         */
        public Builder gatewayUdpProxyEnabled(@Nullable Output<Boolean> gatewayUdpProxyEnabled) {
            $.gatewayUdpProxyEnabled = gatewayUdpProxyEnabled;
            return this;
        }

        /**
         * @param gatewayUdpProxyEnabled Enable gateway proxy filtering on UDP.
         * 
         * @return builder
         * 
         */
        public Builder gatewayUdpProxyEnabled(Boolean gatewayUdpProxyEnabled) {
            return gatewayUdpProxyEnabled(Output.of(gatewayUdpProxyEnabled));
        }

        /**
         * @param rootCertificateInstallationEnabled Enable installation of cloudflare managed root certificate.
         * 
         * @return builder
         * 
         */
        public Builder rootCertificateInstallationEnabled(@Nullable Output<Boolean> rootCertificateInstallationEnabled) {
            $.rootCertificateInstallationEnabled = rootCertificateInstallationEnabled;
            return this;
        }

        /**
         * @param rootCertificateInstallationEnabled Enable installation of cloudflare managed root certificate.
         * 
         * @return builder
         * 
         */
        public Builder rootCertificateInstallationEnabled(Boolean rootCertificateInstallationEnabled) {
            return rootCertificateInstallationEnabled(Output.of(rootCertificateInstallationEnabled));
        }

        /**
         * @param useZtVirtualIp Enable using CGNAT virtual IPv4.
         * 
         * @return builder
         * 
         */
        public Builder useZtVirtualIp(@Nullable Output<Boolean> useZtVirtualIp) {
            $.useZtVirtualIp = useZtVirtualIp;
            return this;
        }

        /**
         * @param useZtVirtualIp Enable using CGNAT virtual IPv4.
         * 
         * @return builder
         * 
         */
        public Builder useZtVirtualIp(Boolean useZtVirtualIp) {
            return useZtVirtualIp(Output.of(useZtVirtualIp));
        }

        public ZeroTrustDeviceSettingsState build() {
            return $;
        }
    }

}
