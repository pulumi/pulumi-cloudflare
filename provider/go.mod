module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.13.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.3.3
	github.com/pulumi/pulumi/pkg/v2 v2.2.1 // indirect
	github.com/pulumi/pulumi/sdk/v2 v2.2.1
	github.com/terraform-providers/terraform-provider-cloudflare v1.18.2-0.20200520193353-7dbdc13b06b6
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
