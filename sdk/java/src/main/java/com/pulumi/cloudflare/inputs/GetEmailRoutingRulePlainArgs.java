// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetEmailRoutingRuleFilter;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEmailRoutingRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEmailRoutingRulePlainArgs Empty = new GetEmailRoutingRulePlainArgs();

    @Import(name="filter")
    private @Nullable GetEmailRoutingRuleFilter filter;

    public Optional<GetEmailRoutingRuleFilter> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Routing rule identifier.
     * 
     */
    @Import(name="ruleIdentifier")
    private @Nullable String ruleIdentifier;

    /**
     * @return Routing rule identifier.
     * 
     */
    public Optional<String> ruleIdentifier() {
        return Optional.ofNullable(this.ruleIdentifier);
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

    private GetEmailRoutingRulePlainArgs() {}

    private GetEmailRoutingRulePlainArgs(GetEmailRoutingRulePlainArgs $) {
        this.filter = $.filter;
        this.ruleIdentifier = $.ruleIdentifier;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEmailRoutingRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEmailRoutingRulePlainArgs $;

        public Builder() {
            $ = new GetEmailRoutingRulePlainArgs();
        }

        public Builder(GetEmailRoutingRulePlainArgs defaults) {
            $ = new GetEmailRoutingRulePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable GetEmailRoutingRuleFilter filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param ruleIdentifier Routing rule identifier.
         * 
         * @return builder
         * 
         */
        public Builder ruleIdentifier(@Nullable String ruleIdentifier) {
            $.ruleIdentifier = ruleIdentifier;
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

        public GetEmailRoutingRulePlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetEmailRoutingRulePlainArgs", "zoneId");
            }
            return $;
        }
    }

}
