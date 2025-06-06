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
//			_, err := cloudflare.NewCallsTurnApp(ctx, "example_calls_turn_app", &cloudflare.CallsTurnAppArgs{
//				AccountId: pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				Name:      pulumi.String("my-turn-key"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type CallsTurnApp struct {
	pulumi.CustomResourceState

	// The account identifier tag.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The date and time the item was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// Bearer token
	Key pulumi.StringOutput `pulumi:"key"`
	// A Cloudflare-generated unique identifier for a item.
	KeyId pulumi.StringPtrOutput `pulumi:"keyId"`
	// The date and time the item was last modified.
	Modified pulumi.StringOutput `pulumi:"modified"`
	// A short description of a TURN key, not shown to end users.
	Name pulumi.StringOutput `pulumi:"name"`
	// A Cloudflare-generated unique identifier for a item.
	Uid pulumi.StringOutput `pulumi:"uid"`
}

// NewCallsTurnApp registers a new resource with the given unique name, arguments, and options.
func NewCallsTurnApp(ctx *pulumi.Context,
	name string, args *CallsTurnAppArgs, opts ...pulumi.ResourceOption) (*CallsTurnApp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"key",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CallsTurnApp
	err := ctx.RegisterResource("cloudflare:index/callsTurnApp:CallsTurnApp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCallsTurnApp gets an existing CallsTurnApp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCallsTurnApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CallsTurnAppState, opts ...pulumi.ResourceOption) (*CallsTurnApp, error) {
	var resource CallsTurnApp
	err := ctx.ReadResource("cloudflare:index/callsTurnApp:CallsTurnApp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CallsTurnApp resources.
type callsTurnAppState struct {
	// The account identifier tag.
	AccountId *string `pulumi:"accountId"`
	// The date and time the item was created.
	Created *string `pulumi:"created"`
	// Bearer token
	Key *string `pulumi:"key"`
	// A Cloudflare-generated unique identifier for a item.
	KeyId *string `pulumi:"keyId"`
	// The date and time the item was last modified.
	Modified *string `pulumi:"modified"`
	// A short description of a TURN key, not shown to end users.
	Name *string `pulumi:"name"`
	// A Cloudflare-generated unique identifier for a item.
	Uid *string `pulumi:"uid"`
}

type CallsTurnAppState struct {
	// The account identifier tag.
	AccountId pulumi.StringPtrInput
	// The date and time the item was created.
	Created pulumi.StringPtrInput
	// Bearer token
	Key pulumi.StringPtrInput
	// A Cloudflare-generated unique identifier for a item.
	KeyId pulumi.StringPtrInput
	// The date and time the item was last modified.
	Modified pulumi.StringPtrInput
	// A short description of a TURN key, not shown to end users.
	Name pulumi.StringPtrInput
	// A Cloudflare-generated unique identifier for a item.
	Uid pulumi.StringPtrInput
}

func (CallsTurnAppState) ElementType() reflect.Type {
	return reflect.TypeOf((*callsTurnAppState)(nil)).Elem()
}

type callsTurnAppArgs struct {
	// The account identifier tag.
	AccountId string `pulumi:"accountId"`
	// A Cloudflare-generated unique identifier for a item.
	KeyId *string `pulumi:"keyId"`
	// A short description of a TURN key, not shown to end users.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a CallsTurnApp resource.
type CallsTurnAppArgs struct {
	// The account identifier tag.
	AccountId pulumi.StringInput
	// A Cloudflare-generated unique identifier for a item.
	KeyId pulumi.StringPtrInput
	// A short description of a TURN key, not shown to end users.
	Name pulumi.StringPtrInput
}

func (CallsTurnAppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*callsTurnAppArgs)(nil)).Elem()
}

type CallsTurnAppInput interface {
	pulumi.Input

	ToCallsTurnAppOutput() CallsTurnAppOutput
	ToCallsTurnAppOutputWithContext(ctx context.Context) CallsTurnAppOutput
}

func (*CallsTurnApp) ElementType() reflect.Type {
	return reflect.TypeOf((**CallsTurnApp)(nil)).Elem()
}

func (i *CallsTurnApp) ToCallsTurnAppOutput() CallsTurnAppOutput {
	return i.ToCallsTurnAppOutputWithContext(context.Background())
}

func (i *CallsTurnApp) ToCallsTurnAppOutputWithContext(ctx context.Context) CallsTurnAppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CallsTurnAppOutput)
}

// CallsTurnAppArrayInput is an input type that accepts CallsTurnAppArray and CallsTurnAppArrayOutput values.
// You can construct a concrete instance of `CallsTurnAppArrayInput` via:
//
//	CallsTurnAppArray{ CallsTurnAppArgs{...} }
type CallsTurnAppArrayInput interface {
	pulumi.Input

	ToCallsTurnAppArrayOutput() CallsTurnAppArrayOutput
	ToCallsTurnAppArrayOutputWithContext(context.Context) CallsTurnAppArrayOutput
}

