module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.14

require (
	github.com/cloudflare/terraform-provider-cloudflare v1.18.2-0.20210105202055-72a66e3cab68
	github.com/hashicorp/terraform-plugin-sdk v1.16.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.18.1
	github.com/pulumi/pulumi/sdk/v2 v2.18.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
)
