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
    /// Provides a Cloudflare Waiting Room resource.
    /// 
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
    ///     // Waiting Room
    ///     var example = new Cloudflare.WaitingRoom("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Name = "foo",
    ///         Host = "foo.example.com",
    ///         Path = "/",
    ///         NewUsersPerMinute = 200,
    ///         TotalActiveUsers = 200,
    ///         CookieSuffix = "queue1",
    ///         AdditionalRoutes = new[]
    ///         {
    ///             new Cloudflare.Inputs.WaitingRoomAdditionalRouteArgs
    ///             {
    ///                 Host = "shop1.example.com",
    ///                 Path = "/example-path",
    ///             },
    ///             new Cloudflare.Inputs.WaitingRoomAdditionalRouteArgs
    ///             {
    ///                 Host = "shop2.example.com",
    ///             },
    ///         },
    ///         QueueingStatusCode = 200,
    ///         EnabledOriginCommands = new[]
    ///         {
    ///             "revoke",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Use the Zone ID and Waiting Room ID to import.
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/waitingRoom:WaitingRoom default &lt;zone_id&gt;/&lt;waiting_room_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/waitingRoom:WaitingRoom")]
    public partial class WaitingRoom : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of additional hostname and paths combination to be applied on the waiting room.
        /// </summary>
        [Output("additionalRoutes")]
        public Output<ImmutableArray<Outputs.WaitingRoomAdditionalRoute>> AdditionalRoutes { get; private set; } = null!;

        /// <summary>
        /// A cookie suffix to be appended to the Cloudflare waiting room cookie name.
        /// </summary>
        [Output("cookieSuffix")]
        public Output<string?> CookieSuffix { get; private set; } = null!;

        /// <summary>
        /// This is a templated html file that will be rendered at the edge.
        /// </summary>
        [Output("customPageHtml")]
        public Output<string?> CustomPageHtml { get; private set; } = null!;

        /// <summary>
        /// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`, `bg-BG`, `hr-HR`, `cs-CZ`, `da-DK`, `fi-FI`, `lt-LT`, `ms-MY`, `nb-NO`, `ro-RO`, `el-GR`, `he-IL`, `hi-IN`, `hu-HU`, `sr-BA`, `sk-SK`, `sl-SI`, `sv-SE`, `tl-PH`, `th-TH`, `uk-UA`, `vi-VN`. Defaults to `en-US`.
        /// </summary>
        [Output("defaultTemplateLanguage")]
        public Output<string?> DefaultTemplateLanguage { get; private set; } = null!;

        /// <summary>
        /// A description to add more details about the waiting room.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Disables automatic renewal of session cookies.
        /// </summary>
        [Output("disableSessionRenewal")]
        public Output<bool?> DisableSessionRenewal { get; private set; } = null!;

        /// <summary>
        /// The list of enabled origin commands for the waiting room. Available values: `revoke`.
        /// </summary>
        [Output("enabledOriginCommands")]
        public Output<ImmutableArray<string>> EnabledOriginCommands { get; private set; } = null!;

        /// <summary>
        /// Host name for which the waiting room will be applied (no wildcards).
        /// </summary>
        [Output("host")]
        public Output<string> Host { get; private set; } = null!;

        /// <summary>
        /// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
        /// </summary>
        [Output("jsonResponseEnabled")]
        public Output<bool?> JsonResponseEnabled { get; private set; } = null!;

        /// <summary>
        /// A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of new users that will be let into the route every minute.
        /// </summary>
        [Output("newUsersPerMinute")]
        public Output<int> NewUsersPerMinute { get; private set; } = null!;

        /// <summary>
        /// The path within the host to enable the waiting room on. Defaults to `/`.
        /// </summary>
        [Output("path")]
        public Output<string?> Path { get; private set; } = null!;

        /// <summary>
        /// If queue_all is true, then all traffic will be sent to the waiting room.
        /// </summary>
        [Output("queueAll")]
        public Output<bool?> QueueAll { get; private set; } = null!;

        /// <summary>
        /// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
        /// </summary>
        [Output("queueingMethod")]
        public Output<string?> QueueingMethod { get; private set; } = null!;

        /// <summary>
        /// HTTP status code returned to a user while in the queue. Defaults to `200`.
        /// </summary>
        [Output("queueingStatusCode")]
        public Output<int?> QueueingStatusCode { get; private set; } = null!;

        /// <summary>
        /// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
        /// </summary>
        [Output("sessionDuration")]
        public Output<int?> SessionDuration { get; private set; } = null!;

        /// <summary>
        /// Suspends the waiting room.
        /// </summary>
        [Output("suspended")]
        public Output<bool?> Suspended { get; private set; } = null!;

        /// <summary>
        /// The total number of active user sessions on the route at a point in time.
        /// </summary>
        [Output("totalActiveUsers")]
        public Output<int> TotalActiveUsers { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WaitingRoom resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WaitingRoom(string name, WaitingRoomArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoom:WaitingRoom", name, args ?? new WaitingRoomArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WaitingRoom(string name, Input<string> id, WaitingRoomState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoom:WaitingRoom", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WaitingRoom resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WaitingRoom Get(string name, Input<string> id, WaitingRoomState? state = null, CustomResourceOptions? options = null)
        {
            return new WaitingRoom(name, id, state, options);
        }
    }

    public sealed class WaitingRoomArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalRoutes")]
        private InputList<Inputs.WaitingRoomAdditionalRouteArgs>? _additionalRoutes;

        /// <summary>
        /// A list of additional hostname and paths combination to be applied on the waiting room.
        /// </summary>
        public InputList<Inputs.WaitingRoomAdditionalRouteArgs> AdditionalRoutes
        {
            get => _additionalRoutes ?? (_additionalRoutes = new InputList<Inputs.WaitingRoomAdditionalRouteArgs>());
            set => _additionalRoutes = value;
        }

        /// <summary>
        /// A cookie suffix to be appended to the Cloudflare waiting room cookie name.
        /// </summary>
        [Input("cookieSuffix")]
        public Input<string>? CookieSuffix { get; set; }

        /// <summary>
        /// This is a templated html file that will be rendered at the edge.
        /// </summary>
        [Input("customPageHtml")]
        public Input<string>? CustomPageHtml { get; set; }

        /// <summary>
        /// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`, `bg-BG`, `hr-HR`, `cs-CZ`, `da-DK`, `fi-FI`, `lt-LT`, `ms-MY`, `nb-NO`, `ro-RO`, `el-GR`, `he-IL`, `hi-IN`, `hu-HU`, `sr-BA`, `sk-SK`, `sl-SI`, `sv-SE`, `tl-PH`, `th-TH`, `uk-UA`, `vi-VN`. Defaults to `en-US`.
        /// </summary>
        [Input("defaultTemplateLanguage")]
        public Input<string>? DefaultTemplateLanguage { get; set; }

        /// <summary>
        /// A description to add more details about the waiting room.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Disables automatic renewal of session cookies.
        /// </summary>
        [Input("disableSessionRenewal")]
        public Input<bool>? DisableSessionRenewal { get; set; }

        [Input("enabledOriginCommands")]
        private InputList<string>? _enabledOriginCommands;

        /// <summary>
        /// The list of enabled origin commands for the waiting room. Available values: `revoke`.
        /// </summary>
        public InputList<string> EnabledOriginCommands
        {
            get => _enabledOriginCommands ?? (_enabledOriginCommands = new InputList<string>());
            set => _enabledOriginCommands = value;
        }

        /// <summary>
        /// Host name for which the waiting room will be applied (no wildcards).
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        /// <summary>
        /// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
        /// </summary>
        [Input("jsonResponseEnabled")]
        public Input<bool>? JsonResponseEnabled { get; set; }

        /// <summary>
        /// A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The number of new users that will be let into the route every minute.
        /// </summary>
        [Input("newUsersPerMinute", required: true)]
        public Input<int> NewUsersPerMinute { get; set; } = null!;

        /// <summary>
        /// The path within the host to enable the waiting room on. Defaults to `/`.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// If queue_all is true, then all traffic will be sent to the waiting room.
        /// </summary>
        [Input("queueAll")]
        public Input<bool>? QueueAll { get; set; }

        /// <summary>
        /// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
        /// </summary>
        [Input("queueingMethod")]
        public Input<string>? QueueingMethod { get; set; }

        /// <summary>
        /// HTTP status code returned to a user while in the queue. Defaults to `200`.
        /// </summary>
        [Input("queueingStatusCode")]
        public Input<int>? QueueingStatusCode { get; set; }

        /// <summary>
        /// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<int>? SessionDuration { get; set; }

        /// <summary>
        /// Suspends the waiting room.
        /// </summary>
        [Input("suspended")]
        public Input<bool>? Suspended { get; set; }

        /// <summary>
        /// The total number of active user sessions on the route at a point in time.
        /// </summary>
        [Input("totalActiveUsers", required: true)]
        public Input<int> TotalActiveUsers { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WaitingRoomArgs()
        {
        }
        public static new WaitingRoomArgs Empty => new WaitingRoomArgs();
    }

    public sealed class WaitingRoomState : global::Pulumi.ResourceArgs
    {
        [Input("additionalRoutes")]
        private InputList<Inputs.WaitingRoomAdditionalRouteGetArgs>? _additionalRoutes;

        /// <summary>
        /// A list of additional hostname and paths combination to be applied on the waiting room.
        /// </summary>
        public InputList<Inputs.WaitingRoomAdditionalRouteGetArgs> AdditionalRoutes
        {
            get => _additionalRoutes ?? (_additionalRoutes = new InputList<Inputs.WaitingRoomAdditionalRouteGetArgs>());
            set => _additionalRoutes = value;
        }

        /// <summary>
        /// A cookie suffix to be appended to the Cloudflare waiting room cookie name.
        /// </summary>
        [Input("cookieSuffix")]
        public Input<string>? CookieSuffix { get; set; }

        /// <summary>
        /// This is a templated html file that will be rendered at the edge.
        /// </summary>
        [Input("customPageHtml")]
        public Input<string>? CustomPageHtml { get; set; }

        /// <summary>
        /// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`, `bg-BG`, `hr-HR`, `cs-CZ`, `da-DK`, `fi-FI`, `lt-LT`, `ms-MY`, `nb-NO`, `ro-RO`, `el-GR`, `he-IL`, `hi-IN`, `hu-HU`, `sr-BA`, `sk-SK`, `sl-SI`, `sv-SE`, `tl-PH`, `th-TH`, `uk-UA`, `vi-VN`. Defaults to `en-US`.
        /// </summary>
        [Input("defaultTemplateLanguage")]
        public Input<string>? DefaultTemplateLanguage { get; set; }

        /// <summary>
        /// A description to add more details about the waiting room.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Disables automatic renewal of session cookies.
        /// </summary>
        [Input("disableSessionRenewal")]
        public Input<bool>? DisableSessionRenewal { get; set; }

        [Input("enabledOriginCommands")]
        private InputList<string>? _enabledOriginCommands;

        /// <summary>
        /// The list of enabled origin commands for the waiting room. Available values: `revoke`.
        /// </summary>
        public InputList<string> EnabledOriginCommands
        {
            get => _enabledOriginCommands ?? (_enabledOriginCommands = new InputList<string>());
            set => _enabledOriginCommands = value;
        }

        /// <summary>
        /// Host name for which the waiting room will be applied (no wildcards).
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
        /// </summary>
        [Input("jsonResponseEnabled")]
        public Input<bool>? JsonResponseEnabled { get; set; }

        /// <summary>
        /// A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of new users that will be let into the route every minute.
        /// </summary>
        [Input("newUsersPerMinute")]
        public Input<int>? NewUsersPerMinute { get; set; }

        /// <summary>
        /// The path within the host to enable the waiting room on. Defaults to `/`.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// If queue_all is true, then all traffic will be sent to the waiting room.
        /// </summary>
        [Input("queueAll")]
        public Input<bool>? QueueAll { get; set; }

        /// <summary>
        /// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
        /// </summary>
        [Input("queueingMethod")]
        public Input<string>? QueueingMethod { get; set; }

        /// <summary>
        /// HTTP status code returned to a user while in the queue. Defaults to `200`.
        /// </summary>
        [Input("queueingStatusCode")]
        public Input<int>? QueueingStatusCode { get; set; }

        /// <summary>
        /// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<int>? SessionDuration { get; set; }

        /// <summary>
        /// Suspends the waiting room.
        /// </summary>
        [Input("suspended")]
        public Input<bool>? Suspended { get; set; }

        /// <summary>
        /// The total number of active user sessions on the route at a point in time.
        /// </summary>
        [Input("totalActiveUsers")]
        public Input<int>? TotalActiveUsers { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WaitingRoomState()
        {
        }
        public static new WaitingRoomState Empty => new WaitingRoomState();
    }
}
