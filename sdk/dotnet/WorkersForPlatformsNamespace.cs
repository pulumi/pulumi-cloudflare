// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// The [Workers for Platforms](https://developers.cloudflare.com/cloudflare-for-platforms/workers-for-platforms/) resource allows you
    /// to manage Cloudflare Workers for Platforms namespaces.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.WorkersForPlatformsNamespace("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "example-namespace",
    ///     });
    /// 
    ///     var customerWorker1 = new Cloudflare.WorkersScript("customer_worker_1", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "customer-worker-1",
    ///         Content = Std.File.Invoke(new()
    ///         {
    ///             Input = "script.js",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         DispatchNamespace = example.Name,
    ///         Tags = new[]
    ///         {
    ///             "free",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace example &lt;account_id&gt;/&lt;namespace_name&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace")]
    public partial class WorkersForPlatformsNamespace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The name of the Workers for Platforms namespace.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a WorkersForPlatformsNamespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkersForPlatformsNamespace(string name, WorkersForPlatformsNamespaceArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace", name, args ?? new WorkersForPlatformsNamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkersForPlatformsNamespace(string name, Input<string> id, WorkersForPlatformsNamespaceState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkersForPlatformsNamespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkersForPlatformsNamespace Get(string name, Input<string> id, WorkersForPlatformsNamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkersForPlatformsNamespace(name, id, state, options);
        }
    }

    public sealed class WorkersForPlatformsNamespaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The name of the Workers for Platforms namespace.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public WorkersForPlatformsNamespaceArgs()
        {
        }
        public static new WorkersForPlatformsNamespaceArgs Empty => new WorkersForPlatformsNamespaceArgs();
    }

    public sealed class WorkersForPlatformsNamespaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The name of the Workers for Platforms namespace.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public WorkersForPlatformsNamespaceState()
        {
        }
        public static new WorkersForPlatformsNamespaceState Empty => new WorkersForPlatformsNamespaceState();
    }
}
