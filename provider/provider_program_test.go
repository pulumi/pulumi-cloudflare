//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package cloudflare

import (
	"context"
	_ "embed"
	"os"
	"testing"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/providers"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi-cloudflare/provider/v6/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	"github.com/pulumi/pulumi/sdk/v3/go/common/diag"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

const (
	providerName           = "cloudflare"
	defaultBaselineVersion = "5.49.0"
)

type discardSink struct{}

func (s discardSink) Log(context.Context, diag.Severity, resource.URN, string) error {
	return nil
}

func (s discardSink) LogStatus(context.Context, diag.Severity, resource.URN, string) error {
	return nil
}

//go:embed cmd/pulumi-resource-cloudflare/schema-embed.json
var pulumiSchema []byte

func providerFactory[T any](T) (pulumirpc.ResourceProviderServer, error) {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := Provider()

	sink := discardSink{}

	return tfbridge.NewProviderServer(
		ctx, sink, info, tfbridge.ProviderMetadata{
			PackageSchema: pulumiSchema,
		})
}

func testUpgrade(
	t *testing.T, dir1 string, opts ...optproviderupgrade.PreviewProviderUpgradeOpt,
) auto.PreviewResult {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}

	// Provider factory allows the tests to run against an in-process provider.
	rpFactory := providers.ResourceProviderFactory(providerFactory)
	pt := pulumitest.NewPulumiTest(t, dir1,
		opttest.AttachProvider(providerName, rpFactory))
	pt.SetConfig(t, "cloudflare-account-id", os.Getenv("CLOUDFLARE_ACCOUNT_ID"))
	pt.SetConfig(t, "cloudflare-zone-id", os.Getenv("CLOUDFLARE_ZONE_ID"))

	upgradeOpts := []optproviderupgrade.PreviewProviderUpgradeOpt{
		optproviderupgrade.DisableAttach(),
	}
	upgradeOpts = append(upgradeOpts, opts...)
	previewResult := providertest.PreviewProviderUpgrade(t, pt, providerName, defaultBaselineVersion, upgradeOpts...)

	assertpreview.HasNoReplacements(t, previewResult)
	assertpreview.HasNoDeletes(t, previewResult)
	return previewResult
}

func TestZoneUpgrade(t *testing.T) {
	t.Skip("TODO: not working")
	testUpgrade(
		t, "test-programs/zone/zonev5", optproviderupgrade.NewSourcePath("test-programs/zone"))
}

func TestWorkerScriptUpgrade(t *testing.T) {
	t.Skip("TODO")
	testUpgrade(t, "test-programs/index_workerscript")
}

func TestWorkerKVNamespaceUpgrade(t *testing.T) {
	t.Skip("TODO")
	testUpgrade(t, "test-programs/index_workerskvnamespace")
}

func TestRecordUpgrade(t *testing.T) {
	res := testUpgrade(t, "test-programs/record")
	assertpreview.HasNoChanges(t, res)
}

func TestRulesetUpgrade(t *testing.T) {
	res := testUpgrade(t, "test-programs/ruleset")
	assertpreview.HasNoChanges(t, res)
}