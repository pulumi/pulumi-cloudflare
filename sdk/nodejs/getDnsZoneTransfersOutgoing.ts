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
 * const exampleDnsZoneTransfersOutgoing = cloudflare.getDnsZoneTransfersOutgoing({
 *     zoneId: "269d8f4853475ca241c4e730be286b20",
 * });
 * ```
 */
export function getDnsZoneTransfersOutgoing(args: GetDnsZoneTransfersOutgoingArgs, opts?: pulumi.InvokeOptions): Promise<GetDnsZoneTransfersOutgoingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getDnsZoneTransfersOutgoing:getDnsZoneTransfersOutgoing", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDnsZoneTransfersOutgoing.
 */
export interface GetDnsZoneTransfersOutgoingArgs {
    zoneId: string;
}

/**
 * A collection of values returned by getDnsZoneTransfersOutgoing.
 */
export interface GetDnsZoneTransfersOutgoingResult {
    /**
     * The time for a specific event.
     */
    readonly checkedTime: string;
    /**
     * The time for a specific event.
     */
    readonly createdTime: string;
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * The time for a specific event.
     */
    readonly lastTransferredTime: string;
    /**
     * Zone name.
     */
    readonly name: string;
    /**
     * A list of peer tags.
     */
    readonly peers: string[];
    /**
     * The serial number of the SOA for the given zone.
     */
    readonly soaSerial: number;
    readonly zoneId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleDnsZoneTransfersOutgoing = cloudflare.getDnsZoneTransfersOutgoing({
 *     zoneId: "269d8f4853475ca241c4e730be286b20",
 * });
 * ```
 */
export function getDnsZoneTransfersOutgoingOutput(args: GetDnsZoneTransfersOutgoingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDnsZoneTransfersOutgoingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getDnsZoneTransfersOutgoing:getDnsZoneTransfersOutgoing", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDnsZoneTransfersOutgoing.
 */
export interface GetDnsZoneTransfersOutgoingOutputArgs {
    zoneId: pulumi.Input<string>;
}
