// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetFirewallRule
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
        ///     var exampleFirewallRule = Cloudflare.GetFirewallRule.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         RuleId = "372e67954025e0ba6aaa6d586b9e0b60",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFirewallRuleResult> InvokeAsync(GetFirewallRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirewallRuleResult>("cloudflare:index/getFirewallRule:getFirewallRule", args ?? new GetFirewallRuleArgs(), options.WithDefaults());

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
        ///     var exampleFirewallRule = Cloudflare.GetFirewallRule.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         RuleId = "372e67954025e0ba6aaa6d586b9e0b60",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFirewallRuleResult> Invoke(GetFirewallRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallRuleResult>("cloudflare:index/getFirewallRule:getFirewallRule", args ?? new GetFirewallRuleInvokeArgs(), options.WithDefaults());

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
        ///     var exampleFirewallRule = Cloudflare.GetFirewallRule.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         RuleId = "372e67954025e0ba6aaa6d586b9e0b60",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFirewallRuleResult> Invoke(GetFirewallRuleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallRuleResult>("cloudflare:index/getFirewallRule:getFirewallRule", args ?? new GetFirewallRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirewallRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of the firewall rule.
        /// </summary>
        [Input("ruleId")]
        public string? RuleId { get; set; }

        /// <summary>
        /// Defines an identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetFirewallRuleArgs()
        {
        }
        public static new GetFirewallRuleArgs Empty => new GetFirewallRuleArgs();
    }

    public sealed class GetFirewallRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of the firewall rule.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        /// <summary>
        /// Defines an identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetFirewallRuleInvokeArgs()
        {
        }
        public static new GetFirewallRuleInvokeArgs Empty => new GetFirewallRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirewallRuleResult
    {
        /// <summary>
        /// The action to apply to a matched request. The `log` action is only available on an Enterprise plan.
        /// Available values: "block", "challenge", "js*challenge", "managed*challenge", "allow", "log", "bypass".
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// An informative summary of the firewall rule.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The unique identifier of the firewall rule.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// When true, indicates that the firewall rule is currently paused.
        /// </summary>
        public readonly bool Paused;
        /// <summary>
        /// The priority of the rule. Optional value used to define the processing order. A lower number indicates a higher priority. If not provided, rules with a defined priority will be processed before rules without a priority.
        /// </summary>
        public readonly double Priority;
        public readonly ImmutableArray<string> Products;
        /// <summary>
        /// A short reference tag. Allows you to select related firewall rules.
        /// </summary>
        public readonly string Ref;
        /// <summary>
        /// The unique identifier of the firewall rule.
        /// </summary>
        public readonly string? RuleId;
        /// <summary>
        /// Defines an identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetFirewallRuleResult(
            string action,

            string description,

            string id,

            bool paused,

            double priority,

            ImmutableArray<string> products,

            string @ref,

            string? ruleId,

            string zoneId)
        {
            Action = action;
            Description = description;
            Id = id;
            Paused = paused;
            Priority = priority;
            Products = products;
            Ref = @ref;
            RuleId = ruleId;
            ZoneId = zoneId;
        }
    }
}
