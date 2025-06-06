// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkersRoutePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkersRoutePlainArgs Empty = new GetWorkersRoutePlainArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="routeId")
    private @Nullable String routeId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<String> routeId() {
        return Optional.ofNullable(this.routeId);
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

    private GetWorkersRoutePlainArgs() {}

    private GetWorkersRoutePlainArgs(GetWorkersRoutePlainArgs $) {
        this.routeId = $.routeId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkersRoutePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkersRoutePlainArgs $;

        public Builder() {
            $ = new GetWorkersRoutePlainArgs();
        }

        public Builder(GetWorkersRoutePlainArgs defaults) {
            $ = new GetWorkersRoutePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routeId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder routeId(@Nullable String routeId) {
            $.routeId = routeId;
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

        public GetWorkersRoutePlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetWorkersRoutePlainArgs", "zoneId");
            }
            return $;
        }
    }

}
