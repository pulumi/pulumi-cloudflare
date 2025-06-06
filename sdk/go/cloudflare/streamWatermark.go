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
//			_, err := cloudflare.NewStreamWatermark(ctx, "example_stream_watermark", &cloudflare.StreamWatermarkArgs{
//				AccountId: pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//				File:      pulumi.String("@/Users/rchen/Downloads/watermark.png"),
//				Name:      pulumi.String("Marketing Videos"),
//				Opacity:   pulumi.Float64(0.75),
//				Padding:   pulumi.Float64(0.1),
//				Position:  pulumi.String("center"),
//				Scale:     pulumi.Float64(0.1),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type StreamWatermark struct {
	pulumi.CustomResourceState

	// The account identifier tag.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The date and a time a watermark profile was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
	DownloadedFrom pulumi.StringOutput `pulumi:"downloadedFrom"`
	// The image file to upload.
	File pulumi.StringOutput `pulumi:"file"`
	// The height of the image in pixels.
	Height pulumi.IntOutput `pulumi:"height"`
	// The unique identifier for a watermark profile.
	Identifier pulumi.StringPtrOutput `pulumi:"identifier"`
	// A short description of the watermark profile.
	Name pulumi.StringOutput `pulumi:"name"`
	// The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
	Opacity pulumi.Float64Output `pulumi:"opacity"`
	// The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
	Padding pulumi.Float64Output `pulumi:"padding"`
	// The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
	Position pulumi.StringOutput `pulumi:"position"`
	// The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
	Scale pulumi.Float64Output `pulumi:"scale"`
	// The size of the image in bytes.
	Size pulumi.Float64Output `pulumi:"size"`
	// The unique identifier for a watermark profile.
	Uid pulumi.StringOutput `pulumi:"uid"`
	// The width of the image in pixels.
	Width pulumi.IntOutput `pulumi:"width"`
}

// NewStreamWatermark registers a new resource with the given unique name, arguments, and options.
func NewStreamWatermark(ctx *pulumi.Context,
	name string, args *StreamWatermarkArgs, opts ...pulumi.ResourceOption) (*StreamWatermark, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.File == nil {
		return nil, errors.New("invalid value for required argument 'File'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StreamWatermark
	err := ctx.RegisterResource("cloudflare:index/streamWatermark:StreamWatermark", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamWatermark gets an existing StreamWatermark resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamWatermark(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamWatermarkState, opts ...pulumi.ResourceOption) (*StreamWatermark, error) {
	var resource StreamWatermark
	err := ctx.ReadResource("cloudflare:index/streamWatermark:StreamWatermark", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamWatermark resources.
type streamWatermarkState struct {
	// The account identifier tag.
	AccountId *string `pulumi:"accountId"`
	// The date and a time a watermark profile was created.
	Created *string `pulumi:"created"`
	// The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
	DownloadedFrom *string `pulumi:"downloadedFrom"`
	// The image file to upload.
	File *string `pulumi:"file"`
	// The height of the image in pixels.
	Height *int `pulumi:"height"`
	// The unique identifier for a watermark profile.
	Identifier *string `pulumi:"identifier"`
	// A short description of the watermark profile.
	Name *string `pulumi:"name"`
	// The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
	Opacity *float64 `pulumi:"opacity"`
	// The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
	Padding *float64 `pulumi:"padding"`
	// The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
	Position *string `pulumi:"position"`
	// The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
	Scale *float64 `pulumi:"scale"`
	// The size of the image in bytes.
	Size *float64 `pulumi:"size"`
	// The unique identifier for a watermark profile.
	Uid *string `pulumi:"uid"`
	// The width of the image in pixels.
	Width *int `pulumi:"width"`
}

type StreamWatermarkState struct {
	// The account identifier tag.
	AccountId pulumi.StringPtrInput
	// The date and a time a watermark profile was created.
	Created pulumi.StringPtrInput
	// The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
	DownloadedFrom pulumi.StringPtrInput
	// The image file to upload.
	File pulumi.StringPtrInput
	// The height of the image in pixels.
	Height pulumi.IntPtrInput
	// The unique identifier for a watermark profile.
	Identifier pulumi.StringPtrInput
	// A short description of the watermark profile.
	Name pulumi.StringPtrInput
	// The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
	Opacity pulumi.Float64PtrInput
	// The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
	Padding pulumi.Float64PtrInput
	// The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
	Position pulumi.StringPtrInput
	// The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
	Scale pulumi.Float64PtrInput
	// The size of the image in bytes.
	Size pulumi.Float64PtrInput
	// The unique identifier for a watermark profile.
	Uid pulumi.StringPtrInput
	// The width of the image in pixels.
	Width pulumi.IntPtrInput
}

func (StreamWatermarkState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamWatermarkState)(nil)).Elem()
}

type streamWatermarkArgs struct {
	// The account identifier tag.
	AccountId string `pulumi:"accountId"`
	// The image file to upload.
	File string `pulumi:"file"`
	// The unique identifier for a watermark profile.
	Identifier *string `pulumi:"identifier"`
	// A short description of the watermark profile.
	Name *string `pulumi:"name"`
	// The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
	Opacity *float64 `pulumi:"opacity"`
	// The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
	Padding *float64 `pulumi:"padding"`
	// The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
	Position *string `pulumi:"position"`
	// The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
	Scale *float64 `pulumi:"scale"`
}

// The set of arguments for constructing a StreamWatermark resource.
type StreamWatermarkArgs struct {
	// The account identifier tag.
	AccountId pulumi.StringInput
	// The image file to upload.
	File pulumi.StringInput
	// The unique identifier for a watermark profile.
	Identifier pulumi.StringPtrInput
	// A short description of the watermark profile.
	Name pulumi.StringPtrInput
	// The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
	Opacity pulumi.Float64PtrInput
	// The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
	Padding pulumi.Float64PtrInput
	// The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
	Position pulumi.StringPtrInput
	// The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
	Scale pulumi.Float64PtrInput
}

func (StreamWatermarkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamWatermarkArgs)(nil)).Elem()
}

type StreamWatermarkInput interface {
	pulumi.Input

	ToStreamWatermarkOutput() StreamWatermarkOutput
	ToStreamWatermarkOutputWithContext(ctx context.Context) StreamWatermarkOutput
}

func (*StreamWatermark) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamWatermark)(nil)).Elem()
}

