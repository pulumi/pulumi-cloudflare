// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudConnectorRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudConnectorRulesRuleArgs Empty = new CloudConnectorRulesRuleArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="expression")
    private @Nullable Output<String> expression;

    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Parameters of Cloud Connector Rule
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<CloudConnectorRulesRuleParametersArgs> parameters;

    /**
     * @return Parameters of Cloud Connector Rule
     * 
     */
    public Optional<Output<CloudConnectorRulesRuleParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Cloud Provider type
     * Available values: &#34;aws*s3&#34;, &#34;cloudflare*r2&#34;, &#34;gcp*storage&#34;, &#34;azure*storage&#34;.
     * 
     */
    @Import(name="provider")
    private @Nullable Output<String> provider;

    /**
     * @return Cloud Provider type
     * Available values: &#34;aws*s3&#34;, &#34;cloudflare*r2&#34;, &#34;gcp*storage&#34;, &#34;azure*storage&#34;.
     * 
     */
    public Optional<Output<String>> provider() {
        return Optional.ofNullable(this.provider);
    }

    private CloudConnectorRulesRuleArgs() {}

    private CloudConnectorRulesRuleArgs(CloudConnectorRulesRuleArgs $) {
        this.description = $.description;
        this.enabled = $.enabled;
        this.expression = $.expression;
        this.id = $.id;
        this.parameters = $.parameters;
        this.provider = $.provider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudConnectorRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudConnectorRulesRuleArgs $;

        public Builder() {
            $ = new CloudConnectorRulesRuleArgs();
        }

        public Builder(CloudConnectorRulesRuleArgs defaults) {
            $ = new CloudConnectorRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param parameters Parameters of Cloud Connector Rule
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<CloudConnectorRulesRuleParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters of Cloud Connector Rule
         * 
         * @return builder
         * 
         */
        public Builder parameters(CloudConnectorRulesRuleParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param provider Cloud Provider type
         * Available values: &#34;aws*s3&#34;, &#34;cloudflare*r2&#34;, &#34;gcp*storage&#34;, &#34;azure*storage&#34;.
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<String> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider Cloud Provider type
         * Available values: &#34;aws*s3&#34;, &#34;cloudflare*r2&#34;, &#34;gcp*storage&#34;, &#34;azure*storage&#34;.
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        public CloudConnectorRulesRuleArgs build() {
            return $;
        }
    }

}
