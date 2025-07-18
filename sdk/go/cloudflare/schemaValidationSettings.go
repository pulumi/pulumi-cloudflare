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
//			_, err := cloudflare.NewSchemaValidationSettings(ctx, "example_schema_validation_settings", &cloudflare.SchemaValidationSettingsArgs{
//				ZoneId:                             pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				ValidationDefaultMitigationAction:  pulumi.String("block"),
//				ValidationOverrideMitigationAction: pulumi.String("none"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type SchemaValidationSettings struct {
	pulumi.CustomResourceState

	// The default mitigation action used Mitigation actions are as follows: - `"log"` - log request when request does not
	// conform to schema - `"block"` - deny access to the site when request does not conform to schema - `"none"` - skip
	// running schema validation Available values: "none", "log", "block".
	ValidationDefaultMitigationAction pulumi.StringOutput `pulumi:"validationDefaultMitigationAction"`
	// When set, this overrides both zone level and operation level mitigation actions. - `"none"` - skip running schema
	// validation entirely for the request - `null` - clears any existing override Available values: "none".
	ValidationOverrideMitigationAction pulumi.StringPtrOutput `pulumi:"validationOverrideMitigationAction"`
	// Identifier.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewSchemaValidationSettings registers a new resource with the given unique name, arguments, and options.
