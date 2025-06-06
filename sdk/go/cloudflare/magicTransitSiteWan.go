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
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/magicTransitSiteWan:MagicTransitSiteWan example '<account_id>/<site_id>/<wan_id>'
// ```
type MagicTransitSiteWan struct {
	pulumi.CustomResourceState

	// Identifier
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
	// Available values: "low", "mid", "high".
	HealthCheckRate pulumi.StringOutput    `pulumi:"healthCheckRate"`
	Name            pulumi.StringPtrOutput `pulumi:"name"`
	Physport        pulumi.IntOutput       `pulumi:"physport"`
	Priority        pulumi.IntPtrOutput    `pulumi:"priority"`
	// Identifier
	SiteId pulumi.StringOutput `pulumi:"siteId"`
	// (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
	StaticAddressing MagicTransitSiteWanStaticAddressingPtrOutput `pulumi:"staticAddressing"`
	// VLAN ID. Use zero for untagged.
	VlanTag pulumi.IntPtrOutput `pulumi:"vlanTag"`
}

// NewMagicTransitSiteWan registers a new resource with the given unique name, arguments, and options.
func NewMagicTransitSiteWan(ctx *pulumi.Context,
	name string, args *MagicTransitSiteWanArgs, opts ...pulumi.ResourceOption) (*MagicTransitSiteWan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Physport == nil {
		return nil, errors.New("invalid value for required argument 'Physport'")
	}
	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MagicTransitSiteWan
	err := ctx.RegisterResource("cloudflare:index/magicTransitSiteWan:MagicTransitSiteWan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMagicTransitSiteWan gets an existing MagicTransitSiteWan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMagicTransitSiteWan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MagicTransitSiteWanState, opts ...pulumi.ResourceOption) (*MagicTransitSiteWan, error) {
	var resource MagicTransitSiteWan
	err := ctx.ReadResource("cloudflare:index/magicTransitSiteWan:MagicTransitSiteWan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MagicTransitSiteWan resources.
type magicTransitSiteWanState struct {
	// Identifier
	AccountId *string `pulumi:"accountId"`
	// Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
	// Available values: "low", "mid", "high".
	HealthCheckRate *string `pulumi:"healthCheckRate"`
	Name            *string `pulumi:"name"`
	Physport        *int    `pulumi:"physport"`
	Priority        *int    `pulumi:"priority"`
	// Identifier
	SiteId *string `pulumi:"siteId"`
	// (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
	StaticAddressing *MagicTransitSiteWanStaticAddressing `pulumi:"staticAddressing"`
	// VLAN ID. Use zero for untagged.
	VlanTag *int `pulumi:"vlanTag"`
}

type MagicTransitSiteWanState struct {
	// Identifier
	AccountId pulumi.StringPtrInput
	// Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
	// Available values: "low", "mid", "high".
	HealthCheckRate pulumi.StringPtrInput
	Name            pulumi.StringPtrInput
	Physport        pulumi.IntPtrInput
	Priority        pulumi.IntPtrInput
	// Identifier
	SiteId pulumi.StringPtrInput
	// (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
	StaticAddressing MagicTransitSiteWanStaticAddressingPtrInput
	// VLAN ID. Use zero for untagged.
	VlanTag pulumi.IntPtrInput
}

func (MagicTransitSiteWanState) ElementType() reflect.Type {
	return reflect.TypeOf((*magicTransitSiteWanState)(nil)).Elem()
}

type magicTransitSiteWanArgs struct {
	// Identifier
	AccountId string  `pulumi:"accountId"`
	Name      *string `pulumi:"name"`
	Physport  int     `pulumi:"physport"`
	Priority  *int    `pulumi:"priority"`
	// Identifier
	SiteId string `pulumi:"siteId"`
	// (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
	StaticAddressing *MagicTransitSiteWanStaticAddressing `pulumi:"staticAddressing"`
	// VLAN ID. Use zero for untagged.
	VlanTag *int `pulumi:"vlanTag"`
}

// The set of arguments for constructing a MagicTransitSiteWan resource.
type MagicTransitSiteWanArgs struct {
	// Identifier
	AccountId pulumi.StringInput
	Name      pulumi.StringPtrInput
	Physport  pulumi.IntInput
	Priority  pulumi.IntPtrInput
	// Identifier
	SiteId pulumi.StringInput
	// (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
	StaticAddressing MagicTransitSiteWanStaticAddressingPtrInput
	// VLAN ID. Use zero for untagged.
	VlanTag pulumi.IntPtrInput
}

func (MagicTransitSiteWanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*magicTransitSiteWanArgs)(nil)).Elem()
}

type MagicTransitSiteWanInput interface {
	pulumi.Input

	ToMagicTransitSiteWanOutput() MagicTransitSiteWanOutput
	ToMagicTransitSiteWanOutputWithContext(ctx context.Context) MagicTransitSiteWanOutput
}

func (*MagicTransitSiteWan) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicTransitSiteWan)(nil)).Elem()
}

