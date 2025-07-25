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
// $ pulumi import cloudflare:index/accountSubscription:AccountSubscription example '<account_id>'
// ```
type AccountSubscription struct {
	pulumi.CustomResourceState

	// Identifier
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The monetary unit in which pricing information is displayed.
	Currency pulumi.StringOutput `pulumi:"currency"`
	// The end of the current period and also when the next billing is due.
	CurrentPeriodEnd pulumi.StringOutput `pulumi:"currentPeriodEnd"`
	// When the current billing period started. May match initial*period*start if this is the first period.
	CurrentPeriodStart pulumi.StringOutput `pulumi:"currentPeriodStart"`
	// How often the subscription is renewed automatically.
	// Available values: "weekly", "monthly", "quarterly", "yearly".
	Frequency pulumi.StringPtrOutput `pulumi:"frequency"`
	// The price of the subscription that will be billed, in US dollars.
	Price pulumi.Float64Output `pulumi:"price"`
	// The rate plan applied to the subscription.
	RatePlan AccountSubscriptionRatePlanPtrOutput `pulumi:"ratePlan"`
	// The state that the subscription is in.
	// Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
	State pulumi.StringOutput `pulumi:"state"`
}

// NewAccountSubscription registers a new resource with the given unique name, arguments, and options.
func NewAccountSubscription(ctx *pulumi.Context,
	name string, args *AccountSubscriptionArgs, opts ...pulumi.ResourceOption) (*AccountSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccountSubscription
	err := ctx.RegisterResource("cloudflare:index/accountSubscription:AccountSubscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccountSubscription gets an existing AccountSubscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccountSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountSubscriptionState, opts ...pulumi.ResourceOption) (*AccountSubscription, error) {
	var resource AccountSubscription
	err := ctx.ReadResource("cloudflare:index/accountSubscription:AccountSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccountSubscription resources.
type accountSubscriptionState struct {
	// Identifier
	AccountId *string `pulumi:"accountId"`
	// The monetary unit in which pricing information is displayed.
	Currency *string `pulumi:"currency"`
	// The end of the current period and also when the next billing is due.
	CurrentPeriodEnd *string `pulumi:"currentPeriodEnd"`
	// When the current billing period started. May match initial*period*start if this is the first period.
	CurrentPeriodStart *string `pulumi:"currentPeriodStart"`
	// How often the subscription is renewed automatically.
	// Available values: "weekly", "monthly", "quarterly", "yearly".
	Frequency *string `pulumi:"frequency"`
	// The price of the subscription that will be billed, in US dollars.
	Price *float64 `pulumi:"price"`
	// The rate plan applied to the subscription.
	RatePlan *AccountSubscriptionRatePlan `pulumi:"ratePlan"`
	// The state that the subscription is in.
	// Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
	State *string `pulumi:"state"`
}

type AccountSubscriptionState struct {
	// Identifier
	AccountId pulumi.StringPtrInput
	// The monetary unit in which pricing information is displayed.
	Currency pulumi.StringPtrInput
	// The end of the current period and also when the next billing is due.
	CurrentPeriodEnd pulumi.StringPtrInput
	// When the current billing period started. May match initial*period*start if this is the first period.
	CurrentPeriodStart pulumi.StringPtrInput
	// How often the subscription is renewed automatically.
	// Available values: "weekly", "monthly", "quarterly", "yearly".
	Frequency pulumi.StringPtrInput
	// The price of the subscription that will be billed, in US dollars.
	Price pulumi.Float64PtrInput
	// The rate plan applied to the subscription.
	RatePlan AccountSubscriptionRatePlanPtrInput
	// The state that the subscription is in.
	// Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
	State pulumi.StringPtrInput
}

func (AccountSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountSubscriptionState)(nil)).Elem()
}

type accountSubscriptionArgs struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// How often the subscription is renewed automatically.
	// Available values: "weekly", "monthly", "quarterly", "yearly".
	Frequency *string `pulumi:"frequency"`
	// The rate plan applied to the subscription.
	RatePlan *AccountSubscriptionRatePlan `pulumi:"ratePlan"`
}

// The set of arguments for constructing a AccountSubscription resource.
type AccountSubscriptionArgs struct {
	// Identifier
	AccountId pulumi.StringInput
	// How often the subscription is renewed automatically.
	// Available values: "weekly", "monthly", "quarterly", "yearly".
	Frequency pulumi.StringPtrInput
	// The rate plan applied to the subscription.
	RatePlan AccountSubscriptionRatePlanPtrInput
}

func (AccountSubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountSubscriptionArgs)(nil)).Elem()
}

type AccountSubscriptionInput interface {
	pulumi.Input

	ToAccountSubscriptionOutput() AccountSubscriptionOutput
	ToAccountSubscriptionOutputWithContext(ctx context.Context) AccountSubscriptionOutput
}

func (*AccountSubscription) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountSubscription)(nil)).Elem()
}

func (i *AccountSubscription) ToAccountSubscriptionOutput() AccountSubscriptionOutput {
	return i.ToAccountSubscriptionOutputWithContext(context.Background())
}

func (i *AccountSubscription) ToAccountSubscriptionOutputWithContext(ctx context.Context) AccountSubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountSubscriptionOutput)
}

// AccountSubscriptionArrayInput is an input type that accepts AccountSubscriptionArray and AccountSubscriptionArrayOutput values.
// You can construct a concrete instance of `AccountSubscriptionArrayInput` via:
//
//	AccountSubscriptionArray{ AccountSubscriptionArgs{...} }
type AccountSubscriptionArrayInput interface {
	pulumi.Input

	ToAccountSubscriptionArrayOutput() AccountSubscriptionArrayOutput
	ToAccountSubscriptionArrayOutputWithContext(context.Context) AccountSubscriptionArrayOutput
}

