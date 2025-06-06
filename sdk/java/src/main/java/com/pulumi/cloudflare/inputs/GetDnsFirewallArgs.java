// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDnsFirewallArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsFirewallArgs Empty = new GetDnsFirewallArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="dnsFirewallId")
    private @Nullable Output<String> dnsFirewallId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<Output<String>> dnsFirewallId() {
        return Optional.ofNullable(this.dnsFirewallId);
    }

    private GetDnsFirewallArgs() {}

    private GetDnsFirewallArgs(GetDnsFirewallArgs $) {
        this.accountId = $.accountId;
        this.dnsFirewallId = $.dnsFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsFirewallArgs $;

        public Builder() {
            $ = new GetDnsFirewallArgs();
        }

        public Builder(GetDnsFirewallArgs defaults) {
            $ = new GetDnsFirewallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param dnsFirewallId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder dnsFirewallId(@Nullable Output<String> dnsFirewallId) {
            $.dnsFirewallId = dnsFirewallId;
            return this;
        }

        /**
         * @param dnsFirewallId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder dnsFirewallId(String dnsFirewallId) {
            return dnsFirewallId(Output.of(dnsFirewallId));
        }

        public GetDnsFirewallArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetDnsFirewallArgs", "accountId");
            }
            return $;
        }
    }

}
