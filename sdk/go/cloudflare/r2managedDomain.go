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
//			_, err := cloudflare.NewR2ManagedDomain(ctx, "example_r2_managed_domain", &cloudflare.R2ManagedDomainArgs{
//				AccountId:  pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				BucketName: pulumi.String("example-bucket"),
//				Enabled:    pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type R2ManagedDomain struct {
	pulumi.CustomResourceState

	// Account ID.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Bucket ID.
	BucketId pulumi.StringOutput `pulumi:"bucketId"`
	// Name of the bucket.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// Domain name of the bucket's r2.dev domain.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// Whether to enable public bucket access at the r2.dev domain.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringOutput `pulumi:"jurisdiction"`
}

// NewR2ManagedDomain registers a new resource with the given unique name, arguments, and options.
func NewR2ManagedDomain(ctx *pulumi.Context,
	name string, args *R2ManagedDomainArgs, opts ...pulumi.ResourceOption) (*R2ManagedDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource R2ManagedDomain
	err := ctx.RegisterResource("cloudflare:index/r2ManagedDomain:R2ManagedDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetR2ManagedDomain gets an existing R2ManagedDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetR2ManagedDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *R2ManagedDomainState, opts ...pulumi.ResourceOption) (*R2ManagedDomain, error) {
	var resource R2ManagedDomain
	err := ctx.ReadResource("cloudflare:index/r2ManagedDomain:R2ManagedDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering R2ManagedDomain resources.
type r2managedDomainState struct {
	// Account ID.
	AccountId *string `pulumi:"accountId"`
	// Bucket ID.
	BucketId *string `pulumi:"bucketId"`
	// Name of the bucket.
	BucketName *string `pulumi:"bucketName"`
	// Domain name of the bucket's r2.dev domain.
	Domain *string `pulumi:"domain"`
	// Whether to enable public bucket access at the r2.dev domain.
	Enabled *bool `pulumi:"enabled"`
	// Jurisdiction of the bucket
	Jurisdiction *string `pulumi:"jurisdiction"`
}

type R2ManagedDomainState struct {
	// Account ID.
	AccountId pulumi.StringPtrInput
	// Bucket ID.
	BucketId pulumi.StringPtrInput
	// Name of the bucket.
	BucketName pulumi.StringPtrInput
	// Domain name of the bucket's r2.dev domain.
	Domain pulumi.StringPtrInput
	// Whether to enable public bucket access at the r2.dev domain.
	Enabled pulumi.BoolPtrInput
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringPtrInput
}

func (R2ManagedDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*r2managedDomainState)(nil)).Elem()
}

type r2managedDomainArgs struct {
	// Account ID.
	AccountId string `pulumi:"accountId"`
	// Name of the bucket.
	BucketName string `pulumi:"bucketName"`
	// Whether to enable public bucket access at the r2.dev domain.
	Enabled bool `pulumi:"enabled"`
	// Jurisdiction of the bucket
	Jurisdiction *string `pulumi:"jurisdiction"`
}

// The set of arguments for constructing a R2ManagedDomain resource.
type R2ManagedDomainArgs struct {
	// Account ID.
	AccountId pulumi.StringInput
	// Name of the bucket.
	BucketName pulumi.StringInput
	// Whether to enable public bucket access at the r2.dev domain.
	Enabled pulumi.BoolInput
	// Jurisdiction of the bucket
	Jurisdiction pulumi.StringPtrInput
}

func (R2ManagedDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*r2managedDomainArgs)(nil)).Elem()
}

type R2ManagedDomainInput interface {
	pulumi.Input

	ToR2ManagedDomainOutput() R2ManagedDomainOutput
	ToR2ManagedDomainOutputWithContext(ctx context.Context) R2ManagedDomainOutput
}

func (*R2ManagedDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**R2ManagedDomain)(nil)).Elem()
}

func (i *R2ManagedDomain) ToR2ManagedDomainOutput() R2ManagedDomainOutput {
	return i.ToR2ManagedDomainOutputWithContext(context.Background())
}

func (i *R2ManagedDomain) ToR2ManagedDomainOutputWithContext(ctx context.Context) R2ManagedDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2ManagedDomainOutput)
}

// R2ManagedDomainArrayInput is an input type that accepts R2ManagedDomainArray and R2ManagedDomainArrayOutput values.
// You can construct a concrete instance of `R2ManagedDomainArrayInput` via:
//
//	R2ManagedDomainArray{ R2ManagedDomainArgs{...} }
type R2ManagedDomainArrayInput interface {
	pulumi.Input

	ToR2ManagedDomainArrayOutput() R2ManagedDomainArrayOutput
	ToR2ManagedDomainArrayOutputWithContext(context.Context) R2ManagedDomainArrayOutput
}

type R2ManagedDomainArray []R2ManagedDomainInput

func (R2ManagedDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2ManagedDomain)(nil)).Elem()
}

