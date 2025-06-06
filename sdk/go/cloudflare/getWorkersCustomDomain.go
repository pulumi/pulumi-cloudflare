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
//			_, err := cloudflare.LookupWorkersCustomDomain(ctx, &cloudflare.LookupWorkersCustomDomainArgs{
//				AccountId: "9a7806061c88ada191ed06f989cc3dac",
//				DomainId:  pulumi.StringRef("dbe10b4bc17c295377eabd600e1787fd"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupWorkersCustomDomain(ctx *pulumi.Context, args *LookupWorkersCustomDomainArgs, opts ...pulumi.InvokeOption) (*LookupWorkersCustomDomainResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWorkersCustomDomainResult
	err := ctx.Invoke("cloudflare:index/getWorkersCustomDomain:getWorkersCustomDomain", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWorkersCustomDomain.
type LookupWorkersCustomDomainArgs struct {
	// Identifer of the account.
	AccountId string `pulumi:"accountId"`
	// Identifer of the Worker Domain.
	DomainId *string                       `pulumi:"domainId"`
	Filter   *GetWorkersCustomDomainFilter `pulumi:"filter"`
}

// A collection of values returned by getWorkersCustomDomain.
type LookupWorkersCustomDomainResult struct {
	// Identifer of the account.
	AccountId string `pulumi:"accountId"`
	// Identifer of the Worker Domain.
	DomainId *string `pulumi:"domainId"`
	// Worker environment associated with the zone and hostname.
	Environment string                        `pulumi:"environment"`
	Filter      *GetWorkersCustomDomainFilter `pulumi:"filter"`
	// Hostname of the Worker Domain.
	Hostname string `pulumi:"hostname"`
	// Identifer of the Worker Domain.
	Id string `pulumi:"id"`
	// Worker service associated with the zone and hostname.
	Service string `pulumi:"service"`
	// Identifier of the zone.
	ZoneId string `pulumi:"zoneId"`
	// Name of the zone.
	ZoneName string `pulumi:"zoneName"`
}

func LookupWorkersCustomDomainOutput(ctx *pulumi.Context, args LookupWorkersCustomDomainOutputArgs, opts ...pulumi.InvokeOption) LookupWorkersCustomDomainResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupWorkersCustomDomainResultOutput, error) {
			args := v.(LookupWorkersCustomDomainArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getWorkersCustomDomain:getWorkersCustomDomain", args, LookupWorkersCustomDomainResultOutput{}, options).(LookupWorkersCustomDomainResultOutput), nil
		}).(LookupWorkersCustomDomainResultOutput)
}

// A collection of arguments for invoking getWorkersCustomDomain.
type LookupWorkersCustomDomainOutputArgs struct {
	// Identifer of the account.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Identifer of the Worker Domain.
	DomainId pulumi.StringPtrInput                `pulumi:"domainId"`
	Filter   GetWorkersCustomDomainFilterPtrInput `pulumi:"filter"`
}

func (LookupWorkersCustomDomainOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkersCustomDomainArgs)(nil)).Elem()
}

// A collection of values returned by getWorkersCustomDomain.
type LookupWorkersCustomDomainResultOutput struct{ *pulumi.OutputState }

func (LookupWorkersCustomDomainResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkersCustomDomainResult)(nil)).Elem()
}

func (o LookupWorkersCustomDomainResultOutput) ToLookupWorkersCustomDomainResultOutput() LookupWorkersCustomDomainResultOutput {
	return o
}

func (o LookupWorkersCustomDomainResultOutput) ToLookupWorkersCustomDomainResultOutputWithContext(ctx context.Context) LookupWorkersCustomDomainResultOutput {
	return o
}

// Identifer of the account.
func (o LookupWorkersCustomDomainResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Identifer of the Worker Domain.
func (o LookupWorkersCustomDomainResultOutput) DomainId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) *string { return v.DomainId }).(pulumi.StringPtrOutput)
}

// Worker environment associated with the zone and hostname.
func (o LookupWorkersCustomDomainResultOutput) Environment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) string { return v.Environment }).(pulumi.StringOutput)
}

func (o LookupWorkersCustomDomainResultOutput) Filter() GetWorkersCustomDomainFilterPtrOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) *GetWorkersCustomDomainFilter { return v.Filter }).(GetWorkersCustomDomainFilterPtrOutput)
}

// Hostname of the Worker Domain.
func (o LookupWorkersCustomDomainResultOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) string { return v.Hostname }).(pulumi.StringOutput)
}

// Identifer of the Worker Domain.
func (o LookupWorkersCustomDomainResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) string { return v.Id }).(pulumi.StringOutput)
}

// Worker service associated with the zone and hostname.
func (o LookupWorkersCustomDomainResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) string { return v.Service }).(pulumi.StringOutput)
}

// Identifier of the zone.
func (o LookupWorkersCustomDomainResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

// Name of the zone.
func (o LookupWorkersCustomDomainResultOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkersCustomDomainResult) string { return v.ZoneName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWorkersCustomDomainResultOutput{})
}
