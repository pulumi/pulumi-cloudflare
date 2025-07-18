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
//			_, err := cloudflare.NewWorkersForPlatformsDispatchNamespace(ctx, "example_workers_for_platforms_dispatch_namespace", &cloudflare.WorkersForPlatformsDispatchNamespaceArgs{
//				AccountId: pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				Name:      pulumi.String("my-dispatch-namespace"),
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
// $ pulumi import cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace example '<account_id>/<dispatch_namespace>'
// ```
//
// Deprecated: cloudflare.index/workersforplatformsnamespace.WorkersForPlatformsNamespace has been deprecated in favor of cloudflare.index/workersforplatformsdispatchnamespace.WorkersForPlatformsDispatchNamespace
type WorkersForPlatformsNamespace struct {
	pulumi.CustomResourceState

	// Identifier.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Identifier.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// When the script was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Identifier.
	ModifiedBy pulumi.StringOutput `pulumi:"modifiedBy"`
	// When the script was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The name of the dispatch namespace.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// API Resource UUID tag.
	NamespaceId pulumi.StringOutput `pulumi:"namespaceId"`
	// Name of the Workers for Platforms dispatch namespace.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
	// The current number of scripts in this Dispatch Namespace.
	ScriptCount pulumi.IntOutput `pulumi:"scriptCount"`
}

// NewWorkersForPlatformsNamespace registers a new resource with the given unique name, arguments, and options.
func NewWorkersForPlatformsNamespace(ctx *pulumi.Context,
	name string, args *WorkersForPlatformsNamespaceArgs, opts ...pulumi.ResourceOption) (*WorkersForPlatformsNamespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkersForPlatformsNamespace
	err := ctx.RegisterResource("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkersForPlatformsNamespace gets an existing WorkersForPlatformsNamespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkersForPlatformsNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkersForPlatformsNamespaceState, opts ...pulumi.ResourceOption) (*WorkersForPlatformsNamespace, error) {
	var resource WorkersForPlatformsNamespace
	err := ctx.ReadResource("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkersForPlatformsNamespace resources.
type workersForPlatformsNamespaceState struct {
	// Identifier.
	AccountId *string `pulumi:"accountId"`
	// Identifier.
	CreatedBy *string `pulumi:"createdBy"`
	// When the script was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Identifier.
	ModifiedBy *string `pulumi:"modifiedBy"`
	// When the script was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The name of the dispatch namespace.
	Name *string `pulumi:"name"`
	// API Resource UUID tag.
	NamespaceId *string `pulumi:"namespaceId"`
	// Name of the Workers for Platforms dispatch namespace.
	NamespaceName *string `pulumi:"namespaceName"`
	// The current number of scripts in this Dispatch Namespace.
	ScriptCount *int `pulumi:"scriptCount"`
}

type WorkersForPlatformsNamespaceState struct {
	// Identifier.
	AccountId pulumi.StringPtrInput
	// Identifier.
	CreatedBy pulumi.StringPtrInput
	// When the script was created.
	CreatedOn pulumi.StringPtrInput
	// Identifier.
	ModifiedBy pulumi.StringPtrInput
	// When the script was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The name of the dispatch namespace.
	Name pulumi.StringPtrInput
	// API Resource UUID tag.
	NamespaceId pulumi.StringPtrInput
	// Name of the Workers for Platforms dispatch namespace.
	NamespaceName pulumi.StringPtrInput
	// The current number of scripts in this Dispatch Namespace.
	ScriptCount pulumi.IntPtrInput
}

func (WorkersForPlatformsNamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*workersForPlatformsNamespaceState)(nil)).Elem()
}

type workersForPlatformsNamespaceArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// The name of the dispatch namespace.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a WorkersForPlatformsNamespace resource.
type WorkersForPlatformsNamespaceArgs struct {
	// Identifier.
	AccountId pulumi.StringInput
	// The name of the dispatch namespace.
	Name pulumi.StringPtrInput
}

func (WorkersForPlatformsNamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workersForPlatformsNamespaceArgs)(nil)).Elem()
}

