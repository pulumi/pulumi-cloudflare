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
//			_, err := cloudflare.NewMagicNetworkMonitoringRule(ctx, "example_magic_network_monitoring_rule", &cloudflare.MagicNetworkMonitoringRuleArgs{
//				AccountId:              pulumi.String("6f91088a406011ed95aed352566e8d4c"),
//				Duration:               pulumi.String("1m"),
//				Name:                   pulumi.String("my_rule_1"),
//				AutomaticAdvertisement: pulumi.Bool(true),
//				Bandwidth:              pulumi.Float64(1000),
//				PacketThreshold:        pulumi.Float64(10000),
//				Prefixes: pulumi.StringArray{
//					pulumi.String("203.0.113.1/32"),
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
// $ pulumi import cloudflare:index/magicNetworkMonitoringRule:MagicNetworkMonitoringRule example '<account_id>/<rule_id>'
// ```
type MagicNetworkMonitoringRule struct {
	pulumi.CustomResourceState

	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
	AutomaticAdvertisement pulumi.BoolPtrOutput `pulumi:"automaticAdvertisement"`
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	Bandwidth pulumi.Float64PtrOutput `pulumi:"bandwidth"`
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	BandwidthThreshold pulumi.Float64Output `pulumi:"bandwidthThreshold"`
	// The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values ["1m","5m","10m","15m","20m","30m","45m","60m"].
	// Available values: "1m", "5m", "10m", "15m", "20m", "30m", "45m", "60m".
	Duration pulumi.StringOutput `pulumi:"duration"`
	// The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	PacketThreshold pulumi.Float64PtrOutput `pulumi:"packetThreshold"`
	// Prefix match type to be applied for a prefix auto advertisement when using an advancedDdos rule.
	// Available values: "exact", "subnet", "supernet".
	PrefixMatch pulumi.StringOutput      `pulumi:"prefixMatch"`
	Prefixes    pulumi.StringArrayOutput `pulumi:"prefixes"`
	// MNM rule type.
	// Available values: "threshold", "zscore", "advancedDdos".
	Type pulumi.StringOutput `pulumi:"type"`
	// Level of sensitivity set for zscore rules.
	// Available values: "low", "medium", "high".
	ZscoreSensitivity pulumi.StringOutput `pulumi:"zscoreSensitivity"`
	// Target of the zscore rule analysis.
	// Available values: "bits", "packets".
	ZscoreTarget pulumi.StringOutput `pulumi:"zscoreTarget"`
}

