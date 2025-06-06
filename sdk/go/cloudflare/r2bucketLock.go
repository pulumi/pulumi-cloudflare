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
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v6/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewR2BucketLock(ctx, "example_r2_bucket_lock", &cloudflare.R2BucketLockArgs{
//				AccountId:  pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				BucketName: pulumi.String("example-bucket"),
//				Rules: cloudflare.R2BucketLockRuleArray{
//					&cloudflare.R2BucketLockRuleArgs{
//						Id: pulumi.String("Lock all objects for 24 hours"),
//						Condition: &cloudflare.R2BucketLockRuleConditionArgs{
//							MaxAgeSeconds: pulumi.Int(100),
//							Type:          pulumi.String("Age"),
//						},
//						Enabled: pulumi.Bool(true),
//						Prefix:  pulumi.String("prefix"),
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
type R2BucketLock struct {
	pulumi.CustomResourceState

	// Account ID.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Name of the bucket.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringOutput         `pulumi:"jurisdiction"`
	Rules        R2BucketLockRuleArrayOutput `pulumi:"rules"`
}

// NewR2BucketLock registers a new resource with the given unique name, arguments, and options.
func NewR2BucketLock(ctx *pulumi.Context,
	name string, args *R2BucketLockArgs, opts ...pulumi.ResourceOption) (*R2BucketLock, error) {
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
	var resource R2BucketLock
	err := ctx.RegisterResource("cloudflare:index/r2BucketLock:R2BucketLock", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetR2BucketLock gets an existing R2BucketLock resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetR2BucketLock(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *R2BucketLockState, opts ...pulumi.ResourceOption) (*R2BucketLock, error) {
	var resource R2BucketLock
	err := ctx.ReadResource("cloudflare:index/r2BucketLock:R2BucketLock", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering R2BucketLock resources.
type r2bucketLockState struct {
	// Account ID.
	AccountId *string `pulumi:"accountId"`
	// Name of the bucket.
	BucketName *string `pulumi:"bucketName"`
	// Jurisdiction of the bucket
	Jurisdiction *string            `pulumi:"jurisdiction"`
	Rules        []R2BucketLockRule `pulumi:"rules"`
}

type R2BucketLockState struct {
	// Account ID.
	AccountId pulumi.StringPtrInput
	// Name of the bucket.
	BucketName pulumi.StringPtrInput
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringPtrInput
	Rules        R2BucketLockRuleArrayInput
}

func (R2BucketLockState) ElementType() reflect.Type {
	return reflect.TypeOf((*r2bucketLockState)(nil)).Elem()
}

type r2bucketLockArgs struct {
	// Account ID.
	AccountId string `pulumi:"accountId"`
	// Name of the bucket.
	BucketName string `pulumi:"bucketName"`
	// Jurisdiction of the bucket
	Jurisdiction *string            `pulumi:"jurisdiction"`
	Rules        []R2BucketLockRule `pulumi:"rules"`
}

// The set of arguments for constructing a R2BucketLock resource.
type R2BucketLockArgs struct {
	// Account ID.
	AccountId pulumi.StringInput
	// Name of the bucket.
	BucketName pulumi.StringInput
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringPtrInput
	Rules        R2BucketLockRuleArrayInput
}

func (R2BucketLockArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*r2bucketLockArgs)(nil)).Elem()
}

type R2BucketLockInput interface {
	pulumi.Input

	ToR2BucketLockOutput() R2BucketLockOutput
	ToR2BucketLockOutputWithContext(ctx context.Context) R2BucketLockOutput
}

func (*R2BucketLock) ElementType() reflect.Type {
	return reflect.TypeOf((**R2BucketLock)(nil)).Elem()
}

func (i *R2BucketLock) ToR2BucketLockOutput() R2BucketLockOutput {
	return i.ToR2BucketLockOutputWithContext(context.Background())
}

func (i *R2BucketLock) ToR2BucketLockOutputWithContext(ctx context.Context) R2BucketLockOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketLockOutput)
}

// R2BucketLockArrayInput is an input type that accepts R2BucketLockArray and R2BucketLockArrayOutput values.
// You can construct a concrete instance of `R2BucketLockArrayInput` via:
//
//	R2BucketLockArray{ R2BucketLockArgs{...} }
type R2BucketLockArrayInput interface {
	pulumi.Input

	ToR2BucketLockArrayOutput() R2BucketLockArrayOutput
	ToR2BucketLockArrayOutputWithContext(context.Context) R2BucketLockArrayOutput
}

type R2BucketLockArray []R2BucketLockInput

func (R2BucketLockArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2BucketLock)(nil)).Elem()
}

