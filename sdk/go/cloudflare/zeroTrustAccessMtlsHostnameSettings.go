// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Access Mutual TLS Certificate Settings resource.
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
//			_, err := cloudflare.NewZeroTrustAccessMtlsHostnameSettings(ctx, "example", &cloudflare.ZeroTrustAccessMtlsHostnameSettingsArgs{
//				ZoneId: pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Settings: cloudflare.ZeroTrustAccessMtlsHostnameSettingsSettingArray{
//					&cloudflare.ZeroTrustAccessMtlsHostnameSettingsSettingArgs{
//						Hostname:                    pulumi.String("example.com"),
//						ClientCertificateForwarding: pulumi.Bool(true),
//						ChinaNetwork:                pulumi.Bool(false),
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
// Account level mTLS hostname settings import.
//
// ```sh
// $ pulumi import cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings example account/<account_id>
// ```
//
// Zone level mTLS hostname settings import.
//
// ```sh
// $ pulumi import cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings example zone/<zone_id>
// ```
type ZeroTrustAccessMtlsHostnameSettings struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrOutput                                `pulumi:"accountId"`
	Settings  ZeroTrustAccessMtlsHostnameSettingsSettingArrayOutput `pulumi:"settings"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewZeroTrustAccessMtlsHostnameSettings registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustAccessMtlsHostnameSettings(ctx *pulumi.Context,
	name string, args *ZeroTrustAccessMtlsHostnameSettingsArgs, opts ...pulumi.ResourceOption) (*ZeroTrustAccessMtlsHostnameSettings, error) {
	if args == nil {
		args = &ZeroTrustAccessMtlsHostnameSettingsArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustAccessMtlsHostnameSettings
	err := ctx.RegisterResource("cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustAccessMtlsHostnameSettings gets an existing ZeroTrustAccessMtlsHostnameSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustAccessMtlsHostnameSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustAccessMtlsHostnameSettingsState, opts ...pulumi.ResourceOption) (*ZeroTrustAccessMtlsHostnameSettings, error) {
	var resource ZeroTrustAccessMtlsHostnameSettings
	err := ctx.ReadResource("cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustAccessMtlsHostnameSettings resources.
type zeroTrustAccessMtlsHostnameSettingsState struct {
	// The account identifier to target for the resource.
	AccountId *string                                      `pulumi:"accountId"`
	Settings  []ZeroTrustAccessMtlsHostnameSettingsSetting `pulumi:"settings"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type ZeroTrustAccessMtlsHostnameSettingsState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	Settings  ZeroTrustAccessMtlsHostnameSettingsSettingArrayInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustAccessMtlsHostnameSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessMtlsHostnameSettingsState)(nil)).Elem()
}

