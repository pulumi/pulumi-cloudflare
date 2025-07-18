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
//			_, err := cloudflare.NewMtlsCertificate(ctx, "example_mtls_certificate", &cloudflare.MtlsCertificateArgs{
//				AccountId:    pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				Ca:           pulumi.Bool(true),
//				Certificates: pulumi.String("  -----BEGIN CERTIFICATE-----\n  MIIDmDCCAoCgAwIBAgIUKTOAZNjcXVZRj4oQt0SHsl1c1vMwDQYJKoZIhvcNAQELBQAwUTELMAkGA1UEBhMCVVMxFjAUBgNVBAgMDVNhbiBGcmFuY2lzY28xEzARBgNVBAcMCkNhbGlmb3JuaWExFTATBgNVBAoMDEV4YW1wbGUgSW5jLjAgFw0yMjExMjIxNjU5NDdaGA8yMTIyMTAyOTE2NTk0N1owUTELMAkGA1UEBhMCVVMxFjAUBgNVBAgMDVNhbiBGcmFuY2lzY28xEzARBgNVBAcMCkNhbGlmb3JuaWExFTATBgNVBAoMDEV4YW1wbGUgSW5jLjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAMRcORwgJFTdcG/2GKI+cFYiOBNDKjCZUXEOvXWY42BkH9wxiMT869CO+enA1w5pIrXow6kCM1sQspHHaVmJUlotEMJxyoLFfA/8Kt1EKFyobOjuZs2SwyVyJ2sStvQuUQEosULZCNGZEqoH5g6zhMPxaxm7ZLrrsDZ9maNGVqo7EWLWHrZ57Q/5MtTrbxQL+eXjUmJ9K3kS+3uEwMdqR6Z3BluU1ivanpPc1CN2GNhdO0/hSY4YkGEnuLsqJyDd3cIiB1MxuCBJ4ZaqOd2viV1WcP3oU3dxVPm4MWyfYIldMWB14FahScxLhWdRnM9YZ/i9IFcLypXsuz7DjrJPtPUCAwEAAaNmMGQwHQYDVR0OBBYEFP5JzLUawNF+c3AXsYTEWHh7z2czMB8GA1UdIwQYMBaAFP5JzLUawNF+c3AXsYTEWHh7z2czMA4GA1UdDwEB/wQEAwIBBjASBgNVHRMBAf8ECDAGAQH/AgEBMA0GCSqGSIb3DQEBCwUAA4IBAQBc+Be7NDhpE09y7hLPZGRPl1cSKBw4RI0XIv6rlbSTFs5EebpTGjhx/whNxwEZhB9HZ7111Oa1YlT8xkI9DshB78mjAHCKBAJ76moK8tkG0aqdYpJ4ZcJTVBB7l98Rvgc7zfTii7WemTy72deBbSeiEtXavm4EF0mWjHhQ5Nxpnp00Bqn5g1x8CyTDypgmugnep+xG+iFzNmTdsz7WI9T/7kDMXqB7M/FPWBORyS98OJqNDswCLF8bIZYwUBEe+bRHFomoShMzaC3tvim7WCb16noDkSTMlfKO4pnvKhpcVdSgwcruATV7y+W+Lvmz2OT/Gui4JhqeoTewsxndhDDE\n  -----END CERTIFICATE-----\n"),
//				Name:         pulumi.String("example_ca_cert"),
//				PrivateKey:   pulumi.String("  -----BEGIN PRIVATE KEY-----\n  MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDEXDkcICRU3XBv9hiiPnBWIjgTQyowmVFxDr11mONgZB/cMYjE/OvQjvnpwNcOaSK16MOpAjNbELKRx2lZiVJaLRDCccqCxXwP/CrdRChcqGzo7mbNksMlcidrErb0LlEBKLFC2QjRmRKqB+YOs4TD8WsZu2S667A2fZmjRlaqOxFi1h62ee0P+TLU628UC/nl41JifSt5Evt7hMDHakemdwZblNYr2p6T3NQjdhjYXTtP4UmOGJBhJ7i7Kicg3d3CIgdTMbggSeGWqjndr4ldVnD96FN3cVT5uDFsn2CJXTFgdeBWoUnMS4VnUZzPWGf4vSBXC8qV7Ls+w46yT7T1AgMBAAECggEAQZnp/oqCeNPOR6l5S2L+1tfx0gWjZ78hJVteUpZ0iHSK7F6kKeOxyOird7vUXV0kmo+cJq+0hp0Ke4eam640FCpwKfYoSQ4/R3vgujGWJnaihCN5tv5sMet0XeJPuz5qE7ALoKCvwI6aXLHs20aAeZIDTQJ9QbGSGnJVzOWn+JDTidIgZpN57RpXfSAwnJPTQK/PN8i5z108hsaDOdEgGmxYZ7kYqMqzX20KXmth58LDfPixs5JGtS60iiKC/wOcGzkB2/AdTSojR76oEU77cANP/3zO25NG//whUdYlW0t0d7PgXxIeJe+xgYnamDQJx3qonVyt4H77ha0ObRAj9QKBgQDicZr+VTwFMnELP3a+FXGnjehRiuS1i7MXGKxNweCD+dFlML0FplSQS8Ro2n+d8lu8BBXGx0qm6VXu8Rhn7TAUL6q+PCgfarzxfIhacb/TZCqfieIHsMlVBfhV5HCXnk+kis0tuC/PRArcWTwDHJUJXkBhvkUsNswvQzavDPI7KwKBgQDd/WgLkj7A3X5fgIHZH/GbDSBiXwzKb+rF4ZCT2XFgG/OAW7vapfcX/w+v+5lBLyrocmOAS3PGGAhM5T3HLnUCQfnK4qgps1Lqibkc9Tmnsn60LanUjuUMsYv/zSw70tozbzhJ0pioEpWfRxRZBztO2Rr8Ntm7h6Fk701EXGNAXwKBgQCD1xsjy2J3sCerIdcz0u5qXLAPkeuZW+34m4/ucdwTWwc0gEz9lhsULFj9p4G351zLuiEnq+7mAWLcDJlmIO3mQt6JhiLiL9Y0T4pgBmxmWqKKYtAsJB0EmMY+1BNN44mBRqMxZFTJu1cLdhT/xstrOeoIPqytknYNanfTMZlzIwKBgHrLXe5oq0XMP8dcMneEcAUwsaU4pr6kQd3L9EmUkl5zl7J9C+DaxWAEuwzBw/iGutlxzRB+rD/7szu14wJ29EqXbDGKRzMp+se5/yfBjm7xEZ1hVPw7PwBShfqt57X/4Ktq7lwHnmH6RcGhc+P7WBc5iO/S94YAdIp8xOT3pf9JAoGAE0QkqJUY+5Mgr+fBO0VNV72ZoPveGpW+De59uhKAOnu1zljQCUtk59m6+DXfm0tNYKtawa5n8iN71Zh+s62xXSt3pYi1Y5CCCmv8Y4BhwIcPwXKk3zEvLgSHVTpC0bayA9aSO4bbZgVXa5w+Z0w/vvfp9DWo1IS3EnQRrz6WMYA=\n  -----END PRIVATE KEY-----\n"),
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
// $ pulumi import cloudflare:index/mtlsCertificate:MtlsCertificate example '<account_id>/<mtls_certificate_id>'
// ```
type MtlsCertificate struct {
	pulumi.CustomResourceState

	// Identifier.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Indicates whether the certificate is a CA or leaf certificate.
	Ca pulumi.BoolOutput `pulumi:"ca"`
	// The uploaded root CA certificate.
	Certificates pulumi.StringOutput `pulumi:"certificates"`
	// When the certificate expires.
	ExpiresOn pulumi.StringOutput `pulumi:"expiresOn"`
	// The certificate authority that issued the certificate.
	Issuer pulumi.StringOutput `pulumi:"issuer"`
	// Optional unique name for the certificate. Only used for human readability.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust's block page.
	PrivateKey pulumi.StringPtrOutput `pulumi:"privateKey"`
	// The certificate serial number.
	SerialNumber pulumi.StringOutput `pulumi:"serialNumber"`
	// The type of hash used for the certificate.
	Signature pulumi.StringOutput `pulumi:"signature"`
	// This is the time the certificate was updated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// This is the time the certificate was uploaded.
	UploadedOn pulumi.StringOutput `pulumi:"uploadedOn"`
}

