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
// $ pulumi import cloudflare:index/keylessCertificate:KeylessCertificate example '<zone_id>/<keyless_certificate_id>'
// ```
type KeylessCertificate struct {
	pulumi.CustomResourceState

	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
	// Available values: "ubiquitous", "optimal", "force".
	BundleMethod pulumi.StringOutput `pulumi:"bundleMethod"`
	// The zone's SSL certificate or SSL certificate and intermediate(s).
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// When the Keyless SSL was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Whether or not the Keyless SSL is on or off.
	//
	// Deprecated: This attribute is deprecated.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The keyless SSL name.
	Host pulumi.StringOutput `pulumi:"host"`
	// When the Keyless SSL was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The keyless SSL name.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// Available permissions for the Keyless SSL for the current user requesting the item.
	Permissions pulumi.StringArrayOutput `pulumi:"permissions"`
	// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
	Port pulumi.Float64Output `pulumi:"port"`
	// Status of the Keyless SSL.
	// Available values: "active", "deleted".
	Status pulumi.StringOutput `pulumi:"status"`
	// Configuration for using Keyless SSL through a Cloudflare Tunnel
	Tunnel KeylessCertificateTunnelPtrOutput `pulumi:"tunnel"`
	// Identifier.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewKeylessCertificate registers a new resource with the given unique name, arguments, and options.
func NewKeylessCertificate(ctx *pulumi.Context,
	name string, args *KeylessCertificateArgs, opts ...pulumi.ResourceOption) (*KeylessCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KeylessCertificate
	err := ctx.RegisterResource("cloudflare:index/keylessCertificate:KeylessCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKeylessCertificate gets an existing KeylessCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKeylessCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KeylessCertificateState, opts ...pulumi.ResourceOption) (*KeylessCertificate, error) {
	var resource KeylessCertificate
	err := ctx.ReadResource("cloudflare:index/keylessCertificate:KeylessCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KeylessCertificate resources.
type keylessCertificateState struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
	// Available values: "ubiquitous", "optimal", "force".
	BundleMethod *string `pulumi:"bundleMethod"`
	// The zone's SSL certificate or SSL certificate and intermediate(s).
	Certificate *string `pulumi:"certificate"`
	// When the Keyless SSL was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Whether or not the Keyless SSL is on or off.
	//
	// Deprecated: This attribute is deprecated.
	Enabled *bool `pulumi:"enabled"`
	// The keyless SSL name.
	Host *string `pulumi:"host"`
	// When the Keyless SSL was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The keyless SSL name.
	Name *string `pulumi:"name"`
	// Available permissions for the Keyless SSL for the current user requesting the item.
	Permissions []string `pulumi:"permissions"`
	// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
	Port *float64 `pulumi:"port"`
	// Status of the Keyless SSL.
	// Available values: "active", "deleted".
	Status *string `pulumi:"status"`
	// Configuration for using Keyless SSL through a Cloudflare Tunnel
	Tunnel *KeylessCertificateTunnel `pulumi:"tunnel"`
	// Identifier.
	ZoneId *string `pulumi:"zoneId"`
}

type KeylessCertificateState struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
	// Available values: "ubiquitous", "optimal", "force".
	BundleMethod pulumi.StringPtrInput
	// The zone's SSL certificate or SSL certificate and intermediate(s).
	Certificate pulumi.StringPtrInput
	// When the Keyless SSL was created.
	CreatedOn pulumi.StringPtrInput
	// Whether or not the Keyless SSL is on or off.
	//
	// Deprecated: This attribute is deprecated.
	Enabled pulumi.BoolPtrInput
	// The keyless SSL name.
	Host pulumi.StringPtrInput
	// When the Keyless SSL was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The keyless SSL name.
	Name pulumi.StringPtrInput
	// Available permissions for the Keyless SSL for the current user requesting the item.
	Permissions pulumi.StringArrayInput
	// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
	Port pulumi.Float64PtrInput
	// Status of the Keyless SSL.
	// Available values: "active", "deleted".
	Status pulumi.StringPtrInput
	// Configuration for using Keyless SSL through a Cloudflare Tunnel
	Tunnel KeylessCertificateTunnelPtrInput
	// Identifier.
	ZoneId pulumi.StringPtrInput
}

func (KeylessCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*keylessCertificateState)(nil)).Elem()
}

