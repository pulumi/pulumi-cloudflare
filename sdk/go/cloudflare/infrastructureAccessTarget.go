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

// The [Infrastructure Access Target](https://developers.cloudflare.com/cloudflare-one/connections/connect-networks/use-cases/ssh/ssh-infrastructure-access/#4-add-a-target) resource allows you to configure Infrastructure Access Targets for an account.
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
//			_, err := cloudflare.NewInfrastructureAccessTarget(ctx, "example", &cloudflare.InfrastructureAccessTargetArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Hostname:  pulumi.String("example-target"),
//				Ip: &cloudflare.InfrastructureAccessTargetIpArgs{
//					Ipv4: &cloudflare.InfrastructureAccessTargetIpIpv4Args{
//						IpAddr:           pulumi.String("198.51.100.1"),
//						VirtualNetworkId: pulumi.String("238dccd1-149b-463d-8228-560ab83a54fd"),
//					},
//					Ipv6: &cloudflare.InfrastructureAccessTargetIpIpv6Args{
//						IpAddr:           pulumi.String("2001:db8::"),
//						VirtualNetworkId: pulumi.String("238dccd1-149b-463d-8228-560ab83a54fd"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewInfrastructureAccessTarget(ctx, "ipv4_only_example", &cloudflare.InfrastructureAccessTargetArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Hostname:  pulumi.String("example-ipv4-only"),
//				Ip: &cloudflare.InfrastructureAccessTargetIpArgs{
//					Ipv4: &cloudflare.InfrastructureAccessTargetIpIpv4Args{
//						IpAddr:           pulumi.String("198.51.100.1"),
//						VirtualNetworkId: pulumi.String("238dccd1-149b-463d-8228-560ab83a54fd"),
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
// $ pulumi import cloudflare:index/infrastructureAccessTarget:InfrastructureAccessTarget example <account_id>
// ```
type InfrastructureAccessTarget struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The date and time at which the target was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// A non-unique field that refers to a target.
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// The IPv4/IPv6 address that identifies where to reach a target.
	Ip InfrastructureAccessTargetIpOutput `pulumi:"ip"`
	// The date and time at which the target was last modified.
	ModifiedAt pulumi.StringOutput `pulumi:"modifiedAt"`
}

// NewInfrastructureAccessTarget registers a new resource with the given unique name, arguments, and options.
func NewInfrastructureAccessTarget(ctx *pulumi.Context,
	name string, args *InfrastructureAccessTargetArgs, opts ...pulumi.ResourceOption) (*InfrastructureAccessTarget, error) {
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
	var resource InfrastructureAccessTarget
	err := ctx.RegisterResource("cloudflare:index/infrastructureAccessTarget:InfrastructureAccessTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInfrastructureAccessTarget gets an existing InfrastructureAccessTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInfrastructureAccessTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InfrastructureAccessTargetState, opts ...pulumi.ResourceOption) (*InfrastructureAccessTarget, error) {
	var resource InfrastructureAccessTarget
	err := ctx.ReadResource("cloudflare:index/infrastructureAccessTarget:InfrastructureAccessTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InfrastructureAccessTarget resources.
type infrastructureAccessTargetState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The date and time at which the target was created.
	CreatedAt *string `pulumi:"createdAt"`
	// A non-unique field that refers to a target.
	Hostname *string `pulumi:"hostname"`
	// The IPv4/IPv6 address that identifies where to reach a target.
	Ip *InfrastructureAccessTargetIp `pulumi:"ip"`
	// The date and time at which the target was last modified.
	ModifiedAt *string `pulumi:"modifiedAt"`
}

type InfrastructureAccessTargetState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The date and time at which the target was created.
	CreatedAt pulumi.StringPtrInput
	// A non-unique field that refers to a target.
	Hostname pulumi.StringPtrInput
	// The IPv4/IPv6 address that identifies where to reach a target.
	Ip InfrastructureAccessTargetIpPtrInput
	// The date and time at which the target was last modified.
	ModifiedAt pulumi.StringPtrInput
}

func (InfrastructureAccessTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*infrastructureAccessTargetState)(nil)).Elem()
}

type infrastructureAccessTargetArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// A non-unique field that refers to a target.
	Hostname string `pulumi:"hostname"`
	// The IPv4/IPv6 address that identifies where to reach a target.
	Ip InfrastructureAccessTargetIp `pulumi:"ip"`
}

// The set of arguments for constructing a InfrastructureAccessTarget resource.
type InfrastructureAccessTargetArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// A non-unique field that refers to a target.
	Hostname pulumi.StringInput
	// The IPv4/IPv6 address that identifies where to reach a target.
	Ip InfrastructureAccessTargetIpInput
}

func (InfrastructureAccessTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*infrastructureAccessTargetArgs)(nil)).Elem()
}

type InfrastructureAccessTargetInput interface {
	pulumi.Input

	ToInfrastructureAccessTargetOutput() InfrastructureAccessTargetOutput
	ToInfrastructureAccessTargetOutputWithContext(ctx context.Context) InfrastructureAccessTargetOutput
}

func (*InfrastructureAccessTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**InfrastructureAccessTarget)(nil)).Elem()
}

func (i *InfrastructureAccessTarget) ToInfrastructureAccessTargetOutput() InfrastructureAccessTargetOutput {
	return i.ToInfrastructureAccessTargetOutputWithContext(context.Background())
}

func (i *InfrastructureAccessTarget) ToInfrastructureAccessTargetOutputWithContext(ctx context.Context) InfrastructureAccessTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfrastructureAccessTargetOutput)
}

// InfrastructureAccessTargetArrayInput is an input type that accepts InfrastructureAccessTargetArray and InfrastructureAccessTargetArrayOutput values.
// You can construct a concrete instance of `InfrastructureAccessTargetArrayInput` via:
//
//	InfrastructureAccessTargetArray{ InfrastructureAccessTargetArgs{...} }
type InfrastructureAccessTargetArrayInput interface {
	pulumi.Input

	ToInfrastructureAccessTargetArrayOutput() InfrastructureAccessTargetArrayOutput
	ToInfrastructureAccessTargetArrayOutputWithContext(context.Context) InfrastructureAccessTargetArrayOutput
}

type InfrastructureAccessTargetArray []InfrastructureAccessTargetInput

func (InfrastructureAccessTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InfrastructureAccessTarget)(nil)).Elem()
}

func (i InfrastructureAccessTargetArray) ToInfrastructureAccessTargetArrayOutput() InfrastructureAccessTargetArrayOutput {
	return i.ToInfrastructureAccessTargetArrayOutputWithContext(context.Background())
}

func (i InfrastructureAccessTargetArray) ToInfrastructureAccessTargetArrayOutputWithContext(ctx context.Context) InfrastructureAccessTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfrastructureAccessTargetArrayOutput)
}

// InfrastructureAccessTargetMapInput is an input type that accepts InfrastructureAccessTargetMap and InfrastructureAccessTargetMapOutput values.
// You can construct a concrete instance of `InfrastructureAccessTargetMapInput` via:
//
//	InfrastructureAccessTargetMap{ "key": InfrastructureAccessTargetArgs{...} }
type InfrastructureAccessTargetMapInput interface {
	pulumi.Input

	ToInfrastructureAccessTargetMapOutput() InfrastructureAccessTargetMapOutput
	ToInfrastructureAccessTargetMapOutputWithContext(context.Context) InfrastructureAccessTargetMapOutput
}

type InfrastructureAccessTargetMap map[string]InfrastructureAccessTargetInput

func (InfrastructureAccessTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InfrastructureAccessTarget)(nil)).Elem()
}

func (i InfrastructureAccessTargetMap) ToInfrastructureAccessTargetMapOutput() InfrastructureAccessTargetMapOutput {
	return i.ToInfrastructureAccessTargetMapOutputWithContext(context.Background())
}

