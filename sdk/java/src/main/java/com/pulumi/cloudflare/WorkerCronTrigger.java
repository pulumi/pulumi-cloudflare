// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkerCronTriggerArgs;
import com.pulumi.cloudflare.inputs.WorkerCronTriggerState;
import com.pulumi.cloudflare.outputs.WorkerCronTriggerSchedule;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example &#39;&lt;account_id&gt;/&lt;script_name&gt;&#39;
 * ```
 * 
 * @deprecated
 * cloudflare.index/workercrontrigger.WorkerCronTrigger has been deprecated in favor of cloudflare.index/workerscrontrigger.WorkersCronTrigger
 * 
 */
@Deprecated /* cloudflare.index/workercrontrigger.WorkerCronTrigger has been deprecated in favor of cloudflare.index/workerscrontrigger.WorkersCronTrigger */
@ResourceType(type="cloudflare:index/workerCronTrigger:WorkerCronTrigger")
public class WorkerCronTrigger extends com.pulumi.resources.CustomResource {
    /**
     * Identifier.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="schedules", refs={List.class,WorkerCronTriggerSchedule.class}, tree="[0,1]")
    private Output<List<WorkerCronTriggerSchedule>> schedules;

    public Output<List<WorkerCronTriggerSchedule>> schedules() {
        return this.schedules;
    }
    /**
     * Name of the script, used in URLs and route configuration.
     * 
     */
    @Export(name="scriptName", refs={String.class}, tree="[0]")
    private Output<String> scriptName;

    /**
     * @return Name of the script, used in URLs and route configuration.
     * 
     */
    public Output<String> scriptName() {
        return this.scriptName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerCronTrigger(java.lang.String name) {
        this(name, WorkerCronTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerCronTrigger(java.lang.String name, WorkerCronTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerCronTrigger(java.lang.String name, WorkerCronTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkerCronTrigger(java.lang.String name, Output<java.lang.String> id, @Nullable WorkerCronTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkerCronTriggerArgs makeArgs(WorkerCronTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkerCronTriggerArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("cloudflare:index/workerCronTrigger:WorkerCronTrigger").build())
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
    public static WorkerCronTrigger get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkerCronTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkerCronTrigger(name, id, state, options);
    }
}
