// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Filter expressions that can be referenced across multiple features, e.g. Firewall Rule. The expression format is similar to [Wireshark Display Filter](https://www.wireshark.org/docs/man-pages/wireshark-filter.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewFilter(ctx, "wordpress", &cloudflare.FilterArgs{
// 			Description: pulumi.String("Wordpress break-in attempts that are outside of the office"),
// 			Expression:  pulumi.String("(http.request.uri.path ~ \".*wp-login.php\" or http.request.uri.path ~ \".*xmlrpc.php\") and ip.src ne 192.0.2.1"),
// 			ZoneId:      pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Filter can be imported using a composite ID formed of zone ID and filter ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/filter:Filter default d41d8cd98f00b204e9800998ecf8427e/9e107d9d372bb6826bd81d3542a419d6
// ```
//
//  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID * `9e107d9d372bb6826bd81d3542a419d6` - filter ID as returned by [API](https://api.cloudflare.com/#zone-firewall-filters)
type Filter struct {
	pulumi.CustomResourceState

	// A note that you can use to describe the purpose of the filter.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The filter expression to be used.
	Expression pulumi.StringOutput `pulumi:"expression"`
	// Whether this filter is currently paused. Boolean value.
	Paused pulumi.BoolPtrOutput `pulumi:"paused"`
	// Short reference tag to quickly select related rules.
	Ref pulumi.StringPtrOutput `pulumi:"ref"`
	// The DNS zone to which the Filter should be added.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewFilter registers a new resource with the given unique name, arguments, and options.
func NewFilter(ctx *pulumi.Context,
	name string, args *FilterArgs, opts ...pulumi.ResourceOption) (*Filter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Expression == nil {
		return nil, errors.New("invalid value for required argument 'Expression'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource Filter
	err := ctx.RegisterResource("cloudflare:index/filter:Filter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFilter gets an existing Filter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFilter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FilterState, opts ...pulumi.ResourceOption) (*Filter, error) {
	var resource Filter
	err := ctx.ReadResource("cloudflare:index/filter:Filter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Filter resources.
type filterState struct {
	// A note that you can use to describe the purpose of the filter.
	Description *string `pulumi:"description"`
	// The filter expression to be used.
	Expression *string `pulumi:"expression"`
	// Whether this filter is currently paused. Boolean value.
	Paused *bool `pulumi:"paused"`
	// Short reference tag to quickly select related rules.
	Ref *string `pulumi:"ref"`
	// The DNS zone to which the Filter should be added.
	ZoneId *string `pulumi:"zoneId"`
}

type FilterState struct {
	// A note that you can use to describe the purpose of the filter.
	Description pulumi.StringPtrInput
	// The filter expression to be used.
	Expression pulumi.StringPtrInput
	// Whether this filter is currently paused. Boolean value.
	Paused pulumi.BoolPtrInput
	// Short reference tag to quickly select related rules.
	Ref pulumi.StringPtrInput
	// The DNS zone to which the Filter should be added.
	ZoneId pulumi.StringPtrInput
}

func (FilterState) ElementType() reflect.Type {
	return reflect.TypeOf((*filterState)(nil)).Elem()
}

type filterArgs struct {
	// A note that you can use to describe the purpose of the filter.
	Description *string `pulumi:"description"`
	// The filter expression to be used.
	Expression string `pulumi:"expression"`
	// Whether this filter is currently paused. Boolean value.
	Paused *bool `pulumi:"paused"`
	// Short reference tag to quickly select related rules.
	Ref *string `pulumi:"ref"`
	// The DNS zone to which the Filter should be added.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Filter resource.
type FilterArgs struct {
	// A note that you can use to describe the purpose of the filter.
	Description pulumi.StringPtrInput
	// The filter expression to be used.
	Expression pulumi.StringInput
	// Whether this filter is currently paused. Boolean value.
	Paused pulumi.BoolPtrInput
	// Short reference tag to quickly select related rules.
	Ref pulumi.StringPtrInput
	// The DNS zone to which the Filter should be added.
	ZoneId pulumi.StringInput
}

func (FilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*filterArgs)(nil)).Elem()
}

type FilterInput interface {
	pulumi.Input

	ToFilterOutput() FilterOutput
	ToFilterOutputWithContext(ctx context.Context) FilterOutput
}

func (*Filter) ElementType() reflect.Type {
	return reflect.TypeOf((*Filter)(nil))
}

func (i *Filter) ToFilterOutput() FilterOutput {
	return i.ToFilterOutputWithContext(context.Background())
}

func (i *Filter) ToFilterOutputWithContext(ctx context.Context) FilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FilterOutput)
}

func (i *Filter) ToFilterPtrOutput() FilterPtrOutput {
	return i.ToFilterPtrOutputWithContext(context.Background())
}

func (i *Filter) ToFilterPtrOutputWithContext(ctx context.Context) FilterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FilterPtrOutput)
}

type FilterPtrInput interface {
	pulumi.Input

	ToFilterPtrOutput() FilterPtrOutput
	ToFilterPtrOutputWithContext(ctx context.Context) FilterPtrOutput
}

type filterPtrType FilterArgs

func (*filterPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Filter)(nil))
}

