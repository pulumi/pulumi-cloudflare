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
 * const exampleImage = cloudflare.getImage({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     imageId: "image_id",
 * });
 * ```
 */
export function getImage(args: GetImageArgs, opts?: pulumi.InvokeOptions): Promise<GetImageResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getImage:getImage", {
        "accountId": args.accountId,
        "imageId": args.imageId,
    }, opts);
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageArgs {
    /**
     * Account identifier tag.
     */
    accountId: string;
    /**
     * Image unique identifier.
     */
    imageId: string;
}

/**
 * A collection of values returned by getImage.
 */
export interface GetImageResult {
    /**
     * Account identifier tag.
     */
    readonly accountId: string;
    /**
     * Image file name.
     */
    readonly filename: string;
    /**
     * Image unique identifier.
     */
    readonly id: string;
    /**
     * Image unique identifier.
     */
    readonly imageId: string;
    /**
     * User modifiable key-value store. Can be used for keeping references to another system of record for managing images. Metadata must not exceed 1024 bytes.
     */
    readonly meta: string;
    /**
     * Indicates whether the image can be a accessed only using it's UID. If set to true, a signed token needs to be generated with a signing key to view the image.
     */
    readonly requireSignedUrls: boolean;
    /**
     * When the media item was uploaded.
     */
    readonly uploaded: string;
    /**
     * Object specifying available variants for an image.
     */
    readonly variants: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleImage = cloudflare.getImage({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     imageId: "image_id",
 * });
 * ```
 */
export function getImageOutput(args: GetImageOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetImageResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getImage:getImage", {
        "accountId": args.accountId,
        "imageId": args.imageId,
    }, opts);
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageOutputArgs {
    /**
     * Account identifier tag.
     */
    accountId: pulumi.Input<string>;
    /**
     * Image unique identifier.
     */
    imageId: pulumi.Input<string>;
}
