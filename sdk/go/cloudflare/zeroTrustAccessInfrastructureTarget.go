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
//			_, err := cloudflare.NewZeroTrustAccessInfrastructureTarget(ctx, "example_zero_trust_access_infrastructure_target", &cloudflare.ZeroTrustAccessInfrastructureTargetArgs{
//				AccountId: pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				Hostname:  pulumi.String("infra-access-target"),
//				Ip: &cloudflare.ZeroTrustAccessInfrastructureTargetIpArgs{
//					Ipv4: &cloudflare.ZeroTrustAccessInfrastructureTargetIpIpv4Args{
//						IpAddr:           pulumi.String("187.26.29.249"),
//						VirtualNetworkId: pulumi.String("c77b744e-acc8-428f-9257-6878c046ed55"),
//					},
//					Ipv6: &cloudflare.ZeroTrustAccessInfrastructureTargetIpIpv6Args{
//						IpAddr:           pulumi.String("64c0:64e8:f0b4:8dbf:7104:72b0:ec8f:f5e0"),
//						VirtualNetworkId: pulumi.String("c77b744e-acc8-428f-9257-6878c046ed55"),
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
// $ pulumi import cloudflare:index/zeroTrustAccessInfrastructureTarget:ZeroTrustAccessInfrastructureTarget example '<account_id>/<target_id>'
// ```
type ZeroTrustAccessInfrastructureTarget struct {
	pulumi.CustomResourceState

	// Account identifier
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Date and time at which the target was created
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// A non-unique field that refers to a target. Case insensitive, maximum
	// length of 255 characters, supports the use of special characters dash
	// and period, does not support spaces, and must start and end with an
	// alphanumeric character.
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// The IPv4/IPv6 address that identifies where to reach a target
	Ip ZeroTrustAccessInfrastructureTargetIpOutput `pulumi:"ip"`
	// Date and time at which the target was modified
	ModifiedAt pulumi.StringOutput `pulumi:"modifiedAt"`
}

// NewZeroTrustAccessInfrastructureTarget registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustAccessInfrastructureTarget(ctx *pulumi.Context,
	name string, args *ZeroTrustAccessInfrastructureTargetArgs, opts ...pulumi.ResourceOption) (*ZeroTrustAccessInfrastructureTarget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Hostname == nil {
		return nil, errors.New("invalid value for required argument 'Hostname'")
	}
	if args.Ip == nil {
		return nil, errors.New("invalid value for required argument 'Ip'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustAccessInfrastructureTarget
	err := ctx.RegisterResource("cloudflare:index/zeroTrustAccessInfrastructureTarget:ZeroTrustAccessInfrastructureTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustAccessInfrastructureTarget gets an existing ZeroTrustAccessInfrastructureTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustAccessInfrastructureTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustAccessInfrastructureTargetState, opts ...pulumi.ResourceOption) (*ZeroTrustAccessInfrastructureTarget, error) {
	var resource ZeroTrustAccessInfrastructureTarget
	err := ctx.ReadResource("cloudflare:index/zeroTrustAccessInfrastructureTarget:ZeroTrustAccessInfrastructureTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustAccessInfrastructureTarget resources.
type zeroTrustAccessInfrastructureTargetState struct {
	// Account identifier
	AccountId *string `pulumi:"accountId"`
	// Date and time at which the target was created
	CreatedAt *string `pulumi:"createdAt"`
	// A non-unique field that refers to a target. Case insensitive, maximum
	// length of 255 characters, supports the use of special characters dash
	// and period, does not support spaces, and must start and end with an
	// alphanumeric character.
	Hostname *string `pulumi:"hostname"`
	// The IPv4/IPv6 address that identifies where to reach a target
	Ip *ZeroTrustAccessInfrastructureTargetIp `pulumi:"ip"`
	// Date and time at which the target was modified
	ModifiedAt *string `pulumi:"modifiedAt"`
}

type ZeroTrustAccessInfrastructureTargetState struct {
	// Account identifier
	AccountId pulumi.StringPtrInput
	// Date and time at which the target was created
	CreatedAt pulumi.StringPtrInput
	// A non-unique field that refers to a target. Case insensitive, maximum
	// length of 255 characters, supports the use of special characters dash
	// and period, does not support spaces, and must start and end with an
	// alphanumeric character.
	Hostname pulumi.StringPtrInput
	// The IPv4/IPv6 address that identifies where to reach a target
	Ip ZeroTrustAccessInfrastructureTargetIpPtrInput
	// Date and time at which the target was modified
	ModifiedAt pulumi.StringPtrInput
}

func (ZeroTrustAccessInfrastructureTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessInfrastructureTargetState)(nil)).Elem()
}

type zeroTrustAccessInfrastructureTargetArgs struct {
	// Account identifier
	AccountId string `pulumi:"accountId"`
	// A non-unique field that refers to a target. Case insensitive, maximum
	// length of 255 characters, supports the use of special characters dash
	// and period, does not support spaces, and must start and end with an
	// alphanumeric character.
	Hostname string `pulumi:"hostname"`
	// The IPv4/IPv6 address that identifies where to reach a target
	Ip ZeroTrustAccessInfrastructureTargetIp `pulumi:"ip"`
}

// The set of arguments for constructing a ZeroTrustAccessInfrastructureTarget resource.
type ZeroTrustAccessInfrastructureTargetArgs struct {
	// Account identifier
	AccountId pulumi.StringInput
	// A non-unique field that refers to a target. Case insensitive, maximum
	// length of 255 characters, supports the use of special characters dash
	// and period, does not support spaces, and must start and end with an
	// alphanumeric character.
	Hostname pulumi.StringInput
	// The IPv4/IPv6 address that identifies where to reach a target
	Ip ZeroTrustAccessInfrastructureTargetIpInput
}

func (ZeroTrustAccessInfrastructureTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessInfrastructureTargetArgs)(nil)).Elem()
}

type ZeroTrustAccessInfrastructureTargetInput interface {
	pulumi.Input

	ToZeroTrustAccessInfrastructureTargetOutput() ZeroTrustAccessInfrastructureTargetOutput
	ToZeroTrustAccessInfrastructureTargetOutputWithContext(ctx context.Context) ZeroTrustAccessInfrastructureTargetOutput
}

func (*ZeroTrustAccessInfrastructureTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessInfrastructureTarget)(nil)).Elem()
}