type WorkersForPlatformsNamespaceInput interface {
	pulumi.Input

	ToWorkersForPlatformsNamespaceOutput() WorkersForPlatformsNamespaceOutput
	ToWorkersForPlatformsNamespaceOutputWithContext(ctx context.Context) WorkersForPlatformsNamespaceOutput
}

func (*WorkersForPlatformsNamespace) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersForPlatformsNamespace)(nil)).Elem()
}

func (i *WorkersForPlatformsNamespace) ToWorkersForPlatformsNamespaceOutput() WorkersForPlatformsNamespaceOutput {
	return i.ToWorkersForPlatformsNamespaceOutputWithContext(context.Background())
}

func (i *WorkersForPlatformsNamespace) ToWorkersForPlatformsNamespaceOutputWithContext(ctx context.Context) WorkersForPlatformsNamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersForPlatformsNamespaceOutput)
}

// WorkersForPlatformsNamespaceArrayInput is an input type that accepts WorkersForPlatformsNamespaceArray and WorkersForPlatformsNamespaceArrayOutput values.
// You can construct a concrete instance of `WorkersForPlatformsNamespaceArrayInput` via:
//
//	WorkersForPlatformsNamespaceArray{ WorkersForPlatformsNamespaceArgs{...} }
type WorkersForPlatformsNamespaceArrayInput interface {
	pulumi.Input

	ToWorkersForPlatformsNamespaceArrayOutput() WorkersForPlatformsNamespaceArrayOutput
	ToWorkersForPlatformsNamespaceArrayOutputWithContext(context.Context) WorkersForPlatformsNamespaceArrayOutput
}

type WorkersForPlatformsNamespaceArray []WorkersForPlatformsNamespaceInput

func (WorkersForPlatformsNamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersForPlatformsNamespace)(nil)).Elem()
}

func (i WorkersForPlatformsNamespaceArray) ToWorkersForPlatformsNamespaceArrayOutput() WorkersForPlatformsNamespaceArrayOutput {
	return i.ToWorkersForPlatformsNamespaceArrayOutputWithContext(context.Background())
}

func (i WorkersForPlatformsNamespaceArray) ToWorkersForPlatformsNamespaceArrayOutputWithContext(ctx context.Context) WorkersForPlatformsNamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersForPlatformsNamespaceArrayOutput)
}

// WorkersForPlatformsNamespaceMapInput is an input type that accepts WorkersForPlatformsNamespaceMap and WorkersForPlatformsNamespaceMapOutput values.
// You can construct a concrete instance of `WorkersForPlatformsNamespaceMapInput` via:
//
//	WorkersForPlatformsNamespaceMap{ "key": WorkersForPlatformsNamespaceArgs{...} }
type WorkersForPlatformsNamespaceMapInput interface {
	pulumi.Input

	ToWorkersForPlatformsNamespaceMapOutput() WorkersForPlatformsNamespaceMapOutput
	ToWorkersForPlatformsNamespaceMapOutputWithContext(context.Context) WorkersForPlatformsNamespaceMapOutput
}

type WorkersForPlatformsNamespaceMap map[string]WorkersForPlatformsNamespaceInput

func (WorkersForPlatformsNamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersForPlatformsNamespace)(nil)).Elem()
}

func (i WorkersForPlatformsNamespaceMap) ToWorkersForPlatformsNamespaceMapOutput() WorkersForPlatformsNamespaceMapOutput {
	return i.ToWorkersForPlatformsNamespaceMapOutputWithContext(context.Background())
}

func (i WorkersForPlatformsNamespaceMap) ToWorkersForPlatformsNamespaceMapOutputWithContext(ctx context.Context) WorkersForPlatformsNamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersForPlatformsNamespaceMapOutput)
}

type WorkersForPlatformsNamespaceOutput struct{ *pulumi.OutputState }

func (WorkersForPlatformsNamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersForPlatformsNamespace)(nil)).Elem()
}

