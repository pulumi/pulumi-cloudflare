// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetWorkersKvNamespacesResult;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkersKvNamespacesInvokeResult {
    /**
     * @return Identifier
     * 
     */
    private String accountId;
    /**
     * @return Direction to order namespaces.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    private @Nullable String direction;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    private @Nullable Integer maxItems;
    /**
     * @return Field to order results by.
     * Available values: &#34;id&#34;, &#34;title&#34;.
     * 
     */
    private @Nullable String order;
    /**
     * @return The items returned by the data source
     * 
     */
    private List<GetWorkersKvNamespacesResult> results;

    private GetWorkersKvNamespacesInvokeResult() {}
    /**
     * @return Identifier
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Direction to order namespaces.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Integer> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }
    /**
     * @return Field to order results by.
     * Available values: &#34;id&#34;, &#34;title&#34;.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return The items returned by the data source
     * 
     */
    public List<GetWorkersKvNamespacesResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkersKvNamespacesInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private @Nullable String direction;
        private String id;
        private @Nullable Integer maxItems;
        private @Nullable String order;
        private List<GetWorkersKvNamespacesResult> results;
        public Builder() {}
        public Builder(GetWorkersKvNamespacesInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.direction = defaults.direction;
    	      this.id = defaults.id;
    	      this.maxItems = defaults.maxItems;
    	      this.order = defaults.order;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetWorkersKvNamespacesInvokeResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWorkersKvNamespacesInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxItems(@Nullable Integer maxItems) {

            this.maxItems = maxItems;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetWorkersKvNamespacesResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetWorkersKvNamespacesInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetWorkersKvNamespacesResult... results) {
            return results(List.of(results));
        }
        public GetWorkersKvNamespacesInvokeResult build() {
            final var _resultValue = new GetWorkersKvNamespacesInvokeResult();
            _resultValue.accountId = accountId;
            _resultValue.direction = direction;
            _resultValue.id = id;
            _resultValue.maxItems = maxItems;
            _resultValue.order = order;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
