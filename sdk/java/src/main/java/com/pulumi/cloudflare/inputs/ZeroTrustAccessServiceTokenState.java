// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessServiceTokenState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessServiceTokenState Empty = new ZeroTrustAccessServiceTokenState();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    @Import(name="lastSeenAt")
    private @Nullable Output<String> lastSeenAt;

    public Optional<Output<String>> lastSeenAt() {
        return Optional.ofNullable(this.lastSeenAt);
    }

    /**
     * The name of the service token.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the service token.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ZeroTrustAccessServiceTokenState() {}

    private ZeroTrustAccessServiceTokenState(ZeroTrustAccessServiceTokenState $) {
        this.accountId = $.accountId;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.createdAt = $.createdAt;
        this.duration = $.duration;
        this.expiresAt = $.expiresAt;
        this.lastSeenAt = $.lastSeenAt;
        this.name = $.name;
        this.updatedAt = $.updatedAt;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessServiceTokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessServiceTokenState $;

        public Builder() {
            $ = new ZeroTrustAccessServiceTokenState();
        }

        public Builder(ZeroTrustAccessServiceTokenState defaults) {
            $ = new ZeroTrustAccessServiceTokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param clientId The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param duration The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        public Builder lastSeenAt(@Nullable Output<String> lastSeenAt) {
            $.lastSeenAt = lastSeenAt;
            return this;
        }

        public Builder lastSeenAt(String lastSeenAt) {
            return lastSeenAt(Output.of(lastSeenAt));
        }

        /**
         * @param name The name of the service token.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the service token.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZeroTrustAccessServiceTokenState build() {
            return $;
        }
    }

}
