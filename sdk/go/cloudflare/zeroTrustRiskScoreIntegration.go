// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The [Risk Score Integration](https://developers.cloudflare.com/cloudflare-one/insights/risk-score/#send-risk-score-to-okta) resource allows you to transmit changes in User Risk Score to a specified vendor such as Okta.
type ZeroTrustRiskScoreIntegration struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
	Active pulumi.BoolOutput `pulumi:"active"`
	// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
	IntegrationType pulumi.StringOutput `pulumi:"integrationType"`
	// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
	ReferenceId pulumi.StringOutput `pulumi:"referenceId"`
	// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
	TenantUrl pulumi.StringOutput `pulumi:"tenantUrl"`
	// The URL for the Shared Signals Framework configuration, e.g. '/.well-known/sse-configuration/{integration*uuid}/'. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1
	WellKnownUrl pulumi.StringOutput `pulumi:"wellKnownUrl"`
}

// NewZeroTrustRiskScoreIntegration registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustRiskScoreIntegration(ctx *pulumi.Context,
	name string, args *ZeroTrustRiskScoreIntegrationArgs, opts ...pulumi.ResourceOption) (*ZeroTrustRiskScoreIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.IntegrationType == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationType'")
	}
	if args.TenantUrl == nil {
		return nil, errors.New("invalid value for required argument 'TenantUrl'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustRiskScoreIntegration
	err := ctx.RegisterResource("cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustRiskScoreIntegration gets an existing ZeroTrustRiskScoreIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustRiskScoreIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustRiskScoreIntegrationState, opts ...pulumi.ResourceOption) (*ZeroTrustRiskScoreIntegration, error) {
	var resource ZeroTrustRiskScoreIntegration
	err := ctx.ReadResource("cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustRiskScoreIntegration resources.
type zeroTrustRiskScoreIntegrationState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
	Active *bool `pulumi:"active"`
	// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
	IntegrationType *string `pulumi:"integrationType"`
	// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
	ReferenceId *string `pulumi:"referenceId"`
	// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
	TenantUrl *string `pulumi:"tenantUrl"`
	// The URL for the Shared Signals Framework configuration, e.g. '/.well-known/sse-configuration/{integration*uuid}/'. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1
	WellKnownUrl *string `pulumi:"wellKnownUrl"`
}

type ZeroTrustRiskScoreIntegrationState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
	Active pulumi.BoolPtrInput
	// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
	IntegrationType pulumi.StringPtrInput
	// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
	ReferenceId pulumi.StringPtrInput
	// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
	TenantUrl pulumi.StringPtrInput
	// The URL for the Shared Signals Framework configuration, e.g. '/.well-known/sse-configuration/{integration*uuid}/'. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1
	WellKnownUrl pulumi.StringPtrInput
}

func (ZeroTrustRiskScoreIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustRiskScoreIntegrationState)(nil)).Elem()
}

type zeroTrustRiskScoreIntegrationArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
	Active *bool `pulumi:"active"`
	// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
	IntegrationType string `pulumi:"integrationType"`
	// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
	ReferenceId *string `pulumi:"referenceId"`
	// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
	TenantUrl string `pulumi:"tenantUrl"`
}

// The set of arguments for constructing a ZeroTrustRiskScoreIntegration resource.
type ZeroTrustRiskScoreIntegrationArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
	Active pulumi.BoolPtrInput
	// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
	IntegrationType pulumi.StringInput
	// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
	ReferenceId pulumi.StringPtrInput
	// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
	TenantUrl pulumi.StringInput
}

func (ZeroTrustRiskScoreIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustRiskScoreIntegrationArgs)(nil)).Elem()
}

type ZeroTrustRiskScoreIntegrationInput interface {
	pulumi.Input

	ToZeroTrustRiskScoreIntegrationOutput() ZeroTrustRiskScoreIntegrationOutput
	ToZeroTrustRiskScoreIntegrationOutputWithContext(ctx context.Context) ZeroTrustRiskScoreIntegrationOutput
}

func (*ZeroTrustRiskScoreIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustRiskScoreIntegration)(nil)).Elem()
}

func (i *ZeroTrustRiskScoreIntegration) ToZeroTrustRiskScoreIntegrationOutput() ZeroTrustRiskScoreIntegrationOutput {
	return i.ToZeroTrustRiskScoreIntegrationOutputWithContext(context.Background())
}

func (i *ZeroTrustRiskScoreIntegration) ToZeroTrustRiskScoreIntegrationOutputWithContext(ctx context.Context) ZeroTrustRiskScoreIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustRiskScoreIntegrationOutput)
}

// ZeroTrustRiskScoreIntegrationArrayInput is an input type that accepts ZeroTrustRiskScoreIntegrationArray and ZeroTrustRiskScoreIntegrationArrayOutput values.
// You can construct a concrete instance of `ZeroTrustRiskScoreIntegrationArrayInput` via:
//
//	ZeroTrustRiskScoreIntegrationArray{ ZeroTrustRiskScoreIntegrationArgs{...} }
type ZeroTrustRiskScoreIntegrationArrayInput interface {
	pulumi.Input

	ToZeroTrustRiskScoreIntegrationArrayOutput() ZeroTrustRiskScoreIntegrationArrayOutput
	ToZeroTrustRiskScoreIntegrationArrayOutputWithContext(context.Context) ZeroTrustRiskScoreIntegrationArrayOutput
}

type ZeroTrustRiskScoreIntegrationArray []ZeroTrustRiskScoreIntegrationInput

func (ZeroTrustRiskScoreIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustRiskScoreIntegration)(nil)).Elem()
}

func (i ZeroTrustRiskScoreIntegrationArray) ToZeroTrustRiskScoreIntegrationArrayOutput() ZeroTrustRiskScoreIntegrationArrayOutput {
	return i.ToZeroTrustRiskScoreIntegrationArrayOutputWithContext(context.Background())
}

func (i ZeroTrustRiskScoreIntegrationArray) ToZeroTrustRiskScoreIntegrationArrayOutputWithContext(ctx context.Context) ZeroTrustRiskScoreIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustRiskScoreIntegrationArrayOutput)
}

// ZeroTrustRiskScoreIntegrationMapInput is an input type that accepts ZeroTrustRiskScoreIntegrationMap and ZeroTrustRiskScoreIntegrationMapOutput values.
// You can construct a concrete instance of `ZeroTrustRiskScoreIntegrationMapInput` via:
//
//	ZeroTrustRiskScoreIntegrationMap{ "key": ZeroTrustRiskScoreIntegrationArgs{...} }
type ZeroTrustRiskScoreIntegrationMapInput interface {
	pulumi.Input

	ToZeroTrustRiskScoreIntegrationMapOutput() ZeroTrustRiskScoreIntegrationMapOutput
	ToZeroTrustRiskScoreIntegrationMapOutputWithContext(context.Context) ZeroTrustRiskScoreIntegrationMapOutput
}

type ZeroTrustRiskScoreIntegrationMap map[string]ZeroTrustRiskScoreIntegrationInput

func (ZeroTrustRiskScoreIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustRiskScoreIntegration)(nil)).Elem()
}

func (i ZeroTrustRiskScoreIntegrationMap) ToZeroTrustRiskScoreIntegrationMapOutput() ZeroTrustRiskScoreIntegrationMapOutput {
	return i.ToZeroTrustRiskScoreIntegrationMapOutputWithContext(context.Background())
}

func (i ZeroTrustRiskScoreIntegrationMap) ToZeroTrustRiskScoreIntegrationMapOutputWithContext(ctx context.Context) ZeroTrustRiskScoreIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustRiskScoreIntegrationMapOutput)
}

type ZeroTrustRiskScoreIntegrationOutput struct{ *pulumi.OutputState }

func (ZeroTrustRiskScoreIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustRiskScoreIntegration)(nil)).Elem()
}

