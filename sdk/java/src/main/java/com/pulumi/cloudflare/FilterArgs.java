// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * The filter expression. For more information, refer to [Expressions](https://developers.cloudflare.com/ruleset-engine/rules-language/expressions/).
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The filter expression. For more information, refer to [Expressions](https://developers.cloudflare.com/ruleset-engine/rules-language/expressions/).
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * Defines an identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Defines an identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private FilterArgs() {}

    private FilterArgs(FilterArgs $) {
        this.expression = $.expression;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterArgs $;

        public Builder() {
            $ = new FilterArgs();
        }

        public Builder(FilterArgs defaults) {
            $ = new FilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression The filter expression. For more information, refer to [Expressions](https://developers.cloudflare.com/ruleset-engine/rules-language/expressions/).
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The filter expression. For more information, refer to [Expressions](https://developers.cloudflare.com/ruleset-engine/rules-language/expressions/).
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param zoneId Defines an identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Defines an identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public FilterArgs build() {
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("FilterArgs", "expression");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("FilterArgs", "zoneId");
            }
            return $;
        }
    }

}