func (i R2ManagedDomainArray) ToR2ManagedDomainArrayOutput() R2ManagedDomainArrayOutput {
	return i.ToR2ManagedDomainArrayOutputWithContext(context.Background())
}

func (i R2ManagedDomainArray) ToR2ManagedDomainArrayOutputWithContext(ctx context.Context) R2ManagedDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2ManagedDomainArrayOutput)
}

// R2ManagedDomainMapInput is an input type that accepts R2ManagedDomainMap and R2ManagedDomainMapOutput values.
// You can construct a concrete instance of `R2ManagedDomainMapInput` via:
//
//	R2ManagedDomainMap{ "key": R2ManagedDomainArgs{...} }
type R2ManagedDomainMapInput interface {
	pulumi.Input

	ToR2ManagedDomainMapOutput() R2ManagedDomainMapOutput
	ToR2ManagedDomainMapOutputWithContext(context.Context) R2ManagedDomainMapOutput
}

type R2ManagedDomainMap map[string]R2ManagedDomainInput

func (R2ManagedDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2ManagedDomain)(nil)).Elem()
}

func (i R2ManagedDomainMap) ToR2ManagedDomainMapOutput() R2ManagedDomainMapOutput {
	return i.ToR2ManagedDomainMapOutputWithContext(context.Background())
}

func (i R2ManagedDomainMap) ToR2ManagedDomainMapOutputWithContext(ctx context.Context) R2ManagedDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2ManagedDomainMapOutput)
}

type R2ManagedDomainOutput struct{ *pulumi.OutputState }

func (R2ManagedDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**R2ManagedDomain)(nil)).Elem()
}

func (o R2ManagedDomainOutput) ToR2ManagedDomainOutput() R2ManagedDomainOutput {
	return o
}

func (o R2ManagedDomainOutput) ToR2ManagedDomainOutputWithContext(ctx context.Context) R2ManagedDomainOutput {
	return o
}

// Account ID.
func (o R2ManagedDomainOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *R2ManagedDomain) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Bucket ID.
func (o R2ManagedDomainOutput) BucketId() pulumi.StringOutput {
	return o.ApplyT(func(v *R2ManagedDomain) pulumi.StringOutput { return v.BucketId }).(pulumi.StringOutput)
}

// Name of the bucket.
func (o R2ManagedDomainOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *R2ManagedDomain) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

// Domain name of the bucket's r2.dev domain.
func (o R2ManagedDomainOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *R2ManagedDomain) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// Whether to enable public bucket access at the r2.dev domain.
func (o R2ManagedDomainOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *R2ManagedDomain) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Jurisdiction of the bucket
func (o R2ManagedDomainOutput) Jurisdiction() pulumi.StringOutput {
	return o.ApplyT(func(v *R2ManagedDomain) pulumi.StringOutput { return v.Jurisdiction }).(pulumi.StringOutput)
}

type R2ManagedDomainArrayOutput struct{ *pulumi.OutputState }

func (R2ManagedDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2ManagedDomain)(nil)).Elem()
}

func (o R2ManagedDomainArrayOutput) ToR2ManagedDomainArrayOutput() R2ManagedDomainArrayOutput {
	return o
}

func (o R2ManagedDomainArrayOutput) ToR2ManagedDomainArrayOutputWithContext(ctx context.Context) R2ManagedDomainArrayOutput {
	return o
}

func (o R2ManagedDomainArrayOutput) Index(i pulumi.IntInput) R2ManagedDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *R2ManagedDomain {
		return vs[0].([]*R2ManagedDomain)[vs[1].(int)]
	}).(R2ManagedDomainOutput)
}

type R2ManagedDomainMapOutput struct{ *pulumi.OutputState }

func (R2ManagedDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2ManagedDomain)(nil)).Elem()
}

func (o R2ManagedDomainMapOutput) ToR2ManagedDomainMapOutput() R2ManagedDomainMapOutput {
	return o
}

func (o R2ManagedDomainMapOutput) ToR2ManagedDomainMapOutputWithContext(ctx context.Context) R2ManagedDomainMapOutput {
	return o
}

func (o R2ManagedDomainMapOutput) MapIndex(k pulumi.StringInput) R2ManagedDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *R2ManagedDomain {
		return vs[0].(map[string]*R2ManagedDomain)[vs[1].(string)]
	}).(R2ManagedDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*R2ManagedDomainInput)(nil)).Elem(), &R2ManagedDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2ManagedDomainArrayInput)(nil)).Elem(), R2ManagedDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2ManagedDomainMapInput)(nil)).Elem(), R2ManagedDomainMap{})
	pulumi.RegisterOutputType(R2ManagedDomainOutput{})
	pulumi.RegisterOutputType(R2ManagedDomainArrayOutput{})
	pulumi.RegisterOutputType(R2ManagedDomainMapOutput{})
}
