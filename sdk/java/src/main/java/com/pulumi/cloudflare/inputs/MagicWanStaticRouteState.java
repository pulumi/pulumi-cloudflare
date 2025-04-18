// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.MagicWanStaticRouteModifiedRouteArgs;
import com.pulumi.cloudflare.inputs.MagicWanStaticRouteRouteArgs;
import com.pulumi.cloudflare.inputs.MagicWanStaticRouteScopeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MagicWanStaticRouteState extends com.pulumi.resources.ResourceArgs {

    public static final MagicWanStaticRouteState Empty = new MagicWanStaticRouteState();

    /**
     * Identifier
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Identifier
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * An optional human provided description of the static route.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional human provided description of the static route.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="modified")
    private @Nullable Output<Boolean> modified;

    public Optional<Output<Boolean>> modified() {
        return Optional.ofNullable(this.modified);
    }

    @Import(name="modifiedRoute")
    private @Nullable Output<MagicWanStaticRouteModifiedRouteArgs> modifiedRoute;

    public Optional<Output<MagicWanStaticRouteModifiedRouteArgs>> modifiedRoute() {
        return Optional.ofNullable(this.modifiedRoute);
    }

    /**
     * The next-hop IP Address for the static route.
     * 
     */
    @Import(name="nexthop")
    private @Nullable Output<String> nexthop;

    /**
     * @return The next-hop IP Address for the static route.
     * 
     */
    public Optional<Output<String>> nexthop() {
        return Optional.ofNullable(this.nexthop);
    }

    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return IP Prefix in Classless Inter-Domain Routing format.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Priority of the static route.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of the static route.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="route")
    private @Nullable Output<MagicWanStaticRouteRouteArgs> route;

    public Optional<Output<MagicWanStaticRouteRouteArgs>> route() {
        return Optional.ofNullable(this.route);
    }

    /**
     * Identifier
     * 
     */
    @Import(name="routeId")
    private @Nullable Output<String> routeId;

    /**
     * @return Identifier
     * 
     */
    public Optional<Output<String>> routeId() {
        return Optional.ofNullable(this.routeId);
    }

    @Import(name="routes")
    private @Nullable Output<List<MagicWanStaticRouteRouteArgs>> routes;

    public Optional<Output<List<MagicWanStaticRouteRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    /**
     * Used only for ECMP routes.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<MagicWanStaticRouteScopeArgs> scope;

    /**
     * @return Used only for ECMP routes.
     * 
     */
    public Optional<Output<MagicWanStaticRouteScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Optional weight of the ECMP scope - if provided.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Optional weight of the ECMP scope - if provided.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private MagicWanStaticRouteState() {}

    private MagicWanStaticRouteState(MagicWanStaticRouteState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.modified = $.modified;
        this.modifiedRoute = $.modifiedRoute;
        this.nexthop = $.nexthop;
        this.prefix = $.prefix;
        this.priority = $.priority;
        this.route = $.route;
        this.routeId = $.routeId;
        this.routes = $.routes;
        this.scope = $.scope;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MagicWanStaticRouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MagicWanStaticRouteState $;

        public Builder() {
            $ = new MagicWanStaticRouteState();
        }

        public Builder(MagicWanStaticRouteState defaults) {
            $ = new MagicWanStaticRouteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description An optional human provided description of the static route.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional human provided description of the static route.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder modified(@Nullable Output<Boolean> modified) {
            $.modified = modified;
            return this;
        }

        public Builder modified(Boolean modified) {
            return modified(Output.of(modified));
        }

        public Builder modifiedRoute(@Nullable Output<MagicWanStaticRouteModifiedRouteArgs> modifiedRoute) {
            $.modifiedRoute = modifiedRoute;
            return this;
        }

        public Builder modifiedRoute(MagicWanStaticRouteModifiedRouteArgs modifiedRoute) {
            return modifiedRoute(Output.of(modifiedRoute));
        }

        /**
         * @param nexthop The next-hop IP Address for the static route.
         * 
         * @return builder
         * 
         */
        public Builder nexthop(@Nullable Output<String> nexthop) {
            $.nexthop = nexthop;
            return this;
        }

        /**
         * @param nexthop The next-hop IP Address for the static route.
         * 
         * @return builder
         * 
         */
        public Builder nexthop(String nexthop) {
            return nexthop(Output.of(nexthop));
        }

        /**
         * @param prefix IP Prefix in Classless Inter-Domain Routing format.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix IP Prefix in Classless Inter-Domain Routing format.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param priority Priority of the static route.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of the static route.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder route(@Nullable Output<MagicWanStaticRouteRouteArgs> route) {
            $.route = route;
            return this;
        }

        public Builder route(MagicWanStaticRouteRouteArgs route) {
            return route(Output.of(route));
        }

        /**
         * @param routeId Identifier
         * 
         * @return builder
         * 
         */
        public Builder routeId(@Nullable Output<String> routeId) {
            $.routeId = routeId;
            return this;
        }

        /**
         * @param routeId Identifier
         * 
         * @return builder
         * 
         */
        public Builder routeId(String routeId) {
            return routeId(Output.of(routeId));
        }

        public Builder routes(@Nullable Output<List<MagicWanStaticRouteRouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        public Builder routes(List<MagicWanStaticRouteRouteArgs> routes) {
            return routes(Output.of(routes));
        }

        public Builder routes(MagicWanStaticRouteRouteArgs... routes) {
            return routes(List.of(routes));
        }

        /**
         * @param scope Used only for ECMP routes.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<MagicWanStaticRouteScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Used only for ECMP routes.
         * 
         * @return builder
         * 
         */
        public Builder scope(MagicWanStaticRouteScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param weight Optional weight of the ECMP scope - if provided.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Optional weight of the ECMP scope - if provided.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public MagicWanStaticRouteState build() {
            return $;
        }
    }

}