func (i *MagicTransitSiteWan) ToMagicTransitSiteWanOutput() MagicTransitSiteWanOutput {
	return i.ToMagicTransitSiteWanOutputWithContext(context.Background())
}

func (i *MagicTransitSiteWan) ToMagicTransitSiteWanOutputWithContext(ctx context.Context) MagicTransitSiteWanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicTransitSiteWanOutput)
}

// MagicTransitSiteWanArrayInput is an input type that accepts MagicTransitSiteWanArray and MagicTransitSiteWanArrayOutput values.
// You can construct a concrete instance of `MagicTransitSiteWanArrayInput` via:
//
//	MagicTransitSiteWanArray{ MagicTransitSiteWanArgs{...} }
type MagicTransitSiteWanArrayInput interface {
	pulumi.Input

	ToMagicTransitSiteWanArrayOutput() MagicTransitSiteWanArrayOutput
	ToMagicTransitSiteWanArrayOutputWithContext(context.Context) MagicTransitSiteWanArrayOutput
}

type MagicTransitSiteWanArray []MagicTransitSiteWanInput

func (MagicTransitSiteWanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicTransitSiteWan)(nil)).Elem()
}

func (i MagicTransitSiteWanArray) ToMagicTransitSiteWanArrayOutput() MagicTransitSiteWanArrayOutput {
	return i.ToMagicTransitSiteWanArrayOutputWithContext(context.Background())
}

func (i MagicTransitSiteWanArray) ToMagicTransitSiteWanArrayOutputWithContext(ctx context.Context) MagicTransitSiteWanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicTransitSiteWanArrayOutput)
}

// MagicTransitSiteWanMapInput is an input type that accepts MagicTransitSiteWanMap and MagicTransitSiteWanMapOutput values.
// You can construct a concrete instance of `MagicTransitSiteWanMapInput` via:
//
//	MagicTransitSiteWanMap{ "key": MagicTransitSiteWanArgs{...} }
type MagicTransitSiteWanMapInput interface {
	pulumi.Input

	ToMagicTransitSiteWanMapOutput() MagicTransitSiteWanMapOutput
	ToMagicTransitSiteWanMapOutputWithContext(context.Context) MagicTransitSiteWanMapOutput
}

type MagicTransitSiteWanMap map[string]MagicTransitSiteWanInput

func (MagicTransitSiteWanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicTransitSiteWan)(nil)).Elem()
}

func (i MagicTransitSiteWanMap) ToMagicTransitSiteWanMapOutput() MagicTransitSiteWanMapOutput {
	return i.ToMagicTransitSiteWanMapOutputWithContext(context.Background())
}

func (i MagicTransitSiteWanMap) ToMagicTransitSiteWanMapOutputWithContext(ctx context.Context) MagicTransitSiteWanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicTransitSiteWanMapOutput)
}

