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
type R2BucketLifecycle struct {
	pulumi.CustomResourceState

	// Account ID.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Name of the bucket.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringOutput              `pulumi:"jurisdiction"`
	Rules        R2BucketLifecycleRuleArrayOutput `pulumi:"rules"`
}

// NewR2BucketLifecycle registers a new resource with the given unique name, arguments, and options.
func NewR2BucketLifecycle(ctx *pulumi.Context,
	name string, args *R2BucketLifecycleArgs, opts ...pulumi.ResourceOption) (*R2BucketLifecycle, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource R2BucketLifecycle
	err := ctx.RegisterResource("cloudflare:index/r2BucketLifecycle:R2BucketLifecycle", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetR2BucketLifecycle gets an existing R2BucketLifecycle resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetR2BucketLifecycle(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *R2BucketLifecycleState, opts ...pulumi.ResourceOption) (*R2BucketLifecycle, error) {
	var resource R2BucketLifecycle
	err := ctx.ReadResource("cloudflare:index/r2BucketLifecycle:R2BucketLifecycle", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering R2BucketLifecycle resources.
type r2bucketLifecycleState struct {
	// Account ID.
	AccountId *string `pulumi:"accountId"`
	// Name of the bucket.
	BucketName *string `pulumi:"bucketName"`
	// Jurisdiction of the bucket
	Jurisdiction *string                 `pulumi:"jurisdiction"`
	Rules        []R2BucketLifecycleRule `pulumi:"rules"`
}

type R2BucketLifecycleState struct {
	// Account ID.
	AccountId pulumi.StringPtrInput
	// Name of the bucket.
	BucketName pulumi.StringPtrInput
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringPtrInput
	Rules        R2BucketLifecycleRuleArrayInput
}

func (R2BucketLifecycleState) ElementType() reflect.Type {
	return reflect.TypeOf((*r2bucketLifecycleState)(nil)).Elem()
}

type r2bucketLifecycleArgs struct {
	// Account ID.
	AccountId string `pulumi:"accountId"`
	// Name of the bucket.
	BucketName string `pulumi:"bucketName"`
	// Jurisdiction of the bucket
	Jurisdiction *string                 `pulumi:"jurisdiction"`
	Rules        []R2BucketLifecycleRule `pulumi:"rules"`
}

// The set of arguments for constructing a R2BucketLifecycle resource.
type R2BucketLifecycleArgs struct {
	// Account ID.
	AccountId pulumi.StringInput
	// Name of the bucket.
	BucketName pulumi.StringInput
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringPtrInput
	Rules        R2BucketLifecycleRuleArrayInput
}

func (R2BucketLifecycleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*r2bucketLifecycleArgs)(nil)).Elem()
}

type R2BucketLifecycleInput interface {
	pulumi.Input

	ToR2BucketLifecycleOutput() R2BucketLifecycleOutput
	ToR2BucketLifecycleOutputWithContext(ctx context.Context) R2BucketLifecycleOutput
}

func (*R2BucketLifecycle) ElementType() reflect.Type {
	return reflect.TypeOf((**R2BucketLifecycle)(nil)).Elem()
}

func (i *R2BucketLifecycle) ToR2BucketLifecycleOutput() R2BucketLifecycleOutput {
	return i.ToR2BucketLifecycleOutputWithContext(context.Background())
}

func (i *R2BucketLifecycle) ToR2BucketLifecycleOutputWithContext(ctx context.Context) R2BucketLifecycleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketLifecycleOutput)
}

// R2BucketLifecycleArrayInput is an input type that accepts R2BucketLifecycleArray and R2BucketLifecycleArrayOutput values.
// You can construct a concrete instance of `R2BucketLifecycleArrayInput` via:
//
//	R2BucketLifecycleArray{ R2BucketLifecycleArgs{...} }
type R2BucketLifecycleArrayInput interface {
	pulumi.Input

	ToR2BucketLifecycleArrayOutput() R2BucketLifecycleArrayOutput
	ToR2BucketLifecycleArrayOutputWithContext(context.Context) R2BucketLifecycleArrayOutput
}

type R2BucketLifecycleArray []R2BucketLifecycleInput

func (R2BucketLifecycleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2BucketLifecycle)(nil)).Elem()
}

func (i R2BucketLifecycleArray) ToR2BucketLifecycleArrayOutput() R2BucketLifecycleArrayOutput {
	return i.ToR2BucketLifecycleArrayOutputWithContext(context.Background())
}

func (i R2BucketLifecycleArray) ToR2BucketLifecycleArrayOutputWithContext(ctx context.Context) R2BucketLifecycleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketLifecycleArrayOutput)
}

