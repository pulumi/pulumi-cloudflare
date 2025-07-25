// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class QueueConsumerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A Resource identifier.
        /// </summary>
        [Input("consumerId")]
        public Input<string>? ConsumerId { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// A Resource identifier.
        /// </summary>
        [Input("queueId")]
        public Input<string>? QueueId { get; set; }

        /// <summary>
        /// Name of a Worker
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        /// <summary>
        /// Name of a Worker
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        [Input("settings")]
        public Input<Inputs.QueueConsumerSettingsArgs>? Settings { get; set; }

        /// <summary>
        /// Available values: "worker", "http_pull".
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public QueueConsumerArgs()
        {
        }
        public static new QueueConsumerArgs Empty => new QueueConsumerArgs();
    }
}
