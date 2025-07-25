// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.MagicTransitConnectorArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.MagicTransitConnectorState;
import com.pulumi.cloudflare.outputs.MagicTransitConnectorDevice;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
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
 * import com.pulumi.cloudflare.MagicTransitConnector;
 * import com.pulumi.cloudflare.MagicTransitConnectorArgs;
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
 *         var exampleMagicTransitConnector = new MagicTransitConnector("exampleMagicTransitConnector", MagicTransitConnectorArgs.builder()
 *             .accountId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .connectorId("connector_id")
 *             .activated(true)
 *             .interruptWindowDurationHours(0.0)
 *             .interruptWindowHourOfDay(0.0)
 *             .notes("notes")
 *             .timezone("timezone")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/magicTransitConnector:MagicTransitConnector example &#39;&lt;account_id&gt;/&lt;connector_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/magicTransitConnector:MagicTransitConnector")
public class MagicTransitConnector extends com.pulumi.resources.CustomResource {
    /**
     * Account identifier
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account identifier
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="activated", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> activated;

    public Output<Optional<Boolean>> activated() {
        return Codegen.optional(this.activated);
    }
    @Export(name="connectorId", refs={String.class}, tree="[0]")
    private Output<String> connectorId;

    public Output<String> connectorId() {
        return this.connectorId;
    }
    @Export(name="device", refs={MagicTransitConnectorDevice.class}, tree="[0]")
    private Output<MagicTransitConnectorDevice> device;

    public Output<MagicTransitConnectorDevice> device() {
        return this.device;
    }
    @Export(name="interruptWindowDurationHours", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> interruptWindowDurationHours;

    public Output<Optional<Double>> interruptWindowDurationHours() {
        return Codegen.optional(this.interruptWindowDurationHours);
    }
    @Export(name="interruptWindowHourOfDay", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> interruptWindowHourOfDay;

    public Output<Optional<Double>> interruptWindowHourOfDay() {
        return Codegen.optional(this.interruptWindowHourOfDay);
    }
    @Export(name="lastHeartbeat", refs={String.class}, tree="[0]")
    private Output<String> lastHeartbeat;

    public Output<String> lastHeartbeat() {
        return this.lastHeartbeat;
    }
    @Export(name="lastSeenVersion", refs={String.class}, tree="[0]")
    private Output<String> lastSeenVersion;

    public Output<String> lastSeenVersion() {
        return this.lastSeenVersion;
    }
    @Export(name="lastUpdated", refs={String.class}, tree="[0]")
    private Output<String> lastUpdated;

    public Output<String> lastUpdated() {
        return this.lastUpdated;
    }
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timezone;

    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MagicTransitConnector(java.lang.String name) {
        this(name, MagicTransitConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MagicTransitConnector(java.lang.String name, MagicTransitConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MagicTransitConnector(java.lang.String name, MagicTransitConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicTransitConnector:MagicTransitConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MagicTransitConnector(java.lang.String name, Output<java.lang.String> id, @Nullable MagicTransitConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicTransitConnector:MagicTransitConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static MagicTransitConnectorArgs makeArgs(MagicTransitConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MagicTransitConnectorArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static MagicTransitConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable MagicTransitConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MagicTransitConnector(name, id, state, options);
    }
}
