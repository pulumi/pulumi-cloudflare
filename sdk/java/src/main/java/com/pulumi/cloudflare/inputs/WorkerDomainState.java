// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerDomainState extends com.pulumi.resources.ResourceArgs {

    public static final WorkerDomainState Empty = new WorkerDomainState();

    /**
     * Identifer of the account.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Identifer of the account.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Worker environment associated with the zone and hostname.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return Worker environment associated with the zone and hostname.
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Hostname of the Worker Domain.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Hostname of the Worker Domain.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Worker service associated with the zone and hostname.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Worker service associated with the zone and hostname.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Identifier of the zone.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return Identifier of the zone.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    /**
     * Name of the zone.
     * 
     */
    @Import(name="zoneName")
    private @Nullable Output<String> zoneName;

    /**
     * @return Name of the zone.
     * 
     */
    public Optional<Output<String>> zoneName() {
        return Optional.ofNullable(this.zoneName);
    }

    private WorkerDomainState() {}

    private WorkerDomainState(WorkerDomainState $) {
        this.accountId = $.accountId;
        this.environment = $.environment;
        this.hostname = $.hostname;
        this.service = $.service;
        this.zoneId = $.zoneId;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerDomainState $;

        public Builder() {
            $ = new WorkerDomainState();
        }

        public Builder(WorkerDomainState defaults) {
            $ = new WorkerDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifer of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifer of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param environment Worker environment associated with the zone and hostname.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Worker environment associated with the zone and hostname.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param hostname Hostname of the Worker Domain.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Hostname of the Worker Domain.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param service Worker service associated with the zone and hostname.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Worker service associated with the zone and hostname.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param zoneId Identifier of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        /**
         * @param zoneName Name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(@Nullable Output<String> zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        /**
         * @param zoneName Name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            return zoneName(Output.of(zoneName));
        }

        public WorkerDomainState build() {
            return $;
        }
    }

}
