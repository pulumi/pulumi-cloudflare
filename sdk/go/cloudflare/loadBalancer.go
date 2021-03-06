// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Load Balancer resource. This sits in front of a number of defined pools of origins and provides various options for geographically-aware load balancing. Note that the load balancing feature must be enabled in your Cloudflare account before you can use this resource.
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
// 		foo, err := cloudflare.NewLoadBalancerPool(ctx, "foo", &cloudflare.LoadBalancerPoolArgs{
// 			Name: pulumi.String("example-lb-pool"),
// 			Origins: cloudflare.LoadBalancerPoolOriginArray{
// 				&cloudflare.LoadBalancerPoolOriginArgs{
// 					Name:    pulumi.String("example-1"),
// 					Address: pulumi.String("192.0.2.1"),
// 					Enabled: pulumi.Bool(false),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewLoadBalancer(ctx, "bar", &cloudflare.LoadBalancerArgs{
// 			ZoneId:         pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
// 			Name:           pulumi.String("example-load-balancer.example.com"),
// 			FallbackPoolId: foo.ID(),
// 			DefaultPoolIds: pulumi.StringArray{
// 				foo.ID(),
// 			},
// 			Description:    pulumi.String("example load balancer using geo-balancing"),
// 			Proxied:        pulumi.Bool(true),
// 			SteeringPolicy: pulumi.String("geo"),
// 			PopPools: cloudflare.LoadBalancerPopPoolArray{
// 				&cloudflare.LoadBalancerPopPoolArgs{
// 					Pop: pulumi.String("LAX"),
// 					PoolIds: pulumi.StringArray{
// 						foo.ID(),
// 					},
// 				},
// 			},
// 			RegionPools: cloudflare.LoadBalancerRegionPoolArray{
// 				&cloudflare.LoadBalancerRegionPoolArgs{
// 					Region: pulumi.String("WNAM"),
// 					PoolIds: pulumi.StringArray{
// 						foo.ID(),
// 					},
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
type LoadBalancer struct {
	pulumi.CustomResourceState

	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
	DefaultPoolIds pulumi.StringArrayOutput `pulumi:"defaultPoolIds"`
	// Free text description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enable or disable the load balancer. Defaults to `true` (enabled).
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The pool ID to use when all other pools are detected as unhealthy.
	FallbackPoolId pulumi.StringOutput `pulumi:"fallbackPoolId"`
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The DNS name (FQDN, including the zone) to associate with the load balancer.
	Name pulumi.StringOutput `pulumi:"name"`
	// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
	PopPools LoadBalancerPopPoolArrayOutput `pulumi:"popPools"`
	// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
	Proxied pulumi.BoolPtrOutput `pulumi:"proxied"`
	// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
	RegionPools LoadBalancerRegionPoolArrayOutput `pulumi:"regionPools"`
	// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
	SessionAffinity pulumi.StringPtrOutput `pulumi:"sessionAffinity"`
	// Configure cookie attributes for session affinity cookie. See the field documentation below.
	SessionAffinityAttributes pulumi.StringMapOutput `pulumi:"sessionAffinityAttributes"`
	// Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
	SessionAffinityTtl pulumi.IntPtrOutput `pulumi:"sessionAffinityTtl"`
	// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
	SteeringPolicy pulumi.StringOutput `pulumi:"steeringPolicy"`
	// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
	// The zone ID to add the load balancer to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultPoolIds == nil {
		return nil, errors.New("invalid value for required argument 'DefaultPoolIds'")
	}
	if args.FallbackPoolId == nil {
		return nil, errors.New("invalid value for required argument 'FallbackPoolId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource LoadBalancer
	err := ctx.RegisterResource("cloudflare:index/loadBalancer:LoadBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerState, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	var resource LoadBalancer
	err := ctx.ReadResource("cloudflare:index/loadBalancer:LoadBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancer resources.
type loadBalancerState struct {
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn *string `pulumi:"createdOn"`
	// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
	DefaultPoolIds []string `pulumi:"defaultPoolIds"`
	// Free text description.
	Description *string `pulumi:"description"`
	// Enable or disable the load balancer. Defaults to `true` (enabled).
	Enabled *bool `pulumi:"enabled"`
	// The pool ID to use when all other pools are detected as unhealthy.
	FallbackPoolId *string `pulumi:"fallbackPoolId"`
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The DNS name (FQDN, including the zone) to associate with the load balancer.
	Name *string `pulumi:"name"`
	// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
	PopPools []LoadBalancerPopPool `pulumi:"popPools"`
	// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
	Proxied *bool `pulumi:"proxied"`
	// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
	RegionPools []LoadBalancerRegionPool `pulumi:"regionPools"`
	// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
	SessionAffinity *string `pulumi:"sessionAffinity"`
	// Configure cookie attributes for session affinity cookie. See the field documentation below.
	SessionAffinityAttributes map[string]string `pulumi:"sessionAffinityAttributes"`
	// Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
	SessionAffinityTtl *int `pulumi:"sessionAffinityTtl"`
	// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
	SteeringPolicy *string `pulumi:"steeringPolicy"`
	// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
	Ttl *int `pulumi:"ttl"`
	// The zone ID to add the load balancer to.
	ZoneId *string `pulumi:"zoneId"`
}

type LoadBalancerState struct {
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn pulumi.StringPtrInput
	// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
	DefaultPoolIds pulumi.StringArrayInput
	// Free text description.
	Description pulumi.StringPtrInput
	// Enable or disable the load balancer. Defaults to `true` (enabled).
	Enabled pulumi.BoolPtrInput
	// The pool ID to use when all other pools are detected as unhealthy.
	FallbackPoolId pulumi.StringPtrInput
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The DNS name (FQDN, including the zone) to associate with the load balancer.
	Name pulumi.StringPtrInput
	// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
	PopPools LoadBalancerPopPoolArrayInput
	// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
	Proxied pulumi.BoolPtrInput
	// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
	RegionPools LoadBalancerRegionPoolArrayInput
	// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
	SessionAffinity pulumi.StringPtrInput
	// Configure cookie attributes for session affinity cookie. See the field documentation below.
	SessionAffinityAttributes pulumi.StringMapInput
	// Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
	SessionAffinityTtl pulumi.IntPtrInput
	// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
	SteeringPolicy pulumi.StringPtrInput
	// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
	Ttl pulumi.IntPtrInput
	// The zone ID to add the load balancer to.
	ZoneId pulumi.StringPtrInput
}

func (LoadBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerState)(nil)).Elem()
}

type loadBalancerArgs struct {
	// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
	DefaultPoolIds []string `pulumi:"defaultPoolIds"`
	// Free text description.
	Description *string `pulumi:"description"`
	// Enable or disable the load balancer. Defaults to `true` (enabled).
	Enabled *bool `pulumi:"enabled"`
	// The pool ID to use when all other pools are detected as unhealthy.
	FallbackPoolId string `pulumi:"fallbackPoolId"`
	// The DNS name (FQDN, including the zone) to associate with the load balancer.
	Name string `pulumi:"name"`
	// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
	PopPools []LoadBalancerPopPool `pulumi:"popPools"`
	// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
	Proxied *bool `pulumi:"proxied"`
	// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
	RegionPools []LoadBalancerRegionPool `pulumi:"regionPools"`
	// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
	SessionAffinity *string `pulumi:"sessionAffinity"`
	// Configure cookie attributes for session affinity cookie. See the field documentation below.
	SessionAffinityAttributes map[string]string `pulumi:"sessionAffinityAttributes"`
	// Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
	SessionAffinityTtl *int `pulumi:"sessionAffinityTtl"`
	// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
	SteeringPolicy *string `pulumi:"steeringPolicy"`
	// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
	Ttl *int `pulumi:"ttl"`
	// The zone ID to add the load balancer to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
	DefaultPoolIds pulumi.StringArrayInput
	// Free text description.
	Description pulumi.StringPtrInput
	// Enable or disable the load balancer. Defaults to `true` (enabled).
	Enabled pulumi.BoolPtrInput
	// The pool ID to use when all other pools are detected as unhealthy.
	FallbackPoolId pulumi.StringInput
	// The DNS name (FQDN, including the zone) to associate with the load balancer.
	Name pulumi.StringInput
	// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
	PopPools LoadBalancerPopPoolArrayInput
	// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
	Proxied pulumi.BoolPtrInput
	// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
	RegionPools LoadBalancerRegionPoolArrayInput
	// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
	SessionAffinity pulumi.StringPtrInput
	// Configure cookie attributes for session affinity cookie. See the field documentation below.
	SessionAffinityAttributes pulumi.StringMapInput
	// Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
	SessionAffinityTtl pulumi.IntPtrInput
	// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
	SteeringPolicy pulumi.StringPtrInput
	// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
	Ttl pulumi.IntPtrInput
	// The zone ID to add the load balancer to.
	ZoneId pulumi.StringInput
}

func (LoadBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerArgs)(nil)).Elem()
}

