// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZoneSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZoneSubscriptionArgs Empty = new GetZoneSubscriptionArgs();

    /**
     * Subscription identifier tag.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Subscription identifier tag.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetZoneSubscriptionArgs() {}

    private GetZoneSubscriptionArgs(GetZoneSubscriptionArgs $) {
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZoneSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZoneSubscriptionArgs $;

        public Builder() {
            $ = new GetZoneSubscriptionArgs();
        }

        public Builder(GetZoneSubscriptionArgs defaults) {
            $ = new GetZoneSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param zoneId Subscription identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Subscription identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetZoneSubscriptionArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetZoneSubscriptionArgs", "zoneId");
            }
            return $;
        }
    }

}
