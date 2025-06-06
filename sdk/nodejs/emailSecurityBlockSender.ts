// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleEmailSecurityBlockSender = new cloudflare.EmailSecurityBlockSender("example_email_security_block_sender", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     isRegex: true,
 *     pattern: "x",
 *     patternType: "EMAIL",
 *     comments: "comments",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/emailSecurityBlockSender:EmailSecurityBlockSender example '<account_id>/<pattern_id>'
 * ```
 */
export class EmailSecurityBlockSender extends pulumi.CustomResource {
    /**
     * Get an existing EmailSecurityBlockSender resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailSecurityBlockSenderState, opts?: pulumi.CustomResourceOptions): EmailSecurityBlockSender {
        return new EmailSecurityBlockSender(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/emailSecurityBlockSender:EmailSecurityBlockSender';

    /**
     * Returns true if the given object is an instance of EmailSecurityBlockSender.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailSecurityBlockSender {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailSecurityBlockSender.__pulumiType;
    }

    /**
     * Account Identifier
     */
    public readonly accountId!: pulumi.Output<string>;
    public readonly comments!: pulumi.Output<string | undefined>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    public readonly isRegex!: pulumi.Output<boolean>;
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    public readonly pattern!: pulumi.Output<string>;
    /**
     * Available values: "EMAIL", "DOMAIN", "IP", "UNKNOWN".
     */
    public readonly patternType!: pulumi.Output<string>;

    /**
     * Create a EmailSecurityBlockSender resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailSecurityBlockSenderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailSecurityBlockSenderArgs | EmailSecurityBlockSenderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailSecurityBlockSenderState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["comments"] = state ? state.comments : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["isRegex"] = state ? state.isRegex : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["pattern"] = state ? state.pattern : undefined;
            resourceInputs["patternType"] = state ? state.patternType : undefined;
        } else {
            const args = argsOrState as EmailSecurityBlockSenderArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.isRegex === undefined) && !opts.urn) {
                throw new Error("Missing required property 'isRegex'");
            }
            if ((!args || args.pattern === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pattern'");
            }
            if ((!args || args.patternType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'patternType'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["comments"] = args ? args.comments : undefined;
            resourceInputs["isRegex"] = args ? args.isRegex : undefined;
            resourceInputs["pattern"] = args ? args.pattern : undefined;
            resourceInputs["patternType"] = args ? args.patternType : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["lastModified"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailSecurityBlockSender.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailSecurityBlockSender resources.
 */
export interface EmailSecurityBlockSenderState {
    /**
     * Account Identifier
     */
    accountId?: pulumi.Input<string>;
    comments?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    isRegex?: pulumi.Input<boolean>;
    lastModified?: pulumi.Input<string>;
    pattern?: pulumi.Input<string>;
    /**
     * Available values: "EMAIL", "DOMAIN", "IP", "UNKNOWN".
     */
    patternType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailSecurityBlockSender resource.
 */
export interface EmailSecurityBlockSenderArgs {
    /**
     * Account Identifier
     */
    accountId: pulumi.Input<string>;
    comments?: pulumi.Input<string>;
    isRegex: pulumi.Input<boolean>;
    pattern: pulumi.Input<string>;
    /**
     * Available values: "EMAIL", "DOMAIN", "IP", "UNKNOWN".
     */
    patternType: pulumi.Input<string>;
}
