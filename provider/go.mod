module github.com/pulumi/pulumi-cloudflare/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.9.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.3.1
	github.com/pulumi/pulumi/pkg/v2 v2.1.1-0.20200508232528-aa313aecf8a0 // indirect
	github.com/pulumi/pulumi/sdk/v2 v2.1.1-0.20200508232528-aa313aecf8a0
	github.com/terraform-providers/terraform-provider-cloudflare v1.18.2-0.20200422122608-92da0805378d
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
