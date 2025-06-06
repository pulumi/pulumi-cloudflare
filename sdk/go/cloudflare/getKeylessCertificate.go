// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

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
//			_, err := cloudflare.LookupKeylessCertificate(ctx, &cloudflare.LookupKeylessCertificateArgs{
//				ZoneId:               "023e105f4ecef8ad9ca31a8372d0c353",
//				KeylessCertificateId: pulumi.StringRef("023e105f4ecef8ad9ca31a8372d0c353"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupKeylessCertificate(ctx *pulumi.Context, args *LookupKeylessCertificateArgs, opts ...pulumi.InvokeOption) (*LookupKeylessCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKeylessCertificateResult
	err := ctx.Invoke("cloudflare:index/getKeylessCertificate:getKeylessCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKeylessCertificate.
type LookupKeylessCertificateArgs struct {
	// Identifier.
	KeylessCertificateId *string `pulumi:"keylessCertificateId"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getKeylessCertificate.
type LookupKeylessCertificateResult struct {
	// When the Keyless SSL was created.
	CreatedOn string `pulumi:"createdOn"`
	// Whether or not the Keyless SSL is on or off.
	Enabled bool `pulumi:"enabled"`
	// The keyless SSL name.
	Host string `pulumi:"host"`
	// Identifier.
	Id string `pulumi:"id"`
	// Identifier.
	KeylessCertificateId *string `pulumi:"keylessCertificateId"`
	// When the Keyless SSL was last modified.
	ModifiedOn string `pulumi:"modifiedOn"`
	// The keyless SSL name.
	Name string `pulumi:"name"`
	// Available permissions for the Keyless SSL for the current user requesting the item.
	Permissions []string `pulumi:"permissions"`
	// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
	Port float64 `pulumi:"port"`
	// Status of the Keyless SSL.
	// Available values: "active", "deleted".
	Status string `pulumi:"status"`
	// Configuration for using Keyless SSL through a Cloudflare Tunnel
	Tunnel GetKeylessCertificateTunnel `pulumi:"tunnel"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

func LookupKeylessCertificateOutput(ctx *pulumi.Context, args LookupKeylessCertificateOutputArgs, opts ...pulumi.InvokeOption) LookupKeylessCertificateResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupKeylessCertificateResultOutput, error) {
			args := v.(LookupKeylessCertificateArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getKeylessCertificate:getKeylessCertificate", args, LookupKeylessCertificateResultOutput{}, options).(LookupKeylessCertificateResultOutput), nil
		}).(LookupKeylessCertificateResultOutput)
}

// A collection of arguments for invoking getKeylessCertificate.
type LookupKeylessCertificateOutputArgs struct {
	// Identifier.
	KeylessCertificateId pulumi.StringPtrInput `pulumi:"keylessCertificateId"`
	// Identifier.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupKeylessCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeylessCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getKeylessCertificate.
type LookupKeylessCertificateResultOutput struct{ *pulumi.OutputState }

func (LookupKeylessCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeylessCertificateResult)(nil)).Elem()
}

func (o LookupKeylessCertificateResultOutput) ToLookupKeylessCertificateResultOutput() LookupKeylessCertificateResultOutput {
	return o
}

func (o LookupKeylessCertificateResultOutput) ToLookupKeylessCertificateResultOutputWithContext(ctx context.Context) LookupKeylessCertificateResultOutput {
	return o
}

// When the Keyless SSL was created.
func (o LookupKeylessCertificateResultOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) string { return v.CreatedOn }).(pulumi.StringOutput)
}

// Whether or not the Keyless SSL is on or off.
func (o LookupKeylessCertificateResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The keyless SSL name.
func (o LookupKeylessCertificateResultOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) string { return v.Host }).(pulumi.StringOutput)
}

// Identifier.
func (o LookupKeylessCertificateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier.
func (o LookupKeylessCertificateResultOutput) KeylessCertificateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) *string { return v.KeylessCertificateId }).(pulumi.StringPtrOutput)
}

// When the Keyless SSL was last modified.
func (o LookupKeylessCertificateResultOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) string { return v.ModifiedOn }).(pulumi.StringOutput)
}

// The keyless SSL name.
func (o LookupKeylessCertificateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) string { return v.Name }).(pulumi.StringOutput)
}

// Available permissions for the Keyless SSL for the current user requesting the item.
func (o LookupKeylessCertificateResultOutput) Permissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) []string { return v.Permissions }).(pulumi.StringArrayOutput)
}

// The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
func (o LookupKeylessCertificateResultOutput) Port() pulumi.Float64Output {
	return o.ApplyT(func(v LookupKeylessCertificateResult) float64 { return v.Port }).(pulumi.Float64Output)
}

// Status of the Keyless SSL.
// Available values: "active", "deleted".
func (o LookupKeylessCertificateResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) string { return v.Status }).(pulumi.StringOutput)
}

// Configuration for using Keyless SSL through a Cloudflare Tunnel
func (o LookupKeylessCertificateResultOutput) Tunnel() GetKeylessCertificateTunnelOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) GetKeylessCertificateTunnel { return v.Tunnel }).(GetKeylessCertificateTunnelOutput)
}

// Identifier.
func (o LookupKeylessCertificateResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeylessCertificateResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKeylessCertificateResultOutput{})
}
