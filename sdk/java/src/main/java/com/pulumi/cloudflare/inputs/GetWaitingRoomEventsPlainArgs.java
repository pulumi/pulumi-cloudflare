// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWaitingRoomEventsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWaitingRoomEventsPlainArgs Empty = new GetWaitingRoomEventsPlainArgs();

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

    @Import(name="waitingRoomId", required=true)
    private String waitingRoomId;

    public String waitingRoomId() {
        return this.waitingRoomId;
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private String zoneId;

    /**
     * @return Identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    private GetWaitingRoomEventsPlainArgs() {}

    private GetWaitingRoomEventsPlainArgs(GetWaitingRoomEventsPlainArgs $) {
        this.maxItems = $.maxItems;
        this.waitingRoomId = $.waitingRoomId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWaitingRoomEventsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWaitingRoomEventsPlainArgs $;

        public Builder() {
            $ = new GetWaitingRoomEventsPlainArgs();
        }

        public Builder(GetWaitingRoomEventsPlainArgs defaults) {
            $ = new GetWaitingRoomEventsPlainArgs(Objects.requireNonNull(defaults));
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

        public Builder waitingRoomId(String waitingRoomId) {
            $.waitingRoomId = waitingRoomId;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetWaitingRoomEventsPlainArgs build() {
            if ($.waitingRoomId == null) {
                throw new MissingRequiredPropertyException("GetWaitingRoomEventsPlainArgs", "waitingRoomId");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetWaitingRoomEventsPlainArgs", "zoneId");
            }
            return $;
        }
    }

}
