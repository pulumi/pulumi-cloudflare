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
//			_, err := cloudflare.LookupLoadBalancerMonitors(ctx, &cloudflare.LookupLoadBalancerMonitorsArgs{
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
func LookupLoadBalancerMonitors(ctx *pulumi.Context, args *LookupLoadBalancerMonitorsArgs, opts ...pulumi.InvokeOption) (*LookupLoadBalancerMonitorsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLoadBalancerMonitorsResult
	err := ctx.Invoke("cloudflare:index/getLoadBalancerMonitors:getLoadBalancerMonitors", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancerMonitors.
type LookupLoadBalancerMonitorsArgs struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
}

// A collection of values returned by getLoadBalancerMonitors.
type LookupLoadBalancerMonitorsResult struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetLoadBalancerMonitorsResult `pulumi:"results"`
}

func LookupLoadBalancerMonitorsOutput(ctx *pulumi.Context, args LookupLoadBalancerMonitorsOutputArgs, opts ...pulumi.InvokeOption) LookupLoadBalancerMonitorsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupLoadBalancerMonitorsResultOutput, error) {
			args := v.(LookupLoadBalancerMonitorsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getLoadBalancerMonitors:getLoadBalancerMonitors", args, LookupLoadBalancerMonitorsResultOutput{}, options).(LookupLoadBalancerMonitorsResultOutput), nil
		}).(LookupLoadBalancerMonitorsResultOutput)
}

// A collection of arguments for invoking getLoadBalancerMonitors.
type LookupLoadBalancerMonitorsOutputArgs struct {
	// Identifier
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
}

func (LookupLoadBalancerMonitorsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerMonitorsArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancerMonitors.
type LookupLoadBalancerMonitorsResultOutput struct{ *pulumi.OutputState }

func (LookupLoadBalancerMonitorsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerMonitorsResult)(nil)).Elem()
}

func (o LookupLoadBalancerMonitorsResultOutput) ToLookupLoadBalancerMonitorsResultOutput() LookupLoadBalancerMonitorsResultOutput {
	return o
}

func (o LookupLoadBalancerMonitorsResultOutput) ToLookupLoadBalancerMonitorsResultOutputWithContext(ctx context.Context) LookupLoadBalancerMonitorsResultOutput {
	return o
}

// Identifier
func (o LookupLoadBalancerMonitorsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerMonitorsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLoadBalancerMonitorsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerMonitorsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupLoadBalancerMonitorsResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancerMonitorsResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupLoadBalancerMonitorsResultOutput) Results() GetLoadBalancerMonitorsResultArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerMonitorsResult) []GetLoadBalancerMonitorsResult { return v.Results }).(GetLoadBalancerMonitorsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoadBalancerMonitorsResultOutput{})
}
