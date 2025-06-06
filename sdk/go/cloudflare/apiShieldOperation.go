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
//			_, err := cloudflare.NewApiShieldOperation(ctx, "example_api_shield_operation", &cloudflare.ApiShieldOperationArgs{
//				ZoneId:   pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				Endpoint: pulumi.String("/api/v1/users/{var1}"),
//				Host:     pulumi.String("www.example.com"),
//				Method:   pulumi.String("GET"),
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
// $ pulumi import cloudflare:index/apiShieldOperation:ApiShieldOperation example '<zone_id>/<operation_id>'
// ```
type ApiShieldOperation struct {
	pulumi.CustomResourceState

	// The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
	Endpoint pulumi.StringOutput              `pulumi:"endpoint"`
	Features ApiShieldOperationFeaturesOutput `pulumi:"features"`
	// RFC3986-compliant host.
	Host        pulumi.StringOutput `pulumi:"host"`
	LastUpdated pulumi.StringOutput `pulumi:"lastUpdated"`
	// The HTTP method used to access the endpoint.
	// Available values: "GET", "POST", "HEAD", "OPTIONS", "PUT", "DELETE", "CONNECT", "PATCH", "TRACE".
	Method pulumi.StringOutput `pulumi:"method"`
	// UUID.
	OperationId pulumi.StringOutput `pulumi:"operationId"`
	// Identifier.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewApiShieldOperation registers a new resource with the given unique name, arguments, and options.
func NewApiShieldOperation(ctx *pulumi.Context,
	name string, args *ApiShieldOperationArgs, opts ...pulumi.ResourceOption) (*ApiShieldOperation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Endpoint == nil {
		return nil, errors.New("invalid value for required argument 'Endpoint'")
	}
	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.Method == nil {
		return nil, errors.New("invalid value for required argument 'Method'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApiShieldOperation
	err := ctx.RegisterResource("cloudflare:index/apiShieldOperation:ApiShieldOperation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiShieldOperation gets an existing ApiShieldOperation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiShieldOperation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiShieldOperationState, opts ...pulumi.ResourceOption) (*ApiShieldOperation, error) {
	var resource ApiShieldOperation
	err := ctx.ReadResource("cloudflare:index/apiShieldOperation:ApiShieldOperation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiShieldOperation resources.
type apiShieldOperationState struct {
	// The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
	Endpoint *string                     `pulumi:"endpoint"`
	Features *ApiShieldOperationFeatures `pulumi:"features"`
	// RFC3986-compliant host.
	Host        *string `pulumi:"host"`
	LastUpdated *string `pulumi:"lastUpdated"`
	// The HTTP method used to access the endpoint.
	// Available values: "GET", "POST", "HEAD", "OPTIONS", "PUT", "DELETE", "CONNECT", "PATCH", "TRACE".
	Method *string `pulumi:"method"`
	// UUID.
	OperationId *string `pulumi:"operationId"`
	// Identifier.
	ZoneId *string `pulumi:"zoneId"`
}

type ApiShieldOperationState struct {
	// The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
	Endpoint pulumi.StringPtrInput
	Features ApiShieldOperationFeaturesPtrInput
	// RFC3986-compliant host.
	Host        pulumi.StringPtrInput
	LastUpdated pulumi.StringPtrInput
	// The HTTP method used to access the endpoint.
	// Available values: "GET", "POST", "HEAD", "OPTIONS", "PUT", "DELETE", "CONNECT", "PATCH", "TRACE".
	Method pulumi.StringPtrInput
	// UUID.
	OperationId pulumi.StringPtrInput
	// Identifier.
	ZoneId pulumi.StringPtrInput
}

func (ApiShieldOperationState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiShieldOperationState)(nil)).Elem()
}

type apiShieldOperationArgs struct {
	// The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
	Endpoint string `pulumi:"endpoint"`
	// RFC3986-compliant host.
	Host string `pulumi:"host"`
	// The HTTP method used to access the endpoint.
	// Available values: "GET", "POST", "HEAD", "OPTIONS", "PUT", "DELETE", "CONNECT", "PATCH", "TRACE".
	Method string `pulumi:"method"`
	// Identifier.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ApiShieldOperation resource.
type ApiShieldOperationArgs struct {
	// The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
	Endpoint pulumi.StringInput
	// RFC3986-compliant host.
	Host pulumi.StringInput
	// The HTTP method used to access the endpoint.
	// Available values: "GET", "POST", "HEAD", "OPTIONS", "PUT", "DELETE", "CONNECT", "PATCH", "TRACE".
	Method pulumi.StringInput
	// Identifier.
	ZoneId pulumi.StringInput
}

func (ApiShieldOperationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiShieldOperationArgs)(nil)).Elem()
}

type ApiShieldOperationInput interface {
	pulumi.Input

	ToApiShieldOperationOutput() ApiShieldOperationOutput
	ToApiShieldOperationOutputWithContext(ctx context.Context) ApiShieldOperationOutput
}

func (*ApiShieldOperation) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiShieldOperation)(nil)).Elem()
}

func (i *ApiShieldOperation) ToApiShieldOperationOutput() ApiShieldOperationOutput {
	return i.ToApiShieldOperationOutputWithContext(context.Background())
}

func (i *ApiShieldOperation) ToApiShieldOperationOutputWithContext(ctx context.Context) ApiShieldOperationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiShieldOperationOutput)
}