func (o ZeroTrustRiskScoreIntegrationOutput) ToZeroTrustRiskScoreIntegrationOutput() ZeroTrustRiskScoreIntegrationOutput {
	return o
}

func (o ZeroTrustRiskScoreIntegrationOutput) ToZeroTrustRiskScoreIntegrationOutputWithContext(ctx context.Context) ZeroTrustRiskScoreIntegrationOutput {
	return o
}

// The account identifier to target for the resource.
func (o ZeroTrustRiskScoreIntegrationOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustRiskScoreIntegration) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
func (o ZeroTrustRiskScoreIntegrationOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v *ZeroTrustRiskScoreIntegration) pulumi.BoolOutput { return v.Active }).(pulumi.BoolOutput)
}

// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
func (o ZeroTrustRiskScoreIntegrationOutput) IntegrationType() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustRiskScoreIntegration) pulumi.StringOutput { return v.IntegrationType }).(pulumi.StringOutput)
}

// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
func (o ZeroTrustRiskScoreIntegrationOutput) ReferenceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustRiskScoreIntegration) pulumi.StringOutput { return v.ReferenceId }).(pulumi.StringOutput)
}

// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
func (o ZeroTrustRiskScoreIntegrationOutput) TenantUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustRiskScoreIntegration) pulumi.StringOutput { return v.TenantUrl }).(pulumi.StringOutput)
}

// The URL for the Shared Signals Framework configuration, e.g. '/.well-known/sse-configuration/{integration*uuid}/'. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1
func (o ZeroTrustRiskScoreIntegrationOutput) WellKnownUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustRiskScoreIntegration) pulumi.StringOutput { return v.WellKnownUrl }).(pulumi.StringOutput)
}

type ZeroTrustRiskScoreIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustRiskScoreIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustRiskScoreIntegration)(nil)).Elem()
}

func (o ZeroTrustRiskScoreIntegrationArrayOutput) ToZeroTrustRiskScoreIntegrationArrayOutput() ZeroTrustRiskScoreIntegrationArrayOutput {
	return o
}

func (o ZeroTrustRiskScoreIntegrationArrayOutput) ToZeroTrustRiskScoreIntegrationArrayOutputWithContext(ctx context.Context) ZeroTrustRiskScoreIntegrationArrayOutput {
	return o
}

func (o ZeroTrustRiskScoreIntegrationArrayOutput) Index(i pulumi.IntInput) ZeroTrustRiskScoreIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustRiskScoreIntegration {
		return vs[0].([]*ZeroTrustRiskScoreIntegration)[vs[1].(int)]
	}).(ZeroTrustRiskScoreIntegrationOutput)
}

type ZeroTrustRiskScoreIntegrationMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustRiskScoreIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustRiskScoreIntegration)(nil)).Elem()
}

func (o ZeroTrustRiskScoreIntegrationMapOutput) ToZeroTrustRiskScoreIntegrationMapOutput() ZeroTrustRiskScoreIntegrationMapOutput {
	return o
}

func (o ZeroTrustRiskScoreIntegrationMapOutput) ToZeroTrustRiskScoreIntegrationMapOutputWithContext(ctx context.Context) ZeroTrustRiskScoreIntegrationMapOutput {
	return o
}

func (o ZeroTrustRiskScoreIntegrationMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustRiskScoreIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustRiskScoreIntegration {
		return vs[0].(map[string]*ZeroTrustRiskScoreIntegration)[vs[1].(string)]
	}).(ZeroTrustRiskScoreIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustRiskScoreIntegrationInput)(nil)).Elem(), &ZeroTrustRiskScoreIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustRiskScoreIntegrationArrayInput)(nil)).Elem(), ZeroTrustRiskScoreIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustRiskScoreIntegrationMapInput)(nil)).Elem(), ZeroTrustRiskScoreIntegrationMap{})
	pulumi.RegisterOutputType(ZeroTrustRiskScoreIntegrationOutput{})
	pulumi.RegisterOutputType(ZeroTrustRiskScoreIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustRiskScoreIntegrationMapOutput{})
}