// NewMtlsCertificate registers a new resource with the given unique name, arguments, and options.
func NewMtlsCertificate(ctx *pulumi.Context,
	name string, args *MtlsCertificateArgs, opts ...pulumi.ResourceOption) (*MtlsCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Ca == nil {
		return nil, errors.New("invalid value for required argument 'Ca'")
	}
	if args.Certificates == nil {
		return nil, errors.New("invalid value for required argument 'Certificates'")
	}
	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MtlsCertificate
	err := ctx.RegisterResource("cloudflare:index/mtlsCertificate:MtlsCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMtlsCertificate gets an existing MtlsCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMtlsCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MtlsCertificateState, opts ...pulumi.ResourceOption) (*MtlsCertificate, error) {
	var resource MtlsCertificate
	err := ctx.ReadResource("cloudflare:index/mtlsCertificate:MtlsCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MtlsCertificate resources.
type mtlsCertificateState struct {
	// Identifier.
	AccountId *string `pulumi:"accountId"`
	// Indicates whether the certificate is a CA or leaf certificate.
	Ca *bool `pulumi:"ca"`
	// The uploaded root CA certificate.
	Certificates *string `pulumi:"certificates"`
	// When the certificate expires.
	ExpiresOn *string `pulumi:"expiresOn"`
	// The certificate authority that issued the certificate.
	Issuer *string `pulumi:"issuer"`
	// Optional unique name for the certificate. Only used for human readability.
	Name *string `pulumi:"name"`
	// The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust's block page.
	PrivateKey *string `pulumi:"privateKey"`
	// The certificate serial number.
	SerialNumber *string `pulumi:"serialNumber"`
	// The type of hash used for the certificate.
	Signature *string `pulumi:"signature"`
	// This is the time the certificate was updated.
	UpdatedAt *string `pulumi:"updatedAt"`
	// This is the time the certificate was uploaded.
	UploadedOn *string `pulumi:"uploadedOn"`
}

type MtlsCertificateState struct {
	// Identifier.
	AccountId pulumi.StringPtrInput
	// Indicates whether the certificate is a CA or leaf certificate.
	Ca pulumi.BoolPtrInput
	// The uploaded root CA certificate.
	Certificates pulumi.StringPtrInput
	// When the certificate expires.
	ExpiresOn pulumi.StringPtrInput
	// The certificate authority that issued the certificate.
	Issuer pulumi.StringPtrInput
	// Optional unique name for the certificate. Only used for human readability.
	Name pulumi.StringPtrInput
	// The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust's block page.
	PrivateKey pulumi.StringPtrInput
	// The certificate serial number.
	SerialNumber pulumi.StringPtrInput
	// The type of hash used for the certificate.
	Signature pulumi.StringPtrInput
	// This is the time the certificate was updated.
	UpdatedAt pulumi.StringPtrInput
	// This is the time the certificate was uploaded.
	UploadedOn pulumi.StringPtrInput
}

func (MtlsCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*mtlsCertificateState)(nil)).Elem()
}

type mtlsCertificateArgs struct {
	// Identifier.
	AccountId string `pulumi:"accountId"`
	// Indicates whether the certificate is a CA or leaf certificate.
	Ca bool `pulumi:"ca"`
	// The uploaded root CA certificate.
	Certificates string `pulumi:"certificates"`
	// Optional unique name for the certificate. Only used for human readability.
	Name *string `pulumi:"name"`
	// The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust's block page.
	PrivateKey *string `pulumi:"privateKey"`
}

// The set of arguments for constructing a MtlsCertificate resource.
type MtlsCertificateArgs struct {
	// Identifier.
	AccountId pulumi.StringInput
	// Indicates whether the certificate is a CA or leaf certificate.
	Ca pulumi.BoolInput
	// The uploaded root CA certificate.
	Certificates pulumi.StringInput
	// Optional unique name for the certificate. Only used for human readability.
	Name pulumi.StringPtrInput
	// The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust's block page.
	PrivateKey pulumi.StringPtrInput
}

func (MtlsCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mtlsCertificateArgs)(nil)).Elem()
}

