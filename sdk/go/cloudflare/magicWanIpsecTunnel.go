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

// Provides a resource, that manages IPsec tunnels for Magic Transit.
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
//			_, err := cloudflare.NewMagicWanIpsecTunnel(ctx, "example", &cloudflare.MagicWanIpsecTunnelArgs{
//				AccountId:          pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:               pulumi.String("IPsec_1"),
//				CustomerEndpoint:   pulumi.String("203.0.113.1"),
//				CloudflareEndpoint: pulumi.String("203.0.113.1"),
//				InterfaceAddress:   pulumi.String("192.0.2.0/31"),
//				Description:        pulumi.String("Tunnel for ISP X"),
//				HealthCheckEnabled: pulumi.Bool(true),
//				HealthCheckTarget:  pulumi.String("203.0.113.1"),
//				HealthCheckType:    pulumi.String("reply"),
//				Psk:                pulumi.String("asdf12341234"),
//				AllowNullCipher:    pulumi.Bool(false),
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
// $ pulumi import cloudflare:index/magicWanIpsecTunnel:MagicWanIpsecTunnel example <account_id>/<tunnel_id>
// ```
type MagicWanIpsecTunnel struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher pulumi.BoolPtrOutput `pulumi:"allowNullCipher"`
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint pulumi.StringOutput `pulumi:"cloudflareEndpoint"`
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint pulumi.StringOutput `pulumi:"customerEndpoint"`
	// An optional description of the IPsec tunnel.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId pulumi.StringOutput `pulumi:"fqdnId"`
	// Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
	HealthCheckDirection pulumi.StringOutput `pulumi:"healthCheckDirection"`
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled pulumi.BoolOutput `pulumi:"healthCheckEnabled"`
	// Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
	HealthCheckRate pulumi.StringOutput `pulumi:"healthCheckRate"`
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget pulumi.StringOutput `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType pulumi.StringOutput `pulumi:"healthCheckType"`
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId pulumi.StringOutput `pulumi:"hexId"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringOutput `pulumi:"interfaceAddress"`
	// Name of the IPsec tunnel.
	Name pulumi.StringOutput `pulumi:"name"`
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk pulumi.StringOutput `pulumi:"psk"`
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId pulumi.StringOutput `pulumi:"remoteId"`
	// Specifies if replay protection is enabled. Defaults to `false`.
	ReplayProtection pulumi.BoolPtrOutput `pulumi:"replayProtection"`
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewMagicWanIpsecTunnel registers a new resource with the given unique name, arguments, and options.
func NewMagicWanIpsecTunnel(ctx *pulumi.Context,
	name string, args *MagicWanIpsecTunnelArgs, opts ...pulumi.ResourceOption) (*MagicWanIpsecTunnel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CloudflareEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CloudflareEndpoint'")
	}
	if args.CustomerEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CustomerEndpoint'")
	}
	if args.InterfaceAddress == nil {
		return nil, errors.New("invalid value for required argument 'InterfaceAddress'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Psk != nil {
		args.Psk = pulumi.ToSecret(args.Psk).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"psk",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MagicWanIpsecTunnel
	err := ctx.RegisterResource("cloudflare:index/magicWanIpsecTunnel:MagicWanIpsecTunnel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMagicWanIpsecTunnel gets an existing MagicWanIpsecTunnel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMagicWanIpsecTunnel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MagicWanIpsecTunnelState, opts ...pulumi.ResourceOption) (*MagicWanIpsecTunnel, error) {
	var resource MagicWanIpsecTunnel
	err := ctx.ReadResource("cloudflare:index/magicWanIpsecTunnel:MagicWanIpsecTunnel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MagicWanIpsecTunnel resources.
type magicWanIpsecTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher *bool `pulumi:"allowNullCipher"`
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint *string `pulumi:"cloudflareEndpoint"`
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint *string `pulumi:"customerEndpoint"`
	// An optional description of the IPsec tunnel.
	Description *string `pulumi:"description"`
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId *string `pulumi:"fqdnId"`
	// Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
	HealthCheckDirection *string `pulumi:"healthCheckDirection"`
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
	HealthCheckRate *string `pulumi:"healthCheckRate"`
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId *string `pulumi:"hexId"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress *string `pulumi:"interfaceAddress"`
	// Name of the IPsec tunnel.
	Name *string `pulumi:"name"`
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk *string `pulumi:"psk"`
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId *string `pulumi:"remoteId"`
	// Specifies if replay protection is enabled. Defaults to `false`.
	ReplayProtection *bool `pulumi:"replayProtection"`
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId *string `pulumi:"userId"`
}

type MagicWanIpsecTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher pulumi.BoolPtrInput
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint pulumi.StringPtrInput
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint pulumi.StringPtrInput
	// An optional description of the IPsec tunnel.
	Description pulumi.StringPtrInput
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId pulumi.StringPtrInput
	// Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
	HealthCheckDirection pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled pulumi.BoolPtrInput
	// Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
	HealthCheckRate pulumi.StringPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType pulumi.StringPtrInput
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringPtrInput
	// Name of the IPsec tunnel.
	Name pulumi.StringPtrInput
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk pulumi.StringPtrInput
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId pulumi.StringPtrInput
	// Specifies if replay protection is enabled. Defaults to `false`.
	ReplayProtection pulumi.BoolPtrInput
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId pulumi.StringPtrInput
}

func (MagicWanIpsecTunnelState) ElementType() reflect.Type {
	return reflect.TypeOf((*magicWanIpsecTunnelState)(nil)).Elem()
}

type magicWanIpsecTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher *bool `pulumi:"allowNullCipher"`
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint string `pulumi:"cloudflareEndpoint"`
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint string `pulumi:"customerEndpoint"`
	// An optional description of the IPsec tunnel.
	Description *string `pulumi:"description"`
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId *string `pulumi:"fqdnId"`
	// Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
	HealthCheckDirection *string `pulumi:"healthCheckDirection"`
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
	HealthCheckRate *string `pulumi:"healthCheckRate"`
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId *string `pulumi:"hexId"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress string `pulumi:"interfaceAddress"`
	// Name of the IPsec tunnel.
	Name string `pulumi:"name"`
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk *string `pulumi:"psk"`
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId *string `pulumi:"remoteId"`
	// Specifies if replay protection is enabled. Defaults to `false`.
	ReplayProtection *bool `pulumi:"replayProtection"`
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId *string `pulumi:"userId"`
}

// The set of arguments for constructing a MagicWanIpsecTunnel resource.
type MagicWanIpsecTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher pulumi.BoolPtrInput
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint pulumi.StringInput
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint pulumi.StringInput
	// An optional description of the IPsec tunnel.
	Description pulumi.StringPtrInput
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId pulumi.StringPtrInput
	// Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
	HealthCheckDirection pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled pulumi.BoolPtrInput
	// Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
	HealthCheckRate pulumi.StringPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType pulumi.StringPtrInput
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringInput
	// Name of the IPsec tunnel.
	Name pulumi.StringInput
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk pulumi.StringPtrInput
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId pulumi.StringPtrInput
	// Specifies if replay protection is enabled. Defaults to `false`.
	ReplayProtection pulumi.BoolPtrInput
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId pulumi.StringPtrInput
}

func (MagicWanIpsecTunnelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*magicWanIpsecTunnelArgs)(nil)).Elem()
}

