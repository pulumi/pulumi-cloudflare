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
//			_, err := cloudflare.LookupRegistrarDomains(ctx, &cloudflare.LookupRegistrarDomainsArgs{
//				AccountId: "023e105f4ecef8ad9ca31a8372d0c353",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRegistrarDomains(ctx *pulumi.Context, args *LookupRegistrarDomainsArgs, opts ...pulumi.InvokeOption) (*LookupRegistrarDomainsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRegistrarDomainsResult
	err := ctx.Invoke("cloudflare:index/getRegistrarDomains:getRegistrarDomains", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegistrarDomains.
type LookupRegistrarDomainsArgs struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
}

// A collection of values returned by getRegistrarDomains.
type LookupRegistrarDomainsResult struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetRegistrarDomainsResult `pulumi:"results"`
}

func LookupRegistrarDomainsOutput(ctx *pulumi.Context, args LookupRegistrarDomainsOutputArgs, opts ...pulumi.InvokeOption) LookupRegistrarDomainsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRegistrarDomainsResultOutput, error) {
			args := v.(LookupRegistrarDomainsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getRegistrarDomains:getRegistrarDomains", args, LookupRegistrarDomainsResultOutput{}, options).(LookupRegistrarDomainsResultOutput), nil
		}).(LookupRegistrarDomainsResultOutput)
}

// A collection of arguments for invoking getRegistrarDomains.
type LookupRegistrarDomainsOutputArgs struct {
	// Identifier
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
}

func (LookupRegistrarDomainsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegistrarDomainsArgs)(nil)).Elem()
}

// A collection of values returned by getRegistrarDomains.
type LookupRegistrarDomainsResultOutput struct{ *pulumi.OutputState }

func (LookupRegistrarDomainsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegistrarDomainsResult)(nil)).Elem()
}

func (o LookupRegistrarDomainsResultOutput) ToLookupRegistrarDomainsResultOutput() LookupRegistrarDomainsResultOutput {
	return o
}

func (o LookupRegistrarDomainsResultOutput) ToLookupRegistrarDomainsResultOutputWithContext(ctx context.Context) LookupRegistrarDomainsResultOutput {
	return o
}

// Identifier
func (o LookupRegistrarDomainsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegistrarDomainsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRegistrarDomainsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegistrarDomainsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupRegistrarDomainsResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupRegistrarDomainsResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupRegistrarDomainsResultOutput) Results() GetRegistrarDomainsResultArrayOutput {
	return o.ApplyT(func(v LookupRegistrarDomainsResult) []GetRegistrarDomainsResult { return v.Results }).(GetRegistrarDomainsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRegistrarDomainsResultOutput{})
}
