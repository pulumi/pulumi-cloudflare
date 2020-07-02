module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.14.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.5.3
	github.com/pulumi/pulumi/sdk/v2 v2.5.1-0.20200701223250-45d2fa95d60b
	github.com/terraform-providers/terraform-provider-cloudflare v1.18.2-0.20200622173352-7eca3ce8ae92
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
