module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.14

require (
	github.com/cloudflare/terraform-provider-cloudflare v1.18.2-0.20200910212636-a8dcf713cfbe
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.7.3
	github.com/pulumi/pulumi/sdk/v2 v2.9.1-0.20200825190708-910aa96016cd
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
