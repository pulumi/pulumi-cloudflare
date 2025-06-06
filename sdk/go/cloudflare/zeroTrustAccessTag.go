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
//			_, err := cloudflare.NewZeroTrustAccessTag(ctx, "example_zero_trust_access_tag", &cloudflare.ZeroTrustAccessTagArgs{
//				AccountId: pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				Name:      pulumi.String("engineers"),
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
// $ pulumi import cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag example '<account_id>/<tag_name>'
// ```
type ZeroTrustAccessTag struct {
	pulumi.CustomResourceState

	// Identifier.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The number of applications that have this tag
	AppCount  pulumi.IntOutput    `pulumi:"appCount"`
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The name of the tag
	Name      pulumi.StringOutput `pulumi:"name"`
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewZeroTrustAccessTag registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustAccessTag(ctx *pulumi.Context,
	name string, args *ZeroTrustAccessTagArgs, opts ...pulumi.ResourceOption) (*ZeroTrustAccessTag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("cloudflare:index/accessTag:AccessTag"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustAccessTag
	err := ctx.RegisterResource("cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustAccessTag gets an existing ZeroTrustAccessTag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustAccessTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustAccessTagState, opts ...pulumi.ResourceOption) (*ZeroTrustAccessTag, error) {
	var resource ZeroTrustAccessTag
	err := ctx.ReadResource("cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustAccessTag resources.
type zeroTrustAccessTagState struct {
	// Identifier.
	AccountId *string `pulumi:"accountId"`
	// The number of applications that have this tag
	AppCount  *int    `pulumi:"appCount"`
	CreatedAt *string `pulumi:"createdAt"`
	// The name of the tag
	Name      *string `pulumi:"name"`
	UpdatedAt *string `pulumi:"updatedAt"`
}

type ZeroTrustAccessTagState struct {
	// Identifier.
	AccountId pulumi.StringPtrInput
	// The number of applications that have this tag
	AppCount  pulumi.IntPtrInput
	CreatedAt pulumi.StringPtrInput
	// The name of the tag
	Name      pulumi.StringPtrInput
	UpdatedAt pulumi.StringPtrInput
}

func (ZeroTrustAccessTagState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessTagState)(nil)).Elem()
}

type zeroTrustAccessTagArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// The name of the tag
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a ZeroTrustAccessTag resource.
type ZeroTrustAccessTagArgs struct {
	// Identifier.
	AccountId pulumi.StringInput
	// The name of the tag
	Name pulumi.StringInput
}

func (ZeroTrustAccessTagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessTagArgs)(nil)).Elem()
}

type ZeroTrustAccessTagInput interface {
	pulumi.Input

	ToZeroTrustAccessTagOutput() ZeroTrustAccessTagOutput
	ToZeroTrustAccessTagOutputWithContext(ctx context.Context) ZeroTrustAccessTagOutput
}

func (*ZeroTrustAccessTag) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessTag)(nil)).Elem()
}

func (i *ZeroTrustAccessTag) ToZeroTrustAccessTagOutput() ZeroTrustAccessTagOutput {
	return i.ToZeroTrustAccessTagOutputWithContext(context.Background())
}

func (i *ZeroTrustAccessTag) ToZeroTrustAccessTagOutputWithContext(ctx context.Context) ZeroTrustAccessTagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessTagOutput)
}

// ZeroTrustAccessTagArrayInput is an input type that accepts ZeroTrustAccessTagArray and ZeroTrustAccessTagArrayOutput values.
// You can construct a concrete instance of `ZeroTrustAccessTagArrayInput` via:
//
//	ZeroTrustAccessTagArray{ ZeroTrustAccessTagArgs{...} }
type ZeroTrustAccessTagArrayInput interface {
	pulumi.Input

	ToZeroTrustAccessTagArrayOutput() ZeroTrustAccessTagArrayOutput
	ToZeroTrustAccessTagArrayOutputWithContext(context.Context) ZeroTrustAccessTagArrayOutput
}

type ZeroTrustAccessTagArray []ZeroTrustAccessTagInput

func (ZeroTrustAccessTagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessTag)(nil)).Elem()
}

