// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkersDeploymentArgs;
import com.pulumi.cloudflare.inputs.WorkersDeploymentState;
import com.pulumi.cloudflare.outputs.WorkersDeploymentAnnotations;
import com.pulumi.cloudflare.outputs.WorkersDeploymentDeployment;
import com.pulumi.cloudflare.outputs.WorkersDeploymentVersion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
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
 * $ pulumi import cloudflare:index/workersDeployment:WorkersDeployment example &#39;&lt;account_id&gt;/&lt;script_name&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workersDeployment:WorkersDeployment")
public class WorkersDeployment extends com.pulumi.resources.CustomResource {
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
    @Export(name="annotations", refs={WorkersDeploymentAnnotations.class}, tree="[0]")
    private Output</* @Nullable */ WorkersDeploymentAnnotations> annotations;

    public Output<Optional<WorkersDeploymentAnnotations>> annotations() {
        return Codegen.optional(this.annotations);
    }
    @Export(name="authorEmail", refs={String.class}, tree="[0]")
    private Output<String> authorEmail;

    public Output<String> authorEmail() {
        return this.authorEmail;
    }
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    public Output<String> createdOn() {
        return this.createdOn;
    }
    @Export(name="deployments", refs={List.class,WorkersDeploymentDeployment.class}, tree="[0,1]")
    private Output<List<WorkersDeploymentDeployment>> deployments;

    public Output<List<WorkersDeploymentDeployment>> deployments() {
        return this.deployments;
    }
    /**
     * Name of the script.
     * 
     */
    @Export(name="scriptName", refs={String.class}, tree="[0]")
    private Output<String> scriptName;

    /**
     * @return Name of the script.
     * 
     */
    public Output<String> scriptName() {
        return this.scriptName;
    }
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }
    /**
     * Available values: &#34;percentage&#34;.
     * 
     */
    @Export(name="strategy", refs={String.class}, tree="[0]")
    private Output<String> strategy;

    /**
     * @return Available values: &#34;percentage&#34;.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }
    @Export(name="versions", refs={List.class,WorkersDeploymentVersion.class}, tree="[0,1]")
    private Output<List<WorkersDeploymentVersion>> versions;

    public Output<List<WorkersDeploymentVersion>> versions() {
        return this.versions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkersDeployment(java.lang.String name) {
        this(name, WorkersDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkersDeployment(java.lang.String name, WorkersDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkersDeployment(java.lang.String name, WorkersDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersDeployment:WorkersDeployment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkersDeployment(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersDeployment:WorkersDeployment", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkersDeploymentArgs makeArgs(WorkersDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkersDeploymentArgs.Empty : args;
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
    public static WorkersDeployment get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkersDeployment(name, id, state, options);
    }
}
