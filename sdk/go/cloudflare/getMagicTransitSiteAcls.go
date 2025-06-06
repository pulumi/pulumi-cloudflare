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
//			_, err := cloudflare.LookupMagicTransitSiteAcls(ctx, &cloudflare.LookupMagicTransitSiteAclsArgs{
//				AccountId: "023e105f4ecef8ad9ca31a8372d0c353",
//				SiteId:    "023e105f4ecef8ad9ca31a8372d0c353",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupMagicTransitSiteAcls(ctx *pulumi.Context, args *LookupMagicTransitSiteAclsArgs, opts ...pulumi.InvokeOption) (*LookupMagicTransitSiteAclsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMagicTransitSiteAclsResult
	err := ctx.Invoke("cloudflare:index/getMagicTransitSiteAcls:getMagicTransitSiteAcls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMagicTransitSiteAcls.
type LookupMagicTransitSiteAclsArgs struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Identifier
	SiteId string `pulumi:"siteId"`
}

// A collection of values returned by getMagicTransitSiteAcls.
type LookupMagicTransitSiteAclsResult struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetMagicTransitSiteAclsResult `pulumi:"results"`
	// Identifier
	SiteId string `pulumi:"siteId"`
}

func LookupMagicTransitSiteAclsOutput(ctx *pulumi.Context, args LookupMagicTransitSiteAclsOutputArgs, opts ...pulumi.InvokeOption) LookupMagicTransitSiteAclsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupMagicTransitSiteAclsResultOutput, error) {
			args := v.(LookupMagicTransitSiteAclsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getMagicTransitSiteAcls:getMagicTransitSiteAcls", args, LookupMagicTransitSiteAclsResultOutput{}, options).(LookupMagicTransitSiteAclsResultOutput), nil
		}).(LookupMagicTransitSiteAclsResultOutput)
}

// A collection of arguments for invoking getMagicTransitSiteAcls.
type LookupMagicTransitSiteAclsOutputArgs struct {
	// Identifier
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	// Identifier
	SiteId pulumi.StringInput `pulumi:"siteId"`
}

func (LookupMagicTransitSiteAclsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMagicTransitSiteAclsArgs)(nil)).Elem()
}

// A collection of values returned by getMagicTransitSiteAcls.
type LookupMagicTransitSiteAclsResultOutput struct{ *pulumi.OutputState }

func (LookupMagicTransitSiteAclsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMagicTransitSiteAclsResult)(nil)).Elem()
}

func (o LookupMagicTransitSiteAclsResultOutput) ToLookupMagicTransitSiteAclsResultOutput() LookupMagicTransitSiteAclsResultOutput {
	return o
}

func (o LookupMagicTransitSiteAclsResultOutput) ToLookupMagicTransitSiteAclsResultOutputWithContext(ctx context.Context) LookupMagicTransitSiteAclsResultOutput {
	return o
}

// Identifier
func (o LookupMagicTransitSiteAclsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMagicTransitSiteAclsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMagicTransitSiteAclsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMagicTransitSiteAclsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupMagicTransitSiteAclsResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupMagicTransitSiteAclsResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupMagicTransitSiteAclsResultOutput) Results() GetMagicTransitSiteAclsResultArrayOutput {
	return o.ApplyT(func(v LookupMagicTransitSiteAclsResult) []GetMagicTransitSiteAclsResult { return v.Results }).(GetMagicTransitSiteAclsResultArrayOutput)
}

// Identifier
func (o LookupMagicTransitSiteAclsResultOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMagicTransitSiteAclsResult) string { return v.SiteId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMagicTransitSiteAclsResultOutput{})
}
