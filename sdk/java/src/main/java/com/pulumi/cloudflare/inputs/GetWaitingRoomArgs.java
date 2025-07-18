// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWaitingRoomArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWaitingRoomArgs Empty = new GetWaitingRoomArgs();

    @Import(name="waitingRoomId")
    private @Nullable Output<String> waitingRoomId;

    public Optional<Output<String>> waitingRoomId() {
        return Optional.ofNullable(this.waitingRoomId);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetWaitingRoomArgs() {}

    private GetWaitingRoomArgs(GetWaitingRoomArgs $) {
        this.waitingRoomId = $.waitingRoomId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWaitingRoomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWaitingRoomArgs $;

        public Builder() {
            $ = new GetWaitingRoomArgs();
        }

        public Builder(GetWaitingRoomArgs defaults) {
            $ = new GetWaitingRoomArgs(Objects.requireNonNull(defaults));
        }

        public Builder waitingRoomId(@Nullable Output<String> waitingRoomId) {
            $.waitingRoomId = waitingRoomId;
            return this;
        }

        public Builder waitingRoomId(String waitingRoomId) {
            return waitingRoomId(Output.of(waitingRoomId));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetWaitingRoomArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetWaitingRoomArgs", "zoneId");
            }
            return $;
        }
    }

}
