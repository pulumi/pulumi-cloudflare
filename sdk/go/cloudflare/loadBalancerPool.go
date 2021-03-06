// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Load Balancer pool resource. This provides a pool of origins that can be used by a Cloudflare Load Balancer. Note that the load balancing feature must be enabled in your Cloudflare account before you can use this resource.
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
// 		_, err := cloudflare.NewLoadBalancerPool(ctx, "foo", &cloudflare.LoadBalancerPoolArgs{
// 			Description:       pulumi.String("example load balancer pool"),
// 			Enabled:           pulumi.Bool(false),
// 			MinimumOrigins:    pulumi.Int(1),
// 			Name:              pulumi.String("example-pool"),
// 			NotificationEmail: pulumi.String("someone@example.com"),
// 			Origins: cloudflare.LoadBalancerPoolOriginArray{
// 				&cloudflare.LoadBalancerPoolOriginArgs{
// 					Address: pulumi.String("192.0.2.1"),
// 					Enabled: pulumi.Bool(false),
// 					Name:    pulumi.String("example-1"),
// 				},
// 				&cloudflare.LoadBalancerPoolOriginArgs{
// 					Address: pulumi.String("192.0.2.2"),
// 					Name:    pulumi.String("example-2"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type LoadBalancerPool struct {
	pulumi.CustomResourceState

	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions pulumi.StringArrayOutput `pulumi:"checkRegions"`
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Free text description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins pulumi.IntPtrOutput `pulumi:"minimumOrigins"`
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor pulumi.StringPtrOutput `pulumi:"monitor"`
	// A human-identifiable name for the origin.
	Name pulumi.StringOutput `pulumi:"name"`
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
	NotificationEmail pulumi.StringPtrOutput `pulumi:"notificationEmail"`
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins LoadBalancerPoolOriginArrayOutput `pulumi:"origins"`
}

// NewLoadBalancerPool registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerPool(ctx *pulumi.Context,
	name string, args *LoadBalancerPoolArgs, opts ...pulumi.ResourceOption) (*LoadBalancerPool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Origins == nil {
		return nil, errors.New("invalid value for required argument 'Origins'")
	}
	var resource LoadBalancerPool
	err := ctx.RegisterResource("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancerPool gets an existing LoadBalancerPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerPoolState, opts ...pulumi.ResourceOption) (*LoadBalancerPool, error) {
	var resource LoadBalancerPool
	err := ctx.ReadResource("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancerPool resources.
type loadBalancerPoolState struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions []string `pulumi:"checkRegions"`
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Free text description.
	Description *string `pulumi:"description"`
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled *bool `pulumi:"enabled"`
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins *int `pulumi:"minimumOrigins"`
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor *string `pulumi:"monitor"`
	// A human-identifiable name for the origin.
	Name *string `pulumi:"name"`
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
	NotificationEmail *string `pulumi:"notificationEmail"`
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins []LoadBalancerPoolOrigin `pulumi:"origins"`
}

type LoadBalancerPoolState struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions pulumi.StringArrayInput
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn pulumi.StringPtrInput
	// Free text description.
	Description pulumi.StringPtrInput
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled pulumi.BoolPtrInput
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins pulumi.IntPtrInput
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor pulumi.StringPtrInput
	// A human-identifiable name for the origin.
	Name pulumi.StringPtrInput
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
	NotificationEmail pulumi.StringPtrInput
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins LoadBalancerPoolOriginArrayInput
}

func (LoadBalancerPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerPoolState)(nil)).Elem()
}

type loadBalancerPoolArgs struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions []string `pulumi:"checkRegions"`
	// Free text description.
	Description *string `pulumi:"description"`
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled *bool `pulumi:"enabled"`
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins *int `pulumi:"minimumOrigins"`
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor *string `pulumi:"monitor"`
	// A human-identifiable name for the origin.
	Name string `pulumi:"name"`
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
	NotificationEmail *string `pulumi:"notificationEmail"`
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins []LoadBalancerPoolOrigin `pulumi:"origins"`
}