func (i *StreamWatermark) ToStreamWatermarkOutput() StreamWatermarkOutput {
	return i.ToStreamWatermarkOutputWithContext(context.Background())
}

func (i *StreamWatermark) ToStreamWatermarkOutputWithContext(ctx context.Context) StreamWatermarkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamWatermarkOutput)
}

// StreamWatermarkArrayInput is an input type that accepts StreamWatermarkArray and StreamWatermarkArrayOutput values.
// You can construct a concrete instance of `StreamWatermarkArrayInput` via:
//
//	StreamWatermarkArray{ StreamWatermarkArgs{...} }
type StreamWatermarkArrayInput interface {
	pulumi.Input

	ToStreamWatermarkArrayOutput() StreamWatermarkArrayOutput
	ToStreamWatermarkArrayOutputWithContext(context.Context) StreamWatermarkArrayOutput
}

type StreamWatermarkArray []StreamWatermarkInput

func (StreamWatermarkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamWatermark)(nil)).Elem()
}

func (i StreamWatermarkArray) ToStreamWatermarkArrayOutput() StreamWatermarkArrayOutput {
	return i.ToStreamWatermarkArrayOutputWithContext(context.Background())
}

func (i StreamWatermarkArray) ToStreamWatermarkArrayOutputWithContext(ctx context.Context) StreamWatermarkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamWatermarkArrayOutput)
}

// StreamWatermarkMapInput is an input type that accepts StreamWatermarkMap and StreamWatermarkMapOutput values.
// You can construct a concrete instance of `StreamWatermarkMapInput` via:
//
//	StreamWatermarkMap{ "key": StreamWatermarkArgs{...} }
type StreamWatermarkMapInput interface {
	pulumi.Input

	ToStreamWatermarkMapOutput() StreamWatermarkMapOutput
	ToStreamWatermarkMapOutputWithContext(context.Context) StreamWatermarkMapOutput
}

type StreamWatermarkMap map[string]StreamWatermarkInput

func (StreamWatermarkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamWatermark)(nil)).Elem()
}

func (i StreamWatermarkMap) ToStreamWatermarkMapOutput() StreamWatermarkMapOutput {
	return i.ToStreamWatermarkMapOutputWithContext(context.Background())
}

func (i StreamWatermarkMap) ToStreamWatermarkMapOutputWithContext(ctx context.Context) StreamWatermarkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamWatermarkMapOutput)
}

type StreamWatermarkOutput struct{ *pulumi.OutputState }

