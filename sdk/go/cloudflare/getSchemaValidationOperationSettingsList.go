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
//			_, err := cloudflare.LookupSchemaValidationOperationSettingsList(ctx, &cloudflare.LookupSchemaValidationOperationSettingsListArgs{
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
func LookupSchemaValidationOperationSettingsList(ctx *pulumi.Context, args *LookupSchemaValidationOperationSettingsListArgs, opts ...pulumi.InvokeOption) (*LookupSchemaValidationOperationSettingsListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSchemaValidationOperationSettingsListResult
	err := ctx.Invoke("cloudflare:index/getSchemaValidationOperationSettingsList:getSchemaValidationOperationSettingsList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemaValidationOperationSettingsList.
type LookupSchemaValidationOperationSettingsListArgs struct {
	MaxItems *int   `pulumi:"maxItems"`
	ZoneId   string `pulumi:"zoneId"`
}

// A collection of values returned by getSchemaValidationOperationSettingsList.
type LookupSchemaValidationOperationSettingsListResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string                                           `pulumi:"id"`
	MaxItems *int                                             `pulumi:"maxItems"`
	Results  []GetSchemaValidationOperationSettingsListResult `pulumi:"results"`
	ZoneId   string                                           `pulumi:"zoneId"`
}

func LookupSchemaValidationOperationSettingsListOutput(ctx *pulumi.Context, args LookupSchemaValidationOperationSettingsListOutputArgs, opts ...pulumi.InvokeOption) LookupSchemaValidationOperationSettingsListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSchemaValidationOperationSettingsListResultOutput, error) {
			args := v.(LookupSchemaValidationOperationSettingsListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getSchemaValidationOperationSettingsList:getSchemaValidationOperationSettingsList", args, LookupSchemaValidationOperationSettingsListResultOutput{}, options).(LookupSchemaValidationOperationSettingsListResultOutput), nil
		}).(LookupSchemaValidationOperationSettingsListResultOutput)
}

// A collection of arguments for invoking getSchemaValidationOperationSettingsList.
type LookupSchemaValidationOperationSettingsListOutputArgs struct {
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	ZoneId   pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupSchemaValidationOperationSettingsListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaValidationOperationSettingsListArgs)(nil)).Elem()
}

// A collection of values returned by getSchemaValidationOperationSettingsList.
type LookupSchemaValidationOperationSettingsListResultOutput struct{ *pulumi.OutputState }

func (LookupSchemaValidationOperationSettingsListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaValidationOperationSettingsListResult)(nil)).Elem()
}

func (o LookupSchemaValidationOperationSettingsListResultOutput) ToLookupSchemaValidationOperationSettingsListResultOutput() LookupSchemaValidationOperationSettingsListResultOutput {
	return o
}

func (o LookupSchemaValidationOperationSettingsListResultOutput) ToLookupSchemaValidationOperationSettingsListResultOutputWithContext(ctx context.Context) LookupSchemaValidationOperationSettingsListResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSchemaValidationOperationSettingsListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaValidationOperationSettingsListResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSchemaValidationOperationSettingsListResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupSchemaValidationOperationSettingsListResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

func (o LookupSchemaValidationOperationSettingsListResultOutput) Results() GetSchemaValidationOperationSettingsListResultArrayOutput {
	return o.ApplyT(func(v LookupSchemaValidationOperationSettingsListResult) []GetSchemaValidationOperationSettingsListResult {
		return v.Results
	}).(GetSchemaValidationOperationSettingsListResultArrayOutput)
}

func (o LookupSchemaValidationOperationSettingsListResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaValidationOperationSettingsListResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSchemaValidationOperationSettingsListResultOutput{})
}
