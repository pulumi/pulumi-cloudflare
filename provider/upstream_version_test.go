package cloudflare

import (
	"encoding/json"
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	provShim "github.com/cloudflare/terraform-provider-cloudflare/shim"
)

func TestShimUpstreamVersionMatchesSubmodule(t *testing.T) {
	t.Parallel()

	raw, err := os.ReadFile(filepath.Join("..", "upstream", ".release-please-manifest.json"))
	require.NoError(t, err, "reading the upstream release manifest; run `make upstream` first")

	var manifest map[string]string
	require.NoError(t, json.Unmarshal(raw, &manifest))
	submoduleVersion := manifest["."]
	require.NotEmpty(t, submoduleVersion, "upstream release manifest has no version for \".\"")

	require.Equal(t, submoduleVersion, provShim.UpstreamVersion,
		"UpstreamVersion in patches/0001-expose-providers.patch is stale: "+
			"update it to the upstream submodule's release version")
}
