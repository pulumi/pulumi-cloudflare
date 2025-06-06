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
//			_, err := cloudflare.LookupMagicNetworkMonitoringRules(ctx, &cloudflare.LookupMagicNetworkMonitoringRulesArgs{
//				AccountId: "6f91088a406011ed95aed352566e8d4c",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupMagicNetworkMonitoringRules(ctx *pulumi.Context, args *LookupMagicNetworkMonitoringRulesArgs, opts ...pulumi.InvokeOption) (*LookupMagicNetworkMonitoringRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMagicNetworkMonitoringRulesResult
	err := ctx.Invoke("cloudflare:index/getMagicNetworkMonitoringRules:getMagicNetworkMonitoringRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMagicNetworkMonitoringRules.
type LookupMagicNetworkMonitoringRulesArgs struct {
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
}

// A collection of values returned by getMagicNetworkMonitoringRules.
type LookupMagicNetworkMonitoringRulesResult struct {
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetMagicNetworkMonitoringRulesResult `pulumi:"results"`
}

func LookupMagicNetworkMonitoringRulesOutput(ctx *pulumi.Context, args LookupMagicNetworkMonitoringRulesOutputArgs, opts ...pulumi.InvokeOption) LookupMagicNetworkMonitoringRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupMagicNetworkMonitoringRulesResultOutput, error) {
			args := v.(LookupMagicNetworkMonitoringRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getMagicNetworkMonitoringRules:getMagicNetworkMonitoringRules", args, LookupMagicNetworkMonitoringRulesResultOutput{}, options).(LookupMagicNetworkMonitoringRulesResultOutput), nil
		}).(LookupMagicNetworkMonitoringRulesResultOutput)
}

// A collection of arguments for invoking getMagicNetworkMonitoringRules.
type LookupMagicNetworkMonitoringRulesOutputArgs struct {
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
}

func (LookupMagicNetworkMonitoringRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMagicNetworkMonitoringRulesArgs)(nil)).Elem()
}

// A collection of values returned by getMagicNetworkMonitoringRules.
type LookupMagicNetworkMonitoringRulesResultOutput struct{ *pulumi.OutputState }

func (LookupMagicNetworkMonitoringRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMagicNetworkMonitoringRulesResult)(nil)).Elem()
}

func (o LookupMagicNetworkMonitoringRulesResultOutput) ToLookupMagicNetworkMonitoringRulesResultOutput() LookupMagicNetworkMonitoringRulesResultOutput {
	return o
}

func (o LookupMagicNetworkMonitoringRulesResultOutput) ToLookupMagicNetworkMonitoringRulesResultOutputWithContext(ctx context.Context) LookupMagicNetworkMonitoringRulesResultOutput {
	return o
}

func (o LookupMagicNetworkMonitoringRulesResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMagicNetworkMonitoringRulesResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMagicNetworkMonitoringRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMagicNetworkMonitoringRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupMagicNetworkMonitoringRulesResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupMagicNetworkMonitoringRulesResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupMagicNetworkMonitoringRulesResultOutput) Results() GetMagicNetworkMonitoringRulesResultArrayOutput {
	return o.ApplyT(func(v LookupMagicNetworkMonitoringRulesResult) []GetMagicNetworkMonitoringRulesResult {
		return v.Results
	}).(GetMagicNetworkMonitoringRulesResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMagicNetworkMonitoringRulesResultOutput{})
}
