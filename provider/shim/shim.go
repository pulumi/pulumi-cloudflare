package shim

import (
	provider "github.com/cloudflare/terraform-provider-cloudflare/internal/sdkv2provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
)

func NewProvider() *schema.Provider {
	return provider.New("")()
}
