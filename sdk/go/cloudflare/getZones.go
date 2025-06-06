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
//			_, err := cloudflare.LookupZones(ctx, &cloudflare.LookupZonesArgs{
//				Account: cloudflare.GetZonesAccount{
//					Id:   pulumi.StringRef("id"),
//					Name: pulumi.StringRef("name"),
//				},
//				Direction: pulumi.StringRef("desc"),
//				Name:      pulumi.StringRef("name"),
//				Order:     pulumi.StringRef("status"),
//				Status:    pulumi.StringRef("initializing"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupZones(ctx *pulumi.Context, args *LookupZonesArgs, opts ...pulumi.InvokeOption) (*LookupZonesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupZonesResult
	err := ctx.Invoke("cloudflare:index/getZones:getZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZones.
type LookupZonesArgs struct {
	Account   *GetZonesAccount `pulumi:"account"`
	Direction *string          `pulumi:"direction"`
	Match     *string          `pulumi:"match"`
	MaxItems  *int             `pulumi:"maxItems"`
	Name      *string          `pulumi:"name"`
	Order     *string          `pulumi:"order"`
	Status    *string          `pulumi:"status"`
}

// A collection of values returned by getZones.
type LookupZonesResult struct {
	Account   *GetZonesAccount `pulumi:"account"`
	Direction *string          `pulumi:"direction"`
	// The provider-assigned unique ID for this managed resource.
	Id       string           `pulumi:"id"`
	Match    string           `pulumi:"match"`
	MaxItems *int             `pulumi:"maxItems"`
	Name     *string          `pulumi:"name"`
	Order    *string          `pulumi:"order"`
	Results  []GetZonesResult `pulumi:"results"`
	Status   *string          `pulumi:"status"`
}

func LookupZonesOutput(ctx *pulumi.Context, args LookupZonesOutputArgs, opts ...pulumi.InvokeOption) LookupZonesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupZonesResultOutput, error) {
			args := v.(LookupZonesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getZones:getZones", args, LookupZonesResultOutput{}, options).(LookupZonesResultOutput), nil
		}).(LookupZonesResultOutput)
}

// A collection of arguments for invoking getZones.
type LookupZonesOutputArgs struct {
	Account   GetZonesAccountPtrInput `pulumi:"account"`
	Direction pulumi.StringPtrInput   `pulumi:"direction"`
	Match     pulumi.StringPtrInput   `pulumi:"match"`
	MaxItems  pulumi.IntPtrInput      `pulumi:"maxItems"`
	Name      pulumi.StringPtrInput   `pulumi:"name"`
	Order     pulumi.StringPtrInput   `pulumi:"order"`
	Status    pulumi.StringPtrInput   `pulumi:"status"`
}

func (LookupZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZonesArgs)(nil)).Elem()
}

// A collection of values returned by getZones.
type LookupZonesResultOutput struct{ *pulumi.OutputState }

func (LookupZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZonesResult)(nil)).Elem()
}

func (o LookupZonesResultOutput) ToLookupZonesResultOutput() LookupZonesResultOutput {
	return o
}

func (o LookupZonesResultOutput) ToLookupZonesResultOutputWithContext(ctx context.Context) LookupZonesResultOutput {
	return o
}

func (o LookupZonesResultOutput) Account() GetZonesAccountPtrOutput {
	return o.ApplyT(func(v LookupZonesResult) *GetZonesAccount { return v.Account }).(GetZonesAccountPtrOutput)
}

func (o LookupZonesResultOutput) Direction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupZonesResult) *string { return v.Direction }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupZonesResultOutput) Match() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZonesResult) string { return v.Match }).(pulumi.StringOutput)
}

func (o LookupZonesResultOutput) MaxItems() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupZonesResult) *int { return v.MaxItems }).(pulumi.IntPtrOutput)
}

func (o LookupZonesResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupZonesResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupZonesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupZonesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o LookupZonesResultOutput) Results() GetZonesResultArrayOutput {
	return o.ApplyT(func(v LookupZonesResult) []GetZonesResult { return v.Results }).(GetZonesResultArrayOutput)
}

func (o LookupZonesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupZonesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZonesResultOutput{})
}
