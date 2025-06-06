// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetEmailRoutingSettings
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
        ///     var exampleEmailRoutingSettings = Cloudflare.GetEmailRoutingSettings.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetEmailRoutingSettingsResult> InvokeAsync(GetEmailRoutingSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEmailRoutingSettingsResult>("cloudflare:index/getEmailRoutingSettings:getEmailRoutingSettings", args ?? new GetEmailRoutingSettingsArgs(), options.WithDefaults());

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
        ///     var exampleEmailRoutingSettings = Cloudflare.GetEmailRoutingSettings.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEmailRoutingSettingsResult> Invoke(GetEmailRoutingSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEmailRoutingSettingsResult>("cloudflare:index/getEmailRoutingSettings:getEmailRoutingSettings", args ?? new GetEmailRoutingSettingsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleEmailRoutingSettings = Cloudflare.GetEmailRoutingSettings.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEmailRoutingSettingsResult> Invoke(GetEmailRoutingSettingsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEmailRoutingSettingsResult>("cloudflare:index/getEmailRoutingSettings:getEmailRoutingSettings", args ?? new GetEmailRoutingSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEmailRoutingSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetEmailRoutingSettingsArgs()
        {
        }
        public static new GetEmailRoutingSettingsArgs Empty => new GetEmailRoutingSettingsArgs();
    }

    public sealed class GetEmailRoutingSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetEmailRoutingSettingsInvokeArgs()
        {
        }
        public static new GetEmailRoutingSettingsInvokeArgs Empty => new GetEmailRoutingSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEmailRoutingSettingsResult
    {
        /// <summary>
        /// The date and time the settings have been created.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// State of the zone settings for Email Routing.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Email Routing settings identifier.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The date and time the settings have been modified.
        /// </summary>
        public readonly string Modified;
        /// <summary>
        /// Domain of your zone.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Flag to check if the user skipped the configuration wizard.
        /// </summary>
        public readonly bool SkipWizard;
        /// <summary>
        /// Show the state of your account, and the type or configuration error.
        /// Available values: "ready", "unconfigured", "misconfigured", "misconfigured/locked", "unlocked".
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Email Routing settings tag. (Deprecated, replaced by Email Routing settings identifier)
        /// </summary>
        public readonly string Tag;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetEmailRoutingSettingsResult(
            string created,

            bool enabled,

            string id,

            string modified,

            string name,

            bool skipWizard,

            string status,

            string tag,

            string zoneId)
        {
            Created = created;
            Enabled = enabled;
            Id = id;
            Modified = modified;
            Name = name;
            SkipWizard = skipWizard;
            Status = status;
            Tag = tag;
            ZoneId = zoneId;
        }
    }
}
