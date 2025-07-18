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
// $ pulumi import cloudflare:index/accessPolicy:AccessPolicy example '<account_id>/<policy_id>'
// ```
//
// Deprecated: cloudflare.index/accesspolicy.AccessPolicy has been deprecated in favor of cloudflare.index/zerotrustaccesspolicy.ZeroTrustAccessPolicy
type AccessPolicy struct {
	pulumi.CustomResourceState

	// Identifier.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Number of access applications currently using this policy.
	AppCount pulumi.IntOutput `pulumi:"appCount"`
	// Administrators who can approve a temporary authentication request.
	ApprovalGroups AccessPolicyApprovalGroupArrayOutput `pulumi:"approvalGroups"`
	// Requires the user to request access from an administrator at the start of each session.
	ApprovalRequired pulumi.BoolPtrOutput `pulumi:"approvalRequired"`
	CreatedAt        pulumi.StringOutput  `pulumi:"createdAt"`
	// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
	// Available values: "allow", "deny", "nonIdentity", "bypass".
	Decision pulumi.StringOutput `pulumi:"decision"`
	// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
	Excludes AccessPolicyExcludeArrayOutput `pulumi:"excludes"`
	// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
	Includes AccessPolicyIncludeArrayOutput `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy. 'Client Web Isolation' must be on for the account in order to use this feature.
	IsolationRequired pulumi.BoolPtrOutput `pulumi:"isolationRequired"`
	// The name of the Access policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// A custom message that will appear on the purpose justification screen.
	PurposeJustificationPrompt pulumi.StringPtrOutput `pulumi:"purposeJustificationPrompt"`
	// Require users to enter a justification when they log in to the application.
	PurposeJustificationRequired pulumi.BoolPtrOutput `pulumi:"purposeJustificationRequired"`
	// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
	Requires AccessPolicyRequireArrayOutput `pulumi:"requires"`
	Reusable pulumi.BoolOutput              `pulumi:"reusable"`
	// The amount of time that tokens issued for the application will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration pulumi.StringOutput `pulumi:"sessionDuration"`
	UpdatedAt       pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewAccessPolicy registers a new resource with the given unique name, arguments, and options.
func NewAccessPolicy(ctx *pulumi.Context,
	name string, args *AccessPolicyArgs, opts ...pulumi.ResourceOption) (*AccessPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Decision == nil {
		return nil, errors.New("invalid value for required argument 'Decision'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("cloudflare:index/accessPolicy:AccessPolicy"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessPolicy
	err := ctx.RegisterResource("cloudflare:index/accessPolicy:AccessPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessPolicy gets an existing AccessPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessPolicyState, opts ...pulumi.ResourceOption) (*AccessPolicy, error) {
	var resource AccessPolicy
	err := ctx.ReadResource("cloudflare:index/accessPolicy:AccessPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessPolicy resources.
type accessPolicyState struct {
	// Identifier.
	AccountId *string `pulumi:"accountId"`
	// Number of access applications currently using this policy.
	AppCount *int `pulumi:"appCount"`
	// Administrators who can approve a temporary authentication request.
	ApprovalGroups []AccessPolicyApprovalGroup `pulumi:"approvalGroups"`
	// Requires the user to request access from an administrator at the start of each session.
	ApprovalRequired *bool   `pulumi:"approvalRequired"`
	CreatedAt        *string `pulumi:"createdAt"`
	// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
	// Available values: "allow", "deny", "nonIdentity", "bypass".
	Decision *string `pulumi:"decision"`
	// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
	Excludes []AccessPolicyExclude `pulumi:"excludes"`
	// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
	Includes []AccessPolicyInclude `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy. 'Client Web Isolation' must be on for the account in order to use this feature.
	IsolationRequired *bool `pulumi:"isolationRequired"`
	// The name of the Access policy.
	Name *string `pulumi:"name"`
	// A custom message that will appear on the purpose justification screen.
	PurposeJustificationPrompt *string `pulumi:"purposeJustificationPrompt"`
	// Require users to enter a justification when they log in to the application.
	PurposeJustificationRequired *bool `pulumi:"purposeJustificationRequired"`
	// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
	Requires []AccessPolicyRequire `pulumi:"requires"`
	Reusable *bool                 `pulumi:"reusable"`
	// The amount of time that tokens issued for the application will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration *string `pulumi:"sessionDuration"`
	UpdatedAt       *string `pulumi:"updatedAt"`
}

