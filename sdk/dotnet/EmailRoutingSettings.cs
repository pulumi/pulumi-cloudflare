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
    ///     var exampleEmailRoutingSettings = new Cloudflare.EmailRoutingSettings("example_email_routing_settings", new()
    ///     {
    ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/emailRoutingSettings:EmailRoutingSettings example '&lt;zone_id&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/emailRoutingSettings:EmailRoutingSettings")]
    public partial class EmailRoutingSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time the settings have been created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// State of the zone settings for Email Routing.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The date and time the settings have been modified.
        /// </summary>
        [Output("modified")]
        public Output<string> Modified { get; private set; } = null!;

        /// <summary>
        /// Domain of your zone.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Flag to check if the user skipped the configuration wizard.
        /// </summary>
        [Output("skipWizard")]
        public Output<bool> SkipWizard { get; private set; } = null!;

        /// <summary>
        /// Show the state of your account, and the type or configuration error.
        /// Available values: "ready", "unconfigured", "misconfigured", "misconfigured/locked", "unlocked".
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Email Routing settings tag. (Deprecated, replaced by Email Routing settings identifier)
        /// </summary>
        [Output("tag")]
        public Output<string> Tag { get; private set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a EmailRoutingSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EmailRoutingSettings(string name, EmailRoutingSettingsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailRoutingSettings:EmailRoutingSettings", name, args ?? new EmailRoutingSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EmailRoutingSettings(string name, Input<string> id, EmailRoutingSettingsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailRoutingSettings:EmailRoutingSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EmailRoutingSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EmailRoutingSettings Get(string name, Input<string> id, EmailRoutingSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new EmailRoutingSettings(name, id, state, options);
        }
    }

    public sealed class EmailRoutingSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public EmailRoutingSettingsArgs()
        {
        }
        public static new EmailRoutingSettingsArgs Empty => new EmailRoutingSettingsArgs();
    }

    public sealed class EmailRoutingSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time the settings have been created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// State of the zone settings for Email Routing.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The date and time the settings have been modified.
        /// </summary>
        [Input("modified")]
        public Input<string>? Modified { get; set; }

        /// <summary>
        /// Domain of your zone.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Flag to check if the user skipped the configuration wizard.
        /// </summary>
        [Input("skipWizard")]
        public Input<bool>? SkipWizard { get; set; }

        /// <summary>
        /// Show the state of your account, and the type or configuration error.
        /// Available values: "ready", "unconfigured", "misconfigured", "misconfigured/locked", "unlocked".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Email Routing settings tag. (Deprecated, replaced by Email Routing settings identifier)
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public EmailRoutingSettingsState()
        {
        }
        public static new EmailRoutingSettingsState Empty => new EmailRoutingSettingsState();
    }
}
