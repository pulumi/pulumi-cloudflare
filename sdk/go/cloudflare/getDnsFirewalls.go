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
//			_, err := cloudflare.LookupDnsFirewalls(ctx, &cloudflare.LookupDnsFirewallsArgs{
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
func LookupDnsFirewalls(ctx *pulumi.Context, args *LookupDnsFirewallsArgs, opts ...pulumi.InvokeOption) (*LookupDnsFirewallsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDnsFirewallsResult
	err := ctx.Invoke("cloudflare:index/getDnsFirewalls:getDnsFirewalls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDnsFirewalls.
type LookupDnsFirewallsArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
}

// A collection of values returned by getDnsFirewalls.
type LookupDnsFirewallsResult struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetDnsFirewallsResult `pulumi:"results"`
}

func LookupDnsFirewallsOutput(ctx *pulumi.Context, args LookupDnsFirewallsOutputArgs, opts ...pulumi.InvokeOption) LookupDnsFirewallsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDnsFirewallsResultOutput, error) {
			args := v.(LookupDnsFirewallsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getDnsFirewalls:getDnsFirewalls", args, LookupDnsFirewallsResultOutput{}, options).(LookupDnsFirewallsResultOutput), nil
		}).(LookupDnsFirewallsResultOutput)
}

// A collection of arguments for invoking getDnsFirewalls.
type LookupDnsFirewallsOutputArgs struct {
	// Identifier.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
}

func (LookupDnsFirewallsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDnsFirewallsArgs)(nil)).Elem()
}

// A collection of values returned by getDnsFirewalls.
type LookupDnsFirewallsResultOutput struct{ *pulumi.OutputState }

func (LookupDnsFirewallsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDnsFirewallsResult)(nil)).Elem()
}

func (o LookupDnsFirewallsResultOutput) ToLookupDnsFirewallsResultOutput() LookupDnsFirewallsResultOutput {
	return o
}

func (o LookupDnsFirewallsResultOutput) ToLookupDnsFirewallsResultOutputWithContext(ctx context.Context) LookupDnsFirewallsResultOutput {
	return o
}

// Identifier.
func (o LookupDnsFirewallsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsFirewallsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDnsFirewallsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsFirewallsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupDnsFirewallsResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDnsFirewallsResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupDnsFirewallsResultOutput) Results() GetDnsFirewallsResultArrayOutput {
	return o.ApplyT(func(v LookupDnsFirewallsResult) []GetDnsFirewallsResult { return v.Results }).(GetDnsFirewallsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDnsFirewallsResultOutput{})
}
