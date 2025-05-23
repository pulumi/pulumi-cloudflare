// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.RulesetRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetArgs Empty = new RulesetArgs();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * An informative description of the ruleset.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An informative description of the ruleset.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The kind of the ruleset.
     * Available values: &#34;managed&#34;, &#34;custom&#34;, &#34;root&#34;, &#34;zone&#34;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the ruleset.
     * Available values: &#34;managed&#34;, &#34;custom&#34;, &#34;root&#34;, &#34;zone&#34;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The human-readable name of the ruleset.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The human-readable name of the ruleset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The phase of the ruleset.
     * Available values: &#34;ddos*l4&#34;, &#34;ddos*l7&#34;, &#34;http*config*settings&#34;, &#34;http*custom*errors&#34;, &#34;http*log*custom*fields&#34;, &#34;http*ratelimit&#34;, &#34;http*request*cache*settings&#34;, &#34;http*request*dynamic*redirect&#34;, &#34;http*request*firewall*custom&#34;, &#34;http*request*firewall*managed&#34;, &#34;http*request*late*transform&#34;, &#34;http*request*origin&#34;, &#34;http*request*redirect&#34;, &#34;http*request*sanitize&#34;, &#34;http*request*sbfm&#34;, &#34;http*request*transform&#34;, &#34;http*response*compression&#34;, &#34;http*response*firewall*managed&#34;, &#34;http*response*headers*transform&#34;, &#34;magic*transit&#34;, &#34;magic*transit*ids*managed&#34;, &#34;magic*transit*managed&#34;, &#34;magic*transit_ratelimit&#34;.
     * 
     */
    @Import(name="phase", required=true)
    private Output<String> phase;

    /**
     * @return The phase of the ruleset.
     * Available values: &#34;ddos*l4&#34;, &#34;ddos*l7&#34;, &#34;http*config*settings&#34;, &#34;http*custom*errors&#34;, &#34;http*log*custom*fields&#34;, &#34;http*ratelimit&#34;, &#34;http*request*cache*settings&#34;, &#34;http*request*dynamic*redirect&#34;, &#34;http*request*firewall*custom&#34;, &#34;http*request*firewall*managed&#34;, &#34;http*request*late*transform&#34;, &#34;http*request*origin&#34;, &#34;http*request*redirect&#34;, &#34;http*request*sanitize&#34;, &#34;http*request*sbfm&#34;, &#34;http*request*transform&#34;, &#34;http*response*compression&#34;, &#34;http*response*firewall*managed&#34;, &#34;http*response*headers*transform&#34;, &#34;magic*transit&#34;, &#34;magic*transit*ids*managed&#34;, &#34;magic*transit*managed&#34;, &#34;magic*transit_ratelimit&#34;.
     * 
     */
    public Output<String> phase() {
        return this.phase;
    }

    /**
     * The list of rules in the ruleset.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RulesetRuleArgs>> rules;

    /**
     * @return The list of rules in the ruleset.
     * 
     */
    public Optional<Output<List<RulesetRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private RulesetArgs() {}

    private RulesetArgs(RulesetArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.kind = $.kind;
        this.name = $.name;
        this.phase = $.phase;
        this.rules = $.rules;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetArgs $;

        public Builder() {
            $ = new RulesetArgs();
        }

        public Builder(RulesetArgs defaults) {
            $ = new RulesetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description An informative description of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An informative description of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param kind The kind of the ruleset.
         * Available values: &#34;managed&#34;, &#34;custom&#34;, &#34;root&#34;, &#34;zone&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the ruleset.
         * Available values: &#34;managed&#34;, &#34;custom&#34;, &#34;root&#34;, &#34;zone&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name The human-readable name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The human-readable name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param phase The phase of the ruleset.
         * Available values: &#34;ddos*l4&#34;, &#34;ddos*l7&#34;, &#34;http*config*settings&#34;, &#34;http*custom*errors&#34;, &#34;http*log*custom*fields&#34;, &#34;http*ratelimit&#34;, &#34;http*request*cache*settings&#34;, &#34;http*request*dynamic*redirect&#34;, &#34;http*request*firewall*custom&#34;, &#34;http*request*firewall*managed&#34;, &#34;http*request*late*transform&#34;, &#34;http*request*origin&#34;, &#34;http*request*redirect&#34;, &#34;http*request*sanitize&#34;, &#34;http*request*sbfm&#34;, &#34;http*request*transform&#34;, &#34;http*response*compression&#34;, &#34;http*response*firewall*managed&#34;, &#34;http*response*headers*transform&#34;, &#34;magic*transit&#34;, &#34;magic*transit*ids*managed&#34;, &#34;magic*transit*managed&#34;, &#34;magic*transit_ratelimit&#34;.
         * 
         * @return builder
         * 
         */
        public Builder phase(Output<String> phase) {
            $.phase = phase;
            return this;
        }

        /**
         * @param phase The phase of the ruleset.
         * Available values: &#34;ddos*l4&#34;, &#34;ddos*l7&#34;, &#34;http*config*settings&#34;, &#34;http*custom*errors&#34;, &#34;http*log*custom*fields&#34;, &#34;http*ratelimit&#34;, &#34;http*request*cache*settings&#34;, &#34;http*request*dynamic*redirect&#34;, &#34;http*request*firewall*custom&#34;, &#34;http*request*firewall*managed&#34;, &#34;http*request*late*transform&#34;, &#34;http*request*origin&#34;, &#34;http*request*redirect&#34;, &#34;http*request*sanitize&#34;, &#34;http*request*sbfm&#34;, &#34;http*request*transform&#34;, &#34;http*response*compression&#34;, &#34;http*response*firewall*managed&#34;, &#34;http*response*headers*transform&#34;, &#34;magic*transit&#34;, &#34;magic*transit*ids*managed&#34;, &#34;magic*transit*managed&#34;, &#34;magic*transit_ratelimit&#34;.
         * 
         * @return builder
         * 
         */
        public Builder phase(String phase) {
            return phase(Output.of(phase));
        }

        /**
         * @param rules The list of rules in the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RulesetRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules The list of rules in the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RulesetRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules The list of rules in the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(RulesetRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public RulesetArgs build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("RulesetArgs", "kind");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("RulesetArgs", "name");
            }
            if ($.phase == null) {
                throw new MissingRequiredPropertyException("RulesetArgs", "phase");
            }
            return $;
        }
    }

}
