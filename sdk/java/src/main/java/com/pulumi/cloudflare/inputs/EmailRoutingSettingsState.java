// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailRoutingSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final EmailRoutingSettingsState Empty = new EmailRoutingSettingsState();

    /**
     * The date and time the settings have been created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The date and time the settings have been created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * State of the zone settings for Email Routing.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return State of the zone settings for Email Routing.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The date and time the settings have been modified.
     * 
     */
    @Import(name="modified")
    private @Nullable Output<String> modified;

    /**
     * @return The date and time the settings have been modified.
     * 
     */
    public Optional<Output<String>> modified() {
        return Optional.ofNullable(this.modified);
    }

    /**
     * Domain of your zone.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Domain of your zone.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Flag to check if the user skipped the configuration wizard.
     * 
     */
    @Import(name="skipWizard")
    private @Nullable Output<Boolean> skipWizard;

    /**
     * @return Flag to check if the user skipped the configuration wizard.
     * 
     */
    public Optional<Output<Boolean>> skipWizard() {
        return Optional.ofNullable(this.skipWizard);
    }

    /**
     * Show the state of your account, and the type or configuration error.
     * Available values: &#34;ready&#34;, &#34;unconfigured&#34;, &#34;misconfigured&#34;, &#34;misconfigured/locked&#34;, &#34;unlocked&#34;.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Show the state of your account, and the type or configuration error.
     * Available values: &#34;ready&#34;, &#34;unconfigured&#34;, &#34;misconfigured&#34;, &#34;misconfigured/locked&#34;, &#34;unlocked&#34;.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Email Routing settings tag. (Deprecated, replaced by Email Routing settings identifier)
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Email Routing settings tag. (Deprecated, replaced by Email Routing settings identifier)
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

    private EmailRoutingSettingsState() {}

    private EmailRoutingSettingsState(EmailRoutingSettingsState $) {
        this.created = $.created;
        this.enabled = $.enabled;
        this.modified = $.modified;
        this.name = $.name;
        this.skipWizard = $.skipWizard;
        this.status = $.status;
        this.tag = $.tag;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailRoutingSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailRoutingSettingsState $;

        public Builder() {
            $ = new EmailRoutingSettingsState();
        }

        public Builder(EmailRoutingSettingsState defaults) {
            $ = new EmailRoutingSettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param created The date and time the settings have been created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The date and time the settings have been created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param enabled State of the zone settings for Email Routing.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled State of the zone settings for Email Routing.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param modified The date and time the settings have been modified.
         * 
         * @return builder
         * 
         */
        public Builder modified(@Nullable Output<String> modified) {
            $.modified = modified;
            return this;
        }

        /**
         * @param modified The date and time the settings have been modified.
         * 
         * @return builder
         * 
         */
        public Builder modified(String modified) {
            return modified(Output.of(modified));
        }

        /**
         * @param name Domain of your zone.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Domain of your zone.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param skipWizard Flag to check if the user skipped the configuration wizard.
         * 
         * @return builder
         * 
         */
        public Builder skipWizard(@Nullable Output<Boolean> skipWizard) {
            $.skipWizard = skipWizard;
            return this;
        }

        /**
         * @param skipWizard Flag to check if the user skipped the configuration wizard.
         * 
         * @return builder
         * 
         */
        public Builder skipWizard(Boolean skipWizard) {
            return skipWizard(Output.of(skipWizard));
        }

        /**
         * @param status Show the state of your account, and the type or configuration error.
         * Available values: &#34;ready&#34;, &#34;unconfigured&#34;, &#34;misconfigured&#34;, &#34;misconfigured/locked&#34;, &#34;unlocked&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Show the state of your account, and the type or configuration error.
         * Available values: &#34;ready&#34;, &#34;unconfigured&#34;, &#34;misconfigured&#34;, &#34;misconfigured/locked&#34;, &#34;unlocked&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tag Email Routing settings tag. (Deprecated, replaced by Email Routing settings identifier)
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
         * @param tag Email Routing settings tag. (Deprecated, replaced by Email Routing settings identifier)
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

        public EmailRoutingSettingsState build() {
            return $;
        }
    }

}
