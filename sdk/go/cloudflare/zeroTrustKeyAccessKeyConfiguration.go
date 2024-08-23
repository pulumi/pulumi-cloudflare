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

// Access Keys Configuration defines the rotation policy for the keys
// that access will use to sign data.
type ZeroTrustKeyAccessKeyConfiguration struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Number of days to trigger a rotation of the keys.
	KeyRotationIntervalDays pulumi.IntOutput `pulumi:"keyRotationIntervalDays"`
}

// NewZeroTrustKeyAccessKeyConfiguration registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustKeyAccessKeyConfiguration(ctx *pulumi.Context,
	name string, args *ZeroTrustKeyAccessKeyConfigurationArgs, opts ...pulumi.ResourceOption) (*ZeroTrustKeyAccessKeyConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustKeyAccessKeyConfiguration
	err := ctx.RegisterResource("cloudflare:index/zeroTrustKeyAccessKeyConfiguration:ZeroTrustKeyAccessKeyConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustKeyAccessKeyConfiguration gets an existing ZeroTrustKeyAccessKeyConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustKeyAccessKeyConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustKeyAccessKeyConfigurationState, opts ...pulumi.ResourceOption) (*ZeroTrustKeyAccessKeyConfiguration, error) {
	var resource ZeroTrustKeyAccessKeyConfiguration
	err := ctx.ReadResource("cloudflare:index/zeroTrustKeyAccessKeyConfiguration:ZeroTrustKeyAccessKeyConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustKeyAccessKeyConfiguration resources.
type zeroTrustKeyAccessKeyConfigurationState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Number of days to trigger a rotation of the keys.
	KeyRotationIntervalDays *int `pulumi:"keyRotationIntervalDays"`
}

type ZeroTrustKeyAccessKeyConfigurationState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Number of days to trigger a rotation of the keys.
	KeyRotationIntervalDays pulumi.IntPtrInput
}

func (ZeroTrustKeyAccessKeyConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustKeyAccessKeyConfigurationState)(nil)).Elem()
}

type zeroTrustKeyAccessKeyConfigurationArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Number of days to trigger a rotation of the keys.
	KeyRotationIntervalDays *int `pulumi:"keyRotationIntervalDays"`
}

// The set of arguments for constructing a ZeroTrustKeyAccessKeyConfiguration resource.
type ZeroTrustKeyAccessKeyConfigurationArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Number of days to trigger a rotation of the keys.
	KeyRotationIntervalDays pulumi.IntPtrInput
}

func (ZeroTrustKeyAccessKeyConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustKeyAccessKeyConfigurationArgs)(nil)).Elem()
}

type ZeroTrustKeyAccessKeyConfigurationInput interface {
	pulumi.Input

	ToZeroTrustKeyAccessKeyConfigurationOutput() ZeroTrustKeyAccessKeyConfigurationOutput
	ToZeroTrustKeyAccessKeyConfigurationOutputWithContext(ctx context.Context) ZeroTrustKeyAccessKeyConfigurationOutput
}

func (*ZeroTrustKeyAccessKeyConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustKeyAccessKeyConfiguration)(nil)).Elem()
}

func (i *ZeroTrustKeyAccessKeyConfiguration) ToZeroTrustKeyAccessKeyConfigurationOutput() ZeroTrustKeyAccessKeyConfigurationOutput {
	return i.ToZeroTrustKeyAccessKeyConfigurationOutputWithContext(context.Background())
}

func (i *ZeroTrustKeyAccessKeyConfiguration) ToZeroTrustKeyAccessKeyConfigurationOutputWithContext(ctx context.Context) ZeroTrustKeyAccessKeyConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustKeyAccessKeyConfigurationOutput)
}

// ZeroTrustKeyAccessKeyConfigurationArrayInput is an input type that accepts ZeroTrustKeyAccessKeyConfigurationArray and ZeroTrustKeyAccessKeyConfigurationArrayOutput values.
// You can construct a concrete instance of `ZeroTrustKeyAccessKeyConfigurationArrayInput` via:
//
//	ZeroTrustKeyAccessKeyConfigurationArray{ ZeroTrustKeyAccessKeyConfigurationArgs{...} }
type ZeroTrustKeyAccessKeyConfigurationArrayInput interface {
	pulumi.Input

	ToZeroTrustKeyAccessKeyConfigurationArrayOutput() ZeroTrustKeyAccessKeyConfigurationArrayOutput
	ToZeroTrustKeyAccessKeyConfigurationArrayOutputWithContext(context.Context) ZeroTrustKeyAccessKeyConfigurationArrayOutput
}

type ZeroTrustKeyAccessKeyConfigurationArray []ZeroTrustKeyAccessKeyConfigurationInput

func (ZeroTrustKeyAccessKeyConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustKeyAccessKeyConfiguration)(nil)).Elem()
}

func (i ZeroTrustKeyAccessKeyConfigurationArray) ToZeroTrustKeyAccessKeyConfigurationArrayOutput() ZeroTrustKeyAccessKeyConfigurationArrayOutput {
	return i.ToZeroTrustKeyAccessKeyConfigurationArrayOutputWithContext(context.Background())
}

func (i ZeroTrustKeyAccessKeyConfigurationArray) ToZeroTrustKeyAccessKeyConfigurationArrayOutputWithContext(ctx context.Context) ZeroTrustKeyAccessKeyConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustKeyAccessKeyConfigurationArrayOutput)
}

