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
//			_, err := cloudflare.LookupZeroTrustGatewayLogging(ctx, &cloudflare.LookupZeroTrustGatewayLoggingArgs{
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
func LookupZeroTrustGatewayLogging(ctx *pulumi.Context, args *LookupZeroTrustGatewayLoggingArgs, opts ...pulumi.InvokeOption) (*LookupZeroTrustGatewayLoggingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupZeroTrustGatewayLoggingResult
	err := ctx.Invoke("cloudflare:index/getZeroTrustGatewayLogging:getZeroTrustGatewayLogging", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZeroTrustGatewayLogging.
type LookupZeroTrustGatewayLoggingArgs struct {
	AccountId string `pulumi:"accountId"`
}

// A collection of values returned by getZeroTrustGatewayLogging.
type LookupZeroTrustGatewayLoggingResult struct {
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
	RedactPii bool `pulumi:"redactPii"`
	// Logging settings by rule type.
	SettingsByRuleType GetZeroTrustGatewayLoggingSettingsByRuleType `pulumi:"settingsByRuleType"`
}

func LookupZeroTrustGatewayLoggingOutput(ctx *pulumi.Context, args LookupZeroTrustGatewayLoggingOutputArgs, opts ...pulumi.InvokeOption) LookupZeroTrustGatewayLoggingResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupZeroTrustGatewayLoggingResultOutput, error) {
			args := v.(LookupZeroTrustGatewayLoggingArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getZeroTrustGatewayLogging:getZeroTrustGatewayLogging", args, LookupZeroTrustGatewayLoggingResultOutput{}, options).(LookupZeroTrustGatewayLoggingResultOutput), nil
		}).(LookupZeroTrustGatewayLoggingResultOutput)
}

// A collection of arguments for invoking getZeroTrustGatewayLogging.
type LookupZeroTrustGatewayLoggingOutputArgs struct {
	AccountId pulumi.StringInput `pulumi:"accountId"`
}

func (LookupZeroTrustGatewayLoggingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustGatewayLoggingArgs)(nil)).Elem()
}

// A collection of values returned by getZeroTrustGatewayLogging.
type LookupZeroTrustGatewayLoggingResultOutput struct{ *pulumi.OutputState }

func (LookupZeroTrustGatewayLoggingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustGatewayLoggingResult)(nil)).Elem()
}

func (o LookupZeroTrustGatewayLoggingResultOutput) ToLookupZeroTrustGatewayLoggingResultOutput() LookupZeroTrustGatewayLoggingResultOutput {
	return o
}

func (o LookupZeroTrustGatewayLoggingResultOutput) ToLookupZeroTrustGatewayLoggingResultOutputWithContext(ctx context.Context) LookupZeroTrustGatewayLoggingResultOutput {
	return o
}

func (o LookupZeroTrustGatewayLoggingResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewayLoggingResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupZeroTrustGatewayLoggingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewayLoggingResult) string { return v.Id }).(pulumi.StringOutput)
}

// Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
func (o LookupZeroTrustGatewayLoggingResultOutput) RedactPii() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewayLoggingResult) bool { return v.RedactPii }).(pulumi.BoolOutput)
}

// Logging settings by rule type.
func (o LookupZeroTrustGatewayLoggingResultOutput) SettingsByRuleType() GetZeroTrustGatewayLoggingSettingsByRuleTypeOutput {
	return o.ApplyT(func(v LookupZeroTrustGatewayLoggingResult) GetZeroTrustGatewayLoggingSettingsByRuleType {
		return v.SettingsByRuleType
	}).(GetZeroTrustGatewayLoggingSettingsByRuleTypeOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZeroTrustGatewayLoggingResultOutput{})
}
