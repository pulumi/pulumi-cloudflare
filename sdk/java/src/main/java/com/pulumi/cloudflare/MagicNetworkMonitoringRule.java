// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.MagicNetworkMonitoringRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.MagicNetworkMonitoringRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
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
 * import com.pulumi.cloudflare.MagicNetworkMonitoringRule;
 * import com.pulumi.cloudflare.MagicNetworkMonitoringRuleArgs;
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
 *         var exampleMagicNetworkMonitoringRule = new MagicNetworkMonitoringRule("exampleMagicNetworkMonitoringRule", MagicNetworkMonitoringRuleArgs.builder()
 *             .accountId("6f91088a406011ed95aed352566e8d4c")
 *             .duration("1m")
 *             .name("my_rule_1")
 *             .automaticAdvertisement(true)
 *             .bandwidth(1000.0)
 *             .packetThreshold(10000.0)
 *             .prefixes("203.0.113.1/32")
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
 * $ pulumi import cloudflare:index/magicNetworkMonitoringRule:MagicNetworkMonitoringRule example &#39;&lt;account_id&gt;/&lt;rule_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/magicNetworkMonitoringRule:MagicNetworkMonitoringRule")
public class MagicNetworkMonitoringRule extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
     * 
     */
    @Export(name="automaticAdvertisement", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> automaticAdvertisement;

    /**
     * @return Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
     * 
     */
    public Output<Optional<Boolean>> automaticAdvertisement() {
        return Codegen.optional(this.automaticAdvertisement);
    }
    /**
     * The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
     * 
     */
    @Export(name="bandwidth", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> bandwidth;

    /**
     * @return The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
     * 
     */
    public Output<Optional<Double>> bandwidth() {
        return Codegen.optional(this.bandwidth);
    }
    /**
     * The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
     * 
     */
    @Export(name="bandwidthThreshold", refs={Double.class}, tree="[0]")
    private Output<Double> bandwidthThreshold;

    /**
     * @return The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
     * 
     */
    public Output<Double> bandwidthThreshold() {
        return this.bandwidthThreshold;
    }
    /**
     * The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values [&#34;1m&#34;,&#34;5m&#34;,&#34;10m&#34;,&#34;15m&#34;,&#34;20m&#34;,&#34;30m&#34;,&#34;45m&#34;,&#34;60m&#34;].
     * Available values: &#34;1m&#34;, &#34;5m&#34;, &#34;10m&#34;, &#34;15m&#34;, &#34;20m&#34;, &#34;30m&#34;, &#34;45m&#34;, &#34;60m&#34;.
     * 
     */
    @Export(name="duration", refs={String.class}, tree="[0]")
    private Output<String> duration;

    /**
     * @return The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values [&#34;1m&#34;,&#34;5m&#34;,&#34;10m&#34;,&#34;15m&#34;,&#34;20m&#34;,&#34;30m&#34;,&#34;45m&#34;,&#34;60m&#34;].
     * Available values: &#34;1m&#34;, &#34;5m&#34;, &#34;10m&#34;, &#34;15m&#34;, &#34;20m&#34;, &#34;30m&#34;, &#34;45m&#34;, &#34;60m&#34;.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }
    /**
     * The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
     * 
     */
    @Export(name="packetThreshold", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> packetThreshold;

    /**
     * @return The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
     * 
     */
    public Output<Optional<Double>> packetThreshold() {
        return Codegen.optional(this.packetThreshold);
    }
    /**
     * Prefix match type to be applied for a prefix auto advertisement when using an advanced_ddos rule.
     * Available values: &#34;exact&#34;, &#34;subnet&#34;, &#34;supernet&#34;.
     * 
     */
    @Export(name="prefixMatch", refs={String.class}, tree="[0]")
    private Output<String> prefixMatch;

    /**
     * @return Prefix match type to be applied for a prefix auto advertisement when using an advanced_ddos rule.
     * Available values: &#34;exact&#34;, &#34;subnet&#34;, &#34;supernet&#34;.
     * 
     */
    public Output<String> prefixMatch() {
        return this.prefixMatch;
    }
    @Export(name="prefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> prefixes;

    public Output<Optional<List<String>>> prefixes() {
        return Codegen.optional(this.prefixes);
    }
    /**
     * MNM rule type.
     * Available values: &#34;threshold&#34;, &#34;zscore&#34;, &#34;advanced_ddos&#34;.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return MNM rule type.
     * Available values: &#34;threshold&#34;, &#34;zscore&#34;, &#34;advanced_ddos&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Level of sensitivity set for zscore rules.
     * Available values: &#34;low&#34;, &#34;medium&#34;, &#34;high&#34;.
     * 
     */
    @Export(name="zscoreSensitivity", refs={String.class}, tree="[0]")
    private Output<String> zscoreSensitivity;

    /**
     * @return Level of sensitivity set for zscore rules.
     * Available values: &#34;low&#34;, &#34;medium&#34;, &#34;high&#34;.
     * 
     */
    public Output<String> zscoreSensitivity() {
        return this.zscoreSensitivity;
    }
    /**
     * Target of the zscore rule analysis.
     * Available values: &#34;bits&#34;, &#34;packets&#34;.
     * 
     */
    @Export(name="zscoreTarget", refs={String.class}, tree="[0]")
    private Output<String> zscoreTarget;

    /**
     * @return Target of the zscore rule analysis.
     * Available values: &#34;bits&#34;, &#34;packets&#34;.
     * 
     */
    public Output<String> zscoreTarget() {
        return this.zscoreTarget;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MagicNetworkMonitoringRule(java.lang.String name) {
        this(name, MagicNetworkMonitoringRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MagicNetworkMonitoringRule(java.lang.String name, MagicNetworkMonitoringRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MagicNetworkMonitoringRule(java.lang.String name, MagicNetworkMonitoringRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicNetworkMonitoringRule:MagicNetworkMonitoringRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MagicNetworkMonitoringRule(java.lang.String name, Output<java.lang.String> id, @Nullable MagicNetworkMonitoringRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicNetworkMonitoringRule:MagicNetworkMonitoringRule", name, state, makeResourceOptions(options, id), false);
    }

    private static MagicNetworkMonitoringRuleArgs makeArgs(MagicNetworkMonitoringRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MagicNetworkMonitoringRuleArgs.Empty : args;
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
    public static MagicNetworkMonitoringRule get(java.lang.String name, Output<java.lang.String> id, @Nullable MagicNetworkMonitoringRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MagicNetworkMonitoringRule(name, id, state, options);
    }
}
