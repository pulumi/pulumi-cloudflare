module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.16

require (
	github.com/cloudflare/terraform-provider-cloudflare v1.18.2-0.20210310224832-c97989b11d33
	github.com/hashicorp/terraform-plugin-sdk v1.16.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.21.0
	github.com/pulumi/pulumi/sdk/v2 v2.22.1-0.20210310211618-1f16423ede4c
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
)
