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
//			_, err := cloudflare.LookupZeroTrustDlpDataset(ctx, &cloudflare.LookupZeroTrustDlpDatasetArgs{
//				AccountId: "account_id",
//				DatasetId: "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupZeroTrustDlpDataset(ctx *pulumi.Context, args *LookupZeroTrustDlpDatasetArgs, opts ...pulumi.InvokeOption) (*LookupZeroTrustDlpDatasetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupZeroTrustDlpDatasetResult
	err := ctx.Invoke("cloudflare:index/getZeroTrustDlpDataset:getZeroTrustDlpDataset", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZeroTrustDlpDataset.
type LookupZeroTrustDlpDatasetArgs struct {
	AccountId string `pulumi:"accountId"`
	DatasetId string `pulumi:"datasetId"`
}

// A collection of values returned by getZeroTrustDlpDataset.
type LookupZeroTrustDlpDatasetResult struct {
	AccountId     string                         `pulumi:"accountId"`
	CaseSensitive bool                           `pulumi:"caseSensitive"`
	Columns       []GetZeroTrustDlpDatasetColumn `pulumi:"columns"`
	CreatedAt     string                         `pulumi:"createdAt"`
	DatasetId     string                         `pulumi:"datasetId"`
	// The description of the dataset.
	Description     string `pulumi:"description"`
	EncodingVersion int    `pulumi:"encodingVersion"`
	// The ID of this resource.
	Id       string `pulumi:"id"`
	Name     string `pulumi:"name"`
	NumCells int    `pulumi:"numCells"`
	Secret   bool   `pulumi:"secret"`
	// Available values: "empty", "uploading", "processing", "failed", "complete".
	Status string `pulumi:"status"`
	// When the dataset was last updated.
	UpdatedAt string                         `pulumi:"updatedAt"`
	Uploads   []GetZeroTrustDlpDatasetUpload `pulumi:"uploads"`
}

func LookupZeroTrustDlpDatasetOutput(ctx *pulumi.Context, args LookupZeroTrustDlpDatasetOutputArgs, opts ...pulumi.InvokeOption) LookupZeroTrustDlpDatasetResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupZeroTrustDlpDatasetResultOutput, error) {
			args := v.(LookupZeroTrustDlpDatasetArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("cloudflare:index/getZeroTrustDlpDataset:getZeroTrustDlpDataset", args, LookupZeroTrustDlpDatasetResultOutput{}, options).(LookupZeroTrustDlpDatasetResultOutput), nil
		}).(LookupZeroTrustDlpDatasetResultOutput)
}

// A collection of arguments for invoking getZeroTrustDlpDataset.
type LookupZeroTrustDlpDatasetOutputArgs struct {
	AccountId pulumi.StringInput `pulumi:"accountId"`
	DatasetId pulumi.StringInput `pulumi:"datasetId"`
}

func (LookupZeroTrustDlpDatasetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustDlpDatasetArgs)(nil)).Elem()
}

// A collection of values returned by getZeroTrustDlpDataset.
type LookupZeroTrustDlpDatasetResultOutput struct{ *pulumi.OutputState }

func (LookupZeroTrustDlpDatasetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZeroTrustDlpDatasetResult)(nil)).Elem()
}

func (o LookupZeroTrustDlpDatasetResultOutput) ToLookupZeroTrustDlpDatasetResultOutput() LookupZeroTrustDlpDatasetResultOutput {
	return o
}

func (o LookupZeroTrustDlpDatasetResultOutput) ToLookupZeroTrustDlpDatasetResultOutputWithContext(ctx context.Context) LookupZeroTrustDlpDatasetResultOutput {
	return o
}

func (o LookupZeroTrustDlpDatasetResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.AccountId }).(pulumi.StringOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) CaseSensitive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) bool { return v.CaseSensitive }).(pulumi.BoolOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) Columns() GetZeroTrustDlpDatasetColumnArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) []GetZeroTrustDlpDatasetColumn { return v.Columns }).(GetZeroTrustDlpDatasetColumnArrayOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) DatasetId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.DatasetId }).(pulumi.StringOutput)
}

// The description of the dataset.
func (o LookupZeroTrustDlpDatasetResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) EncodingVersion() pulumi.IntOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) int { return v.EncodingVersion }).(pulumi.IntOutput)
}

// The ID of this resource.
func (o LookupZeroTrustDlpDatasetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) NumCells() pulumi.IntOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) int { return v.NumCells }).(pulumi.IntOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) Secret() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) bool { return v.Secret }).(pulumi.BoolOutput)
}

// Available values: "empty", "uploading", "processing", "failed", "complete".
func (o LookupZeroTrustDlpDatasetResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.Status }).(pulumi.StringOutput)
}

// When the dataset was last updated.
func (o LookupZeroTrustDlpDatasetResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func (o LookupZeroTrustDlpDatasetResultOutput) Uploads() GetZeroTrustDlpDatasetUploadArrayOutput {
	return o.ApplyT(func(v LookupZeroTrustDlpDatasetResult) []GetZeroTrustDlpDatasetUpload { return v.Uploads }).(GetZeroTrustDlpDatasetUploadArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZeroTrustDlpDatasetResultOutput{})
}