// NewMagicNetworkMonitoringRule registers a new resource with the given unique name, arguments, and options.
func NewMagicNetworkMonitoringRule(ctx *pulumi.Context,
	name string, args *MagicNetworkMonitoringRuleArgs, opts ...pulumi.ResourceOption) (*MagicNetworkMonitoringRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MagicNetworkMonitoringRule
	err := ctx.RegisterResource("cloudflare:index/magicNetworkMonitoringRule:MagicNetworkMonitoringRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMagicNetworkMonitoringRule gets an existing MagicNetworkMonitoringRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMagicNetworkMonitoringRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MagicNetworkMonitoringRuleState, opts ...pulumi.ResourceOption) (*MagicNetworkMonitoringRule, error) {
	var resource MagicNetworkMonitoringRule
	err := ctx.ReadResource("cloudflare:index/magicNetworkMonitoringRule:MagicNetworkMonitoringRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MagicNetworkMonitoringRule resources.
type magicNetworkMonitoringRuleState struct {
	AccountId *string `pulumi:"accountId"`
	// Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
	AutomaticAdvertisement *bool `pulumi:"automaticAdvertisement"`
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	Bandwidth *float64 `pulumi:"bandwidth"`
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	BandwidthThreshold *float64 `pulumi:"bandwidthThreshold"`
	// The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values ["1m","5m","10m","15m","20m","30m","45m","60m"].
	// Available values: "1m", "5m", "10m", "15m", "20m", "30m", "45m", "60m".
	Duration *string `pulumi:"duration"`
	// The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
	Name *string `pulumi:"name"`
	// The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	PacketThreshold *float64 `pulumi:"packetThreshold"`
	// Prefix match type to be applied for a prefix auto advertisement when using an advancedDdos rule.
	// Available values: "exact", "subnet", "supernet".
	PrefixMatch *string  `pulumi:"prefixMatch"`
	Prefixes    []string `pulumi:"prefixes"`
	// MNM rule type.
	// Available values: "threshold", "zscore", "advancedDdos".
	Type *string `pulumi:"type"`
	// Level of sensitivity set for zscore rules.
	// Available values: "low", "medium", "high".
	ZscoreSensitivity *string `pulumi:"zscoreSensitivity"`
	// Target of the zscore rule analysis.
	// Available values: "bits", "packets".
	ZscoreTarget *string `pulumi:"zscoreTarget"`
}

type MagicNetworkMonitoringRuleState struct {
	AccountId pulumi.StringPtrInput
	// Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
	AutomaticAdvertisement pulumi.BoolPtrInput
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	Bandwidth pulumi.Float64PtrInput
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	BandwidthThreshold pulumi.Float64PtrInput
	// The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values ["1m","5m","10m","15m","20m","30m","45m","60m"].
	// Available values: "1m", "5m", "10m", "15m", "20m", "30m", "45m", "60m".
	Duration pulumi.StringPtrInput
	// The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
	Name pulumi.StringPtrInput
	// The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	PacketThreshold pulumi.Float64PtrInput
	// Prefix match type to be applied for a prefix auto advertisement when using an advancedDdos rule.
	// Available values: "exact", "subnet", "supernet".
	PrefixMatch pulumi.StringPtrInput
	Prefixes    pulumi.StringArrayInput
	// MNM rule type.
	// Available values: "threshold", "zscore", "advancedDdos".
	Type pulumi.StringPtrInput
	// Level of sensitivity set for zscore rules.
	// Available values: "low", "medium", "high".
	ZscoreSensitivity pulumi.StringPtrInput
	// Target of the zscore rule analysis.
	// Available values: "bits", "packets".
	ZscoreTarget pulumi.StringPtrInput
}

func (MagicNetworkMonitoringRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*magicNetworkMonitoringRuleState)(nil)).Elem()
}

type magicNetworkMonitoringRuleArgs struct {
	AccountId string `pulumi:"accountId"`
	// Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
	AutomaticAdvertisement *bool `pulumi:"automaticAdvertisement"`
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	Bandwidth *float64 `pulumi:"bandwidth"`
	// The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values ["1m","5m","10m","15m","20m","30m","45m","60m"].
	// Available values: "1m", "5m", "10m", "15m", "20m", "30m", "45m", "60m".
	Duration *string `pulumi:"duration"`
	// The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
	Name string `pulumi:"name"`
	// The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	PacketThreshold *float64 `pulumi:"packetThreshold"`
	Prefixes        []string `pulumi:"prefixes"`
}

// The set of arguments for constructing a MagicNetworkMonitoringRule resource.
type MagicNetworkMonitoringRuleArgs struct {
	AccountId pulumi.StringInput
	// Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
	AutomaticAdvertisement pulumi.BoolPtrInput
	// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	Bandwidth pulumi.Float64PtrInput
	// The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values ["1m","5m","10m","15m","20m","30m","45m","60m"].
	// Available values: "1m", "5m", "10m", "15m", "20m", "30m", "45m", "60m".
	Duration pulumi.StringPtrInput
	// The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
	Name pulumi.StringInput
	// The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
	PacketThreshold pulumi.Float64PtrInput
	Prefixes        pulumi.StringArrayInput
}

func (MagicNetworkMonitoringRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*magicNetworkMonitoringRuleArgs)(nil)).Elem()
}

type MagicNetworkMonitoringRuleInput interface {
	pulumi.Input

	ToMagicNetworkMonitoringRuleOutput() MagicNetworkMonitoringRuleOutput
	ToMagicNetworkMonitoringRuleOutputWithContext(ctx context.Context) MagicNetworkMonitoringRuleOutput
}

func (*MagicNetworkMonitoringRule) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicNetworkMonitoringRule)(nil)).Elem()
}

func (i *MagicNetworkMonitoringRule) ToMagicNetworkMonitoringRuleOutput() MagicNetworkMonitoringRuleOutput {
	return i.ToMagicNetworkMonitoringRuleOutputWithContext(context.Background())
}

