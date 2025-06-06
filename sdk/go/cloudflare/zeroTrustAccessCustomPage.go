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
//			_, err := cloudflare.NewZeroTrustAccessCustomPage(ctx, "example_zero_trust_access_custom_page", &cloudflare.ZeroTrustAccessCustomPageArgs{
//				AccountId:  pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				CustomHtml: pulumi.String("<html><body><h1>Access Denied</h1></body></html>"),
//				Name:       pulumi.String("name"),
//				Type:       pulumi.String("identity_denied"),
//				AppCount:   pulumi.Int(0),
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
// $ pulumi import cloudflare:index/zeroTrustAccessCustomPage:ZeroTrustAccessCustomPage example '<account_id>/<custom_page_id>'
// ```
type ZeroTrustAccessCustomPage struct {
	pulumi.CustomResourceState

	// Identifier.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Number of apps the custom page is assigned to.
	AppCount  pulumi.IntPtrOutput `pulumi:"appCount"`
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Custom page HTML.
	CustomHtml pulumi.StringOutput `pulumi:"customHtml"`
	// Custom page name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Custom page type.
	// Available values: "identityDenied", "forbidden".
	Type pulumi.StringOutput `pulumi:"type"`
	// UUID.
	Uid       pulumi.StringOutput `pulumi:"uid"`
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewZeroTrustAccessCustomPage registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustAccessCustomPage(ctx *pulumi.Context,
	name string, args *ZeroTrustAccessCustomPageArgs, opts ...pulumi.ResourceOption) (*ZeroTrustAccessCustomPage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.CustomHtml == nil {
		return nil, errors.New("invalid value for required argument 'CustomHtml'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("cloudflare:index/accessCustomPage:AccessCustomPage"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustAccessCustomPage
	err := ctx.RegisterResource("cloudflare:index/zeroTrustAccessCustomPage:ZeroTrustAccessCustomPage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustAccessCustomPage gets an existing ZeroTrustAccessCustomPage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustAccessCustomPage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustAccessCustomPageState, opts ...pulumi.ResourceOption) (*ZeroTrustAccessCustomPage, error) {
	var resource ZeroTrustAccessCustomPage
	err := ctx.ReadResource("cloudflare:index/zeroTrustAccessCustomPage:ZeroTrustAccessCustomPage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustAccessCustomPage resources.
type zeroTrustAccessCustomPageState struct {
	// Identifier.
	AccountId *string `pulumi:"accountId"`
	// Number of apps the custom page is assigned to.
	AppCount  *int    `pulumi:"appCount"`
	CreatedAt *string `pulumi:"createdAt"`
	// Custom page HTML.
	CustomHtml *string `pulumi:"customHtml"`
	// Custom page name.
	Name *string `pulumi:"name"`
	// Custom page type.
	// Available values: "identityDenied", "forbidden".
	Type *string `pulumi:"type"`
	// UUID.
	Uid       *string `pulumi:"uid"`
	UpdatedAt *string `pulumi:"updatedAt"`
}

type ZeroTrustAccessCustomPageState struct {
	// Identifier.
	AccountId pulumi.StringPtrInput
	// Number of apps the custom page is assigned to.
	AppCount  pulumi.IntPtrInput
	CreatedAt pulumi.StringPtrInput
	// Custom page HTML.
	CustomHtml pulumi.StringPtrInput
	// Custom page name.
	Name pulumi.StringPtrInput
	// Custom page type.
	// Available values: "identityDenied", "forbidden".
	Type pulumi.StringPtrInput
	// UUID.
	Uid       pulumi.StringPtrInput
	UpdatedAt pulumi.StringPtrInput
}

func (ZeroTrustAccessCustomPageState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessCustomPageState)(nil)).Elem()
}

type zeroTrustAccessCustomPageArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// Number of apps the custom page is assigned to.
	AppCount *int `pulumi:"appCount"`
	// Custom page HTML.
	CustomHtml string `pulumi:"customHtml"`
	// Custom page name.
	Name string `pulumi:"name"`
	// Custom page type.
	// Available values: "identityDenied", "forbidden".
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ZeroTrustAccessCustomPage resource.
type ZeroTrustAccessCustomPageArgs struct {
	// Identifier.
	AccountId pulumi.StringInput
	// Number of apps the custom page is assigned to.
	AppCount pulumi.IntPtrInput
	// Custom page HTML.
	CustomHtml pulumi.StringInput
	// Custom page name.
	Name pulumi.StringInput
	// Custom page type.
	// Available values: "identityDenied", "forbidden".
	Type pulumi.StringInput
}

func (ZeroTrustAccessCustomPageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessCustomPageArgs)(nil)).Elem()
}

type ZeroTrustAccessCustomPageInput interface {
	pulumi.Input

	ToZeroTrustAccessCustomPageOutput() ZeroTrustAccessCustomPageOutput
	ToZeroTrustAccessCustomPageOutputWithContext(ctx context.Context) ZeroTrustAccessCustomPageOutput
}

func (*ZeroTrustAccessCustomPage) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessCustomPage)(nil)).Elem()
}