// ZeroTrustKeyAccessKeyConfigurationMapInput is an input type that accepts ZeroTrustKeyAccessKeyConfigurationMap and ZeroTrustKeyAccessKeyConfigurationMapOutput values.
// You can construct a concrete instance of `ZeroTrustKeyAccessKeyConfigurationMapInput` via:
//
//	ZeroTrustKeyAccessKeyConfigurationMap{ "key": ZeroTrustKeyAccessKeyConfigurationArgs{...} }
type ZeroTrustKeyAccessKeyConfigurationMapInput interface {
	pulumi.Input

	ToZeroTrustKeyAccessKeyConfigurationMapOutput() ZeroTrustKeyAccessKeyConfigurationMapOutput
	ToZeroTrustKeyAccessKeyConfigurationMapOutputWithContext(context.Context) ZeroTrustKeyAccessKeyConfigurationMapOutput
}

type ZeroTrustKeyAccessKeyConfigurationMap map[string]ZeroTrustKeyAccessKeyConfigurationInput

func (ZeroTrustKeyAccessKeyConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustKeyAccessKeyConfiguration)(nil)).Elem()
}

func (i ZeroTrustKeyAccessKeyConfigurationMap) ToZeroTrustKeyAccessKeyConfigurationMapOutput() ZeroTrustKeyAccessKeyConfigurationMapOutput {
	return i.ToZeroTrustKeyAccessKeyConfigurationMapOutputWithContext(context.Background())
}

func (i ZeroTrustKeyAccessKeyConfigurationMap) ToZeroTrustKeyAccessKeyConfigurationMapOutputWithContext(ctx context.Context) ZeroTrustKeyAccessKeyConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustKeyAccessKeyConfigurationMapOutput)
}

type ZeroTrustKeyAccessKeyConfigurationOutput struct{ *pulumi.OutputState }

func (ZeroTrustKeyAccessKeyConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustKeyAccessKeyConfiguration)(nil)).Elem()
}

func (o ZeroTrustKeyAccessKeyConfigurationOutput) ToZeroTrustKeyAccessKeyConfigurationOutput() ZeroTrustKeyAccessKeyConfigurationOutput {
	return o
}

func (o ZeroTrustKeyAccessKeyConfigurationOutput) ToZeroTrustKeyAccessKeyConfigurationOutputWithContext(ctx context.Context) ZeroTrustKeyAccessKeyConfigurationOutput {
	return o
}

// The account identifier to target for the resource.
func (o ZeroTrustKeyAccessKeyConfigurationOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustKeyAccessKeyConfiguration) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Number of days to trigger a rotation of the keys.
func (o ZeroTrustKeyAccessKeyConfigurationOutput) KeyRotationIntervalDays() pulumi.IntOutput {
	return o.ApplyT(func(v *ZeroTrustKeyAccessKeyConfiguration) pulumi.IntOutput { return v.KeyRotationIntervalDays }).(pulumi.IntOutput)
}

type ZeroTrustKeyAccessKeyConfigurationArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustKeyAccessKeyConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustKeyAccessKeyConfiguration)(nil)).Elem()
}

func (o ZeroTrustKeyAccessKeyConfigurationArrayOutput) ToZeroTrustKeyAccessKeyConfigurationArrayOutput() ZeroTrustKeyAccessKeyConfigurationArrayOutput {
	return o
}

func (o ZeroTrustKeyAccessKeyConfigurationArrayOutput) ToZeroTrustKeyAccessKeyConfigurationArrayOutputWithContext(ctx context.Context) ZeroTrustKeyAccessKeyConfigurationArrayOutput {
	return o
}

func (o ZeroTrustKeyAccessKeyConfigurationArrayOutput) Index(i pulumi.IntInput) ZeroTrustKeyAccessKeyConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustKeyAccessKeyConfiguration {
		return vs[0].([]*ZeroTrustKeyAccessKeyConfiguration)[vs[1].(int)]
	}).(ZeroTrustKeyAccessKeyConfigurationOutput)
}

type ZeroTrustKeyAccessKeyConfigurationMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustKeyAccessKeyConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustKeyAccessKeyConfiguration)(nil)).Elem()
}

func (o ZeroTrustKeyAccessKeyConfigurationMapOutput) ToZeroTrustKeyAccessKeyConfigurationMapOutput() ZeroTrustKeyAccessKeyConfigurationMapOutput {
	return o
}

func (o ZeroTrustKeyAccessKeyConfigurationMapOutput) ToZeroTrustKeyAccessKeyConfigurationMapOutputWithContext(ctx context.Context) ZeroTrustKeyAccessKeyConfigurationMapOutput {
	return o
}

func (o ZeroTrustKeyAccessKeyConfigurationMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustKeyAccessKeyConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustKeyAccessKeyConfiguration {
		return vs[0].(map[string]*ZeroTrustKeyAccessKeyConfiguration)[vs[1].(string)]
	}).(ZeroTrustKeyAccessKeyConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustKeyAccessKeyConfigurationInput)(nil)).Elem(), &ZeroTrustKeyAccessKeyConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustKeyAccessKeyConfigurationArrayInput)(nil)).Elem(), ZeroTrustKeyAccessKeyConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustKeyAccessKeyConfigurationMapInput)(nil)).Elem(), ZeroTrustKeyAccessKeyConfigurationMap{})
	pulumi.RegisterOutputType(ZeroTrustKeyAccessKeyConfigurationOutput{})
	pulumi.RegisterOutputType(ZeroTrustKeyAccessKeyConfigurationArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustKeyAccessKeyConfigurationMapOutput{})
}