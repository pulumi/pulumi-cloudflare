// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
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
//			_, err := cloudflare.LookupWorkersForPlatformsScriptSecrets(ctx, &cloudflare.LookupWorkersForPlatformsScriptSecretsArgs{
//				AccountId:         "023e105f4ecef8ad9ca31a8372d0c353",
//				DispatchNamespace: "my-dispatch-namespace",
//				ScriptName:        "this-is_my_script-01",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupWorkersForPlatformsScriptSecrets(ctx *pulumi.Context, args *LookupWorkersForPlatformsScriptSecretsArgs, opts ...pulumi.InvokeOption) (*LookupWorkersForPlatformsScriptSecretsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWorkersForPlatformsScriptSecretsResult
	err := ctx.Invoke("cloudflare:index/getWorkersForPlatformsScriptSecrets:getWorkersForPlatformsScriptSecrets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWorkersForPlatformsScriptSecrets.
type LookupWorkersForPlatformsScriptSecretsArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace string `pulumi:"dispatchNamespace"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Name of the script, used in URLs and route configuration.
	ScriptName string `pulumi:"scriptName"`
}

// A collection of values returned by getWorkersForPlatformsScriptSecrets.
type LookupWorkersForPlatformsScriptSecretsResult struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace string `pulumi:"dispatchNamespace"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// The items returned by the data source
	Results []GetWorkersForPlatformsScriptSecretsResult `pulumi:"results"`
	// Name of the script, used in URLs and route configuration.
	ScriptName string `pulumi:"scriptName"`
}

func LookupWorkersForPlatformsScriptSecretsOutput(ctx *pulumi.Context, args LookupWorkersForPlatformsScriptSecretsOutputArgs, opts ...pulumi.InvokeOption) LookupWorkersForPlatformsScriptSecretsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupWorkersForPlatformsScriptSecretsResultOutput, error) {
			args := v.(LookupWorkersForPlatformsScriptSecretsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getWorkersForPlatformsScriptSecrets:getWorkersForPlatformsScriptSecrets", args, LookupWorkersForPlatformsScriptSecretsResultOutput{}, options).(LookupWorkersForPlatformsScriptSecretsResultOutput), nil
		}).(LookupWorkersForPlatformsScriptSecretsResultOutput)
}

// A collection of arguments for invoking getWorkersForPlatformsScriptSecrets.
type LookupWorkersForPlatformsScriptSecretsOutputArgs struct {
	// Identifier.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Name of the Workers for Platforms dispatch namespace.
	DispatchNamespace pulumi.StringInput `pulumi:"dispatchNamespace"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	// Name of the script, used in URLs and route configuration.
	ScriptName pulumi.StringInput `pulumi:"scriptName"`
}

func (LookupWorkersForPlatformsScriptSecretsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkersForPlatformsScriptSecretsArgs)(nil)).Elem()
}

// A collection of values returned by getWorkersForPlatformsScriptSecrets.
type LookupWorkersForPlatformsScriptSecretsResultOutput struct{ *pulumi.OutputState }

func (LookupWorkersForPlatformsScriptSecretsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkersForPlatformsScriptSecretsResult)(nil)).Elem()
}

func (o LookupWorkersForPlatformsScriptSecretsResultOutput) ToLookupWorkersForPlatformsScriptSecretsResultOutput() LookupWorkersForPlatformsScriptSecretsResultOutput {
	return o
}

func (o LookupWorkersForPlatformsScriptSecretsResultOutput) ToLookupWorkersForPlatformsScriptSecretsResultOutputWithContext(ctx context.Context) LookupWorkersForPlatformsScriptSecretsResultOutput {
	return o
}

// Identifier.
func (o LookupWorkersForPlatformsScriptSecretsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersForPlatformsScriptSecretsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Name of the Workers for Platforms dispatch namespace.
func (o LookupWorkersForPlatformsScriptSecretsResultOutput) DispatchNamespace() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersForPlatformsScriptSecretsResult) string { return v.DispatchNamespace }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWorkersForPlatformsScriptSecretsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersForPlatformsScriptSecretsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupWorkersForPlatformsScriptSecretsResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupWorkersForPlatformsScriptSecretsResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// The items returned by the data source
func (o LookupWorkersForPlatformsScriptSecretsResultOutput) Results() GetWorkersForPlatformsScriptSecretsResultArrayOutput {
	return o.ApplyT(func(v LookupWorkersForPlatformsScriptSecretsResult) []GetWorkersForPlatformsScriptSecretsResult {
		return v.Results
	}).(GetWorkersForPlatformsScriptSecretsResultArrayOutput)
}

// Name of the script, used in URLs and route configuration.
func (o LookupWorkersForPlatformsScriptSecretsResultOutput) ScriptName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersForPlatformsScriptSecretsResult) string { return v.ScriptName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWorkersForPlatformsScriptSecretsResultOutput{})
}
