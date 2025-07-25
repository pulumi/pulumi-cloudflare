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
    ///     var exampleZoneDnssec = new Cloudflare.ZoneDnssec("example_zone_dnssec", new()
    ///     {
    ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///         DnssecMultiSigner = false,
    ///         DnssecPresigned = true,
    ///         DnssecUseNsec3 = false,
    ///         Status = "active",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/zoneDnssec:ZoneDnssec example '&lt;zone_id&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zoneDnssec:ZoneDnssec")]
    public partial class ZoneDnssec : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Algorithm key code.
        /// </summary>
        [Output("algorithm")]
        public Output<string> Algorithm { get; private set; } = null!;

        /// <summary>
        /// Digest hash.
        /// </summary>
        [Output("digest")]
        public Output<string> Digest { get; private set; } = null!;

        /// <summary>
        /// Type of digest algorithm.
        /// </summary>
        [Output("digestAlgorithm")]
        public Output<string> DigestAlgorithm { get; private set; } = null!;

        /// <summary>
        /// Coded type for digest algorithm.
        /// </summary>
        [Output("digestType")]
        public Output<string> DigestType { get; private set; } = null!;

        /// <summary>
        /// If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
        /// providers to serve a DNSSEC-signed zone at the same time.
        /// This is required for DNSKEY records (except those automatically
        /// generated by Cloudflare) to be added to the zone.
        /// </summary>
        [Output("dnssecMultiSigner")]
        public Output<bool?> DnssecMultiSigner { get; private set; } = null!;

        /// <summary>
        /// If true, allows Cloudflare to transfer in a DNSSEC-signed zone including signatures from an external provider, without
        /// requiring Cloudflare to sign any records on the fly. Note that this feature has some limitations. See [Cloudflare as
        /// Secondary](https://developers.cloudflare.com/dns/zone-setups/zone-transfers/cloudflare-as-secondary/setup/#dnssec) for
        /// details.
        /// </summary>
        [Output("dnssecPresigned")]
        public Output<bool?> DnssecPresigned { get; private set; } = null!;

        /// <summary>
        /// If true, enables the use of NSEC3 together with DNSSEC on the zone. Combined with setting dnssec_presigned to true, this
        /// enables the use of NSEC3 records when transferring in from an external provider. If dnssec_presigned is instead set to
        /// false (default), NSEC3 records will be generated and signed at request time. See [DNSSEC with
        /// NSEC3](https://developers.cloudflare.com/dns/dnssec/enable-nsec3/) for details.
        /// </summary>
        [Output("dnssecUseNsec3")]
        public Output<bool?> DnssecUseNsec3 { get; private set; } = null!;

        /// <summary>
        /// Full DS record.
        /// </summary>
        [Output("ds")]
        public Output<string> Ds { get; private set; } = null!;

        /// <summary>
        /// Flag for DNSSEC record.
        /// </summary>
        [Output("flags")]
        public Output<double> Flags { get; private set; } = null!;

        /// <summary>
        /// Code for key tag.
        /// </summary>
        [Output("keyTag")]
        public Output<double> KeyTag { get; private set; } = null!;

        /// <summary>
        /// Algorithm key type.
        /// </summary>
        [Output("keyType")]
        public Output<string> KeyType { get; private set; } = null!;

        /// <summary>
        /// When DNSSEC was last modified.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// Public key for DS record.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;

        /// <summary>
        /// Status of DNSSEC, based on user-desired state and presence of necessary records. Available values: "active", "disabled".
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZoneDnssec resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZoneDnssec(string name, ZoneDnssecArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneDnssec:ZoneDnssec", name, args ?? new ZoneDnssecArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZoneDnssec(string name, Input<string> id, ZoneDnssecState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneDnssec:ZoneDnssec", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZoneDnssec resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZoneDnssec Get(string name, Input<string> id, ZoneDnssecState? state = null, CustomResourceOptions? options = null)
        {
            return new ZoneDnssec(name, id, state, options);
        }
    }

    public sealed class ZoneDnssecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
        /// providers to serve a DNSSEC-signed zone at the same time.
        /// This is required for DNSKEY records (except those automatically
        /// generated by Cloudflare) to be added to the zone.
        /// </summary>
        [Input("dnssecMultiSigner")]
        public Input<bool>? DnssecMultiSigner { get; set; }

        /// <summary>
        /// If true, allows Cloudflare to transfer in a DNSSEC-signed zone including signatures from an external provider, without
        /// requiring Cloudflare to sign any records on the fly. Note that this feature has some limitations. See [Cloudflare as
        /// Secondary](https://developers.cloudflare.com/dns/zone-setups/zone-transfers/cloudflare-as-secondary/setup/#dnssec) for
        /// details.
        /// </summary>
        [Input("dnssecPresigned")]
        public Input<bool>? DnssecPresigned { get; set; }

        /// <summary>
        /// If true, enables the use of NSEC3 together with DNSSEC on the zone. Combined with setting dnssec_presigned to true, this
        /// enables the use of NSEC3 records when transferring in from an external provider. If dnssec_presigned is instead set to
        /// false (default), NSEC3 records will be generated and signed at request time. See [DNSSEC with
        /// NSEC3](https://developers.cloudflare.com/dns/dnssec/enable-nsec3/) for details.
        /// </summary>
        [Input("dnssecUseNsec3")]
        public Input<bool>? DnssecUseNsec3 { get; set; }

        /// <summary>
        /// Status of DNSSEC, based on user-desired state and presence of necessary records. Available values: "active", "disabled".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ZoneDnssecArgs()
        {
        }
        public static new ZoneDnssecArgs Empty => new ZoneDnssecArgs();
    }

    public sealed class ZoneDnssecState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Algorithm key code.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        /// <summary>
        /// Digest hash.
        /// </summary>
        [Input("digest")]
        public Input<string>? Digest { get; set; }

        /// <summary>
        /// Type of digest algorithm.
        /// </summary>
        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        /// <summary>
        /// Coded type for digest algorithm.
        /// </summary>
        [Input("digestType")]
        public Input<string>? DigestType { get; set; }

        /// <summary>
        /// If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
        /// providers to serve a DNSSEC-signed zone at the same time.
        /// This is required for DNSKEY records (except those automatically
        /// generated by Cloudflare) to be added to the zone.
        /// </summary>
        [Input("dnssecMultiSigner")]
        public Input<bool>? DnssecMultiSigner { get; set; }

        /// <summary>
        /// If true, allows Cloudflare to transfer in a DNSSEC-signed zone including signatures from an external provider, without
        /// requiring Cloudflare to sign any records on the fly. Note that this feature has some limitations. See [Cloudflare as
        /// Secondary](https://developers.cloudflare.com/dns/zone-setups/zone-transfers/cloudflare-as-secondary/setup/#dnssec) for
        /// details.
        /// </summary>
        [Input("dnssecPresigned")]
        public Input<bool>? DnssecPresigned { get; set; }

        /// <summary>
        /// If true, enables the use of NSEC3 together with DNSSEC on the zone. Combined with setting dnssec_presigned to true, this
        /// enables the use of NSEC3 records when transferring in from an external provider. If dnssec_presigned is instead set to
        /// false (default), NSEC3 records will be generated and signed at request time. See [DNSSEC with
        /// NSEC3](https://developers.cloudflare.com/dns/dnssec/enable-nsec3/) for details.
        /// </summary>
        [Input("dnssecUseNsec3")]
        public Input<bool>? DnssecUseNsec3 { get; set; }

        /// <summary>
        /// Full DS record.
        /// </summary>
        [Input("ds")]
        public Input<string>? Ds { get; set; }

        /// <summary>
        /// Flag for DNSSEC record.
        /// </summary>
        [Input("flags")]
        public Input<double>? Flags { get; set; }

        /// <summary>
        /// Code for key tag.
        /// </summary>
        [Input("keyTag")]
        public Input<double>? KeyTag { get; set; }

        /// <summary>
        /// Algorithm key type.
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

        /// <summary>
        /// When DNSSEC was last modified.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// Public key for DS record.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// Status of DNSSEC, based on user-desired state and presence of necessary records. Available values: "active", "disabled".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZoneDnssecState()
        {
        }
        public static new ZoneDnssecState Empty => new ZoneDnssecState();
    }
}
