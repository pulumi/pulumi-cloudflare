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
//			_, err := cloudflare.LookupLoadBalancers(ctx, &cloudflare.LookupLoadBalancersArgs{
//				ZoneId: "699d98642c564d2e855e9661899b7252",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupLoadBalancers(ctx *pulumi.Context, args *LookupLoadBalancersArgs, opts ...pulumi.InvokeOption) (*LookupLoadBalancersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLoadBalancersResult
	err := ctx.Invoke("cloudflare:index/getLoadBalancers:getLoadBalancers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancers.
type LookupLoadBalancersArgs struct {
	// Max items to fetch, default: 1000
	MaxItems *int   `pulumi:"maxItems"`
	ZoneId   string `pulumi:"zoneId"`
}

// A collection of values returned by getLoadBalancers.
type LookupLoadBalancersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetLoadBalancersResult `pulumi:"results"`
	ZoneId  string                   `pulumi:"zoneId"`
}

func LookupLoadBalancersOutput(ctx *pulumi.Context, args LookupLoadBalancersOutputArgs, opts ...pulumi.InvokeOption) LookupLoadBalancersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupLoadBalancersResultOutput, error) {
			args := v.(LookupLoadBalancersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getLoadBalancers:getLoadBalancers", args, LookupLoadBalancersResultOutput{}, options).(LookupLoadBalancersResultOutput), nil
		}).(LookupLoadBalancersResultOutput)
}

// A collection of arguments for invoking getLoadBalancers.
type LookupLoadBalancersOutputArgs struct {
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	ZoneId   pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupLoadBalancersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancersArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancers.
type LookupLoadBalancersResultOutput struct{ *pulumi.OutputState }

func (LookupLoadBalancersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancersResult)(nil)).Elem()
}

func (o LookupLoadBalancersResultOutput) ToLookupLoadBalancersResultOutput() LookupLoadBalancersResultOutput {
	return o
}

func (o LookupLoadBalancersResultOutput) ToLookupLoadBalancersResultOutputWithContext(ctx context.Context) LookupLoadBalancersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLoadBalancersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancersResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupLoadBalancersResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancersResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupLoadBalancersResultOutput) Results() GetLoadBalancersResultArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancersResult) []GetLoadBalancersResult { return v.Results }).(GetLoadBalancersResultArrayOutput)
}

func (o LookupLoadBalancersResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancersResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoadBalancersResultOutput{})
}
