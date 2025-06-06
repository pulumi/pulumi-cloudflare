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
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/pageShieldPolicy:PageShieldPolicy example '<zone_id>/<policy_id>'
// ```
type PageShieldPolicy struct {
	pulumi.CustomResourceState

	// The action to take if the expression matches
	// Available values: "allow", "log".
	Action pulumi.StringOutput `pulumi:"action"`
	// A description for the policy
	Description pulumi.StringOutput `pulumi:"description"`
	// Whether the policy is enabled
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The expression which must match for the policy to be applied, using the Cloudflare Firewall rule expression syntax
	Expression pulumi.StringOutput `pulumi:"expression"`
	// The policy which will be applied
	Value pulumi.StringOutput `pulumi:"value"`
	// Identifier
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewPageShieldPolicy registers a new resource with the given unique name, arguments, and options.
func NewPageShieldPolicy(ctx *pulumi.Context,
	name string, args *PageShieldPolicyArgs, opts ...pulumi.ResourceOption) (*PageShieldPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Expression == nil {
		return nil, errors.New("invalid value for required argument 'Expression'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PageShieldPolicy
	err := ctx.RegisterResource("cloudflare:index/pageShieldPolicy:PageShieldPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPageShieldPolicy gets an existing PageShieldPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPageShieldPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PageShieldPolicyState, opts ...pulumi.ResourceOption) (*PageShieldPolicy, error) {
	var resource PageShieldPolicy
	err := ctx.ReadResource("cloudflare:index/pageShieldPolicy:PageShieldPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PageShieldPolicy resources.
type pageShieldPolicyState struct {
	// The action to take if the expression matches
	// Available values: "allow", "log".
	Action *string `pulumi:"action"`
	// A description for the policy
	Description *string `pulumi:"description"`
	// Whether the policy is enabled
	Enabled *bool `pulumi:"enabled"`
	// The expression which must match for the policy to be applied, using the Cloudflare Firewall rule expression syntax
	Expression *string `pulumi:"expression"`
	// The policy which will be applied
	Value *string `pulumi:"value"`
	// Identifier
	ZoneId *string `pulumi:"zoneId"`
}

type PageShieldPolicyState struct {
	// The action to take if the expression matches
	// Available values: "allow", "log".
	Action pulumi.StringPtrInput
	// A description for the policy
	Description pulumi.StringPtrInput
	// Whether the policy is enabled
	Enabled pulumi.BoolPtrInput
	// The expression which must match for the policy to be applied, using the Cloudflare Firewall rule expression syntax
	Expression pulumi.StringPtrInput
	// The policy which will be applied
	Value pulumi.StringPtrInput
	// Identifier
	ZoneId pulumi.StringPtrInput
}

func (PageShieldPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*pageShieldPolicyState)(nil)).Elem()
}

type pageShieldPolicyArgs struct {
	// The action to take if the expression matches
	// Available values: "allow", "log".
	Action string `pulumi:"action"`
	// A description for the policy
	Description string `pulumi:"description"`
	// Whether the policy is enabled
	Enabled bool `pulumi:"enabled"`
	// The expression which must match for the policy to be applied, using the Cloudflare Firewall rule expression syntax
	Expression string `pulumi:"expression"`
	// The policy which will be applied
	Value string `pulumi:"value"`
	// Identifier
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a PageShieldPolicy resource.
type PageShieldPolicyArgs struct {
	// The action to take if the expression matches
	// Available values: "allow", "log".
	Action pulumi.StringInput
	// A description for the policy
	Description pulumi.StringInput
	// Whether the policy is enabled
	Enabled pulumi.BoolInput
	// The expression which must match for the policy to be applied, using the Cloudflare Firewall rule expression syntax
	Expression pulumi.StringInput
	// The policy which will be applied
	Value pulumi.StringInput
	// Identifier
	ZoneId pulumi.StringInput
}

func (PageShieldPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pageShieldPolicyArgs)(nil)).Elem()
}

type PageShieldPolicyInput interface {
	pulumi.Input

	ToPageShieldPolicyOutput() PageShieldPolicyOutput
	ToPageShieldPolicyOutputWithContext(ctx context.Context) PageShieldPolicyOutput
}

func (*PageShieldPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**PageShieldPolicy)(nil)).Elem()
}

func (i *PageShieldPolicy) ToPageShieldPolicyOutput() PageShieldPolicyOutput {
	return i.ToPageShieldPolicyOutputWithContext(context.Background())
}

func (i *PageShieldPolicy) ToPageShieldPolicyOutputWithContext(ctx context.Context) PageShieldPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PageShieldPolicyOutput)
}

// PageShieldPolicyArrayInput is an input type that accepts PageShieldPolicyArray and PageShieldPolicyArrayOutput values.
// You can construct a concrete instance of `PageShieldPolicyArrayInput` via:
//
//	PageShieldPolicyArray{ PageShieldPolicyArgs{...} }
type PageShieldPolicyArrayInput interface {
	pulumi.Input

	ToPageShieldPolicyArrayOutput() PageShieldPolicyArrayOutput
	ToPageShieldPolicyArrayOutputWithContext(context.Context) PageShieldPolicyArrayOutput
}