func (o WorkersForPlatformsNamespaceOutput) ToWorkersForPlatformsNamespaceOutput() WorkersForPlatformsNamespaceOutput {
	return o
}

func (o WorkersForPlatformsNamespaceOutput) ToWorkersForPlatformsNamespaceOutputWithContext(ctx context.Context) WorkersForPlatformsNamespaceOutput {
	return o
}

// Identifier.
func (o WorkersForPlatformsNamespaceOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Identifier.
func (o WorkersForPlatformsNamespaceOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// When the script was created.
func (o WorkersForPlatformsNamespaceOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Identifier.
func (o WorkersForPlatformsNamespaceOutput) ModifiedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringOutput { return v.ModifiedBy }).(pulumi.StringOutput)
}

// When the script was last modified.
func (o WorkersForPlatformsNamespaceOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringOutput { return v.ModifiedOn }).(pulumi.StringOutput)
}

// The name of the dispatch namespace.
func (o WorkersForPlatformsNamespaceOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// API Resource UUID tag.
func (o WorkersForPlatformsNamespaceOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringOutput { return v.NamespaceId }).(pulumi.StringOutput)
}

// Name of the Workers for Platforms dispatch namespace.
func (o WorkersForPlatformsNamespaceOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
}

// The current number of scripts in this Dispatch Namespace.
func (o WorkersForPlatformsNamespaceOutput) ScriptCount() pulumi.IntOutput {
	return o.ApplyT(func(v *WorkersForPlatformsNamespace) pulumi.IntOutput { return v.ScriptCount }).(pulumi.IntOutput)
}

type WorkersForPlatformsNamespaceArrayOutput struct{ *pulumi.OutputState }

func (WorkersForPlatformsNamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersForPlatformsNamespace)(nil)).Elem()
}

func (o WorkersForPlatformsNamespaceArrayOutput) ToWorkersForPlatformsNamespaceArrayOutput() WorkersForPlatformsNamespaceArrayOutput {
	return o
}

func (o WorkersForPlatformsNamespaceArrayOutput) ToWorkersForPlatformsNamespaceArrayOutputWithContext(ctx context.Context) WorkersForPlatformsNamespaceArrayOutput {
	return o
}

func (o WorkersForPlatformsNamespaceArrayOutput) Index(i pulumi.IntInput) WorkersForPlatformsNamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkersForPlatformsNamespace {
		return vs[0].([]*WorkersForPlatformsNamespace)[vs[1].(int)]
	}).(WorkersForPlatformsNamespaceOutput)
}

type WorkersForPlatformsNamespaceMapOutput struct{ *pulumi.OutputState }

func (WorkersForPlatformsNamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersForPlatformsNamespace)(nil)).Elem()
}

func (o WorkersForPlatformsNamespaceMapOutput) ToWorkersForPlatformsNamespaceMapOutput() WorkersForPlatformsNamespaceMapOutput {
	return o
}

func (o WorkersForPlatformsNamespaceMapOutput) ToWorkersForPlatformsNamespaceMapOutputWithContext(ctx context.Context) WorkersForPlatformsNamespaceMapOutput {
	return o
}

func (o WorkersForPlatformsNamespaceMapOutput) MapIndex(k pulumi.StringInput) WorkersForPlatformsNamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkersForPlatformsNamespace {
		return vs[0].(map[string]*WorkersForPlatformsNamespace)[vs[1].(string)]
	}).(WorkersForPlatformsNamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersForPlatformsNamespaceInput)(nil)).Elem(), &WorkersForPlatformsNamespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersForPlatformsNamespaceArrayInput)(nil)).Elem(), WorkersForPlatformsNamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersForPlatformsNamespaceMapInput)(nil)).Elem(), WorkersForPlatformsNamespaceMap{})
	pulumi.RegisterOutputType(WorkersForPlatformsNamespaceOutput{})
	pulumi.RegisterOutputType(WorkersForPlatformsNamespaceArrayOutput{})
	pulumi.RegisterOutputType(WorkersForPlatformsNamespaceMapOutput{})
}
