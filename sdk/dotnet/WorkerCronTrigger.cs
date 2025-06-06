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
    /// $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example '&lt;account_id&gt;/&lt;script_name&gt;'
    /// ```
    /// </summary>
    [Obsolete(@"cloudflare.index/workercrontrigger.WorkerCronTrigger has been deprecated in favor of cloudflare.index/workerscrontrigger.WorkersCronTrigger")]
    [CloudflareResourceType("cloudflare:index/workerCronTrigger:WorkerCronTrigger")]
    public partial class WorkerCronTrigger : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("schedules")]
        public Output<ImmutableArray<Outputs.WorkerCronTriggerSchedule>> Schedules { get; private set; } = null!;

        /// <summary>
        /// Name of the script, used in URLs and route configuration.
        /// </summary>
        [Output("scriptName")]
        public Output<string> ScriptName { get; private set; } = null!;


        /// <summary>
        /// Create a WorkerCronTrigger resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkerCronTrigger(string name, WorkerCronTriggerArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, args ?? new WorkerCronTriggerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkerCronTrigger(string name, Input<string> id, WorkerCronTriggerState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "cloudflare:index/workerCronTrigger:WorkerCronTrigger" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WorkerCronTrigger resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkerCronTrigger Get(string name, Input<string> id, WorkerCronTriggerState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkerCronTrigger(name, id, state, options);
        }
    }

    public sealed class WorkerCronTriggerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("schedules", required: true)]
        private InputList<Inputs.WorkerCronTriggerScheduleArgs>? _schedules;
        public InputList<Inputs.WorkerCronTriggerScheduleArgs> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<Inputs.WorkerCronTriggerScheduleArgs>());
            set => _schedules = value;
        }

        /// <summary>
        /// Name of the script, used in URLs and route configuration.
        /// </summary>
        [Input("scriptName", required: true)]
        public Input<string> ScriptName { get; set; } = null!;

        public WorkerCronTriggerArgs()
        {
        }
        public static new WorkerCronTriggerArgs Empty => new WorkerCronTriggerArgs();
    }

    public sealed class WorkerCronTriggerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("schedules")]
        private InputList<Inputs.WorkerCronTriggerScheduleGetArgs>? _schedules;
        public InputList<Inputs.WorkerCronTriggerScheduleGetArgs> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<Inputs.WorkerCronTriggerScheduleGetArgs>());
            set => _schedules = value;
        }

        /// <summary>
        /// Name of the script, used in URLs and route configuration.
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        public WorkerCronTriggerState()
        {
        }
        public static new WorkerCronTriggerState Empty => new WorkerCronTriggerState();
    }
}
