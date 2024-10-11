//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package cloudflare

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const (
	providerName           = "cloudflare"
	defaultBaselineVersion = "5.25.0"
)

var programs = []string{
	"test-programs/index_workerscript",
	"test-programs/index_workerskvnamespace",
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

type UpgradeTestOpts struct {
	config map[string]string
}

func WithConfig(config map[string]string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.config = config
	}
}

func testProviderUpgrade(t *testing.T, dir string, opts ...func(*UpgradeTestOpts)) {
	options := &UpgradeTestOpts{}
	for _, o := range opts {
		o(options)
	}
	testProviderUpgradeWithOpts(t, dir, options.config)
}

func testProviderUpgradeWithOpts(
	t *testing.T, dir string, config map[string]string,
) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, defaultBaselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	for k, v := range config {
		test.SetConfig(t, k, v)
	}
	result := providertest.PreviewProviderUpgrade(t, test, providerName, defaultBaselineVersion,
		optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
}

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	test.SetConfig(t, "cloudflare-account-id", os.Getenv("CLOUDFLARE_ACCOUNT_ID"))
	test.SetConfig(t, "cloudflare-zone-id", os.Getenv("CLOUDFLARE_ZONE_ID"))
	test.Up(t)
}

func TestPrograms(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}

func TestProgramsUpgrade(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProviderUpgrade(t, p, WithConfig(map[string]string{
				"cloudflare-account-id": os.Getenv("CLOUDFLARE_ACCOUNT_ID"),
				"cloudflare-zone-id":    os.Getenv("CLOUDFLARE_ZONE_ID"),
			}))
		})
	}
}
