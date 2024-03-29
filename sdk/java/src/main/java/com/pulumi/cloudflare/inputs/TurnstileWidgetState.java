// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TurnstileWidgetState extends com.pulumi.resources.ResourceArgs {

    public static final TurnstileWidgetState Empty = new TurnstileWidgetState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
     * 
     */
    @Import(name="botFightMode")
    private @Nullable Output<Boolean> botFightMode;

    /**
     * @return If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
     * 
     */
    public Optional<Output<Boolean>> botFightMode() {
        return Optional.ofNullable(this.botFightMode);
    }

    /**
     * Domains where the widget is deployed
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return Domains where the widget is deployed
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Human readable widget name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Human readable widget name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Do not show any Cloudflare branding on the widget (Enterprise only).
     * 
     */
    @Import(name="offlabel")
    private @Nullable Output<Boolean> offlabel;

    /**
     * @return Do not show any Cloudflare branding on the widget (Enterprise only).
     * 
     */
    public Optional<Output<Boolean>> offlabel() {
        return Optional.ofNullable(this.offlabel);
    }

    /**
     * Region where this widget can be used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region where this widget can be used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Secret key for this widget.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Secret key for this widget.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private TurnstileWidgetState() {}

    private TurnstileWidgetState(TurnstileWidgetState $) {
        this.accountId = $.accountId;
        this.botFightMode = $.botFightMode;
        this.domains = $.domains;
        this.mode = $.mode;
        this.name = $.name;
        this.offlabel = $.offlabel;
        this.region = $.region;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TurnstileWidgetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TurnstileWidgetState $;

        public Builder() {
            $ = new TurnstileWidgetState();
        }

        public Builder(TurnstileWidgetState defaults) {
            $ = new TurnstileWidgetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param botFightMode If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
         * 
         * @return builder
         * 
         */
        public Builder botFightMode(@Nullable Output<Boolean> botFightMode) {
            $.botFightMode = botFightMode;
            return this;
        }

        /**
         * @param botFightMode If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
         * 
         * @return builder
         * 
         */
        public Builder botFightMode(Boolean botFightMode) {
            return botFightMode(Output.of(botFightMode));
        }

        /**
         * @param domains Domains where the widget is deployed
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains Domains where the widget is deployed
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains Domains where the widget is deployed
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param mode Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name Human readable widget name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human readable widget name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offlabel Do not show any Cloudflare branding on the widget (Enterprise only).
         * 
         * @return builder
         * 
         */
        public Builder offlabel(@Nullable Output<Boolean> offlabel) {
            $.offlabel = offlabel;
            return this;
        }

        /**
         * @param offlabel Do not show any Cloudflare branding on the widget (Enterprise only).
         * 
         * @return builder
         * 
         */
        public Builder offlabel(Boolean offlabel) {
            return offlabel(Output.of(offlabel));
        }

        /**
         * @param region Region where this widget can be used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region where this widget can be used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secret Secret key for this widget.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Secret key for this widget.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public TurnstileWidgetState build() {
            return $;
        }
    }

}