func (i *ZeroTrustAccessInfrastructureTarget) ToZeroTrustAccessInfrastructureTargetOutput() ZeroTrustAccessInfrastructureTargetOutput {
	return i.ToZeroTrustAccessInfrastructureTargetOutputWithContext(context.Background())
}

func (i *ZeroTrustAccessInfrastructureTarget) ToZeroTrustAccessInfrastructureTargetOutputWithContext(ctx context.Context) ZeroTrustAccessInfrastructureTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessInfrastructureTargetOutput)
}

// ZeroTrustAccessInfrastructureTargetArrayInput is an input type that accepts ZeroTrustAccessInfrastructureTargetArray and ZeroTrustAccessInfrastructureTargetArrayOutput values.
// You can construct a concrete instance of `ZeroTrustAccessInfrastructureTargetArrayInput` via:
//
//	ZeroTrustAccessInfrastructureTargetArray{ ZeroTrustAccessInfrastructureTargetArgs{...} }
type ZeroTrustAccessInfrastructureTargetArrayInput interface {
	pulumi.Input

	ToZeroTrustAccessInfrastructureTargetArrayOutput() ZeroTrustAccessInfrastructureTargetArrayOutput
	ToZeroTrustAccessInfrastructureTargetArrayOutputWithContext(context.Context) ZeroTrustAccessInfrastructureTargetArrayOutput
}

type ZeroTrustAccessInfrastructureTargetArray []ZeroTrustAccessInfrastructureTargetInput

func (ZeroTrustAccessInfrastructureTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessInfrastructureTarget)(nil)).Elem()
}

func (i ZeroTrustAccessInfrastructureTargetArray) ToZeroTrustAccessInfrastructureTargetArrayOutput() ZeroTrustAccessInfrastructureTargetArrayOutput {
	return i.ToZeroTrustAccessInfrastructureTargetArrayOutputWithContext(context.Background())
}

func (i ZeroTrustAccessInfrastructureTargetArray) ToZeroTrustAccessInfrastructureTargetArrayOutputWithContext(ctx context.Context) ZeroTrustAccessInfrastructureTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessInfrastructureTargetArrayOutput)
}

// ZeroTrustAccessInfrastructureTargetMapInput is an input type that accepts ZeroTrustAccessInfrastructureTargetMap and ZeroTrustAccessInfrastructureTargetMapOutput values.
// You can construct a concrete instance of `ZeroTrustAccessInfrastructureTargetMapInput` via:
//
//	ZeroTrustAccessInfrastructureTargetMap{ "key": ZeroTrustAccessInfrastructureTargetArgs{...} }
type ZeroTrustAccessInfrastructureTargetMapInput interface {
	pulumi.Input

	ToZeroTrustAccessInfrastructureTargetMapOutput() ZeroTrustAccessInfrastructureTargetMapOutput
	ToZeroTrustAccessInfrastructureTargetMapOutputWithContext(context.Context) ZeroTrustAccessInfrastructureTargetMapOutput
}

type ZeroTrustAccessInfrastructureTargetMap map[string]ZeroTrustAccessInfrastructureTargetInput

func (ZeroTrustAccessInfrastructureTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessInfrastructureTarget)(nil)).Elem()
}

func (i ZeroTrustAccessInfrastructureTargetMap) ToZeroTrustAccessInfrastructureTargetMapOutput() ZeroTrustAccessInfrastructureTargetMapOutput {
	return i.ToZeroTrustAccessInfrastructureTargetMapOutputWithContext(context.Background())
}

func (i ZeroTrustAccessInfrastructureTargetMap) ToZeroTrustAccessInfrastructureTargetMapOutputWithContext(ctx context.Context) ZeroTrustAccessInfrastructureTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessInfrastructureTargetMapOutput)
}

type ZeroTrustAccessInfrastructureTargetOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessInfrastructureTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessInfrastructureTarget)(nil)).Elem()
}

func (o ZeroTrustAccessInfrastructureTargetOutput) ToZeroTrustAccessInfrastructureTargetOutput() ZeroTrustAccessInfrastructureTargetOutput {
	return o
}

func (o ZeroTrustAccessInfrastructureTargetOutput) ToZeroTrustAccessInfrastructureTargetOutputWithContext(ctx context.Context) ZeroTrustAccessInfrastructureTargetOutput {
	return o
}

// Account identifier
func (o ZeroTrustAccessInfrastructureTargetOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessInfrastructureTarget) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Date and time at which the target was created
func (o ZeroTrustAccessInfrastructureTargetOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessInfrastructureTarget) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// A non-unique field that refers to a target. Case insensitive, maximum
// length of 255 characters, supports the use of special characters dash
// and period, does not support spaces, and must start and end with an
// alphanumeric character.
func (o ZeroTrustAccessInfrastructureTargetOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessInfrastructureTarget) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// The IPv4/IPv6 address that identifies where to reach a target
func (o ZeroTrustAccessInfrastructureTargetOutput) Ip() ZeroTrustAccessInfrastructureTargetIpOutput {
	return o.ApplyT(func(v *ZeroTrustAccessInfrastructureTarget) ZeroTrustAccessInfrastructureTargetIpOutput { return v.Ip }).(ZeroTrustAccessInfrastructureTargetIpOutput)
}

// Date and time at which the target was modified
func (o ZeroTrustAccessInfrastructureTargetOutput) ModifiedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessInfrastructureTarget) pulumi.StringOutput { return v.ModifiedAt }).(pulumi.StringOutput)
}

type ZeroTrustAccessInfrastructureTargetArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessInfrastructureTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessInfrastructureTarget)(nil)).Elem()
}

func (o ZeroTrustAccessInfrastructureTargetArrayOutput) ToZeroTrustAccessInfrastructureTargetArrayOutput() ZeroTrustAccessInfrastructureTargetArrayOutput {
	return o
}

func (o ZeroTrustAccessInfrastructureTargetArrayOutput) ToZeroTrustAccessInfrastructureTargetArrayOutputWithContext(ctx context.Context) ZeroTrustAccessInfrastructureTargetArrayOutput {
	return o
}

func (o ZeroTrustAccessInfrastructureTargetArrayOutput) Index(i pulumi.IntInput) ZeroTrustAccessInfrastructureTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustAccessInfrastructureTarget {
		return vs[0].([]*ZeroTrustAccessInfrastructureTarget)[vs[1].(int)]
	}).(ZeroTrustAccessInfrastructureTargetOutput)
}

type ZeroTrustAccessInfrastructureTargetMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessInfrastructureTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessInfrastructureTarget)(nil)).Elem()
}

func (o ZeroTrustAccessInfrastructureTargetMapOutput) ToZeroTrustAccessInfrastructureTargetMapOutput() ZeroTrustAccessInfrastructureTargetMapOutput {
	return o
}

func (o ZeroTrustAccessInfrastructureTargetMapOutput) ToZeroTrustAccessInfrastructureTargetMapOutputWithContext(ctx context.Context) ZeroTrustAccessInfrastructureTargetMapOutput {
	return o
}

func (o ZeroTrustAccessInfrastructureTargetMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustAccessInfrastructureTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustAccessInfrastructureTarget {
		return vs[0].(map[string]*ZeroTrustAccessInfrastructureTarget)[vs[1].(string)]
	}).(ZeroTrustAccessInfrastructureTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessInfrastructureTargetInput)(nil)).Elem(), &ZeroTrustAccessInfrastructureTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessInfrastructureTargetArrayInput)(nil)).Elem(), ZeroTrustAccessInfrastructureTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessInfrastructureTargetMapInput)(nil)).Elem(), ZeroTrustAccessInfrastructureTargetMap{})
	pulumi.RegisterOutputType(ZeroTrustAccessInfrastructureTargetOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessInfrastructureTargetArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessInfrastructureTargetMapOutput{})
}