// ApiShieldOperationArrayInput is an input type that accepts ApiShieldOperationArray and ApiShieldOperationArrayOutput values.
// You can construct a concrete instance of `ApiShieldOperationArrayInput` via:
//
//	ApiShieldOperationArray{ ApiShieldOperationArgs{...} }
type ApiShieldOperationArrayInput interface {
	pulumi.Input

	ToApiShieldOperationArrayOutput() ApiShieldOperationArrayOutput
	ToApiShieldOperationArrayOutputWithContext(context.Context) ApiShieldOperationArrayOutput
}

type ApiShieldOperationArray []ApiShieldOperationInput

func (ApiShieldOperationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiShieldOperation)(nil)).Elem()
}

func (i ApiShieldOperationArray) ToApiShieldOperationArrayOutput() ApiShieldOperationArrayOutput {
	return i.ToApiShieldOperationArrayOutputWithContext(context.Background())
}

func (i ApiShieldOperationArray) ToApiShieldOperationArrayOutputWithContext(ctx context.Context) ApiShieldOperationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiShieldOperationArrayOutput)
}

// ApiShieldOperationMapInput is an input type that accepts ApiShieldOperationMap and ApiShieldOperationMapOutput values.
// You can construct a concrete instance of `ApiShieldOperationMapInput` via:
//
//	ApiShieldOperationMap{ "key": ApiShieldOperationArgs{...} }
type ApiShieldOperationMapInput interface {
	pulumi.Input

	ToApiShieldOperationMapOutput() ApiShieldOperationMapOutput
	ToApiShieldOperationMapOutputWithContext(context.Context) ApiShieldOperationMapOutput
}

type ApiShieldOperationMap map[string]ApiShieldOperationInput

func (ApiShieldOperationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiShieldOperation)(nil)).Elem()
}

func (i ApiShieldOperationMap) ToApiShieldOperationMapOutput() ApiShieldOperationMapOutput {
	return i.ToApiShieldOperationMapOutputWithContext(context.Background())
}

func (i ApiShieldOperationMap) ToApiShieldOperationMapOutputWithContext(ctx context.Context) ApiShieldOperationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiShieldOperationMapOutput)
}

type ApiShieldOperationOutput struct{ *pulumi.OutputState }

func (ApiShieldOperationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiShieldOperation)(nil)).Elem()
}

func (o ApiShieldOperationOutput) ToApiShieldOperationOutput() ApiShieldOperationOutput {
	return o
}

func (o ApiShieldOperationOutput) ToApiShieldOperationOutputWithContext(ctx context.Context) ApiShieldOperationOutput {
	return o
}

// The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
func (o ApiShieldOperationOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldOperation) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

func (o ApiShieldOperationOutput) Features() ApiShieldOperationFeaturesOutput {
	return o.ApplyT(func(v *ApiShieldOperation) ApiShieldOperationFeaturesOutput { return v.Features }).(ApiShieldOperationFeaturesOutput)
}

// RFC3986-compliant host.
func (o ApiShieldOperationOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldOperation) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

func (o ApiShieldOperationOutput) LastUpdated() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldOperation) pulumi.StringOutput { return v.LastUpdated }).(pulumi.StringOutput)
}

// The HTTP method used to access the endpoint.
// Available values: "GET", "POST", "HEAD", "OPTIONS", "PUT", "DELETE", "CONNECT", "PATCH", "TRACE".
func (o ApiShieldOperationOutput) Method() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldOperation) pulumi.StringOutput { return v.Method }).(pulumi.StringOutput)
}

// UUID.
func (o ApiShieldOperationOutput) OperationId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldOperation) pulumi.StringOutput { return v.OperationId }).(pulumi.StringOutput)
}

// Identifier.
func (o ApiShieldOperationOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldOperation) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ApiShieldOperationArrayOutput struct{ *pulumi.OutputState }

func (ApiShieldOperationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiShieldOperation)(nil)).Elem()
}

func (o ApiShieldOperationArrayOutput) ToApiShieldOperationArrayOutput() ApiShieldOperationArrayOutput {
	return o
}

func (o ApiShieldOperationArrayOutput) ToApiShieldOperationArrayOutputWithContext(ctx context.Context) ApiShieldOperationArrayOutput {
	return o
}

func (o ApiShieldOperationArrayOutput) Index(i pulumi.IntInput) ApiShieldOperationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiShieldOperation {
		return vs[0].([]*ApiShieldOperation)[vs[1].(int)]
	}).(ApiShieldOperationOutput)
}

type ApiShieldOperationMapOutput struct{ *pulumi.OutputState }

func (ApiShieldOperationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiShieldOperation)(nil)).Elem()
}

func (o ApiShieldOperationMapOutput) ToApiShieldOperationMapOutput() ApiShieldOperationMapOutput {
	return o
}

func (o ApiShieldOperationMapOutput) ToApiShieldOperationMapOutputWithContext(ctx context.Context) ApiShieldOperationMapOutput {
	return o
}

func (o ApiShieldOperationMapOutput) MapIndex(k pulumi.StringInput) ApiShieldOperationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiShieldOperation {
		return vs[0].(map[string]*ApiShieldOperation)[vs[1].(string)]
	}).(ApiShieldOperationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiShieldOperationInput)(nil)).Elem(), &ApiShieldOperation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiShieldOperationArrayInput)(nil)).Elem(), ApiShieldOperationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiShieldOperationMapInput)(nil)).Elem(), ApiShieldOperationMap{})
	pulumi.RegisterOutputType(ApiShieldOperationOutput{})
	pulumi.RegisterOutputType(ApiShieldOperationArrayOutput{})
	pulumi.RegisterOutputType(ApiShieldOperationMapOutput{})
}