func (i *MagicNetworkMonitoringRule) ToMagicNetworkMonitoringRuleOutputWithContext(ctx context.Context) MagicNetworkMonitoringRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicNetworkMonitoringRuleOutput)
}

// MagicNetworkMonitoringRuleArrayInput is an input type that accepts MagicNetworkMonitoringRuleArray and MagicNetworkMonitoringRuleArrayOutput values.
// You can construct a concrete instance of `MagicNetworkMonitoringRuleArrayInput` via:
//
//	MagicNetworkMonitoringRuleArray{ MagicNetworkMonitoringRuleArgs{...} }
type MagicNetworkMonitoringRuleArrayInput interface {
	pulumi.Input

	ToMagicNetworkMonitoringRuleArrayOutput() MagicNetworkMonitoringRuleArrayOutput
	ToMagicNetworkMonitoringRuleArrayOutputWithContext(context.Context) MagicNetworkMonitoringRuleArrayOutput
}

type MagicNetworkMonitoringRuleArray []MagicNetworkMonitoringRuleInput

func (MagicNetworkMonitoringRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicNetworkMonitoringRule)(nil)).Elem()
}

func (i MagicNetworkMonitoringRuleArray) ToMagicNetworkMonitoringRuleArrayOutput() MagicNetworkMonitoringRuleArrayOutput {
	return i.ToMagicNetworkMonitoringRuleArrayOutputWithContext(context.Background())
}

func (i MagicNetworkMonitoringRuleArray) ToMagicNetworkMonitoringRuleArrayOutputWithContext(ctx context.Context) MagicNetworkMonitoringRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicNetworkMonitoringRuleArrayOutput)
}

// MagicNetworkMonitoringRuleMapInput is an input type that accepts MagicNetworkMonitoringRuleMap and MagicNetworkMonitoringRuleMapOutput values.
// You can construct a concrete instance of `MagicNetworkMonitoringRuleMapInput` via:
//
//	MagicNetworkMonitoringRuleMap{ "key": MagicNetworkMonitoringRuleArgs{...} }
type MagicNetworkMonitoringRuleMapInput interface {
	pulumi.Input

	ToMagicNetworkMonitoringRuleMapOutput() MagicNetworkMonitoringRuleMapOutput
	ToMagicNetworkMonitoringRuleMapOutputWithContext(context.Context) MagicNetworkMonitoringRuleMapOutput
}

type MagicNetworkMonitoringRuleMap map[string]MagicNetworkMonitoringRuleInput

func (MagicNetworkMonitoringRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicNetworkMonitoringRule)(nil)).Elem()
}

func (i MagicNetworkMonitoringRuleMap) ToMagicNetworkMonitoringRuleMapOutput() MagicNetworkMonitoringRuleMapOutput {
	return i.ToMagicNetworkMonitoringRuleMapOutputWithContext(context.Background())
}

func (i MagicNetworkMonitoringRuleMap) ToMagicNetworkMonitoringRuleMapOutputWithContext(ctx context.Context) MagicNetworkMonitoringRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicNetworkMonitoringRuleMapOutput)
}

type MagicNetworkMonitoringRuleOutput struct{ *pulumi.OutputState }

func (MagicNetworkMonitoringRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicNetworkMonitoringRule)(nil)).Elem()
}

func (o MagicNetworkMonitoringRuleOutput) ToMagicNetworkMonitoringRuleOutput() MagicNetworkMonitoringRuleOutput {
	return o
}

func (o MagicNetworkMonitoringRuleOutput) ToMagicNetworkMonitoringRuleOutputWithContext(ctx context.Context) MagicNetworkMonitoringRuleOutput {
	return o
}

func (o MagicNetworkMonitoringRuleOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit.
func (o MagicNetworkMonitoringRuleOutput) AutomaticAdvertisement() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.BoolPtrOutput { return v.AutomaticAdvertisement }).(pulumi.BoolPtrOutput)
}

// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
func (o MagicNetworkMonitoringRuleOutput) Bandwidth() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.Float64PtrOutput { return v.Bandwidth }).(pulumi.Float64PtrOutput)
}

// The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
func (o MagicNetworkMonitoringRuleOutput) BandwidthThreshold() pulumi.Float64Output {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.Float64Output { return v.BandwidthThreshold }).(pulumi.Float64Output)
}

