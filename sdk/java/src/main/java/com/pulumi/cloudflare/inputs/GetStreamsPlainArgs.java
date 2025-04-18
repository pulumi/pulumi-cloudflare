// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStreamsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamsPlainArgs Empty = new GetStreamsPlainArgs();

    /**
     * The account identifier tag.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Lists videos in ascending order of creation.
     * 
     */
    @Import(name="asc")
    private @Nullable Boolean asc;

    /**
     * @return Lists videos in ascending order of creation.
     * 
     */
    public Optional<Boolean> asc() {
        return Optional.ofNullable(this.asc);
    }

    /**
     * A user-defined identifier for the media creator.
     * 
     */
    @Import(name="creator")
    private @Nullable String creator;

    /**
     * @return A user-defined identifier for the media creator.
     * 
     */
    public Optional<String> creator() {
        return Optional.ofNullable(this.creator);
    }

    /**
     * Lists videos created before the specified date.
     * 
     */
    @Import(name="end")
    private @Nullable String end;

    /**
     * @return Lists videos created before the specified date.
     * 
     */
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * Includes the total number of videos associated with the submitted query parameters.
     * 
     */
    @Import(name="includeCounts")
    private @Nullable Boolean includeCounts;

    /**
     * @return Includes the total number of videos associated with the submitted query parameters.
     * 
     */
    public Optional<Boolean> includeCounts() {
        return Optional.ofNullable(this.includeCounts);
    }

    /**
     * Max items to fetch, default: 1000
     * 
     */
    @Import(name="maxItems")
    private @Nullable Integer maxItems;

    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Integer> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }

    /**
     * Searches over the `name` key in the `meta` field. This field can be set with or after the upload request.
     * 
     */
    @Import(name="search")
    private @Nullable String search;

    /**
     * @return Searches over the `name` key in the `meta` field. This field can be set with or after the upload request.
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }

    /**
     * Lists videos created after the specified date.
     * 
     */
    @Import(name="start")
    private @Nullable String start;

    /**
     * @return Lists videos created after the specified date.
     * 
     */
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }

    /**
     * Specifies the processing status for all quality levels for a video.
     * Available values: &#34;pendingupload&#34;, &#34;downloading&#34;, &#34;queued&#34;, &#34;inprogress&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Specifies the processing status for all quality levels for a video.
     * Available values: &#34;pendingupload&#34;, &#34;downloading&#34;, &#34;queued&#34;, &#34;inprogress&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Specifies whether the video is `vod` or `live`.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Specifies whether the video is `vod` or `live`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetStreamsPlainArgs() {}

    private GetStreamsPlainArgs(GetStreamsPlainArgs $) {
        this.accountId = $.accountId;
        this.asc = $.asc;
        this.creator = $.creator;
        this.end = $.end;
        this.includeCounts = $.includeCounts;
        this.maxItems = $.maxItems;
        this.search = $.search;
        this.start = $.start;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamsPlainArgs $;

        public Builder() {
            $ = new GetStreamsPlainArgs();
        }

        public Builder(GetStreamsPlainArgs defaults) {
            $ = new GetStreamsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param asc Lists videos in ascending order of creation.
         * 
         * @return builder
         * 
         */
        public Builder asc(@Nullable Boolean asc) {
            $.asc = asc;
            return this;
        }

        /**
         * @param creator A user-defined identifier for the media creator.
         * 
         * @return builder
         * 
         */
        public Builder creator(@Nullable String creator) {
            $.creator = creator;
            return this;
        }

        /**
         * @param end Lists videos created before the specified date.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable String end) {
            $.end = end;
            return this;
        }

        /**
         * @param includeCounts Includes the total number of videos associated with the submitted query parameters.
         * 
         * @return builder
         * 
         */
        public Builder includeCounts(@Nullable Boolean includeCounts) {
            $.includeCounts = includeCounts;
            return this;
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(@Nullable Integer maxItems) {
            $.maxItems = maxItems;
            return this;
        }

        /**
         * @param search Searches over the `name` key in the `meta` field. This field can be set with or after the upload request.
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable String search) {
            $.search = search;
            return this;
        }

        /**
         * @param start Lists videos created after the specified date.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable String start) {
            $.start = start;
            return this;
        }

        /**
         * @param status Specifies the processing status for all quality levels for a video.
         * Available values: &#34;pendingupload&#34;, &#34;downloading&#34;, &#34;queued&#34;, &#34;inprogress&#34;, &#34;ready&#34;, &#34;error&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param type Specifies whether the video is `vod` or `live`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetStreamsPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetStreamsPlainArgs", "accountId");
            }
            return $;
        }
    }

}
