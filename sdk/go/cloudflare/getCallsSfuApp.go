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
//			_, err := cloudflare.LookupCallsSfuApp(ctx, &cloudflare.LookupCallsSfuAppArgs{
//				AccountId: "023e105f4ecef8ad9ca31a8372d0c353",
//				AppId:     "2a95132c15732412d22c1476fa83f27a",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCallsSfuApp(ctx *pulumi.Context, args *LookupCallsSfuAppArgs, opts ...pulumi.InvokeOption) (*LookupCallsSfuAppResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCallsSfuAppResult
	err := ctx.Invoke("cloudflare:index/getCallsSfuApp:getCallsSfuApp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCallsSfuApp.
type LookupCallsSfuAppArgs struct {
	// The account identifier tag.
	AccountId string `pulumi:"accountId"`
	// A Cloudflare-generated unique identifier for a item.
	AppId string `pulumi:"appId"`
}

// A collection of values returned by getCallsSfuApp.
type LookupCallsSfuAppResult struct {
	// The account identifier tag.
	AccountId string `pulumi:"accountId"`
	// A Cloudflare-generated unique identifier for a item.
	AppId string `pulumi:"appId"`
	// The date and time the item was created.
	Created string `pulumi:"created"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The date and time the item was last modified.
	Modified string `pulumi:"modified"`
	// A short description of Calls app, not shown to end users.
	Name string `pulumi:"name"`
	// A Cloudflare-generated unique identifier for a item.
	Uid string `pulumi:"uid"`
}

func LookupCallsSfuAppOutput(ctx *pulumi.Context, args LookupCallsSfuAppOutputArgs, opts ...pulumi.InvokeOption) LookupCallsSfuAppResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCallsSfuAppResultOutput, error) {
			args := v.(LookupCallsSfuAppArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getCallsSfuApp:getCallsSfuApp", args, LookupCallsSfuAppResultOutput{}, options).(LookupCallsSfuAppResultOutput), nil
		}).(LookupCallsSfuAppResultOutput)
}

// A collection of arguments for invoking getCallsSfuApp.
type LookupCallsSfuAppOutputArgs struct {
	// The account identifier tag.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// A Cloudflare-generated unique identifier for a item.
	AppId pulumi.StringInput `pulumi:"appId"`
}

func (LookupCallsSfuAppOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCallsSfuAppArgs)(nil)).Elem()
}

// A collection of values returned by getCallsSfuApp.
type LookupCallsSfuAppResultOutput struct{ *pulumi.OutputState }

func (LookupCallsSfuAppResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCallsSfuAppResult)(nil)).Elem()
}

func (o LookupCallsSfuAppResultOutput) ToLookupCallsSfuAppResultOutput() LookupCallsSfuAppResultOutput {
	return o
}

func (o LookupCallsSfuAppResultOutput) ToLookupCallsSfuAppResultOutputWithContext(ctx context.Context) LookupCallsSfuAppResultOutput {
	return o
}

// The account identifier tag.
func (o LookupCallsSfuAppResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCallsSfuAppResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// A Cloudflare-generated unique identifier for a item.
func (o LookupCallsSfuAppResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCallsSfuAppResult) string { return v.AppId }).(pulumi.StringOutput)
}

// The date and time the item was created.
func (o LookupCallsSfuAppResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCallsSfuAppResult) string { return v.Created }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCallsSfuAppResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCallsSfuAppResult) string { return v.Id }).(pulumi.StringOutput)
}

// The date and time the item was last modified.
func (o LookupCallsSfuAppResultOutput) Modified() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCallsSfuAppResult) string { return v.Modified }).(pulumi.StringOutput)
}

// A short description of Calls app, not shown to end users.
func (o LookupCallsSfuAppResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCallsSfuAppResult) string { return v.Name }).(pulumi.StringOutput)
}

// A Cloudflare-generated unique identifier for a item.
func (o LookupCallsSfuAppResultOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCallsSfuAppResult) string { return v.Uid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCallsSfuAppResultOutput{})
}