func (StreamWatermarkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamWatermark)(nil)).Elem()
}

func (o StreamWatermarkOutput) ToStreamWatermarkOutput() StreamWatermarkOutput {
	return o
}

func (o StreamWatermarkOutput) ToStreamWatermarkOutputWithContext(ctx context.Context) StreamWatermarkOutput {
	return o
}

// The account identifier tag.
func (o StreamWatermarkOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The date and a time a watermark profile was created.
func (o StreamWatermarkOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
func (o StreamWatermarkOutput) DownloadedFrom() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringOutput { return v.DownloadedFrom }).(pulumi.StringOutput)
}

// The image file to upload.
func (o StreamWatermarkOutput) File() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringOutput { return v.File }).(pulumi.StringOutput)
}

// The height of the image in pixels.
func (o StreamWatermarkOutput) Height() pulumi.IntOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.IntOutput { return v.Height }).(pulumi.IntOutput)
}

// The unique identifier for a watermark profile.
func (o StreamWatermarkOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringPtrOutput { return v.Identifier }).(pulumi.StringPtrOutput)
}

// A short description of the watermark profile.
func (o StreamWatermarkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
func (o StreamWatermarkOutput) Opacity() pulumi.Float64Output {
	return o.ApplyT(func(v *StreamWatermark) pulumi.Float64Output { return v.Opacity }).(pulumi.Float64Output)
}

// The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
func (o StreamWatermarkOutput) Padding() pulumi.Float64Output {
	return o.ApplyT(func(v *StreamWatermark) pulumi.Float64Output { return v.Padding }).(pulumi.Float64Output)
}

// The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
func (o StreamWatermarkOutput) Position() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringOutput { return v.Position }).(pulumi.StringOutput)
}

// The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
func (o StreamWatermarkOutput) Scale() pulumi.Float64Output {
	return o.ApplyT(func(v *StreamWatermark) pulumi.Float64Output { return v.Scale }).(pulumi.Float64Output)
}

// The size of the image in bytes.
func (o StreamWatermarkOutput) Size() pulumi.Float64Output {
	return o.ApplyT(func(v *StreamWatermark) pulumi.Float64Output { return v.Size }).(pulumi.Float64Output)
}

// The unique identifier for a watermark profile.
func (o StreamWatermarkOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

// The width of the image in pixels.
func (o StreamWatermarkOutput) Width() pulumi.IntOutput {
	return o.ApplyT(func(v *StreamWatermark) pulumi.IntOutput { return v.Width }).(pulumi.IntOutput)
}

type StreamWatermarkArrayOutput struct{ *pulumi.OutputState }

func (StreamWatermarkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamWatermark)(nil)).Elem()
}

func (o StreamWatermarkArrayOutput) ToStreamWatermarkArrayOutput() StreamWatermarkArrayOutput {
	return o
}

func (o StreamWatermarkArrayOutput) ToStreamWatermarkArrayOutputWithContext(ctx context.Context) StreamWatermarkArrayOutput {
	return o
}

func (o StreamWatermarkArrayOutput) Index(i pulumi.IntInput) StreamWatermarkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamWatermark {
		return vs[0].([]*StreamWatermark)[vs[1].(int)]
	}).(StreamWatermarkOutput)
}

type StreamWatermarkMapOutput struct{ *pulumi.OutputState }

func (StreamWatermarkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamWatermark)(nil)).Elem()
}

func (o StreamWatermarkMapOutput) ToStreamWatermarkMapOutput() StreamWatermarkMapOutput {
	return o
}

func (o StreamWatermarkMapOutput) ToStreamWatermarkMapOutputWithContext(ctx context.Context) StreamWatermarkMapOutput {
	return o
}

func (o StreamWatermarkMapOutput) MapIndex(k pulumi.StringInput) StreamWatermarkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamWatermark {
		return vs[0].(map[string]*StreamWatermark)[vs[1].(string)]
	}).(StreamWatermarkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamWatermarkInput)(nil)).Elem(), &StreamWatermark{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamWatermarkArrayInput)(nil)).Elem(), StreamWatermarkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamWatermarkMapInput)(nil)).Elem(), StreamWatermarkMap{})
	pulumi.RegisterOutputType(StreamWatermarkOutput{})
	pulumi.RegisterOutputType(StreamWatermarkArrayOutput{})
	pulumi.RegisterOutputType(StreamWatermarkMapOutput{})
}
