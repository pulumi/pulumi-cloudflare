// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v6/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/logpushJob:LogpushJob example '<{accounts|zones}/{account_id|zone_id}>/<job_id>'
// ```
type LogpushJob struct {
	pulumi.CustomResourceState

	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
	// Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
	Dataset pulumi.StringOutput `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
	DestinationConf pulumi.StringOutput `pulumi:"destinationConf"`
	// Flag that indicates if the job is enabled.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
	Filter pulumi.StringPtrOutput `pulumi:"filter"`
	// This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
	// Available values: "high", "low".
	//
	// Deprecated: This attribute is deprecated.
	Frequency pulumi.StringOutput `pulumi:"frequency"`
	// The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
	// Available values: "edge".
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn't run yet then the field will be empty.
	LastComplete pulumi.StringOutput `pulumi:"lastComplete"`
	// Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the errorMessage field.
	LastError pulumi.StringOutput `pulumi:"lastError"`
	// This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
	//
	// Deprecated: This attribute is deprecated.
	LogpullOptions pulumi.StringPtrOutput `pulumi:"logpullOptions"`
	// The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadBytes pulumi.IntPtrOutput `pulumi:"maxUploadBytes"`
	// The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
	MaxUploadIntervalSeconds pulumi.IntOutput `pulumi:"maxUploadIntervalSeconds"`
	// The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadRecords pulumi.IntOutput `pulumi:"maxUploadRecords"`
	// Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
	OutputOptions LogpushJobOutputOptionsOutput `pulumi:"outputOptions"`
	// Ownership challenge token to prove destination ownership.
	OwnershipChallenge pulumi.StringPtrOutput `pulumi:"ownershipChallenge"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewLogpushJob registers a new resource with the given unique name, arguments, and options.
func NewLogpushJob(ctx *pulumi.Context,
	name string, args *LogpushJobArgs, opts ...pulumi.ResourceOption) (*LogpushJob, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationConf == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConf'")
	}
	if args.OwnershipChallenge != nil {
		args.OwnershipChallenge = pulumi.ToSecret(args.OwnershipChallenge).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"ownershipChallenge",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogpushJob
	err := ctx.RegisterResource("cloudflare:index/logpushJob:LogpushJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogpushJob gets an existing LogpushJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogpushJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogpushJobState, opts ...pulumi.ResourceOption) (*LogpushJob, error) {
	var resource LogpushJob
	err := ctx.ReadResource("cloudflare:index/logpushJob:LogpushJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogpushJob resources.
type logpushJobState struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId *string `pulumi:"accountId"`
	// Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
	// Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
	Dataset *string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
	DestinationConf *string `pulumi:"destinationConf"`
	// Flag that indicates if the job is enabled.
	Enabled *bool `pulumi:"enabled"`
	// If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
	ErrorMessage *string `pulumi:"errorMessage"`
	// The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
	Filter *string `pulumi:"filter"`
	// This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
	// Available values: "high", "low".
	//
	// Deprecated: This attribute is deprecated.
	Frequency *string `pulumi:"frequency"`
	// The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
	// Available values: "edge".
	Kind *string `pulumi:"kind"`
	// Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn't run yet then the field will be empty.
	LastComplete *string `pulumi:"lastComplete"`
	// Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the errorMessage field.
	LastError *string `pulumi:"lastError"`
	// This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
	//
	// Deprecated: This attribute is deprecated.
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadBytes *int `pulumi:"maxUploadBytes"`
	// The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
	MaxUploadIntervalSeconds *int `pulumi:"maxUploadIntervalSeconds"`
	// The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadRecords *int `pulumi:"maxUploadRecords"`
	// Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
	Name *string `pulumi:"name"`
	// The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
	OutputOptions *LogpushJobOutputOptions `pulumi:"outputOptions"`
	// Ownership challenge token to prove destination ownership.
	OwnershipChallenge *string `pulumi:"ownershipChallenge"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId *string `pulumi:"zoneId"`
}

type LogpushJobState struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrInput
	// Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
	// Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
	Dataset pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
	DestinationConf pulumi.StringPtrInput
	// Flag that indicates if the job is enabled.
	Enabled pulumi.BoolPtrInput
	// If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
	ErrorMessage pulumi.StringPtrInput
	// The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
	Filter pulumi.StringPtrInput
	// This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
	// Available values: "high", "low".
	//
	// Deprecated: This attribute is deprecated.
	Frequency pulumi.StringPtrInput
	// The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
	// Available values: "edge".
	Kind pulumi.StringPtrInput
	// Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn't run yet then the field will be empty.
	LastComplete pulumi.StringPtrInput
	// Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the errorMessage field.
	LastError pulumi.StringPtrInput
	// This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
	//
	// Deprecated: This attribute is deprecated.
	LogpullOptions pulumi.StringPtrInput
	// The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadBytes pulumi.IntPtrInput
	// The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
	MaxUploadIntervalSeconds pulumi.IntPtrInput
	// The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadRecords pulumi.IntPtrInput
	// Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
	Name pulumi.StringPtrInput
	// The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
	OutputOptions LogpushJobOutputOptionsPtrInput
	// Ownership challenge token to prove destination ownership.
	OwnershipChallenge pulumi.StringPtrInput
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrInput
}

func (LogpushJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobState)(nil)).Elem()
}

type logpushJobArgs struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId *string `pulumi:"accountId"`
	// Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
	// Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
	Dataset *string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
	DestinationConf string `pulumi:"destinationConf"`
	// Flag that indicates if the job is enabled.
	Enabled *bool `pulumi:"enabled"`
	// The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
	Filter *string `pulumi:"filter"`
	// This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
	// Available values: "high", "low".
	//
	// Deprecated: This attribute is deprecated.
	Frequency *string `pulumi:"frequency"`
	// The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
	// Available values: "edge".
	Kind *string `pulumi:"kind"`
	// This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
	//
	// Deprecated: This attribute is deprecated.
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadBytes *int `pulumi:"maxUploadBytes"`
	// The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
	MaxUploadIntervalSeconds *int `pulumi:"maxUploadIntervalSeconds"`
	// The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadRecords *int `pulumi:"maxUploadRecords"`
	// Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
	Name *string `pulumi:"name"`
	// The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
	OutputOptions *LogpushJobOutputOptions `pulumi:"outputOptions"`
	// Ownership challenge token to prove destination ownership.
	OwnershipChallenge *string `pulumi:"ownershipChallenge"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LogpushJob resource.
type LogpushJobArgs struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrInput
	// Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
	// Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
	Dataset pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
	DestinationConf pulumi.StringInput
	// Flag that indicates if the job is enabled.
	Enabled pulumi.BoolPtrInput
	// The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
	Filter pulumi.StringPtrInput
	// This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
	// Available values: "high", "low".
	//
	// Deprecated: This attribute is deprecated.
	Frequency pulumi.StringPtrInput
	// The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
	// Available values: "edge".
	Kind pulumi.StringPtrInput
	// This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
	//
	// Deprecated: This attribute is deprecated.
	LogpullOptions pulumi.StringPtrInput
	// The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadBytes pulumi.IntPtrInput
	// The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
	MaxUploadIntervalSeconds pulumi.IntPtrInput
	// The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
	MaxUploadRecords pulumi.IntPtrInput
	// Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
	Name pulumi.StringPtrInput
	// The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
	OutputOptions LogpushJobOutputOptionsPtrInput
	// Ownership challenge token to prove destination ownership.
	OwnershipChallenge pulumi.StringPtrInput
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrInput
}

func (LogpushJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobArgs)(nil)).Elem()
}

type LogpushJobInput interface {
	pulumi.Input

	ToLogpushJobOutput() LogpushJobOutput
	ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput
}

func (*LogpushJob) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushJob)(nil)).Elem()
}

