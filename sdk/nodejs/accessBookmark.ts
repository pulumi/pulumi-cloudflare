// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Bookmark resource. Access Bookmark
 * applications are not protected behind Access but are displayed in
 * the App Launcher.
 *
 * > It's required that an `accountId` or `zoneId` is provided and in
 * most cases using either is fine. However, if you're using a scoped
 * access token, you must provide the argument that matches the token's
 * scope. For example, an access token that is scoped to the "example.com"
 * zone needs to use the `zoneId` argument.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const myBookmarkApp = new cloudflare.AccessBookmark("my_bookmark_app", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     appLauncherVisible: true,
 *     domain: "example.com",
 *     logoUrl: "https://example.com/example.png",
 *     name: "My Bookmark App",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessBookmark:AccessBookmark example <account_id>/<bookmark_id>
 * ```
 */
export class AccessBookmark extends pulumi.CustomResource {
    /**
     * Get an existing AccessBookmark resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessBookmarkState, opts?: pulumi.CustomResourceOptions): AccessBookmark {
        return new AccessBookmark(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessBookmark:AccessBookmark';

    /**
     * Returns true if the given object is an instance of AccessBookmark.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessBookmark {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessBookmark.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Option to show/hide the bookmark in the app launcher. Defaults to `true`.
     */
    public readonly appLauncherVisible!: pulumi.Output<boolean | undefined>;
    /**
     * The domain of the bookmark application. Can include subdomains, paths, or both.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * The image URL for the logo shown in the app launcher dashboard.
     */
    public readonly logoUrl!: pulumi.Output<string | undefined>;
    /**
     * Name of the bookmark application.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessBookmark resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessBookmarkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessBookmarkArgs | AccessBookmarkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessBookmarkState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["appLauncherVisible"] = state ? state.appLauncherVisible : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessBookmarkArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["appLauncherVisible"] = args ? args.appLauncherVisible : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["logoUrl"] = args ? args.logoUrl : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessBookmark.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessBookmark resources.
 */
export interface AccessBookmarkState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Option to show/hide the bookmark in the app launcher. Defaults to `true`.
     */
    appLauncherVisible?: pulumi.Input<boolean>;
    /**
     * The domain of the bookmark application. Can include subdomains, paths, or both.
     */
    domain?: pulumi.Input<string>;
    /**
     * The image URL for the logo shown in the app launcher dashboard.
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Name of the bookmark application.
     */
    name?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessBookmark resource.
 */
export interface AccessBookmarkArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Option to show/hide the bookmark in the app launcher. Defaults to `true`.
     */
    appLauncherVisible?: pulumi.Input<boolean>;
    /**
     * The domain of the bookmark application. Can include subdomains, paths, or both.
     */
    domain: pulumi.Input<string>;
    /**
     * The image URL for the logo shown in the app launcher dashboard.
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Name of the bookmark application.
     */
    name: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}