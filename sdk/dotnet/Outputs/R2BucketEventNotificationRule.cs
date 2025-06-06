// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class R2BucketEventNotificationRule
    {
        /// <summary>
        /// Array of R2 object actions that will trigger notifications.
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// A description that can be used to identify the event notification rule after creation.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Notifications will be sent only for objects with this prefix.
        /// </summary>
        public readonly string? Prefix;
        /// <summary>
        /// Notifications will be sent only for objects with this suffix.
        /// </summary>
        public readonly string? Suffix;

        [OutputConstructor]
        private R2BucketEventNotificationRule(
            ImmutableArray<string> actions,

            string? description,

            string? prefix,

            string? suffix)
        {
            Actions = actions;
            Description = description;
            Prefix = prefix;
            Suffix = suffix;
        }
    }
}
