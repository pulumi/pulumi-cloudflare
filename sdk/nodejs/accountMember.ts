// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleAccountMember = new cloudflare.AccountMember("example_account_member", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     email: "user@example.com",
 *     roles: ["3536bcfad5faccb999b47003c79917fb"],
 *     status: "accepted",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/accountMember:AccountMember example '<account_id>/<member_id>'
 * ```
 */
export class AccountMember extends pulumi.CustomResource {
    /**
     * Get an existing AccountMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountMemberState, opts?: pulumi.CustomResourceOptions): AccountMember {
        return new AccountMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accountMember:AccountMember';

    /**
     * Returns true if the given object is an instance of AccountMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccountMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccountMember.__pulumiType;
    }

    /**
     * Account identifier tag.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The contact email address of the user.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * Array of policies associated with this member.
     */
    public readonly policies!: pulumi.Output<outputs.AccountMemberPolicy[]>;
    /**
     * Array of roles associated with this member.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * Available values: "accepted", "pending".
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * Details of the user associated to the membership.
     */
    public /*out*/ readonly user!: pulumi.Output<outputs.AccountMemberUser>;

    /**
     * Create a AccountMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountMemberArgs | AccountMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountMemberState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["policies"] = state ? state.policies : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as AccountMemberArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["policies"] = args ? args.policies : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["user"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccountMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccountMember resources.
 */
export interface AccountMemberState {
    /**
     * Account identifier tag.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The contact email address of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * Array of policies associated with this member.
     */
    policies?: pulumi.Input<pulumi.Input<inputs.AccountMemberPolicy>[]>;
    /**
     * Array of roles associated with this member.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Available values: "accepted", "pending".
     */
    status?: pulumi.Input<string>;
    /**
     * Details of the user associated to the membership.
     */
    user?: pulumi.Input<inputs.AccountMemberUser>;
}

/**
 * The set of arguments for constructing a AccountMember resource.
 */
export interface AccountMemberArgs {
    /**
     * Account identifier tag.
     */
    accountId: pulumi.Input<string>;
    /**
     * The contact email address of the user.
     */
    email: pulumi.Input<string>;
    /**
     * Array of policies associated with this member.
     */
    policies?: pulumi.Input<pulumi.Input<inputs.AccountMemberPolicy>[]>;
    /**
     * Array of roles associated with this member.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Available values: "accepted", "pending".
     */
    status?: pulumi.Input<string>;
}
