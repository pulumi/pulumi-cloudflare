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
 * const exampleUser = new cloudflare.User("example_user", {
 *     country: "US",
 *     firstName: "John",
 *     lastName: "Appleseed",
 *     telephone: "+1 123-123-1234",
 *     zipcode: "12345",
 * });
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * Lists the betas that the user is participating in.
     */
    public /*out*/ readonly betas!: pulumi.Output<string[]>;
    /**
     * The country in which the user lives.
     */
    public readonly country!: pulumi.Output<string | undefined>;
    /**
     * User's first name
     */
    public readonly firstName!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether user has any business zones
     */
    public /*out*/ readonly hasBusinessZones!: pulumi.Output<boolean>;
    /**
     * Indicates whether user has any enterprise zones
     */
    public /*out*/ readonly hasEnterpriseZones!: pulumi.Output<boolean>;
    /**
     * Indicates whether user has any pro zones
     */
    public /*out*/ readonly hasProZones!: pulumi.Output<boolean>;
    /**
     * User's last name
     */
    public readonly lastName!: pulumi.Output<string | undefined>;
    public /*out*/ readonly organizations!: pulumi.Output<outputs.UserOrganization[]>;
    /**
     * Indicates whether user has been suspended
     */
    public /*out*/ readonly suspended!: pulumi.Output<boolean>;
    /**
     * User's telephone number
     */
    public readonly telephone!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether two-factor authentication is enabled for the user account. Does not apply to API authentication.
     */
    public /*out*/ readonly twoFactorAuthenticationEnabled!: pulumi.Output<boolean>;
    /**
     * Indicates whether two-factor authentication is required by one of the accounts that the user is a member of.
     */
    public /*out*/ readonly twoFactorAuthenticationLocked!: pulumi.Output<boolean>;
    /**
     * The zipcode or postal code where the user lives.
     */
    public readonly zipcode!: pulumi.Output<string | undefined>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["betas"] = state ? state.betas : undefined;
            resourceInputs["country"] = state ? state.country : undefined;
            resourceInputs["firstName"] = state ? state.firstName : undefined;
            resourceInputs["hasBusinessZones"] = state ? state.hasBusinessZones : undefined;
            resourceInputs["hasEnterpriseZones"] = state ? state.hasEnterpriseZones : undefined;
            resourceInputs["hasProZones"] = state ? state.hasProZones : undefined;
            resourceInputs["lastName"] = state ? state.lastName : undefined;
            resourceInputs["organizations"] = state ? state.organizations : undefined;
            resourceInputs["suspended"] = state ? state.suspended : undefined;
            resourceInputs["telephone"] = state ? state.telephone : undefined;
            resourceInputs["twoFactorAuthenticationEnabled"] = state ? state.twoFactorAuthenticationEnabled : undefined;
            resourceInputs["twoFactorAuthenticationLocked"] = state ? state.twoFactorAuthenticationLocked : undefined;
            resourceInputs["zipcode"] = state ? state.zipcode : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            resourceInputs["country"] = args ? args.country : undefined;
            resourceInputs["firstName"] = args ? args.firstName : undefined;
            resourceInputs["lastName"] = args ? args.lastName : undefined;
            resourceInputs["telephone"] = args ? args.telephone : undefined;
            resourceInputs["zipcode"] = args ? args.zipcode : undefined;
            resourceInputs["betas"] = undefined /*out*/;
            resourceInputs["hasBusinessZones"] = undefined /*out*/;
            resourceInputs["hasEnterpriseZones"] = undefined /*out*/;
            resourceInputs["hasProZones"] = undefined /*out*/;
            resourceInputs["organizations"] = undefined /*out*/;
            resourceInputs["suspended"] = undefined /*out*/;
            resourceInputs["twoFactorAuthenticationEnabled"] = undefined /*out*/;
            resourceInputs["twoFactorAuthenticationLocked"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * Lists the betas that the user is participating in.
     */
    betas?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The country in which the user lives.
     */
    country?: pulumi.Input<string>;
    /**
     * User's first name
     */
    firstName?: pulumi.Input<string>;
    /**
     * Indicates whether user has any business zones
     */
    hasBusinessZones?: pulumi.Input<boolean>;
    /**
     * Indicates whether user has any enterprise zones
     */
    hasEnterpriseZones?: pulumi.Input<boolean>;
    /**
     * Indicates whether user has any pro zones
     */
    hasProZones?: pulumi.Input<boolean>;
    /**
     * User's last name
     */
    lastName?: pulumi.Input<string>;
    organizations?: pulumi.Input<pulumi.Input<inputs.UserOrganization>[]>;
    /**
     * Indicates whether user has been suspended
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * User's telephone number
     */
    telephone?: pulumi.Input<string>;
    /**
     * Indicates whether two-factor authentication is enabled for the user account. Does not apply to API authentication.
     */
    twoFactorAuthenticationEnabled?: pulumi.Input<boolean>;
    /**
     * Indicates whether two-factor authentication is required by one of the accounts that the user is a member of.
     */
    twoFactorAuthenticationLocked?: pulumi.Input<boolean>;
    /**
     * The zipcode or postal code where the user lives.
     */
    zipcode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The country in which the user lives.
     */
    country?: pulumi.Input<string>;
    /**
     * User's first name
     */
    firstName?: pulumi.Input<string>;
    /**
     * User's last name
     */
    lastName?: pulumi.Input<string>;
    /**
     * User's telephone number
     */
    telephone?: pulumi.Input<string>;
    /**
     * The zipcode or postal code where the user lives.
     */
    zipcode?: pulumi.Input<string>;
}