type LoadBalancerInput interface {
	pulumi.Input

	ToLoadBalancerOutput() LoadBalancerOutput
	ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput
}

func (*LoadBalancer) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancer)(nil))
}

func (i *LoadBalancer) ToLoadBalancerOutput() LoadBalancerOutput {
	return i.ToLoadBalancerOutputWithContext(context.Background())
}

func (i *LoadBalancer) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerOutput)
}

func (i *LoadBalancer) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return i.ToLoadBalancerPtrOutputWithContext(context.Background())
}

func (i *LoadBalancer) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPtrOutput)
}

type LoadBalancerPtrInput interface {
	pulumi.Input

	ToLoadBalancerPtrOutput() LoadBalancerPtrOutput
	ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput
}

type loadBalancerPtrType LoadBalancerArgs

func (*loadBalancerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil))
}

func (i *loadBalancerPtrType) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return i.ToLoadBalancerPtrOutputWithContext(context.Background())
}

func (i *loadBalancerPtrType) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPtrOutput)
}

// LoadBalancerArrayInput is an input type that accepts LoadBalancerArray and LoadBalancerArrayOutput values.
// You can construct a concrete instance of `LoadBalancerArrayInput` via:
//
//          LoadBalancerArray{ LoadBalancerArgs{...} }
type LoadBalancerArrayInput interface {
	pulumi.Input

	ToLoadBalancerArrayOutput() LoadBalancerArrayOutput
	ToLoadBalancerArrayOutputWithContext(context.Context) LoadBalancerArrayOutput
}

