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
//			_, err := cloudflare.LookupQueues(ctx, &cloudflare.LookupQueuesArgs{
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
func LookupQueues(ctx *pulumi.Context, args *LookupQueuesArgs, opts ...pulumi.InvokeOption) (*LookupQueuesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupQueuesResult
	err := ctx.Invoke("cloudflare:index/getQueues:getQueues", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getQueues.
type LookupQueuesArgs struct {
	// A Resource identifier.
	AccountId string `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
}

// A collection of values returned by getQueues.
type LookupQueuesResult struct {
	// A Resource identifier.
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetQueuesResult `pulumi:"results"`
}

func LookupQueuesOutput(ctx *pulumi.Context, args LookupQueuesOutputArgs, opts ...pulumi.InvokeOption) LookupQueuesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupQueuesResultOutput, error) {
			args := v.(LookupQueuesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getQueues:getQueues", args, LookupQueuesResultOutput{}, options).(LookupQueuesResultOutput), nil
		}).(LookupQueuesResultOutput)
}

// A collection of arguments for invoking getQueues.
type LookupQueuesOutputArgs struct {
	// A Resource identifier.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
}

func (LookupQueuesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupQueuesArgs)(nil)).Elem()
}

// A collection of values returned by getQueues.
type LookupQueuesResultOutput struct{ *pulumi.OutputState }

func (LookupQueuesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupQueuesResult)(nil)).Elem()
}

func (o LookupQueuesResultOutput) ToLookupQueuesResultOutput() LookupQueuesResultOutput {
	return o
}

func (o LookupQueuesResultOutput) ToLookupQueuesResultOutputWithContext(ctx context.Context) LookupQueuesResultOutput {
	return o
}

// A Resource identifier.
func (o LookupQueuesResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupQueuesResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupQueuesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupQueuesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupQueuesResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupQueuesResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupQueuesResultOutput) Results() GetQueuesResultArrayOutput {
	return o.ApplyT(func(v LookupQueuesResult) []GetQueuesResult { return v.Results }).(GetQueuesResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupQueuesResultOutput{})
}
