// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCustomHostnameFallbackOriginArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomHostnameFallbackOriginArgs Empty = new GetCustomHostnameFallbackOriginArgs();

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

    private GetCustomHostnameFallbackOriginArgs() {}

    private GetCustomHostnameFallbackOriginArgs(GetCustomHostnameFallbackOriginArgs $) {
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomHostnameFallbackOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomHostnameFallbackOriginArgs $;

        public Builder() {
            $ = new GetCustomHostnameFallbackOriginArgs();
        }

        public Builder(GetCustomHostnameFallbackOriginArgs defaults) {
            $ = new GetCustomHostnameFallbackOriginArgs(Objects.requireNonNull(defaults));
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

        public GetCustomHostnameFallbackOriginArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetCustomHostnameFallbackOriginArgs", "zoneId");
            }
            return $;
        }
    }

}
