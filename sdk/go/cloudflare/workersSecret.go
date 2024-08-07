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

// Provides a Cloudflare Worker secret resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewWorkersSecret(ctx, "my_secret", &cloudflare.WorkersSecretArgs{
//				AccountId:  pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:       pulumi.String("MY_EXAMPLE_SECRET_TEXT"),
//				ScriptName: pulumi.String("script_1"),
//				SecretText: pulumi.String("my_secret_value"),
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
// $ pulumi import cloudflare:index/workersSecret:WorkersSecret example <account_id>/<script_name>/<secret_name>
// ```
type WorkersSecret struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
	ScriptName pulumi.StringOutput `pulumi:"scriptName"`
	// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	SecretText pulumi.StringOutput `pulumi:"secretText"`
}

// NewWorkersSecret registers a new resource with the given unique name, arguments, and options.
func NewWorkersSecret(ctx *pulumi.Context,
	name string, args *WorkersSecretArgs, opts ...pulumi.ResourceOption) (*WorkersSecret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.ScriptName == nil {
		return nil, errors.New("invalid value for required argument 'ScriptName'")
	}
	if args.SecretText == nil {
		return nil, errors.New("invalid value for required argument 'SecretText'")
	}
	if args.SecretText != nil {
		args.SecretText = pulumi.ToSecret(args.SecretText).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretText",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkersSecret
	err := ctx.RegisterResource("cloudflare:index/workersSecret:WorkersSecret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkersSecret gets an existing WorkersSecret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkersSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkersSecretState, opts ...pulumi.ResourceOption) (*WorkersSecret, error) {
	var resource WorkersSecret
	err := ctx.ReadResource("cloudflare:index/workersSecret:WorkersSecret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkersSecret resources.
type workersSecretState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	Name *string `pulumi:"name"`
	// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
	ScriptName *string `pulumi:"scriptName"`
	// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	SecretText *string `pulumi:"secretText"`
}

type WorkersSecretState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringPtrInput
	// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
	ScriptName pulumi.StringPtrInput
	// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	SecretText pulumi.StringPtrInput
}

func (WorkersSecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*workersSecretState)(nil)).Elem()
}

type workersSecretArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	Name string `pulumi:"name"`
	// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
	ScriptName string `pulumi:"scriptName"`
	// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	SecretText string `pulumi:"secretText"`
}

// The set of arguments for constructing a WorkersSecret resource.
type WorkersSecretArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringInput
	// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
	ScriptName pulumi.StringInput
	// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
	SecretText pulumi.StringInput
}

func (WorkersSecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workersSecretArgs)(nil)).Elem()
}

type WorkersSecretInput interface {
	pulumi.Input

	ToWorkersSecretOutput() WorkersSecretOutput
	ToWorkersSecretOutputWithContext(ctx context.Context) WorkersSecretOutput
}

func (*WorkersSecret) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersSecret)(nil)).Elem()
}

func (i *WorkersSecret) ToWorkersSecretOutput() WorkersSecretOutput {
	return i.ToWorkersSecretOutputWithContext(context.Background())
}

func (i *WorkersSecret) ToWorkersSecretOutputWithContext(ctx context.Context) WorkersSecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersSecretOutput)
}

// WorkersSecretArrayInput is an input type that accepts WorkersSecretArray and WorkersSecretArrayOutput values.
// You can construct a concrete instance of `WorkersSecretArrayInput` via:
//
//	WorkersSecretArray{ WorkersSecretArgs{...} }
type WorkersSecretArrayInput interface {
	pulumi.Input

	ToWorkersSecretArrayOutput() WorkersSecretArrayOutput
	ToWorkersSecretArrayOutputWithContext(context.Context) WorkersSecretArrayOutput
}

type WorkersSecretArray []WorkersSecretInput

func (WorkersSecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersSecret)(nil)).Elem()
}

