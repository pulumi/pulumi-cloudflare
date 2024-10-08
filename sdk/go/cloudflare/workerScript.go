// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myNamespace, err := cloudflare.NewWorkersKvNamespace(ctx, "my_namespace", &cloudflare.WorkersKvNamespaceArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Title:     pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			invokeFile, err := std.File(ctx, &std.FileArgs{
//				Input: "script.js",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			invokeFilebase641, err := std.Filebase64(ctx, &std.Filebase64Args{
//				Input: "example.wasm",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// Sets the script with the name "script_1"
//			_, err = cloudflare.NewWorkerScript(ctx, "my_script", &cloudflare.WorkerScriptArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("script_1"),
//				Content:   pulumi.String(invokeFile.Result),
//				KvNamespaceBindings: cloudflare.WorkerScriptKvNamespaceBindingArray{
//					&cloudflare.WorkerScriptKvNamespaceBindingArgs{
//						Name:        pulumi.String("MY_EXAMPLE_KV_NAMESPACE"),
//						NamespaceId: myNamespace.ID(),
//					},
//				},
//				PlainTextBindings: cloudflare.WorkerScriptPlainTextBindingArray{
//					&cloudflare.WorkerScriptPlainTextBindingArgs{
//						Name: pulumi.String("MY_EXAMPLE_PLAIN_TEXT"),
//						Text: pulumi.String("foobar"),
//					},
//				},
//				SecretTextBindings: cloudflare.WorkerScriptSecretTextBindingArray{
//					&cloudflare.WorkerScriptSecretTextBindingArgs{
//						Name: pulumi.String("MY_EXAMPLE_SECRET_TEXT"),
//						Text: pulumi.Any(secretFooValue),
//					},
//				},
//				WebassemblyBindings: cloudflare.WorkerScriptWebassemblyBindingArray{
//					&cloudflare.WorkerScriptWebassemblyBindingArgs{
//						Name:   pulumi.String("MY_EXAMPLE_WASM"),
//						Module: pulumi.String(invokeFilebase641.Result),
//					},
//				},
//				ServiceBindings: cloudflare.WorkerScriptServiceBindingArray{
//					&cloudflare.WorkerScriptServiceBindingArgs{
//						Name:        pulumi.String("MY_SERVICE_BINDING"),
//						Service:     pulumi.String("MY_SERVICE"),
//						Environment: pulumi.String("production"),
//					},
//				},
//				R2BucketBindings: cloudflare.WorkerScriptR2BucketBindingArray{
//					&cloudflare.WorkerScriptR2BucketBindingArgs{
//						Name:       pulumi.String("MY_BUCKET"),
//						BucketName: pulumi.String("MY_BUCKET_NAME"),
//					},
//				},
//				AnalyticsEngineBindings: cloudflare.WorkerScriptAnalyticsEngineBindingArray{
//					&cloudflare.WorkerScriptAnalyticsEngineBindingArgs{
//						Name:    pulumi.String("MY_DATASET"),
//						Dataset: pulumi.String("dataset1"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/workerScript:WorkerScript example <account_id>/<script_name>
// ```
type WorkerScript struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId               pulumi.StringOutput                           `pulumi:"accountId"`
	AnalyticsEngineBindings WorkerScriptAnalyticsEngineBindingArrayOutput `pulumi:"analyticsEngineBindings"`
	// The date to use for the compatibility flag.
	CompatibilityDate pulumi.StringPtrOutput `pulumi:"compatibilityDate"`
	// Compatibility flags used for Worker Scripts.
	CompatibilityFlags pulumi.StringArrayOutput `pulumi:"compatibilityFlags"`
	// The script content.
	Content            pulumi.StringOutput                      `pulumi:"content"`
	D1DatabaseBindings WorkerScriptD1DatabaseBindingArrayOutput `pulumi:"d1DatabaseBindings"`
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace        pulumi.StringPtrOutput                         `pulumi:"dispatchNamespace"`
	HyperdriveConfigBindings WorkerScriptHyperdriveConfigBindingArrayOutput `pulumi:"hyperdriveConfigBindings"`
	KvNamespaceBindings      WorkerScriptKvNamespaceBindingArrayOutput      `pulumi:"kvNamespaceBindings"`
	// Enabling allows Worker events to be sent to a defined Logpush destination.
	Logpush pulumi.BoolPtrOutput `pulumi:"logpush"`
	// Whether to upload Worker as a module.
	Module pulumi.BoolPtrOutput `pulumi:"module"`
	// The name for the script. **Modifying this attribute will force creation of a new resource.**
	Name                pulumi.StringOutput                       `pulumi:"name"`
	Placements          WorkerScriptPlacementArrayOutput          `pulumi:"placements"`
	PlainTextBindings   WorkerScriptPlainTextBindingArrayOutput   `pulumi:"plainTextBindings"`
	QueueBindings       WorkerScriptQueueBindingArrayOutput       `pulumi:"queueBindings"`
	R2BucketBindings    WorkerScriptR2BucketBindingArrayOutput    `pulumi:"r2BucketBindings"`
	SecretTextBindings  WorkerScriptSecretTextBindingArrayOutput  `pulumi:"secretTextBindings"`
	ServiceBindings     WorkerScriptServiceBindingArrayOutput     `pulumi:"serviceBindings"`
	Tags                pulumi.StringArrayOutput                  `pulumi:"tags"`
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayOutput `pulumi:"webassemblyBindings"`
}