func (i *LogpushJob) ToLogpushJobOutput() LogpushJobOutput {
	return i.ToLogpushJobOutputWithContext(context.Background())
}

func (i *LogpushJob) ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobOutput)
}

// LogpushJobArrayInput is an input type that accepts LogpushJobArray and LogpushJobArrayOutput values.
// You can construct a concrete instance of `LogpushJobArrayInput` via:
//
//	LogpushJobArray{ LogpushJobArgs{...} }
type LogpushJobArrayInput interface {
	pulumi.Input

	ToLogpushJobArrayOutput() LogpushJobArrayOutput
	ToLogpushJobArrayOutputWithContext(context.Context) LogpushJobArrayOutput
}

type LogpushJobArray []LogpushJobInput

func (LogpushJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushJob)(nil)).Elem()
}

func (i LogpushJobArray) ToLogpushJobArrayOutput() LogpushJobArrayOutput {
	return i.ToLogpushJobArrayOutputWithContext(context.Background())
}

func (i LogpushJobArray) ToLogpushJobArrayOutputWithContext(ctx context.Context) LogpushJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobArrayOutput)
}

// LogpushJobMapInput is an input type that accepts LogpushJobMap and LogpushJobMapOutput values.
// You can construct a concrete instance of `LogpushJobMapInput` via:
//
//	LogpushJobMap{ "key": LogpushJobArgs{...} }
type LogpushJobMapInput interface {
	pulumi.Input

	ToLogpushJobMapOutput() LogpushJobMapOutput
	ToLogpushJobMapOutputWithContext(context.Context) LogpushJobMapOutput
}

type LogpushJobMap map[string]LogpushJobInput

func (LogpushJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushJob)(nil)).Elem()
}

func (i LogpushJobMap) ToLogpushJobMapOutput() LogpushJobMapOutput {
	return i.ToLogpushJobMapOutputWithContext(context.Background())
}

func (i LogpushJobMap) ToLogpushJobMapOutputWithContext(ctx context.Context) LogpushJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobMapOutput)
}