func (i *filterPtrType) ToFilterPtrOutput() FilterPtrOutput {
	return i.ToFilterPtrOutputWithContext(context.Background())
}

func (i *filterPtrType) ToFilterPtrOutputWithContext(ctx context.Context) FilterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FilterPtrOutput)
}

// FilterArrayInput is an input type that accepts FilterArray and FilterArrayOutput values.
// You can construct a concrete instance of `FilterArrayInput` via:
//
//          FilterArray{ FilterArgs{...} }
type FilterArrayInput interface {
	pulumi.Input

	ToFilterArrayOutput() FilterArrayOutput
	ToFilterArrayOutputWithContext(context.Context) FilterArrayOutput
}

type FilterArray []FilterInput

func (FilterArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Filter)(nil))
}

func (i FilterArray) ToFilterArrayOutput() FilterArrayOutput {
	return i.ToFilterArrayOutputWithContext(context.Background())
}

func (i FilterArray) ToFilterArrayOutputWithContext(ctx context.Context) FilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FilterArrayOutput)
}

// FilterMapInput is an input type that accepts FilterMap and FilterMapOutput values.
// You can construct a concrete instance of `FilterMapInput` via:
//
//          FilterMap{ "key": FilterArgs{...} }
type FilterMapInput interface {
	pulumi.Input

	ToFilterMapOutput() FilterMapOutput
	ToFilterMapOutputWithContext(context.Context) FilterMapOutput
}

type FilterMap map[string]FilterInput

func (FilterMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Filter)(nil))
}

func (i FilterMap) ToFilterMapOutput() FilterMapOutput {
	return i.ToFilterMapOutputWithContext(context.Background())
}

func (i FilterMap) ToFilterMapOutputWithContext(ctx context.Context) FilterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FilterMapOutput)
}

type FilterOutput struct {
	*pulumi.OutputState
}

func (FilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Filter)(nil))
}

func (o FilterOutput) ToFilterOutput() FilterOutput {
	return o
}

func (o FilterOutput) ToFilterOutputWithContext(ctx context.Context) FilterOutput {
	return o
}

func (o FilterOutput) ToFilterPtrOutput() FilterPtrOutput {
	return o.ToFilterPtrOutputWithContext(context.Background())
}

func (o FilterOutput) ToFilterPtrOutputWithContext(ctx context.Context) FilterPtrOutput {
	return o.ApplyT(func(v Filter) *Filter {
		return &v
	}).(FilterPtrOutput)
}

type FilterPtrOutput struct {
	*pulumi.OutputState
}

func (FilterPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Filter)(nil))
}

func (o FilterPtrOutput) ToFilterPtrOutput() FilterPtrOutput {
	return o
}

func (o FilterPtrOutput) ToFilterPtrOutputWithContext(ctx context.Context) FilterPtrOutput {
	return o
}

type FilterArrayOutput struct{ *pulumi.OutputState }

func (FilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Filter)(nil))
}

func (o FilterArrayOutput) ToFilterArrayOutput() FilterArrayOutput {
	return o
}

func (o FilterArrayOutput) ToFilterArrayOutputWithContext(ctx context.Context) FilterArrayOutput {
	return o
}

func (o FilterArrayOutput) Index(i pulumi.IntInput) FilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Filter {
		return vs[0].([]Filter)[vs[1].(int)]
	}).(FilterOutput)
}

type FilterMapOutput struct{ *pulumi.OutputState }

func (FilterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Filter)(nil))
}

func (o FilterMapOutput) ToFilterMapOutput() FilterMapOutput {
	return o
}

func (o FilterMapOutput) ToFilterMapOutputWithContext(ctx context.Context) FilterMapOutput {
	return o
}

func (o FilterMapOutput) MapIndex(k pulumi.StringInput) FilterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Filter {
		return vs[0].(map[string]Filter)[vs[1].(string)]
	}).(FilterOutput)
}

func init() {
	pulumi.RegisterOutputType(FilterOutput{})
	pulumi.RegisterOutputType(FilterPtrOutput{})
	pulumi.RegisterOutputType(FilterArrayOutput{})
	pulumi.RegisterOutputType(FilterMapOutput{})
}