// NewWorkerScript registers a new resource with the given unique name, arguments, and options.
func NewWorkerScript(ctx *pulumi.Context,
	name string, args *WorkerScriptArgs, opts ...pulumi.ResourceOption) (*WorkerScript, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkerScript
	err := ctx.RegisterResource("cloudflare:index/workerScript:WorkerScript", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkerScript gets an existing WorkerScript resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkerScript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkerScriptState, opts ...pulumi.ResourceOption) (*WorkerScript, error) {
	var resource WorkerScript
	err := ctx.ReadResource("cloudflare:index/workerScript:WorkerScript", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkerScript resources.
type workerScriptState struct {
	// The account identifier to target for the resource.
	AccountId               *string                              `pulumi:"accountId"`
	AnalyticsEngineBindings []WorkerScriptAnalyticsEngineBinding `pulumi:"analyticsEngineBindings"`
	// The date to use for the compatibility flag.
	CompatibilityDate *string `pulumi:"compatibilityDate"`
	// Compatibility flags used for Worker Scripts.
	CompatibilityFlags []string `pulumi:"compatibilityFlags"`
	// The script content.
	Content            *string                         `pulumi:"content"`
	D1DatabaseBindings []WorkerScriptD1DatabaseBinding `pulumi:"d1DatabaseBindings"`
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace        *string                               `pulumi:"dispatchNamespace"`
	HyperdriveConfigBindings []WorkerScriptHyperdriveConfigBinding `pulumi:"hyperdriveConfigBindings"`
	KvNamespaceBindings      []WorkerScriptKvNamespaceBinding      `pulumi:"kvNamespaceBindings"`
	// Enabling allows Worker events to be sent to a defined Logpush destination.
	Logpush *bool `pulumi:"logpush"`
	// Whether to upload Worker as a module.
	Module *bool `pulumi:"module"`
	// The name for the script. **Modifying this attribute will force creation of a new resource.**
	Name                *string                          `pulumi:"name"`
	Placements          []WorkerScriptPlacement          `pulumi:"placements"`
	PlainTextBindings   []WorkerScriptPlainTextBinding   `pulumi:"plainTextBindings"`
	QueueBindings       []WorkerScriptQueueBinding       `pulumi:"queueBindings"`
	R2BucketBindings    []WorkerScriptR2BucketBinding    `pulumi:"r2BucketBindings"`
	SecretTextBindings  []WorkerScriptSecretTextBinding  `pulumi:"secretTextBindings"`
	ServiceBindings     []WorkerScriptServiceBinding     `pulumi:"serviceBindings"`
	Tags                []string                         `pulumi:"tags"`
	WebassemblyBindings []WorkerScriptWebassemblyBinding `pulumi:"webassemblyBindings"`
}

type WorkerScriptState struct {
	// The account identifier to target for the resource.
	AccountId               pulumi.StringPtrInput
	AnalyticsEngineBindings WorkerScriptAnalyticsEngineBindingArrayInput
	// The date to use for the compatibility flag.
	CompatibilityDate pulumi.StringPtrInput
	// Compatibility flags used for Worker Scripts.
	CompatibilityFlags pulumi.StringArrayInput
	// The script content.
	Content            pulumi.StringPtrInput
	D1DatabaseBindings WorkerScriptD1DatabaseBindingArrayInput
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace        pulumi.StringPtrInput
	HyperdriveConfigBindings WorkerScriptHyperdriveConfigBindingArrayInput
	KvNamespaceBindings      WorkerScriptKvNamespaceBindingArrayInput
	// Enabling allows Worker events to be sent to a defined Logpush destination.
	Logpush pulumi.BoolPtrInput
	// Whether to upload Worker as a module.
	Module pulumi.BoolPtrInput
	// The name for the script. **Modifying this attribute will force creation of a new resource.**
	Name                pulumi.StringPtrInput
	Placements          WorkerScriptPlacementArrayInput
	PlainTextBindings   WorkerScriptPlainTextBindingArrayInput
	QueueBindings       WorkerScriptQueueBindingArrayInput
	R2BucketBindings    WorkerScriptR2BucketBindingArrayInput
	SecretTextBindings  WorkerScriptSecretTextBindingArrayInput
	ServiceBindings     WorkerScriptServiceBindingArrayInput
	Tags                pulumi.StringArrayInput
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayInput
}

func (WorkerScriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*workerScriptState)(nil)).Elem()
}

type workerScriptArgs struct {
	// The account identifier to target for the resource.
	AccountId               string                               `pulumi:"accountId"`
	AnalyticsEngineBindings []WorkerScriptAnalyticsEngineBinding `pulumi:"analyticsEngineBindings"`
	// The date to use for the compatibility flag.
	CompatibilityDate *string `pulumi:"compatibilityDate"`
	// Compatibility flags used for Worker Scripts.
	CompatibilityFlags []string `pulumi:"compatibilityFlags"`
	// The script content.
	Content            string                          `pulumi:"content"`
	D1DatabaseBindings []WorkerScriptD1DatabaseBinding `pulumi:"d1DatabaseBindings"`
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace        *string                               `pulumi:"dispatchNamespace"`
	HyperdriveConfigBindings []WorkerScriptHyperdriveConfigBinding `pulumi:"hyperdriveConfigBindings"`
	KvNamespaceBindings      []WorkerScriptKvNamespaceBinding      `pulumi:"kvNamespaceBindings"`
	// Enabling allows Worker events to be sent to a defined Logpush destination.
	Logpush *bool `pulumi:"logpush"`
	// Whether to upload Worker as a module.
	Module *bool `pulumi:"module"`
	// The name for the script. **Modifying this attribute will force creation of a new resource.**
	Name                string                           `pulumi:"name"`
	Placements          []WorkerScriptPlacement          `pulumi:"placements"`
	PlainTextBindings   []WorkerScriptPlainTextBinding   `pulumi:"plainTextBindings"`
	QueueBindings       []WorkerScriptQueueBinding       `pulumi:"queueBindings"`
	R2BucketBindings    []WorkerScriptR2BucketBinding    `pulumi:"r2BucketBindings"`
	SecretTextBindings  []WorkerScriptSecretTextBinding  `pulumi:"secretTextBindings"`
	ServiceBindings     []WorkerScriptServiceBinding     `pulumi:"serviceBindings"`
	Tags                []string                         `pulumi:"tags"`
	WebassemblyBindings []WorkerScriptWebassemblyBinding `pulumi:"webassemblyBindings"`
}

// The set of arguments for constructing a WorkerScript resource.
type WorkerScriptArgs struct {
	// The account identifier to target for the resource.
	AccountId               pulumi.StringInput
	AnalyticsEngineBindings WorkerScriptAnalyticsEngineBindingArrayInput
	// The date to use for the compatibility flag.
	CompatibilityDate pulumi.StringPtrInput
	// Compatibility flags used for Worker Scripts.
	CompatibilityFlags pulumi.StringArrayInput
	// The script content.
	Content            pulumi.StringInput
	D1DatabaseBindings WorkerScriptD1DatabaseBindingArrayInput
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace        pulumi.StringPtrInput
	HyperdriveConfigBindings WorkerScriptHyperdriveConfigBindingArrayInput
	KvNamespaceBindings      WorkerScriptKvNamespaceBindingArrayInput
	// Enabling allows Worker events to be sent to a defined Logpush destination.
	Logpush pulumi.BoolPtrInput
	// Whether to upload Worker as a module.
	Module pulumi.BoolPtrInput
	// The name for the script. **Modifying this attribute will force creation of a new resource.**
	Name                pulumi.StringInput
	Placements          WorkerScriptPlacementArrayInput
	PlainTextBindings   WorkerScriptPlainTextBindingArrayInput
	QueueBindings       WorkerScriptQueueBindingArrayInput
	R2BucketBindings    WorkerScriptR2BucketBindingArrayInput
	SecretTextBindings  WorkerScriptSecretTextBindingArrayInput
	ServiceBindings     WorkerScriptServiceBindingArrayInput
	Tags                pulumi.StringArrayInput
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayInput
}

func (WorkerScriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workerScriptArgs)(nil)).Elem()
}

