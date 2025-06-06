// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsInternalDnsArgs;
import com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsNameserversArgs;
import com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsSoaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountDnsSettingsZoneDefaultsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountDnsSettingsZoneDefaultsArgs Empty = new AccountDnsSettingsZoneDefaultsArgs();

    /**
     * Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
     * 
     */
    @Import(name="flattenAllCnames")
    private @Nullable Output<Boolean> flattenAllCnames;

    /**
     * @return Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
     * 
     */
    public Optional<Output<Boolean>> flattenAllCnames() {
        return Optional.ofNullable(this.flattenAllCnames);
    }

    /**
     * Whether to enable Foundation DNS Advanced Nameservers on the zone.
     * 
     */
    @Import(name="foundationDns")
    private @Nullable Output<Boolean> foundationDns;

    /**
     * @return Whether to enable Foundation DNS Advanced Nameservers on the zone.
     * 
     */
    public Optional<Output<Boolean>> foundationDns() {
        return Optional.ofNullable(this.foundationDns);
    }

    /**
     * Settings for this internal zone.
     * 
     */
    @Import(name="internalDns")
    private @Nullable Output<AccountDnsSettingsZoneDefaultsInternalDnsArgs> internalDns;

    /**
     * @return Settings for this internal zone.
     * 
     */
    public Optional<Output<AccountDnsSettingsZoneDefaultsInternalDnsArgs>> internalDns() {
        return Optional.ofNullable(this.internalDns);
    }

    /**
     * Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
     * 
     */
    @Import(name="multiProvider")
    private @Nullable Output<Boolean> multiProvider;

    /**
     * @return Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
     * 
     */
    public Optional<Output<Boolean>> multiProvider() {
        return Optional.ofNullable(this.multiProvider);
    }

    /**
     * Settings determining the nameservers through which the zone should be available.
     * 
     */
    @Import(name="nameservers")
    private @Nullable Output<AccountDnsSettingsZoneDefaultsNameserversArgs> nameservers;

    /**
     * @return Settings determining the nameservers through which the zone should be available.
     * 
     */
    public Optional<Output<AccountDnsSettingsZoneDefaultsNameserversArgs>> nameservers() {
        return Optional.ofNullable(this.nameservers);
    }

    /**
     * The time to live (TTL) of the zone&#39;s nameserver (NS) records.
     * 
     */
    @Import(name="nsTtl")
    private @Nullable Output<Double> nsTtl;

    /**
     * @return The time to live (TTL) of the zone&#39;s nameserver (NS) records.
     * 
     */
    public Optional<Output<Double>> nsTtl() {
        return Optional.ofNullable(this.nsTtl);
    }

    /**
     * Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
     * 
     */
    @Import(name="secondaryOverrides")
    private @Nullable Output<Boolean> secondaryOverrides;

    /**
     * @return Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
     * 
     */
    public Optional<Output<Boolean>> secondaryOverrides() {
        return Optional.ofNullable(this.secondaryOverrides);
    }

    /**
     * Components of the zone&#39;s SOA record.
     * 
     */
    @Import(name="soa")
    private @Nullable Output<AccountDnsSettingsZoneDefaultsSoaArgs> soa;

    /**
     * @return Components of the zone&#39;s SOA record.
     * 
     */
    public Optional<Output<AccountDnsSettingsZoneDefaultsSoaArgs>> soa() {
        return Optional.ofNullable(this.soa);
    }

    /**
     * Whether the zone mode is a regular or CDN/DNS only zone.
     * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
     * 
     */
    @Import(name="zoneMode")
    private @Nullable Output<String> zoneMode;

    /**
     * @return Whether the zone mode is a regular or CDN/DNS only zone.
     * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
     * 
     */
    public Optional<Output<String>> zoneMode() {
        return Optional.ofNullable(this.zoneMode);
    }

    private AccountDnsSettingsZoneDefaultsArgs() {}

    private AccountDnsSettingsZoneDefaultsArgs(AccountDnsSettingsZoneDefaultsArgs $) {
        this.flattenAllCnames = $.flattenAllCnames;
        this.foundationDns = $.foundationDns;
        this.internalDns = $.internalDns;
        this.multiProvider = $.multiProvider;
        this.nameservers = $.nameservers;
        this.nsTtl = $.nsTtl;
        this.secondaryOverrides = $.secondaryOverrides;
        this.soa = $.soa;
        this.zoneMode = $.zoneMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountDnsSettingsZoneDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountDnsSettingsZoneDefaultsArgs $;

        public Builder() {
            $ = new AccountDnsSettingsZoneDefaultsArgs();
        }

        public Builder(AccountDnsSettingsZoneDefaultsArgs defaults) {
            $ = new AccountDnsSettingsZoneDefaultsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flattenAllCnames Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
         * 
         * @return builder
         * 
         */
        public Builder flattenAllCnames(@Nullable Output<Boolean> flattenAllCnames) {
            $.flattenAllCnames = flattenAllCnames;
            return this;
        }

        /**
         * @param flattenAllCnames Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
         * 
         * @return builder
         * 
         */
        public Builder flattenAllCnames(Boolean flattenAllCnames) {
            return flattenAllCnames(Output.of(flattenAllCnames));
        }

        /**
         * @param foundationDns Whether to enable Foundation DNS Advanced Nameservers on the zone.
         * 
         * @return builder
         * 
         */
        public Builder foundationDns(@Nullable Output<Boolean> foundationDns) {
            $.foundationDns = foundationDns;
            return this;
        }

        /**
         * @param foundationDns Whether to enable Foundation DNS Advanced Nameservers on the zone.
         * 
         * @return builder
         * 
         */
        public Builder foundationDns(Boolean foundationDns) {
            return foundationDns(Output.of(foundationDns));
        }

        /**
         * @param internalDns Settings for this internal zone.
         * 
         * @return builder
         * 
         */
        public Builder internalDns(@Nullable Output<AccountDnsSettingsZoneDefaultsInternalDnsArgs> internalDns) {
            $.internalDns = internalDns;
            return this;
        }

        /**
         * @param internalDns Settings for this internal zone.
         * 
         * @return builder
         * 
         */
        public Builder internalDns(AccountDnsSettingsZoneDefaultsInternalDnsArgs internalDns) {
            return internalDns(Output.of(internalDns));
        }

        /**
         * @param multiProvider Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
         * 
         * @return builder
         * 
         */
        public Builder multiProvider(@Nullable Output<Boolean> multiProvider) {
            $.multiProvider = multiProvider;
            return this;
        }

        /**
         * @param multiProvider Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
         * 
         * @return builder
         * 
         */
        public Builder multiProvider(Boolean multiProvider) {
            return multiProvider(Output.of(multiProvider));
        }

        /**
         * @param nameservers Settings determining the nameservers through which the zone should be available.
         * 
         * @return builder
         * 
         */
        public Builder nameservers(@Nullable Output<AccountDnsSettingsZoneDefaultsNameserversArgs> nameservers) {
            $.nameservers = nameservers;
            return this;
        }

        /**
         * @param nameservers Settings determining the nameservers through which the zone should be available.
         * 
         * @return builder
         * 
         */
        public Builder nameservers(AccountDnsSettingsZoneDefaultsNameserversArgs nameservers) {
            return nameservers(Output.of(nameservers));
        }

        /**
         * @param nsTtl The time to live (TTL) of the zone&#39;s nameserver (NS) records.
         * 
         * @return builder
         * 
         */
        public Builder nsTtl(@Nullable Output<Double> nsTtl) {
            $.nsTtl = nsTtl;
            return this;
        }

        /**
         * @param nsTtl The time to live (TTL) of the zone&#39;s nameserver (NS) records.
         * 
         * @return builder
         * 
         */
        public Builder nsTtl(Double nsTtl) {
            return nsTtl(Output.of(nsTtl));
        }

        /**
         * @param secondaryOverrides Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
         * 
         * @return builder
         * 
         */
        public Builder secondaryOverrides(@Nullable Output<Boolean> secondaryOverrides) {
            $.secondaryOverrides = secondaryOverrides;
            return this;
        }

        /**
         * @param secondaryOverrides Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
         * 
         * @return builder
         * 
         */
        public Builder secondaryOverrides(Boolean secondaryOverrides) {
            return secondaryOverrides(Output.of(secondaryOverrides));
        }

        /**
         * @param soa Components of the zone&#39;s SOA record.
         * 
         * @return builder
         * 
         */
        public Builder soa(@Nullable Output<AccountDnsSettingsZoneDefaultsSoaArgs> soa) {
            $.soa = soa;
            return this;
        }

        /**
         * @param soa Components of the zone&#39;s SOA record.
         * 
         * @return builder
         * 
         */
        public Builder soa(AccountDnsSettingsZoneDefaultsSoaArgs soa) {
            return soa(Output.of(soa));
        }

        /**
         * @param zoneMode Whether the zone mode is a regular or CDN/DNS only zone.
         * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
         * 
         * @return builder
         * 
         */
        public Builder zoneMode(@Nullable Output<String> zoneMode) {
            $.zoneMode = zoneMode;
            return this;
        }

        /**
         * @param zoneMode Whether the zone mode is a regular or CDN/DNS only zone.
         * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
         * 
         * @return builder
         * 
         */
        public Builder zoneMode(String zoneMode) {
            return zoneMode(Output.of(zoneMode));
        }

        public AccountDnsSettingsZoneDefaultsArgs build() {
            return $;
        }
    }

}
