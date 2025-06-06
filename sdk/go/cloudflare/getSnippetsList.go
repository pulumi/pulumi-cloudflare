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
//			_, err := cloudflare.LookupSnippetsList(ctx, &cloudflare.LookupSnippetsListArgs{
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
func LookupSnippetsList(ctx *pulumi.Context, args *LookupSnippetsListArgs, opts ...pulumi.InvokeOption) (*LookupSnippetsListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSnippetsListResult
	err := ctx.Invoke("cloudflare:index/getSnippetsList:getSnippetsList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnippetsList.
type LookupSnippetsListArgs struct {
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Identifier
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getSnippetsList.
type LookupSnippetsListResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetSnippetsListResult `pulumi:"results"`
	// Identifier
	ZoneId string `pulumi:"zoneId"`
}

func LookupSnippetsListOutput(ctx *pulumi.Context, args LookupSnippetsListOutputArgs, opts ...pulumi.InvokeOption) LookupSnippetsListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSnippetsListResultOutput, error) {
			args := v.(LookupSnippetsListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getSnippetsList:getSnippetsList", args, LookupSnippetsListResultOutput{}, options).(LookupSnippetsListResultOutput), nil
		}).(LookupSnippetsListResultOutput)
}

// A collection of arguments for invoking getSnippetsList.
type LookupSnippetsListOutputArgs struct {
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	// Identifier
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupSnippetsListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnippetsListArgs)(nil)).Elem()
}

// A collection of values returned by getSnippetsList.
type LookupSnippetsListResultOutput struct{ *pulumi.OutputState }

func (LookupSnippetsListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnippetsListResult)(nil)).Elem()
}

func (o LookupSnippetsListResultOutput) ToLookupSnippetsListResultOutput() LookupSnippetsListResultOutput {
	return o
}

func (o LookupSnippetsListResultOutput) ToLookupSnippetsListResultOutputWithContext(ctx context.Context) LookupSnippetsListResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSnippetsListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetsListResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupSnippetsListResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupSnippetsListResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupSnippetsListResultOutput) Results() GetSnippetsListResultArrayOutput {
	return o.ApplyT(func(v LookupSnippetsListResult) []GetSnippetsListResult { return v.Results }).(GetSnippetsListResultArrayOutput)
}

// Identifier
func (o LookupSnippetsListResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetsListResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSnippetsListResultOutput{})
}
