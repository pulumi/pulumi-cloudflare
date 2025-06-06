// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

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
//			_, err := cloudflare.LookupLoadBalancerPool(ctx, &cloudflare.LookupLoadBalancerPoolArgs{
//				AccountId: "023e105f4ecef8ad9ca31a8372d0c353",
//				PoolId:    pulumi.StringRef("17b5962d775c646f3f9725cbc7a53df4"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupLoadBalancerPool(ctx *pulumi.Context, args *LookupLoadBalancerPoolArgs, opts ...pulumi.InvokeOption) (*LookupLoadBalancerPoolResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLoadBalancerPoolResult
	err := ctx.Invoke("cloudflare:index/getLoadBalancerPool:getLoadBalancerPool", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancerPool.
type LookupLoadBalancerPoolArgs struct {
	// Identifier
	AccountId string                     `pulumi:"accountId"`
	Filter    *GetLoadBalancerPoolFilter `pulumi:"filter"`
	PoolId    *string                    `pulumi:"poolId"`
}

// A collection of values returned by getLoadBalancerPool.
type LookupLoadBalancerPoolResult struct {
	// Identifier
	AccountId string `pulumi:"accountId"`
	// A list of regions from which to run health checks. Null means every Cloudflare data center.
	CheckRegions []string `pulumi:"checkRegions"`
	CreatedOn    string   `pulumi:"createdOn"`
	// A human-readable description of the pool.
	Description string `pulumi:"description"`
	// This field shows up only if the pool is disabled. This field is set with the time the pool was disabled at.
	DisabledAt string `pulumi:"disabledAt"`
	// Whether to enable (the default) or disable this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any).
	Enabled bool                       `pulumi:"enabled"`
	Filter  *GetLoadBalancerPoolFilter `pulumi:"filter"`
	// The ID of this resource.
	Id string `pulumi:"id"`
	// The latitude of the data center containing the origins used in this pool in decimal degrees. If this is set, longitude must also be set.
	Latitude float64 `pulumi:"latitude"`
	// Configures load shedding policies and percentages for the pool.
	LoadShedding GetLoadBalancerPoolLoadShedding `pulumi:"loadShedding"`
	// The longitude of the data center containing the origins used in this pool in decimal degrees. If this is set, latitude must also be set.
	Longitude float64 `pulumi:"longitude"`
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and will failover to the next available pool.
	MinimumOrigins int    `pulumi:"minimumOrigins"`
	ModifiedOn     string `pulumi:"modifiedOn"`
	// The ID of the Monitor to use for checking the health of origins within this pool.
	Monitor string `pulumi:"monitor"`
	// A short name (tag) for the pool. Only alphanumeric characters, hyphens, and underscores are allowed.
	Name string `pulumi:"name"`
	// List of networks where Load Balancer or Pool is enabled.
	Networks []string `pulumi:"networks"`
	// This field is now deprecated. It has been moved to Cloudflare's Centralized Notification service https://developers.cloudflare.com/fundamentals/notifications/. The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
	NotificationEmail string `pulumi:"notificationEmail"`
	// Filter pool and origin health notifications by resource type or health status. Use null to reset.
	NotificationFilter GetLoadBalancerPoolNotificationFilter `pulumi:"notificationFilter"`
	// Configures origin steering for the pool. Controls how origins are selected for new sessions and traffic without session affinity.
	OriginSteering GetLoadBalancerPoolOriginSteering `pulumi:"originSteering"`
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
	Origins []GetLoadBalancerPoolOrigin `pulumi:"origins"`
	PoolId  *string                     `pulumi:"poolId"`
}

func LookupLoadBalancerPoolOutput(ctx *pulumi.Context, args LookupLoadBalancerPoolOutputArgs, opts ...pulumi.InvokeOption) LookupLoadBalancerPoolResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupLoadBalancerPoolResultOutput, error) {
			args := v.(LookupLoadBalancerPoolArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getLoadBalancerPool:getLoadBalancerPool", args, LookupLoadBalancerPoolResultOutput{}, options).(LookupLoadBalancerPoolResultOutput), nil
		}).(LookupLoadBalancerPoolResultOutput)
}

// A collection of arguments for invoking getLoadBalancerPool.
type LookupLoadBalancerPoolOutputArgs struct {
	// Identifier
	AccountId pulumi.StringInput                `pulumi:"accountId"`
	Filter    GetLoadBalancerPoolFilterPtrInput `pulumi:"filter"`
	PoolId    pulumi.StringPtrInput             `pulumi:"poolId"`
}

func (LookupLoadBalancerPoolOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerPoolArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancerPool.
type LookupLoadBalancerPoolResultOutput struct{ *pulumi.OutputState }

func (LookupLoadBalancerPoolResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerPoolResult)(nil)).Elem()
}