// The set of arguments for constructing a LoadBalancerPool resource.
type LoadBalancerPoolArgs struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions pulumi.StringArrayInput
	// Free text description.
	Description pulumi.StringPtrInput
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled pulumi.BoolPtrInput
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins pulumi.IntPtrInput
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor pulumi.StringPtrInput
	// A human-identifiable name for the origin.
	Name pulumi.StringInput
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
	NotificationEmail pulumi.StringPtrInput
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins LoadBalancerPoolOriginArrayInput
}

func (LoadBalancerPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerPoolArgs)(nil)).Elem()
}

type LoadBalancerPoolInput interface {
	pulumi.Input

	ToLoadBalancerPoolOutput() LoadBalancerPoolOutput
	ToLoadBalancerPoolOutputWithContext(ctx context.Context) LoadBalancerPoolOutput
}

func (*LoadBalancerPool) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancerPool)(nil))
}

func (i *LoadBalancerPool) ToLoadBalancerPoolOutput() LoadBalancerPoolOutput {
	return i.ToLoadBalancerPoolOutputWithContext(context.Background())
}

func (i *LoadBalancerPool) ToLoadBalancerPoolOutputWithContext(ctx context.Context) LoadBalancerPoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPoolOutput)
}

func (i *LoadBalancerPool) ToLoadBalancerPoolPtrOutput() LoadBalancerPoolPtrOutput {
	return i.ToLoadBalancerPoolPtrOutputWithContext(context.Background())
}

func (i *LoadBalancerPool) ToLoadBalancerPoolPtrOutputWithContext(ctx context.Context) LoadBalancerPoolPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPoolPtrOutput)
}

type LoadBalancerPoolPtrInput interface {
	pulumi.Input

	ToLoadBalancerPoolPtrOutput() LoadBalancerPoolPtrOutput
	ToLoadBalancerPoolPtrOutputWithContext(ctx context.Context) LoadBalancerPoolPtrOutput
}

type loadBalancerPoolPtrType LoadBalancerPoolArgs

func (*loadBalancerPoolPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancerPool)(nil))
}

func (i *loadBalancerPoolPtrType) ToLoadBalancerPoolPtrOutput() LoadBalancerPoolPtrOutput {
	return i.ToLoadBalancerPoolPtrOutputWithContext(context.Background())
}

func (i *loadBalancerPoolPtrType) ToLoadBalancerPoolPtrOutputWithContext(ctx context.Context) LoadBalancerPoolPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPoolPtrOutput)
}

// LoadBalancerPoolArrayInput is an input type that accepts LoadBalancerPoolArray and LoadBalancerPoolArrayOutput values.
// You can construct a concrete instance of `LoadBalancerPoolArrayInput` via:
//
//          LoadBalancerPoolArray{ LoadBalancerPoolArgs{...} }
type LoadBalancerPoolArrayInput interface {
	pulumi.Input

	ToLoadBalancerPoolArrayOutput() LoadBalancerPoolArrayOutput
	ToLoadBalancerPoolArrayOutputWithContext(context.Context) LoadBalancerPoolArrayOutput
}

type LoadBalancerPoolArray []LoadBalancerPoolInput

func (LoadBalancerPoolArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*LoadBalancerPool)(nil))
}

func (i LoadBalancerPoolArray) ToLoadBalancerPoolArrayOutput() LoadBalancerPoolArrayOutput {
	return i.ToLoadBalancerPoolArrayOutputWithContext(context.Background())
}

func (i LoadBalancerPoolArray) ToLoadBalancerPoolArrayOutputWithContext(ctx context.Context) LoadBalancerPoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPoolArrayOutput)
}