// The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values ["1m","5m","10m","15m","20m","30m","45m","60m"].
// Available values: "1m", "5m", "10m", "15m", "20m", "30m", "45m", "60m".
func (o MagicNetworkMonitoringRuleOutput) Duration() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringOutput { return v.Duration }).(pulumi.StringOutput)
}

// The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters.
func (o MagicNetworkMonitoringRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum.
func (o MagicNetworkMonitoringRuleOutput) PacketThreshold() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.Float64PtrOutput { return v.PacketThreshold }).(pulumi.Float64PtrOutput)
}

// Prefix match type to be applied for a prefix auto advertisement when using an advancedDdos rule.
// Available values: "exact", "subnet", "supernet".
func (o MagicNetworkMonitoringRuleOutput) PrefixMatch() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringOutput { return v.PrefixMatch }).(pulumi.StringOutput)
}

func (o MagicNetworkMonitoringRuleOutput) Prefixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringArrayOutput { return v.Prefixes }).(pulumi.StringArrayOutput)
}

// MNM rule type.
// Available values: "threshold", "zscore", "advancedDdos".
func (o MagicNetworkMonitoringRuleOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Level of sensitivity set for zscore rules.
// Available values: "low", "medium", "high".
func (o MagicNetworkMonitoringRuleOutput) ZscoreSensitivity() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringOutput { return v.ZscoreSensitivity }).(pulumi.StringOutput)
}

// Target of the zscore rule analysis.
// Available values: "bits", "packets".
func (o MagicNetworkMonitoringRuleOutput) ZscoreTarget() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicNetworkMonitoringRule) pulumi.StringOutput { return v.ZscoreTarget }).(pulumi.StringOutput)
}

type MagicNetworkMonitoringRuleArrayOutput struct{ *pulumi.OutputState }

func (MagicNetworkMonitoringRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicNetworkMonitoringRule)(nil)).Elem()
}

func (o MagicNetworkMonitoringRuleArrayOutput) ToMagicNetworkMonitoringRuleArrayOutput() MagicNetworkMonitoringRuleArrayOutput {
	return o
}

func (o MagicNetworkMonitoringRuleArrayOutput) ToMagicNetworkMonitoringRuleArrayOutputWithContext(ctx context.Context) MagicNetworkMonitoringRuleArrayOutput {
	return o
}

func (o MagicNetworkMonitoringRuleArrayOutput) Index(i pulumi.IntInput) MagicNetworkMonitoringRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MagicNetworkMonitoringRule {
		return vs[0].([]*MagicNetworkMonitoringRule)[vs[1].(int)]
	}).(MagicNetworkMonitoringRuleOutput)
}

type MagicNetworkMonitoringRuleMapOutput struct{ *pulumi.OutputState }

func (MagicNetworkMonitoringRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicNetworkMonitoringRule)(nil)).Elem()
}

func (o MagicNetworkMonitoringRuleMapOutput) ToMagicNetworkMonitoringRuleMapOutput() MagicNetworkMonitoringRuleMapOutput {
	return o
}

func (o MagicNetworkMonitoringRuleMapOutput) ToMagicNetworkMonitoringRuleMapOutputWithContext(ctx context.Context) MagicNetworkMonitoringRuleMapOutput {
	return o
}

func (o MagicNetworkMonitoringRuleMapOutput) MapIndex(k pulumi.StringInput) MagicNetworkMonitoringRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MagicNetworkMonitoringRule {
		return vs[0].(map[string]*MagicNetworkMonitoringRule)[vs[1].(string)]
	}).(MagicNetworkMonitoringRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MagicNetworkMonitoringRuleInput)(nil)).Elem(), &MagicNetworkMonitoringRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicNetworkMonitoringRuleArrayInput)(nil)).Elem(), MagicNetworkMonitoringRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicNetworkMonitoringRuleMapInput)(nil)).Elem(), MagicNetworkMonitoringRuleMap{})
	pulumi.RegisterOutputType(MagicNetworkMonitoringRuleOutput{})
	pulumi.RegisterOutputType(MagicNetworkMonitoringRuleArrayOutput{})
	pulumi.RegisterOutputType(MagicNetworkMonitoringRuleMapOutput{})
}
