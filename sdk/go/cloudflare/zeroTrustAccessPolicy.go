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

// Provides a Cloudflare Access Policy resource. Access Policies are
// used in conjunction with Access Applications to restrict access to
// a particular resource.
//
// > It's required that an `accountId` or `zoneId` is provided and in most cases using either is fine.
//
//	However, if you're using a scoped access token, you must provide the argument that matches the token's
//	scope. For example, an access token that is scoped to the "example.com" zone needs to use the `zoneId` argument.
//	If 'application_id' is omitted, the policy created can be reused by multiple access applications.
//	Any AccessApplication resource can reference reusable policies through its `policies` argument.
//	To destroy a reusable policy and remove it from all applications' policies lists on the same apply, preemptively set the
//	lifecycle option `createBeforeDestroy` to true on the 'cloudflare_access_policy' resource.
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy example account/<account_id>/<application_id>/<policy_id>
// ```
type ZeroTrustAccessPolicy struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
	ApplicationId    pulumi.StringPtrOutput                        `pulumi:"applicationId"`
	ApprovalGroups   ZeroTrustAccessPolicyApprovalGroupArrayOutput `pulumi:"approvalGroups"`
	ApprovalRequired pulumi.BoolPtrOutput                          `pulumi:"approvalRequired"`
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision pulumi.StringOutput `pulumi:"decision"`
	// A series of access conditions, see Access Groups.
	Excludes ZeroTrustAccessPolicyExcludeArrayOutput `pulumi:"excludes"`
	// A series of access conditions, see Access Groups.
	Includes ZeroTrustAccessPolicyIncludeArrayOutput `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired pulumi.BoolPtrOutput `pulumi:"isolationRequired"`
	// Friendly name of the Access Policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique precedence for policies on a single application. Required when using `applicationId`.
	Precedence pulumi.IntPtrOutput `pulumi:"precedence"`
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt pulumi.StringPtrOutput `pulumi:"purposeJustificationPrompt"`
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired pulumi.BoolPtrOutput `pulumi:"purposeJustificationRequired"`
	// A series of access conditions, see Access Groups.
	Requires ZeroTrustAccessPolicyRequireArrayOutput `pulumi:"requires"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration pulumi.StringPtrOutput `pulumi:"sessionDuration"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewZeroTrustAccessPolicy registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustAccessPolicy(ctx *pulumi.Context,
	name string, args *ZeroTrustAccessPolicyArgs, opts ...pulumi.ResourceOption) (*ZeroTrustAccessPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Decision == nil {
		return nil, errors.New("invalid value for required argument 'Decision'")
	}
	if args.Includes == nil {
		return nil, errors.New("invalid value for required argument 'Includes'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustAccessPolicy
	err := ctx.RegisterResource("cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustAccessPolicy gets an existing ZeroTrustAccessPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustAccessPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustAccessPolicyState, opts ...pulumi.ResourceOption) (*ZeroTrustAccessPolicy, error) {
	var resource ZeroTrustAccessPolicy
	err := ctx.ReadResource("cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustAccessPolicy resources.
type zeroTrustAccessPolicyState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
	ApplicationId    *string                              `pulumi:"applicationId"`
	ApprovalGroups   []ZeroTrustAccessPolicyApprovalGroup `pulumi:"approvalGroups"`
	ApprovalRequired *bool                                `pulumi:"approvalRequired"`
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision *string `pulumi:"decision"`
	// A series of access conditions, see Access Groups.
	Excludes []ZeroTrustAccessPolicyExclude `pulumi:"excludes"`
	// A series of access conditions, see Access Groups.
	Includes []ZeroTrustAccessPolicyInclude `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired *bool `pulumi:"isolationRequired"`
	// Friendly name of the Access Policy.
	Name *string `pulumi:"name"`
	// The unique precedence for policies on a single application. Required when using `applicationId`.
	Precedence *int `pulumi:"precedence"`
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt *string `pulumi:"purposeJustificationPrompt"`
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired *bool `pulumi:"purposeJustificationRequired"`
	// A series of access conditions, see Access Groups.
	Requires []ZeroTrustAccessPolicyRequire `pulumi:"requires"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type ZeroTrustAccessPolicyState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
	ApplicationId    pulumi.StringPtrInput
	ApprovalGroups   ZeroTrustAccessPolicyApprovalGroupArrayInput
	ApprovalRequired pulumi.BoolPtrInput
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision pulumi.StringPtrInput
	// A series of access conditions, see Access Groups.
	Excludes ZeroTrustAccessPolicyExcludeArrayInput
	// A series of access conditions, see Access Groups.
	Includes ZeroTrustAccessPolicyIncludeArrayInput
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired pulumi.BoolPtrInput
	// Friendly name of the Access Policy.
	Name pulumi.StringPtrInput
	// The unique precedence for policies on a single application. Required when using `applicationId`.
	Precedence pulumi.IntPtrInput
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt pulumi.StringPtrInput
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired pulumi.BoolPtrInput
	// A series of access conditions, see Access Groups.
	Requires ZeroTrustAccessPolicyRequireArrayInput
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustAccessPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessPolicyState)(nil)).Elem()
}

type zeroTrustAccessPolicyArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
	ApplicationId    *string                              `pulumi:"applicationId"`
	ApprovalGroups   []ZeroTrustAccessPolicyApprovalGroup `pulumi:"approvalGroups"`
	ApprovalRequired *bool                                `pulumi:"approvalRequired"`
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision string `pulumi:"decision"`
	// A series of access conditions, see Access Groups.
	Excludes []ZeroTrustAccessPolicyExclude `pulumi:"excludes"`
	// A series of access conditions, see Access Groups.
	Includes []ZeroTrustAccessPolicyInclude `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired *bool `pulumi:"isolationRequired"`
	// Friendly name of the Access Policy.
	Name string `pulumi:"name"`
	// The unique precedence for policies on a single application. Required when using `applicationId`.
	Precedence *int `pulumi:"precedence"`
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt *string `pulumi:"purposeJustificationPrompt"`
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired *bool `pulumi:"purposeJustificationRequired"`
	// A series of access conditions, see Access Groups.
	Requires []ZeroTrustAccessPolicyRequire `pulumi:"requires"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ZeroTrustAccessPolicy resource.
type ZeroTrustAccessPolicyArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
	ApplicationId    pulumi.StringPtrInput
	ApprovalGroups   ZeroTrustAccessPolicyApprovalGroupArrayInput
	ApprovalRequired pulumi.BoolPtrInput
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision pulumi.StringInput
	// A series of access conditions, see Access Groups.
	Excludes ZeroTrustAccessPolicyExcludeArrayInput
	// A series of access conditions, see Access Groups.
	Includes ZeroTrustAccessPolicyIncludeArrayInput
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired pulumi.BoolPtrInput
	// Friendly name of the Access Policy.
	Name pulumi.StringInput
	// The unique precedence for policies on a single application. Required when using `applicationId`.
	Precedence pulumi.IntPtrInput
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt pulumi.StringPtrInput
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired pulumi.BoolPtrInput
	// A series of access conditions, see Access Groups.
	Requires ZeroTrustAccessPolicyRequireArrayInput
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustAccessPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessPolicyArgs)(nil)).Elem()
}

type ZeroTrustAccessPolicyInput interface {
	pulumi.Input

	ToZeroTrustAccessPolicyOutput() ZeroTrustAccessPolicyOutput
	ToZeroTrustAccessPolicyOutputWithContext(ctx context.Context) ZeroTrustAccessPolicyOutput
}

func (*ZeroTrustAccessPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessPolicy)(nil)).Elem()
}

func (i *ZeroTrustAccessPolicy) ToZeroTrustAccessPolicyOutput() ZeroTrustAccessPolicyOutput {
	return i.ToZeroTrustAccessPolicyOutputWithContext(context.Background())
}

func (i *ZeroTrustAccessPolicy) ToZeroTrustAccessPolicyOutputWithContext(ctx context.Context) ZeroTrustAccessPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessPolicyOutput)
}

// ZeroTrustAccessPolicyArrayInput is an input type that accepts ZeroTrustAccessPolicyArray and ZeroTrustAccessPolicyArrayOutput values.
// You can construct a concrete instance of `ZeroTrustAccessPolicyArrayInput` via:
//
//	ZeroTrustAccessPolicyArray{ ZeroTrustAccessPolicyArgs{...} }
type ZeroTrustAccessPolicyArrayInput interface {
	pulumi.Input

	ToZeroTrustAccessPolicyArrayOutput() ZeroTrustAccessPolicyArrayOutput
	ToZeroTrustAccessPolicyArrayOutputWithContext(context.Context) ZeroTrustAccessPolicyArrayOutput
}

type ZeroTrustAccessPolicyArray []ZeroTrustAccessPolicyInput

func (ZeroTrustAccessPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessPolicy)(nil)).Elem()
}

func (i ZeroTrustAccessPolicyArray) ToZeroTrustAccessPolicyArrayOutput() ZeroTrustAccessPolicyArrayOutput {
	return i.ToZeroTrustAccessPolicyArrayOutputWithContext(context.Background())
}

func (i ZeroTrustAccessPolicyArray) ToZeroTrustAccessPolicyArrayOutputWithContext(ctx context.Context) ZeroTrustAccessPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessPolicyArrayOutput)
}

// ZeroTrustAccessPolicyMapInput is an input type that accepts ZeroTrustAccessPolicyMap and ZeroTrustAccessPolicyMapOutput values.
// You can construct a concrete instance of `ZeroTrustAccessPolicyMapInput` via:
//
//	ZeroTrustAccessPolicyMap{ "key": ZeroTrustAccessPolicyArgs{...} }
type ZeroTrustAccessPolicyMapInput interface {
	pulumi.Input

	ToZeroTrustAccessPolicyMapOutput() ZeroTrustAccessPolicyMapOutput
	ToZeroTrustAccessPolicyMapOutputWithContext(context.Context) ZeroTrustAccessPolicyMapOutput
}

type ZeroTrustAccessPolicyMap map[string]ZeroTrustAccessPolicyInput

func (ZeroTrustAccessPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessPolicy)(nil)).Elem()
}

func (i ZeroTrustAccessPolicyMap) ToZeroTrustAccessPolicyMapOutput() ZeroTrustAccessPolicyMapOutput {
	return i.ToZeroTrustAccessPolicyMapOutputWithContext(context.Background())
}

func (i ZeroTrustAccessPolicyMap) ToZeroTrustAccessPolicyMapOutputWithContext(ctx context.Context) ZeroTrustAccessPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessPolicyMapOutput)
}

type ZeroTrustAccessPolicyOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessPolicy)(nil)).Elem()
}

func (o ZeroTrustAccessPolicyOutput) ToZeroTrustAccessPolicyOutput() ZeroTrustAccessPolicyOutput {
	return o
}

func (o ZeroTrustAccessPolicyOutput) ToZeroTrustAccessPolicyOutputWithContext(ctx context.Context) ZeroTrustAccessPolicyOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
func (o ZeroTrustAccessPolicyOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
func (o ZeroTrustAccessPolicyOutput) ApplicationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.StringPtrOutput { return v.ApplicationId }).(pulumi.StringPtrOutput)
}

func (o ZeroTrustAccessPolicyOutput) ApprovalGroups() ZeroTrustAccessPolicyApprovalGroupArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) ZeroTrustAccessPolicyApprovalGroupArrayOutput { return v.ApprovalGroups }).(ZeroTrustAccessPolicyApprovalGroupArrayOutput)
}

func (o ZeroTrustAccessPolicyOutput) ApprovalRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.BoolPtrOutput { return v.ApprovalRequired }).(pulumi.BoolPtrOutput)
}

// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
func (o ZeroTrustAccessPolicyOutput) Decision() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.StringOutput { return v.Decision }).(pulumi.StringOutput)
}

// A series of access conditions, see Access Groups.
func (o ZeroTrustAccessPolicyOutput) Excludes() ZeroTrustAccessPolicyExcludeArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) ZeroTrustAccessPolicyExcludeArrayOutput { return v.Excludes }).(ZeroTrustAccessPolicyExcludeArrayOutput)
}

// A series of access conditions, see Access Groups.
func (o ZeroTrustAccessPolicyOutput) Includes() ZeroTrustAccessPolicyIncludeArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) ZeroTrustAccessPolicyIncludeArrayOutput { return v.Includes }).(ZeroTrustAccessPolicyIncludeArrayOutput)
}

// Require this application to be served in an isolated browser for users matching this policy.
func (o ZeroTrustAccessPolicyOutput) IsolationRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.BoolPtrOutput { return v.IsolationRequired }).(pulumi.BoolPtrOutput)
}

// Friendly name of the Access Policy.
func (o ZeroTrustAccessPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The unique precedence for policies on a single application. Required when using `applicationId`.
func (o ZeroTrustAccessPolicyOutput) Precedence() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.IntPtrOutput { return v.Precedence }).(pulumi.IntPtrOutput)
}

// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
func (o ZeroTrustAccessPolicyOutput) PurposeJustificationPrompt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.StringPtrOutput { return v.PurposeJustificationPrompt }).(pulumi.StringPtrOutput)
}

// Whether to prompt the user for a justification for accessing the resource.
func (o ZeroTrustAccessPolicyOutput) PurposeJustificationRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.BoolPtrOutput { return v.PurposeJustificationRequired }).(pulumi.BoolPtrOutput)
}

// A series of access conditions, see Access Groups.
func (o ZeroTrustAccessPolicyOutput) Requires() ZeroTrustAccessPolicyRequireArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) ZeroTrustAccessPolicyRequireArrayOutput { return v.Requires }).(ZeroTrustAccessPolicyRequireArrayOutput)
}

// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
func (o ZeroTrustAccessPolicyOutput) SessionDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.StringPtrOutput { return v.SessionDuration }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
func (o ZeroTrustAccessPolicyOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessPolicy) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type ZeroTrustAccessPolicyArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessPolicy)(nil)).Elem()
}

func (o ZeroTrustAccessPolicyArrayOutput) ToZeroTrustAccessPolicyArrayOutput() ZeroTrustAccessPolicyArrayOutput {
	return o
}

func (o ZeroTrustAccessPolicyArrayOutput) ToZeroTrustAccessPolicyArrayOutputWithContext(ctx context.Context) ZeroTrustAccessPolicyArrayOutput {
	return o
}

func (o ZeroTrustAccessPolicyArrayOutput) Index(i pulumi.IntInput) ZeroTrustAccessPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustAccessPolicy {
		return vs[0].([]*ZeroTrustAccessPolicy)[vs[1].(int)]
	}).(ZeroTrustAccessPolicyOutput)
}

type ZeroTrustAccessPolicyMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessPolicy)(nil)).Elem()
}

func (o ZeroTrustAccessPolicyMapOutput) ToZeroTrustAccessPolicyMapOutput() ZeroTrustAccessPolicyMapOutput {
	return o
}

func (o ZeroTrustAccessPolicyMapOutput) ToZeroTrustAccessPolicyMapOutputWithContext(ctx context.Context) ZeroTrustAccessPolicyMapOutput {
	return o
}

func (o ZeroTrustAccessPolicyMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustAccessPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustAccessPolicy {
		return vs[0].(map[string]*ZeroTrustAccessPolicy)[vs[1].(string)]
	}).(ZeroTrustAccessPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessPolicyInput)(nil)).Elem(), &ZeroTrustAccessPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessPolicyArrayInput)(nil)).Elem(), ZeroTrustAccessPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessPolicyMapInput)(nil)).Elem(), ZeroTrustAccessPolicyMap{})
	pulumi.RegisterOutputType(ZeroTrustAccessPolicyOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessPolicyArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessPolicyMapOutput{})
}