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
//			_, err := cloudflare.GetDcvDelegation(ctx, &cloudflare.GetDcvDelegationArgs{
//				ZoneId: "023e105f4ecef8ad9ca31a8372d0c353",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDcvDelegation(ctx *pulumi.Context, args *GetDcvDelegationArgs, opts ...pulumi.InvokeOption) (*GetDcvDelegationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDcvDelegationResult
	err := ctx.Invoke("cloudflare:index/getDcvDelegation:getDcvDelegation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDcvDelegation.
type GetDcvDelegationArgs struct {
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getDcvDelegation.
type GetDcvDelegationResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The DCV Delegation unique identifier.
	Uuid string `pulumi:"uuid"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

func GetDcvDelegationOutput(ctx *pulumi.Context, args GetDcvDelegationOutputArgs, opts ...pulumi.InvokeOption) GetDcvDelegationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDcvDelegationResultOutput, error) {
			args := v.(GetDcvDelegationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getDcvDelegation:getDcvDelegation", args, GetDcvDelegationResultOutput{}, options).(GetDcvDelegationResultOutput), nil
		}).(GetDcvDelegationResultOutput)
}

// A collection of arguments for invoking getDcvDelegation.
type GetDcvDelegationOutputArgs struct {
	// Identifier.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetDcvDelegationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDcvDelegationArgs)(nil)).Elem()
}

// A collection of values returned by getDcvDelegation.
type GetDcvDelegationResultOutput struct{ *pulumi.OutputState }

func (GetDcvDelegationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDcvDelegationResult)(nil)).Elem()
}

func (o GetDcvDelegationResultOutput) ToGetDcvDelegationResultOutput() GetDcvDelegationResultOutput {
	return o
}

func (o GetDcvDelegationResultOutput) ToGetDcvDelegationResultOutputWithContext(ctx context.Context) GetDcvDelegationResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetDcvDelegationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDcvDelegationResult) string { return v.Id }).(pulumi.StringOutput)
}

// The DCV Delegation unique identifier.
func (o GetDcvDelegationResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v GetDcvDelegationResult) string { return v.Uuid }).(pulumi.StringOutput)
}

// Identifier.
func (o GetDcvDelegationResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDcvDelegationResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDcvDelegationResultOutput{})
}
