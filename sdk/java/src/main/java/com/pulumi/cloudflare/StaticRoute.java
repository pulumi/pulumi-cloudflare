// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.StaticRouteArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.StaticRouteState;
import com.pulumi.cloudflare.outputs.StaticRouteModifiedRoute;
import com.pulumi.cloudflare.outputs.StaticRouteRoute;
import com.pulumi.cloudflare.outputs.StaticRouteScope;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.MagicWanStaticRoute;
 * import com.pulumi.cloudflare.MagicWanStaticRouteArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleMagicWanStaticRoute = new MagicWanStaticRoute("exampleMagicWanStaticRoute", MagicWanStaticRouteArgs.builder()
 *             .accountId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * @deprecated
 * cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute
 * 
 */
@Deprecated /* cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute */
@ResourceType(type="cloudflare:index/staticRoute:StaticRoute")
public class StaticRoute extends com.pulumi.resources.CustomResource {
    /**
     * Identifier
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Identifier
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * An optional human provided description of the static route.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional human provided description of the static route.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="modified", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> modified;

    public Output<Boolean> modified() {
        return this.modified;
    }
    @Export(name="modifiedRoute", refs={StaticRouteModifiedRoute.class}, tree="[0]")
    private Output<StaticRouteModifiedRoute> modifiedRoute;

    public Output<StaticRouteModifiedRoute> modifiedRoute() {
        return this.modifiedRoute;
    }
    /**
     * The next-hop IP Address for the static route.
     * 
     */
    @Export(name="nexthop", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nexthop;

    /**
     * @return The next-hop IP Address for the static route.
     * 
     */
    public Output<Optional<String>> nexthop() {
        return Codegen.optional(this.nexthop);
    }
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     * 
     */
    @Export(name="prefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> prefix;

    /**
     * @return IP Prefix in Classless Inter-Domain Routing format.
     * 
     */
    public Output<Optional<String>> prefix() {
        return Codegen.optional(this.prefix);
    }
    /**
     * Priority of the static route.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the static route.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    @Export(name="route", refs={StaticRouteRoute.class}, tree="[0]")
    private Output<StaticRouteRoute> route;

    public Output<StaticRouteRoute> route() {
        return this.route;
    }
    /**
     * Identifier
     * 
     */
    @Export(name="routeId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> routeId;

    /**
     * @return Identifier
     * 
     */
    public Output<Optional<String>> routeId() {
        return Codegen.optional(this.routeId);
    }
    @Export(name="routes", refs={List.class,StaticRouteRoute.class}, tree="[0,1]")
    private Output<List<StaticRouteRoute>> routes;

    public Output<List<StaticRouteRoute>> routes() {
        return this.routes;
    }
    /**
     * Used only for ECMP routes.
     * 
     */
    @Export(name="scope", refs={StaticRouteScope.class}, tree="[0]")
    private Output<StaticRouteScope> scope;

    /**
     * @return Used only for ECMP routes.
     * 
     */
    public Output<StaticRouteScope> scope() {
        return this.scope;
    }
    /**
     * Optional weight of the ECMP scope - if provided.
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> weight;

    /**
     * @return Optional weight of the ECMP scope - if provided.
     * 
     */
    public Output<Optional<Integer>> weight() {
        return Codegen.optional(this.weight);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticRoute(java.lang.String name) {
        this(name, StaticRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticRoute(java.lang.String name, StaticRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticRoute(java.lang.String name, StaticRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/staticRoute:StaticRoute", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StaticRoute(java.lang.String name, Output<java.lang.String> id, @Nullable StaticRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/staticRoute:StaticRoute", name, state, makeResourceOptions(options, id), false);
    }

    private static StaticRouteArgs makeArgs(StaticRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StaticRouteArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("cloudflare:index/staticRoute:StaticRoute").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StaticRoute get(java.lang.String name, Output<java.lang.String> id, @Nullable StaticRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticRoute(name, id, state, options);
    }
}
