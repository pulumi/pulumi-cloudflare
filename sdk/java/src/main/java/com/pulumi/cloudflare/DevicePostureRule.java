// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DevicePostureRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DevicePostureRuleState;
import com.pulumi.cloudflare.outputs.DevicePostureRuleInput;
import com.pulumi.cloudflare.outputs.DevicePostureRuleMatch;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Device Posture Rule resource. Device posture rules configure security policies for device posture checks.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.DevicePostureRule;
 * import com.pulumi.cloudflare.DevicePostureRuleArgs;
 * import com.pulumi.cloudflare.inputs.DevicePostureRuleMatchArgs;
 * import com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs;
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
 *         var corporateDevicesPostureRule = new DevicePostureRule(&#34;corporateDevicesPostureRule&#34;, DevicePostureRuleArgs.builder()        
 *             .accountId(&#34;1d5fdc9e88c8a8c4518b068cd94331fe&#34;)
 *             .name(&#34;Corporate devices posture rule&#34;)
 *             .type(&#34;serial_number&#34;)
 *             .description(&#34;Device posture rule for corporate devices.&#34;)
 *             .schedule(&#34;24h&#34;)
 *             .expiration(&#34;24h&#34;)
 *             .matches(DevicePostureRuleMatchArgs.builder()
 *                 .platform(&#34;mac&#34;)
 *                 .build())
 *             .inputs(DevicePostureRuleInputArgs.builder()
 *                 .id(cloudflare_teams_list.corporate_devices().id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Device posture rules can be imported using a composite ID formed of account ID and device posture rule ID.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/devicePostureRule:DevicePostureRule corporate_devices cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/devicePostureRule:DevicePostureRule")
public class DevicePostureRule extends com.pulumi.resources.CustomResource {
    /**
     * The account to which the device posture rule should be added.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The account to which the device posture rule should be added.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The description of the device posture rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the device posture rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Expire posture results after the specified amount of time.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    @Export(name="expiration", type=String.class, parameters={})
    private Output</* @Nullable */ String> expiration;

    /**
     * @return Expire posture results after the specified amount of time.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    public Output<Optional<String>> expiration() {
        return Codegen.optional(this.expiration);
    }
    /**
     * The value to be checked against. See below for reference
     * structure.
     * 
     */
    @Export(name="inputs", type=List.class, parameters={DevicePostureRuleInput.class})
    private Output<List<DevicePostureRuleInput>> inputs;

    /**
     * @return The value to be checked against. See below for reference
     * structure.
     * 
     */
    public Output<List<DevicePostureRuleInput>> inputs() {
        return this.inputs;
    }
    /**
     * The conditions that the client must match to run the rule. See below for reference structure.
     * 
     */
    @Export(name="matches", type=List.class, parameters={DevicePostureRuleMatch.class})
    private Output</* @Nullable */ List<DevicePostureRuleMatch>> matches;

    /**
     * @return The conditions that the client must match to run the rule. See below for reference structure.
     * 
     */
    public Output<Optional<List<DevicePostureRuleMatch>>> matches() {
        return Codegen.optional(this.matches);
    }
    /**
     * Name of the device posture rule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the device posture rule.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Tells the client when to run the device posture check.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    @Export(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    /**
     * @return Tells the client when to run the device posture check.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    public Output<Optional<String>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevicePostureRule(String name) {
        this(name, DevicePostureRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevicePostureRule(String name, DevicePostureRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevicePostureRule(String name, DevicePostureRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePostureRule:DevicePostureRule", name, args == null ? DevicePostureRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DevicePostureRule(String name, Output<String> id, @Nullable DevicePostureRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePostureRule:DevicePostureRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static DevicePostureRule get(String name, Output<String> id, @Nullable DevicePostureRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DevicePostureRule(name, id, state, options);
    }
}