// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
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
//			_, err := cloudflare.NewZeroTrustAccessServiceToken(ctx, "example_zero_trust_access_service_token", &cloudflare.ZeroTrustAccessServiceTokenArgs{
//				Name:     pulumi.String("CI/CD token"),
//				ZoneId:   pulumi.String("zone_id"),
//				Duration: pulumi.String("60m"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/accessServiceToken:AccessServiceToken example '<{accounts|zones}/{account_id|zone_id}>/<service_token_id>'
// ```
//
// Deprecated: cloudflare.index/accessservicetoken.AccessServiceToken has been deprecated in favor of cloudflare.index/zerotrustaccessservicetoken.ZeroTrustAccessServiceToken
type AccessServiceToken struct {
	pulumi.CustomResourceState

	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	CreatedAt    pulumi.StringOutput `pulumi:"createdAt"`
	// The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
	Duration   pulumi.StringOutput `pulumi:"duration"`
	ExpiresAt  pulumi.StringOutput `pulumi:"expiresAt"`
	LastSeenAt pulumi.StringOutput `pulumi:"lastSeenAt"`
	// The name of the service token.
	Name      pulumi.StringOutput `pulumi:"name"`
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewAccessServiceToken registers a new resource with the given unique name, arguments, and options.
func NewAccessServiceToken(ctx *pulumi.Context,
	name string, args *AccessServiceTokenArgs, opts ...pulumi.ResourceOption) (*AccessServiceToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("cloudflare:index/accessServiceToken:AccessServiceToken"),
		},
	})
	opts = append(opts, aliases)
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clientSecret",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessServiceToken
	err := ctx.RegisterResource("cloudflare:index/accessServiceToken:AccessServiceToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessServiceToken gets an existing AccessServiceToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessServiceToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessServiceTokenState, opts ...pulumi.ResourceOption) (*AccessServiceToken, error) {
	var resource AccessServiceToken
	err := ctx.ReadResource("cloudflare:index/accessServiceToken:AccessServiceToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessServiceToken resources.
type accessServiceTokenState struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId *string `pulumi:"accountId"`
	// The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
	ClientId *string `pulumi:"clientId"`
	// The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
	ClientSecret *string `pulumi:"clientSecret"`
	CreatedAt    *string `pulumi:"createdAt"`
	// The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
	Duration   *string `pulumi:"duration"`
	ExpiresAt  *string `pulumi:"expiresAt"`
	LastSeenAt *string `pulumi:"lastSeenAt"`
	// The name of the service token.
	Name      *string `pulumi:"name"`
	UpdatedAt *string `pulumi:"updatedAt"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessServiceTokenState struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrInput
	// The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
	ClientId pulumi.StringPtrInput
	// The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
	ClientSecret pulumi.StringPtrInput
	CreatedAt    pulumi.StringPtrInput
	// The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
	Duration   pulumi.StringPtrInput
	ExpiresAt  pulumi.StringPtrInput
	LastSeenAt pulumi.StringPtrInput
	// The name of the service token.
	Name      pulumi.StringPtrInput
	UpdatedAt pulumi.StringPtrInput
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrInput
}

func (AccessServiceTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessServiceTokenState)(nil)).Elem()
}

type accessServiceTokenArgs struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId *string `pulumi:"accountId"`
	// The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
	Duration *string `pulumi:"duration"`
	// The name of the service token.
	Name string `pulumi:"name"`
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessServiceToken resource.
type AccessServiceTokenArgs struct {
	// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
	AccountId pulumi.StringPtrInput
	// The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
	Duration pulumi.StringPtrInput
	// The name of the service token.
	Name pulumi.StringInput
	// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
	ZoneId pulumi.StringPtrInput
}

func (AccessServiceTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessServiceTokenArgs)(nil)).Elem()
}

type AccessServiceTokenInput interface {
	pulumi.Input

	ToAccessServiceTokenOutput() AccessServiceTokenOutput
	ToAccessServiceTokenOutputWithContext(ctx context.Context) AccessServiceTokenOutput
}

func (*AccessServiceToken) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessServiceToken)(nil)).Elem()
}

func (i *AccessServiceToken) ToAccessServiceTokenOutput() AccessServiceTokenOutput {
	return i.ToAccessServiceTokenOutputWithContext(context.Background())
}

func (i *AccessServiceToken) ToAccessServiceTokenOutputWithContext(ctx context.Context) AccessServiceTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessServiceTokenOutput)
}

// AccessServiceTokenArrayInput is an input type that accepts AccessServiceTokenArray and AccessServiceTokenArrayOutput values.
// You can construct a concrete instance of `AccessServiceTokenArrayInput` via:
//
//	AccessServiceTokenArray{ AccessServiceTokenArgs{...} }
type AccessServiceTokenArrayInput interface {
	pulumi.Input

	ToAccessServiceTokenArrayOutput() AccessServiceTokenArrayOutput
	ToAccessServiceTokenArrayOutputWithContext(context.Context) AccessServiceTokenArrayOutput
}

type AccessServiceTokenArray []AccessServiceTokenInput

func (AccessServiceTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessServiceToken)(nil)).Elem()
}

func (i AccessServiceTokenArray) ToAccessServiceTokenArrayOutput() AccessServiceTokenArrayOutput {
	return i.ToAccessServiceTokenArrayOutputWithContext(context.Background())
}

func (i AccessServiceTokenArray) ToAccessServiceTokenArrayOutputWithContext(ctx context.Context) AccessServiceTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessServiceTokenArrayOutput)
}

// AccessServiceTokenMapInput is an input type that accepts AccessServiceTokenMap and AccessServiceTokenMapOutput values.
// You can construct a concrete instance of `AccessServiceTokenMapInput` via:
//
//	AccessServiceTokenMap{ "key": AccessServiceTokenArgs{...} }
type AccessServiceTokenMapInput interface {
	pulumi.Input

	ToAccessServiceTokenMapOutput() AccessServiceTokenMapOutput
	ToAccessServiceTokenMapOutputWithContext(context.Context) AccessServiceTokenMapOutput
}

type AccessServiceTokenMap map[string]AccessServiceTokenInput

func (AccessServiceTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessServiceToken)(nil)).Elem()
}

func (i AccessServiceTokenMap) ToAccessServiceTokenMapOutput() AccessServiceTokenMapOutput {
	return i.ToAccessServiceTokenMapOutputWithContext(context.Background())
}

func (i AccessServiceTokenMap) ToAccessServiceTokenMapOutputWithContext(ctx context.Context) AccessServiceTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessServiceTokenMapOutput)
}

type AccessServiceTokenOutput struct{ *pulumi.OutputState }

func (AccessServiceTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessServiceToken)(nil)).Elem()
}

func (o AccessServiceTokenOutput) ToAccessServiceTokenOutput() AccessServiceTokenOutput {
	return o
}

func (o AccessServiceTokenOutput) ToAccessServiceTokenOutputWithContext(ctx context.Context) AccessServiceTokenOutput {
	return o
}

// The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
func (o AccessServiceTokenOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
func (o AccessServiceTokenOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
func (o AccessServiceTokenOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

func (o AccessServiceTokenOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
func (o AccessServiceTokenOutput) Duration() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.Duration }).(pulumi.StringOutput)
}

func (o AccessServiceTokenOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.ExpiresAt }).(pulumi.StringOutput)
}

func (o AccessServiceTokenOutput) LastSeenAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.LastSeenAt }).(pulumi.StringOutput)
}

// The name of the service token.
func (o AccessServiceTokenOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o AccessServiceTokenOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
func (o AccessServiceTokenOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type AccessServiceTokenArrayOutput struct{ *pulumi.OutputState }

func (AccessServiceTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessServiceToken)(nil)).Elem()
}

func (o AccessServiceTokenArrayOutput) ToAccessServiceTokenArrayOutput() AccessServiceTokenArrayOutput {
	return o
}

func (o AccessServiceTokenArrayOutput) ToAccessServiceTokenArrayOutputWithContext(ctx context.Context) AccessServiceTokenArrayOutput {
	return o
}

func (o AccessServiceTokenArrayOutput) Index(i pulumi.IntInput) AccessServiceTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessServiceToken {
		return vs[0].([]*AccessServiceToken)[vs[1].(int)]
	}).(AccessServiceTokenOutput)
}

type AccessServiceTokenMapOutput struct{ *pulumi.OutputState }

func (AccessServiceTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessServiceToken)(nil)).Elem()
}

func (o AccessServiceTokenMapOutput) ToAccessServiceTokenMapOutput() AccessServiceTokenMapOutput {
	return o
}

func (o AccessServiceTokenMapOutput) ToAccessServiceTokenMapOutputWithContext(ctx context.Context) AccessServiceTokenMapOutput {
	return o
}

func (o AccessServiceTokenMapOutput) MapIndex(k pulumi.StringInput) AccessServiceTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessServiceToken {
		return vs[0].(map[string]*AccessServiceToken)[vs[1].(string)]
	}).(AccessServiceTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessServiceTokenInput)(nil)).Elem(), &AccessServiceToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessServiceTokenArrayInput)(nil)).Elem(), AccessServiceTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessServiceTokenMapInput)(nil)).Elem(), AccessServiceTokenMap{})
	pulumi.RegisterOutputType(AccessServiceTokenOutput{})
	pulumi.RegisterOutputType(AccessServiceTokenArrayOutput{})
	pulumi.RegisterOutputType(AccessServiceTokenMapOutput{})
}