type LoadBalancerArray []LoadBalancerInput

func (LoadBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*LoadBalancer)(nil))
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return i.ToLoadBalancerArrayOutputWithContext(context.Background())
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerArrayOutput)
}

// LoadBalancerMapInput is an input type that accepts LoadBalancerMap and LoadBalancerMapOutput values.
// You can construct a concrete instance of `LoadBalancerMapInput` via:
//
//          LoadBalancerMap{ "key": LoadBalancerArgs{...} }
type LoadBalancerMapInput interface {
	pulumi.Input

	ToLoadBalancerMapOutput() LoadBalancerMapOutput
	ToLoadBalancerMapOutputWithContext(context.Context) LoadBalancerMapOutput
}

type LoadBalancerMap map[string]LoadBalancerInput

func (LoadBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*LoadBalancer)(nil))
}

func (i LoadBalancerMap) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return i.ToLoadBalancerMapOutputWithContext(context.Background())
}

func (i LoadBalancerMap) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMapOutput)
}

type LoadBalancerOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancer)(nil))
}

func (o LoadBalancerOutput) ToLoadBalancerOutput() LoadBalancerOutput {
	return o
}

func (o LoadBalancerOutput) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return o
}

func (o LoadBalancerOutput) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return o.ToLoadBalancerPtrOutputWithContext(context.Background())
}

func (o LoadBalancerOutput) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return o.ApplyT(func(v LoadBalancer) *LoadBalancer {
		return &v
	}).(LoadBalancerPtrOutput)
}

type LoadBalancerPtrOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil))
}

func (o LoadBalancerPtrOutput) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return o
}

func (o LoadBalancerPtrOutput) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return o
}

type LoadBalancerArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LoadBalancer)(nil))
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) Index(i pulumi.IntInput) LoadBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LoadBalancer {
		return vs[0].([]LoadBalancer)[vs[1].(int)]
	}).(LoadBalancerOutput)
}

type LoadBalancerMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LoadBalancer)(nil))
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LoadBalancer {
		return vs[0].(map[string]LoadBalancer)[vs[1].(string)]
	}).(LoadBalancerOutput)
}

func init() {
	pulumi.RegisterOutputType(LoadBalancerOutput{})
	pulumi.RegisterOutputType(LoadBalancerPtrOutput{})
	pulumi.RegisterOutputType(LoadBalancerArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerMapOutput{})
}
