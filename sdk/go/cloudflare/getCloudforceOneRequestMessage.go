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
//			_, err := cloudflare.LookupCloudforceOneRequestMessage(ctx, &cloudflare.LookupCloudforceOneRequestMessageArgs{
//				AccountIdentifier: "023e105f4ecef8ad9ca31a8372d0c353",
//				RequestIdentifier: "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCloudforceOneRequestMessage(ctx *pulumi.Context, args *LookupCloudforceOneRequestMessageArgs, opts ...pulumi.InvokeOption) (*LookupCloudforceOneRequestMessageResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudforceOneRequestMessageResult
	err := ctx.Invoke("cloudflare:index/getCloudforceOneRequestMessage:getCloudforceOneRequestMessage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudforceOneRequestMessage.
type LookupCloudforceOneRequestMessageArgs struct {
	// Identifier
	AccountIdentifier string `pulumi:"accountIdentifier"`
	// UUID
	RequestIdentifier string `pulumi:"requestIdentifier"`
}

// A collection of values returned by getCloudforceOneRequestMessage.
type LookupCloudforceOneRequestMessageResult struct {
	// Identifier
	AccountIdentifier string `pulumi:"accountIdentifier"`
	// Author of message
	Author string `pulumi:"author"`
	// Content of message
	Content string `pulumi:"content"`
	// Message creation time
	Created string `pulumi:"created"`
	// Message ID
	Id int `pulumi:"id"`
	// Whether the message is a follow-on request
	IsFollowOnRequest bool `pulumi:"isFollowOnRequest"`
	// UUID
	RequestIdentifier string `pulumi:"requestIdentifier"`
	// Message last updated time
	Updated string `pulumi:"updated"`
}

func LookupCloudforceOneRequestMessageOutput(ctx *pulumi.Context, args LookupCloudforceOneRequestMessageOutputArgs, opts ...pulumi.InvokeOption) LookupCloudforceOneRequestMessageResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCloudforceOneRequestMessageResultOutput, error) {
			args := v.(LookupCloudforceOneRequestMessageArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getCloudforceOneRequestMessage:getCloudforceOneRequestMessage", args, LookupCloudforceOneRequestMessageResultOutput{}, options).(LookupCloudforceOneRequestMessageResultOutput), nil
		}).(LookupCloudforceOneRequestMessageResultOutput)
}

// A collection of arguments for invoking getCloudforceOneRequestMessage.
type LookupCloudforceOneRequestMessageOutputArgs struct {
	// Identifier
	AccountIdentifier pulumi.StringInput `pulumi:"accountIdentifier"`
	// UUID
	RequestIdentifier pulumi.StringInput `pulumi:"requestIdentifier"`
}

func (LookupCloudforceOneRequestMessageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudforceOneRequestMessageArgs)(nil)).Elem()
}

// A collection of values returned by getCloudforceOneRequestMessage.
type LookupCloudforceOneRequestMessageResultOutput struct{ *pulumi.OutputState }

func (LookupCloudforceOneRequestMessageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudforceOneRequestMessageResult)(nil)).Elem()
}

func (o LookupCloudforceOneRequestMessageResultOutput) ToLookupCloudforceOneRequestMessageResultOutput() LookupCloudforceOneRequestMessageResultOutput {
	return o
}

func (o LookupCloudforceOneRequestMessageResultOutput) ToLookupCloudforceOneRequestMessageResultOutputWithContext(ctx context.Context) LookupCloudforceOneRequestMessageResultOutput {
	return o
}

// Identifier
func (o LookupCloudforceOneRequestMessageResultOutput) AccountIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) string { return v.AccountIdentifier }).(pulumi.StringOutput)
}

// Author of message
func (o LookupCloudforceOneRequestMessageResultOutput) Author() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) string { return v.Author }).(pulumi.StringOutput)
}

// Content of message
func (o LookupCloudforceOneRequestMessageResultOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) string { return v.Content }).(pulumi.StringOutput)
}

// Message creation time
func (o LookupCloudforceOneRequestMessageResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) string { return v.Created }).(pulumi.StringOutput)
}

// Message ID
func (o LookupCloudforceOneRequestMessageResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) int { return v.Id }).(pulumi.IntOutput)
}

// Whether the message is a follow-on request
func (o LookupCloudforceOneRequestMessageResultOutput) IsFollowOnRequest() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) bool { return v.IsFollowOnRequest }).(pulumi.BoolOutput)
}

// UUID
func (o LookupCloudforceOneRequestMessageResultOutput) RequestIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) string { return v.RequestIdentifier }).(pulumi.StringOutput)
}

// Message last updated time
func (o LookupCloudforceOneRequestMessageResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudforceOneRequestMessageResult) string { return v.Updated }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudforceOneRequestMessageResultOutput{})
}
