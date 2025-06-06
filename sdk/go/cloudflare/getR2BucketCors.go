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
//			_, err := cloudflare.LookupR2BucketCors(ctx, &cloudflare.LookupR2BucketCorsArgs{
//				AccountId:  "023e105f4ecef8ad9ca31a8372d0c353",
//				BucketName: "example-bucket",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupR2BucketCors(ctx *pulumi.Context, args *LookupR2BucketCorsArgs, opts ...pulumi.InvokeOption) (*LookupR2BucketCorsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupR2BucketCorsResult
	err := ctx.Invoke("cloudflare:index/getR2BucketCors:getR2BucketCors", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getR2BucketCors.
type LookupR2BucketCorsArgs struct {
	// Account ID.
	AccountId string `pulumi:"accountId"`
	// Name of the bucket.
	BucketName string `pulumi:"bucketName"`
}

// A collection of values returned by getR2BucketCors.
type LookupR2BucketCorsResult struct {
	// Account ID.
	AccountId string `pulumi:"accountId"`
	// Name of the bucket.
	BucketName string `pulumi:"bucketName"`
	// The provider-assigned unique ID for this managed resource.
	Id    string                `pulumi:"id"`
	Rules []GetR2BucketCorsRule `pulumi:"rules"`
}

func LookupR2BucketCorsOutput(ctx *pulumi.Context, args LookupR2BucketCorsOutputArgs, opts ...pulumi.InvokeOption) LookupR2BucketCorsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupR2BucketCorsResultOutput, error) {
			args := v.(LookupR2BucketCorsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getR2BucketCors:getR2BucketCors", args, LookupR2BucketCorsResultOutput{}, options).(LookupR2BucketCorsResultOutput), nil
		}).(LookupR2BucketCorsResultOutput)
}

// A collection of arguments for invoking getR2BucketCors.
type LookupR2BucketCorsOutputArgs struct {
	// Account ID.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Name of the bucket.
	BucketName pulumi.StringInput `pulumi:"bucketName"`
}

func (LookupR2BucketCorsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupR2BucketCorsArgs)(nil)).Elem()
}

// A collection of values returned by getR2BucketCors.
type LookupR2BucketCorsResultOutput struct{ *pulumi.OutputState }

func (LookupR2BucketCorsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupR2BucketCorsResult)(nil)).Elem()
}

func (o LookupR2BucketCorsResultOutput) ToLookupR2BucketCorsResultOutput() LookupR2BucketCorsResultOutput {
	return o
}

func (o LookupR2BucketCorsResultOutput) ToLookupR2BucketCorsResultOutputWithContext(ctx context.Context) LookupR2BucketCorsResultOutput {
	return o
}

// Account ID.
func (o LookupR2BucketCorsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupR2BucketCorsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Name of the bucket.
func (o LookupR2BucketCorsResultOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupR2BucketCorsResult) string { return v.BucketName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupR2BucketCorsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupR2BucketCorsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupR2BucketCorsResultOutput) Rules() GetR2BucketCorsRuleArrayOutput {
	return o.ApplyT(func(v LookupR2BucketCorsResult) []GetR2BucketCorsRule { return v.Rules }).(GetR2BucketCorsRuleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupR2BucketCorsResultOutput{})
}