type MtlsCertificateInput interface {
	pulumi.Input

	ToMtlsCertificateOutput() MtlsCertificateOutput
	ToMtlsCertificateOutputWithContext(ctx context.Context) MtlsCertificateOutput
}

func (*MtlsCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**MtlsCertificate)(nil)).Elem()
}

func (i *MtlsCertificate) ToMtlsCertificateOutput() MtlsCertificateOutput {
	return i.ToMtlsCertificateOutputWithContext(context.Background())
}

func (i *MtlsCertificate) ToMtlsCertificateOutputWithContext(ctx context.Context) MtlsCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MtlsCertificateOutput)
}

// MtlsCertificateArrayInput is an input type that accepts MtlsCertificateArray and MtlsCertificateArrayOutput values.
// You can construct a concrete instance of `MtlsCertificateArrayInput` via:
//
//	MtlsCertificateArray{ MtlsCertificateArgs{...} }
type MtlsCertificateArrayInput interface {
	pulumi.Input

	ToMtlsCertificateArrayOutput() MtlsCertificateArrayOutput
	ToMtlsCertificateArrayOutputWithContext(context.Context) MtlsCertificateArrayOutput
}

type MtlsCertificateArray []MtlsCertificateInput

func (MtlsCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MtlsCertificate)(nil)).Elem()
}

func (i MtlsCertificateArray) ToMtlsCertificateArrayOutput() MtlsCertificateArrayOutput {
	return i.ToMtlsCertificateArrayOutputWithContext(context.Background())
}

func (i MtlsCertificateArray) ToMtlsCertificateArrayOutputWithContext(ctx context.Context) MtlsCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MtlsCertificateArrayOutput)
}