func (i ZeroTrustAccessTagArray) ToZeroTrustAccessTagArrayOutput() ZeroTrustAccessTagArrayOutput {
	return i.ToZeroTrustAccessTagArrayOutputWithContext(context.Background())
}

func (i ZeroTrustAccessTagArray) ToZeroTrustAccessTagArrayOutputWithContext(ctx context.Context) ZeroTrustAccessTagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessTagArrayOutput)
}

// ZeroTrustAccessTagMapInput is an input type that accepts ZeroTrustAccessTagMap and ZeroTrustAccessTagMapOutput values.
// You can construct a concrete instance of `ZeroTrustAccessTagMapInput` via:
//
//	ZeroTrustAccessTagMap{ "key": ZeroTrustAccessTagArgs{...} }
type ZeroTrustAccessTagMapInput interface {
	pulumi.Input

	ToZeroTrustAccessTagMapOutput() ZeroTrustAccessTagMapOutput
	ToZeroTrustAccessTagMapOutputWithContext(context.Context) ZeroTrustAccessTagMapOutput
}

type ZeroTrustAccessTagMap map[string]ZeroTrustAccessTagInput

func (ZeroTrustAccessTagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessTag)(nil)).Elem()
}

func (i ZeroTrustAccessTagMap) ToZeroTrustAccessTagMapOutput() ZeroTrustAccessTagMapOutput {
	return i.ToZeroTrustAccessTagMapOutputWithContext(context.Background())
}

func (i ZeroTrustAccessTagMap) ToZeroTrustAccessTagMapOutputWithContext(ctx context.Context) ZeroTrustAccessTagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessTagMapOutput)
}

type ZeroTrustAccessTagOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessTagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessTag)(nil)).Elem()
}

func (o ZeroTrustAccessTagOutput) ToZeroTrustAccessTagOutput() ZeroTrustAccessTagOutput {
	return o
}

func (o ZeroTrustAccessTagOutput) ToZeroTrustAccessTagOutputWithContext(ctx context.Context) ZeroTrustAccessTagOutput {
	return o
}

// Identifier.
func (o ZeroTrustAccessTagOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessTag) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The number of applications that have this tag
func (o ZeroTrustAccessTagOutput) AppCount() pulumi.IntOutput {
	return o.ApplyT(func(v *ZeroTrustAccessTag) pulumi.IntOutput { return v.AppCount }).(pulumi.IntOutput)
}

func (o ZeroTrustAccessTagOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessTag) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The name of the tag
func (o ZeroTrustAccessTagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessTag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ZeroTrustAccessTagOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessTag) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type ZeroTrustAccessTagArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessTagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessTag)(nil)).Elem()
}

func (o ZeroTrustAccessTagArrayOutput) ToZeroTrustAccessTagArrayOutput() ZeroTrustAccessTagArrayOutput {
	return o
}

func (o ZeroTrustAccessTagArrayOutput) ToZeroTrustAccessTagArrayOutputWithContext(ctx context.Context) ZeroTrustAccessTagArrayOutput {
	return o
}

func (o ZeroTrustAccessTagArrayOutput) Index(i pulumi.IntInput) ZeroTrustAccessTagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustAccessTag {
		return vs[0].([]*ZeroTrustAccessTag)[vs[1].(int)]
	}).(ZeroTrustAccessTagOutput)
}

type ZeroTrustAccessTagMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessTagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessTag)(nil)).Elem()
}

func (o ZeroTrustAccessTagMapOutput) ToZeroTrustAccessTagMapOutput() ZeroTrustAccessTagMapOutput {
	return o
}

func (o ZeroTrustAccessTagMapOutput) ToZeroTrustAccessTagMapOutputWithContext(ctx context.Context) ZeroTrustAccessTagMapOutput {
	return o
}

func (o ZeroTrustAccessTagMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustAccessTagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustAccessTag {
		return vs[0].(map[string]*ZeroTrustAccessTag)[vs[1].(string)]
	}).(ZeroTrustAccessTagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessTagInput)(nil)).Elem(), &ZeroTrustAccessTag{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessTagArrayInput)(nil)).Elem(), ZeroTrustAccessTagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessTagMapInput)(nil)).Elem(), ZeroTrustAccessTagMap{})
	pulumi.RegisterOutputType(ZeroTrustAccessTagOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessTagArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessTagMapOutput{})
}
