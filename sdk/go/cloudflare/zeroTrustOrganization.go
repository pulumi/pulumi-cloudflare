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
type ZeroTrustOrganization struct {
	pulumi.CustomResourceState

	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp pulumi.BoolPtrOutput `pulumi:"allowAuthenticateViaWarp"`
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain pulumi.StringPtrOutput `pulumi:"authDomain"`
	// When set to `true`, users skip the identity provider selection step during login.
	AutoRedirectToIdentity pulumi.BoolOutput                         `pulumi:"autoRedirectToIdentity"`
	CreatedAt              pulumi.StringOutput                       `pulumi:"createdAt"`
	CustomPages            ZeroTrustOrganizationCustomPagesPtrOutput `pulumi:"customPages"`
	IsUiReadOnly           pulumi.BoolPtrOutput                      `pulumi:"isUiReadOnly"`
	LoginDesign            ZeroTrustOrganizationLoginDesignPtrOutput `pulumi:"loginDesign"`
	// The name of your Zero Trust organization.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration pulumi.StringPtrOutput `pulumi:"sessionDuration"`
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason pulumi.StringPtrOutput `pulumi:"uiReadOnlyToggleReason"`
	UpdatedAt              pulumi.StringOutput    `pulumi:"updatedAt"`
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
	UserSeatExpirationInactiveTime pulumi.StringPtrOutput `pulumi:"userSeatExpirationInactiveTime"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
	WarpAuthSessionDuration pulumi.StringPtrOutput `pulumi:"warpAuthSessionDuration"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewZeroTrustOrganization registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustOrganization(ctx *pulumi.Context,
	name string, args *ZeroTrustOrganizationArgs, opts ...pulumi.ResourceOption) (*ZeroTrustOrganization, error) {
	if args == nil {
		args = &ZeroTrustOrganizationArgs{}
	}

	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("cloudflare:index/accessOrganization:AccessOrganization"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustOrganization
	err := ctx.RegisterResource("cloudflare:index/zeroTrustOrganization:ZeroTrustOrganization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustOrganization gets an existing ZeroTrustOrganization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustOrganization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustOrganizationState, opts ...pulumi.ResourceOption) (*ZeroTrustOrganization, error) {
	var resource ZeroTrustOrganization
	err := ctx.ReadResource("cloudflare:index/zeroTrustOrganization:ZeroTrustOrganization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustOrganization resources.
type zeroTrustOrganizationState struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId *string `pulumi:"accountId"`
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp *bool `pulumi:"allowAuthenticateViaWarp"`
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain *string `pulumi:"authDomain"`
	// When set to `true`, users skip the identity provider selection step during login.
	AutoRedirectToIdentity *bool                             `pulumi:"autoRedirectToIdentity"`
	CreatedAt              *string                           `pulumi:"createdAt"`
	CustomPages            *ZeroTrustOrganizationCustomPages `pulumi:"customPages"`
	IsUiReadOnly           *bool                             `pulumi:"isUiReadOnly"`
	LoginDesign            *ZeroTrustOrganizationLoginDesign `pulumi:"loginDesign"`
	// The name of your Zero Trust organization.
	Name *string `pulumi:"name"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration *string `pulumi:"sessionDuration"`
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason *string `pulumi:"uiReadOnlyToggleReason"`
	UpdatedAt              *string `pulumi:"updatedAt"`
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
	UserSeatExpirationInactiveTime *string `pulumi:"userSeatExpirationInactiveTime"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
	WarpAuthSessionDuration *string `pulumi:"warpAuthSessionDuration"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId *string `pulumi:"zoneId"`
}

type ZeroTrustOrganizationState struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrInput
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp pulumi.BoolPtrInput
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain pulumi.StringPtrInput
	// When set to `true`, users skip the identity provider selection step during login.
	AutoRedirectToIdentity pulumi.BoolPtrInput
	CreatedAt              pulumi.StringPtrInput
	CustomPages            ZeroTrustOrganizationCustomPagesPtrInput
	IsUiReadOnly           pulumi.BoolPtrInput
	LoginDesign            ZeroTrustOrganizationLoginDesignPtrInput
	// The name of your Zero Trust organization.
	Name pulumi.StringPtrInput
	// The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration pulumi.StringPtrInput
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason pulumi.StringPtrInput
	UpdatedAt              pulumi.StringPtrInput
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
	UserSeatExpirationInactiveTime pulumi.StringPtrInput
	// The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
	WarpAuthSessionDuration pulumi.StringPtrInput
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustOrganizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustOrganizationState)(nil)).Elem()
}

type zeroTrustOrganizationArgs struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId *string `pulumi:"accountId"`
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp *bool `pulumi:"allowAuthenticateViaWarp"`
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain *string `pulumi:"authDomain"`
	// When set to `true`, users skip the identity provider selection step during login.
	AutoRedirectToIdentity *bool                             `pulumi:"autoRedirectToIdentity"`
	CustomPages            *ZeroTrustOrganizationCustomPages `pulumi:"customPages"`
	IsUiReadOnly           *bool                             `pulumi:"isUiReadOnly"`
	LoginDesign            *ZeroTrustOrganizationLoginDesign `pulumi:"loginDesign"`
	// The name of your Zero Trust organization.
	Name *string `pulumi:"name"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration *string `pulumi:"sessionDuration"`
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason *string `pulumi:"uiReadOnlyToggleReason"`
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
	UserSeatExpirationInactiveTime *string `pulumi:"userSeatExpirationInactiveTime"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
	WarpAuthSessionDuration *string `pulumi:"warpAuthSessionDuration"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ZeroTrustOrganization resource.
type ZeroTrustOrganizationArgs struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrInput
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp pulumi.BoolPtrInput
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain pulumi.StringPtrInput
	// When set to `true`, users skip the identity provider selection step during login.
	AutoRedirectToIdentity pulumi.BoolPtrInput
	CustomPages            ZeroTrustOrganizationCustomPagesPtrInput
	IsUiReadOnly           pulumi.BoolPtrInput
	LoginDesign            ZeroTrustOrganizationLoginDesignPtrInput
	// The name of your Zero Trust organization.
	Name pulumi.StringPtrInput
	// The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration pulumi.StringPtrInput
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason pulumi.StringPtrInput
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
	UserSeatExpirationInactiveTime pulumi.StringPtrInput
	// The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
	WarpAuthSessionDuration pulumi.StringPtrInput
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustOrganizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustOrganizationArgs)(nil)).Elem()
}

type ZeroTrustOrganizationInput interface {
	pulumi.Input

	ToZeroTrustOrganizationOutput() ZeroTrustOrganizationOutput
	ToZeroTrustOrganizationOutputWithContext(ctx context.Context) ZeroTrustOrganizationOutput
}

func (*ZeroTrustOrganization) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustOrganization)(nil)).Elem()
}

