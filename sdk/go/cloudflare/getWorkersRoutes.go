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
//			_, err := cloudflare.LookupWorkersRoutes(ctx, &cloudflare.LookupWorkersRoutesArgs{
//				ZoneId: "023e105f4ecef8ad9ca31a8372d0c353",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupWorkersRoutes(ctx *pulumi.Context, args *LookupWorkersRoutesArgs, opts ...pulumi.InvokeOption) (*LookupWorkersRoutesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWorkersRoutesResult
	err := ctx.Invoke("cloudflare:index/getWorkersRoutes:getWorkersRoutes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWorkersRoutes.
type LookupWorkersRoutesArgs struct {
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getWorkersRoutes.
type LookupWorkersRoutesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetWorkersRoutesResult `pulumi:"results"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

func LookupWorkersRoutesOutput(ctx *pulumi.Context, args LookupWorkersRoutesOutputArgs, opts ...pulumi.InvokeOption) LookupWorkersRoutesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupWorkersRoutesResultOutput, error) {
			args := v.(LookupWorkersRoutesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getWorkersRoutes:getWorkersRoutes", args, LookupWorkersRoutesResultOutput{}, options).(LookupWorkersRoutesResultOutput), nil
		}).(LookupWorkersRoutesResultOutput)
}

// A collection of arguments for invoking getWorkersRoutes.
type LookupWorkersRoutesOutputArgs struct {
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	// Identifier.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupWorkersRoutesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkersRoutesArgs)(nil)).Elem()
}

// A collection of values returned by getWorkersRoutes.
type LookupWorkersRoutesResultOutput struct{ *pulumi.OutputState }

func (LookupWorkersRoutesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkersRoutesResult)(nil)).Elem()
}

func (o LookupWorkersRoutesResultOutput) ToLookupWorkersRoutesResultOutput() LookupWorkersRoutesResultOutput {
	return o
}

func (o LookupWorkersRoutesResultOutput) ToLookupWorkersRoutesResultOutputWithContext(ctx context.Context) LookupWorkersRoutesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWorkersRoutesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersRoutesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupWorkersRoutesResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupWorkersRoutesResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupWorkersRoutesResultOutput) Results() GetWorkersRoutesResultArrayOutput {
	return o.ApplyT(func(v LookupWorkersRoutesResult) []GetWorkersRoutesResult { return v.Results }).(GetWorkersRoutesResultArrayOutput)
}

// Identifier.
func (o LookupWorkersRoutesResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersRoutesResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWorkersRoutesResultOutput{})
}
