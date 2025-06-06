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
//			_, err := cloudflare.LookupHealthcheck(ctx, &cloudflare.LookupHealthcheckArgs{
//				ZoneId:        "023e105f4ecef8ad9ca31a8372d0c353",
//				HealthcheckId: pulumi.StringRef("023e105f4ecef8ad9ca31a8372d0c353"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupHealthcheck(ctx *pulumi.Context, args *LookupHealthcheckArgs, opts ...pulumi.InvokeOption) (*LookupHealthcheckResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupHealthcheckResult
	err := ctx.Invoke("cloudflare:index/getHealthcheck:getHealthcheck", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHealthcheck.
type LookupHealthcheckArgs struct {
	// Identifier
	HealthcheckId *string `pulumi:"healthcheckId"`
	// Identifier
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getHealthcheck.
type LookupHealthcheckResult struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address string `pulumi:"address"`
	// A list of regions from which to run health checks. Null means Cloudflare will pick a default region.
	CheckRegions []string `pulumi:"checkRegions"`
	// The number of consecutive fails required from a health check before changing the health to unhealthy.
	ConsecutiveFails int `pulumi:"consecutiveFails"`
	// The number of consecutive successes required from a health check before changing the health to healthy.
	ConsecutiveSuccesses int    `pulumi:"consecutiveSuccesses"`
	CreatedOn            string `pulumi:"createdOn"`
	// A human-readable description of the health check.
	Description string `pulumi:"description"`
	// The current failure reason if status is unhealthy.
	FailureReason string `pulumi:"failureReason"`
	// Identifier
	HealthcheckId *string `pulumi:"healthcheckId"`
	// Parameters specific to an HTTP or HTTPS health check.
	HttpConfig GetHealthcheckHttpConfig `pulumi:"httpConfig"`
	// Identifier
	Id string `pulumi:"id"`
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations.
	Interval   int    `pulumi:"interval"`
	ModifiedOn string `pulumi:"modifiedOn"`
	// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
	Name string `pulumi:"name"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
	Retries int `pulumi:"retries"`
	// The current status of the origin server according to the health check.
	// Available values: "unknown", "healthy", "unhealthy", "suspended".
	Status string `pulumi:"status"`
	// If suspended, no health checks are sent to the origin.
	Suspended bool `pulumi:"suspended"`
	// Parameters specific to TCP health check.
	TcpConfig GetHealthcheckTcpConfig `pulumi:"tcpConfig"`
	// The timeout (in seconds) before marking the health check as failed.
	Timeout int `pulumi:"timeout"`
	// The protocol to use for the health check. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'.
	Type string `pulumi:"type"`
	// Identifier
	ZoneId string `pulumi:"zoneId"`
}

func LookupHealthcheckOutput(ctx *pulumi.Context, args LookupHealthcheckOutputArgs, opts ...pulumi.InvokeOption) LookupHealthcheckResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupHealthcheckResultOutput, error) {
			args := v.(LookupHealthcheckArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getHealthcheck:getHealthcheck", args, LookupHealthcheckResultOutput{}, options).(LookupHealthcheckResultOutput), nil
		}).(LookupHealthcheckResultOutput)
}

// A collection of arguments for invoking getHealthcheck.
type LookupHealthcheckOutputArgs struct {
	// Identifier
	HealthcheckId pulumi.StringPtrInput `pulumi:"healthcheckId"`
	// Identifier
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupHealthcheckOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHealthcheckArgs)(nil)).Elem()
}

// A collection of values returned by getHealthcheck.
type LookupHealthcheckResultOutput struct{ *pulumi.OutputState }

func (LookupHealthcheckResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHealthcheckResult)(nil)).Elem()
}

func (o LookupHealthcheckResultOutput) ToLookupHealthcheckResultOutput() LookupHealthcheckResultOutput {
	return o
}

func (o LookupHealthcheckResultOutput) ToLookupHealthcheckResultOutputWithContext(ctx context.Context) LookupHealthcheckResultOutput {
	return o
}

// The hostname or IP address of the origin server to run health checks on.
func (o LookupHealthcheckResultOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.Address }).(pulumi.StringOutput)
}

// A list of regions from which to run health checks. Null means Cloudflare will pick a default region.
func (o LookupHealthcheckResultOutput) CheckRegions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) []string { return v.CheckRegions }).(pulumi.StringArrayOutput)
}

// The number of consecutive fails required from a health check before changing the health to unhealthy.
func (o LookupHealthcheckResultOutput) ConsecutiveFails() pulumi.IntOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) int { return v.ConsecutiveFails }).(pulumi.IntOutput)
}

// The number of consecutive successes required from a health check before changing the health to healthy.
func (o LookupHealthcheckResultOutput) ConsecutiveSuccesses() pulumi.IntOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) int { return v.ConsecutiveSuccesses }).(pulumi.IntOutput)
}

func (o LookupHealthcheckResultOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.CreatedOn }).(pulumi.StringOutput)
}

// A human-readable description of the health check.
func (o LookupHealthcheckResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.Description }).(pulumi.StringOutput)
}

// The current failure reason if status is unhealthy.
func (o LookupHealthcheckResultOutput) FailureReason() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.FailureReason }).(pulumi.StringOutput)
}

// Identifier
func (o LookupHealthcheckResultOutput) HealthcheckId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) *string { return v.HealthcheckId }).(pulumi.StringPtrOutput)
}

// Parameters specific to an HTTP or HTTPS health check.
func (o LookupHealthcheckResultOutput) HttpConfig() GetHealthcheckHttpConfigOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) GetHealthcheckHttpConfig { return v.HttpConfig }).(GetHealthcheckHttpConfigOutput)
}

// Identifier
func (o LookupHealthcheckResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.Id }).(pulumi.StringOutput)
}

// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations.
func (o LookupHealthcheckResultOutput) Interval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) int { return v.Interval }).(pulumi.IntOutput)
}

func (o LookupHealthcheckResultOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.ModifiedOn }).(pulumi.StringOutput)
}

// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
func (o LookupHealthcheckResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.Name }).(pulumi.StringOutput)
}

// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
func (o LookupHealthcheckResultOutput) Retries() pulumi.IntOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) int { return v.Retries }).(pulumi.IntOutput)
}

// The current status of the origin server according to the health check.
// Available values: "unknown", "healthy", "unhealthy", "suspended".
func (o LookupHealthcheckResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.Status }).(pulumi.StringOutput)
}

// If suspended, no health checks are sent to the origin.
func (o LookupHealthcheckResultOutput) Suspended() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) bool { return v.Suspended }).(pulumi.BoolOutput)
}

// Parameters specific to TCP health check.
func (o LookupHealthcheckResultOutput) TcpConfig() GetHealthcheckTcpConfigOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) GetHealthcheckTcpConfig { return v.TcpConfig }).(GetHealthcheckTcpConfigOutput)
}

// The timeout (in seconds) before marking the health check as failed.
func (o LookupHealthcheckResultOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) int { return v.Timeout }).(pulumi.IntOutput)
}

// The protocol to use for the health check. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'.
func (o LookupHealthcheckResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.Type }).(pulumi.StringOutput)
}

// Identifier
func (o LookupHealthcheckResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHealthcheckResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHealthcheckResultOutput{})
}