func (i R2BucketLockArray) ToR2BucketLockArrayOutput() R2BucketLockArrayOutput {
	return i.ToR2BucketLockArrayOutputWithContext(context.Background())
}

func (i R2BucketLockArray) ToR2BucketLockArrayOutputWithContext(ctx context.Context) R2BucketLockArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketLockArrayOutput)
}

// R2BucketLockMapInput is an input type that accepts R2BucketLockMap and R2BucketLockMapOutput values.
// You can construct a concrete instance of `R2BucketLockMapInput` via:
//
//	R2BucketLockMap{ "key": R2BucketLockArgs{...} }
type R2BucketLockMapInput interface {
	pulumi.Input

	ToR2BucketLockMapOutput() R2BucketLockMapOutput
	ToR2BucketLockMapOutputWithContext(context.Context) R2BucketLockMapOutput
}

type R2BucketLockMap map[string]R2BucketLockInput

func (R2BucketLockMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2BucketLock)(nil)).Elem()
}

func (i R2BucketLockMap) ToR2BucketLockMapOutput() R2BucketLockMapOutput {
	return i.ToR2BucketLockMapOutputWithContext(context.Background())
}

func (i R2BucketLockMap) ToR2BucketLockMapOutputWithContext(ctx context.Context) R2BucketLockMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketLockMapOutput)
}

type R2BucketLockOutput struct{ *pulumi.OutputState }

func (R2BucketLockOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**R2BucketLock)(nil)).Elem()
}

func (o R2BucketLockOutput) ToR2BucketLockOutput() R2BucketLockOutput {
	return o
}

func (o R2BucketLockOutput) ToR2BucketLockOutputWithContext(ctx context.Context) R2BucketLockOutput {
	return o
}

// Account ID.
func (o R2BucketLockOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *R2BucketLock) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Name of the bucket.
func (o R2BucketLockOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *R2BucketLock) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

// Jurisdiction of the bucket
func (o R2BucketLockOutput) Jurisdiction() pulumi.StringOutput {
	return o.ApplyT(func(v *R2BucketLock) pulumi.StringOutput { return v.Jurisdiction }).(pulumi.StringOutput)
}

func (o R2BucketLockOutput) Rules() R2BucketLockRuleArrayOutput {
	return o.ApplyT(func(v *R2BucketLock) R2BucketLockRuleArrayOutput { return v.Rules }).(R2BucketLockRuleArrayOutput)
}

type R2BucketLockArrayOutput struct{ *pulumi.OutputState }

func (R2BucketLockArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2BucketLock)(nil)).Elem()
}

func (o R2BucketLockArrayOutput) ToR2BucketLockArrayOutput() R2BucketLockArrayOutput {
	return o
}

func (o R2BucketLockArrayOutput) ToR2BucketLockArrayOutputWithContext(ctx context.Context) R2BucketLockArrayOutput {
	return o
}

func (o R2BucketLockArrayOutput) Index(i pulumi.IntInput) R2BucketLockOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *R2BucketLock {
		return vs[0].([]*R2BucketLock)[vs[1].(int)]
	}).(R2BucketLockOutput)
}

type R2BucketLockMapOutput struct{ *pulumi.OutputState }

func (R2BucketLockMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2BucketLock)(nil)).Elem()
}

func (o R2BucketLockMapOutput) ToR2BucketLockMapOutput() R2BucketLockMapOutput {
	return o
}

func (o R2BucketLockMapOutput) ToR2BucketLockMapOutputWithContext(ctx context.Context) R2BucketLockMapOutput {
	return o
}

func (o R2BucketLockMapOutput) MapIndex(k pulumi.StringInput) R2BucketLockOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *R2BucketLock {
		return vs[0].(map[string]*R2BucketLock)[vs[1].(string)]
	}).(R2BucketLockOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketLockInput)(nil)).Elem(), &R2BucketLock{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketLockArrayInput)(nil)).Elem(), R2BucketLockArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketLockMapInput)(nil)).Elem(), R2BucketLockMap{})
	pulumi.RegisterOutputType(R2BucketLockOutput{})
	pulumi.RegisterOutputType(R2BucketLockArrayOutput{})
	pulumi.RegisterOutputType(R2BucketLockMapOutput{})
}