func (i *ZeroTrustOrganization) ToZeroTrustOrganizationOutput() ZeroTrustOrganizationOutput {
	return i.ToZeroTrustOrganizationOutputWithContext(context.Background())
}

func (i *ZeroTrustOrganization) ToZeroTrustOrganizationOutputWithContext(ctx context.Context) ZeroTrustOrganizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustOrganizationOutput)
}

// ZeroTrustOrganizationArrayInput is an input type that accepts ZeroTrustOrganizationArray and ZeroTrustOrganizationArrayOutput values.
// You can construct a concrete instance of `ZeroTrustOrganizationArrayInput` via:
//
//	ZeroTrustOrganizationArray{ ZeroTrustOrganizationArgs{...} }
type ZeroTrustOrganizationArrayInput interface {
	pulumi.Input

	ToZeroTrustOrganizationArrayOutput() ZeroTrustOrganizationArrayOutput
	ToZeroTrustOrganizationArrayOutputWithContext(context.Context) ZeroTrustOrganizationArrayOutput
}

type ZeroTrustOrganizationArray []ZeroTrustOrganizationInput

func (ZeroTrustOrganizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustOrganization)(nil)).Elem()
}

func (i ZeroTrustOrganizationArray) ToZeroTrustOrganizationArrayOutput() ZeroTrustOrganizationArrayOutput {
	return i.ToZeroTrustOrganizationArrayOutputWithContext(context.Background())
}

func (i ZeroTrustOrganizationArray) ToZeroTrustOrganizationArrayOutputWithContext(ctx context.Context) ZeroTrustOrganizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustOrganizationArrayOutput)
}

// ZeroTrustOrganizationMapInput is an input type that accepts ZeroTrustOrganizationMap and ZeroTrustOrganizationMapOutput values.
// You can construct a concrete instance of `ZeroTrustOrganizationMapInput` via:
//
//	ZeroTrustOrganizationMap{ "key": ZeroTrustOrganizationArgs{...} }
type ZeroTrustOrganizationMapInput interface {
	pulumi.Input

	ToZeroTrustOrganizationMapOutput() ZeroTrustOrganizationMapOutput
	ToZeroTrustOrganizationMapOutputWithContext(context.Context) ZeroTrustOrganizationMapOutput
}

type ZeroTrustOrganizationMap map[string]ZeroTrustOrganizationInput

func (ZeroTrustOrganizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustOrganization)(nil)).Elem()
}

func (i ZeroTrustOrganizationMap) ToZeroTrustOrganizationMapOutput() ZeroTrustOrganizationMapOutput {
	return i.ToZeroTrustOrganizationMapOutputWithContext(context.Background())
}

func (i ZeroTrustOrganizationMap) ToZeroTrustOrganizationMapOutputWithContext(ctx context.Context) ZeroTrustOrganizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustOrganizationMapOutput)
}

