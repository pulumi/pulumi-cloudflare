// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetZoneDnssecPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZoneDnssecPlainArgs Empty = new GetZoneDnssecPlainArgs();

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

    private GetZoneDnssecPlainArgs() {}

    private GetZoneDnssecPlainArgs(GetZoneDnssecPlainArgs $) {
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZoneDnssecPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZoneDnssecPlainArgs $;

        public Builder() {
            $ = new GetZoneDnssecPlainArgs();
        }

        public Builder(GetZoneDnssecPlainArgs defaults) {
            $ = new GetZoneDnssecPlainArgs(Objects.requireNonNull(defaults));
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

        public GetZoneDnssecPlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetZoneDnssecPlainArgs", "zoneId");
            }
            return $;
        }
    }

}
