// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessOrganizationLoginDesignArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The background color on the login page.
        /// </summary>
        [Input("backgroundColor")]
        public Input<string>? BackgroundColor { get; set; }

        /// <summary>
        /// The text at the bottom of the login page.
        /// </summary>
        [Input("footerText")]
        public Input<string>? FooterText { get; set; }

        /// <summary>
        /// The text at the top of the login page.
        /// </summary>
        [Input("headerText")]
        public Input<string>? HeaderText { get; set; }

        /// <summary>
        /// The URL of the logo on the login page.
        /// </summary>
        [Input("logoPath")]
        public Input<string>? LogoPath { get; set; }

        /// <summary>
        /// The text color on the login page.
        /// </summary>
        [Input("textColor")]
        public Input<string>? TextColor { get; set; }

        public AccessOrganizationLoginDesignArgs()
        {
        }
        public static new AccessOrganizationLoginDesignArgs Empty => new AccessOrganizationLoginDesignArgs();
    }
}