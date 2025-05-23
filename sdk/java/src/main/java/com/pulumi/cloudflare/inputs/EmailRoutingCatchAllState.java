// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.EmailRoutingCatchAllActionArgs;
import com.pulumi.cloudflare.inputs.EmailRoutingCatchAllMatcherArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailRoutingCatchAllState extends com.pulumi.resources.ResourceArgs {

    public static final EmailRoutingCatchAllState Empty = new EmailRoutingCatchAllState();

    /**
     * List actions for the catch-all routing rule.
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<EmailRoutingCatchAllActionArgs>> actions;

    /**
     * @return List actions for the catch-all routing rule.
     * 
     */
    public Optional<Output<List<EmailRoutingCatchAllActionArgs>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    /**
     * Routing rule status.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Routing rule status.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * List of matchers for the catch-all routing rule.
     * 
     */
    @Import(name="matchers")
    private @Nullable Output<List<EmailRoutingCatchAllMatcherArgs>> matchers;

    /**
     * @return List of matchers for the catch-all routing rule.
     * 
     */
    public Optional<Output<List<EmailRoutingCatchAllMatcherArgs>>> matchers() {
        return Optional.ofNullable(this.matchers);
    }

    /**
     * Routing rule name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Routing rule name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Routing rule tag. (Deprecated, replaced by routing rule identifier)
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Routing rule tag. (Deprecated, replaced by routing rule identifier)
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
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

    private EmailRoutingCatchAllState() {}

    private EmailRoutingCatchAllState(EmailRoutingCatchAllState $) {
        this.actions = $.actions;
        this.enabled = $.enabled;
        this.matchers = $.matchers;
        this.name = $.name;
        this.tag = $.tag;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailRoutingCatchAllState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailRoutingCatchAllState $;

        public Builder() {
            $ = new EmailRoutingCatchAllState();
        }

        public Builder(EmailRoutingCatchAllState defaults) {
            $ = new EmailRoutingCatchAllState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions List actions for the catch-all routing rule.
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<List<EmailRoutingCatchAllActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions List actions for the catch-all routing rule.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<EmailRoutingCatchAllActionArgs> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions List actions for the catch-all routing rule.
         * 
         * @return builder
         * 
         */
        public Builder actions(EmailRoutingCatchAllActionArgs... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param enabled Routing rule status.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Routing rule status.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param matchers List of matchers for the catch-all routing rule.
         * 
         * @return builder
         * 
         */
        public Builder matchers(@Nullable Output<List<EmailRoutingCatchAllMatcherArgs>> matchers) {
            $.matchers = matchers;
            return this;
        }

        /**
         * @param matchers List of matchers for the catch-all routing rule.
         * 
         * @return builder
         * 
         */
        public Builder matchers(List<EmailRoutingCatchAllMatcherArgs> matchers) {
            return matchers(Output.of(matchers));
        }

        /**
         * @param matchers List of matchers for the catch-all routing rule.
         * 
         * @return builder
         * 
         */
        public Builder matchers(EmailRoutingCatchAllMatcherArgs... matchers) {
            return matchers(List.of(matchers));
        }

        /**
         * @param name Routing rule name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Routing rule name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tag Routing rule tag. (Deprecated, replaced by routing rule identifier)
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated.
         * 
         */
        @Deprecated /* This attribute is deprecated. */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Routing rule tag. (Deprecated, replaced by routing rule identifier)
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated.
         * 
         */
        @Deprecated /* This attribute is deprecated. */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
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

        public EmailRoutingCatchAllState build() {
            return $;
        }
    }

}
