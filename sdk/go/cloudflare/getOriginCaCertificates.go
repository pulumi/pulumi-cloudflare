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
//			_, err := cloudflare.LookupOriginCaCertificates(ctx, &cloudflare.LookupOriginCaCertificatesArgs{
//				ZoneId: "023e105f4ecef8ad9ca31a8372d0c353",
//				Limit:  pulumi.IntRef(10),
//				Offset: pulumi.IntRef(10),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupOriginCaCertificates(ctx *pulumi.Context, args *LookupOriginCaCertificatesArgs, opts ...pulumi.InvokeOption) (*LookupOriginCaCertificatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOriginCaCertificatesResult
	err := ctx.Invoke("cloudflare:index/getOriginCaCertificates:getOriginCaCertificates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOriginCaCertificates.
type LookupOriginCaCertificatesArgs struct {
	// Limit to the number of records returned.
	Limit *int `pulumi:"limit"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Offset the results
	Offset *int `pulumi:"offset"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getOriginCaCertificates.
type LookupOriginCaCertificatesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Limit to the number of records returned.
	Limit *int `pulumi:"limit"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Offset the results
	Offset *int `pulumi:"offset"`
	// The items returned by the data source
	Results []GetOriginCaCertificatesResult `pulumi:"results"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

func LookupOriginCaCertificatesOutput(ctx *pulumi.Context, args LookupOriginCaCertificatesOutputArgs, opts ...pulumi.InvokeOption) LookupOriginCaCertificatesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupOriginCaCertificatesResultOutput, error) {
			args := v.(LookupOriginCaCertificatesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getOriginCaCertificates:getOriginCaCertificates", args, LookupOriginCaCertificatesResultOutput{}, options).(LookupOriginCaCertificatesResultOutput), nil
		}).(LookupOriginCaCertificatesResultOutput)
}

// A collection of arguments for invoking getOriginCaCertificates.
type LookupOriginCaCertificatesOutputArgs struct {
	// Limit to the number of records returned.
	Limit pulumi.IntPtrInput `pulumi:"limit"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	// Offset the results
	Offset pulumi.IntPtrInput `pulumi:"offset"`
	// Identifier.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupOriginCaCertificatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOriginCaCertificatesArgs)(nil)).Elem()
}

// A collection of values returned by getOriginCaCertificates.
type LookupOriginCaCertificatesResultOutput struct{ *pulumi.OutputState }

func (LookupOriginCaCertificatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOriginCaCertificatesResult)(nil)).Elem()
}

func (o LookupOriginCaCertificatesResultOutput) ToLookupOriginCaCertificatesResultOutput() LookupOriginCaCertificatesResultOutput {
	return o
}

func (o LookupOriginCaCertificatesResultOutput) ToLookupOriginCaCertificatesResultOutputWithContext(ctx context.Context) LookupOriginCaCertificatesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOriginCaCertificatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOriginCaCertificatesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Limit to the number of records returned.
func (o LookupOriginCaCertificatesResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupOriginCaCertificatesResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

// Max items to fetch, default: 1000
func (o LookupOriginCaCertificatesResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupOriginCaCertificatesResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// Offset the results
func (o LookupOriginCaCertificatesResultOutput) Offset() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupOriginCaCertificatesResult) *int { return v.Offset }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupOriginCaCertificatesResultOutput) Results() GetOriginCaCertificatesResultArrayOutput {
	return o.ApplyT(func(v LookupOriginCaCertificatesResult) []GetOriginCaCertificatesResult { return v.Results }).(GetOriginCaCertificatesResultArrayOutput)
}

// Identifier.
func (o LookupOriginCaCertificatesResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOriginCaCertificatesResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOriginCaCertificatesResultOutput{})
}
