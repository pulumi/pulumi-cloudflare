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
//			_, err := cloudflare.NewZeroTrustDnsLocation(ctx, "example_zero_trust_dns_location", &cloudflare.ZeroTrustDnsLocationArgs{
//				AccountId:           pulumi.String("699d98642c564d2e855e9661899b7252"),
//				Name:                pulumi.String("Austin Office Location"),
//				ClientDefault:       pulumi.Bool(false),
//				DnsDestinationIpsId: pulumi.String("0e4a32c6-6fb8-4858-9296-98f51631e8e6"),
//				EcsSupport:          pulumi.Bool(false),
//				Endpoints: &cloudflare.ZeroTrustDnsLocationEndpointsArgs{
//					Doh: &cloudflare.ZeroTrustDnsLocationEndpointsDohArgs{
//						Enabled: pulumi.Bool(true),
//						Networks: cloudflare.ZeroTrustDnsLocationEndpointsDohNetworkArray{
//							&cloudflare.ZeroTrustDnsLocationEndpointsDohNetworkArgs{
//								Network: pulumi.String("2001:85a3::/64"),
//							},
//						},
//						RequireToken: pulumi.Bool(true),
//					},
//					Dot: &cloudflare.ZeroTrustDnsLocationEndpointsDotArgs{
//						Enabled: pulumi.Bool(true),
//						Networks: cloudflare.ZeroTrustDnsLocationEndpointsDotNetworkArray{
//							&cloudflare.ZeroTrustDnsLocationEndpointsDotNetworkArgs{
//								Network: pulumi.String("2001:85a3::/64"),
//							},
//						},
//					},
//					Ipv4: &cloudflare.ZeroTrustDnsLocationEndpointsIpv4Args{
//						Enabled: pulumi.Bool(true),
//					},
//					Ipv6: &cloudflare.ZeroTrustDnsLocationEndpointsIpv6Args{
//						Enabled: pulumi.Bool(true),
//						Networks: cloudflare.ZeroTrustDnsLocationEndpointsIpv6NetworkArray{
//							&cloudflare.ZeroTrustDnsLocationEndpointsIpv6NetworkArgs{
//								Network: pulumi.String("2001:85a3::/64"),
//							},
//						},
//					},
//				},
//				Networks: cloudflare.ZeroTrustDnsLocationNetworkArray{
//					&cloudflare.ZeroTrustDnsLocationNetworkArgs{
//						Network: pulumi.String("192.0.2.1/32"),
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
// $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example '<account_id>/<location_id>'
// ```
//
// Deprecated: cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation
type TeamsLocation struct {
	pulumi.CustomResourceState

	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// True if the location is the default location.
	ClientDefault pulumi.BoolOutput   `pulumi:"clientDefault"`
	CreatedAt     pulumi.StringOutput `pulumi:"createdAt"`
	// The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
	DnsDestinationIpsId pulumi.StringPtrOutput `pulumi:"dnsDestinationIpsId"`
	// The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
	DnsDestinationIpv6BlockId pulumi.StringOutput `pulumi:"dnsDestinationIpv6BlockId"`
	// The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
	DohSubdomain pulumi.StringOutput `pulumi:"dohSubdomain"`
	// True if the location needs to resolve EDNS queries.
	EcsSupport pulumi.BoolOutput `pulumi:"ecsSupport"`
	// The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
	Endpoints TeamsLocationEndpointsPtrOutput `pulumi:"endpoints"`
	// IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
	Ip pulumi.StringOutput `pulumi:"ip"`
	// The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
	Ipv4Destination pulumi.StringOutput `pulumi:"ipv4Destination"`
	// The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
	Ipv4DestinationBackup pulumi.StringOutput `pulumi:"ipv4DestinationBackup"`
	// The name of the location.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
	Networks  TeamsLocationNetworkArrayOutput `pulumi:"networks"`
	UpdatedAt pulumi.StringOutput             `pulumi:"updatedAt"`
}

