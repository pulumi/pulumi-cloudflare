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
 * const exampleEmailRoutingAddress = new cloudflare.EmailRoutingAddress("example_email_routing_address", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     email: "user@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/emailRoutingAddress:EmailRoutingAddress example '<account_id>/<destination_address_identifier>'
 * ```
 */
export class EmailRoutingAddress extends pulumi.CustomResource {
    /**
     * Get an existing EmailRoutingAddress resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailRoutingAddressState, opts?: pulumi.CustomResourceOptions): EmailRoutingAddress {
        return new EmailRoutingAddress(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/emailRoutingAddress:EmailRoutingAddress';

    /**
     * Returns true if the given object is an instance of EmailRoutingAddress.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailRoutingAddress {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailRoutingAddress.__pulumiType;
    }

    /**
     * Identifier.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The date and time the destination address has been created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The contact email address of the user.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * The date and time the destination address was last modified.
     */
    public /*out*/ readonly modified!: pulumi.Output<string>;
    /**
     * Destination address tag. (Deprecated, replaced by destination address identifier)
     *
     * @deprecated This attribute is deprecated.
     */
    public /*out*/ readonly tag!: pulumi.Output<string>;
    /**
     * The date and time the destination address has been verified. Null means not verified yet.
     */
    public /*out*/ readonly verified!: pulumi.Output<string>;

    /**
     * Create a EmailRoutingAddress resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailRoutingAddressArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailRoutingAddressArgs | EmailRoutingAddressState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailRoutingAddressState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["modified"] = state ? state.modified : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
            resourceInputs["verified"] = state ? state.verified : undefined;
        } else {
            const args = argsOrState as EmailRoutingAddressArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["modified"] = undefined /*out*/;
            resourceInputs["tag"] = undefined /*out*/;
            resourceInputs["verified"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailRoutingAddress.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailRoutingAddress resources.
 */
export interface EmailRoutingAddressState {
    /**
     * Identifier.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The date and time the destination address has been created.
     */
    created?: pulumi.Input<string>;
    /**
     * The contact email address of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * The date and time the destination address was last modified.
     */
    modified?: pulumi.Input<string>;
    /**
     * Destination address tag. (Deprecated, replaced by destination address identifier)
     *
     * @deprecated This attribute is deprecated.
     */
    tag?: pulumi.Input<string>;
    /**
     * The date and time the destination address has been verified. Null means not verified yet.
     */
    verified?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailRoutingAddress resource.
 */
export interface EmailRoutingAddressArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * The contact email address of the user.
     */
    email: pulumi.Input<string>;
}