type MagicWanIpsecTunnelInput interface {
	pulumi.Input

	ToMagicWanIpsecTunnelOutput() MagicWanIpsecTunnelOutput
	ToMagicWanIpsecTunnelOutputWithContext(ctx context.Context) MagicWanIpsecTunnelOutput
}

func (*MagicWanIpsecTunnel) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicWanIpsecTunnel)(nil)).Elem()
}

func (i *MagicWanIpsecTunnel) ToMagicWanIpsecTunnelOutput() MagicWanIpsecTunnelOutput {
	return i.ToMagicWanIpsecTunnelOutputWithContext(context.Background())
}

func (i *MagicWanIpsecTunnel) ToMagicWanIpsecTunnelOutputWithContext(ctx context.Context) MagicWanIpsecTunnelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicWanIpsecTunnelOutput)
}

// MagicWanIpsecTunnelArrayInput is an input type that accepts MagicWanIpsecTunnelArray and MagicWanIpsecTunnelArrayOutput values.
// You can construct a concrete instance of `MagicWanIpsecTunnelArrayInput` via:
//
//	MagicWanIpsecTunnelArray{ MagicWanIpsecTunnelArgs{...} }
type MagicWanIpsecTunnelArrayInput interface {
	pulumi.Input

	ToMagicWanIpsecTunnelArrayOutput() MagicWanIpsecTunnelArrayOutput
	ToMagicWanIpsecTunnelArrayOutputWithContext(context.Context) MagicWanIpsecTunnelArrayOutput
}

