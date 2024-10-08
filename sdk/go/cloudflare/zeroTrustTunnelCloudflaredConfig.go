// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Tunnel configuration resource.
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
//			exampleTunnel, err := cloudflare.NewZeroTrustTunnelCloudflared(ctx, "example_tunnel", &cloudflare.ZeroTrustTunnelCloudflaredArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("example_tunnel"),
//				Secret:    pulumi.String("<32 character secret>"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewZeroTrustTunnelCloudflaredConfig(ctx, "example_config", &cloudflare.ZeroTrustTunnelCloudflaredConfigArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				TunnelId:  exampleTunnel.ID(),
//				Config: &cloudflare.ZeroTrustTunnelCloudflaredConfigConfigArgs{
//					WarpRouting: &cloudflare.ZeroTrustTunnelCloudflaredConfigConfigWarpRoutingArgs{
//						Enabled: pulumi.Bool(true),
//					},
//					OriginRequest: &cloudflare.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestArgs{
//						ConnectTimeout:         pulumi.String("1m0s"),
//						TlsTimeout:             pulumi.String("1m0s"),
//						TcpKeepAlive:           pulumi.String("1m0s"),
//						NoHappyEyeballs:        pulumi.Bool(false),
//						KeepAliveConnections:   pulumi.Int(1024),
//						KeepAliveTimeout:       pulumi.String("1m0s"),
//						HttpHostHeader:         pulumi.String("baz"),
//						OriginServerName:       pulumi.String("foobar"),
//						CaPool:                 pulumi.String("/path/to/unsigned/ca/pool"),
//						NoTlsVerify:            pulumi.Bool(false),
//						DisableChunkedEncoding: pulumi.Bool(false),
//						BastionMode:            pulumi.Bool(false),
//						ProxyAddress:           pulumi.String("10.0.0.1"),
//						ProxyPort:              pulumi.Int(8123),
//						ProxyType:              pulumi.String("socks"),
//						IpRules: cloudflare.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestIpRuleArray{
//							&cloudflare.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestIpRuleArgs{
//								Prefix: pulumi.String("/web"),
//								Ports: pulumi.IntArray{
//									pulumi.Int(80),
//									pulumi.Int(443),
//								},
//								Allow: pulumi.Bool(false),
//							},
//						},
//					},
//					IngressRules: cloudflare.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleArray{
//						&cloudflare.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleArgs{
//							Hostname: pulumi.String("foo"),
//							Path:     pulumi.String("/bar"),
//							Service:  pulumi.String("http://10.0.0.2:8080"),
//							OriginRequest: &cloudflare.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs{
//								ConnectTimeout: pulumi.String("2m0s"),
//								Access: &cloudflare.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs{
//									Required: pulumi.Bool(true),
//									TeamName: pulumi.String("terraform"),
//									AudTags: pulumi.StringArray{
//										pulumi.String("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"),
//									},
//								},
//							},
//						},
//						&cloudflare.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleArgs{
//							Service: pulumi.String("https://10.0.0.3:8081"),
//						},
//					},
//				},
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
// $ pulumi import cloudflare:index/zeroTrustTunnelCloudflaredConfig:ZeroTrustTunnelCloudflaredConfig example <account_id>/<tunnel_id>
// ```
type ZeroTrustTunnelCloudflaredConfig struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Configuration block for Tunnel Configuration.
	Config ZeroTrustTunnelCloudflaredConfigConfigOutput `pulumi:"config"`
	// Identifier of the Tunnel to target for this configuration.
	TunnelId pulumi.StringOutput `pulumi:"tunnelId"`
}

// NewZeroTrustTunnelCloudflaredConfig registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustTunnelCloudflaredConfig(ctx *pulumi.Context,
	name string, args *ZeroTrustTunnelCloudflaredConfigArgs, opts ...pulumi.ResourceOption) (*ZeroTrustTunnelCloudflaredConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	if args.TunnelId == nil {
		return nil, errors.New("invalid value for required argument 'TunnelId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustTunnelCloudflaredConfig
	err := ctx.RegisterResource("cloudflare:index/zeroTrustTunnelCloudflaredConfig:ZeroTrustTunnelCloudflaredConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustTunnelCloudflaredConfig gets an existing ZeroTrustTunnelCloudflaredConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustTunnelCloudflaredConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustTunnelCloudflaredConfigState, opts ...pulumi.ResourceOption) (*ZeroTrustTunnelCloudflaredConfig, error) {
	var resource ZeroTrustTunnelCloudflaredConfig
	err := ctx.ReadResource("cloudflare:index/zeroTrustTunnelCloudflaredConfig:ZeroTrustTunnelCloudflaredConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustTunnelCloudflaredConfig resources.
type zeroTrustTunnelCloudflaredConfigState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Configuration block for Tunnel Configuration.
	Config *ZeroTrustTunnelCloudflaredConfigConfig `pulumi:"config"`
	// Identifier of the Tunnel to target for this configuration.
	TunnelId *string `pulumi:"tunnelId"`
}

type ZeroTrustTunnelCloudflaredConfigState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Configuration block for Tunnel Configuration.
	Config ZeroTrustTunnelCloudflaredConfigConfigPtrInput
	// Identifier of the Tunnel to target for this configuration.
	TunnelId pulumi.StringPtrInput
}

func (ZeroTrustTunnelCloudflaredConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustTunnelCloudflaredConfigState)(nil)).Elem()
}

type zeroTrustTunnelCloudflaredConfigArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Configuration block for Tunnel Configuration.
	Config ZeroTrustTunnelCloudflaredConfigConfig `pulumi:"config"`
	// Identifier of the Tunnel to target for this configuration.
	TunnelId string `pulumi:"tunnelId"`
}