type AccountSubscriptionArray []AccountSubscriptionInput

func (AccountSubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountSubscription)(nil)).Elem()
}

func (i AccountSubscriptionArray) ToAccountSubscriptionArrayOutput() AccountSubscriptionArrayOutput {
	return i.ToAccountSubscriptionArrayOutputWithContext(context.Background())
}

func (i AccountSubscriptionArray) ToAccountSubscriptionArrayOutputWithContext(ctx context.Context) AccountSubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountSubscriptionArrayOutput)
}

// AccountSubscriptionMapInput is an input type that accepts AccountSubscriptionMap and AccountSubscriptionMapOutput values.
// You can construct a concrete instance of `AccountSubscriptionMapInput` via:
//
//	AccountSubscriptionMap{ "key": AccountSubscriptionArgs{...} }
type AccountSubscriptionMapInput interface {
	pulumi.Input

	ToAccountSubscriptionMapOutput() AccountSubscriptionMapOutput
	ToAccountSubscriptionMapOutputWithContext(context.Context) AccountSubscriptionMapOutput
}

type AccountSubscriptionMap map[string]AccountSubscriptionInput

func (AccountSubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountSubscription)(nil)).Elem()
}

func (i AccountSubscriptionMap) ToAccountSubscriptionMapOutput() AccountSubscriptionMapOutput {
	return i.ToAccountSubscriptionMapOutputWithContext(context.Background())
}

func (i AccountSubscriptionMap) ToAccountSubscriptionMapOutputWithContext(ctx context.Context) AccountSubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountSubscriptionMapOutput)
}

type AccountSubscriptionOutput struct{ *pulumi.OutputState }

func (AccountSubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountSubscription)(nil)).Elem()
}

func (o AccountSubscriptionOutput) ToAccountSubscriptionOutput() AccountSubscriptionOutput {
	return o
}

func (o AccountSubscriptionOutput) ToAccountSubscriptionOutputWithContext(ctx context.Context) AccountSubscriptionOutput {
	return o
}

// Identifier
func (o AccountSubscriptionOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountSubscription) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The monetary unit in which pricing information is displayed.
func (o AccountSubscriptionOutput) Currency() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountSubscription) pulumi.StringOutput { return v.Currency }).(pulumi.StringOutput)
}

// The end of the current period and also when the next billing is due.
func (o AccountSubscriptionOutput) CurrentPeriodEnd() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountSubscription) pulumi.StringOutput { return v.CurrentPeriodEnd }).(pulumi.StringOutput)
}

// When the current billing period started. May match initial*period*start if this is the first period.
func (o AccountSubscriptionOutput) CurrentPeriodStart() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountSubscription) pulumi.StringOutput { return v.CurrentPeriodStart }).(pulumi.StringOutput)
}

// How often the subscription is renewed automatically.
// Available values: "weekly", "monthly", "quarterly", "yearly".
func (o AccountSubscriptionOutput) Frequency() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccountSubscription) pulumi.StringPtrOutput { return v.Frequency }).(pulumi.StringPtrOutput)
}

// The price of the subscription that will be billed, in US dollars.
func (o AccountSubscriptionOutput) Price() pulumi.Float64Output {
	return o.ApplyT(func(v *AccountSubscription) pulumi.Float64Output { return v.Price }).(pulumi.Float64Output)
}

// The rate plan applied to the subscription.
func (o AccountSubscriptionOutput) RatePlan() AccountSubscriptionRatePlanPtrOutput {
	return o.ApplyT(func(v *AccountSubscription) AccountSubscriptionRatePlanPtrOutput { return v.RatePlan }).(AccountSubscriptionRatePlanPtrOutput)
}

// The state that the subscription is in.
// Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
func (o AccountSubscriptionOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountSubscription) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type AccountSubscriptionArrayOutput struct{ *pulumi.OutputState }

func (AccountSubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountSubscription)(nil)).Elem()
}

func (o AccountSubscriptionArrayOutput) ToAccountSubscriptionArrayOutput() AccountSubscriptionArrayOutput {
	return o
}

func (o AccountSubscriptionArrayOutput) ToAccountSubscriptionArrayOutputWithContext(ctx context.Context) AccountSubscriptionArrayOutput {
	return o
}

func (o AccountSubscriptionArrayOutput) Index(i pulumi.IntInput) AccountSubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccountSubscription {
		return vs[0].([]*AccountSubscription)[vs[1].(int)]
	}).(AccountSubscriptionOutput)
}

type AccountSubscriptionMapOutput struct{ *pulumi.OutputState }

func (AccountSubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountSubscription)(nil)).Elem()
}

func (o AccountSubscriptionMapOutput) ToAccountSubscriptionMapOutput() AccountSubscriptionMapOutput {
	return o
}

func (o AccountSubscriptionMapOutput) ToAccountSubscriptionMapOutputWithContext(ctx context.Context) AccountSubscriptionMapOutput {
	return o
}

func (o AccountSubscriptionMapOutput) MapIndex(k pulumi.StringInput) AccountSubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccountSubscription {
		return vs[0].(map[string]*AccountSubscription)[vs[1].(string)]
	}).(AccountSubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountSubscriptionInput)(nil)).Elem(), &AccountSubscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountSubscriptionArrayInput)(nil)).Elem(), AccountSubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountSubscriptionMapInput)(nil)).Elem(), AccountSubscriptionMap{})
	pulumi.RegisterOutputType(AccountSubscriptionOutput{})
	pulumi.RegisterOutputType(AccountSubscriptionArrayOutput{})
	pulumi.RegisterOutputType(AccountSubscriptionMapOutput{})
}
