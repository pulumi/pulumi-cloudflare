// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZoneSettingsOverrideInitialSettingMinifyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("css", required: true)]
        public Input<string> Css { get; set; } = null!;

        [Input("html", required: true)]
        public Input<string> Html { get; set; } = null!;

        [Input("js", required: true)]
        public Input<string> Js { get; set; } = null!;

        public ZoneSettingsOverrideInitialSettingMinifyGetArgs()
        {
        }
        public static new ZoneSettingsOverrideInitialSettingMinifyGetArgs Empty => new ZoneSettingsOverrideInitialSettingMinifyGetArgs();
    }
}
