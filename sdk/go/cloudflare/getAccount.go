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
//			_, err := cloudflare.LookupAccount(ctx, &cloudflare.LookupAccountArgs{
//				AccountId: pulumi.StringRef("023e105f4ecef8ad9ca31a8372d0c353"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAccount(ctx *pulumi.Context, args *LookupAccountArgs, opts ...pulumi.InvokeOption) (*LookupAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountResult
	err := ctx.Invoke("cloudflare:index/getAccount:getAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccount.
type LookupAccountArgs struct {
	// Account identifier tag.
	AccountId *string           `pulumi:"accountId"`
	Filter    *GetAccountFilter `pulumi:"filter"`
}

// A collection of values returned by getAccount.
type LookupAccountResult struct {
	// Account identifier tag.
	AccountId *string `pulumi:"accountId"`
	// Timestamp for the creation of the account
	CreatedOn string            `pulumi:"createdOn"`
	Filter    *GetAccountFilter `pulumi:"filter"`
	// Account identifier tag.
	Id string `pulumi:"id"`
	// Account name
	Name string `pulumi:"name"`
	// Account settings
	Settings GetAccountSettings `pulumi:"settings"`
}

func LookupAccountOutput(ctx *pulumi.Context, args LookupAccountOutputArgs, opts ...pulumi.InvokeOption) LookupAccountResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAccountResultOutput, error) {
			args := v.(LookupAccountArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getAccount:getAccount", args, LookupAccountResultOutput{}, options).(LookupAccountResultOutput), nil
		}).(LookupAccountResultOutput)
}

// A collection of arguments for invoking getAccount.
type LookupAccountOutputArgs struct {
	// Account identifier tag.
	AccountId pulumi.StringPtrInput    `pulumi:"accountId"`
	Filter    GetAccountFilterPtrInput `pulumi:"filter"`
}

func (LookupAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountArgs)(nil)).Elem()
}

// A collection of values returned by getAccount.
type LookupAccountResultOutput struct{ *pulumi.OutputState }

func (LookupAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountResult)(nil)).Elem()
}

func (o LookupAccountResultOutput) ToLookupAccountResultOutput() LookupAccountResultOutput {
	return o
}

func (o LookupAccountResultOutput) ToLookupAccountResultOutputWithContext(ctx context.Context) LookupAccountResultOutput {
	return o
}

// Account identifier tag.
func (o LookupAccountResultOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAccountResult) *string { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Timestamp for the creation of the account
func (o LookupAccountResultOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.CreatedOn }).(pulumi.StringOutput)
}

func (o LookupAccountResultOutput) Filter() GetAccountFilterPtrOutput {
	return o.ApplyT(func(v LookupAccountResult) *GetAccountFilter { return v.Filter }).(GetAccountFilterPtrOutput)
}

// Account identifier tag.
func (o LookupAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// Account name
func (o LookupAccountResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Name }).(pulumi.StringOutput)
}

// Account settings
func (o LookupAccountResultOutput) Settings() GetAccountSettingsOutput {
	return o.ApplyT(func(v LookupAccountResult) GetAccountSettings { return v.Settings }).(GetAccountSettingsOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountResultOutput{})
}