type zeroTrustAccessMtlsHostnameSettingsArgs struct {
	// The account identifier to target for the resource.
	AccountId *string                                      `pulumi:"accountId"`
	Settings  []ZeroTrustAccessMtlsHostnameSettingsSetting `pulumi:"settings"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ZeroTrustAccessMtlsHostnameSettings resource.
type ZeroTrustAccessMtlsHostnameSettingsArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	Settings  ZeroTrustAccessMtlsHostnameSettingsSettingArrayInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustAccessMtlsHostnameSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessMtlsHostnameSettingsArgs)(nil)).Elem()
}

type ZeroTrustAccessMtlsHostnameSettingsInput interface {
	pulumi.Input

	ToZeroTrustAccessMtlsHostnameSettingsOutput() ZeroTrustAccessMtlsHostnameSettingsOutput
	ToZeroTrustAccessMtlsHostnameSettingsOutputWithContext(ctx context.Context) ZeroTrustAccessMtlsHostnameSettingsOutput
}

func (*ZeroTrustAccessMtlsHostnameSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessMtlsHostnameSettings)(nil)).Elem()
}

func (i *ZeroTrustAccessMtlsHostnameSettings) ToZeroTrustAccessMtlsHostnameSettingsOutput() ZeroTrustAccessMtlsHostnameSettingsOutput {
	return i.ToZeroTrustAccessMtlsHostnameSettingsOutputWithContext(context.Background())
}

func (i *ZeroTrustAccessMtlsHostnameSettings) ToZeroTrustAccessMtlsHostnameSettingsOutputWithContext(ctx context.Context) ZeroTrustAccessMtlsHostnameSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessMtlsHostnameSettingsOutput)
}

// ZeroTrustAccessMtlsHostnameSettingsArrayInput is an input type that accepts ZeroTrustAccessMtlsHostnameSettingsArray and ZeroTrustAccessMtlsHostnameSettingsArrayOutput values.
// You can construct a concrete instance of `ZeroTrustAccessMtlsHostnameSettingsArrayInput` via:
//
//	ZeroTrustAccessMtlsHostnameSettingsArray{ ZeroTrustAccessMtlsHostnameSettingsArgs{...} }
type ZeroTrustAccessMtlsHostnameSettingsArrayInput interface {
	pulumi.Input

	ToZeroTrustAccessMtlsHostnameSettingsArrayOutput() ZeroTrustAccessMtlsHostnameSettingsArrayOutput
	ToZeroTrustAccessMtlsHostnameSettingsArrayOutputWithContext(context.Context) ZeroTrustAccessMtlsHostnameSettingsArrayOutput
}

type ZeroTrustAccessMtlsHostnameSettingsArray []ZeroTrustAccessMtlsHostnameSettingsInput

func (ZeroTrustAccessMtlsHostnameSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessMtlsHostnameSettings)(nil)).Elem()
}

func (i ZeroTrustAccessMtlsHostnameSettingsArray) ToZeroTrustAccessMtlsHostnameSettingsArrayOutput() ZeroTrustAccessMtlsHostnameSettingsArrayOutput {
	return i.ToZeroTrustAccessMtlsHostnameSettingsArrayOutputWithContext(context.Background())
}

func (i ZeroTrustAccessMtlsHostnameSettingsArray) ToZeroTrustAccessMtlsHostnameSettingsArrayOutputWithContext(ctx context.Context) ZeroTrustAccessMtlsHostnameSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessMtlsHostnameSettingsArrayOutput)
}

// ZeroTrustAccessMtlsHostnameSettingsMapInput is an input type that accepts ZeroTrustAccessMtlsHostnameSettingsMap and ZeroTrustAccessMtlsHostnameSettingsMapOutput values.
// You can construct a concrete instance of `ZeroTrustAccessMtlsHostnameSettingsMapInput` via:
//
//	ZeroTrustAccessMtlsHostnameSettingsMap{ "key": ZeroTrustAccessMtlsHostnameSettingsArgs{...} }
type ZeroTrustAccessMtlsHostnameSettingsMapInput interface {
	pulumi.Input

	ToZeroTrustAccessMtlsHostnameSettingsMapOutput() ZeroTrustAccessMtlsHostnameSettingsMapOutput
	ToZeroTrustAccessMtlsHostnameSettingsMapOutputWithContext(context.Context) ZeroTrustAccessMtlsHostnameSettingsMapOutput
}

type ZeroTrustAccessMtlsHostnameSettingsMap map[string]ZeroTrustAccessMtlsHostnameSettingsInput

func (ZeroTrustAccessMtlsHostnameSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessMtlsHostnameSettings)(nil)).Elem()
}

func (i ZeroTrustAccessMtlsHostnameSettingsMap) ToZeroTrustAccessMtlsHostnameSettingsMapOutput() ZeroTrustAccessMtlsHostnameSettingsMapOutput {
	return i.ToZeroTrustAccessMtlsHostnameSettingsMapOutputWithContext(context.Background())
}

func (i ZeroTrustAccessMtlsHostnameSettingsMap) ToZeroTrustAccessMtlsHostnameSettingsMapOutputWithContext(ctx context.Context) ZeroTrustAccessMtlsHostnameSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessMtlsHostnameSettingsMapOutput)
}

type ZeroTrustAccessMtlsHostnameSettingsOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessMtlsHostnameSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessMtlsHostnameSettings)(nil)).Elem()
}

func (o ZeroTrustAccessMtlsHostnameSettingsOutput) ToZeroTrustAccessMtlsHostnameSettingsOutput() ZeroTrustAccessMtlsHostnameSettingsOutput {
	return o
}

func (o ZeroTrustAccessMtlsHostnameSettingsOutput) ToZeroTrustAccessMtlsHostnameSettingsOutputWithContext(ctx context.Context) ZeroTrustAccessMtlsHostnameSettingsOutput {
	return o
}

// The account identifier to target for the resource.
func (o ZeroTrustAccessMtlsHostnameSettingsOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessMtlsHostnameSettings) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

func (o ZeroTrustAccessMtlsHostnameSettingsOutput) Settings() ZeroTrustAccessMtlsHostnameSettingsSettingArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessMtlsHostnameSettings) ZeroTrustAccessMtlsHostnameSettingsSettingArrayOutput {
		return v.Settings
	}).(ZeroTrustAccessMtlsHostnameSettingsSettingArrayOutput)
}

// The zone identifier to target for the resource.
func (o ZeroTrustAccessMtlsHostnameSettingsOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessMtlsHostnameSettings) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type ZeroTrustAccessMtlsHostnameSettingsArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessMtlsHostnameSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessMtlsHostnameSettings)(nil)).Elem()
}

func (o ZeroTrustAccessMtlsHostnameSettingsArrayOutput) ToZeroTrustAccessMtlsHostnameSettingsArrayOutput() ZeroTrustAccessMtlsHostnameSettingsArrayOutput {
	return o
}

func (o ZeroTrustAccessMtlsHostnameSettingsArrayOutput) ToZeroTrustAccessMtlsHostnameSettingsArrayOutputWithContext(ctx context.Context) ZeroTrustAccessMtlsHostnameSettingsArrayOutput {
	return o
}

func (o ZeroTrustAccessMtlsHostnameSettingsArrayOutput) Index(i pulumi.IntInput) ZeroTrustAccessMtlsHostnameSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustAccessMtlsHostnameSettings {
		return vs[0].([]*ZeroTrustAccessMtlsHostnameSettings)[vs[1].(int)]
	}).(ZeroTrustAccessMtlsHostnameSettingsOutput)
}

type ZeroTrustAccessMtlsHostnameSettingsMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessMtlsHostnameSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessMtlsHostnameSettings)(nil)).Elem()
}

func (o ZeroTrustAccessMtlsHostnameSettingsMapOutput) ToZeroTrustAccessMtlsHostnameSettingsMapOutput() ZeroTrustAccessMtlsHostnameSettingsMapOutput {
	return o
}

func (o ZeroTrustAccessMtlsHostnameSettingsMapOutput) ToZeroTrustAccessMtlsHostnameSettingsMapOutputWithContext(ctx context.Context) ZeroTrustAccessMtlsHostnameSettingsMapOutput {
	return o
}

func (o ZeroTrustAccessMtlsHostnameSettingsMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustAccessMtlsHostnameSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustAccessMtlsHostnameSettings {
		return vs[0].(map[string]*ZeroTrustAccessMtlsHostnameSettings)[vs[1].(string)]
	}).(ZeroTrustAccessMtlsHostnameSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessMtlsHostnameSettingsInput)(nil)).Elem(), &ZeroTrustAccessMtlsHostnameSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessMtlsHostnameSettingsArrayInput)(nil)).Elem(), ZeroTrustAccessMtlsHostnameSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessMtlsHostnameSettingsMapInput)(nil)).Elem(), ZeroTrustAccessMtlsHostnameSettingsMap{})
	pulumi.RegisterOutputType(ZeroTrustAccessMtlsHostnameSettingsOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessMtlsHostnameSettingsArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessMtlsHostnameSettingsMapOutput{})
}