// LoadBalancerPoolMapInput is an input type that accepts LoadBalancerPoolMap and LoadBalancerPoolMapOutput values.
// You can construct a concrete instance of `LoadBalancerPoolMapInput` via:
//
//          LoadBalancerPoolMap{ "key": LoadBalancerPoolArgs{...} }
type LoadBalancerPoolMapInput interface {
	pulumi.Input

	ToLoadBalancerPoolMapOutput() LoadBalancerPoolMapOutput
	ToLoadBalancerPoolMapOutputWithContext(context.Context) LoadBalancerPoolMapOutput
}

type LoadBalancerPoolMap map[string]LoadBalancerPoolInput

func (LoadBalancerPoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*LoadBalancerPool)(nil))
}

func (i LoadBalancerPoolMap) ToLoadBalancerPoolMapOutput() LoadBalancerPoolMapOutput {
	return i.ToLoadBalancerPoolMapOutputWithContext(context.Background())
}

func (i LoadBalancerPoolMap) ToLoadBalancerPoolMapOutputWithContext(ctx context.Context) LoadBalancerPoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPoolMapOutput)
}

type LoadBalancerPoolOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerPoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancerPool)(nil))
}

func (o LoadBalancerPoolOutput) ToLoadBalancerPoolOutput() LoadBalancerPoolOutput {
	return o
}

func (o LoadBalancerPoolOutput) ToLoadBalancerPoolOutputWithContext(ctx context.Context) LoadBalancerPoolOutput {
	return o
}

func (o LoadBalancerPoolOutput) ToLoadBalancerPoolPtrOutput() LoadBalancerPoolPtrOutput {
	return o.ToLoadBalancerPoolPtrOutputWithContext(context.Background())
}

func (o LoadBalancerPoolOutput) ToLoadBalancerPoolPtrOutputWithContext(ctx context.Context) LoadBalancerPoolPtrOutput {
	return o.ApplyT(func(v LoadBalancerPool) *LoadBalancerPool {
		return &v
	}).(LoadBalancerPoolPtrOutput)
}

type LoadBalancerPoolPtrOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerPoolPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancerPool)(nil))
}

func (o LoadBalancerPoolPtrOutput) ToLoadBalancerPoolPtrOutput() LoadBalancerPoolPtrOutput {
	return o
}

func (o LoadBalancerPoolPtrOutput) ToLoadBalancerPoolPtrOutputWithContext(ctx context.Context) LoadBalancerPoolPtrOutput {
	return o
}

type LoadBalancerPoolArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerPoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LoadBalancerPool)(nil))
}

func (o LoadBalancerPoolArrayOutput) ToLoadBalancerPoolArrayOutput() LoadBalancerPoolArrayOutput {
	return o
}

func (o LoadBalancerPoolArrayOutput) ToLoadBalancerPoolArrayOutputWithContext(ctx context.Context) LoadBalancerPoolArrayOutput {
	return o
}

func (o LoadBalancerPoolArrayOutput) Index(i pulumi.IntInput) LoadBalancerPoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LoadBalancerPool {
		return vs[0].([]LoadBalancerPool)[vs[1].(int)]
	}).(LoadBalancerPoolOutput)
}

type LoadBalancerPoolMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerPoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LoadBalancerPool)(nil))
}

func (o LoadBalancerPoolMapOutput) ToLoadBalancerPoolMapOutput() LoadBalancerPoolMapOutput {
	return o
}

func (o LoadBalancerPoolMapOutput) ToLoadBalancerPoolMapOutputWithContext(ctx context.Context) LoadBalancerPoolMapOutput {
	return o
}

func (o LoadBalancerPoolMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerPoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LoadBalancerPool {
		return vs[0].(map[string]LoadBalancerPool)[vs[1].(string)]
	}).(LoadBalancerPoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LoadBalancerPoolOutput{})
	pulumi.RegisterOutputType(LoadBalancerPoolPtrOutput{})
	pulumi.RegisterOutputType(LoadBalancerPoolArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerPoolMapOutput{})
}