func (i InfrastructureAccessTargetMap) ToInfrastructureAccessTargetMapOutputWithContext(ctx context.Context) InfrastructureAccessTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfrastructureAccessTargetMapOutput)
}

type InfrastructureAccessTargetOutput struct{ *pulumi.OutputState }

func (InfrastructureAccessTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InfrastructureAccessTarget)(nil)).Elem()
}

func (o InfrastructureAccessTargetOutput) ToInfrastructureAccessTargetOutput() InfrastructureAccessTargetOutput {
	return o
}

func (o InfrastructureAccessTargetOutput) ToInfrastructureAccessTargetOutputWithContext(ctx context.Context) InfrastructureAccessTargetOutput {
	return o
}

// The account identifier to target for the resource.
func (o InfrastructureAccessTargetOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *InfrastructureAccessTarget) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The date and time at which the target was created.
func (o InfrastructureAccessTargetOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *InfrastructureAccessTarget) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// A non-unique field that refers to a target.
func (o InfrastructureAccessTargetOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *InfrastructureAccessTarget) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// The IPv4/IPv6 address that identifies where to reach a target.
func (o InfrastructureAccessTargetOutput) Ip() InfrastructureAccessTargetIpOutput {
	return o.ApplyT(func(v *InfrastructureAccessTarget) InfrastructureAccessTargetIpOutput { return v.Ip }).(InfrastructureAccessTargetIpOutput)
}

// The date and time at which the target was last modified.
func (o InfrastructureAccessTargetOutput) ModifiedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *InfrastructureAccessTarget) pulumi.StringOutput { return v.ModifiedAt }).(pulumi.StringOutput)
}

type InfrastructureAccessTargetArrayOutput struct{ *pulumi.OutputState }

func (InfrastructureAccessTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InfrastructureAccessTarget)(nil)).Elem()
}

func (o InfrastructureAccessTargetArrayOutput) ToInfrastructureAccessTargetArrayOutput() InfrastructureAccessTargetArrayOutput {
	return o
}

func (o InfrastructureAccessTargetArrayOutput) ToInfrastructureAccessTargetArrayOutputWithContext(ctx context.Context) InfrastructureAccessTargetArrayOutput {
	return o
}

func (o InfrastructureAccessTargetArrayOutput) Index(i pulumi.IntInput) InfrastructureAccessTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InfrastructureAccessTarget {
		return vs[0].([]*InfrastructureAccessTarget)[vs[1].(int)]
	}).(InfrastructureAccessTargetOutput)
}

type InfrastructureAccessTargetMapOutput struct{ *pulumi.OutputState }

func (InfrastructureAccessTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InfrastructureAccessTarget)(nil)).Elem()
}

func (o InfrastructureAccessTargetMapOutput) ToInfrastructureAccessTargetMapOutput() InfrastructureAccessTargetMapOutput {
	return o
}

func (o InfrastructureAccessTargetMapOutput) ToInfrastructureAccessTargetMapOutputWithContext(ctx context.Context) InfrastructureAccessTargetMapOutput {
	return o
}

func (o InfrastructureAccessTargetMapOutput) MapIndex(k pulumi.StringInput) InfrastructureAccessTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InfrastructureAccessTarget {
		return vs[0].(map[string]*InfrastructureAccessTarget)[vs[1].(string)]
	}).(InfrastructureAccessTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InfrastructureAccessTargetInput)(nil)).Elem(), &InfrastructureAccessTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*InfrastructureAccessTargetArrayInput)(nil)).Elem(), InfrastructureAccessTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InfrastructureAccessTargetMapInput)(nil)).Elem(), InfrastructureAccessTargetMap{})
	pulumi.RegisterOutputType(InfrastructureAccessTargetOutput{})
	pulumi.RegisterOutputType(InfrastructureAccessTargetArrayOutput{})
	pulumi.RegisterOutputType(InfrastructureAccessTargetMapOutput{})
}