type MagicTransitSiteWanOutput struct{ *pulumi.OutputState }

func (MagicTransitSiteWanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicTransitSiteWan)(nil)).Elem()
}

func (o MagicTransitSiteWanOutput) ToMagicTransitSiteWanOutput() MagicTransitSiteWanOutput {
	return o
}

func (o MagicTransitSiteWanOutput) ToMagicTransitSiteWanOutputWithContext(ctx context.Context) MagicTransitSiteWanOutput {
	return o
}

// Identifier
func (o MagicTransitSiteWanOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Magic WAN health check rate for tunnels created on this link. The default value is `mid`.
// Available values: "low", "mid", "high".
func (o MagicTransitSiteWanOutput) HealthCheckRate() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) pulumi.StringOutput { return v.HealthCheckRate }).(pulumi.StringOutput)
}

func (o MagicTransitSiteWanOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

func (o MagicTransitSiteWanOutput) Physport() pulumi.IntOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) pulumi.IntOutput { return v.Physport }).(pulumi.IntOutput)
}

func (o MagicTransitSiteWanOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// Identifier
func (o MagicTransitSiteWanOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
func (o MagicTransitSiteWanOutput) StaticAddressing() MagicTransitSiteWanStaticAddressingPtrOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) MagicTransitSiteWanStaticAddressingPtrOutput { return v.StaticAddressing }).(MagicTransitSiteWanStaticAddressingPtrOutput)
}

// VLAN ID. Use zero for untagged.
func (o MagicTransitSiteWanOutput) VlanTag() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MagicTransitSiteWan) pulumi.IntPtrOutput { return v.VlanTag }).(pulumi.IntPtrOutput)
}

type MagicTransitSiteWanArrayOutput struct{ *pulumi.OutputState }

func (MagicTransitSiteWanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicTransitSiteWan)(nil)).Elem()
}

func (o MagicTransitSiteWanArrayOutput) ToMagicTransitSiteWanArrayOutput() MagicTransitSiteWanArrayOutput {
	return o
}

func (o MagicTransitSiteWanArrayOutput) ToMagicTransitSiteWanArrayOutputWithContext(ctx context.Context) MagicTransitSiteWanArrayOutput {
	return o
}

func (o MagicTransitSiteWanArrayOutput) Index(i pulumi.IntInput) MagicTransitSiteWanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MagicTransitSiteWan {
		return vs[0].([]*MagicTransitSiteWan)[vs[1].(int)]
	}).(MagicTransitSiteWanOutput)
}

type MagicTransitSiteWanMapOutput struct{ *pulumi.OutputState }

func (MagicTransitSiteWanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicTransitSiteWan)(nil)).Elem()
}

func (o MagicTransitSiteWanMapOutput) ToMagicTransitSiteWanMapOutput() MagicTransitSiteWanMapOutput {
	return o
}

func (o MagicTransitSiteWanMapOutput) ToMagicTransitSiteWanMapOutputWithContext(ctx context.Context) MagicTransitSiteWanMapOutput {
	return o
}

func (o MagicTransitSiteWanMapOutput) MapIndex(k pulumi.StringInput) MagicTransitSiteWanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MagicTransitSiteWan {
		return vs[0].(map[string]*MagicTransitSiteWan)[vs[1].(string)]
	}).(MagicTransitSiteWanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MagicTransitSiteWanInput)(nil)).Elem(), &MagicTransitSiteWan{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicTransitSiteWanArrayInput)(nil)).Elem(), MagicTransitSiteWanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicTransitSiteWanMapInput)(nil)).Elem(), MagicTransitSiteWanMap{})
	pulumi.RegisterOutputType(MagicTransitSiteWanOutput{})
	pulumi.RegisterOutputType(MagicTransitSiteWanArrayOutput{})
	pulumi.RegisterOutputType(MagicTransitSiteWanMapOutput{})
}
