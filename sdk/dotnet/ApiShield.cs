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
    ///     var exampleApiShield = new Cloudflare.ApiShield("example_api_shield", new()
    ///     {
    ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///         AuthIdCharacteristics = new[]
    ///         {
    ///             new Cloudflare.Inputs.ApiShieldAuthIdCharacteristicArgs
    ///             {
    ///                 Name = "authorization",
    ///                 Type = "header",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/apiShield:ApiShield example '&lt;zone_id&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/apiShield:ApiShield")]
    public partial class ApiShield : global::Pulumi.CustomResource
    {
        [Output("authIdCharacteristics")]
        public Output<ImmutableArray<Outputs.ApiShieldAuthIdCharacteristic>> AuthIdCharacteristics { get; private set; } = null!;

        [Output("errors")]
        public Output<ImmutableArray<Outputs.ApiShieldError>> Errors { get; private set; } = null!;

        [Output("messages")]
        public Output<ImmutableArray<Outputs.ApiShieldMessage>> Messages { get; private set; } = null!;

        /// <summary>
        /// Whether the API call was successful.
        /// </summary>
        [Output("success")]
        public Output<bool> Success { get; private set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ApiShield resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiShield(string name, ApiShieldArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiShield:ApiShield", name, args ?? new ApiShieldArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiShield(string name, Input<string> id, ApiShieldState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiShield:ApiShield", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApiShield resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiShield Get(string name, Input<string> id, ApiShieldState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiShield(name, id, state, options);
        }
    }

    public sealed class ApiShieldArgs : global::Pulumi.ResourceArgs
    {
        [Input("authIdCharacteristics", required: true)]
        private InputList<Inputs.ApiShieldAuthIdCharacteristicArgs>? _authIdCharacteristics;
        public InputList<Inputs.ApiShieldAuthIdCharacteristicArgs> AuthIdCharacteristics
        {
            get => _authIdCharacteristics ?? (_authIdCharacteristics = new InputList<Inputs.ApiShieldAuthIdCharacteristicArgs>());
            set => _authIdCharacteristics = value;
        }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ApiShieldArgs()
        {
        }
        public static new ApiShieldArgs Empty => new ApiShieldArgs();
    }

    public sealed class ApiShieldState : global::Pulumi.ResourceArgs
    {
        [Input("authIdCharacteristics")]
        private InputList<Inputs.ApiShieldAuthIdCharacteristicGetArgs>? _authIdCharacteristics;
        public InputList<Inputs.ApiShieldAuthIdCharacteristicGetArgs> AuthIdCharacteristics
        {
            get => _authIdCharacteristics ?? (_authIdCharacteristics = new InputList<Inputs.ApiShieldAuthIdCharacteristicGetArgs>());
            set => _authIdCharacteristics = value;
        }

        [Input("errors")]
        private InputList<Inputs.ApiShieldErrorGetArgs>? _errors;
        public InputList<Inputs.ApiShieldErrorGetArgs> Errors
        {
            get => _errors ?? (_errors = new InputList<Inputs.ApiShieldErrorGetArgs>());
            set => _errors = value;
        }

        [Input("messages")]
        private InputList<Inputs.ApiShieldMessageGetArgs>? _messages;
        public InputList<Inputs.ApiShieldMessageGetArgs> Messages
        {
            get => _messages ?? (_messages = new InputList<Inputs.ApiShieldMessageGetArgs>());
            set => _messages = value;
        }

        /// <summary>
        /// Whether the API call was successful.
        /// </summary>
        [Input("success")]
        public Input<bool>? Success { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ApiShieldState()
        {
        }
        public static new ApiShieldState Empty => new ApiShieldState();
    }
}
