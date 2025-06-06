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
 * const exampleObservatoryScheduledTest = new cloudflare.ObservatoryScheduledTest("example_observatory_scheduled_test", {
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     url: "example.com",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/observatoryScheduledTest:ObservatoryScheduledTest example '<zone_id>/<url>'
 * ```
 */
export class ObservatoryScheduledTest extends pulumi.CustomResource {
    /**
     * Get an existing ObservatoryScheduledTest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObservatoryScheduledTestState, opts?: pulumi.CustomResourceOptions): ObservatoryScheduledTest {
        return new ObservatoryScheduledTest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/observatoryScheduledTest:ObservatoryScheduledTest';

    /**
     * Returns true if the given object is an instance of ObservatoryScheduledTest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObservatoryScheduledTest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObservatoryScheduledTest.__pulumiType;
    }

    /**
     * The frequency of the test.
     * Available values: "DAILY", "WEEKLY".
     */
    public /*out*/ readonly frequency!: pulumi.Output<string>;
    /**
     * A test region.
     * Available values: "asia-east1", "asia-northeast1", "asia-northeast2", "asia-south1", "asia-southeast1", "australia-southeast1", "europe-north1", "europe-southwest1", "europe-west1", "europe-west2", "europe-west3", "europe-west4", "europe-west8", "europe-west9", "me-west1", "southamerica-east1", "us-central1", "us-east1", "us-east4", "us-south1", "us-west1".
     */
    public /*out*/ readonly region!: pulumi.Output<string>;
    /**
     * The test schedule.
     */
    public /*out*/ readonly schedule!: pulumi.Output<outputs.ObservatoryScheduledTestSchedule>;
    public /*out*/ readonly test!: pulumi.Output<outputs.ObservatoryScheduledTestTest>;
    /**
     * A URL.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * Identifier.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ObservatoryScheduledTest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObservatoryScheduledTestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObservatoryScheduledTestArgs | ObservatoryScheduledTestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObservatoryScheduledTestState | undefined;
            resourceInputs["frequency"] = state ? state.frequency : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["test"] = state ? state.test : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ObservatoryScheduledTestArgs | undefined;
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["frequency"] = undefined /*out*/;
            resourceInputs["region"] = undefined /*out*/;
            resourceInputs["schedule"] = undefined /*out*/;
            resourceInputs["test"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObservatoryScheduledTest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObservatoryScheduledTest resources.
 */
export interface ObservatoryScheduledTestState {
    /**
     * The frequency of the test.
     * Available values: "DAILY", "WEEKLY".
     */
    frequency?: pulumi.Input<string>;
    /**
     * A test region.
     * Available values: "asia-east1", "asia-northeast1", "asia-northeast2", "asia-south1", "asia-southeast1", "australia-southeast1", "europe-north1", "europe-southwest1", "europe-west1", "europe-west2", "europe-west3", "europe-west4", "europe-west8", "europe-west9", "me-west1", "southamerica-east1", "us-central1", "us-east1", "us-east4", "us-south1", "us-west1".
     */
    region?: pulumi.Input<string>;
    /**
     * The test schedule.
     */
    schedule?: pulumi.Input<inputs.ObservatoryScheduledTestSchedule>;
    test?: pulumi.Input<inputs.ObservatoryScheduledTestTest>;
    /**
     * A URL.
     */
    url?: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObservatoryScheduledTest resource.
 */
export interface ObservatoryScheduledTestArgs {
    /**
     * A URL.
     */
    url: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