// The set of arguments for constructing a ZeroTrustTunnelCloudflaredConfig resource.
type ZeroTrustTunnelCloudflaredConfigArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Configuration block for Tunnel Configuration.
	Config ZeroTrustTunnelCloudflaredConfigConfigInput
	// Identifier of the Tunnel to target for this configuration.
	TunnelId pulumi.StringInput
}

func (ZeroTrustTunnelCloudflaredConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustTunnelCloudflaredConfigArgs)(nil)).Elem()
}

type ZeroTrustTunnelCloudflaredConfigInput interface {
	pulumi.Input

	ToZeroTrustTunnelCloudflaredConfigOutput() ZeroTrustTunnelCloudflaredConfigOutput
	ToZeroTrustTunnelCloudflaredConfigOutputWithContext(ctx context.Context) ZeroTrustTunnelCloudflaredConfigOutput
}

func (*ZeroTrustTunnelCloudflaredConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustTunnelCloudflaredConfig)(nil)).Elem()
}

func (i *ZeroTrustTunnelCloudflaredConfig) ToZeroTrustTunnelCloudflaredConfigOutput() ZeroTrustTunnelCloudflaredConfigOutput {
	return i.ToZeroTrustTunnelCloudflaredConfigOutputWithContext(context.Background())
}

func (i *ZeroTrustTunnelCloudflaredConfig) ToZeroTrustTunnelCloudflaredConfigOutputWithContext(ctx context.Context) ZeroTrustTunnelCloudflaredConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustTunnelCloudflaredConfigOutput)
}

// ZeroTrustTunnelCloudflaredConfigArrayInput is an input type that accepts ZeroTrustTunnelCloudflaredConfigArray and ZeroTrustTunnelCloudflaredConfigArrayOutput values.
// You can construct a concrete instance of `ZeroTrustTunnelCloudflaredConfigArrayInput` via:
//
//	ZeroTrustTunnelCloudflaredConfigArray{ ZeroTrustTunnelCloudflaredConfigArgs{...} }
type ZeroTrustTunnelCloudflaredConfigArrayInput interface {
	pulumi.Input

	ToZeroTrustTunnelCloudflaredConfigArrayOutput() ZeroTrustTunnelCloudflaredConfigArrayOutput
	ToZeroTrustTunnelCloudflaredConfigArrayOutputWithContext(context.Context) ZeroTrustTunnelCloudflaredConfigArrayOutput
}

type ZeroTrustTunnelCloudflaredConfigArray []ZeroTrustTunnelCloudflaredConfigInput

func (ZeroTrustTunnelCloudflaredConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustTunnelCloudflaredConfig)(nil)).Elem()
}

func (i ZeroTrustTunnelCloudflaredConfigArray) ToZeroTrustTunnelCloudflaredConfigArrayOutput() ZeroTrustTunnelCloudflaredConfigArrayOutput {
	return i.ToZeroTrustTunnelCloudflaredConfigArrayOutputWithContext(context.Background())
}

func (i ZeroTrustTunnelCloudflaredConfigArray) ToZeroTrustTunnelCloudflaredConfigArrayOutputWithContext(ctx context.Context) ZeroTrustTunnelCloudflaredConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustTunnelCloudflaredConfigArrayOutput)
}

// ZeroTrustTunnelCloudflaredConfigMapInput is an input type that accepts ZeroTrustTunnelCloudflaredConfigMap and ZeroTrustTunnelCloudflaredConfigMapOutput values.
// You can construct a concrete instance of `ZeroTrustTunnelCloudflaredConfigMapInput` via:
//
//	ZeroTrustTunnelCloudflaredConfigMap{ "key": ZeroTrustTunnelCloudflaredConfigArgs{...} }
type ZeroTrustTunnelCloudflaredConfigMapInput interface {
	pulumi.Input

	ToZeroTrustTunnelCloudflaredConfigMapOutput() ZeroTrustTunnelCloudflaredConfigMapOutput
	ToZeroTrustTunnelCloudflaredConfigMapOutputWithContext(context.Context) ZeroTrustTunnelCloudflaredConfigMapOutput
}

