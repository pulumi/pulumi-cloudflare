// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ListItemHostnameArgs;
import com.pulumi.cloudflare.inputs.ListItemRedirectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListItemArgs Empty = new ListItemArgs();

    /**
     * Defines an identifier.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Defines an identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * A non-negative 32 bit integer
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Integer> asn;

    /**
     * @return A non-negative 32 bit integer
     * 
     */
    public Optional<Output<Integer>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * An informative summary of the list item.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return An informative summary of the list item.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<ListItemHostnameArgs> hostname;

    /**
     * @return Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
     * 
     */
    public Optional<Output<ListItemHostnameArgs>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64.
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * The unique ID of the list.
     * 
     */
    @Import(name="listId", required=true)
    private Output<String> listId;

    /**
     * @return The unique ID of the list.
     * 
     */
    public Output<String> listId() {
        return this.listId;
    }

    /**
     * The definition of the redirect.
     * 
     */
    @Import(name="redirect")
    private @Nullable Output<ListItemRedirectArgs> redirect;

    /**
     * @return The definition of the redirect.
     * 
     */
    public Optional<Output<ListItemRedirectArgs>> redirect() {
        return Optional.ofNullable(this.redirect);
    }

    private ListItemArgs() {}

    private ListItemArgs(ListItemArgs $) {
        this.accountId = $.accountId;
        this.asn = $.asn;
        this.comment = $.comment;
        this.hostname = $.hostname;
        this.ip = $.ip;
        this.listId = $.listId;
        this.redirect = $.redirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListItemArgs $;

        public Builder() {
            $ = new ListItemArgs();
        }

        public Builder(ListItemArgs defaults) {
            $ = new ListItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Defines an identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Defines an identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param asn A non-negative 32 bit integer
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn A non-negative 32 bit integer
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param comment An informative summary of the list item.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment An informative summary of the list item.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param hostname Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<ListItemHostnameArgs> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
         * 
         * @return builder
         * 
         */
        public Builder hostname(ListItemHostnameArgs hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ip An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param listId The unique ID of the list.
         * 
         * @return builder
         * 
         */
        public Builder listId(Output<String> listId) {
            $.listId = listId;
            return this;
        }

        /**
         * @param listId The unique ID of the list.
         * 
         * @return builder
         * 
         */
        public Builder listId(String listId) {
            return listId(Output.of(listId));
        }

        /**
         * @param redirect The definition of the redirect.
         * 
         * @return builder
         * 
         */
        public Builder redirect(@Nullable Output<ListItemRedirectArgs> redirect) {
            $.redirect = redirect;
            return this;
        }

        /**
         * @param redirect The definition of the redirect.
         * 
         * @return builder
         * 
         */
        public Builder redirect(ListItemRedirectArgs redirect) {
            return redirect(Output.of(redirect));
        }

        public ListItemArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ListItemArgs", "accountId");
            }
            if ($.listId == null) {
                throw new MissingRequiredPropertyException("ListItemArgs", "listId");
            }
            return $;
        }
    }

}