type AccessPolicyState struct {
	// Identifier.
	AccountId pulumi.StringPtrInput
	// Number of access applications currently using this policy.
	AppCount pulumi.IntPtrInput
	// Administrators who can approve a temporary authentication request.
	ApprovalGroups AccessPolicyApprovalGroupArrayInput
	// Requires the user to request access from an administrator at the start of each session.
	ApprovalRequired pulumi.BoolPtrInput
	CreatedAt        pulumi.StringPtrInput
	// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
	// Available values: "allow", "deny", "nonIdentity", "bypass".
	Decision pulumi.StringPtrInput
	// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
	Excludes AccessPolicyExcludeArrayInput
	// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
	Includes AccessPolicyIncludeArrayInput
	// Require this application to be served in an isolated browser for users matching this policy. 'Client Web Isolation' must be on for the account in order to use this feature.
	IsolationRequired pulumi.BoolPtrInput
	// The name of the Access policy.
	Name pulumi.StringPtrInput
	// A custom message that will appear on the purpose justification screen.
	PurposeJustificationPrompt pulumi.StringPtrInput
	// Require users to enter a justification when they log in to the application.
	PurposeJustificationRequired pulumi.BoolPtrInput
	// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
	Requires AccessPolicyRequireArrayInput
	Reusable pulumi.BoolPtrInput
	// The amount of time that tokens issued for the application will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration pulumi.StringPtrInput
	UpdatedAt       pulumi.StringPtrInput
}

func (AccessPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPolicyState)(nil)).Elem()
}

type accessPolicyArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// Administrators who can approve a temporary authentication request.
	ApprovalGroups []AccessPolicyApprovalGroup `pulumi:"approvalGroups"`
	// Requires the user to request access from an administrator at the start of each session.
	ApprovalRequired *bool `pulumi:"approvalRequired"`
	// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
	// Available values: "allow", "deny", "nonIdentity", "bypass".
	Decision string `pulumi:"decision"`
	// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
	Excludes []AccessPolicyExclude `pulumi:"excludes"`
	// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
	Includes []AccessPolicyInclude `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy. 'Client Web Isolation' must be on for the account in order to use this feature.
	IsolationRequired *bool `pulumi:"isolationRequired"`
	// The name of the Access policy.
	Name string `pulumi:"name"`
	// A custom message that will appear on the purpose justification screen.
	PurposeJustificationPrompt *string `pulumi:"purposeJustificationPrompt"`
	// Require users to enter a justification when they log in to the application.
	PurposeJustificationRequired *bool `pulumi:"purposeJustificationRequired"`
	// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
	Requires []AccessPolicyRequire `pulumi:"requires"`
	// The amount of time that tokens issued for the application will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration *string `pulumi:"sessionDuration"`
}

// The set of arguments for constructing a AccessPolicy resource.
type AccessPolicyArgs struct {
	// Identifier.
	AccountId pulumi.StringInput
	// Administrators who can approve a temporary authentication request.
	ApprovalGroups AccessPolicyApprovalGroupArrayInput
	// Requires the user to request access from an administrator at the start of each session.
	ApprovalRequired pulumi.BoolPtrInput
	// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
	// Available values: "allow", "deny", "nonIdentity", "bypass".
	Decision pulumi.StringInput
	// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
	Excludes AccessPolicyExcludeArrayInput
	// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
	Includes AccessPolicyIncludeArrayInput
	// Require this application to be served in an isolated browser for users matching this policy. 'Client Web Isolation' must be on for the account in order to use this feature.
	IsolationRequired pulumi.BoolPtrInput
	// The name of the Access policy.
	Name pulumi.StringInput
	// A custom message that will appear on the purpose justification screen.
	PurposeJustificationPrompt pulumi.StringPtrInput
	// Require users to enter a justification when they log in to the application.
	PurposeJustificationRequired pulumi.BoolPtrInput
	// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
	Requires AccessPolicyRequireArrayInput
	// The amount of time that tokens issued for the application will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
	SessionDuration pulumi.StringPtrInput
}

func (AccessPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPolicyArgs)(nil)).Elem()
}

type AccessPolicyInput interface {
	pulumi.Input

	ToAccessPolicyOutput() AccessPolicyOutput
	ToAccessPolicyOutputWithContext(ctx context.Context) AccessPolicyOutput
}

func (*AccessPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPolicy)(nil)).Elem()
}

func (i *AccessPolicy) ToAccessPolicyOutput() AccessPolicyOutput {
	return i.ToAccessPolicyOutputWithContext(context.Background())
}

func (i *AccessPolicy) ToAccessPolicyOutputWithContext(ctx context.Context) AccessPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPolicyOutput)
}

// AccessPolicyArrayInput is an input type that accepts AccessPolicyArray and AccessPolicyArrayOutput values.
// You can construct a concrete instance of `AccessPolicyArrayInput` via:
//
//	AccessPolicyArray{ AccessPolicyArgs{...} }
type AccessPolicyArrayInput interface {
	pulumi.Input

	ToAccessPolicyArrayOutput() AccessPolicyArrayOutput
	ToAccessPolicyArrayOutputWithContext(context.Context) AccessPolicyArrayOutput
}

type AccessPolicyArray []AccessPolicyInput

func (AccessPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPolicy)(nil)).Elem()
}

func (i AccessPolicyArray) ToAccessPolicyArrayOutput() AccessPolicyArrayOutput {
	return i.ToAccessPolicyArrayOutputWithContext(context.Background())
}

func (i AccessPolicyArray) ToAccessPolicyArrayOutputWithContext(ctx context.Context) AccessPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPolicyArrayOutput)
}

// AccessPolicyMapInput is an input type that accepts AccessPolicyMap and AccessPolicyMapOutput values.
// You can construct a concrete instance of `AccessPolicyMapInput` via:
//
//	AccessPolicyMap{ "key": AccessPolicyArgs{...} }
type AccessPolicyMapInput interface {
	pulumi.Input

	ToAccessPolicyMapOutput() AccessPolicyMapOutput
	ToAccessPolicyMapOutputWithContext(context.Context) AccessPolicyMapOutput
}

type AccessPolicyMap map[string]AccessPolicyInput

func (AccessPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPolicy)(nil)).Elem()
}

func (i AccessPolicyMap) ToAccessPolicyMapOutput() AccessPolicyMapOutput {
	return i.ToAccessPolicyMapOutputWithContext(context.Background())
}

func (i AccessPolicyMap) ToAccessPolicyMapOutputWithContext(ctx context.Context) AccessPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPolicyMapOutput)
}

type AccessPolicyOutput struct{ *pulumi.OutputState }

func (AccessPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPolicy)(nil)).Elem()
}

func (o AccessPolicyOutput) ToAccessPolicyOutput() AccessPolicyOutput {
	return o
}

func (o AccessPolicyOutput) ToAccessPolicyOutputWithContext(ctx context.Context) AccessPolicyOutput {
	return o
}

// Identifier.
func (o AccessPolicyOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Number of access applications currently using this policy.
func (o AccessPolicyOutput) AppCount() pulumi.IntOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.IntOutput { return v.AppCount }).(pulumi.IntOutput)
}

// Administrators who can approve a temporary authentication request.
func (o AccessPolicyOutput) ApprovalGroups() AccessPolicyApprovalGroupArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyApprovalGroupArrayOutput { return v.ApprovalGroups }).(AccessPolicyApprovalGroupArrayOutput)
}

// Requires the user to request access from an administrator at the start of each session.
func (o AccessPolicyOutput) ApprovalRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.BoolPtrOutput { return v.ApprovalRequired }).(pulumi.BoolPtrOutput)
}

func (o AccessPolicyOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
// Available values: "allow", "deny", "nonIdentity", "bypass".
func (o AccessPolicyOutput) Decision() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.Decision }).(pulumi.StringOutput)
}

// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
func (o AccessPolicyOutput) Excludes() AccessPolicyExcludeArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyExcludeArrayOutput { return v.Excludes }).(AccessPolicyExcludeArrayOutput)
}

// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
func (o AccessPolicyOutput) Includes() AccessPolicyIncludeArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyIncludeArrayOutput { return v.Includes }).(AccessPolicyIncludeArrayOutput)
}

// Require this application to be served in an isolated browser for users matching this policy. 'Client Web Isolation' must be on for the account in order to use this feature.
func (o AccessPolicyOutput) IsolationRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.BoolPtrOutput { return v.IsolationRequired }).(pulumi.BoolPtrOutput)
}

// The name of the Access policy.
func (o AccessPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A custom message that will appear on the purpose justification screen.
func (o AccessPolicyOutput) PurposeJustificationPrompt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringPtrOutput { return v.PurposeJustificationPrompt }).(pulumi.StringPtrOutput)
}

// Require users to enter a justification when they log in to the application.
func (o AccessPolicyOutput) PurposeJustificationRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.BoolPtrOutput { return v.PurposeJustificationRequired }).(pulumi.BoolPtrOutput)
}

// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
func (o AccessPolicyOutput) Requires() AccessPolicyRequireArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyRequireArrayOutput { return v.Requires }).(AccessPolicyRequireArrayOutput)
}

func (o AccessPolicyOutput) Reusable() pulumi.BoolOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.BoolOutput { return v.Reusable }).(pulumi.BoolOutput)
}

// The amount of time that tokens issued for the application will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
func (o AccessPolicyOutput) SessionDuration() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.SessionDuration }).(pulumi.StringOutput)
}

func (o AccessPolicyOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type AccessPolicyArrayOutput struct{ *pulumi.OutputState }

func (AccessPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPolicy)(nil)).Elem()
}

func (o AccessPolicyArrayOutput) ToAccessPolicyArrayOutput() AccessPolicyArrayOutput {
	return o
}

func (o AccessPolicyArrayOutput) ToAccessPolicyArrayOutputWithContext(ctx context.Context) AccessPolicyArrayOutput {
	return o
}

func (o AccessPolicyArrayOutput) Index(i pulumi.IntInput) AccessPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessPolicy {
		return vs[0].([]*AccessPolicy)[vs[1].(int)]
	}).(AccessPolicyOutput)
}

type AccessPolicyMapOutput struct{ *pulumi.OutputState }

func (AccessPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPolicy)(nil)).Elem()
}

func (o AccessPolicyMapOutput) ToAccessPolicyMapOutput() AccessPolicyMapOutput {
	return o
}

func (o AccessPolicyMapOutput) ToAccessPolicyMapOutputWithContext(ctx context.Context) AccessPolicyMapOutput {
	return o
}

func (o AccessPolicyMapOutput) MapIndex(k pulumi.StringInput) AccessPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessPolicy {
		return vs[0].(map[string]*AccessPolicy)[vs[1].(string)]
	}).(AccessPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPolicyInput)(nil)).Elem(), &AccessPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPolicyArrayInput)(nil)).Elem(), AccessPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPolicyMapInput)(nil)).Elem(), AccessPolicyMap{})
	pulumi.RegisterOutputType(AccessPolicyOutput{})
	pulumi.RegisterOutputType(AccessPolicyArrayOutput{})
	pulumi.RegisterOutputType(AccessPolicyMapOutput{})
}