type WorkerScriptInput interface {
	pulumi.Input

	ToWorkerScriptOutput() WorkerScriptOutput
	ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput
}

func (*WorkerScript) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerScript)(nil)).Elem()
}

func (i *WorkerScript) ToWorkerScriptOutput() WorkerScriptOutput {
	return i.ToWorkerScriptOutputWithContext(context.Background())
}

func (i *WorkerScript) ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerScriptOutput)
}

// WorkerScriptArrayInput is an input type that accepts WorkerScriptArray and WorkerScriptArrayOutput values.
// You can construct a concrete instance of `WorkerScriptArrayInput` via:
//
//	WorkerScriptArray{ WorkerScriptArgs{...} }
type WorkerScriptArrayInput interface {
	pulumi.Input

	ToWorkerScriptArrayOutput() WorkerScriptArrayOutput
	ToWorkerScriptArrayOutputWithContext(context.Context) WorkerScriptArrayOutput
}

type WorkerScriptArray []WorkerScriptInput

func (WorkerScriptArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerScript)(nil)).Elem()
}

func (i WorkerScriptArray) ToWorkerScriptArrayOutput() WorkerScriptArrayOutput {
	return i.ToWorkerScriptArrayOutputWithContext(context.Background())
}

func (i WorkerScriptArray) ToWorkerScriptArrayOutputWithContext(ctx context.Context) WorkerScriptArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerScriptArrayOutput)
}

