// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApplicationSaasAppCustomClaimArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationSaasAppCustomClaimArgs Empty = new AccessApplicationSaasAppCustomClaimArgs();

    /**
     * The name of the claim.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the claim.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If the claim is required when building an OIDC token.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return If the claim is required when building an OIDC token.
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * The scope of the claim.
     * Available values: &#34;groups&#34;, &#34;profile&#34;, &#34;email&#34;, &#34;openid&#34;.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of the claim.
     * Available values: &#34;groups&#34;, &#34;profile&#34;, &#34;email&#34;, &#34;openid&#34;.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    @Import(name="source")
    private @Nullable Output<AccessApplicationSaasAppCustomClaimSourceArgs> source;

    public Optional<Output<AccessApplicationSaasAppCustomClaimSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private AccessApplicationSaasAppCustomClaimArgs() {}

    private AccessApplicationSaasAppCustomClaimArgs(AccessApplicationSaasAppCustomClaimArgs $) {
        this.name = $.name;
        this.required = $.required;
        this.scope = $.scope;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationSaasAppCustomClaimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationSaasAppCustomClaimArgs $;

        public Builder() {
            $ = new AccessApplicationSaasAppCustomClaimArgs();
        }

        public Builder(AccessApplicationSaasAppCustomClaimArgs defaults) {
            $ = new AccessApplicationSaasAppCustomClaimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the claim.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the claim.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param required If the claim is required when building an OIDC token.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required If the claim is required when building an OIDC token.
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        /**
         * @param scope The scope of the claim.
         * Available values: &#34;groups&#34;, &#34;profile&#34;, &#34;email&#34;, &#34;openid&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the claim.
         * Available values: &#34;groups&#34;, &#34;profile&#34;, &#34;email&#34;, &#34;openid&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder source(@Nullable Output<AccessApplicationSaasAppCustomClaimSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(AccessApplicationSaasAppCustomClaimSourceArgs source) {
            return source(Output.of(source));
        }

        public AccessApplicationSaasAppCustomClaimArgs build() {
            return $;
        }
    }

}
