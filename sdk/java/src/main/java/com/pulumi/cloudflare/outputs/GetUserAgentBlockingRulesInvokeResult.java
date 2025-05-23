// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetUserAgentBlockingRulesResult;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserAgentBlockingRulesInvokeResult {
    /**
     * @return A string to search for in the description of existing rules.
     * 
     */
    private @Nullable String description;
    /**
     * @return A string to search for in the description of existing rules.
     * 
     */
    private @Nullable String descriptionSearch;
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
     * @return The items returned by the data source
     * 
     */
    private List<GetUserAgentBlockingRulesResult> results;
    /**
     * @return A string to search for in the user agent values of existing rules.
     * 
     */
    private @Nullable String uaSearch;
    /**
     * @return Defines an identifier.
     * 
     */
    private String zoneId;

    private GetUserAgentBlockingRulesInvokeResult() {}
    /**
     * @return A string to search for in the description of existing rules.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A string to search for in the description of existing rules.
     * 
     */
    public Optional<String> descriptionSearch() {
        return Optional.ofNullable(this.descriptionSearch);
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
     * @return The items returned by the data source
     * 
     */
    public List<GetUserAgentBlockingRulesResult> results() {
        return this.results;
    }
    /**
     * @return A string to search for in the user agent values of existing rules.
     * 
     */
    public Optional<String> uaSearch() {
        return Optional.ofNullable(this.uaSearch);
    }
    /**
     * @return Defines an identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserAgentBlockingRulesInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String descriptionSearch;
        private String id;
        private @Nullable Integer maxItems;
        private List<GetUserAgentBlockingRulesResult> results;
        private @Nullable String uaSearch;
        private String zoneId;
        public Builder() {}
        public Builder(GetUserAgentBlockingRulesInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.descriptionSearch = defaults.descriptionSearch;
    	      this.id = defaults.id;
    	      this.maxItems = defaults.maxItems;
    	      this.results = defaults.results;
    	      this.uaSearch = defaults.uaSearch;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder descriptionSearch(@Nullable String descriptionSearch) {

            this.descriptionSearch = descriptionSearch;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUserAgentBlockingRulesInvokeResult", "id");
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
        public Builder results(List<GetUserAgentBlockingRulesResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetUserAgentBlockingRulesInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetUserAgentBlockingRulesResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder uaSearch(@Nullable String uaSearch) {

            this.uaSearch = uaSearch;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetUserAgentBlockingRulesInvokeResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetUserAgentBlockingRulesInvokeResult build() {
            final var _resultValue = new GetUserAgentBlockingRulesInvokeResult();
            _resultValue.description = description;
            _resultValue.descriptionSearch = descriptionSearch;
            _resultValue.id = id;
            _resultValue.maxItems = maxItems;
            _resultValue.results = results;
            _resultValue.uaSearch = uaSearch;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
