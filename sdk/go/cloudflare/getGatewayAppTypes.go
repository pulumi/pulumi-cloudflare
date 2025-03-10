// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve all Gateway application types for an account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.GetGatewayAppTypes(ctx, &cloudflare.GetGatewayAppTypesArgs{
//				AccountId: "f037e56e89293a057740de681ac9abbe",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGatewayAppTypes(ctx *pulumi.Context, args *GetGatewayAppTypesArgs, opts ...pulumi.InvokeOption) (*GetGatewayAppTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewayAppTypesResult
	err := ctx.Invoke("cloudflare:index/getGatewayAppTypes:getGatewayAppTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGatewayAppTypes.
type GetGatewayAppTypesArgs struct {
	// The account ID to fetch Gateway App Types from.
	AccountId string `pulumi:"accountId"`
}

// A collection of values returned by getGatewayAppTypes.
type GetGatewayAppTypesResult struct {
	// The account ID to fetch Gateway App Types from.
	AccountId string `pulumi:"accountId"`
	// A list of Gateway App Types.
	AppTypes []GetGatewayAppTypesAppType `pulumi:"appTypes"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetGatewayAppTypesOutput(ctx *pulumi.Context, args GetGatewayAppTypesOutputArgs, opts ...pulumi.InvokeOption) GetGatewayAppTypesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetGatewayAppTypesResultOutput, error) {
			args := v.(GetGatewayAppTypesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getGatewayAppTypes:getGatewayAppTypes", args, GetGatewayAppTypesResultOutput{}, options).(GetGatewayAppTypesResultOutput), nil
		}).(GetGatewayAppTypesResultOutput)
}

// A collection of arguments for invoking getGatewayAppTypes.
type GetGatewayAppTypesOutputArgs struct {
	// The account ID to fetch Gateway App Types from.
	AccountId pulumi.StringInput `pulumi:"accountId"`
}

func (GetGatewayAppTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayAppTypesArgs)(nil)).Elem()
}

// A collection of values returned by getGatewayAppTypes.
type GetGatewayAppTypesResultOutput struct{ *pulumi.OutputState }

func (GetGatewayAppTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayAppTypesResult)(nil)).Elem()
}

func (o GetGatewayAppTypesResultOutput) ToGetGatewayAppTypesResultOutput() GetGatewayAppTypesResultOutput {
	return o
}

func (o GetGatewayAppTypesResultOutput) ToGetGatewayAppTypesResultOutputWithContext(ctx context.Context) GetGatewayAppTypesResultOutput {
	return o
}

// The account ID to fetch Gateway App Types from.
func (o GetGatewayAppTypesResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayAppTypesResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// A list of Gateway App Types.
func (o GetGatewayAppTypesResultOutput) AppTypes() GetGatewayAppTypesAppTypeArrayOutput {
	return o.ApplyT(func(v GetGatewayAppTypesResult) []GetGatewayAppTypesAppType { return v.AppTypes }).(GetGatewayAppTypesAppTypeArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewayAppTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayAppTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewayAppTypesResultOutput{})
}
