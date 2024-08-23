// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustListItemsWithDescriptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustListState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustListState Empty = new ZeroTrustListState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The description of the teams list.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the teams list.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The items of the teams list.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<String>> items;

    /**
     * @return The items of the teams list.
     * 
     */
    public Optional<Output<List<String>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * The items of the teams list that has explicit description.
     * 
     */
    @Import(name="itemsWithDescriptions")
    private @Nullable Output<List<ZeroTrustListItemsWithDescriptionArgs>> itemsWithDescriptions;

    /**
     * @return The items of the teams list that has explicit description.
     * 
     */
    public Optional<Output<List<ZeroTrustListItemsWithDescriptionArgs>>> itemsWithDescriptions() {
        return Optional.ofNullable(this.itemsWithDescriptions);
    }

    /**
     * Name of the teams list.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the teams list.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ZeroTrustListState() {}

    private ZeroTrustListState(ZeroTrustListState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.items = $.items;
        this.itemsWithDescriptions = $.itemsWithDescriptions;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustListState $;

        public Builder() {
            $ = new ZeroTrustListState();
        }

        public Builder(ZeroTrustListState defaults) {
            $ = new ZeroTrustListState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description The description of the teams list.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the teams list.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param items The items of the teams list.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<String>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items The items of the teams list.
         * 
         * @return builder
         * 
         */
        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        /**
         * @param items The items of the teams list.
         * 
         * @return builder
         * 
         */
        public Builder items(String... items) {
            return items(List.of(items));
        }

        /**
         * @param itemsWithDescriptions The items of the teams list that has explicit description.
         * 
         * @return builder
         * 
         */
        public Builder itemsWithDescriptions(@Nullable Output<List<ZeroTrustListItemsWithDescriptionArgs>> itemsWithDescriptions) {
            $.itemsWithDescriptions = itemsWithDescriptions;
            return this;
        }

        /**
         * @param itemsWithDescriptions The items of the teams list that has explicit description.
         * 
         * @return builder
         * 
         */
        public Builder itemsWithDescriptions(List<ZeroTrustListItemsWithDescriptionArgs> itemsWithDescriptions) {
            return itemsWithDescriptions(Output.of(itemsWithDescriptions));
        }

        /**
         * @param itemsWithDescriptions The items of the teams list that has explicit description.
         * 
         * @return builder
         * 
         */
        public Builder itemsWithDescriptions(ZeroTrustListItemsWithDescriptionArgs... itemsWithDescriptions) {
            return itemsWithDescriptions(List.of(itemsWithDescriptions));
        }

        /**
         * @param name Name of the teams list.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the teams list.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ZeroTrustListState build() {
            return $;
        }
    }

}