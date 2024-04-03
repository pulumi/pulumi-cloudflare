package cloudflare

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const providerName = "cloudflare"

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	test.Up()
}

func TestPrograms(t *testing.T) {
	programs := []string{
		"test-programs/cloudflare_record",
		"test-programs/cloudflare_zone",
		"test-programs/cloudflare_zonesettingsoverride",
		"test-programs/cloudflare_pagerule",
		"test-programs/cloudflare_workerscript",
		"test-programs/cloudflare_workerroute",
		"test-programs/cloudflare_ruleset",
		"test-programs/cloudflare_accessapplication",
		"test-programs/cloudflare_pagesproject",
		"test-programs/cloudflare_accesspolicy",
	}
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}
