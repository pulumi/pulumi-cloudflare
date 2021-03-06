// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class PageRuleActionsMinify
    {
        /// <summary>
        /// Whether CSS should be minified. Valid values are `"on"` or `"off"`.
        /// </summary>
        public readonly string Css;
        /// <summary>
        /// Whether HTML should be minified. Valid values are `"on"` or `"off"`.
        /// </summary>
        public readonly string Html;
        /// <summary>
        /// Whether Javascript should be minified. Valid values are `"on"` or `"off"`.
        /// </summary>
        public readonly string Js;

        [OutputConstructor]
        private PageRuleActionsMinify(
            string css,

            string html,

            string js)
        {
            Css = css;
            Html = html;
            Js = js;
        }
    }
}