// WorkerScriptMapInput is an input type that accepts WorkerScriptMap and WorkerScriptMapOutput values.
// You can construct a concrete instance of `WorkerScriptMapInput` via:
//
//	WorkerScriptMap{ "key": WorkerScriptArgs{...} }
type WorkerScriptMapInput interface {
	pulumi.Input

	ToWorkerScriptMapOutput() WorkerScriptMapOutput
	ToWorkerScriptMapOutputWithContext(context.Context) WorkerScriptMapOutput
}

type WorkerScriptMap map[string]WorkerScriptInput

func (WorkerScriptMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerScript)(nil)).Elem()
}

func (i WorkerScriptMap) ToWorkerScriptMapOutput() WorkerScriptMapOutput {
	return i.ToWorkerScriptMapOutputWithContext(context.Background())
}

func (i WorkerScriptMap) ToWorkerScriptMapOutputWithContext(ctx context.Context) WorkerScriptMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerScriptMapOutput)
}

type WorkerScriptOutput struct{ *pulumi.OutputState }

func (WorkerScriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerScript)(nil)).Elem()
}

func (o WorkerScriptOutput) ToWorkerScriptOutput() WorkerScriptOutput {
	return o
}

func (o WorkerScriptOutput) ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput {
	return o
}

// The account identifier to target for the resource.
func (o WorkerScriptOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

func (o WorkerScriptOutput) AnalyticsEngineBindings() WorkerScriptAnalyticsEngineBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptAnalyticsEngineBindingArrayOutput { return v.AnalyticsEngineBindings }).(WorkerScriptAnalyticsEngineBindingArrayOutput)
}

// The date to use for the compatibility flag.
func (o WorkerScriptOutput) CompatibilityDate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringPtrOutput { return v.CompatibilityDate }).(pulumi.StringPtrOutput)
}

// Compatibility flags used for Worker Scripts.
func (o WorkerScriptOutput) CompatibilityFlags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringArrayOutput { return v.CompatibilityFlags }).(pulumi.StringArrayOutput)
}

// The script content.
func (o WorkerScriptOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringOutput { return v.Content }).(pulumi.StringOutput)
}

func (o WorkerScriptOutput) D1DatabaseBindings() WorkerScriptD1DatabaseBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptD1DatabaseBindingArrayOutput { return v.D1DatabaseBindings }).(WorkerScriptD1DatabaseBindingArrayOutput)
}

// Name of the Workers for Platforms dispatch namespace.
func (o WorkerScriptOutput) DispatchNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringPtrOutput { return v.DispatchNamespace }).(pulumi.StringPtrOutput)
}

