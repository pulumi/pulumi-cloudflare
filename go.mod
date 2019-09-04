module github.com/pulumi/pulumi-cloudflare

go 1.12

require (
	github.com/hashicorp/terraform v0.12.6
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.0.0
	github.com/pulumi/pulumi-terraform v0.18.4-0.20190828172748-3f206601e7a1
	github.com/terraform-providers/terraform-provider-cloudflare v1.17.1
)

replace (
	git.apache.org/thrift.git => github.com/apache/thrift v0.12.0
	github.com/Azure/azure-sdk-for-go => github.com/Azure/azure-sdk-for-go v31.1.0+incompatible
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
