module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.14

require (
	github.com/cloudflare/terraform-provider-cloudflare v1.18.2-0.20200910212636-a8dcf713cfbe
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.11.1-0.20201020163502-64cff1e50894
	github.com/pulumi/pulumi/sdk/v2 v2.12.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
)