type CallsTurnAppArray []CallsTurnAppInput

func (CallsTurnAppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CallsTurnApp)(nil)).Elem()
}

func (i CallsTurnAppArray) ToCallsTurnAppArrayOutput() CallsTurnAppArrayOutput {
	return i.ToCallsTurnAppArrayOutputWithContext(context.Background())
}

func (i CallsTurnAppArray) ToCallsTurnAppArrayOutputWithContext(ctx context.Context) CallsTurnAppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CallsTurnAppArrayOutput)
}

// CallsTurnAppMapInput is an input type that accepts CallsTurnAppMap and CallsTurnAppMapOutput values.
// You can construct a concrete instance of `CallsTurnAppMapInput` via:
//
//	CallsTurnAppMap{ "key": CallsTurnAppArgs{...} }
type CallsTurnAppMapInput interface {
	pulumi.Input

	ToCallsTurnAppMapOutput() CallsTurnAppMapOutput
	ToCallsTurnAppMapOutputWithContext(context.Context) CallsTurnAppMapOutput
}

type CallsTurnAppMap map[string]CallsTurnAppInput

func (CallsTurnAppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CallsTurnApp)(nil)).Elem()
}

func (i CallsTurnAppMap) ToCallsTurnAppMapOutput() CallsTurnAppMapOutput {
	return i.ToCallsTurnAppMapOutputWithContext(context.Background())
}

func (i CallsTurnAppMap) ToCallsTurnAppMapOutputWithContext(ctx context.Context) CallsTurnAppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CallsTurnAppMapOutput)
}

type CallsTurnAppOutput struct{ *pulumi.OutputState }

func (CallsTurnAppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CallsTurnApp)(nil)).Elem()
}

func (o CallsTurnAppOutput) ToCallsTurnAppOutput() CallsTurnAppOutput {
	return o
}

func (o CallsTurnAppOutput) ToCallsTurnAppOutputWithContext(ctx context.Context) CallsTurnAppOutput {
	return o
}

// The account identifier tag.
func (o CallsTurnAppOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *CallsTurnApp) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The date and time the item was created.
func (o CallsTurnAppOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *CallsTurnApp) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// Bearer token
func (o CallsTurnAppOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *CallsTurnApp) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// A Cloudflare-generated unique identifier for a item.
func (o CallsTurnAppOutput) KeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CallsTurnApp) pulumi.StringPtrOutput { return v.KeyId }).(pulumi.StringPtrOutput)
}

// The date and time the item was last modified.
func (o CallsTurnAppOutput) Modified() pulumi.StringOutput {
	return o.ApplyT(func(v *CallsTurnApp) pulumi.StringOutput { return v.Modified }).(pulumi.StringOutput)
}

// A short description of a TURN key, not shown to end users.
func (o CallsTurnAppOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CallsTurnApp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A Cloudflare-generated unique identifier for a item.
func (o CallsTurnAppOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *CallsTurnApp) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

type CallsTurnAppArrayOutput struct{ *pulumi.OutputState }

func (CallsTurnAppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CallsTurnApp)(nil)).Elem()
}

func (o CallsTurnAppArrayOutput) ToCallsTurnAppArrayOutput() CallsTurnAppArrayOutput {
	return o
}

func (o CallsTurnAppArrayOutput) ToCallsTurnAppArrayOutputWithContext(ctx context.Context) CallsTurnAppArrayOutput {
	return o
}

func (o CallsTurnAppArrayOutput) Index(i pulumi.IntInput) CallsTurnAppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CallsTurnApp {
		return vs[0].([]*CallsTurnApp)[vs[1].(int)]
	}).(CallsTurnAppOutput)
}

type CallsTurnAppMapOutput struct{ *pulumi.OutputState }

func (CallsTurnAppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CallsTurnApp)(nil)).Elem()
}

func (o CallsTurnAppMapOutput) ToCallsTurnAppMapOutput() CallsTurnAppMapOutput {
	return o
}

func (o CallsTurnAppMapOutput) ToCallsTurnAppMapOutputWithContext(ctx context.Context) CallsTurnAppMapOutput {
	return o
}

func (o CallsTurnAppMapOutput) MapIndex(k pulumi.StringInput) CallsTurnAppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CallsTurnApp {
		return vs[0].(map[string]*CallsTurnApp)[vs[1].(string)]
	}).(CallsTurnAppOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CallsTurnAppInput)(nil)).Elem(), &CallsTurnApp{})
	pulumi.RegisterInputType(reflect.TypeOf((*CallsTurnAppArrayInput)(nil)).Elem(), CallsTurnAppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CallsTurnAppMapInput)(nil)).Elem(), CallsTurnAppMap{})
	pulumi.RegisterOutputType(CallsTurnAppOutput{})
	pulumi.RegisterOutputType(CallsTurnAppArrayOutput{})
	pulumi.RegisterOutputType(CallsTurnAppMapOutput{})
}
