// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve an existing origin ca certificate.
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
//			_, err := cloudflare.LookupOriginCaCertificate(ctx, &cloudflare.LookupOriginCaCertificateArgs{
//				Id: "REPLACE_ME",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupOriginCaCertificate(ctx *pulumi.Context, args *LookupOriginCaCertificateArgs, opts ...pulumi.InvokeOption) (*LookupOriginCaCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOriginCaCertificateResult
	err := ctx.Invoke("cloudflare:index/getOriginCaCertificate:getOriginCaCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOriginCaCertificate.
type LookupOriginCaCertificateArgs struct {
	// The Origin CA Certificate unique identifier.
	Id string `pulumi:"id"`
}

// A collection of values returned by getOriginCaCertificate.
type LookupOriginCaCertificateResult struct {
	// The Origin CA certificate.
	Certificate string `pulumi:"certificate"`
	// The timestamp when the certificate will expire.
	ExpiresOn string `pulumi:"expiresOn"`
	// A list of hostnames or wildcard names bound to the certificate.
	Hostnames []string `pulumi:"hostnames"`
	// The Origin CA Certificate unique identifier.
	Id string `pulumi:"id"`
	// The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`
	RequestType string `pulumi:"requestType"`
	// The timestamp when the certificate was revoked.
	RevokedAt string `pulumi:"revokedAt"`
}

func LookupOriginCaCertificateOutput(ctx *pulumi.Context, args LookupOriginCaCertificateOutputArgs, opts ...pulumi.InvokeOption) LookupOriginCaCertificateResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupOriginCaCertificateResultOutput, error) {
			args := v.(LookupOriginCaCertificateArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getOriginCaCertificate:getOriginCaCertificate", args, LookupOriginCaCertificateResultOutput{}, options).(LookupOriginCaCertificateResultOutput), nil
		}).(LookupOriginCaCertificateResultOutput)
}

// A collection of arguments for invoking getOriginCaCertificate.
type LookupOriginCaCertificateOutputArgs struct {
	// The Origin CA Certificate unique identifier.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupOriginCaCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOriginCaCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getOriginCaCertificate.
type LookupOriginCaCertificateResultOutput struct{ *pulumi.OutputState }

func (LookupOriginCaCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOriginCaCertificateResult)(nil)).Elem()
}

func (o LookupOriginCaCertificateResultOutput) ToLookupOriginCaCertificateResultOutput() LookupOriginCaCertificateResultOutput {
	return o
}

func (o LookupOriginCaCertificateResultOutput) ToLookupOriginCaCertificateResultOutputWithContext(ctx context.Context) LookupOriginCaCertificateResultOutput {
	return o
}

// The Origin CA certificate.
func (o LookupOriginCaCertificateResultOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOriginCaCertificateResult) string { return v.Certificate }).(pulumi.StringOutput)
}

// The timestamp when the certificate will expire.
func (o LookupOriginCaCertificateResultOutput) ExpiresOn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOriginCaCertificateResult) string { return v.ExpiresOn }).(pulumi.StringOutput)
}

// A list of hostnames or wildcard names bound to the certificate.
func (o LookupOriginCaCertificateResultOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOriginCaCertificateResult) []string { return v.Hostnames }).(pulumi.StringArrayOutput)
}

// The Origin CA Certificate unique identifier.
func (o LookupOriginCaCertificateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOriginCaCertificateResult) string { return v.Id }).(pulumi.StringOutput)
}

// The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`
func (o LookupOriginCaCertificateResultOutput) RequestType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOriginCaCertificateResult) string { return v.RequestType }).(pulumi.StringOutput)
}

// The timestamp when the certificate was revoked.
func (o LookupOriginCaCertificateResultOutput) RevokedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOriginCaCertificateResult) string { return v.RevokedAt }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOriginCaCertificateResultOutput{})
}