type LogpushJobOutput struct{ *pulumi.OutputState }

func (LogpushJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushJob)(nil)).Elem()
}

func (o LogpushJobOutput) ToLogpushJobOutput() LogpushJobOutput {
	return o
}

func (o LogpushJobOutput) ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput {
	return o
}

// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
func (o LogpushJobOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
// Available values: "access*requests", "audit*logs", "biso*user*actions", "casb*findings", "device*posture*results", "dlp*forensic*copies", "dns*firewall*logs", "dns*logs", "email*security*alerts", "firewall*events", "gateway*dns", "gateway*http", "gateway*network", "http*requests", "magic*ids*detections", "nel*reports", "network*analytics*logs", "page*shield*events", "sinkhole*http*logs", "spectrum*events", "ssh*logs", "workers*trace*events", "zaraz*events", "zero*trust*network*sessions".
func (o LogpushJobOutput) Dataset() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.Dataset }).(pulumi.StringOutput)
}

// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
func (o LogpushJobOutput) DestinationConf() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.DestinationConf }).(pulumi.StringOutput)
}

// Flag that indicates if the job is enabled.
func (o LogpushJobOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
func (o LogpushJobOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.ErrorMessage }).(pulumi.StringOutput)
}

// The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
func (o LogpushJobOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.Filter }).(pulumi.StringPtrOutput)
}

// This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
// Available values: "high", "low".
//
// Deprecated: This attribute is deprecated.
func (o LogpushJobOutput) Frequency() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.Frequency }).(pulumi.StringOutput)
}

// The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `httpRequests` dataset.
// Available values: "edge".
func (o LogpushJobOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn't run yet then the field will be empty.
func (o LogpushJobOutput) LastComplete() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.LastComplete }).(pulumi.StringOutput)
}

// Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the errorMessage field.
func (o LogpushJobOutput) LastError() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.LastError }).(pulumi.StringOutput)
}

// This field is deprecated. Use `outputOptions` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
//
// Deprecated: This attribute is deprecated.
func (o LogpushJobOutput) LogpullOptions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.LogpullOptions }).(pulumi.StringPtrOutput)
}

// The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
func (o LogpushJobOutput) MaxUploadBytes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.IntPtrOutput { return v.MaxUploadBytes }).(pulumi.IntPtrOutput)
}

// The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
func (o LogpushJobOutput) MaxUploadIntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.IntOutput { return v.MaxUploadIntervalSeconds }).(pulumi.IntOutput)
}

// The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
func (o LogpushJobOutput) MaxUploadRecords() pulumi.IntOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.IntOutput { return v.MaxUploadRecords }).(pulumi.IntOutput)
}

// Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
func (o LogpushJobOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
func (o LogpushJobOutput) OutputOptions() LogpushJobOutputOptionsOutput {
	return o.ApplyT(func(v *LogpushJob) LogpushJobOutputOptionsOutput { return v.OutputOptions }).(LogpushJobOutputOptionsOutput)
}

// Ownership challenge token to prove destination ownership.
func (o LogpushJobOutput) OwnershipChallenge() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.OwnershipChallenge }).(pulumi.StringPtrOutput)
}

// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
func (o LogpushJobOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type LogpushJobArrayOutput struct{ *pulumi.OutputState }

func (LogpushJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushJob)(nil)).Elem()
}

func (o LogpushJobArrayOutput) ToLogpushJobArrayOutput() LogpushJobArrayOutput {
	return o
}

func (o LogpushJobArrayOutput) ToLogpushJobArrayOutputWithContext(ctx context.Context) LogpushJobArrayOutput {
	return o
}

func (o LogpushJobArrayOutput) Index(i pulumi.IntInput) LogpushJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogpushJob {
		return vs[0].([]*LogpushJob)[vs[1].(int)]
	}).(LogpushJobOutput)
}

type LogpushJobMapOutput struct{ *pulumi.OutputState }

func (LogpushJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushJob)(nil)).Elem()
}

func (o LogpushJobMapOutput) ToLogpushJobMapOutput() LogpushJobMapOutput {
	return o
}

func (o LogpushJobMapOutput) ToLogpushJobMapOutputWithContext(ctx context.Context) LogpushJobMapOutput {
	return o
}

func (o LogpushJobMapOutput) MapIndex(k pulumi.StringInput) LogpushJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogpushJob {
		return vs[0].(map[string]*LogpushJob)[vs[1].(string)]
	}).(LogpushJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobInput)(nil)).Elem(), &LogpushJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobArrayInput)(nil)).Elem(), LogpushJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobMapInput)(nil)).Elem(), LogpushJobMap{})
	pulumi.RegisterOutputType(LogpushJobOutput{})
	pulumi.RegisterOutputType(LogpushJobArrayOutput{})
	pulumi.RegisterOutputType(LogpushJobMapOutput{})
}