type MagicWanIpsecTunnelArray []MagicWanIpsecTunnelInput

func (MagicWanIpsecTunnelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicWanIpsecTunnel)(nil)).Elem()
}

func (i MagicWanIpsecTunnelArray) ToMagicWanIpsecTunnelArrayOutput() MagicWanIpsecTunnelArrayOutput {
	return i.ToMagicWanIpsecTunnelArrayOutputWithContext(context.Background())
}

func (i MagicWanIpsecTunnelArray) ToMagicWanIpsecTunnelArrayOutputWithContext(ctx context.Context) MagicWanIpsecTunnelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicWanIpsecTunnelArrayOutput)
}

// MagicWanIpsecTunnelMapInput is an input type that accepts MagicWanIpsecTunnelMap and MagicWanIpsecTunnelMapOutput values.
// You can construct a concrete instance of `MagicWanIpsecTunnelMapInput` via:
//
//	MagicWanIpsecTunnelMap{ "key": MagicWanIpsecTunnelArgs{...} }
type MagicWanIpsecTunnelMapInput interface {
	pulumi.Input

	ToMagicWanIpsecTunnelMapOutput() MagicWanIpsecTunnelMapOutput
	ToMagicWanIpsecTunnelMapOutputWithContext(context.Context) MagicWanIpsecTunnelMapOutput
}

type MagicWanIpsecTunnelMap map[string]MagicWanIpsecTunnelInput

func (MagicWanIpsecTunnelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicWanIpsecTunnel)(nil)).Elem()
}

func (i MagicWanIpsecTunnelMap) ToMagicWanIpsecTunnelMapOutput() MagicWanIpsecTunnelMapOutput {
	return i.ToMagicWanIpsecTunnelMapOutputWithContext(context.Background())
}

func (i MagicWanIpsecTunnelMap) ToMagicWanIpsecTunnelMapOutputWithContext(ctx context.Context) MagicWanIpsecTunnelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicWanIpsecTunnelMapOutput)
}

type MagicWanIpsecTunnelOutput struct{ *pulumi.OutputState }

func (MagicWanIpsecTunnelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicWanIpsecTunnel)(nil)).Elem()
}

func (o MagicWanIpsecTunnelOutput) ToMagicWanIpsecTunnelOutput() MagicWanIpsecTunnelOutput {
	return o
}

func (o MagicWanIpsecTunnelOutput) ToMagicWanIpsecTunnelOutputWithContext(ctx context.Context) MagicWanIpsecTunnelOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o MagicWanIpsecTunnelOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
func (o MagicWanIpsecTunnelOutput) AllowNullCipher() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.BoolPtrOutput { return v.AllowNullCipher }).(pulumi.BoolPtrOutput)
}

// IP address assigned to the Cloudflare side of the IPsec tunnel.
func (o MagicWanIpsecTunnelOutput) CloudflareEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.CloudflareEndpoint }).(pulumi.StringOutput)
}

// IP address assigned to the customer side of the IPsec tunnel.
func (o MagicWanIpsecTunnelOutput) CustomerEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.CustomerEndpoint }).(pulumi.StringOutput)
}

// An optional description of the IPsec tunnel.
func (o MagicWanIpsecTunnelOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
func (o MagicWanIpsecTunnelOutput) FqdnId() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.FqdnId }).(pulumi.StringOutput)
}

// Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
func (o MagicWanIpsecTunnelOutput) HealthCheckDirection() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.HealthCheckDirection }).(pulumi.StringOutput)
}

// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
func (o MagicWanIpsecTunnelOutput) HealthCheckEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.BoolOutput { return v.HealthCheckEnabled }).(pulumi.BoolOutput)
}

// Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
func (o MagicWanIpsecTunnelOutput) HealthCheckRate() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.HealthCheckRate }).(pulumi.StringOutput)
}

// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
func (o MagicWanIpsecTunnelOutput) HealthCheckTarget() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.HealthCheckTarget }).(pulumi.StringOutput)
}

// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
func (o MagicWanIpsecTunnelOutput) HealthCheckType() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.HealthCheckType }).(pulumi.StringOutput)
}

// `remoteId` as a hex string. This value is generated by cloudflare.
func (o MagicWanIpsecTunnelOutput) HexId() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.HexId }).(pulumi.StringOutput)
}

// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
func (o MagicWanIpsecTunnelOutput) InterfaceAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.InterfaceAddress }).(pulumi.StringOutput)
}

// Name of the IPsec tunnel.
func (o MagicWanIpsecTunnelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
func (o MagicWanIpsecTunnelOutput) Psk() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.Psk }).(pulumi.StringOutput)
}

// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
func (o MagicWanIpsecTunnelOutput) RemoteId() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.RemoteId }).(pulumi.StringOutput)
}

// Specifies if replay protection is enabled. Defaults to `false`.
func (o MagicWanIpsecTunnelOutput) ReplayProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.BoolPtrOutput { return v.ReplayProtection }).(pulumi.BoolPtrOutput)
}

// `remoteId` in the form of an email address. This value is generated by cloudflare.
func (o MagicWanIpsecTunnelOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanIpsecTunnel) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type MagicWanIpsecTunnelArrayOutput struct{ *pulumi.OutputState }

func (MagicWanIpsecTunnelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicWanIpsecTunnel)(nil)).Elem()
}

func (o MagicWanIpsecTunnelArrayOutput) ToMagicWanIpsecTunnelArrayOutput() MagicWanIpsecTunnelArrayOutput {
	return o
}

func (o MagicWanIpsecTunnelArrayOutput) ToMagicWanIpsecTunnelArrayOutputWithContext(ctx context.Context) MagicWanIpsecTunnelArrayOutput {
	return o
}

func (o MagicWanIpsecTunnelArrayOutput) Index(i pulumi.IntInput) MagicWanIpsecTunnelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MagicWanIpsecTunnel {
		return vs[0].([]*MagicWanIpsecTunnel)[vs[1].(int)]
	}).(MagicWanIpsecTunnelOutput)
}

type MagicWanIpsecTunnelMapOutput struct{ *pulumi.OutputState }

func (MagicWanIpsecTunnelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicWanIpsecTunnel)(nil)).Elem()
}

func (o MagicWanIpsecTunnelMapOutput) ToMagicWanIpsecTunnelMapOutput() MagicWanIpsecTunnelMapOutput {
	return o
}

func (o MagicWanIpsecTunnelMapOutput) ToMagicWanIpsecTunnelMapOutputWithContext(ctx context.Context) MagicWanIpsecTunnelMapOutput {
	return o
}

func (o MagicWanIpsecTunnelMapOutput) MapIndex(k pulumi.StringInput) MagicWanIpsecTunnelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MagicWanIpsecTunnel {
		return vs[0].(map[string]*MagicWanIpsecTunnel)[vs[1].(string)]
	}).(MagicWanIpsecTunnelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MagicWanIpsecTunnelInput)(nil)).Elem(), &MagicWanIpsecTunnel{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicWanIpsecTunnelArrayInput)(nil)).Elem(), MagicWanIpsecTunnelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicWanIpsecTunnelMapInput)(nil)).Elem(), MagicWanIpsecTunnelMap{})
	pulumi.RegisterOutputType(MagicWanIpsecTunnelOutput{})
	pulumi.RegisterOutputType(MagicWanIpsecTunnelArrayOutput{})
	pulumi.RegisterOutputType(MagicWanIpsecTunnelMapOutput{})
}