type PageShieldPolicyArray []PageShieldPolicyInput

func (PageShieldPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PageShieldPolicy)(nil)).Elem()
}

func (i PageShieldPolicyArray) ToPageShieldPolicyArrayOutput() PageShieldPolicyArrayOutput {
	return i.ToPageShieldPolicyArrayOutputWithContext(context.Background())
}

func (i PageShieldPolicyArray) ToPageShieldPolicyArrayOutputWithContext(ctx context.Context) PageShieldPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PageShieldPolicyArrayOutput)
}

// PageShieldPolicyMapInput is an input type that accepts PageShieldPolicyMap and PageShieldPolicyMapOutput values.
// You can construct a concrete instance of `PageShieldPolicyMapInput` via:
//
//	PageShieldPolicyMap{ "key": PageShieldPolicyArgs{...} }
type PageShieldPolicyMapInput interface {
	pulumi.Input

	ToPageShieldPolicyMapOutput() PageShieldPolicyMapOutput
	ToPageShieldPolicyMapOutputWithContext(context.Context) PageShieldPolicyMapOutput
}

type PageShieldPolicyMap map[string]PageShieldPolicyInput

func (PageShieldPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PageShieldPolicy)(nil)).Elem()
}

func (i PageShieldPolicyMap) ToPageShieldPolicyMapOutput() PageShieldPolicyMapOutput {
	return i.ToPageShieldPolicyMapOutputWithContext(context.Background())
}

func (i PageShieldPolicyMap) ToPageShieldPolicyMapOutputWithContext(ctx context.Context) PageShieldPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PageShieldPolicyMapOutput)
}

type PageShieldPolicyOutput struct{ *pulumi.OutputState }

func (PageShieldPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PageShieldPolicy)(nil)).Elem()
}

func (o PageShieldPolicyOutput) ToPageShieldPolicyOutput() PageShieldPolicyOutput {
	return o
}

func (o PageShieldPolicyOutput) ToPageShieldPolicyOutputWithContext(ctx context.Context) PageShieldPolicyOutput {
	return o
}

// The action to take if the expression matches
// Available values: "allow", "log".
func (o PageShieldPolicyOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *PageShieldPolicy) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// A description for the policy
func (o PageShieldPolicyOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *PageShieldPolicy) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Whether the policy is enabled
func (o PageShieldPolicyOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *PageShieldPolicy) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The expression which must match for the policy to be applied, using the Cloudflare Firewall rule expression syntax
func (o PageShieldPolicyOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v *PageShieldPolicy) pulumi.StringOutput { return v.Expression }).(pulumi.StringOutput)
}

// The policy which will be applied
func (o PageShieldPolicyOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *PageShieldPolicy) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

// Identifier
func (o PageShieldPolicyOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *PageShieldPolicy) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type PageShieldPolicyArrayOutput struct{ *pulumi.OutputState }

func (PageShieldPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PageShieldPolicy)(nil)).Elem()
}

func (o PageShieldPolicyArrayOutput) ToPageShieldPolicyArrayOutput() PageShieldPolicyArrayOutput {
	return o
}

func (o PageShieldPolicyArrayOutput) ToPageShieldPolicyArrayOutputWithContext(ctx context.Context) PageShieldPolicyArrayOutput {
	return o
}

func (o PageShieldPolicyArrayOutput) Index(i pulumi.IntInput) PageShieldPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PageShieldPolicy {
		return vs[0].([]*PageShieldPolicy)[vs[1].(int)]
	}).(PageShieldPolicyOutput)
}

type PageShieldPolicyMapOutput struct{ *pulumi.OutputState }

func (PageShieldPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PageShieldPolicy)(nil)).Elem()
}

func (o PageShieldPolicyMapOutput) ToPageShieldPolicyMapOutput() PageShieldPolicyMapOutput {
	return o
}

func (o PageShieldPolicyMapOutput) ToPageShieldPolicyMapOutputWithContext(ctx context.Context) PageShieldPolicyMapOutput {
	return o
}

func (o PageShieldPolicyMapOutput) MapIndex(k pulumi.StringInput) PageShieldPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PageShieldPolicy {
		return vs[0].(map[string]*PageShieldPolicy)[vs[1].(string)]
	}).(PageShieldPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PageShieldPolicyInput)(nil)).Elem(), &PageShieldPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*PageShieldPolicyArrayInput)(nil)).Elem(), PageShieldPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PageShieldPolicyMapInput)(nil)).Elem(), PageShieldPolicyMap{})
	pulumi.RegisterOutputType(PageShieldPolicyOutput{})
	pulumi.RegisterOutputType(PageShieldPolicyArrayOutput{})
	pulumi.RegisterOutputType(PageShieldPolicyMapOutput{})
}
