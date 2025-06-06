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
//			_, err := cloudflare.LookupAccounts(ctx, &cloudflare.LookupAccountsArgs{
//				Direction: pulumi.StringRef("desc"),
//				Name:      pulumi.StringRef("example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAccounts(ctx *pulumi.Context, args *LookupAccountsArgs, opts ...pulumi.InvokeOption) (*LookupAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountsResult
	err := ctx.Invoke("cloudflare:index/getAccounts:getAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccounts.
type LookupAccountsArgs struct {
	// Direction to order results.
	// Available values: "asc", "desc".
	Direction *string `pulumi:"direction"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Name of the account.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getAccounts.
type LookupAccountsResult struct {
	// Direction to order results.
	// Available values: "asc", "desc".
	Direction *string `pulumi:"direction"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Max items to fetch, default: 1000
	MaxItems *int `pulumi:"maxItems"`
	// Name of the account.
	Name *string `pulumi:"name"`
	// The items returned by the data source
	Results []GetAccountsResult `pulumi:"results"`
}

func LookupAccountsOutput(ctx *pulumi.Context, args LookupAccountsOutputArgs, opts ...pulumi.InvokeOption) LookupAccountsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAccountsResultOutput, error) {
			args := v.(LookupAccountsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getAccounts:getAccounts", args, LookupAccountsResultOutput{}, options).(LookupAccountsResultOutput), nil
		}).(LookupAccountsResultOutput)
}

// A collection of arguments for invoking getAccounts.
type LookupAccountsOutputArgs struct {
	// Direction to order results.
	// Available values: "asc", "desc".
	Direction pulumi.StringPtrInput `pulumi:"direction"`
	// Max items to fetch, default: 1000
	MaxItems pulumi.IntPtrInput `pulumi:"maxItems"`
	// Name of the account.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getAccounts.
type LookupAccountsResultOutput struct{ *pulumi.OutputState }

func (LookupAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountsResult)(nil)).Elem()
}

func (o LookupAccountsResultOutput) ToLookupAccountsResultOutput() LookupAccountsResultOutput {
	return o
}

func (o LookupAccountsResultOutput) ToLookupAccountsResultOutputWithContext(ctx context.Context) LookupAccountsResultOutput {
	return o
}

// Direction to order results.
// Available values: "asc", "desc".
func (o LookupAccountsResultOutput) Direction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAccountsResult) *string { return v.Direction }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Max items to fetch, default: 1000
func (o LookupAccountsResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupAccountsResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

// Name of the account.
func (o LookupAccountsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAccountsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The items returned by the data source
func (o LookupAccountsResultOutput) Results() GetAccountsResultArrayOutput {
	return o.ApplyT(func(v LookupAccountsResult) []GetAccountsResult { return v.Results }).(GetAccountsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountsResultOutput{})
}
