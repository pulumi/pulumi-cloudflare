module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.9.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.0.0-beta.1
	github.com/pulumi/pulumi/sdk/v2 v2.0.0-beta.3
	github.com/terraform-providers/terraform-provider-cloudflare v1.18.2-0.20200403131619-5f93a72b2e09
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