type ZeroTrustOrganizationOutput struct{ *pulumi.OutputState }

func (ZeroTrustOrganizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustOrganization)(nil)).Elem()
}

func (o ZeroTrustOrganizationOutput) ToZeroTrustOrganizationOutput() ZeroTrustOrganizationOutput {
	return o
}

func (o ZeroTrustOrganizationOutput) ToZeroTrustOrganizationOutputWithContext(ctx context.Context) ZeroTrustOrganizationOutput {
	return o
}

// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
func (o ZeroTrustOrganizationOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
func (o ZeroTrustOrganizationOutput) AllowAuthenticateViaWarp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.BoolPtrOutput { return v.AllowAuthenticateViaWarp }).(pulumi.BoolPtrOutput)
}

// The unique subdomain assigned to your Zero Trust organization.
func (o ZeroTrustOrganizationOutput) AuthDomain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.AuthDomain }).(pulumi.StringPtrOutput)
}

// When set to `true`, users skip the identity provider selection step during login.
func (o ZeroTrustOrganizationOutput) AutoRedirectToIdentity() pulumi.BoolOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.BoolOutput { return v.AutoRedirectToIdentity }).(pulumi.BoolOutput)
}

func (o ZeroTrustOrganizationOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o ZeroTrustOrganizationOutput) CustomPages() ZeroTrustOrganizationCustomPagesPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) ZeroTrustOrganizationCustomPagesPtrOutput { return v.CustomPages }).(ZeroTrustOrganizationCustomPagesPtrOutput)
}

func (o ZeroTrustOrganizationOutput) IsUiReadOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.BoolPtrOutput { return v.IsUiReadOnly }).(pulumi.BoolPtrOutput)
}

func (o ZeroTrustOrganizationOutput) LoginDesign() ZeroTrustOrganizationLoginDesignPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) ZeroTrustOrganizationLoginDesignPtrOutput { return v.LoginDesign }).(ZeroTrustOrganizationLoginDesignPtrOutput)
}

// The name of your Zero Trust organization.
func (o ZeroTrustOrganizationOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
func (o ZeroTrustOrganizationOutput) SessionDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.SessionDuration }).(pulumi.StringPtrOutput)
}

// A description of the reason why the UI read only field is being toggled.
func (o ZeroTrustOrganizationOutput) UiReadOnlyToggleReason() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.UiReadOnlyToggleReason }).(pulumi.StringPtrOutput)
}

func (o ZeroTrustOrganizationOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
func (o ZeroTrustOrganizationOutput) UserSeatExpirationInactiveTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.UserSeatExpirationInactiveTime }).(pulumi.StringPtrOutput)
}

// The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
func (o ZeroTrustOrganizationOutput) WarpAuthSessionDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.WarpAuthSessionDuration }).(pulumi.StringPtrOutput)
}

// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
func (o ZeroTrustOrganizationOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustOrganization) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type ZeroTrustOrganizationArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustOrganizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustOrganization)(nil)).Elem()
}

func (o ZeroTrustOrganizationArrayOutput) ToZeroTrustOrganizationArrayOutput() ZeroTrustOrganizationArrayOutput {
	return o
}

func (o ZeroTrustOrganizationArrayOutput) ToZeroTrustOrganizationArrayOutputWithContext(ctx context.Context) ZeroTrustOrganizationArrayOutput {
	return o
}

func (o ZeroTrustOrganizationArrayOutput) Index(i pulumi.IntInput) ZeroTrustOrganizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustOrganization {
		return vs[0].([]*ZeroTrustOrganization)[vs[1].(int)]
	}).(ZeroTrustOrganizationOutput)
}

type ZeroTrustOrganizationMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustOrganizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustOrganization)(nil)).Elem()
}

func (o ZeroTrustOrganizationMapOutput) ToZeroTrustOrganizationMapOutput() ZeroTrustOrganizationMapOutput {
	return o
}

func (o ZeroTrustOrganizationMapOutput) ToZeroTrustOrganizationMapOutputWithContext(ctx context.Context) ZeroTrustOrganizationMapOutput {
	return o
}

func (o ZeroTrustOrganizationMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustOrganizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustOrganization {
		return vs[0].(map[string]*ZeroTrustOrganization)[vs[1].(string)]
	}).(ZeroTrustOrganizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustOrganizationInput)(nil)).Elem(), &ZeroTrustOrganization{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustOrganizationArrayInput)(nil)).Elem(), ZeroTrustOrganizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustOrganizationMapInput)(nil)).Elem(), ZeroTrustOrganizationMap{})
	pulumi.RegisterOutputType(ZeroTrustOrganizationOutput{})
	pulumi.RegisterOutputType(ZeroTrustOrganizationArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustOrganizationMapOutput{})
}
