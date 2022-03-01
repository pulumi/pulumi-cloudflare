module github.com/pulumi/pulumi-cloudflare/provider/v4

go 1.16

require (
	cloud.google.com/go/kms v1.1.0 // indirect
	github.com/cloudflare/terraform-provider-cloudflare v1.18.2-0.20220214194149-7d2db24318d2
	github.com/hashicorp/terraform-plugin-sdk v1.17.2 // indirect
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.19.1
	github.com/pulumi/pulumi/sdk/v3 v3.25.0
)

replace (
	cloud.google.com/go/storage => cloud.google.com/go/storage v1.16.1
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20211019194827-62530c6537a4
	google.golang.org/genproto => google.golang.org/genproto v0.0.0-20210831024726-fe130286e0e2
)
