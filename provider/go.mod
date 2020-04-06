module github.com/pulumi/pulumi-cloudflare/provider

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.9.0
	github.com/pulumi/pulumi-terraform-bridge v1.8.4
	github.com/pulumi/pulumi/sdk v1.13.1
	github.com/terraform-providers/terraform-provider-cloudflare v1.18.2-0.20200327152548-937194c105f7
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
