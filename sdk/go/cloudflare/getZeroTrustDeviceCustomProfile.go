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
//			_, err := cloudflare.LookupZeroTrustDeviceCustomProfile(ctx, &cloudflare.LookupZeroTrustDeviceCustomProfileArgs{
//				AccountId: "699d98642c564d2e855e9661899b7252",
//				PolicyId:  pulumi.StringRef("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupZeroTrustDeviceCustomProfile(ctx *pulumi.Context, args *LookupZeroTrustDeviceCustomProfileArgs, opts ...pulumi.InvokeOption) (*LookupZeroTrustDeviceCustomProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupZeroTrustDeviceCustomProfileResult
	err := ctx.Invoke("cloudflare:index/getZeroTrustDeviceCustomProfile:getZeroTrustDeviceCustomProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZeroTrustDeviceCustomProfile.
type LookupZeroTrustDeviceCustomProfileArgs struct {
	AccountId string  `pulumi:"accountId"`
	PolicyId  *string `pulumi:"policyId"`
}

// A collection of values returned by getZeroTrustDeviceCustomProfile.
type LookupZeroTrustDeviceCustomProfileResult struct {
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
	// Whether the policy is the default policy for an account.
	Default bool `pulumi:"default"`
	// A description of the policy.
	Description string `pulumi:"description"`
	// If the `dnsServer` field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to `true`.
	DisableAutoFallback bool `pulumi:"disableAutoFallback"`
	// Whether the policy will be applied to matching devices.
	Enabled bool `pulumi:"enabled"`
	// Whether to add Microsoft IPs to Split Tunnel exclusions.
	ExcludeOfficeIps bool `pulumi:"excludeOfficeIps"`
	// List of routes excluded in the WARP client's tunnel.
	Excludes        []GetZeroTrustDeviceCustomProfileExclude        `pulumi:"excludes"`
	FallbackDomains []GetZeroTrustDeviceCustomProfileFallbackDomain `pulumi:"fallbackDomains"`
	GatewayUniqueId string                                          `pulumi:"gatewayUniqueId"`
	// The ID of this resource.
	Id string `pulumi:"id"`
	// List of routes included in the WARP client's tunnel.
	Includes []GetZeroTrustDeviceCustomProfileInclude `pulumi:"includes"`
	// The amount of time in minutes a user is allowed access to their LAN. A value of 0 will allow LAN access until the next WARP reconnection, such as a reboot or a laptop waking from sleep. Note that this field is omitted from the response if null or unset.
	LanAllowMinutes float64 `pulumi:"lanAllowMinutes"`
	// The size of the subnet for the local access network. Note that this field is omitted from the response if null or unset.
	LanAllowSubnetSize float64 `pulumi:"lanAllowSubnetSize"`
	// The wirefilter expression to match devices. Available values: "identity.email", "identity.groups.id", "identity.groups.name", "identity.groups.email", "identity.service*token*uuid", "identity.saml_attributes", "network", "os.name", "os.version".
	Match string `pulumi:"match"`
	// The name of the device settings profile.
	Name     string `pulumi:"name"`
	PolicyId string `pulumi:"policyId"`
	// The precedence of the policy. Lower values indicate higher precedence. Policies will be evaluated in ascending order of this field.
	Precedence float64 `pulumi:"precedence"`
	// Determines if the operating system will register WARP's local interface IP with your on-premises DNS server.
	RegisterInterfaceIpWithDns bool `pulumi:"registerInterfaceIpWithDns"`
	// Determines whether the WARP client indicates to SCCM that it is inside a VPN boundary. (Windows only).
	SccmVpnBoundarySupport bool                                         `pulumi:"sccmVpnBoundarySupport"`
	ServiceModeV2          GetZeroTrustDeviceCustomProfileServiceModeV2 `pulumi:"serviceModeV2"`
	// The URL to launch when the Send Feedback button is clicked.
	SupportUrl string `pulumi:"supportUrl"`
	// Whether to allow the user to turn off the WARP switch and disconnect the client.
	SwitchLocked bool                                        `pulumi:"switchLocked"`
	TargetTests  []GetZeroTrustDeviceCustomProfileTargetTest `pulumi:"targetTests"`
	// Determines which tunnel protocol to use.
	TunnelProtocol string `pulumi:"tunnelProtocol"`
}

func LookupZeroTrustDeviceCustomProfileOutput(ctx *pulumi.Context, args LookupZeroTrustDeviceCustomProfileOutputArgs, opts ...pulumi.InvokeOption) LookupZeroTrustDeviceCustomProfileResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupZeroTrustDeviceCustomProfileResultOutput, error) {
			args := v.(LookupZeroTrustDeviceCustomProfileArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getZeroTrustDeviceCustomProfile:getZeroTrustDeviceCustomProfile", args, LookupZeroTrustDeviceCustomProfileResultOutput{}, options).(LookupZeroTrustDeviceCustomProfileResultOutput), nil
		}).(LookupZeroTrustDeviceCustomProfileResultOutput)
}

// A collection of arguments for invoking getZeroTrustDeviceCustomProfile.
type LookupZeroTrustDeviceCustomProfileOutputArgs struct {
	AccountId pulumi.StringInput    `pulumi:"accountId"`
	PolicyId  pulumi.StringPtrInput `pulumi:"policyId"`
}

func (LookupZeroTrustDeviceCustomProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustDeviceCustomProfileArgs)(nil)).Elem()
}

// A collection of values returned by getZeroTrustDeviceCustomProfile.
type LookupZeroTrustDeviceCustomProfileResultOutput struct{ *pulumi.OutputState }

func (LookupZeroTrustDeviceCustomProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustDeviceCustomProfileResult)(nil)).Elem()
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) ToLookupZeroTrustDeviceCustomProfileResultOutput() LookupZeroTrustDeviceCustomProfileResultOutput {
	return o
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) ToLookupZeroTrustDeviceCustomProfileResultOutputWithContext(ctx context.Context) LookupZeroTrustDeviceCustomProfileResultOutput {
	return o
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Whether to allow the user to switch WARP between modes.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) AllowModeSwitch() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.AllowModeSwitch }).(pulumi.BoolOutput)
}

// Whether to receive update notifications when a new version of the client is available.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) AllowUpdates() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.AllowUpdates }).(pulumi.BoolOutput)
}

// Whether to allow devices to leave the organization.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) AllowedToLeave() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.AllowedToLeave }).(pulumi.BoolOutput)
}

// The amount of time in seconds to reconnect after having been disabled.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) AutoConnect() pulumi.Float64Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) float64 { return v.AutoConnect }).(pulumi.Float64Output)
}

// Turn on the captive portal after the specified amount of time.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) CaptivePortal() pulumi.Float64Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) float64 { return v.CaptivePortal }).(pulumi.Float64Output)
}

// Whether the policy is the default policy for an account.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Default() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.Default }).(pulumi.BoolOutput)
}

// A description of the policy.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.Description }).(pulumi.StringOutput)
}

// If the `dnsServer` field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to `true`.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) DisableAutoFallback() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.DisableAutoFallback }).(pulumi.BoolOutput)
}

// Whether the policy will be applied to matching devices.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// Whether to add Microsoft IPs to Split Tunnel exclusions.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) ExcludeOfficeIps() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.ExcludeOfficeIps }).(pulumi.BoolOutput)
}

// List of routes excluded in the WARP client's tunnel.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Excludes() GetZeroTrustDeviceCustomProfileExcludeArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) []GetZeroTrustDeviceCustomProfileExclude {
		return v.Excludes
	}).(GetZeroTrustDeviceCustomProfileExcludeArrayOutput)
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) FallbackDomains() GetZeroTrustDeviceCustomProfileFallbackDomainArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) []GetZeroTrustDeviceCustomProfileFallbackDomain {
		return v.FallbackDomains
	}).(GetZeroTrustDeviceCustomProfileFallbackDomainArrayOutput)
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) GatewayUniqueId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.GatewayUniqueId }).(pulumi.StringOutput)
}

// The ID of this resource.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of routes included in the WARP client's tunnel.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Includes() GetZeroTrustDeviceCustomProfileIncludeArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) []GetZeroTrustDeviceCustomProfileInclude {
		return v.Includes
	}).(GetZeroTrustDeviceCustomProfileIncludeArrayOutput)
}

// The amount of time in minutes a user is allowed access to their LAN. A value of 0 will allow LAN access until the next WARP reconnection, such as a reboot or a laptop waking from sleep. Note that this field is omitted from the response if null or unset.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) LanAllowMinutes() pulumi.Float64Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) float64 { return v.LanAllowMinutes }).(pulumi.Float64Output)
}

// The size of the subnet for the local access network. Note that this field is omitted from the response if null or unset.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) LanAllowSubnetSize() pulumi.Float64Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) float64 { return v.LanAllowSubnetSize }).(pulumi.Float64Output)
}

// The wirefilter expression to match devices. Available values: "identity.email", "identity.groups.id", "identity.groups.name", "identity.groups.email", "identity.service*token*uuid", "identity.saml_attributes", "network", "os.name", "os.version".
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Match() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.Match }).(pulumi.StringOutput)
}

// The name of the device settings profile.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) PolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.PolicyId }).(pulumi.StringOutput)
}

// The precedence of the policy. Lower values indicate higher precedence. Policies will be evaluated in ascending order of this field.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) Precedence() pulumi.Float64Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) float64 { return v.Precedence }).(pulumi.Float64Output)
}

// Determines if the operating system will register WARP's local interface IP with your on-premises DNS server.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) RegisterInterfaceIpWithDns() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.RegisterInterfaceIpWithDns }).(pulumi.BoolOutput)
}

// Determines whether the WARP client indicates to SCCM that it is inside a VPN boundary. (Windows only).
func (o LookupZeroTrustDeviceCustomProfileResultOutput) SccmVpnBoundarySupport() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.SccmVpnBoundarySupport }).(pulumi.BoolOutput)
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) ServiceModeV2() GetZeroTrustDeviceCustomProfileServiceModeV2Output {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) GetZeroTrustDeviceCustomProfileServiceModeV2 {
		return v.ServiceModeV2
	}).(GetZeroTrustDeviceCustomProfileServiceModeV2Output)
}

// The URL to launch when the Send Feedback button is clicked.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) SupportUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.SupportUrl }).(pulumi.StringOutput)
}

// Whether to allow the user to turn off the WARP switch and disconnect the client.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) SwitchLocked() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) bool { return v.SwitchLocked }).(pulumi.BoolOutput)
}

func (o LookupZeroTrustDeviceCustomProfileResultOutput) TargetTests() GetZeroTrustDeviceCustomProfileTargetTestArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) []GetZeroTrustDeviceCustomProfileTargetTest {
		return v.TargetTests
	}).(GetZeroTrustDeviceCustomProfileTargetTestArrayOutput)
}

// Determines which tunnel protocol to use.
func (o LookupZeroTrustDeviceCustomProfileResultOutput) TunnelProtocol() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDeviceCustomProfileResult) string { return v.TunnelProtocol }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZeroTrustDeviceCustomProfileResultOutput{})
}