func (o LookupLoadBalancerPoolResultOutput) ToLookupLoadBalancerPoolResultOutput() LookupLoadBalancerPoolResultOutput {
	return o
}

func (o LookupLoadBalancerPoolResultOutput) ToLookupLoadBalancerPoolResultOutputWithContext(ctx context.Context) LookupLoadBalancerPoolResultOutput {
	return o
}

// Identifier
func (o LookupLoadBalancerPoolResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// A list of regions from which to run health checks. Null means every Cloudflare data center.
func (o LookupLoadBalancerPoolResultOutput) CheckRegions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) []string { return v.CheckRegions }).(pulumi.StringArrayOutput)
}

func (o LookupLoadBalancerPoolResultOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.CreatedOn }).(pulumi.StringOutput)
}

// A human-readable description of the pool.
func (o LookupLoadBalancerPoolResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.Description }).(pulumi.StringOutput)
}

// This field shows up only if the pool is disabled. This field is set with the time the pool was disabled at.
func (o LookupLoadBalancerPoolResultOutput) DisabledAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.DisabledAt }).(pulumi.StringOutput)
}

// Whether to enable (the default) or disable this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any).
func (o LookupLoadBalancerPoolResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerPoolResultOutput) Filter() GetLoadBalancerPoolFilterPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) *GetLoadBalancerPoolFilter { return v.Filter }).(GetLoadBalancerPoolFilterPtrOutput)
}

// The ID of this resource.
func (o LookupLoadBalancerPoolResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.Id }).(pulumi.StringOutput)
}

// The latitude of the data center containing the origins used in this pool in decimal degrees. If this is set, longitude must also be set.
func (o LookupLoadBalancerPoolResultOutput) Latitude() pulumi.Float64Output {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) float64 { return v.Latitude }).(pulumi.Float64Output)
}

// Configures load shedding policies and percentages for the pool.
func (o LookupLoadBalancerPoolResultOutput) LoadShedding() GetLoadBalancerPoolLoadSheddingOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) GetLoadBalancerPoolLoadShedding { return v.LoadShedding }).(GetLoadBalancerPoolLoadSheddingOutput)
}

// The longitude of the data center containing the origins used in this pool in decimal degrees. If this is set, latitude must also be set.
func (o LookupLoadBalancerPoolResultOutput) Longitude() pulumi.Float64Output {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) float64 { return v.Longitude }).(pulumi.Float64Output)
}

// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and will failover to the next available pool.
func (o LookupLoadBalancerPoolResultOutput) MinimumOrigins() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) int { return v.MinimumOrigins }).(pulumi.IntOutput)
}

func (o LookupLoadBalancerPoolResultOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.ModifiedOn }).(pulumi.StringOutput)
}

// The ID of the Monitor to use for checking the health of origins within this pool.
func (o LookupLoadBalancerPoolResultOutput) Monitor() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.Monitor }).(pulumi.StringOutput)
}

// A short name (tag) for the pool. Only alphanumeric characters, hyphens, and underscores are allowed.
func (o LookupLoadBalancerPoolResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.Name }).(pulumi.StringOutput)
}

// List of networks where Load Balancer or Pool is enabled.
func (o LookupLoadBalancerPoolResultOutput) Networks() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) []string { return v.Networks }).(pulumi.StringArrayOutput)
}

// This field is now deprecated. It has been moved to Cloudflare's Centralized Notification service https://developers.cloudflare.com/fundamentals/notifications/. The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
func (o LookupLoadBalancerPoolResultOutput) NotificationEmail() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) string { return v.NotificationEmail }).(pulumi.StringOutput)
}

// Filter pool and origin health notifications by resource type or health status. Use null to reset.
func (o LookupLoadBalancerPoolResultOutput) NotificationFilter() GetLoadBalancerPoolNotificationFilterOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) GetLoadBalancerPoolNotificationFilter {
		return v.NotificationFilter
	}).(GetLoadBalancerPoolNotificationFilterOutput)
}

// Configures origin steering for the pool. Controls how origins are selected for new sessions and traffic without session affinity.
func (o LookupLoadBalancerPoolResultOutput) OriginSteering() GetLoadBalancerPoolOriginSteeringOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) GetLoadBalancerPoolOriginSteering { return v.OriginSteering }).(GetLoadBalancerPoolOriginSteeringOutput)
}

// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
func (o LookupLoadBalancerPoolResultOutput) Origins() GetLoadBalancerPoolOriginArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) []GetLoadBalancerPoolOrigin { return v.Origins }).(GetLoadBalancerPoolOriginArrayOutput)
}

func (o LookupLoadBalancerPoolResultOutput) PoolId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancerPoolResult) *string { return v.PoolId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoadBalancerPoolResultOutput{})
}
