package shim

import (
	"github.com/cloudflare/terraform-provider-cloudflare/internal/provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
)

func NewProvider() *schema.Provider {
	return provider.New("")()
}
