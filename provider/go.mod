module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.9.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.0.0
	github.com/pulumi/pulumi/sdk/v2 v2.0.0
	github.com/terraform-providers/terraform-provider-cloudflare v1.18.2-0.20200422122608-92da0805378d
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
