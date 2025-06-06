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
//			_, err := cloudflare.LookupZeroTrustGatewaySettings(ctx, &cloudflare.LookupZeroTrustGatewaySettingsArgs{
//				AccountId: "699d98642c564d2e855e9661899b7252",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupZeroTrustGatewaySettings(ctx *pulumi.Context, args *LookupZeroTrustGatewaySettingsArgs, opts ...pulumi.InvokeOption) (*LookupZeroTrustGatewaySettingsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupZeroTrustGatewaySettingsResult
	err := ctx.Invoke("cloudflare:index/getZeroTrustGatewaySettings:getZeroTrustGatewaySettings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZeroTrustGatewaySettings.
type LookupZeroTrustGatewaySettingsArgs struct {
	AccountId string `pulumi:"accountId"`
}

// A collection of values returned by getZeroTrustGatewaySettings.
type LookupZeroTrustGatewaySettingsResult struct {
	AccountId string `pulumi:"accountId"`
	CreatedAt string `pulumi:"createdAt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Account settings
	Settings  GetZeroTrustGatewaySettingsSettings `pulumi:"settings"`
	UpdatedAt string                              `pulumi:"updatedAt"`
}

func LookupZeroTrustGatewaySettingsOutput(ctx *pulumi.Context, args LookupZeroTrustGatewaySettingsOutputArgs, opts ...pulumi.InvokeOption) LookupZeroTrustGatewaySettingsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupZeroTrustGatewaySettingsResultOutput, error) {
			args := v.(LookupZeroTrustGatewaySettingsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getZeroTrustGatewaySettings:getZeroTrustGatewaySettings", args, LookupZeroTrustGatewaySettingsResultOutput{}, options).(LookupZeroTrustGatewaySettingsResultOutput), nil
		}).(LookupZeroTrustGatewaySettingsResultOutput)
}

// A collection of arguments for invoking getZeroTrustGatewaySettings.
type LookupZeroTrustGatewaySettingsOutputArgs struct {
	AccountId pulumi.StringInput `pulumi:"accountId"`
}

func (LookupZeroTrustGatewaySettingsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustGatewaySettingsArgs)(nil)).Elem()
}

// A collection of values returned by getZeroTrustGatewaySettings.
type LookupZeroTrustGatewaySettingsResultOutput struct{ *pulumi.OutputState }

func (LookupZeroTrustGatewaySettingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustGatewaySettingsResult)(nil)).Elem()
}

func (o LookupZeroTrustGatewaySettingsResultOutput) ToLookupZeroTrustGatewaySettingsResultOutput() LookupZeroTrustGatewaySettingsResultOutput {
	return o
}

func (o LookupZeroTrustGatewaySettingsResultOutput) ToLookupZeroTrustGatewaySettingsResultOutputWithContext(ctx context.Context) LookupZeroTrustGatewaySettingsResultOutput {
	return o
}

func (o LookupZeroTrustGatewaySettingsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewaySettingsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

func (o LookupZeroTrustGatewaySettingsResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewaySettingsResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupZeroTrustGatewaySettingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewaySettingsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Account settings
func (o LookupZeroTrustGatewaySettingsResultOutput) Settings() GetZeroTrustGatewaySettingsSettingsOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewaySettingsResult) GetZeroTrustGatewaySettingsSettings { return v.Settings }).(GetZeroTrustGatewaySettingsSettingsOutput)
}

func (o LookupZeroTrustGatewaySettingsResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewaySettingsResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZeroTrustGatewaySettingsResultOutput{})
}
