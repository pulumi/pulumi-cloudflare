// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetWorkersForPlatformsScriptSecrets
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
        ///     var exampleWorkersForPlatformsScriptSecrets = Cloudflare.GetWorkersForPlatformsScriptSecrets.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         DispatchNamespace = "my-dispatch-namespace",
        ///         ScriptName = "this-is_my_script-01",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWorkersForPlatformsScriptSecretsResult> InvokeAsync(GetWorkersForPlatformsScriptSecretsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWorkersForPlatformsScriptSecretsResult>("cloudflare:index/getWorkersForPlatformsScriptSecrets:getWorkersForPlatformsScriptSecrets", args ?? new GetWorkersForPlatformsScriptSecretsArgs(), options.WithDefaults());

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
        ///     var exampleWorkersForPlatformsScriptSecrets = Cloudflare.GetWorkersForPlatformsScriptSecrets.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         DispatchNamespace = "my-dispatch-namespace",
        ///         ScriptName = "this-is_my_script-01",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWorkersForPlatformsScriptSecretsResult> Invoke(GetWorkersForPlatformsScriptSecretsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWorkersForPlatformsScriptSecretsResult>("cloudflare:index/getWorkersForPlatformsScriptSecrets:getWorkersForPlatformsScriptSecrets", args ?? new GetWorkersForPlatformsScriptSecretsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleWorkersForPlatformsScriptSecrets = Cloudflare.GetWorkersForPlatformsScriptSecrets.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         DispatchNamespace = "my-dispatch-namespace",
        ///         ScriptName = "this-is_my_script-01",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWorkersForPlatformsScriptSecretsResult> Invoke(GetWorkersForPlatformsScriptSecretsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWorkersForPlatformsScriptSecretsResult>("cloudflare:index/getWorkersForPlatformsScriptSecrets:getWorkersForPlatformsScriptSecrets", args ?? new GetWorkersForPlatformsScriptSecretsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWorkersForPlatformsScriptSecretsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Name of the Workers for Platforms dispatch namespace.
        /// </summary>
        [Input("dispatchNamespace", required: true)]
        public string DispatchNamespace { get; set; } = null!;

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        /// <summary>
        /// Name of the script, used in URLs and route configuration.
        /// </summary>
        [Input("scriptName", required: true)]
        public string ScriptName { get; set; } = null!;

        public GetWorkersForPlatformsScriptSecretsArgs()
        {
        }
        public static new GetWorkersForPlatformsScriptSecretsArgs Empty => new GetWorkersForPlatformsScriptSecretsArgs();
    }

    public sealed class GetWorkersForPlatformsScriptSecretsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Name of the Workers for Platforms dispatch namespace.
        /// </summary>
        [Input("dispatchNamespace", required: true)]
        public Input<string> DispatchNamespace { get; set; } = null!;

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        /// <summary>
        /// Name of the script, used in URLs and route configuration.
        /// </summary>
        [Input("scriptName", required: true)]
        public Input<string> ScriptName { get; set; } = null!;

        public GetWorkersForPlatformsScriptSecretsInvokeArgs()
        {
        }
        public static new GetWorkersForPlatformsScriptSecretsInvokeArgs Empty => new GetWorkersForPlatformsScriptSecretsInvokeArgs();
    }


    [OutputType]
    public sealed class GetWorkersForPlatformsScriptSecretsResult
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Name of the Workers for Platforms dispatch namespace.
        /// </summary>
        public readonly string DispatchNamespace;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWorkersForPlatformsScriptSecretsResultResult> Results;
        /// <summary>
        /// Name of the script, used in URLs and route configuration.
        /// </summary>
        public readonly string ScriptName;

        [OutputConstructor]
        private GetWorkersForPlatformsScriptSecretsResult(
            string accountId,

            string dispatchNamespace,

            string id,

            int? maxItems,

            ImmutableArray<Outputs.GetWorkersForPlatformsScriptSecretsResultResult> results,

            string scriptName)
        {
            AccountId = accountId;
            DispatchNamespace = dispatchNamespace;
            Id = id;
            MaxItems = maxItems;
            Results = results;
            ScriptName = scriptName;
        }
    }
}