type ZeroTrustTunnelCloudflaredConfigMap map[string]ZeroTrustTunnelCloudflaredConfigInput

func (ZeroTrustTunnelCloudflaredConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustTunnelCloudflaredConfig)(nil)).Elem()
}

func (i ZeroTrustTunnelCloudflaredConfigMap) ToZeroTrustTunnelCloudflaredConfigMapOutput() ZeroTrustTunnelCloudflaredConfigMapOutput {
	return i.ToZeroTrustTunnelCloudflaredConfigMapOutputWithContext(context.Background())
}

func (i ZeroTrustTunnelCloudflaredConfigMap) ToZeroTrustTunnelCloudflaredConfigMapOutputWithContext(ctx context.Context) ZeroTrustTunnelCloudflaredConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustTunnelCloudflaredConfigMapOutput)
}

type ZeroTrustTunnelCloudflaredConfigOutput struct{ *pulumi.OutputState }

func (ZeroTrustTunnelCloudflaredConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustTunnelCloudflaredConfig)(nil)).Elem()
}

func (o ZeroTrustTunnelCloudflaredConfigOutput) ToZeroTrustTunnelCloudflaredConfigOutput() ZeroTrustTunnelCloudflaredConfigOutput {
	return o
}

func (o ZeroTrustTunnelCloudflaredConfigOutput) ToZeroTrustTunnelCloudflaredConfigOutputWithContext(ctx context.Context) ZeroTrustTunnelCloudflaredConfigOutput {
	return o
}

// The account identifier to target for the resource.
func (o ZeroTrustTunnelCloudflaredConfigOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustTunnelCloudflaredConfig) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Configuration block for Tunnel Configuration.
func (o ZeroTrustTunnelCloudflaredConfigOutput) Config() ZeroTrustTunnelCloudflaredConfigConfigOutput {
	return o.ApplyT(func(v *ZeroTrustTunnelCloudflaredConfig) ZeroTrustTunnelCloudflaredConfigConfigOutput {
		return v.Config
	}).(ZeroTrustTunnelCloudflaredConfigConfigOutput)
}

// Identifier of the Tunnel to target for this configuration.
func (o ZeroTrustTunnelCloudflaredConfigOutput) TunnelId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustTunnelCloudflaredConfig) pulumi.StringOutput { return v.TunnelId }).(pulumi.StringOutput)
}

type ZeroTrustTunnelCloudflaredConfigArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustTunnelCloudflaredConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustTunnelCloudflaredConfig)(nil)).Elem()
}

func (o ZeroTrustTunnelCloudflaredConfigArrayOutput) ToZeroTrustTunnelCloudflaredConfigArrayOutput() ZeroTrustTunnelCloudflaredConfigArrayOutput {
	return o
}

func (o ZeroTrustTunnelCloudflaredConfigArrayOutput) ToZeroTrustTunnelCloudflaredConfigArrayOutputWithContext(ctx context.Context) ZeroTrustTunnelCloudflaredConfigArrayOutput {
	return o
}

func (o ZeroTrustTunnelCloudflaredConfigArrayOutput) Index(i pulumi.IntInput) ZeroTrustTunnelCloudflaredConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustTunnelCloudflaredConfig {
		return vs[0].([]*ZeroTrustTunnelCloudflaredConfig)[vs[1].(int)]
	}).(ZeroTrustTunnelCloudflaredConfigOutput)
}

type ZeroTrustTunnelCloudflaredConfigMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustTunnelCloudflaredConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustTunnelCloudflaredConfig)(nil)).Elem()
}

func (o ZeroTrustTunnelCloudflaredConfigMapOutput) ToZeroTrustTunnelCloudflaredConfigMapOutput() ZeroTrustTunnelCloudflaredConfigMapOutput {
	return o
}

func (o ZeroTrustTunnelCloudflaredConfigMapOutput) ToZeroTrustTunnelCloudflaredConfigMapOutputWithContext(ctx context.Context) ZeroTrustTunnelCloudflaredConfigMapOutput {
	return o
}

func (o ZeroTrustTunnelCloudflaredConfigMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustTunnelCloudflaredConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustTunnelCloudflaredConfig {
		return vs[0].(map[string]*ZeroTrustTunnelCloudflaredConfig)[vs[1].(string)]
	}).(ZeroTrustTunnelCloudflaredConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustTunnelCloudflaredConfigInput)(nil)).Elem(), &ZeroTrustTunnelCloudflaredConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustTunnelCloudflaredConfigArrayInput)(nil)).Elem(), ZeroTrustTunnelCloudflaredConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustTunnelCloudflaredConfigMapInput)(nil)).Elem(), ZeroTrustTunnelCloudflaredConfigMap{})
	pulumi.RegisterOutputType(ZeroTrustTunnelCloudflaredConfigOutput{})
	pulumi.RegisterOutputType(ZeroTrustTunnelCloudflaredConfigArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustTunnelCloudflaredConfigMapOutput{})
}
