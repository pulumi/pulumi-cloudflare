// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.MagicNetworkMonitoringConfigurationWarpDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MagicNetworkMonitoringConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final MagicNetworkMonitoringConfigurationState Empty = new MagicNetworkMonitoringConfigurationState();

    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Fallback sampling rate of flow messages being sent in packets per second. This should match the packet sampling rate configured on the router.
     * 
     */
    @Import(name="defaultSampling")
    private @Nullable Output<Double> defaultSampling;

    /**
     * @return Fallback sampling rate of flow messages being sent in packets per second. This should match the packet sampling rate configured on the router.
     * 
     */
    public Optional<Output<Double>> defaultSampling() {
        return Optional.ofNullable(this.defaultSampling);
    }

    /**
     * The account name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The account name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="routerIps")
    private @Nullable Output<List<String>> routerIps;

    public Optional<Output<List<String>>> routerIps() {
        return Optional.ofNullable(this.routerIps);
    }

    @Import(name="warpDevices")
    private @Nullable Output<List<MagicNetworkMonitoringConfigurationWarpDeviceArgs>> warpDevices;

    public Optional<Output<List<MagicNetworkMonitoringConfigurationWarpDeviceArgs>>> warpDevices() {
        return Optional.ofNullable(this.warpDevices);
    }

    private MagicNetworkMonitoringConfigurationState() {}

    private MagicNetworkMonitoringConfigurationState(MagicNetworkMonitoringConfigurationState $) {
        this.accountId = $.accountId;
        this.defaultSampling = $.defaultSampling;
        this.name = $.name;
        this.routerIps = $.routerIps;
        this.warpDevices = $.warpDevices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MagicNetworkMonitoringConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MagicNetworkMonitoringConfigurationState $;

        public Builder() {
            $ = new MagicNetworkMonitoringConfigurationState();
        }

        public Builder(MagicNetworkMonitoringConfigurationState defaults) {
            $ = new MagicNetworkMonitoringConfigurationState(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param defaultSampling Fallback sampling rate of flow messages being sent in packets per second. This should match the packet sampling rate configured on the router.
         * 
         * @return builder
         * 
         */
        public Builder defaultSampling(@Nullable Output<Double> defaultSampling) {
            $.defaultSampling = defaultSampling;
            return this;
        }

        /**
         * @param defaultSampling Fallback sampling rate of flow messages being sent in packets per second. This should match the packet sampling rate configured on the router.
         * 
         * @return builder
         * 
         */
        public Builder defaultSampling(Double defaultSampling) {
            return defaultSampling(Output.of(defaultSampling));
        }

        /**
         * @param name The account name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The account name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder routerIps(@Nullable Output<List<String>> routerIps) {
            $.routerIps = routerIps;
            return this;
        }

        public Builder routerIps(List<String> routerIps) {
            return routerIps(Output.of(routerIps));
        }

        public Builder routerIps(String... routerIps) {
            return routerIps(List.of(routerIps));
        }

        public Builder warpDevices(@Nullable Output<List<MagicNetworkMonitoringConfigurationWarpDeviceArgs>> warpDevices) {
            $.warpDevices = warpDevices;
            return this;
        }

        public Builder warpDevices(List<MagicNetworkMonitoringConfigurationWarpDeviceArgs> warpDevices) {
            return warpDevices(Output.of(warpDevices));
        }

        public Builder warpDevices(MagicNetworkMonitoringConfigurationWarpDeviceArgs... warpDevices) {
            return warpDevices(List.of(warpDevices));
        }

        public MagicNetworkMonitoringConfigurationState build() {
            return $;
        }
    }

}
