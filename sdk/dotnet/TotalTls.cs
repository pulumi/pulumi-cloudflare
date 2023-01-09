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
    /// Provides a resource which manages Total TLS for a zone.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.TotalTls("example", new()
    ///     {
    ///         CertificateAuthority = "lets_encrypt",
    ///         Enabled = true,
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/totalTls:TotalTls")]
    public partial class TotalTls : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
        /// </summary>
        [Output("certificateAuthority")]
        public Output<string?> CertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// Enable Total TLS for the zone.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a TotalTls resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TotalTls(string name, TotalTlsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/totalTls:TotalTls", name, args ?? new TotalTlsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TotalTls(string name, Input<string> id, TotalTlsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/totalTls:TotalTls", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TotalTls resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TotalTls Get(string name, Input<string> id, TotalTlsState? state = null, CustomResourceOptions? options = null)
        {
            return new TotalTls(name, id, state, options);
        }
    }

    public sealed class TotalTlsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
        /// </summary>
        [Input("certificateAuthority")]
        public Input<string>? CertificateAuthority { get; set; }

        /// <summary>
        /// Enable Total TLS for the zone.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public TotalTlsArgs()
        {
        }
        public static new TotalTlsArgs Empty => new TotalTlsArgs();
    }

    public sealed class TotalTlsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
        /// </summary>
        [Input("certificateAuthority")]
        public Input<string>? CertificateAuthority { get; set; }

        /// <summary>
        /// Enable Total TLS for the zone.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public TotalTlsState()
        {
        }
        public static new TotalTlsState Empty => new TotalTlsState();
    }
}