// NewTeamsLocation registers a new resource with the given unique name, arguments, and options.
func NewTeamsLocation(ctx *pulumi.Context,
	name string, args *TeamsLocationArgs, opts ...pulumi.ResourceOption) (*TeamsLocation, error) {
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
			Type: pulumi.String("cloudflare:index/teamsLocation:TeamsLocation"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TeamsLocation
	err := ctx.RegisterResource("cloudflare:index/teamsLocation:TeamsLocation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsLocation gets an existing TeamsLocation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsLocation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsLocationState, opts ...pulumi.ResourceOption) (*TeamsLocation, error) {
	var resource TeamsLocation
	err := ctx.ReadResource("cloudflare:index/teamsLocation:TeamsLocation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsLocation resources.
type teamsLocationState struct {
	AccountId *string `pulumi:"accountId"`
	// True if the location is the default location.
	ClientDefault *bool   `pulumi:"clientDefault"`
	CreatedAt     *string `pulumi:"createdAt"`
	// The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
	DnsDestinationIpsId *string `pulumi:"dnsDestinationIpsId"`
	// The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
	DnsDestinationIpv6BlockId *string `pulumi:"dnsDestinationIpv6BlockId"`
	// The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
	DohSubdomain *string `pulumi:"dohSubdomain"`
	// True if the location needs to resolve EDNS queries.
	EcsSupport *bool `pulumi:"ecsSupport"`
	// The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
	Endpoints *TeamsLocationEndpoints `pulumi:"endpoints"`
	// IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
	Ip *string `pulumi:"ip"`
	// The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
	Ipv4Destination *string `pulumi:"ipv4Destination"`
	// The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
	Ipv4DestinationBackup *string `pulumi:"ipv4DestinationBackup"`
	// The name of the location.
	Name *string `pulumi:"name"`
	// A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
	Networks  []TeamsLocationNetwork `pulumi:"networks"`
	UpdatedAt *string                `pulumi:"updatedAt"`
}

type TeamsLocationState struct {
	AccountId pulumi.StringPtrInput
	// True if the location is the default location.
	ClientDefault pulumi.BoolPtrInput
	CreatedAt     pulumi.StringPtrInput
	// The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
	DnsDestinationIpsId pulumi.StringPtrInput
	// The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
	DnsDestinationIpv6BlockId pulumi.StringPtrInput
	// The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
	DohSubdomain pulumi.StringPtrInput
	// True if the location needs to resolve EDNS queries.
	EcsSupport pulumi.BoolPtrInput
	// The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
	Endpoints TeamsLocationEndpointsPtrInput
	// IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
	Ip pulumi.StringPtrInput
	// The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
	Ipv4Destination pulumi.StringPtrInput
	// The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
	Ipv4DestinationBackup pulumi.StringPtrInput
	// The name of the location.
	Name pulumi.StringPtrInput
	// A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
	Networks  TeamsLocationNetworkArrayInput
	UpdatedAt pulumi.StringPtrInput
}

func (TeamsLocationState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsLocationState)(nil)).Elem()
}

type teamsLocationArgs struct {
	AccountId string `pulumi:"accountId"`
	// True if the location is the default location.
	ClientDefault *bool `pulumi:"clientDefault"`
	// The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
	DnsDestinationIpsId *string `pulumi:"dnsDestinationIpsId"`
	// True if the location needs to resolve EDNS queries.
	EcsSupport *bool `pulumi:"ecsSupport"`
	// The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
	Endpoints *TeamsLocationEndpoints `pulumi:"endpoints"`
	// The name of the location.
	Name string `pulumi:"name"`
	// A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
	Networks []TeamsLocationNetwork `pulumi:"networks"`
}

// The set of arguments for constructing a TeamsLocation resource.
type TeamsLocationArgs struct {
	AccountId pulumi.StringInput
	// True if the location is the default location.
	ClientDefault pulumi.BoolPtrInput
	// The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
	DnsDestinationIpsId pulumi.StringPtrInput
	// True if the location needs to resolve EDNS queries.
	EcsSupport pulumi.BoolPtrInput
	// The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
	Endpoints TeamsLocationEndpointsPtrInput
	// The name of the location.
	Name pulumi.StringInput
	// A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
	Networks TeamsLocationNetworkArrayInput
}

func (TeamsLocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsLocationArgs)(nil)).Elem()
}

type TeamsLocationInput interface {
	pulumi.Input

	ToTeamsLocationOutput() TeamsLocationOutput
	ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput
}

func (*TeamsLocation) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsLocation)(nil)).Elem()
}

func (i *TeamsLocation) ToTeamsLocationOutput() TeamsLocationOutput {
	return i.ToTeamsLocationOutputWithContext(context.Background())
}

func (i *TeamsLocation) ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationOutput)
}

// TeamsLocationArrayInput is an input type that accepts TeamsLocationArray and TeamsLocationArrayOutput values.
// You can construct a concrete instance of `TeamsLocationArrayInput` via:
//
//	TeamsLocationArray{ TeamsLocationArgs{...} }
type TeamsLocationArrayInput interface {
	pulumi.Input

	ToTeamsLocationArrayOutput() TeamsLocationArrayOutput
	ToTeamsLocationArrayOutputWithContext(context.Context) TeamsLocationArrayOutput
}

type TeamsLocationArray []TeamsLocationInput

func (TeamsLocationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsLocation)(nil)).Elem()
}

func (i TeamsLocationArray) ToTeamsLocationArrayOutput() TeamsLocationArrayOutput {
	return i.ToTeamsLocationArrayOutputWithContext(context.Background())
}

func (i TeamsLocationArray) ToTeamsLocationArrayOutputWithContext(ctx context.Context) TeamsLocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationArrayOutput)
}

