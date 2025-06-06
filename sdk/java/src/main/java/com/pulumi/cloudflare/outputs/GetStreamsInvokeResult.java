// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetStreamsResult;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStreamsInvokeResult {
    /**
     * @return The account identifier tag.
     * 
     */
    private String accountId;
    /**
     * @return Lists videos in ascending order of creation.
     * 
     */
    private Boolean asc;
    /**
     * @return A user-defined identifier for the media creator.
     * 
     */
    private @Nullable String creator;
    /**
     * @return Lists videos created before the specified date.
     * 
     */
    private @Nullable String end;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Includes the total number of videos associated with the submitted query parameters.
     * 
     */
    private Boolean includeCounts;
    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    private @Nullable Integer maxItems;
    /**
     * @return The items returned by the data source
     * 
     */
    private List<GetStreamsResult> results;
    /**
     * @return Searches over the `name` key in the `meta` field. This field can be set with or after the upload request.
     * 
     */
    private @Nullable String search;
    /**
     * @return Lists videos created after the specified date.
     * 
     */
    private @Nullable String start;
    /**
     * @return Specifies the processing status for all quality levels for a video.
     * Available values: &#34;pendingupload&#34;, &#34;downloading&#34;, &#34;queued&#34;, &#34;inprogress&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    private @Nullable String status;
    /**
     * @return Specifies whether the video is `vod` or `live`.
     * 
     */
    private @Nullable String type;

    private GetStreamsInvokeResult() {}
    /**
     * @return The account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Lists videos in ascending order of creation.
     * 
     */
    public Boolean asc() {
        return this.asc;
    }
    /**
     * @return A user-defined identifier for the media creator.
     * 
     */
    public Optional<String> creator() {
        return Optional.ofNullable(this.creator);
    }
    /**
     * @return Lists videos created before the specified date.
     * 
     */
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Includes the total number of videos associated with the submitted query parameters.
     * 
     */
    public Boolean includeCounts() {
        return this.includeCounts;
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
    public List<GetStreamsResult> results() {
        return this.results;
    }
    /**
     * @return Searches over the `name` key in the `meta` field. This field can be set with or after the upload request.
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }
    /**
     * @return Lists videos created after the specified date.
     * 
     */
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }
    /**
     * @return Specifies the processing status for all quality levels for a video.
     * Available values: &#34;pendingupload&#34;, &#34;downloading&#34;, &#34;queued&#34;, &#34;inprogress&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Specifies whether the video is `vod` or `live`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private Boolean asc;
        private @Nullable String creator;
        private @Nullable String end;
        private String id;
        private Boolean includeCounts;
        private @Nullable Integer maxItems;
        private List<GetStreamsResult> results;
        private @Nullable String search;
        private @Nullable String start;
        private @Nullable String status;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetStreamsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.asc = defaults.asc;
    	      this.creator = defaults.creator;
    	      this.end = defaults.end;
    	      this.id = defaults.id;
    	      this.includeCounts = defaults.includeCounts;
    	      this.maxItems = defaults.maxItems;
    	      this.results = defaults.results;
    	      this.search = defaults.search;
    	      this.start = defaults.start;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetStreamsInvokeResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder asc(Boolean asc) {
            if (asc == null) {
              throw new MissingRequiredPropertyException("GetStreamsInvokeResult", "asc");
            }
            this.asc = asc;
            return this;
        }
        @CustomType.Setter
        public Builder creator(@Nullable String creator) {

            this.creator = creator;
            return this;
        }
        @CustomType.Setter
        public Builder end(@Nullable String end) {

            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStreamsInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includeCounts(Boolean includeCounts) {
            if (includeCounts == null) {
              throw new MissingRequiredPropertyException("GetStreamsInvokeResult", "includeCounts");
            }
            this.includeCounts = includeCounts;
            return this;
        }
        @CustomType.Setter
        public Builder maxItems(@Nullable Integer maxItems) {

            this.maxItems = maxItems;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetStreamsResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetStreamsInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetStreamsResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder search(@Nullable String search) {

            this.search = search;
            return this;
        }
        @CustomType.Setter
        public Builder start(@Nullable String start) {

            this.start = start;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetStreamsInvokeResult build() {
            final var _resultValue = new GetStreamsInvokeResult();
            _resultValue.accountId = accountId;
            _resultValue.asc = asc;
            _resultValue.creator = creator;
            _resultValue.end = end;
            _resultValue.id = id;
            _resultValue.includeCounts = includeCounts;
            _resultValue.maxItems = maxItems;
            _resultValue.results = results;
            _resultValue.search = search;
            _resultValue.start = start;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