func (i *ZeroTrustAccessCustomPage) ToZeroTrustAccessCustomPageOutput() ZeroTrustAccessCustomPageOutput {
	return i.ToZeroTrustAccessCustomPageOutputWithContext(context.Background())
}

func (i *ZeroTrustAccessCustomPage) ToZeroTrustAccessCustomPageOutputWithContext(ctx context.Context) ZeroTrustAccessCustomPageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessCustomPageOutput)
}

// ZeroTrustAccessCustomPageArrayInput is an input type that accepts ZeroTrustAccessCustomPageArray and ZeroTrustAccessCustomPageArrayOutput values.
// You can construct a concrete instance of `ZeroTrustAccessCustomPageArrayInput` via:
//
//	ZeroTrustAccessCustomPageArray{ ZeroTrustAccessCustomPageArgs{...} }
type ZeroTrustAccessCustomPageArrayInput interface {
	pulumi.Input

	ToZeroTrustAccessCustomPageArrayOutput() ZeroTrustAccessCustomPageArrayOutput
	ToZeroTrustAccessCustomPageArrayOutputWithContext(context.Context) ZeroTrustAccessCustomPageArrayOutput
}

type ZeroTrustAccessCustomPageArray []ZeroTrustAccessCustomPageInput

func (ZeroTrustAccessCustomPageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessCustomPage)(nil)).Elem()
}

func (i ZeroTrustAccessCustomPageArray) ToZeroTrustAccessCustomPageArrayOutput() ZeroTrustAccessCustomPageArrayOutput {
	return i.ToZeroTrustAccessCustomPageArrayOutputWithContext(context.Background())
}

func (i ZeroTrustAccessCustomPageArray) ToZeroTrustAccessCustomPageArrayOutputWithContext(ctx context.Context) ZeroTrustAccessCustomPageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessCustomPageArrayOutput)
}

// ZeroTrustAccessCustomPageMapInput is an input type that accepts ZeroTrustAccessCustomPageMap and ZeroTrustAccessCustomPageMapOutput values.
// You can construct a concrete instance of `ZeroTrustAccessCustomPageMapInput` via:
//
//	ZeroTrustAccessCustomPageMap{ "key": ZeroTrustAccessCustomPageArgs{...} }
type ZeroTrustAccessCustomPageMapInput interface {
	pulumi.Input

	ToZeroTrustAccessCustomPageMapOutput() ZeroTrustAccessCustomPageMapOutput
	ToZeroTrustAccessCustomPageMapOutputWithContext(context.Context) ZeroTrustAccessCustomPageMapOutput
}

type ZeroTrustAccessCustomPageMap map[string]ZeroTrustAccessCustomPageInput

func (ZeroTrustAccessCustomPageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessCustomPage)(nil)).Elem()
}

func (i ZeroTrustAccessCustomPageMap) ToZeroTrustAccessCustomPageMapOutput() ZeroTrustAccessCustomPageMapOutput {
	return i.ToZeroTrustAccessCustomPageMapOutputWithContext(context.Background())
}

func (i ZeroTrustAccessCustomPageMap) ToZeroTrustAccessCustomPageMapOutputWithContext(ctx context.Context) ZeroTrustAccessCustomPageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessCustomPageMapOutput)
}

type ZeroTrustAccessCustomPageOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessCustomPageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessCustomPage)(nil)).Elem()
}

func (o ZeroTrustAccessCustomPageOutput) ToZeroTrustAccessCustomPageOutput() ZeroTrustAccessCustomPageOutput {
	return o
}

func (o ZeroTrustAccessCustomPageOutput) ToZeroTrustAccessCustomPageOutputWithContext(ctx context.Context) ZeroTrustAccessCustomPageOutput {
	return o
}

// Identifier.
func (o ZeroTrustAccessCustomPageOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Number of apps the custom page is assigned to.
func (o ZeroTrustAccessCustomPageOutput) AppCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.IntPtrOutput { return v.AppCount }).(pulumi.IntPtrOutput)
}

func (o ZeroTrustAccessCustomPageOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Custom page HTML.
func (o ZeroTrustAccessCustomPageOutput) CustomHtml() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.StringOutput { return v.CustomHtml }).(pulumi.StringOutput)
}

// Custom page name.
func (o ZeroTrustAccessCustomPageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Custom page type.
// Available values: "identityDenied", "forbidden".
func (o ZeroTrustAccessCustomPageOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// UUID.
func (o ZeroTrustAccessCustomPageOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

func (o ZeroTrustAccessCustomPageOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessCustomPage) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type ZeroTrustAccessCustomPageArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessCustomPageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessCustomPage)(nil)).Elem()
}

func (o ZeroTrustAccessCustomPageArrayOutput) ToZeroTrustAccessCustomPageArrayOutput() ZeroTrustAccessCustomPageArrayOutput {
	return o
}

func (o ZeroTrustAccessCustomPageArrayOutput) ToZeroTrustAccessCustomPageArrayOutputWithContext(ctx context.Context) ZeroTrustAccessCustomPageArrayOutput {
	return o
}

func (o ZeroTrustAccessCustomPageArrayOutput) Index(i pulumi.IntInput) ZeroTrustAccessCustomPageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustAccessCustomPage {
		return vs[0].([]*ZeroTrustAccessCustomPage)[vs[1].(int)]
	}).(ZeroTrustAccessCustomPageOutput)
}

type ZeroTrustAccessCustomPageMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessCustomPageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessCustomPage)(nil)).Elem()
}

func (o ZeroTrustAccessCustomPageMapOutput) ToZeroTrustAccessCustomPageMapOutput() ZeroTrustAccessCustomPageMapOutput {
	return o
}

func (o ZeroTrustAccessCustomPageMapOutput) ToZeroTrustAccessCustomPageMapOutputWithContext(ctx context.Context) ZeroTrustAccessCustomPageMapOutput {
	return o
}

func (o ZeroTrustAccessCustomPageMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustAccessCustomPageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustAccessCustomPage {
		return vs[0].(map[string]*ZeroTrustAccessCustomPage)[vs[1].(string)]
	}).(ZeroTrustAccessCustomPageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessCustomPageInput)(nil)).Elem(), &ZeroTrustAccessCustomPage{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessCustomPageArrayInput)(nil)).Elem(), ZeroTrustAccessCustomPageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessCustomPageMapInput)(nil)).Elem(), ZeroTrustAccessCustomPageMap{})
	pulumi.RegisterOutputType(ZeroTrustAccessCustomPageOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessCustomPageArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessCustomPageMapOutput{})
}