func NewSchemaValidationSettings(ctx *pulumi.Context,
	name string, args *SchemaValidationSettingsArgs, opts ...pulumi.ResourceOption) (*SchemaValidationSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ValidationDefaultMitigationAction == nil {
		return nil, errors.New("invalid value for required argument 'ValidationDefaultMitigationAction'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SchemaValidationSettings
	err := ctx.RegisterResource("cloudflare:index/schemaValidationSettings:SchemaValidationSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchemaValidationSettings gets an existing SchemaValidationSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchemaValidationSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaValidationSettingsState, opts ...pulumi.ResourceOption) (*SchemaValidationSettings, error) {
	var resource SchemaValidationSettings
	err := ctx.ReadResource("cloudflare:index/schemaValidationSettings:SchemaValidationSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchemaValidationSettings resources.
type schemaValidationSettingsState struct {
	// The default mitigation action used Mitigation actions are as follows: - `"log"` - log request when request does not
	// conform to schema - `"block"` - deny access to the site when request does not conform to schema - `"none"` - skip
	// running schema validation Available values: "none", "log", "block".
	ValidationDefaultMitigationAction *string `pulumi:"validationDefaultMitigationAction"`
	// When set, this overrides both zone level and operation level mitigation actions. - `"none"` - skip running schema
	// validation entirely for the request - `null` - clears any existing override Available values: "none".
	ValidationOverrideMitigationAction *string `pulumi:"validationOverrideMitigationAction"`
	// Identifier.
	ZoneId *string `pulumi:"zoneId"`
}

type SchemaValidationSettingsState struct {
	// The default mitigation action used Mitigation actions are as follows: - `"log"` - log request when request does not
	// conform to schema - `"block"` - deny access to the site when request does not conform to schema - `"none"` - skip
	// running schema validation Available values: "none", "log", "block".
	ValidationDefaultMitigationAction pulumi.StringPtrInput
	// When set, this overrides both zone level and operation level mitigation actions. - `"none"` - skip running schema
	// validation entirely for the request - `null` - clears any existing override Available values: "none".
	ValidationOverrideMitigationAction pulumi.StringPtrInput
	// Identifier.
	ZoneId pulumi.StringPtrInput
}

func (SchemaValidationSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaValidationSettingsState)(nil)).Elem()
}

type schemaValidationSettingsArgs struct {
	// The default mitigation action used Mitigation actions are as follows: - `"log"` - log request when request does not
	// conform to schema - `"block"` - deny access to the site when request does not conform to schema - `"none"` - skip
	// running schema validation Available values: "none", "log", "block".
	ValidationDefaultMitigationAction string `pulumi:"validationDefaultMitigationAction"`
	// When set, this overrides both zone level and operation level mitigation actions. - `"none"` - skip running schema
	// validation entirely for the request - `null` - clears any existing override Available values: "none".
	ValidationOverrideMitigationAction *string `pulumi:"validationOverrideMitigationAction"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a SchemaValidationSettings resource.
type SchemaValidationSettingsArgs struct {
	// The default mitigation action used Mitigation actions are as follows: - `"log"` - log request when request does not
	// conform to schema - `"block"` - deny access to the site when request does not conform to schema - `"none"` - skip
	// running schema validation Available values: "none", "log", "block".
	ValidationDefaultMitigationAction pulumi.StringInput
	// When set, this overrides both zone level and operation level mitigation actions. - `"none"` - skip running schema
	// validation entirely for the request - `null` - clears any existing override Available values: "none".
	ValidationOverrideMitigationAction pulumi.StringPtrInput
	// Identifier.
	ZoneId pulumi.StringInput
}

func (SchemaValidationSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaValidationSettingsArgs)(nil)).Elem()
}

type SchemaValidationSettingsInput interface {
	pulumi.Input

	ToSchemaValidationSettingsOutput() SchemaValidationSettingsOutput
	ToSchemaValidationSettingsOutputWithContext(ctx context.Context) SchemaValidationSettingsOutput
}

func (*SchemaValidationSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaValidationSettings)(nil)).Elem()
}

func (i *SchemaValidationSettings) ToSchemaValidationSettingsOutput() SchemaValidationSettingsOutput {
	return i.ToSchemaValidationSettingsOutputWithContext(context.Background())
}

func (i *SchemaValidationSettings) ToSchemaValidationSettingsOutputWithContext(ctx context.Context) SchemaValidationSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaValidationSettingsOutput)
}

// SchemaValidationSettingsArrayInput is an input type that accepts SchemaValidationSettingsArray and SchemaValidationSettingsArrayOutput values.
// You can construct a concrete instance of `SchemaValidationSettingsArrayInput` via:
//
//	SchemaValidationSettingsArray{ SchemaValidationSettingsArgs{...} }
type SchemaValidationSettingsArrayInput interface {
	pulumi.Input

	ToSchemaValidationSettingsArrayOutput() SchemaValidationSettingsArrayOutput
	ToSchemaValidationSettingsArrayOutputWithContext(context.Context) SchemaValidationSettingsArrayOutput
}

type SchemaValidationSettingsArray []SchemaValidationSettingsInput

func (SchemaValidationSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaValidationSettings)(nil)).Elem()
}

func (i SchemaValidationSettingsArray) ToSchemaValidationSettingsArrayOutput() SchemaValidationSettingsArrayOutput {
	return i.ToSchemaValidationSettingsArrayOutputWithContext(context.Background())
}

func (i SchemaValidationSettingsArray) ToSchemaValidationSettingsArrayOutputWithContext(ctx context.Context) SchemaValidationSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaValidationSettingsArrayOutput)
}

// SchemaValidationSettingsMapInput is an input type that accepts SchemaValidationSettingsMap and SchemaValidationSettingsMapOutput values.
// You can construct a concrete instance of `SchemaValidationSettingsMapInput` via:
//
//	SchemaValidationSettingsMap{ "key": SchemaValidationSettingsArgs{...} }
type SchemaValidationSettingsMapInput interface {
	pulumi.Input

	ToSchemaValidationSettingsMapOutput() SchemaValidationSettingsMapOutput
	ToSchemaValidationSettingsMapOutputWithContext(context.Context) SchemaValidationSettingsMapOutput
}

type SchemaValidationSettingsMap map[string]SchemaValidationSettingsInput

func (SchemaValidationSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaValidationSettings)(nil)).Elem()
}

func (i SchemaValidationSettingsMap) ToSchemaValidationSettingsMapOutput() SchemaValidationSettingsMapOutput {
	return i.ToSchemaValidationSettingsMapOutputWithContext(context.Background())
}

func (i SchemaValidationSettingsMap) ToSchemaValidationSettingsMapOutputWithContext(ctx context.Context) SchemaValidationSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaValidationSettingsMapOutput)
}

type SchemaValidationSettingsOutput struct{ *pulumi.OutputState }

func (SchemaValidationSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaValidationSettings)(nil)).Elem()
}

func (o SchemaValidationSettingsOutput) ToSchemaValidationSettingsOutput() SchemaValidationSettingsOutput {
	return o
}

func (o SchemaValidationSettingsOutput) ToSchemaValidationSettingsOutputWithContext(ctx context.Context) SchemaValidationSettingsOutput {
	return o
}

// The default mitigation action used Mitigation actions are as follows: - `"log"` - log request when request does not
// conform to schema - `"block"` - deny access to the site when request does not conform to schema - `"none"` - skip
// running schema validation Available values: "none", "log", "block".
func (o SchemaValidationSettingsOutput) ValidationDefaultMitigationAction() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaValidationSettings) pulumi.StringOutput { return v.ValidationDefaultMitigationAction }).(pulumi.StringOutput)
}

// When set, this overrides both zone level and operation level mitigation actions. - `"none"` - skip running schema
// validation entirely for the request - `null` - clears any existing override Available values: "none".
func (o SchemaValidationSettingsOutput) ValidationOverrideMitigationAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchemaValidationSettings) pulumi.StringPtrOutput { return v.ValidationOverrideMitigationAction }).(pulumi.StringPtrOutput)
}

// Identifier.
func (o SchemaValidationSettingsOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaValidationSettings) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type SchemaValidationSettingsArrayOutput struct{ *pulumi.OutputState }

func (SchemaValidationSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaValidationSettings)(nil)).Elem()
}

func (o SchemaValidationSettingsArrayOutput) ToSchemaValidationSettingsArrayOutput() SchemaValidationSettingsArrayOutput {
	return o
}

func (o SchemaValidationSettingsArrayOutput) ToSchemaValidationSettingsArrayOutputWithContext(ctx context.Context) SchemaValidationSettingsArrayOutput {
	return o
}

func (o SchemaValidationSettingsArrayOutput) Index(i pulumi.IntInput) SchemaValidationSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchemaValidationSettings {
		return vs[0].([]*SchemaValidationSettings)[vs[1].(int)]
	}).(SchemaValidationSettingsOutput)
}

type SchemaValidationSettingsMapOutput struct{ *pulumi.OutputState }

func (SchemaValidationSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaValidationSettings)(nil)).Elem()
}

func (o SchemaValidationSettingsMapOutput) ToSchemaValidationSettingsMapOutput() SchemaValidationSettingsMapOutput {
	return o
}

func (o SchemaValidationSettingsMapOutput) ToSchemaValidationSettingsMapOutputWithContext(ctx context.Context) SchemaValidationSettingsMapOutput {
	return o
}

func (o SchemaValidationSettingsMapOutput) MapIndex(k pulumi.StringInput) SchemaValidationSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchemaValidationSettings {
		return vs[0].(map[string]*SchemaValidationSettings)[vs[1].(string)]
	}).(SchemaValidationSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaValidationSettingsInput)(nil)).Elem(), &SchemaValidationSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaValidationSettingsArrayInput)(nil)).Elem(), SchemaValidationSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaValidationSettingsMapInput)(nil)).Elem(), SchemaValidationSettingsMap{})
	pulumi.RegisterOutputType(SchemaValidationSettingsOutput{})
	pulumi.RegisterOutputType(SchemaValidationSettingsArrayOutput{})
	pulumi.RegisterOutputType(SchemaValidationSettingsMapOutput{})
}
