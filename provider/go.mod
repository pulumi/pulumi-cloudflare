module github.com/pulumi/pulumi-cloudflare/provider/v3

go 1.16

require (
	github.com/cloudflare/terraform-provider-cloudflare v1.18.2-0.20210415001236-a117eb773c30
	github.com/hashicorp/terraform-plugin-sdk v1.16.1
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
)

replace github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