func (o WorkerScriptOutput) HyperdriveConfigBindings() WorkerScriptHyperdriveConfigBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptHyperdriveConfigBindingArrayOutput {
		return v.HyperdriveConfigBindings
	}).(WorkerScriptHyperdriveConfigBindingArrayOutput)
}

func (o WorkerScriptOutput) KvNamespaceBindings() WorkerScriptKvNamespaceBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptKvNamespaceBindingArrayOutput { return v.KvNamespaceBindings }).(WorkerScriptKvNamespaceBindingArrayOutput)
}

// Enabling allows Worker events to be sent to a defined Logpush destination.
func (o WorkerScriptOutput) Logpush() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.BoolPtrOutput { return v.Logpush }).(pulumi.BoolPtrOutput)
}

// Whether to upload Worker as a module.
func (o WorkerScriptOutput) Module() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.BoolPtrOutput { return v.Module }).(pulumi.BoolPtrOutput)
}

// The name for the script. **Modifying this attribute will force creation of a new resource.**
func (o WorkerScriptOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o WorkerScriptOutput) Placements() WorkerScriptPlacementArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptPlacementArrayOutput { return v.Placements }).(WorkerScriptPlacementArrayOutput)
}

func (o WorkerScriptOutput) PlainTextBindings() WorkerScriptPlainTextBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptPlainTextBindingArrayOutput { return v.PlainTextBindings }).(WorkerScriptPlainTextBindingArrayOutput)
}

func (o WorkerScriptOutput) QueueBindings() WorkerScriptQueueBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptQueueBindingArrayOutput { return v.QueueBindings }).(WorkerScriptQueueBindingArrayOutput)
}

func (o WorkerScriptOutput) R2BucketBindings() WorkerScriptR2BucketBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptR2BucketBindingArrayOutput { return v.R2BucketBindings }).(WorkerScriptR2BucketBindingArrayOutput)
}

func (o WorkerScriptOutput) SecretTextBindings() WorkerScriptSecretTextBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptSecretTextBindingArrayOutput { return v.SecretTextBindings }).(WorkerScriptSecretTextBindingArrayOutput)
}

func (o WorkerScriptOutput) ServiceBindings() WorkerScriptServiceBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptServiceBindingArrayOutput { return v.ServiceBindings }).(WorkerScriptServiceBindingArrayOutput)
}

func (o WorkerScriptOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o WorkerScriptOutput) WebassemblyBindings() WorkerScriptWebassemblyBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptWebassemblyBindingArrayOutput { return v.WebassemblyBindings }).(WorkerScriptWebassemblyBindingArrayOutput)
}

type WorkerScriptArrayOutput struct{ *pulumi.OutputState }

func (WorkerScriptArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerScript)(nil)).Elem()
}

func (o WorkerScriptArrayOutput) ToWorkerScriptArrayOutput() WorkerScriptArrayOutput {
	return o
}

func (o WorkerScriptArrayOutput) ToWorkerScriptArrayOutputWithContext(ctx context.Context) WorkerScriptArrayOutput {
	return o
}

func (o WorkerScriptArrayOutput) Index(i pulumi.IntInput) WorkerScriptOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkerScript {
		return vs[0].([]*WorkerScript)[vs[1].(int)]
	}).(WorkerScriptOutput)
}

type WorkerScriptMapOutput struct{ *pulumi.OutputState }

func (WorkerScriptMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerScript)(nil)).Elem()
}

func (o WorkerScriptMapOutput) ToWorkerScriptMapOutput() WorkerScriptMapOutput {
	return o
}

func (o WorkerScriptMapOutput) ToWorkerScriptMapOutputWithContext(ctx context.Context) WorkerScriptMapOutput {
	return o
}

func (o WorkerScriptMapOutput) MapIndex(k pulumi.StringInput) WorkerScriptOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkerScript {
		return vs[0].(map[string]*WorkerScript)[vs[1].(string)]
	}).(WorkerScriptOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerScriptInput)(nil)).Elem(), &WorkerScript{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerScriptArrayInput)(nil)).Elem(), WorkerScriptArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerScriptMapInput)(nil)).Elem(), WorkerScriptMap{})
	pulumi.RegisterOutputType(WorkerScriptOutput{})
	pulumi.RegisterOutputType(WorkerScriptArrayOutput{})
	pulumi.RegisterOutputType(WorkerScriptMapOutput{})
}