// MtlsCertificateMapInput is an input type that accepts MtlsCertificateMap and MtlsCertificateMapOutput values.
// You can construct a concrete instance of `MtlsCertificateMapInput` via:
//
//	MtlsCertificateMap{ "key": MtlsCertificateArgs{...} }
type MtlsCertificateMapInput interface {
	pulumi.Input

	ToMtlsCertificateMapOutput() MtlsCertificateMapOutput
	ToMtlsCertificateMapOutputWithContext(context.Context) MtlsCertificateMapOutput
}

type MtlsCertificateMap map[string]MtlsCertificateInput

func (MtlsCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MtlsCertificate)(nil)).Elem()
}

func (i MtlsCertificateMap) ToMtlsCertificateMapOutput() MtlsCertificateMapOutput {
	return i.ToMtlsCertificateMapOutputWithContext(context.Background())
}

func (i MtlsCertificateMap) ToMtlsCertificateMapOutputWithContext(ctx context.Context) MtlsCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MtlsCertificateMapOutput)
}

type MtlsCertificateOutput struct{ *pulumi.OutputState }

func (MtlsCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MtlsCertificate)(nil)).Elem()
}

func (o MtlsCertificateOutput) ToMtlsCertificateOutput() MtlsCertificateOutput {
	return o
}

func (o MtlsCertificateOutput) ToMtlsCertificateOutputWithContext(ctx context.Context) MtlsCertificateOutput {
	return o
}

// Identifier.
func (o MtlsCertificateOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Indicates whether the certificate is a CA or leaf certificate.
func (o MtlsCertificateOutput) Ca() pulumi.BoolOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.BoolOutput { return v.Ca }).(pulumi.BoolOutput)
}

// The uploaded root CA certificate.
func (o MtlsCertificateOutput) Certificates() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.Certificates }).(pulumi.StringOutput)
}

// When the certificate expires.
func (o MtlsCertificateOutput) ExpiresOn() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.ExpiresOn }).(pulumi.StringOutput)
}

// The certificate authority that issued the certificate.
func (o MtlsCertificateOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.Issuer }).(pulumi.StringOutput)
}

// Optional unique name for the certificate. Only used for human readability.
func (o MtlsCertificateOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// The private key for the certificate. This field is only needed for specific use cases such as using a custom certificate with Zero Trust's block page.
func (o MtlsCertificateOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringPtrOutput { return v.PrivateKey }).(pulumi.StringPtrOutput)
}

// The certificate serial number.
func (o MtlsCertificateOutput) SerialNumber() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.SerialNumber }).(pulumi.StringOutput)
}

// The type of hash used for the certificate.
func (o MtlsCertificateOutput) Signature() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.Signature }).(pulumi.StringOutput)
}

// This is the time the certificate was updated.
func (o MtlsCertificateOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// This is the time the certificate was uploaded.
func (o MtlsCertificateOutput) UploadedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.UploadedOn }).(pulumi.StringOutput)
}

type MtlsCertificateArrayOutput struct{ *pulumi.OutputState }

func (MtlsCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MtlsCertificate)(nil)).Elem()
}

func (o MtlsCertificateArrayOutput) ToMtlsCertificateArrayOutput() MtlsCertificateArrayOutput {
	return o
}

func (o MtlsCertificateArrayOutput) ToMtlsCertificateArrayOutputWithContext(ctx context.Context) MtlsCertificateArrayOutput {
	return o
}

func (o MtlsCertificateArrayOutput) Index(i pulumi.IntInput) MtlsCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MtlsCertificate {
		return vs[0].([]*MtlsCertificate)[vs[1].(int)]
	}).(MtlsCertificateOutput)
}

type MtlsCertificateMapOutput struct{ *pulumi.OutputState }

func (MtlsCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MtlsCertificate)(nil)).Elem()
}

func (o MtlsCertificateMapOutput) ToMtlsCertificateMapOutput() MtlsCertificateMapOutput {
	return o
}

func (o MtlsCertificateMapOutput) ToMtlsCertificateMapOutputWithContext(ctx context.Context) MtlsCertificateMapOutput {
	return o
}

func (o MtlsCertificateMapOutput) MapIndex(k pulumi.StringInput) MtlsCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MtlsCertificate {
		return vs[0].(map[string]*MtlsCertificate)[vs[1].(string)]
	}).(MtlsCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MtlsCertificateInput)(nil)).Elem(), &MtlsCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*MtlsCertificateArrayInput)(nil)).Elem(), MtlsCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MtlsCertificateMapInput)(nil)).Elem(), MtlsCertificateMap{})
	pulumi.RegisterOutputType(MtlsCertificateOutput{})
	pulumi.RegisterOutputType(MtlsCertificateArrayOutput{})
	pulumi.RegisterOutputType(MtlsCertificateMapOutput{})
}
