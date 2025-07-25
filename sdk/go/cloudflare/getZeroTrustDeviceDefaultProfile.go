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
//			_, err := cloudflare.LookupZeroTrustDeviceDefaultProfile(ctx, &cloudflare.LookupZeroTrustDeviceDefaultProfileArgs{
//				AccountId: "699d98642c564d2e855e9661899b7252",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupZeroTrustDeviceDefaultProfile(ctx *pulumi.Context, args *LookupZeroTrustDeviceDefaultProfileArgs, opts ...pulumi.InvokeOption) (*LookupZeroTrustDeviceDefaultProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupZeroTrustDeviceDefaultProfileResult
	err := ctx.Invoke("cloudflare:index/getZeroTrustDeviceDefaultProfile:getZeroTrustDeviceDefaultProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZeroTrustDeviceDefaultProfile.
type LookupZeroTrustDeviceDefaultProfileArgs struct {
	AccountId string `pulumi:"accountId"`
}

// A collection of values returned by getZeroTrustDeviceDefaultProfile.
type LookupZeroTrustDeviceDefaultProfileResult struct {
	AccountId string `pulumi:"accountId"`
	// Whether to allow the user to switch WARP between modes.
	AllowModeSwitch bool `pulumi:"allowModeSwitch"`
	// Whether to receive update notifications when a new version of the client is available.
	AllowUpdates bool `pulumi:"allowUpdates"`
	// Whether to allow devices to leave the organization.
	AllowedToLeave bool `pulumi:"allowedToLeave"`
	// The amount of time in seconds to reconnect after having been disabled.
	AutoConnect float64 `pulumi:"autoConnect"`
	// Turn on the captive portal after the specified amount of time.
	CaptivePortal float64 `pulumi:"captivePortal"`
	// Whether the policy will be applied to matching devices.
	Default bool `pulumi:"default"`
	// If the `dnsServer` field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to `true`.
	DisableAutoFallback bool `pulumi:"disableAutoFallback"`
	// Whether the policy will be applied to matching devices.
	Enabled bool `pulumi:"enabled"`
	// Whether to add Microsoft IPs to Split Tunnel exclusions.
	ExcludeOfficeIps bool `pulumi:"excludeOfficeIps"`
	// List of routes excluded in the WARP client's tunnel.
	Excludes        []GetZeroTrustDeviceDefaultProfileExclude        `pulumi:"excludes"`
	FallbackDomains []GetZeroTrustDeviceDefaultProfileFallbackDomain `pulumi:"fallbackDomains"`
	GatewayUniqueId string                                           `pulumi:"gatewayUniqueId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of routes included in the WARP client's tunnel.
	Includes []GetZeroTrustDeviceDefaultProfileInclude `pulumi:"includes"`
	// Determines if the operating system will register WARP's local interface IP with your on-premises DNS server.
	RegisterInterfaceIpWithDns bool `pulumi:"registerInterfaceIpWithDns"`
	// Determines whether the WARP client indicates to SCCM that it is inside a VPN boundary. (Windows only).
	SccmVpnBoundarySupport bool                                          `pulumi:"sccmVpnBoundarySupport"`
	ServiceModeV2          GetZeroTrustDeviceDefaultProfileServiceModeV2 `pulumi:"serviceModeV2"`
	// The URL to launch when the Send Feedback button is clicked.
	SupportUrl string `pulumi:"supportUrl"`
	// Whether to allow the user to turn off the WARP switch and disconnect the client.
	SwitchLocked bool `pulumi:"switchLocked"`
	// Determines which tunnel protocol to use.
	TunnelProtocol string `pulumi:"tunnelProtocol"`
}

func LookupZeroTrustDeviceDefaultProfileOutput(ctx *pulumi.Context, args LookupZeroTrustDeviceDefaultProfileOutputArgs, opts ...pulumi.InvokeOption) LookupZeroTrustDeviceDefaultProfileResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupZeroTrustDeviceDefaultProfileResultOutput, error) {
			args := v.(LookupZeroTrustDeviceDefaultProfileArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getZeroTrustDeviceDefaultProfile:getZeroTrustDeviceDefaultProfile", args, LookupZeroTrustDeviceDefaultProfileResultOutput{}, options).(LookupZeroTrustDeviceDefaultProfileResultOutput), nil
		}).(LookupZeroTrustDeviceDefaultProfileResultOutput)
}

// A collection of arguments for invoking getZeroTrustDeviceDefaultProfile.
type LookupZeroTrustDeviceDefaultProfileOutputArgs struct {
	AccountId pulumi.StringInput `pulumi:"accountId"`
}

func (LookupZeroTrustDeviceDefaultProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustDeviceDefaultProfileArgs)(nil)).Elem()
}

// A collection of values returned by getZeroTrustDeviceDefaultProfile.
type LookupZeroTrustDeviceDefaultProfileResultOutput struct{ *pulumi.OutputState }

func (LookupZeroTrustDeviceDefaultProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustDeviceDefaultProfileResult)(nil)).Elem()
}

func (o LookupZeroTrustDeviceDefaultProfileResultOutput) ToLookupZeroTrustDeviceDefaultProfileResultOutput() LookupZeroTrustDeviceDefaultProfileResultOutput {
	return o
}

func (o LookupZeroTrustDeviceDefaultProfileResultOutput) ToLookupZeroTrustDeviceDefaultProfileResultOutputWithContext(ctx context.Context) LookupZeroTrustDeviceDefaultProfileResultOutput {
	return o
}

func (o LookupZeroTrustDeviceDefaultProfileResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Whether to allow the user to switch WARP between modes.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) AllowModeSwitch() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.AllowModeSwitch }).(pulumi.BoolOutput)
}

// Whether to receive update notifications when a new version of the client is available.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) AllowUpdates() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.AllowUpdates }).(pulumi.BoolOutput)
}

// Whether to allow devices to leave the organization.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) AllowedToLeave() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.AllowedToLeave }).(pulumi.BoolOutput)
}

// The amount of time in seconds to reconnect after having been disabled.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) AutoConnect() pulumi.Float64Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) float64 { return v.AutoConnect }).(pulumi.Float64Output)
}

// Turn on the captive portal after the specified amount of time.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) CaptivePortal() pulumi.Float64Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) float64 { return v.CaptivePortal }).(pulumi.Float64Output)
}

// Whether the policy will be applied to matching devices.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) Default() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.Default }).(pulumi.BoolOutput)
}

// If the `dnsServer` field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to `true`.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) DisableAutoFallback() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.DisableAutoFallback }).(pulumi.BoolOutput)
}

// Whether the policy will be applied to matching devices.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// Whether to add Microsoft IPs to Split Tunnel exclusions.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) ExcludeOfficeIps() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.ExcludeOfficeIps }).(pulumi.BoolOutput)
}

// List of routes excluded in the WARP client's tunnel.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) Excludes() GetZeroTrustDeviceDefaultProfileExcludeArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) []GetZeroTrustDeviceDefaultProfileExclude {
		return v.Excludes
	}).(GetZeroTrustDeviceDefaultProfileExcludeArrayOutput)
}

func (o LookupZeroTrustDeviceDefaultProfileResultOutput) FallbackDomains() GetZeroTrustDeviceDefaultProfileFallbackDomainArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) []GetZeroTrustDeviceDefaultProfileFallbackDomain {
		return v.FallbackDomains
	}).(GetZeroTrustDeviceDefaultProfileFallbackDomainArrayOutput)
}

func (o LookupZeroTrustDeviceDefaultProfileResultOutput) GatewayUniqueId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) string { return v.GatewayUniqueId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of routes included in the WARP client's tunnel.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) Includes() GetZeroTrustDeviceDefaultProfileIncludeArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) []GetZeroTrustDeviceDefaultProfileInclude {
		return v.Includes
	}).(GetZeroTrustDeviceDefaultProfileIncludeArrayOutput)
}

// Determines if the operating system will register WARP's local interface IP with your on-premises DNS server.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) RegisterInterfaceIpWithDns() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.RegisterInterfaceIpWithDns }).(pulumi.BoolOutput)
}

// Determines whether the WARP client indicates to SCCM that it is inside a VPN boundary. (Windows only).
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) SccmVpnBoundarySupport() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.SccmVpnBoundarySupport }).(pulumi.BoolOutput)
}

func (o LookupZeroTrustDeviceDefaultProfileResultOutput) ServiceModeV2() GetZeroTrustDeviceDefaultProfileServiceModeV2Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) GetZeroTrustDeviceDefaultProfileServiceModeV2 {
		return v.ServiceModeV2
	}).(GetZeroTrustDeviceDefaultProfileServiceModeV2Output)
}

// The URL to launch when the Send Feedback button is clicked.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) SupportUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) string { return v.SupportUrl }).(pulumi.StringOutput)
}

// Whether to allow the user to turn off the WARP switch and disconnect the client.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) SwitchLocked() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) bool { return v.SwitchLocked }).(pulumi.BoolOutput)
}

// Determines which tunnel protocol to use.
func (o LookupZeroTrustDeviceDefaultProfileResultOutput) TunnelProtocol() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceDefaultProfileResult) string { return v.TunnelProtocol }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZeroTrustDeviceDefaultProfileResultOutput{})
}
