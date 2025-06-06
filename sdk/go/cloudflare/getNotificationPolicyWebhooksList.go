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
//			_, err := cloudflare.LookupNotificationPolicyWebhooksList(ctx, &cloudflare.LookupNotificationPolicyWebhooksListArgs{
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
func LookupNotificationPolicyWebhooksList(ctx *pulumi.Context, args *LookupNotificationPolicyWebhooksListArgs, opts ...pulumi.InvokeOption) (*LookupNotificationPolicyWebhooksListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNotificationPolicyWebhooksListResult
	err := ctx.Invoke("cloudflare:index/getNotificationPolicyWebhooksList:getNotificationPolicyWebhooksList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNotificationPolicyWebhooksList.
type LookupNotificationPolicyWebhooksListArgs struct {
	// The account id
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
}

// A collection of values returned by getNotificationPolicyWebhooksList.
type LookupNotificationPolicyWebhooksListResult struct {
	// The account id
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetNotificationPolicyWebhooksListResult `pulumi:"results"`
}

func LookupNotificationPolicyWebhooksListOutput(ctx *pulumi.Context, args LookupNotificationPolicyWebhooksListOutputArgs, opts ...pulumi.InvokeOption) LookupNotificationPolicyWebhooksListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNotificationPolicyWebhooksListResultOutput, error) {
			args := v.(LookupNotificationPolicyWebhooksListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getNotificationPolicyWebhooksList:getNotificationPolicyWebhooksList", args, LookupNotificationPolicyWebhooksListResultOutput{}, options).(LookupNotificationPolicyWebhooksListResultOutput), nil
		}).(LookupNotificationPolicyWebhooksListResultOutput)
}

// A collection of arguments for invoking getNotificationPolicyWebhooksList.
type LookupNotificationPolicyWebhooksListOutputArgs struct {
	// The account id
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
}

func (LookupNotificationPolicyWebhooksListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNotificationPolicyWebhooksListArgs)(nil)).Elem()
}

// A collection of values returned by getNotificationPolicyWebhooksList.
type LookupNotificationPolicyWebhooksListResultOutput struct{ *pulumi.OutputState }

func (LookupNotificationPolicyWebhooksListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNotificationPolicyWebhooksListResult)(nil)).Elem()
}

func (o LookupNotificationPolicyWebhooksListResultOutput) ToLookupNotificationPolicyWebhooksListResultOutput() LookupNotificationPolicyWebhooksListResultOutput {
	return o
}

func (o LookupNotificationPolicyWebhooksListResultOutput) ToLookupNotificationPolicyWebhooksListResultOutputWithContext(ctx context.Context) LookupNotificationPolicyWebhooksListResultOutput {
	return o
}

// The account id
func (o LookupNotificationPolicyWebhooksListResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationPolicyWebhooksListResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNotificationPolicyWebhooksListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationPolicyWebhooksListResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupNotificationPolicyWebhooksListResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupNotificationPolicyWebhooksListResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupNotificationPolicyWebhooksListResultOutput) Results() GetNotificationPolicyWebhooksListResultArrayOutput {
	return o.ApplyT(func(v LookupNotificationPolicyWebhooksListResult) []GetNotificationPolicyWebhooksListResult {
		return v.Results
	}).(GetNotificationPolicyWebhooksListResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNotificationPolicyWebhooksListResultOutput{})
}
