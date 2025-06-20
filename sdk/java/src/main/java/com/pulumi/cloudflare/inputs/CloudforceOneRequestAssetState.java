// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudforceOneRequestAssetState extends com.pulumi.resources.ResourceArgs {

    public static final CloudforceOneRequestAssetState Empty = new CloudforceOneRequestAssetState();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Defines the asset creation time.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return Defines the asset creation time.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * Asset description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Asset description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Asset file type.
     * 
     */
    @Import(name="fileType")
    private @Nullable Output<String> fileType;

    /**
     * @return Asset file type.
     * 
     */
    public Optional<Output<String>> fileType() {
        return Optional.ofNullable(this.fileType);
    }

    /**
     * Asset name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Asset name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Page number of results.
     * 
     */
    @Import(name="page")
    private @Nullable Output<Integer> page;

    /**
     * @return Page number of results.
     * 
     */
    public Optional<Output<Integer>> page() {
        return Optional.ofNullable(this.page);
    }

    /**
     * Number of results per page.
     * 
     */
    @Import(name="perPage")
    private @Nullable Output<Integer> perPage;

    /**
     * @return Number of results per page.
     * 
     */
    public Optional<Output<Integer>> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * UUID.
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return UUID.
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Asset file to upload.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Asset file to upload.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private CloudforceOneRequestAssetState() {}

    private CloudforceOneRequestAssetState(CloudforceOneRequestAssetState $) {
        this.accountId = $.accountId;
        this.created = $.created;
        this.description = $.description;
        this.fileType = $.fileType;
        this.name = $.name;
        this.page = $.page;
        this.perPage = $.perPage;
        this.requestId = $.requestId;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudforceOneRequestAssetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudforceOneRequestAssetState $;

        public Builder() {
            $ = new CloudforceOneRequestAssetState();
        }

        public Builder(CloudforceOneRequestAssetState defaults) {
            $ = new CloudforceOneRequestAssetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
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
         * @param created Defines the asset creation time.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created Defines the asset creation time.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param description Asset description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Asset description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileType Asset file type.
         * 
         * @return builder
         * 
         */
        public Builder fileType(@Nullable Output<String> fileType) {
            $.fileType = fileType;
            return this;
        }

        /**
         * @param fileType Asset file type.
         * 
         * @return builder
         * 
         */
        public Builder fileType(String fileType) {
            return fileType(Output.of(fileType));
        }

        /**
         * @param name Asset name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Asset name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param page Page number of results.
         * 
         * @return builder
         * 
         */
        public Builder page(@Nullable Output<Integer> page) {
            $.page = page;
            return this;
        }

        /**
         * @param page Page number of results.
         * 
         * @return builder
         * 
         */
        public Builder page(Integer page) {
            return page(Output.of(page));
        }

        /**
         * @param perPage Number of results per page.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Output<Integer> perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param perPage Number of results per page.
         * 
         * @return builder
         * 
         */
        public Builder perPage(Integer perPage) {
            return perPage(Output.of(perPage));
        }

        /**
         * @param requestId UUID.
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId UUID.
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param source Asset file to upload.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Asset file to upload.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public CloudforceOneRequestAssetState build() {
            return $;
        }
    }

}
