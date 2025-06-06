// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudConnectorRulesState extends com.pulumi.resources.ResourceArgs {

    public static final CloudConnectorRulesState Empty = new CloudConnectorRulesState();

    @Import(name="rules")
    private @Nullable Output<List<CloudConnectorRulesRuleArgs>> rules;

    public Optional<Output<List<CloudConnectorRulesRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private CloudConnectorRulesState() {}

    private CloudConnectorRulesState(CloudConnectorRulesState $) {
        this.rules = $.rules;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudConnectorRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudConnectorRulesState $;

        public Builder() {
            $ = new CloudConnectorRulesState();
        }

        public Builder(CloudConnectorRulesState defaults) {
            $ = new CloudConnectorRulesState(Objects.requireNonNull(defaults));
        }

        public Builder rules(@Nullable Output<List<CloudConnectorRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<CloudConnectorRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(CloudConnectorRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
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

        public CloudConnectorRulesState build() {
            return $;
        }
    }

}
