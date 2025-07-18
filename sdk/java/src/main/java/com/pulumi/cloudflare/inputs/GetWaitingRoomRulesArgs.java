// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWaitingRoomRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWaitingRoomRulesArgs Empty = new GetWaitingRoomRulesArgs();

    @Import(name="waitingRoomId", required=true)
    private Output<String> waitingRoomId;

    public Output<String> waitingRoomId() {
        return this.waitingRoomId;
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

    private GetWaitingRoomRulesArgs() {}

    private GetWaitingRoomRulesArgs(GetWaitingRoomRulesArgs $) {
        this.waitingRoomId = $.waitingRoomId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWaitingRoomRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWaitingRoomRulesArgs $;

        public Builder() {
            $ = new GetWaitingRoomRulesArgs();
        }

        public Builder(GetWaitingRoomRulesArgs defaults) {
            $ = new GetWaitingRoomRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder waitingRoomId(Output<String> waitingRoomId) {
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

        public GetWaitingRoomRulesArgs build() {
            if ($.waitingRoomId == null) {
                throw new MissingRequiredPropertyException("GetWaitingRoomRulesArgs", "waitingRoomId");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetWaitingRoomRulesArgs", "zoneId");
            }
            return $;
        }
    }

}
