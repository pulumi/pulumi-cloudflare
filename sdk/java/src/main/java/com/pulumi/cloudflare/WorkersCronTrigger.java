// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkersCronTriggerArgs;
import com.pulumi.cloudflare.inputs.WorkersCronTriggerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Worker Cron Triggers allow users to map a cron expression to a Worker script
 * using a `ScheduledEvent` listener that enables Workers to be executed on a
 * schedule. Worker Cron Triggers are ideal for running periodic jobs for
 * maintenance or calling third-party APIs to collect up-to-date data.
 * 
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
 * import com.pulumi.cloudflare.WorkersScript;
 * import com.pulumi.cloudflare.WorkersScriptArgs;
 * import com.pulumi.cloudflare.WorkersCronTrigger;
 * import com.pulumi.cloudflare.WorkersCronTriggerArgs;
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
 *         var exampleScript = new WorkersScript("exampleScript", WorkersScriptArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example-script")
 *             .content(StdFunctions.file(FileArgs.builder()
 *                 .input("path/to/my.js")
 *                 .build()).result())
 *             .build());
 * 
 *         var exampleTrigger = new WorkersCronTrigger("exampleTrigger", WorkersCronTriggerArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .scriptName(exampleScriptCloudflareWorkerScript.name())
 *             .schedules(            
 *                 "*{@literal /}5 * * * *",
 *                 "10 7 * * mon-fri")
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
 * $ pulumi import cloudflare:index/workersCronTrigger:WorkersCronTrigger example &lt;account_id&gt;/&lt;script_name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workersCronTrigger:WorkersCronTrigger")
public class WorkersCronTrigger extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Cron expressions to execute the Worker script.
     * 
     */
    @Export(name="schedules", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> schedules;

    /**
     * @return Cron expressions to execute the Worker script.
     * 
     */
    public Output<List<String>> schedules() {
        return this.schedules;
    }
    /**
     * Worker script to target for the schedules.
     * 
     */
    @Export(name="scriptName", refs={String.class}, tree="[0]")
    private Output<String> scriptName;

    /**
     * @return Worker script to target for the schedules.
     * 
     */
    public Output<String> scriptName() {
        return this.scriptName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkersCronTrigger(String name) {
        this(name, WorkersCronTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkersCronTrigger(String name, WorkersCronTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkersCronTrigger(String name, WorkersCronTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersCronTrigger:WorkersCronTrigger", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private WorkersCronTrigger(String name, Output<String> id, @Nullable WorkersCronTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersCronTrigger:WorkersCronTrigger", name, state, makeResourceOptions(options, id));
    }

    private static WorkersCronTriggerArgs makeArgs(WorkersCronTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkersCronTriggerArgs.Empty : args;
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
    public static WorkersCronTrigger get(String name, Output<String> id, @Nullable WorkersCronTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkersCronTrigger(name, id, state, options);
    }
}
