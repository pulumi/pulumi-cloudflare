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

// Creates a Worker Custom Domain.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewWorkersDomain(ctx, "example", &cloudflare.WorkersDomainArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Hostname:  pulumi.String("subdomain.example.com"),
//				Service:   pulumi.String("my-service"),
//				ZoneId:    pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
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
// $ pulumi import cloudflare:index/workersDomain:WorkersDomain example <account_id>/<worker_domain_id>
// ```
type WorkersDomain struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The name of the Worker environment. Defaults to `production`.
	Environment pulumi.StringPtrOutput `pulumi:"environment"`
	// Hostname of the Worker Domain.
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// Name of worker script to attach the domain to.
	Service pulumi.StringOutput `pulumi:"service"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWorkersDomain registers a new resource with the given unique name, arguments, and options.
func NewWorkersDomain(ctx *pulumi.Context,
	name string, args *WorkersDomainArgs, opts ...pulumi.ResourceOption) (*WorkersDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Hostname == nil {
		return nil, errors.New("invalid value for required argument 'Hostname'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkersDomain
	err := ctx.RegisterResource("cloudflare:index/workersDomain:WorkersDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkersDomain gets an existing WorkersDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkersDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkersDomainState, opts ...pulumi.ResourceOption) (*WorkersDomain, error) {
	var resource WorkersDomain
	err := ctx.ReadResource("cloudflare:index/workersDomain:WorkersDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkersDomain resources.
type workersDomainState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The name of the Worker environment. Defaults to `production`.
	Environment *string `pulumi:"environment"`
	// Hostname of the Worker Domain.
	Hostname *string `pulumi:"hostname"`
	// Name of worker script to attach the domain to.
	Service *string `pulumi:"service"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type WorkersDomainState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The name of the Worker environment. Defaults to `production`.
	Environment pulumi.StringPtrInput
	// Hostname of the Worker Domain.
	Hostname pulumi.StringPtrInput
	// Name of worker script to attach the domain to.
	Service pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (WorkersDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*workersDomainState)(nil)).Elem()
}

type workersDomainArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// The name of the Worker environment. Defaults to `production`.
	Environment *string `pulumi:"environment"`
	// Hostname of the Worker Domain.
	Hostname string `pulumi:"hostname"`
	// Name of worker script to attach the domain to.
	Service string `pulumi:"service"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WorkersDomain resource.
type WorkersDomainArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// The name of the Worker environment. Defaults to `production`.
	Environment pulumi.StringPtrInput
	// Hostname of the Worker Domain.
	Hostname pulumi.StringInput
	// Name of worker script to attach the domain to.
	Service pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (WorkersDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workersDomainArgs)(nil)).Elem()
}

type WorkersDomainInput interface {
	pulumi.Input

	ToWorkersDomainOutput() WorkersDomainOutput
	ToWorkersDomainOutputWithContext(ctx context.Context) WorkersDomainOutput
}

func (*WorkersDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersDomain)(nil)).Elem()
}

func (i *WorkersDomain) ToWorkersDomainOutput() WorkersDomainOutput {
	return i.ToWorkersDomainOutputWithContext(context.Background())
}

func (i *WorkersDomain) ToWorkersDomainOutputWithContext(ctx context.Context) WorkersDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersDomainOutput)
}

// WorkersDomainArrayInput is an input type that accepts WorkersDomainArray and WorkersDomainArrayOutput values.
// You can construct a concrete instance of `WorkersDomainArrayInput` via:
//
//	WorkersDomainArray{ WorkersDomainArgs{...} }
type WorkersDomainArrayInput interface {
	pulumi.Input

	ToWorkersDomainArrayOutput() WorkersDomainArrayOutput
	ToWorkersDomainArrayOutputWithContext(context.Context) WorkersDomainArrayOutput
}

type WorkersDomainArray []WorkersDomainInput

func (WorkersDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersDomain)(nil)).Elem()
}

func (i WorkersDomainArray) ToWorkersDomainArrayOutput() WorkersDomainArrayOutput {
	return i.ToWorkersDomainArrayOutputWithContext(context.Background())
}

func (i WorkersDomainArray) ToWorkersDomainArrayOutputWithContext(ctx context.Context) WorkersDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersDomainArrayOutput)
}

// WorkersDomainMapInput is an input type that accepts WorkersDomainMap and WorkersDomainMapOutput values.
// You can construct a concrete instance of `WorkersDomainMapInput` via:
//
//	WorkersDomainMap{ "key": WorkersDomainArgs{...} }
type WorkersDomainMapInput interface {
	pulumi.Input

	ToWorkersDomainMapOutput() WorkersDomainMapOutput
	ToWorkersDomainMapOutputWithContext(context.Context) WorkersDomainMapOutput
}

type WorkersDomainMap map[string]WorkersDomainInput

func (WorkersDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersDomain)(nil)).Elem()
}

func (i WorkersDomainMap) ToWorkersDomainMapOutput() WorkersDomainMapOutput {
	return i.ToWorkersDomainMapOutputWithContext(context.Background())
}

func (i WorkersDomainMap) ToWorkersDomainMapOutputWithContext(ctx context.Context) WorkersDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersDomainMapOutput)
}

type WorkersDomainOutput struct{ *pulumi.OutputState }

func (WorkersDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersDomain)(nil)).Elem()
}

func (o WorkersDomainOutput) ToWorkersDomainOutput() WorkersDomainOutput {
	return o
}

func (o WorkersDomainOutput) ToWorkersDomainOutputWithContext(ctx context.Context) WorkersDomainOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WorkersDomainOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersDomain) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The name of the Worker environment. Defaults to `production`.
func (o WorkersDomainOutput) Environment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkersDomain) pulumi.StringPtrOutput { return v.Environment }).(pulumi.StringPtrOutput)
}

// Hostname of the Worker Domain.
func (o WorkersDomainOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersDomain) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// Name of worker script to attach the domain to.
func (o WorkersDomainOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersDomain) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WorkersDomainOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersDomain) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WorkersDomainArrayOutput struct{ *pulumi.OutputState }

func (WorkersDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersDomain)(nil)).Elem()
}

func (o WorkersDomainArrayOutput) ToWorkersDomainArrayOutput() WorkersDomainArrayOutput {
	return o
}

func (o WorkersDomainArrayOutput) ToWorkersDomainArrayOutputWithContext(ctx context.Context) WorkersDomainArrayOutput {
	return o
}

func (o WorkersDomainArrayOutput) Index(i pulumi.IntInput) WorkersDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkersDomain {
		return vs[0].([]*WorkersDomain)[vs[1].(int)]
	}).(WorkersDomainOutput)
}

type WorkersDomainMapOutput struct{ *pulumi.OutputState }

func (WorkersDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersDomain)(nil)).Elem()
}

func (o WorkersDomainMapOutput) ToWorkersDomainMapOutput() WorkersDomainMapOutput {
	return o
}

func (o WorkersDomainMapOutput) ToWorkersDomainMapOutputWithContext(ctx context.Context) WorkersDomainMapOutput {
	return o
}

func (o WorkersDomainMapOutput) MapIndex(k pulumi.StringInput) WorkersDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkersDomain {
		return vs[0].(map[string]*WorkersDomain)[vs[1].(string)]
	}).(WorkersDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersDomainInput)(nil)).Elem(), &WorkersDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersDomainArrayInput)(nil)).Elem(), WorkersDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersDomainMapInput)(nil)).Elem(), WorkersDomainMap{})
	pulumi.RegisterOutputType(WorkersDomainOutput{})
	pulumi.RegisterOutputType(WorkersDomainArrayOutput{})
	pulumi.RegisterOutputType(WorkersDomainMapOutput{})
}
