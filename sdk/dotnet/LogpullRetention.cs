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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleLogpullRetention = new Cloudflare.LogpullRetention("example_logpull_retention", new()
    ///     {
    ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///         Flag = true,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/logpullRetention:LogpullRetention")]
    public partial class LogpullRetention : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The log retention flag for Logpull API.
        /// </summary>
        [Output("flag")]
        public Output<bool?> Flag { get; private set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a LogpullRetention resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogpullRetention(string name, LogpullRetentionArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpullRetention:LogpullRetention", name, args ?? new LogpullRetentionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogpullRetention(string name, Input<string> id, LogpullRetentionState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpullRetention:LogpullRetention", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogpullRetention resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogpullRetention Get(string name, Input<string> id, LogpullRetentionState? state = null, CustomResourceOptions? options = null)
        {
            return new LogpullRetention(name, id, state, options);
        }
    }

    public sealed class LogpullRetentionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The log retention flag for Logpull API.
        /// </summary>
        [Input("flag")]
        public Input<bool>? Flag { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public LogpullRetentionArgs()
        {
        }
        public static new LogpullRetentionArgs Empty => new LogpullRetentionArgs();
    }

    public sealed class LogpullRetentionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The log retention flag for Logpull API.
        /// </summary>
        [Input("flag")]
        public Input<bool>? Flag { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LogpullRetentionState()
        {
        }
        public static new LogpullRetentionState Empty => new LogpullRetentionState();
    }
}
