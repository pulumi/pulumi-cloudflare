// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/workersDeployment:WorkersDeployment example '&lt;account_id&gt;/&lt;script_name&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workersDeployment:WorkersDeployment")]
    public partial class WorkersDeployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("annotations")]
        public Output<Outputs.WorkersDeploymentAnnotations?> Annotations { get; private set; } = null!;

        [Output("authorEmail")]
        public Output<string> AuthorEmail { get; private set; } = null!;

        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        [Output("deployments")]
        public Output<ImmutableArray<Outputs.WorkersDeploymentDeployment>> Deployments { get; private set; } = null!;

        /// <summary>
        /// Name of the script.
        /// </summary>
        [Output("scriptName")]
        public Output<string> ScriptName { get; private set; } = null!;

        [Output("source")]
        public Output<string> Source { get; private set; } = null!;

        /// <summary>
        /// Available values: "percentage".
        /// </summary>
        [Output("strategy")]
        public Output<string> Strategy { get; private set; } = null!;

        [Output("versions")]
        public Output<ImmutableArray<Outputs.WorkersDeploymentVersion>> Versions { get; private set; } = null!;


        /// <summary>
        /// Create a WorkersDeployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkersDeployment(string name, WorkersDeploymentArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersDeployment:WorkersDeployment", name, args ?? new WorkersDeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkersDeployment(string name, Input<string> id, WorkersDeploymentState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersDeployment:WorkersDeployment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WorkersDeployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkersDeployment Get(string name, Input<string> id, WorkersDeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkersDeployment(name, id, state, options);
        }
    }

    public sealed class WorkersDeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("annotations")]
        public Input<Inputs.WorkersDeploymentAnnotationsArgs>? Annotations { get; set; }

        /// <summary>
        /// Name of the script.
        /// </summary>
        [Input("scriptName", required: true)]
        public Input<string> ScriptName { get; set; } = null!;

        /// <summary>
        /// Available values: "percentage".
        /// </summary>
        [Input("strategy", required: true)]
        public Input<string> Strategy { get; set; } = null!;

        [Input("versions", required: true)]
        private InputList<Inputs.WorkersDeploymentVersionArgs>? _versions;
        public InputList<Inputs.WorkersDeploymentVersionArgs> Versions
        {
            get => _versions ?? (_versions = new InputList<Inputs.WorkersDeploymentVersionArgs>());
            set => _versions = value;
        }

        public WorkersDeploymentArgs()
        {
        }
        public static new WorkersDeploymentArgs Empty => new WorkersDeploymentArgs();
    }

    public sealed class WorkersDeploymentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("annotations")]
        public Input<Inputs.WorkersDeploymentAnnotationsGetArgs>? Annotations { get; set; }

        [Input("authorEmail")]
        public Input<string>? AuthorEmail { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("deployments")]
        private InputList<Inputs.WorkersDeploymentDeploymentGetArgs>? _deployments;
        public InputList<Inputs.WorkersDeploymentDeploymentGetArgs> Deployments
        {
            get => _deployments ?? (_deployments = new InputList<Inputs.WorkersDeploymentDeploymentGetArgs>());
            set => _deployments = value;
        }

        /// <summary>
        /// Name of the script.
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Available values: "percentage".
        /// </summary>
        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        [Input("versions")]
        private InputList<Inputs.WorkersDeploymentVersionGetArgs>? _versions;
        public InputList<Inputs.WorkersDeploymentVersionGetArgs> Versions
        {
            get => _versions ?? (_versions = new InputList<Inputs.WorkersDeploymentVersionGetArgs>());
            set => _versions = value;
        }

        public WorkersDeploymentState()
        {
        }
        public static new WorkersDeploymentState Empty => new WorkersDeploymentState();
    }
}
