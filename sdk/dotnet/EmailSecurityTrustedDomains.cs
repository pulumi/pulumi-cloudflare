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
    ///     var exampleEmailSecurityTrustedDomains = new Cloudflare.EmailSecurityTrustedDomains("example_email_security_trusted_domains", new()
    ///     {
    ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///         IsRecent = true,
    ///         IsRegex = true,
    ///         IsSimilarity = true,
    ///         Pattern = "x",
    ///         Comments = "comments",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/emailSecurityTrustedDomains:EmailSecurityTrustedDomains example '&lt;account_id&gt;/&lt;trusted_domain_id&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/emailSecurityTrustedDomains:EmailSecurityTrustedDomains")]
    public partial class EmailSecurityTrustedDomains : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Identifier
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("bodies")]
        public Output<ImmutableArray<Outputs.EmailSecurityTrustedDomainsBody>> Bodies { get; private set; } = null!;

        [Output("comments")]
        public Output<string?> Comments { get; private set; } = null!;

        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Select to prevent recently registered domains from triggering a
        /// Suspicious or Malicious disposition.
        /// </summary>
        [Output("isRecent")]
        public Output<bool?> IsRecent { get; private set; } = null!;

        [Output("isRegex")]
        public Output<bool?> IsRegex { get; private set; } = null!;

        /// <summary>
        /// Select for partner or other approved domains that have similar
        /// spelling to your connected domains. Prevents listed domains from
        /// triggering a Spoof disposition.
        /// </summary>
        [Output("isSimilarity")]
        public Output<bool?> IsSimilarity { get; private set; } = null!;

        [Output("lastModified")]
        public Output<string> LastModified { get; private set; } = null!;

        [Output("pattern")]
        public Output<string?> Pattern { get; private set; } = null!;


        /// <summary>
        /// Create a EmailSecurityTrustedDomains resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EmailSecurityTrustedDomains(string name, EmailSecurityTrustedDomainsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailSecurityTrustedDomains:EmailSecurityTrustedDomains", name, args ?? new EmailSecurityTrustedDomainsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EmailSecurityTrustedDomains(string name, Input<string> id, EmailSecurityTrustedDomainsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailSecurityTrustedDomains:EmailSecurityTrustedDomains", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EmailSecurityTrustedDomains resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EmailSecurityTrustedDomains Get(string name, Input<string> id, EmailSecurityTrustedDomainsState? state = null, CustomResourceOptions? options = null)
        {
            return new EmailSecurityTrustedDomains(name, id, state, options);
        }
    }

    public sealed class EmailSecurityTrustedDomainsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Identifier
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("bodies")]
        private InputList<Inputs.EmailSecurityTrustedDomainsBodyArgs>? _bodies;
        public InputList<Inputs.EmailSecurityTrustedDomainsBodyArgs> Bodies
        {
            get => _bodies ?? (_bodies = new InputList<Inputs.EmailSecurityTrustedDomainsBodyArgs>());
            set => _bodies = value;
        }

        [Input("comments")]
        public Input<string>? Comments { get; set; }

        /// <summary>
        /// Select to prevent recently registered domains from triggering a
        /// Suspicious or Malicious disposition.
        /// </summary>
        [Input("isRecent")]
        public Input<bool>? IsRecent { get; set; }

        [Input("isRegex")]
        public Input<bool>? IsRegex { get; set; }

        /// <summary>
        /// Select for partner or other approved domains that have similar
        /// spelling to your connected domains. Prevents listed domains from
        /// triggering a Spoof disposition.
        /// </summary>
        [Input("isSimilarity")]
        public Input<bool>? IsSimilarity { get; set; }

        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        public EmailSecurityTrustedDomainsArgs()
        {
        }
        public static new EmailSecurityTrustedDomainsArgs Empty => new EmailSecurityTrustedDomainsArgs();
    }

    public sealed class EmailSecurityTrustedDomainsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Identifier
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("bodies")]
        private InputList<Inputs.EmailSecurityTrustedDomainsBodyGetArgs>? _bodies;
        public InputList<Inputs.EmailSecurityTrustedDomainsBodyGetArgs> Bodies
        {
            get => _bodies ?? (_bodies = new InputList<Inputs.EmailSecurityTrustedDomainsBodyGetArgs>());
            set => _bodies = value;
        }

        [Input("comments")]
        public Input<string>? Comments { get; set; }

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Select to prevent recently registered domains from triggering a
        /// Suspicious or Malicious disposition.
        /// </summary>
        [Input("isRecent")]
        public Input<bool>? IsRecent { get; set; }

        [Input("isRegex")]
        public Input<bool>? IsRegex { get; set; }

        /// <summary>
        /// Select for partner or other approved domains that have similar
        /// spelling to your connected domains. Prevents listed domains from
        /// triggering a Spoof disposition.
        /// </summary>
        [Input("isSimilarity")]
        public Input<bool>? IsSimilarity { get; set; }

        [Input("lastModified")]
        public Input<string>? LastModified { get; set; }

        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        public EmailSecurityTrustedDomainsState()
        {
        }
        public static new EmailSecurityTrustedDomainsState Empty => new EmailSecurityTrustedDomainsState();
    }
}
