// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The [Infrastructure Access Target](https://developers.cloudflare.com/cloudflare-one/connections/connect-networks/use-cases/ssh/ssh-infrastructure-access/#4-add-a-target) resource allows you to configure Infrastructure Access Targets for an account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.ZeroTrustInfrastructureAccessTarget("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     hostname: "example-target",
 *     ip: {
 *         ipv4: {
 *             ipAddr: "198.51.100.1",
 *             virtualNetworkId: "238dccd1-149b-463d-8228-560ab83a54fd",
 *         },
 *         ipv6: {
 *             ipAddr: "2001:db8::",
 *             virtualNetworkId: "238dccd1-149b-463d-8228-560ab83a54fd",
 *         },
 *     },
 * });
 * const ipv4OnlyExample = new cloudflare.ZeroTrustInfrastructureAccessTarget("ipv4_only_example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     hostname: "example-ipv4-only",
 *     ip: {
 *         ipv4: {
 *             ipAddr: "198.51.100.1",
 *             virtualNetworkId: "238dccd1-149b-463d-8228-560ab83a54fd",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustInfrastructureAccessTarget:ZeroTrustInfrastructureAccessTarget example <account_id>
 * ```
 */
export class ZeroTrustInfrastructureAccessTarget extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustInfrastructureAccessTarget resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustInfrastructureAccessTargetState, opts?: pulumi.CustomResourceOptions): ZeroTrustInfrastructureAccessTarget {
        return new ZeroTrustInfrastructureAccessTarget(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustInfrastructureAccessTarget:ZeroTrustInfrastructureAccessTarget';

    /**
     * Returns true if the given object is an instance of ZeroTrustInfrastructureAccessTarget.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustInfrastructureAccessTarget {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustInfrastructureAccessTarget.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The date and time at which the target was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * A non-unique field that refers to a target.
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * The IPv4/IPv6 address that identifies where to reach a target.
     */
    public readonly ip!: pulumi.Output<outputs.ZeroTrustInfrastructureAccessTargetIp>;
    /**
     * The date and time at which the target was last modified.
     */
    public /*out*/ readonly modifiedAt!: pulumi.Output<string>;

    /**
     * Create a ZeroTrustInfrastructureAccessTarget resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustInfrastructureAccessTargetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustInfrastructureAccessTargetArgs | ZeroTrustInfrastructureAccessTargetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustInfrastructureAccessTargetState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["modifiedAt"] = state ? state.modifiedAt : undefined;
        } else {
            const args = argsOrState as ZeroTrustInfrastructureAccessTargetArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.hostname === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostname'");
            }
            if ((!args || args.ip === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ip'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["ip"] = args ? args.ip : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["modifiedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustInfrastructureAccessTarget.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustInfrastructureAccessTarget resources.
 */
export interface ZeroTrustInfrastructureAccessTargetState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The date and time at which the target was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * A non-unique field that refers to a target.
     */
    hostname?: pulumi.Input<string>;
    /**
     * The IPv4/IPv6 address that identifies where to reach a target.
     */
    ip?: pulumi.Input<inputs.ZeroTrustInfrastructureAccessTargetIp>;
    /**
     * The date and time at which the target was last modified.
     */
    modifiedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustInfrastructureAccessTarget resource.
 */
export interface ZeroTrustInfrastructureAccessTargetArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * A non-unique field that refers to a target.
     */
    hostname: pulumi.Input<string>;
    /**
     * The IPv4/IPv6 address that identifies where to reach a target.
     */
    ip: pulumi.Input<inputs.ZeroTrustInfrastructureAccessTargetIp>;
}
