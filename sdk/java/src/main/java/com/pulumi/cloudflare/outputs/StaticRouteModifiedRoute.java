// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.StaticRouteModifiedRouteScope;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticRouteModifiedRoute {
    /**
     * @return When the route was created.
     * 
     */
    private @Nullable String createdOn;
    /**
     * @return An optional human provided description of the static route.
     * 
     */
    private @Nullable String description;
    /**
     * @return Identifier
     * 
     */
    private @Nullable String id;
    /**
     * @return When the route was last modified.
     * 
     */
    private @Nullable String modifiedOn;
    /**
     * @return The next-hop IP Address for the static route.
     * 
     */
    private @Nullable String nexthop;
    /**
     * @return IP Prefix in Classless Inter-Domain Routing format.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return Priority of the static route.
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return Used only for ECMP routes.
     * 
     */
    private @Nullable StaticRouteModifiedRouteScope scope;
    /**
     * @return Optional weight of the ECMP scope - if provided.
     * 
     */
    private @Nullable Integer weight;

    private StaticRouteModifiedRoute() {}
    /**
     * @return When the route was created.
     * 
     */
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    /**
     * @return An optional human provided description of the static route.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Identifier
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return When the route was last modified.
     * 
     */
    public Optional<String> modifiedOn() {
        return Optional.ofNullable(this.modifiedOn);
    }
    /**
     * @return The next-hop IP Address for the static route.
     * 
     */
    public Optional<String> nexthop() {
        return Optional.ofNullable(this.nexthop);
    }
    /**
     * @return IP Prefix in Classless Inter-Domain Routing format.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Priority of the static route.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return Used only for ECMP routes.
     * 
     */
    public Optional<StaticRouteModifiedRouteScope> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return Optional weight of the ECMP scope - if provided.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticRouteModifiedRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String createdOn;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String modifiedOn;
        private @Nullable String nexthop;
        private @Nullable String prefix;
        private @Nullable Integer priority;
        private @Nullable StaticRouteModifiedRouteScope scope;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(StaticRouteModifiedRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.nexthop = defaults.nexthop;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.scope = defaults.scope;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder createdOn(@Nullable String createdOn) {

            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(@Nullable String modifiedOn) {

            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder nexthop(@Nullable String nexthop) {

            this.nexthop = nexthop;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {

            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable StaticRouteModifiedRouteScope scope) {

            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {

            this.weight = weight;
            return this;
        }
        public StaticRouteModifiedRoute build() {
            final var _resultValue = new StaticRouteModifiedRoute();
            _resultValue.createdOn = createdOn;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.nexthop = nexthop;
            _resultValue.prefix = prefix;
            _resultValue.priority = priority;
            _resultValue.scope = scope;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
