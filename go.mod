module github.com/pulumi/pulumi-cloudflare

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pkg/errors v0.9.1
	github.com/pulumi/pulumi v1.9.1
	github.com/pulumi/pulumi-terraform-bridge v1.6.5
	github.com/terraform-providers/terraform-provider-cloudflare v1.18.2-0.20200309220422-40be08050534
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
