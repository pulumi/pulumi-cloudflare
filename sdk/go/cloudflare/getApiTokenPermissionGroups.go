// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to look up [API Token Permission Groups](https://developers.cloudflare.com/api/tokens/create/permissions).
// Commonly used as references within [`cloudflareToken`](https://www.terraform.io/docs/providers/cloudflare/r/api_token.html) resources.
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
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// all, err := cloudflare.GetApiTokenPermissionGroups(ctx, map[string]interface{}{
// }, nil);
// if err != nil {
// return err
// }
// ctx.Export("dnsReadPermissionId", all.Zone.DNS Read)
// ctx.Export("accountLbMonitorsAndReadId", all.Account.Load Balancing: Monitors and Pools Read)
// ctx.Export("userMembershipsReadId", all.User.Memberships Read)
// return nil
// })
// }
// ```
func GetApiTokenPermissionGroups(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetApiTokenPermissionGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetApiTokenPermissionGroupsResult
	err := ctx.Invoke("cloudflare:index/getApiTokenPermissionGroups:getApiTokenPermissionGroups", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getApiTokenPermissionGroups.
type GetApiTokenPermissionGroupsResult struct {
	// Map of permissions for account level resources.
	Account map[string]string `pulumi:"account"`
	// Checksum of permissions.
	Id string `pulumi:"id"`
	// Map of all permissions available. Should not be used as some permissions will overlap resource scope. Instead, use resource level specific attributes.
	//
	// Deprecated: Use specific account, zone or user attributes instead.
	Permissions map[string]string `pulumi:"permissions"`
	// Map of permissions for r2 level resources.
	R2 map[string]string `pulumi:"r2"`
	// Map of permissions for user level resources.
	User map[string]string `pulumi:"user"`
	// Map of permissions for zone level resources.
	Zone map[string]string `pulumi:"zone"`
}

func GetApiTokenPermissionGroupsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetApiTokenPermissionGroupsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetApiTokenPermissionGroupsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("cloudflare:index/getApiTokenPermissionGroups:getApiTokenPermissionGroups", nil, GetApiTokenPermissionGroupsResultOutput{}, options).(GetApiTokenPermissionGroupsResultOutput), nil
	}).(GetApiTokenPermissionGroupsResultOutput)
}

// A collection of values returned by getApiTokenPermissionGroups.
type GetApiTokenPermissionGroupsResultOutput struct{ *pulumi.OutputState }

func (GetApiTokenPermissionGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApiTokenPermissionGroupsResult)(nil)).Elem()
}

func (o GetApiTokenPermissionGroupsResultOutput) ToGetApiTokenPermissionGroupsResultOutput() GetApiTokenPermissionGroupsResultOutput {
	return o
}

func (o GetApiTokenPermissionGroupsResultOutput) ToGetApiTokenPermissionGroupsResultOutputWithContext(ctx context.Context) GetApiTokenPermissionGroupsResultOutput {
	return o
}

// Map of permissions for account level resources.
func (o GetApiTokenPermissionGroupsResultOutput) Account() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetApiTokenPermissionGroupsResult) map[string]string { return v.Account }).(pulumi.StringMapOutput)
}

// Checksum of permissions.
func (o GetApiTokenPermissionGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiTokenPermissionGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Map of all permissions available. Should not be used as some permissions will overlap resource scope. Instead, use resource level specific attributes.
//
// Deprecated: Use specific account, zone or user attributes instead.
func (o GetApiTokenPermissionGroupsResultOutput) Permissions() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetApiTokenPermissionGroupsResult) map[string]string { return v.Permissions }).(pulumi.StringMapOutput)
}

// Map of permissions for r2 level resources.
func (o GetApiTokenPermissionGroupsResultOutput) R2() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetApiTokenPermissionGroupsResult) map[string]string { return v.R2 }).(pulumi.StringMapOutput)
}

// Map of permissions for user level resources.
func (o GetApiTokenPermissionGroupsResultOutput) User() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetApiTokenPermissionGroupsResult) map[string]string { return v.User }).(pulumi.StringMapOutput)
}

// Map of permissions for zone level resources.
func (o GetApiTokenPermissionGroupsResultOutput) Zone() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetApiTokenPermissionGroupsResult) map[string]string { return v.Zone }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetApiTokenPermissionGroupsResultOutput{})
}
