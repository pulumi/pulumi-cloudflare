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
    ///     var exampleZeroTrustTunnelCloudflared = new Cloudflare.ZeroTrustTunnelCloudflared("example_zero_trust_tunnel_cloudflared", new()
    ///     {
    ///         AccountId = "699d98642c564d2e855e9661899b7252",
    ///         Name = "blog",
    ///         ConfigSrc = "cloudflare",
    ///         TunnelSecret = "AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/tunnel:Tunnel example '&lt;account_id&gt;/&lt;tunnel_id&gt;'
    /// ```
    /// </summary>
    [Obsolete(@"cloudflare.index/tunnel.Tunnel has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflared.ZeroTrustTunnelCloudflared")]
    [CloudflareResourceType("cloudflare:index/tunnel:Tunnel")]
    public partial class Tunnel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Output("accountTag")]
        public Output<string> AccountTag { get; private set; } = null!;

        /// <summary>
        /// Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard.
        /// Available values: "local", "cloudflare".
        /// </summary>
        [Output("configSrc")]
        public Output<string> ConfigSrc { get; private set; } = null!;

        /// <summary>
        /// The Cloudflare Tunnel connections between your origin and Cloudflare's edge.
        /// </summary>
        [Output("connections")]
        public Output<ImmutableArray<Outputs.TunnelConnection>> Connections { get; private set; } = null!;

        /// <summary>
        /// Timestamp of when the tunnel established at least one connection to Cloudflare's edge. If `null`, the tunnel is inactive.
        /// </summary>
        [Output("connsActiveAt")]
        public Output<string> ConnsActiveAt { get; private set; } = null!;

        /// <summary>
        /// Timestamp of when the tunnel became inactive (no connections to Cloudflare's edge). If `null`, the tunnel is active.
        /// </summary>
        [Output("connsInactiveAt")]
        public Output<string> ConnsInactiveAt { get; private set; } = null!;

        /// <summary>
        /// Timestamp of when the resource was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
        /// </summary>
        [Output("deletedAt")]
        public Output<string> DeletedAt { get; private set; } = null!;

        /// <summary>
        /// Metadata associated with the tunnel.
        /// </summary>
        [Output("metadata")]
        public Output<string> Metadata { get; private set; } = null!;

        /// <summary>
        /// A user-friendly name for a tunnel.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// If `true`, the tunnel can be configured remotely from the Zero Trust dashboard. If `false`, the tunnel must be configured locally on the origin machine.
        /// </summary>
        [Output("remoteConfig")]
        public Output<bool> RemoteConfig { get; private set; } = null!;

        /// <summary>
        /// The status of the tunnel. Valid values are `inactive` (tunnel has never been run), `degraded` (tunnel is active and able to serve traffic but in an unhealthy state), `healthy` (tunnel is active and able to serve traffic), or `down` (tunnel can not serve traffic as it has no connections to the Cloudflare Edge).
        /// Available values: "inactive", "degraded", "healthy", "down".
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The type of tunnel.
        /// Available values: "cfd*tunnel", "warp*connector", "warp", "magic", "ip_sec", "gre", "cni".
        /// </summary>
        [Output("tunType")]
        public Output<string> TunType { get; private set; } = null!;

        /// <summary>
        /// Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
        /// </summary>
        [Output("tunnelSecret")]
        public Output<string?> TunnelSecret { get; private set; } = null!;


        /// <summary>
        /// Create a Tunnel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tunnel(string name, TunnelArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnel:Tunnel", name, args ?? new TunnelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tunnel(string name, Input<string> id, TunnelState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnel:Tunnel", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "cloudflare:index/tunnel:Tunnel" },
                },
                AdditionalSecretOutputs =
                {
                    "tunnelSecret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Tunnel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tunnel Get(string name, Input<string> id, TunnelState? state = null, CustomResourceOptions? options = null)
        {
            return new Tunnel(name, id, state, options);
        }
    }

    public sealed class TunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard.
        /// Available values: "local", "cloudflare".
        /// </summary>
        [Input("configSrc")]
        public Input<string>? ConfigSrc { get; set; }

        /// <summary>
        /// A user-friendly name for a tunnel.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tunnelSecret")]
        private Input<string>? _tunnelSecret;

        /// <summary>
        /// Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
        /// </summary>
        public Input<string>? TunnelSecret
        {
            get => _tunnelSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tunnelSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public TunnelArgs()
        {
        }
        public static new TunnelArgs Empty => new TunnelArgs();
    }

    public sealed class TunnelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Input("accountTag")]
        public Input<string>? AccountTag { get; set; }

        /// <summary>
        /// Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard.
        /// Available values: "local", "cloudflare".
        /// </summary>
        [Input("configSrc")]
        public Input<string>? ConfigSrc { get; set; }

        [Input("connections")]
        private InputList<Inputs.TunnelConnectionGetArgs>? _connections;

        /// <summary>
        /// The Cloudflare Tunnel connections between your origin and Cloudflare's edge.
        /// </summary>
        [Obsolete(@"This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`")]
        public InputList<Inputs.TunnelConnectionGetArgs> Connections
        {
            get => _connections ?? (_connections = new InputList<Inputs.TunnelConnectionGetArgs>());
            set => _connections = value;
        }

        /// <summary>
        /// Timestamp of when the tunnel established at least one connection to Cloudflare's edge. If `null`, the tunnel is inactive.
        /// </summary>
        [Input("connsActiveAt")]
        public Input<string>? ConnsActiveAt { get; set; }

        /// <summary>
        /// Timestamp of when the tunnel became inactive (no connections to Cloudflare's edge). If `null`, the tunnel is active.
        /// </summary>
        [Input("connsInactiveAt")]
        public Input<string>? ConnsInactiveAt { get; set; }

        /// <summary>
        /// Timestamp of when the resource was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
        /// </summary>
        [Input("deletedAt")]
        public Input<string>? DeletedAt { get; set; }

        /// <summary>
        /// Metadata associated with the tunnel.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// A user-friendly name for a tunnel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If `true`, the tunnel can be configured remotely from the Zero Trust dashboard. If `false`, the tunnel must be configured locally on the origin machine.
        /// </summary>
        [Input("remoteConfig")]
        public Input<bool>? RemoteConfig { get; set; }

        /// <summary>
        /// The status of the tunnel. Valid values are `inactive` (tunnel has never been run), `degraded` (tunnel is active and able to serve traffic but in an unhealthy state), `healthy` (tunnel is active and able to serve traffic), or `down` (tunnel can not serve traffic as it has no connections to the Cloudflare Edge).
        /// Available values: "inactive", "degraded", "healthy", "down".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The type of tunnel.
        /// Available values: "cfd*tunnel", "warp*connector", "warp", "magic", "ip_sec", "gre", "cni".
        /// </summary>
        [Input("tunType")]
        public Input<string>? TunType { get; set; }

        [Input("tunnelSecret")]
        private Input<string>? _tunnelSecret;

        /// <summary>
        /// Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
        /// </summary>
        public Input<string>? TunnelSecret
        {
            get => _tunnelSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tunnelSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public TunnelState()
        {
        }
        public static new TunnelState Empty => new TunnelState();
    }
}
