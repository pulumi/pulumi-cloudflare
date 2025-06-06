// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetPageShieldCookies
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
        ///     var examplePageShieldCookies = Cloudflare.GetPageShieldCookies.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         CookieId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPageShieldCookiesResult> InvokeAsync(GetPageShieldCookiesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPageShieldCookiesResult>("cloudflare:index/getPageShieldCookies:getPageShieldCookies", args ?? new GetPageShieldCookiesArgs(), options.WithDefaults());

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
        ///     var examplePageShieldCookies = Cloudflare.GetPageShieldCookies.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         CookieId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPageShieldCookiesResult> Invoke(GetPageShieldCookiesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPageShieldCookiesResult>("cloudflare:index/getPageShieldCookies:getPageShieldCookies", args ?? new GetPageShieldCookiesInvokeArgs(), options.WithDefaults());

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
        ///     var examplePageShieldCookies = Cloudflare.GetPageShieldCookies.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         CookieId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPageShieldCookiesResult> Invoke(GetPageShieldCookiesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPageShieldCookiesResult>("cloudflare:index/getPageShieldCookies:getPageShieldCookies", args ?? new GetPageShieldCookiesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPageShieldCookiesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("cookieId", required: true)]
        public string CookieId { get; set; } = null!;

        /// <summary>
        /// Identifier
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetPageShieldCookiesArgs()
        {
        }
        public static new GetPageShieldCookiesArgs Empty => new GetPageShieldCookiesArgs();
    }

    public sealed class GetPageShieldCookiesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("cookieId", required: true)]
        public Input<string> CookieId { get; set; } = null!;

        /// <summary>
        /// Identifier
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetPageShieldCookiesInvokeArgs()
        {
        }
        public static new GetPageShieldCookiesInvokeArgs Empty => new GetPageShieldCookiesInvokeArgs();
    }


    [OutputType]
    public sealed class GetPageShieldCookiesResult
    {
        /// <summary>
        /// Identifier
        /// </summary>
        public readonly string CookieId;
        public readonly string DomainAttribute;
        public readonly string ExpiresAttribute;
        public readonly string FirstSeenAt;
        public readonly string Host;
        public readonly bool HttpOnlyAttribute;
        /// <summary>
        /// Identifier
        /// </summary>
        public readonly string Id;
        public readonly string LastSeenAt;
        public readonly int MaxAgeAttribute;
        public readonly string Name;
        public readonly ImmutableArray<string> PageUrls;
        public readonly string PathAttribute;
        /// <summary>
        /// Available values: "lax", "strict", "none".
        /// </summary>
        public readonly string SameSiteAttribute;
        public readonly bool SecureAttribute;
        /// <summary>
        /// Available values: "first_party", "unknown".
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Identifier
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetPageShieldCookiesResult(
            string cookieId,

            string domainAttribute,

            string expiresAttribute,

            string firstSeenAt,

            string host,

            bool httpOnlyAttribute,

            string id,

            string lastSeenAt,

            int maxAgeAttribute,

            string name,

            ImmutableArray<string> pageUrls,

            string pathAttribute,

            string sameSiteAttribute,

            bool secureAttribute,

            string type,

            string zoneId)
        {
            CookieId = cookieId;
            DomainAttribute = domainAttribute;
            ExpiresAttribute = expiresAttribute;
            FirstSeenAt = firstSeenAt;
            Host = host;
            HttpOnlyAttribute = httpOnlyAttribute;
            Id = id;
            LastSeenAt = lastSeenAt;
            MaxAgeAttribute = maxAgeAttribute;
            Name = name;
            PageUrls = pageUrls;
            PathAttribute = pathAttribute;
            SameSiteAttribute = sameSiteAttribute;
            SecureAttribute = secureAttribute;
            Type = type;
            ZoneId = zoneId;
        }
    }
}
