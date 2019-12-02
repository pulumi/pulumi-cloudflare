module github.com/pulumi/pulumi-cloudflare

go 1.12

require (
	github.com/hashicorp/terraform-plugin-sdk v1.3.0
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.6.0
	github.com/pulumi/pulumi-terraform-bridge v1.4.3
	github.com/terraform-providers/terraform-provider-cloudflare v0.0.0-20191107185556-57bba0ad6882
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