func (i WorkersSecretArray) ToWorkersSecretArrayOutput() WorkersSecretArrayOutput {
	return i.ToWorkersSecretArrayOutputWithContext(context.Background())
}

func (i WorkersSecretArray) ToWorkersSecretArrayOutputWithContext(ctx context.Context) WorkersSecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersSecretArrayOutput)
}

// WorkersSecretMapInput is an input type that accepts WorkersSecretMap and WorkersSecretMapOutput values.
// You can construct a concrete instance of `WorkersSecretMapInput` via:
//
//	WorkersSecretMap{ "key": WorkersSecretArgs{...} }
type WorkersSecretMapInput interface {
	pulumi.Input

	ToWorkersSecretMapOutput() WorkersSecretMapOutput
	ToWorkersSecretMapOutputWithContext(context.Context) WorkersSecretMapOutput
}

type WorkersSecretMap map[string]WorkersSecretInput

func (WorkersSecretMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersSecret)(nil)).Elem()
}

func (i WorkersSecretMap) ToWorkersSecretMapOutput() WorkersSecretMapOutput {
	return i.ToWorkersSecretMapOutputWithContext(context.Background())
}

func (i WorkersSecretMap) ToWorkersSecretMapOutputWithContext(ctx context.Context) WorkersSecretMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersSecretMapOutput)
}

type WorkersSecretOutput struct{ *pulumi.OutputState }

func (WorkersSecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersSecret)(nil)).Elem()
}

func (o WorkersSecretOutput) ToWorkersSecretOutput() WorkersSecretOutput {
	return o
}

func (o WorkersSecretOutput) ToWorkersSecretOutputWithContext(ctx context.Context) WorkersSecretOutput {
	return o
}

// The account identifier to target for the resource.
func (o WorkersSecretOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersSecret) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
func (o WorkersSecretOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersSecret) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
func (o WorkersSecretOutput) ScriptName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersSecret) pulumi.StringOutput { return v.ScriptName }).(pulumi.StringOutput)
}

// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
func (o WorkersSecretOutput) SecretText() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersSecret) pulumi.StringOutput { return v.SecretText }).(pulumi.StringOutput)
}

type WorkersSecretArrayOutput struct{ *pulumi.OutputState }

func (WorkersSecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersSecret)(nil)).Elem()
}

func (o WorkersSecretArrayOutput) ToWorkersSecretArrayOutput() WorkersSecretArrayOutput {
	return o
}

func (o WorkersSecretArrayOutput) ToWorkersSecretArrayOutputWithContext(ctx context.Context) WorkersSecretArrayOutput {
	return o
}

func (o WorkersSecretArrayOutput) Index(i pulumi.IntInput) WorkersSecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkersSecret {
		return vs[0].([]*WorkersSecret)[vs[1].(int)]
	}).(WorkersSecretOutput)
}

type WorkersSecretMapOutput struct{ *pulumi.OutputState }

func (WorkersSecretMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersSecret)(nil)).Elem()
}

func (o WorkersSecretMapOutput) ToWorkersSecretMapOutput() WorkersSecretMapOutput {
	return o
}

func (o WorkersSecretMapOutput) ToWorkersSecretMapOutputWithContext(ctx context.Context) WorkersSecretMapOutput {
	return o
}

func (o WorkersSecretMapOutput) MapIndex(k pulumi.StringInput) WorkersSecretOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkersSecret {
		return vs[0].(map[string]*WorkersSecret)[vs[1].(string)]
	}).(WorkersSecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersSecretInput)(nil)).Elem(), &WorkersSecret{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersSecretArrayInput)(nil)).Elem(), WorkersSecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersSecretMapInput)(nil)).Elem(), WorkersSecretMap{})
	pulumi.RegisterOutputType(WorkersSecretOutput{})
	pulumi.RegisterOutputType(WorkersSecretArrayOutput{})
	pulumi.RegisterOutputType(WorkersSecretMapOutput{})
}
