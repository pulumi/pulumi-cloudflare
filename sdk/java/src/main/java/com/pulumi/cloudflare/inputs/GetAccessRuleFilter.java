// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetAccessRuleFilterConfiguration;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccessRuleFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessRuleFilter Empty = new GetAccessRuleFilter();

    @Import(name="configuration")
    private @Nullable GetAccessRuleFilterConfiguration configuration;

    public Optional<GetAccessRuleFilterConfiguration> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Defines the direction used to sort returned rules.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="direction")
    private @Nullable String direction;

    /**
     * @return Defines the direction used to sort returned rules.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Defines the search requirements. When set to `all`, all the search requirements must match. When set to `any`, only one of the search requirements has to match.
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    @Import(name="match", required=true)
    private String match;

    /**
     * @return Defines the search requirements. When set to `all`, all the search requirements must match. When set to `any`, only one of the search requirements has to match.
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    public String match() {
        return this.match;
    }

    /**
     * The action to apply to a matched request.
     * Available values: &#34;block&#34;, &#34;challenge&#34;, &#34;whitelist&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
     * 
     */
    @Import(name="mode")
    private @Nullable String mode;

    /**
     * @return The action to apply to a matched request.
     * Available values: &#34;block&#34;, &#34;challenge&#34;, &#34;whitelist&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Defines the string to search for in the notes of existing IP Access rules.
     * Notes: For example, the string &#39;attack&#39; would match IP Access rules with notes &#39;Attack 26/02&#39; and &#39;Attack 27/02&#39;. The search is case insensitive.
     * 
     */
    @Import(name="notes")
    private @Nullable String notes;

    /**
     * @return Defines the string to search for in the notes of existing IP Access rules.
     * Notes: For example, the string &#39;attack&#39; would match IP Access rules with notes &#39;Attack 26/02&#39; and &#39;Attack 27/02&#39;. The search is case insensitive.
     * 
     */
    public Optional<String> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * Defines the field used to sort returned rules.
     * Available values: &#34;configuration.target&#34;, &#34;configuration.value&#34;, &#34;mode&#34;.
     * 
     */
    @Import(name="order")
    private @Nullable String order;

    /**
     * @return Defines the field used to sort returned rules.
     * Available values: &#34;configuration.target&#34;, &#34;configuration.value&#34;, &#34;mode&#34;.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    private GetAccessRuleFilter() {}

    private GetAccessRuleFilter(GetAccessRuleFilter $) {
        this.configuration = $.configuration;
        this.direction = $.direction;
        this.match = $.match;
        this.mode = $.mode;
        this.notes = $.notes;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessRuleFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessRuleFilter $;

        public Builder() {
            $ = new GetAccessRuleFilter();
        }

        public Builder(GetAccessRuleFilter defaults) {
            $ = new GetAccessRuleFilter(Objects.requireNonNull(defaults));
        }

        public Builder configuration(@Nullable GetAccessRuleFilterConfiguration configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param direction Defines the direction used to sort returned rules.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable String direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param match Defines the search requirements. When set to `all`, all the search requirements must match. When set to `any`, only one of the search requirements has to match.
         * Available values: &#34;any&#34;, &#34;all&#34;.
         * 
         * @return builder
         * 
         */
        public Builder match(String match) {
            $.match = match;
            return this;
        }

        /**
         * @param mode The action to apply to a matched request.
         * Available values: &#34;block&#34;, &#34;challenge&#34;, &#34;whitelist&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param notes Defines the string to search for in the notes of existing IP Access rules.
         * Notes: For example, the string &#39;attack&#39; would match IP Access rules with notes &#39;Attack 26/02&#39; and &#39;Attack 27/02&#39;. The search is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable String notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param order Defines the field used to sort returned rules.
         * Available values: &#34;configuration.target&#34;, &#34;configuration.value&#34;, &#34;mode&#34;.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        public GetAccessRuleFilter build() {
            if ($.match == null) {
                throw new MissingRequiredPropertyException("GetAccessRuleFilter", "match");
            }
            return $;
        }
    }

}