// R2BucketLifecycleMapInput is an input type that accepts R2BucketLifecycleMap and R2BucketLifecycleMapOutput values.
// You can construct a concrete instance of `R2BucketLifecycleMapInput` via:
//
//	R2BucketLifecycleMap{ "key": R2BucketLifecycleArgs{...} }
type R2BucketLifecycleMapInput interface {
	pulumi.Input

	ToR2BucketLifecycleMapOutput() R2BucketLifecycleMapOutput
	ToR2BucketLifecycleMapOutputWithContext(context.Context) R2BucketLifecycleMapOutput
}

type R2BucketLifecycleMap map[string]R2BucketLifecycleInput

func (R2BucketLifecycleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2BucketLifecycle)(nil)).Elem()
}

func (i R2BucketLifecycleMap) ToR2BucketLifecycleMapOutput() R2BucketLifecycleMapOutput {
	return i.ToR2BucketLifecycleMapOutputWithContext(context.Background())
}

func (i R2BucketLifecycleMap) ToR2BucketLifecycleMapOutputWithContext(ctx context.Context) R2BucketLifecycleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketLifecycleMapOutput)
}

type R2BucketLifecycleOutput struct{ *pulumi.OutputState }

func (R2BucketLifecycleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**R2BucketLifecycle)(nil)).Elem()
}

func (o R2BucketLifecycleOutput) ToR2BucketLifecycleOutput() R2BucketLifecycleOutput {
	return o
}

func (o R2BucketLifecycleOutput) ToR2BucketLifecycleOutputWithContext(ctx context.Context) R2BucketLifecycleOutput {
	return o
}

// Account ID.
func (o R2BucketLifecycleOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *R2BucketLifecycle) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Name of the bucket.
func (o R2BucketLifecycleOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *R2BucketLifecycle) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

// Jurisdiction of the bucket
func (o R2BucketLifecycleOutput) Jurisdiction() pulumi.StringOutput {
	return o.ApplyT(func(v *R2BucketLifecycle) pulumi.StringOutput { return v.Jurisdiction }).(pulumi.StringOutput)
}

func (o R2BucketLifecycleOutput) Rules() R2BucketLifecycleRuleArrayOutput {
	return o.ApplyT(func(v *R2BucketLifecycle) R2BucketLifecycleRuleArrayOutput { return v.Rules }).(R2BucketLifecycleRuleArrayOutput)
}

type R2BucketLifecycleArrayOutput struct{ *pulumi.OutputState }

func (R2BucketLifecycleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2BucketLifecycle)(nil)).Elem()
}

func (o R2BucketLifecycleArrayOutput) ToR2BucketLifecycleArrayOutput() R2BucketLifecycleArrayOutput {
	return o
}

func (o R2BucketLifecycleArrayOutput) ToR2BucketLifecycleArrayOutputWithContext(ctx context.Context) R2BucketLifecycleArrayOutput {
	return o
}

func (o R2BucketLifecycleArrayOutput) Index(i pulumi.IntInput) R2BucketLifecycleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *R2BucketLifecycle {
		return vs[0].([]*R2BucketLifecycle)[vs[1].(int)]
	}).(R2BucketLifecycleOutput)
}

type R2BucketLifecycleMapOutput struct{ *pulumi.OutputState }

func (R2BucketLifecycleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2BucketLifecycle)(nil)).Elem()
}

func (o R2BucketLifecycleMapOutput) ToR2BucketLifecycleMapOutput() R2BucketLifecycleMapOutput {
	return o
}

func (o R2BucketLifecycleMapOutput) ToR2BucketLifecycleMapOutputWithContext(ctx context.Context) R2BucketLifecycleMapOutput {
	return o
}

func (o R2BucketLifecycleMapOutput) MapIndex(k pulumi.StringInput) R2BucketLifecycleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *R2BucketLifecycle {
		return vs[0].(map[string]*R2BucketLifecycle)[vs[1].(string)]
	}).(R2BucketLifecycleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketLifecycleInput)(nil)).Elem(), &R2BucketLifecycle{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketLifecycleArrayInput)(nil)).Elem(), R2BucketLifecycleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketLifecycleMapInput)(nil)).Elem(), R2BucketLifecycleMap{})
	pulumi.RegisterOutputType(R2BucketLifecycleOutput{})
	pulumi.RegisterOutputType(R2BucketLifecycleArrayOutput{})
	pulumi.RegisterOutputType(R2BucketLifecycleMapOutput{})
}
