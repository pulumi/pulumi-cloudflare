// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZoneSubscription
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
        ///     var exampleZoneSubscription = Cloudflare.GetZoneSubscription.Invoke(new()
        ///     {
        ///         ZoneId = "506e3185e9c882d175a2d0cb0093d9f2",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZoneSubscriptionResult> InvokeAsync(GetZoneSubscriptionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZoneSubscriptionResult>("cloudflare:index/getZoneSubscription:getZoneSubscription", args ?? new GetZoneSubscriptionArgs(), options.WithDefaults());

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
        ///     var exampleZoneSubscription = Cloudflare.GetZoneSubscription.Invoke(new()
        ///     {
        ///         ZoneId = "506e3185e9c882d175a2d0cb0093d9f2",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneSubscriptionResult> Invoke(GetZoneSubscriptionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneSubscriptionResult>("cloudflare:index/getZoneSubscription:getZoneSubscription", args ?? new GetZoneSubscriptionInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZoneSubscription = Cloudflare.GetZoneSubscription.Invoke(new()
        ///     {
        ///         ZoneId = "506e3185e9c882d175a2d0cb0093d9f2",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneSubscriptionResult> Invoke(GetZoneSubscriptionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneSubscriptionResult>("cloudflare:index/getZoneSubscription:getZoneSubscription", args ?? new GetZoneSubscriptionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneSubscriptionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Subscription identifier tag.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetZoneSubscriptionArgs()
        {
        }
        public static new GetZoneSubscriptionArgs Empty => new GetZoneSubscriptionArgs();
    }

    public sealed class GetZoneSubscriptionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Subscription identifier tag.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetZoneSubscriptionInvokeArgs()
        {
        }
        public static new GetZoneSubscriptionInvokeArgs Empty => new GetZoneSubscriptionInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneSubscriptionResult
    {
        /// <summary>
        /// The monetary unit in which pricing information is displayed.
        /// </summary>
        public readonly string Currency;
        /// <summary>
        /// The end of the current period and also when the next billing is due.
        /// </summary>
        public readonly string CurrentPeriodEnd;
        /// <summary>
        /// When the current billing period started. May match initial*period*start if this is the first period.
        /// </summary>
        public readonly string CurrentPeriodStart;
        /// <summary>
        /// How often the subscription is renewed automatically.
        /// Available values: "weekly", "monthly", "quarterly", "yearly".
        /// </summary>
        public readonly string Frequency;
        /// <summary>
        /// Subscription identifier tag.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The price of the subscription that will be billed, in US dollars.
        /// </summary>
        public readonly double Price;
        /// <summary>
        /// The rate plan applied to the subscription.
        /// </summary>
        public readonly Outputs.GetZoneSubscriptionRatePlanResult RatePlan;
        /// <summary>
        /// The state that the subscription is in.
        /// Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Subscription identifier tag.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetZoneSubscriptionResult(
            string currency,

            string currentPeriodEnd,

            string currentPeriodStart,

            string frequency,

            string id,

            double price,

            Outputs.GetZoneSubscriptionRatePlanResult ratePlan,

            string state,

            string zoneId)
        {
            Currency = currency;
            CurrentPeriodEnd = currentPeriodEnd;
            CurrentPeriodStart = currentPeriodStart;
            Frequency = frequency;
            Id = id;
            Price = price;
            RatePlan = ratePlan;
            State = state;
            ZoneId = zoneId;
        }
    }
}
