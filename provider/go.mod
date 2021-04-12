module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.16

require (
	github.com/cloudflare/terraform-provider-cloudflare v1.18.2-0.20210314203411-171cd8e62b8c
	github.com/hashicorp/terraform-plugin-sdk v1.16.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.23.0
	github.com/pulumi/pulumi/sdk/v2 v2.24.1
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
)
