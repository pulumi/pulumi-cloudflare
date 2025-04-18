// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.MagicTransitSiteWanStaticAddressingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MagicTransitSiteWanState extends com.pulumi.resources.ResourceArgs {

    public static final MagicTransitSiteWanState Empty = new MagicTransitSiteWanState();

    /**
     * Identifier
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Identifier
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
     * Available values: &#34;low&#34;, &#34;mid&#34;, &#34;high&#34;.
     * 
     */
    @Import(name="healthCheckRate")
    private @Nullable Output<String> healthCheckRate;

    /**
     * @return Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
     * Available values: &#34;low&#34;, &#34;mid&#34;, &#34;high&#34;.
     * 
     */
    public Optional<Output<String>> healthCheckRate() {
        return Optional.ofNullable(this.healthCheckRate);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="physport")
    private @Nullable Output<Integer> physport;

    public Optional<Output<Integer>> physport() {
        return Optional.ofNullable(this.physport);
    }

    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Identifier
     * 
     */
    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    /**
     * @return Identifier
     * 
     */
    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
     * 
     */
    @Import(name="staticAddressing")
    private @Nullable Output<MagicTransitSiteWanStaticAddressingArgs> staticAddressing;

    /**
     * @return (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
     * 
     */
    public Optional<Output<MagicTransitSiteWanStaticAddressingArgs>> staticAddressing() {
        return Optional.ofNullable(this.staticAddressing);
    }

    /**
     * VLAN ID. Use zero for untagged.
     * 
     */
    @Import(name="vlanTag")
    private @Nullable Output<Integer> vlanTag;

    /**
     * @return VLAN ID. Use zero for untagged.
     * 
     */
    public Optional<Output<Integer>> vlanTag() {
        return Optional.ofNullable(this.vlanTag);
    }

    private MagicTransitSiteWanState() {}

    private MagicTransitSiteWanState(MagicTransitSiteWanState $) {
        this.accountId = $.accountId;
        this.healthCheckRate = $.healthCheckRate;
        this.name = $.name;
        this.physport = $.physport;
        this.priority = $.priority;
        this.siteId = $.siteId;
        this.staticAddressing = $.staticAddressing;
        this.vlanTag = $.vlanTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MagicTransitSiteWanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MagicTransitSiteWanState $;

        public Builder() {
            $ = new MagicTransitSiteWanState();
        }

        public Builder(MagicTransitSiteWanState defaults) {
            $ = new MagicTransitSiteWanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param healthCheckRate Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
         * Available values: &#34;low&#34;, &#34;mid&#34;, &#34;high&#34;.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRate(@Nullable Output<String> healthCheckRate) {
            $.healthCheckRate = healthCheckRate;
            return this;
        }

        /**
         * @param healthCheckRate Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
         * Available values: &#34;low&#34;, &#34;mid&#34;, &#34;high&#34;.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRate(String healthCheckRate) {
            return healthCheckRate(Output.of(healthCheckRate));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder physport(@Nullable Output<Integer> physport) {
            $.physport = physport;
            return this;
        }

        public Builder physport(Integer physport) {
            return physport(Output.of(physport));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param siteId Identifier
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId Identifier
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param staticAddressing (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
         * 
         * @return builder
         * 
         */
        public Builder staticAddressing(@Nullable Output<MagicTransitSiteWanStaticAddressingArgs> staticAddressing) {
            $.staticAddressing = staticAddressing;
            return this;
        }

        /**
         * @param staticAddressing (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
         * 
         * @return builder
         * 
         */
        public Builder staticAddressing(MagicTransitSiteWanStaticAddressingArgs staticAddressing) {
            return staticAddressing(Output.of(staticAddressing));
        }

        /**
         * @param vlanTag VLAN ID. Use zero for untagged.
         * 
         * @return builder
         * 
         */
        public Builder vlanTag(@Nullable Output<Integer> vlanTag) {
            $.vlanTag = vlanTag;
            return this;
        }

        /**
         * @param vlanTag VLAN ID. Use zero for untagged.
         * 
         * @return builder
         * 
         */
        public Builder vlanTag(Integer vlanTag) {
            return vlanTag(Output.of(vlanTag));
        }

        public MagicTransitSiteWanState build() {
            return $;
        }
    }

}
