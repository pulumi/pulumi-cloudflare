// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetWaitingRoomEvent
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
        ///     var exampleWaitingRoomEvent = Cloudflare.GetWaitingRoomEvent.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         WaitingRoomId = "699d98642c564d2e855e9661899b7252",
        ///         EventId = "25756b2dfe6e378a06b033b670413757",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWaitingRoomEventResult> InvokeAsync(GetWaitingRoomEventArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWaitingRoomEventResult>("cloudflare:index/getWaitingRoomEvent:getWaitingRoomEvent", args ?? new GetWaitingRoomEventArgs(), options.WithDefaults());

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
        ///     var exampleWaitingRoomEvent = Cloudflare.GetWaitingRoomEvent.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         WaitingRoomId = "699d98642c564d2e855e9661899b7252",
        ///         EventId = "25756b2dfe6e378a06b033b670413757",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWaitingRoomEventResult> Invoke(GetWaitingRoomEventInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWaitingRoomEventResult>("cloudflare:index/getWaitingRoomEvent:getWaitingRoomEvent", args ?? new GetWaitingRoomEventInvokeArgs(), options.WithDefaults());

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
        ///     var exampleWaitingRoomEvent = Cloudflare.GetWaitingRoomEvent.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         WaitingRoomId = "699d98642c564d2e855e9661899b7252",
        ///         EventId = "25756b2dfe6e378a06b033b670413757",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWaitingRoomEventResult> Invoke(GetWaitingRoomEventInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWaitingRoomEventResult>("cloudflare:index/getWaitingRoomEvent:getWaitingRoomEvent", args ?? new GetWaitingRoomEventInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWaitingRoomEventArgs : global::Pulumi.InvokeArgs
    {
        [Input("eventId")]
        public string? EventId { get; set; }

        [Input("waitingRoomId", required: true)]
        public string WaitingRoomId { get; set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetWaitingRoomEventArgs()
        {
        }
        public static new GetWaitingRoomEventArgs Empty => new GetWaitingRoomEventArgs();
    }

    public sealed class GetWaitingRoomEventInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("eventId")]
        public Input<string>? EventId { get; set; }

        [Input("waitingRoomId", required: true)]
        public Input<string> WaitingRoomId { get; set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetWaitingRoomEventInvokeArgs()
        {
        }
        public static new GetWaitingRoomEventInvokeArgs Empty => new GetWaitingRoomEventInvokeArgs();
    }


    [OutputType]
    public sealed class GetWaitingRoomEventResult
    {
        public readonly string CreatedOn;
        /// <summary>
        /// If set, the event will override the waiting room's `custom_page_html` property while it is active. If null, the event will inherit it.
        /// </summary>
        public readonly string CustomPageHtml;
        /// <summary>
        /// A note that you can use to add more details about the event.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// If set, the event will override the waiting room's `disable_session_renewal` property while it is active. If null, the event will inherit it.
        /// </summary>
        public readonly bool DisableSessionRenewal;
        /// <summary>
        /// An ISO 8601 timestamp that marks the end of the event.
        /// </summary>
        public readonly string EventEndTime;
        public readonly string? EventId;
        /// <summary>
        /// An ISO 8601 timestamp that marks the start of the event. At this time, queued users will be processed with the event's configuration. The start time must be at least one minute before `event_end_time`.
        /// </summary>
        public readonly string EventStartTime;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        public readonly string ModifiedOn;
        /// <summary>
        /// A unique name to identify the event. Only alphanumeric characters, hyphens and underscores are allowed.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// If set, the event will override the waiting room's `new_users_per_minute` property while it is active. If null, the event will inherit it. This can only be set if the event's `total_active_users` property is also set.
        /// </summary>
        public readonly int NewUsersPerMinute;
        /// <summary>
        /// An ISO 8601 timestamp that marks when to begin queueing all users before the event starts. The prequeue must start at least five minutes before `event_start_time`.
        /// </summary>
        public readonly string PrequeueStartTime;
        /// <summary>
        /// If set, the event will override the waiting room's `queueing_method` property while it is active. If null, the event will inherit it.
        /// </summary>
        public readonly string QueueingMethod;
        /// <summary>
        /// If set, the event will override the waiting room's `session_duration` property while it is active. If null, the event will inherit it.
        /// </summary>
        public readonly int SessionDuration;
        /// <summary>
        /// If enabled, users in the prequeue will be shuffled randomly at the `event_start_time`. Requires that `prequeue_start_time` is not null. This is useful for situations when many users will join the event prequeue at the same time and you want to shuffle them to ensure fairness. Naturally, it makes the most sense to enable this feature when the `queueing_method` during the event respects ordering such as **fifo**, or else the shuffling may be unnecessary.
        /// </summary>
        public readonly bool ShuffleAtEventStart;
        /// <summary>
        /// Suspends or allows an event. If set to `true`, the event is ignored and traffic will be handled based on the waiting room configuration.
        /// </summary>
        public readonly bool Suspended;
        /// <summary>
        /// If set, the event will override the waiting room's `total_active_users` property while it is active. If null, the event will inherit it. This can only be set if the event's `new_users_per_minute` property is also set.
        /// </summary>
        public readonly int TotalActiveUsers;
        /// <summary>
        /// If set, the event will override the waiting room's `turnstile_action` property while it is active. If null, the event will inherit it.
        /// Available values: "log", "infinite_queue".
        /// </summary>
        public readonly string TurnstileAction;
        /// <summary>
        /// If set, the event will override the waiting room's `turnstile_mode` property while it is active. If null, the event will inherit it.
        /// Available values: "off", "invisible", "visible*non*interactive", "visible_managed".
        /// </summary>
        public readonly string TurnstileMode;
        public readonly string WaitingRoomId;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetWaitingRoomEventResult(
            string createdOn,

            string customPageHtml,

            string description,

            bool disableSessionRenewal,

            string eventEndTime,

            string? eventId,

            string eventStartTime,

            string id,

            string modifiedOn,

            string name,

            int newUsersPerMinute,

            string prequeueStartTime,

            string queueingMethod,

            int sessionDuration,

            bool shuffleAtEventStart,

            bool suspended,

            int totalActiveUsers,

            string turnstileAction,

            string turnstileMode,

            string waitingRoomId,

            string zoneId)
        {
            CreatedOn = createdOn;
            CustomPageHtml = customPageHtml;
            Description = description;
            DisableSessionRenewal = disableSessionRenewal;
            EventEndTime = eventEndTime;
            EventId = eventId;
            EventStartTime = eventStartTime;
            Id = id;
            ModifiedOn = modifiedOn;
            Name = name;
            NewUsersPerMinute = newUsersPerMinute;
            PrequeueStartTime = prequeueStartTime;
            QueueingMethod = queueingMethod;
            SessionDuration = sessionDuration;
            ShuffleAtEventStart = shuffleAtEventStart;
            Suspended = suspended;
            TotalActiveUsers = totalActiveUsers;
            TurnstileAction = turnstileAction;
            TurnstileMode = turnstileMode;
            WaitingRoomId = waitingRoomId;
            ZoneId = zoneId;
        }
    }
}
