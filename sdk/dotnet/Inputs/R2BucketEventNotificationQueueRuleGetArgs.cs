// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class R2BucketEventNotificationQueueRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<string>? _actions;

        /// <summary>
        /// Array of R2 object actions that will trigger notifications.
        /// </summary>
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        /// <summary>
        /// Timestamp when the rule was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// A description that can be used to identify the event notification rule after creation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Notifications will be sent only for objects with this prefix.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Rule ID.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        /// <summary>
        /// Notifications will be sent only for objects with this suffix.
        /// </summary>
        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        public R2BucketEventNotificationQueueRuleGetArgs()
        {
        }
        public static new R2BucketEventNotificationQueueRuleGetArgs Empty => new R2BucketEventNotificationQueueRuleGetArgs();
    }
}
