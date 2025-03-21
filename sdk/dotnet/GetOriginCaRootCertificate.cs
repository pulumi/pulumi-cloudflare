// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetOriginCaRootCertificate
    {
        /// <summary>
        /// Use this data source to get the
        /// [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates)
        /// for a given algorithm."
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
        ///     var example = Cloudflare.GetOriginCaRootCertificate.Invoke(new()
        ///     {
        ///         Algorithm = "rsa",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOriginCaRootCertificateResult> InvokeAsync(GetOriginCaRootCertificateArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOriginCaRootCertificateResult>("cloudflare:index/getOriginCaRootCertificate:getOriginCaRootCertificate", args ?? new GetOriginCaRootCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the
        /// [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates)
        /// for a given algorithm."
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
        ///     var example = Cloudflare.GetOriginCaRootCertificate.Invoke(new()
        ///     {
        ///         Algorithm = "rsa",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOriginCaRootCertificateResult> Invoke(GetOriginCaRootCertificateInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOriginCaRootCertificateResult>("cloudflare:index/getOriginCaRootCertificate:getOriginCaRootCertificate", args ?? new GetOriginCaRootCertificateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the
        /// [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates)
        /// for a given algorithm."
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
        ///     var example = Cloudflare.GetOriginCaRootCertificate.Invoke(new()
        ///     {
        ///         Algorithm = "rsa",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOriginCaRootCertificateResult> Invoke(GetOriginCaRootCertificateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetOriginCaRootCertificateResult>("cloudflare:index/getOriginCaRootCertificate:getOriginCaRootCertificate", args ?? new GetOriginCaRootCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOriginCaRootCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
        /// </summary>
        [Input("algorithm", required: true)]
        public string Algorithm { get; set; } = null!;

        public GetOriginCaRootCertificateArgs()
        {
        }
        public static new GetOriginCaRootCertificateArgs Empty => new GetOriginCaRootCertificateArgs();
    }

    public sealed class GetOriginCaRootCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
        /// </summary>
        [Input("algorithm", required: true)]
        public Input<string> Algorithm { get; set; } = null!;

        public GetOriginCaRootCertificateInvokeArgs()
        {
        }
        public static new GetOriginCaRootCertificateInvokeArgs Empty => new GetOriginCaRootCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetOriginCaRootCertificateResult
    {
        /// <summary>
        /// The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
        /// </summary>
        public readonly string Algorithm;
        /// <summary>
        /// The Origin CA root certificate in PEM format.
        /// </summary>
        public readonly string CertPem;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetOriginCaRootCertificateResult(
            string algorithm,

            string certPem,

            string id)
        {
            Algorithm = algorithm;
            CertPem = certPem;
            Id = id;
        }
    }
}
