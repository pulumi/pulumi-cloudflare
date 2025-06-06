// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetEmailRoutingAddressFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEmailRoutingAddressFilterArgs Empty = new GetEmailRoutingAddressFilterArgs();

    /**
     * Sorts results in an ascending or descending order.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="direction", required=true)
    private Output<String> direction;

    /**
     * @return Sorts results in an ascending or descending order.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }

    /**
     * Filter by verified destination addresses.
     * 
     */
    @Import(name="verified", required=true)
    private Output<Boolean> verified;

    /**
     * @return Filter by verified destination addresses.
     * 
     */
    public Output<Boolean> verified() {
        return this.verified;
    }

    private GetEmailRoutingAddressFilterArgs() {}

    private GetEmailRoutingAddressFilterArgs(GetEmailRoutingAddressFilterArgs $) {
        this.direction = $.direction;
        this.verified = $.verified;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEmailRoutingAddressFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEmailRoutingAddressFilterArgs $;

        public Builder() {
            $ = new GetEmailRoutingAddressFilterArgs();
        }

        public Builder(GetEmailRoutingAddressFilterArgs defaults) {
            $ = new GetEmailRoutingAddressFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Sorts results in an ascending or descending order.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Sorts results in an ascending or descending order.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param verified Filter by verified destination addresses.
         * 
         * @return builder
         * 
         */
        public Builder verified(Output<Boolean> verified) {
            $.verified = verified;
            return this;
        }

        /**
         * @param verified Filter by verified destination addresses.
         * 
         * @return builder
         * 
         */
        public Builder verified(Boolean verified) {
            return verified(Output.of(verified));
        }

        public GetEmailRoutingAddressFilterArgs build() {
            if ($.direction == null) {
                throw new MissingRequiredPropertyException("GetEmailRoutingAddressFilterArgs", "direction");
            }
            if ($.verified == null) {
                throw new MissingRequiredPropertyException("GetEmailRoutingAddressFilterArgs", "verified");
            }
            return $;
        }
    }

}
