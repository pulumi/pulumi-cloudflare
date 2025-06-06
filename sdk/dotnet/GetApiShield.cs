// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetApiShield
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
        ///     var exampleApiShield = Cloudflare.GetApiShield.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Properties = new[]
        ///         {
        ///             "auth_id_characteristics",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApiShieldResult> InvokeAsync(GetApiShieldArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApiShieldResult>("cloudflare:index/getApiShield:getApiShield", args ?? new GetApiShieldArgs(), options.WithDefaults());

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
        ///     var exampleApiShield = Cloudflare.GetApiShield.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Properties = new[]
        ///         {
        ///             "auth_id_characteristics",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApiShieldResult> Invoke(GetApiShieldInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApiShieldResult>("cloudflare:index/getApiShield:getApiShield", args ?? new GetApiShieldInvokeArgs(), options.WithDefaults());

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
        ///     var exampleApiShield = Cloudflare.GetApiShield.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Properties = new[]
        ///         {
        ///             "auth_id_characteristics",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApiShieldResult> Invoke(GetApiShieldInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApiShieldResult>("cloudflare:index/getApiShield:getApiShield", args ?? new GetApiShieldInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApiShieldArgs : global::Pulumi.InvokeArgs
    {
        [Input("properties")]
        private List<string>? _properties;

        /// <summary>
        /// Requests information about certain properties.
        /// </summary>
        public List<string> Properties
        {
            get => _properties ?? (_properties = new List<string>());
            set => _properties = value;
        }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetApiShieldArgs()
        {
        }
        public static new GetApiShieldArgs Empty => new GetApiShieldArgs();
    }

    public sealed class GetApiShieldInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("properties")]
        private InputList<string>? _properties;

        /// <summary>
        /// Requests information about certain properties.
        /// </summary>
        public InputList<string> Properties
        {
            get => _properties ?? (_properties = new InputList<string>());
            set => _properties = value;
        }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetApiShieldInvokeArgs()
        {
        }
        public static new GetApiShieldInvokeArgs Empty => new GetApiShieldInvokeArgs();
    }


    [OutputType]
    public sealed class GetApiShieldResult
    {
        public readonly ImmutableArray<Outputs.GetApiShieldAuthIdCharacteristicResult> AuthIdCharacteristics;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Requests information about certain properties.
        /// </summary>
        public readonly ImmutableArray<string> Properties;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetApiShieldResult(
            ImmutableArray<Outputs.GetApiShieldAuthIdCharacteristicResult> authIdCharacteristics,

            string id,

            ImmutableArray<string> properties,

            string zoneId)
        {
            AuthIdCharacteristics = authIdCharacteristics;
            Id = id;
            Properties = properties;
            ZoneId = zoneId;
        }
    }
}
