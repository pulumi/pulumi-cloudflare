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
//			_, err := cloudflare.LookupWebAnalyticsSites(ctx, &cloudflare.LookupWebAnalyticsSitesArgs{
//				AccountId: "023e105f4ecef8ad9ca31a8372d0c353",
//				OrderBy:   pulumi.StringRef("host"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupWebAnalyticsSites(ctx *pulumi.Context, args *LookupWebAnalyticsSitesArgs, opts ...pulumi.InvokeOption) (*LookupWebAnalyticsSitesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWebAnalyticsSitesResult
	err := ctx.Invoke("cloudflare:index/getWebAnalyticsSites:getWebAnalyticsSites", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWebAnalyticsSites.
type LookupWebAnalyticsSitesArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The property used to sort the list of results.
	// Available values: "host", "created".
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getWebAnalyticsSites.
type LookupWebAnalyticsSitesResult struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The property used to sort the list of results.
	// Available values: "host", "created".
	OrderBy *string `pulumi:"orderBy"`
	// The items returned by the data source
	Results []GetWebAnalyticsSitesResult `pulumi:"results"`
}

func LookupWebAnalyticsSitesOutput(ctx *pulumi.Context, args LookupWebAnalyticsSitesOutputArgs, opts ...pulumi.InvokeOption) LookupWebAnalyticsSitesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupWebAnalyticsSitesResultOutput, error) {
			args := v.(LookupWebAnalyticsSitesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getWebAnalyticsSites:getWebAnalyticsSites", args, LookupWebAnalyticsSitesResultOutput{}, options).(LookupWebAnalyticsSitesResultOutput), nil
		}).(LookupWebAnalyticsSitesResultOutput)
}

// A collection of arguments for invoking getWebAnalyticsSites.
type LookupWebAnalyticsSitesOutputArgs struct {
	// Identifier.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	// The property used to sort the list of results.
	// Available values: "host", "created".
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (LookupWebAnalyticsSitesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWebAnalyticsSitesArgs)(nil)).Elem()
}

// A collection of values returned by getWebAnalyticsSites.
type LookupWebAnalyticsSitesResultOutput struct{ *pulumi.OutputState }

func (LookupWebAnalyticsSitesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWebAnalyticsSitesResult)(nil)).Elem()
}

func (o LookupWebAnalyticsSitesResultOutput) ToLookupWebAnalyticsSitesResultOutput() LookupWebAnalyticsSitesResultOutput {
	return o
}

func (o LookupWebAnalyticsSitesResultOutput) ToLookupWebAnalyticsSitesResultOutputWithContext(ctx context.Context) LookupWebAnalyticsSitesResultOutput {
	return o
}

// Identifier.
func (o LookupWebAnalyticsSitesResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAnalyticsSitesResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWebAnalyticsSitesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWebAnalyticsSitesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupWebAnalyticsSitesResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupWebAnalyticsSitesResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The property used to sort the list of results.
// Available values: "host", "created".
func (o LookupWebAnalyticsSitesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupWebAnalyticsSitesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

// The items returned by the data source
func (o LookupWebAnalyticsSitesResultOutput) Results() GetWebAnalyticsSitesResultArrayOutput {
	return o.ApplyT(func(v LookupWebAnalyticsSitesResult) []GetWebAnalyticsSitesResult { return v.Results }).(GetWebAnalyticsSitesResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWebAnalyticsSitesResultOutput{})
}
