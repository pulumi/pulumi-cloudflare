// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInfrastructureAccessTargetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureAccessTargetsPlainArgs Empty = new GetInfrastructureAccessTargetsPlainArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * A date and time after a target was created to filter on.
     * 
     */
    @Import(name="createdAfter")
    private @Nullable String createdAfter;

    /**
     * @return A date and time after a target was created to filter on.
     * 
     */
    public Optional<String> createdAfter() {
        return Optional.ofNullable(this.createdAfter);
    }

    /**
     * The name of the app type.
     * 
     */
    @Import(name="hostname")
    private @Nullable String hostname;

    /**
     * @return The name of the app type.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The name of the app type.
     * 
     */
    @Import(name="hostnameContains")
    private @Nullable String hostnameContains;

    /**
     * @return The name of the app type.
     * 
     */
    public Optional<String> hostnameContains() {
        return Optional.ofNullable(this.hostnameContains);
    }

    /**
     * The name of the app type.
     * 
     */
    @Import(name="ipv4")
    private @Nullable String ipv4;

    /**
     * @return The name of the app type.
     * 
     */
    public Optional<String> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }

    /**
     * The name of the app type.
     * 
     */
    @Import(name="ipv6")
    private @Nullable String ipv6;

    /**
     * @return The name of the app type.
     * 
     */
    public Optional<String> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * A date and time after a target was modified to filter on.
     * 
     */
    @Import(name="modifiedAfter")
    private @Nullable String modifiedAfter;

    /**
     * @return A date and time after a target was modified to filter on.
     * 
     */
    public Optional<String> modifiedAfter() {
        return Optional.ofNullable(this.modifiedAfter);
    }

    /**
     * The name of the app type.
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable String virtualNetworkId;

    /**
     * @return The name of the app type.
     * 
     */
    public Optional<String> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    private GetInfrastructureAccessTargetsPlainArgs() {}

    private GetInfrastructureAccessTargetsPlainArgs(GetInfrastructureAccessTargetsPlainArgs $) {
        this.accountId = $.accountId;
        this.createdAfter = $.createdAfter;
        this.hostname = $.hostname;
        this.hostnameContains = $.hostnameContains;
        this.ipv4 = $.ipv4;
        this.ipv6 = $.ipv6;
        this.modifiedAfter = $.modifiedAfter;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfrastructureAccessTargetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfrastructureAccessTargetsPlainArgs $;

        public Builder() {
            $ = new GetInfrastructureAccessTargetsPlainArgs();
        }

        public Builder(GetInfrastructureAccessTargetsPlainArgs defaults) {
            $ = new GetInfrastructureAccessTargetsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param createdAfter A date and time after a target was created to filter on.
         * 
         * @return builder
         * 
         */
        public Builder createdAfter(@Nullable String createdAfter) {
            $.createdAfter = createdAfter;
            return this;
        }

        /**
         * @param hostname The name of the app type.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable String hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostnameContains The name of the app type.
         * 
         * @return builder
         * 
         */
        public Builder hostnameContains(@Nullable String hostnameContains) {
            $.hostnameContains = hostnameContains;
            return this;
        }

        /**
         * @param ipv4 The name of the app type.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(@Nullable String ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv6 The name of the app type.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable String ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param modifiedAfter A date and time after a target was modified to filter on.
         * 
         * @return builder
         * 
         */
        public Builder modifiedAfter(@Nullable String modifiedAfter) {
            $.modifiedAfter = modifiedAfter;
            return this;
        }

        /**
         * @param virtualNetworkId The name of the app type.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(@Nullable String virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        public GetInfrastructureAccessTargetsPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsPlainArgs", "accountId");
            }
            return $;
        }
    }

}