// TeamsLocationMapInput is an input type that accepts TeamsLocationMap and TeamsLocationMapOutput values.
// You can construct a concrete instance of `TeamsLocationMapInput` via:
//
//	TeamsLocationMap{ "key": TeamsLocationArgs{...} }
type TeamsLocationMapInput interface {
	pulumi.Input

	ToTeamsLocationMapOutput() TeamsLocationMapOutput
	ToTeamsLocationMapOutputWithContext(context.Context) TeamsLocationMapOutput
}

type TeamsLocationMap map[string]TeamsLocationInput

func (TeamsLocationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsLocation)(nil)).Elem()
}

func (i TeamsLocationMap) ToTeamsLocationMapOutput() TeamsLocationMapOutput {
	return i.ToTeamsLocationMapOutputWithContext(context.Background())
}

func (i TeamsLocationMap) ToTeamsLocationMapOutputWithContext(ctx context.Context) TeamsLocationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationMapOutput)
}

type TeamsLocationOutput struct{ *pulumi.OutputState }

func (TeamsLocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsLocation)(nil)).Elem()
}

func (o TeamsLocationOutput) ToTeamsLocationOutput() TeamsLocationOutput {
	return o
}

func (o TeamsLocationOutput) ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput {
	return o
}

func (o TeamsLocationOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// True if the location is the default location.
func (o TeamsLocationOutput) ClientDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.BoolOutput { return v.ClientDefault }).(pulumi.BoolOutput)
}

func (o TeamsLocationOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
func (o TeamsLocationOutput) DnsDestinationIpsId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringPtrOutput { return v.DnsDestinationIpsId }).(pulumi.StringPtrOutput)
}

// The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
func (o TeamsLocationOutput) DnsDestinationIpv6BlockId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.DnsDestinationIpv6BlockId }).(pulumi.StringOutput)
}

// The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
func (o TeamsLocationOutput) DohSubdomain() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.DohSubdomain }).(pulumi.StringOutput)
}

// True if the location needs to resolve EDNS queries.
func (o TeamsLocationOutput) EcsSupport() pulumi.BoolOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.BoolOutput { return v.EcsSupport }).(pulumi.BoolOutput)
}

// The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
func (o TeamsLocationOutput) Endpoints() TeamsLocationEndpointsPtrOutput {
	return o.ApplyT(func(v *TeamsLocation) TeamsLocationEndpointsPtrOutput { return v.Endpoints }).(TeamsLocationEndpointsPtrOutput)
}

// IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
func (o TeamsLocationOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

// The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
func (o TeamsLocationOutput) Ipv4Destination() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.Ipv4Destination }).(pulumi.StringOutput)
}

// The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
func (o TeamsLocationOutput) Ipv4DestinationBackup() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.Ipv4DestinationBackup }).(pulumi.StringOutput)
}

// The name of the location.
func (o TeamsLocationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
func (o TeamsLocationOutput) Networks() TeamsLocationNetworkArrayOutput {
	return o.ApplyT(func(v *TeamsLocation) TeamsLocationNetworkArrayOutput { return v.Networks }).(TeamsLocationNetworkArrayOutput)
}

func (o TeamsLocationOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type TeamsLocationArrayOutput struct{ *pulumi.OutputState }

func (TeamsLocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsLocation)(nil)).Elem()
}

func (o TeamsLocationArrayOutput) ToTeamsLocationArrayOutput() TeamsLocationArrayOutput {
	return o
}

func (o TeamsLocationArrayOutput) ToTeamsLocationArrayOutputWithContext(ctx context.Context) TeamsLocationArrayOutput {
	return o
}

func (o TeamsLocationArrayOutput) Index(i pulumi.IntInput) TeamsLocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamsLocation {
		return vs[0].([]*TeamsLocation)[vs[1].(int)]
	}).(TeamsLocationOutput)
}

type TeamsLocationMapOutput struct{ *pulumi.OutputState }

func (TeamsLocationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsLocation)(nil)).Elem()
}

func (o TeamsLocationMapOutput) ToTeamsLocationMapOutput() TeamsLocationMapOutput {
	return o
}

func (o TeamsLocationMapOutput) ToTeamsLocationMapOutputWithContext(ctx context.Context) TeamsLocationMapOutput {
	return o
}

func (o TeamsLocationMapOutput) MapIndex(k pulumi.StringInput) TeamsLocationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamsLocation {
		return vs[0].(map[string]*TeamsLocation)[vs[1].(string)]
	}).(TeamsLocationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsLocationInput)(nil)).Elem(), &TeamsLocation{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsLocationArrayInput)(nil)).Elem(), TeamsLocationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsLocationMapInput)(nil)).Elem(), TeamsLocationMap{})
	pulumi.RegisterOutputType(TeamsLocationOutput{})
	pulumi.RegisterOutputType(TeamsLocationArrayOutput{})
	pulumi.RegisterOutputType(TeamsLocationMapOutput{})
}
