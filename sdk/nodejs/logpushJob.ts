// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/logpushJob:LogpushJob example '<{accounts|zones}/{account_id|zone_id}>/<job_id>'
 * ```
 */
export class LogpushJob extends pulumi.CustomResource {
    /**
     * Get an existing LogpushJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogpushJobState, opts?: pulumi.CustomResourceOptions): LogpushJob {
        return new LogpushJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/logpushJob:LogpushJob';

    /**
     * Returns true if the given object is an instance of LogpushJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogpushJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogpushJob.__pulumiType;
    }

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
     */
    public readonly dataset!: pulumi.Output<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
     */
    public readonly destinationConf!: pulumi.Output<string>;
    /**
     * Flag that indicates if the job is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
     */
    public /*out*/ readonly errorMessage!: pulumi.Output<string>;
    /**
     * The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
     */
    public readonly filter!: pulumi.Output<string | undefined>;
    /**
     * This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
     * Available values: "high", "low".
     *
     * @deprecated This attribute is deprecated.
     */
    public readonly frequency!: pulumi.Output<string>;
    /**
     * The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
     * Available values: "edge".
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn't run yet then the field will be empty.
     */
    public /*out*/ readonly lastComplete!: pulumi.Output<string>;
    /**
     * Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the errorMessage field.
     */
    public /*out*/ readonly lastError!: pulumi.Output<string>;
    /**
     * This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
     *
     * @deprecated This attribute is deprecated.
     */
    public readonly logpullOptions!: pulumi.Output<string | undefined>;
    /**
     * The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
     */
    public readonly maxUploadBytes!: pulumi.Output<number | undefined>;
    /**
     * The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
     */
    public readonly maxUploadIntervalSeconds!: pulumi.Output<number>;
    /**
     * The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
     */
    public readonly maxUploadRecords!: pulumi.Output<number>;
    /**
     * Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
     */
    public readonly name!: pulumi.Output<string | undefined>;
    /**
     * The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
     */
    public readonly outputOptions!: pulumi.Output<outputs.LogpushJobOutputOptions>;
    /**
     * Ownership challenge token to prove destination ownership.
     */
    public readonly ownershipChallenge!: pulumi.Output<string | undefined>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a LogpushJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogpushJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogpushJobArgs | LogpushJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogpushJobState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["dataset"] = state ? state.dataset : undefined;
            resourceInputs["destinationConf"] = state ? state.destinationConf : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["errorMessage"] = state ? state.errorMessage : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["frequency"] = state ? state.frequency : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["lastComplete"] = state ? state.lastComplete : undefined;
            resourceInputs["lastError"] = state ? state.lastError : undefined;
            resourceInputs["logpullOptions"] = state ? state.logpullOptions : undefined;
            resourceInputs["maxUploadBytes"] = state ? state.maxUploadBytes : undefined;
            resourceInputs["maxUploadIntervalSeconds"] = state ? state.maxUploadIntervalSeconds : undefined;
            resourceInputs["maxUploadRecords"] = state ? state.maxUploadRecords : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outputOptions"] = state ? state.outputOptions : undefined;
            resourceInputs["ownershipChallenge"] = state ? state.ownershipChallenge : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LogpushJobArgs | undefined;
            if ((!args || args.destinationConf === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationConf'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["dataset"] = args ? args.dataset : undefined;
            resourceInputs["destinationConf"] = args ? args.destinationConf : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["frequency"] = args ? args.frequency : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["logpullOptions"] = args ? args.logpullOptions : undefined;
            resourceInputs["maxUploadBytes"] = args ? args.maxUploadBytes : undefined;
            resourceInputs["maxUploadIntervalSeconds"] = args ? args.maxUploadIntervalSeconds : undefined;
            resourceInputs["maxUploadRecords"] = args ? args.maxUploadRecords : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["outputOptions"] = args ? args.outputOptions : undefined;
            resourceInputs["ownershipChallenge"] = args?.ownershipChallenge ? pulumi.secret(args.ownershipChallenge) : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["errorMessage"] = undefined /*out*/;
            resourceInputs["lastComplete"] = undefined /*out*/;
            resourceInputs["lastError"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["ownershipChallenge"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(LogpushJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogpushJob resources.
 */
export interface LogpushJobState {
    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
     */
    dataset?: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
     */
    destinationConf?: pulumi.Input<string>;
    /**
     * Flag that indicates if the job is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
     */
    errorMessage?: pulumi.Input<string>;
    /**
     * The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
     */
    filter?: pulumi.Input<string>;
    /**
     * This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
     * Available values: "high", "low".
     *
     * @deprecated This attribute is deprecated.
     */
    frequency?: pulumi.Input<string>;
    /**
     * The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
     * Available values: "edge".
     */
    kind?: pulumi.Input<string>;
    /**
     * Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn't run yet then the field will be empty.
     */
    lastComplete?: pulumi.Input<string>;
    /**
     * Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the errorMessage field.
     */
    lastError?: pulumi.Input<string>;
    /**
     * This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
     *
     * @deprecated This attribute is deprecated.
     */
    logpullOptions?: pulumi.Input<string>;
    /**
     * The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
     */
    maxUploadBytes?: pulumi.Input<number>;
    /**
     * The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
     */
    maxUploadIntervalSeconds?: pulumi.Input<number>;
    /**
     * The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
     */
    maxUploadRecords?: pulumi.Input<number>;
    /**
     * Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
     */
    name?: pulumi.Input<string>;
    /**
     * The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
     */
    outputOptions?: pulumi.Input<inputs.LogpushJobOutputOptions>;
    /**
     * Ownership challenge token to prove destination ownership.
     */
    ownershipChallenge?: pulumi.Input<string>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogpushJob resource.
 */
export interface LogpushJobArgs {
    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
     */
    dataset?: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
     */
    destinationConf: pulumi.Input<string>;
    /**
     * Flag that indicates if the job is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
     */
    filter?: pulumi.Input<string>;
    /**
     * This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
     * Available values: "high", "low".
     *
     * @deprecated This attribute is deprecated.
     */
    frequency?: pulumi.Input<string>;
    /**
     * The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
     * Available values: "edge".
     */
    kind?: pulumi.Input<string>;
    /**
     * This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
     *
     * @deprecated This attribute is deprecated.
     */
    logpullOptions?: pulumi.Input<string>;
    /**
     * The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
     */
    maxUploadBytes?: pulumi.Input<number>;
    /**
     * The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
     */
    maxUploadIntervalSeconds?: pulumi.Input<number>;
    /**
     * The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
     */
    maxUploadRecords?: pulumi.Input<number>;
    /**
     * Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
     */
    name?: pulumi.Input<string>;
    /**
     * The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
     */
    outputOptions?: pulumi.Input<inputs.LogpushJobOutputOptions>;
    /**
     * Ownership challenge token to prove destination ownership.
     */
    ownershipChallenge?: pulumi.Input<string>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    zoneId?: pulumi.Input<string>;
}
