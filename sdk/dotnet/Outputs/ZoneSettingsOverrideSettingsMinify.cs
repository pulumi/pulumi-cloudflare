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
    public sealed class ZoneSettingsOverrideSettingsMinify
    {
        public readonly string Css;
        public readonly string Html;
        public readonly string Js;

        [OutputConstructor]
        private ZoneSettingsOverrideSettingsMinify(
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