type keylessCertificateArgs struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
	// Available values: "ubiquitous", "optimal", "force".
	BundleMethod *string `pulumi:"bundleMethod"`
	// The zone's SSL certificate or SSL certificate and intermediate(s).
	Certificate string `pulumi:"certificate"`
	// Whether or not the Keyless SSL is on or off.
	//
	// Deprecated: This attribute is deprecated.
	Enabled *bool `pulumi:"enabled"`
	// The keyless SSL name.
	Host string `pulumi:"host"`
	// The keyless SSL name.
	Name *string `pulumi:"name"`
	// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
	Port *float64 `pulumi:"port"`
	// Configuration for using Keyless SSL through a Cloudflare Tunnel
	Tunnel *KeylessCertificateTunnel `pulumi:"tunnel"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a KeylessCertificate resource.
type KeylessCertificateArgs struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
	// Available values: "ubiquitous", "optimal", "force".
	BundleMethod pulumi.StringPtrInput
	// The zone's SSL certificate or SSL certificate and intermediate(s).
	Certificate pulumi.StringInput
	// Whether or not the Keyless SSL is on or off.
	//
	// Deprecated: This attribute is deprecated.
	Enabled pulumi.BoolPtrInput
	// The keyless SSL name.
	Host pulumi.StringInput
	// The keyless SSL name.
	Name pulumi.StringPtrInput
	// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
	Port pulumi.Float64PtrInput
	// Configuration for using Keyless SSL through a Cloudflare Tunnel
	Tunnel KeylessCertificateTunnelPtrInput
	// Identifier.
	ZoneId pulumi.StringInput
}

func (KeylessCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*keylessCertificateArgs)(nil)).Elem()
}

type KeylessCertificateInput interface {
	pulumi.Input

	ToKeylessCertificateOutput() KeylessCertificateOutput
	ToKeylessCertificateOutputWithContext(ctx context.Context) KeylessCertificateOutput
}

func (*KeylessCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**KeylessCertificate)(nil)).Elem()
}

func (i *KeylessCertificate) ToKeylessCertificateOutput() KeylessCertificateOutput {
	return i.ToKeylessCertificateOutputWithContext(context.Background())
}

func (i *KeylessCertificate) ToKeylessCertificateOutputWithContext(ctx context.Context) KeylessCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeylessCertificateOutput)
}

// KeylessCertificateArrayInput is an input type that accepts KeylessCertificateArray and KeylessCertificateArrayOutput values.
// You can construct a concrete instance of `KeylessCertificateArrayInput` via:
//
//	KeylessCertificateArray{ KeylessCertificateArgs{...} }
type KeylessCertificateArrayInput interface {
	pulumi.Input

	ToKeylessCertificateArrayOutput() KeylessCertificateArrayOutput
	ToKeylessCertificateArrayOutputWithContext(context.Context) KeylessCertificateArrayOutput
}

type KeylessCertificateArray []KeylessCertificateInput

func (KeylessCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeylessCertificate)(nil)).Elem()
}

func (i KeylessCertificateArray) ToKeylessCertificateArrayOutput() KeylessCertificateArrayOutput {
	return i.ToKeylessCertificateArrayOutputWithContext(context.Background())
}

func (i KeylessCertificateArray) ToKeylessCertificateArrayOutputWithContext(ctx context.Context) KeylessCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeylessCertificateArrayOutput)
}

// KeylessCertificateMapInput is an input type that accepts KeylessCertificateMap and KeylessCertificateMapOutput values.
// You can construct a concrete instance of `KeylessCertificateMapInput` via:
//
//	KeylessCertificateMap{ "key": KeylessCertificateArgs{...} }
type KeylessCertificateMapInput interface {
	pulumi.Input

	ToKeylessCertificateMapOutput() KeylessCertificateMapOutput
	ToKeylessCertificateMapOutputWithContext(context.Context) KeylessCertificateMapOutput
}

type KeylessCertificateMap map[string]KeylessCertificateInput

func (KeylessCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeylessCertificate)(nil)).Elem()
}

func (i KeylessCertificateMap) ToKeylessCertificateMapOutput() KeylessCertificateMapOutput {
	return i.ToKeylessCertificateMapOutputWithContext(context.Background())
}

func (i KeylessCertificateMap) ToKeylessCertificateMapOutputWithContext(ctx context.Context) KeylessCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeylessCertificateMapOutput)
}

type KeylessCertificateOutput struct{ *pulumi.OutputState }

func (KeylessCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KeylessCertificate)(nil)).Elem()
}

func (o KeylessCertificateOutput) ToKeylessCertificateOutput() KeylessCertificateOutput {
	return o
}

func (o KeylessCertificateOutput) ToKeylessCertificateOutputWithContext(ctx context.Context) KeylessCertificateOutput {
	return o
}

// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
// Available values: "ubiquitous", "optimal", "force".
func (o KeylessCertificateOutput) BundleMethod() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.BundleMethod }).(pulumi.StringOutput)
}

// The zone's SSL certificate or SSL certificate and intermediate(s).
func (o KeylessCertificateOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// When the Keyless SSL was created.
func (o KeylessCertificateOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Whether or not the Keyless SSL is on or off.
//
// Deprecated: This attribute is deprecated.
func (o KeylessCertificateOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The keyless SSL name.
func (o KeylessCertificateOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// When the Keyless SSL was last modified.
func (o KeylessCertificateOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.ModifiedOn }).(pulumi.StringOutput)
}

// The keyless SSL name.
func (o KeylessCertificateOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// Available permissions for the Keyless SSL for the current user requesting the item.
func (o KeylessCertificateOutput) Permissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringArrayOutput { return v.Permissions }).(pulumi.StringArrayOutput)
}

// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
func (o KeylessCertificateOutput) Port() pulumi.Float64Output {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.Float64Output { return v.Port }).(pulumi.Float64Output)
}

// Status of the Keyless SSL.
// Available values: "active", "deleted".
func (o KeylessCertificateOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Configuration for using Keyless SSL through a Cloudflare Tunnel
func (o KeylessCertificateOutput) Tunnel() KeylessCertificateTunnelPtrOutput {
	return o.ApplyT(func(v *KeylessCertificate) KeylessCertificateTunnelPtrOutput { return v.Tunnel }).(KeylessCertificateTunnelPtrOutput)
}

// Identifier.
func (o KeylessCertificateOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type KeylessCertificateArrayOutput struct{ *pulumi.OutputState }

func (KeylessCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeylessCertificate)(nil)).Elem()
}

func (o KeylessCertificateArrayOutput) ToKeylessCertificateArrayOutput() KeylessCertificateArrayOutput {
	return o
}

func (o KeylessCertificateArrayOutput) ToKeylessCertificateArrayOutputWithContext(ctx context.Context) KeylessCertificateArrayOutput {
	return o
}

func (o KeylessCertificateArrayOutput) Index(i pulumi.IntInput) KeylessCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KeylessCertificate {
		return vs[0].([]*KeylessCertificate)[vs[1].(int)]
	}).(KeylessCertificateOutput)
}

type KeylessCertificateMapOutput struct{ *pulumi.OutputState }

func (KeylessCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeylessCertificate)(nil)).Elem()
}

func (o KeylessCertificateMapOutput) ToKeylessCertificateMapOutput() KeylessCertificateMapOutput {
	return o
}

func (o KeylessCertificateMapOutput) ToKeylessCertificateMapOutputWithContext(ctx context.Context) KeylessCertificateMapOutput {
	return o
}

func (o KeylessCertificateMapOutput) MapIndex(k pulumi.StringInput) KeylessCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KeylessCertificate {
		return vs[0].(map[string]*KeylessCertificate)[vs[1].(string)]
	}).(KeylessCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KeylessCertificateInput)(nil)).Elem(), &KeylessCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeylessCertificateArrayInput)(nil)).Elem(), KeylessCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeylessCertificateMapInput)(nil)).Elem(), KeylessCertificateMap{})
	pulumi.RegisterOutputType(KeylessCertificateOutput{})
	pulumi.RegisterOutputType(KeylessCertificateArrayOutput{})
	pulumi.RegisterOutputType(KeylessCertificateMapOutput{})
}
