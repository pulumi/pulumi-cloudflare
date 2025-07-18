// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudforceOneRequestsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudforceOneRequestsArgs Empty = new GetCloudforceOneRequestsArgs();

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
     * Retrieve requests completed after this time.
     * 
     */
    @Import(name="completedAfter")
    private @Nullable Output<String> completedAfter;

    /**
     * @return Retrieve requests completed after this time.
     * 
     */
    public Optional<Output<String>> completedAfter() {
        return Optional.ofNullable(this.completedAfter);
    }

    /**
     * Retrieve requests completed before this time.
     * 
     */
    @Import(name="completedBefore")
    private @Nullable Output<String> completedBefore;

    /**
     * @return Retrieve requests completed before this time.
     * 
     */
    public Optional<Output<String>> completedBefore() {
        return Optional.ofNullable(this.completedBefore);
    }

    /**
     * Retrieve requests created after this time.
     * 
     */
    @Import(name="createdAfter")
    private @Nullable Output<String> createdAfter;

    /**
     * @return Retrieve requests created after this time.
     * 
     */
    public Optional<Output<String>> createdAfter() {
        return Optional.ofNullable(this.createdAfter);
    }

    /**
     * Retrieve requests created before this time.
     * 
     */
    @Import(name="createdBefore")
    private @Nullable Output<String> createdBefore;

    /**
     * @return Retrieve requests created before this time.
     * 
     */
    public Optional<Output<String>> createdBefore() {
        return Optional.ofNullable(this.createdBefore);
    }

    /**
     * Max items to fetch, default: 1000
     * 
     */
    @Import(name="maxItems")
    private @Nullable Output<Integer> maxItems;

    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Output<Integer>> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }

    /**
     * Page number of results.
     * 
     */
    @Import(name="page", required=true)
    private Output<Integer> page;

    /**
     * @return Page number of results.
     * 
     */
    public Output<Integer> page() {
        return this.page;
    }

    /**
     * Number of results per page.
     * 
     */
    @Import(name="perPage", required=true)
    private Output<Integer> perPage;

    /**
     * @return Number of results per page.
     * 
     */
    public Output<Integer> perPage() {
        return this.perPage;
    }

    /**
     * Requested information from request.
     * 
     */
    @Import(name="requestType")
    private @Nullable Output<String> requestType;

    /**
     * @return Requested information from request.
     * 
     */
    public Optional<Output<String>> requestType() {
        return Optional.ofNullable(this.requestType);
    }

    /**
     * Field to sort results by.
     * 
     */
    @Import(name="sortBy")
    private @Nullable Output<String> sortBy;

    /**
     * @return Field to sort results by.
     * 
     */
    public Optional<Output<String>> sortBy() {
        return Optional.ofNullable(this.sortBy);
    }

    /**
     * Sort order (asc or desc).
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="sortOrder")
    private @Nullable Output<String> sortOrder;

    /**
     * @return Sort order (asc or desc).
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<Output<String>> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }

    /**
     * Request Status.
     * Available values: &#34;open&#34;, &#34;accepted&#34;, &#34;reported&#34;, &#34;approved&#34;, &#34;completed&#34;, &#34;declined&#34;.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Request Status.
     * Available values: &#34;open&#34;, &#34;accepted&#34;, &#34;reported&#34;, &#34;approved&#34;, &#34;completed&#34;, &#34;declined&#34;.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetCloudforceOneRequestsArgs() {}

    private GetCloudforceOneRequestsArgs(GetCloudforceOneRequestsArgs $) {
        this.accountId = $.accountId;
        this.completedAfter = $.completedAfter;
        this.completedBefore = $.completedBefore;
        this.createdAfter = $.createdAfter;
        this.createdBefore = $.createdBefore;
        this.maxItems = $.maxItems;
        this.page = $.page;
        this.perPage = $.perPage;
        this.requestType = $.requestType;
        this.sortBy = $.sortBy;
        this.sortOrder = $.sortOrder;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudforceOneRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudforceOneRequestsArgs $;

        public Builder() {
            $ = new GetCloudforceOneRequestsArgs();
        }

        public Builder(GetCloudforceOneRequestsArgs defaults) {
            $ = new GetCloudforceOneRequestsArgs(Objects.requireNonNull(defaults));
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
         * @param completedAfter Retrieve requests completed after this time.
         * 
         * @return builder
         * 
         */
        public Builder completedAfter(@Nullable Output<String> completedAfter) {
            $.completedAfter = completedAfter;
            return this;
        }

        /**
         * @param completedAfter Retrieve requests completed after this time.
         * 
         * @return builder
         * 
         */
        public Builder completedAfter(String completedAfter) {
            return completedAfter(Output.of(completedAfter));
        }

        /**
         * @param completedBefore Retrieve requests completed before this time.
         * 
         * @return builder
         * 
         */
        public Builder completedBefore(@Nullable Output<String> completedBefore) {
            $.completedBefore = completedBefore;
            return this;
        }

        /**
         * @param completedBefore Retrieve requests completed before this time.
         * 
         * @return builder
         * 
         */
        public Builder completedBefore(String completedBefore) {
            return completedBefore(Output.of(completedBefore));
        }

        /**
         * @param createdAfter Retrieve requests created after this time.
         * 
         * @return builder
         * 
         */
        public Builder createdAfter(@Nullable Output<String> createdAfter) {
            $.createdAfter = createdAfter;
            return this;
        }

        /**
         * @param createdAfter Retrieve requests created after this time.
         * 
         * @return builder
         * 
         */
        public Builder createdAfter(String createdAfter) {
            return createdAfter(Output.of(createdAfter));
        }

        /**
         * @param createdBefore Retrieve requests created before this time.
         * 
         * @return builder
         * 
         */
        public Builder createdBefore(@Nullable Output<String> createdBefore) {
            $.createdBefore = createdBefore;
            return this;
        }

        /**
         * @param createdBefore Retrieve requests created before this time.
         * 
         * @return builder
         * 
         */
        public Builder createdBefore(String createdBefore) {
            return createdBefore(Output.of(createdBefore));
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(@Nullable Output<Integer> maxItems) {
            $.maxItems = maxItems;
            return this;
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(Integer maxItems) {
            return maxItems(Output.of(maxItems));
        }

        /**
         * @param page Page number of results.
         * 
         * @return builder
         * 
         */
        public Builder page(Output<Integer> page) {
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
        public Builder perPage(Output<Integer> perPage) {
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
         * @param requestType Requested information from request.
         * 
         * @return builder
         * 
         */
        public Builder requestType(@Nullable Output<String> requestType) {
            $.requestType = requestType;
            return this;
        }

        /**
         * @param requestType Requested information from request.
         * 
         * @return builder
         * 
         */
        public Builder requestType(String requestType) {
            return requestType(Output.of(requestType));
        }

        /**
         * @param sortBy Field to sort results by.
         * 
         * @return builder
         * 
         */
        public Builder sortBy(@Nullable Output<String> sortBy) {
            $.sortBy = sortBy;
            return this;
        }

        /**
         * @param sortBy Field to sort results by.
         * 
         * @return builder
         * 
         */
        public Builder sortBy(String sortBy) {
            return sortBy(Output.of(sortBy));
        }

        /**
         * @param sortOrder Sort order (asc or desc).
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(@Nullable Output<String> sortOrder) {
            $.sortOrder = sortOrder;
            return this;
        }

        /**
         * @param sortOrder Sort order (asc or desc).
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(String sortOrder) {
            return sortOrder(Output.of(sortOrder));
        }

        /**
         * @param status Request Status.
         * Available values: &#34;open&#34;, &#34;accepted&#34;, &#34;reported&#34;, &#34;approved&#34;, &#34;completed&#34;, &#34;declined&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Request Status.
         * Available values: &#34;open&#34;, &#34;accepted&#34;, &#34;reported&#34;, &#34;approved&#34;, &#34;completed&#34;, &#34;declined&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetCloudforceOneRequestsArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetCloudforceOneRequestsArgs", "accountId");
            }
            if ($.page == null) {
                throw new MissingRequiredPropertyException("GetCloudforceOneRequestsArgs", "page");
            }
            if ($.perPage == null) {
                throw new MissingRequiredPropertyException("GetCloudforceOneRequestsArgs", "perPage");
            }
            return $;
        }
    }

}
