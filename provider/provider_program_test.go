//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package cloudflare

import (
	"context"
	"os"
	"testing"

	_ "embed"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/providers"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optrefresh"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optup"
	"github.com/pulumi/pulumi/sdk/v3/go/common/diag"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-cloudflare/provider/v6/pkg/version"
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

// Use the non-embedded schema to avoid having to run generation before running the tests.
//
//go:embed cmd/pulumi-resource-cloudflare/schema.json
var schemaBytes []byte

func providerFactory[T any](T) (pulumirpc.ResourceProviderServer, error) {
	ctx := context.Background()
	version.Version = "6.0.0"
	info := Provider()

	sink := discardSink{}

	return tfbridge.NewProviderServer(
		ctx, sink, info, tfbridge.ProviderMetadata{
			PackageSchema: schemaBytes,
		})
}

func testProgram(t *testing.T, dir string, opts ...opttest.Option) *pulumitest.PulumiTest {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}

	rpFactory := providers.ResourceProviderFactory(providerFactory)
	opts = append(opts, opttest.AttachProvider(providerName, rpFactory))
	pt := pulumitest.NewPulumiTest(t, dir, opts...)
	pt.SetConfig(t, "cloudflare-account-id", os.Getenv("CLOUDFLARE_ACCOUNT_ID"))
	pt.SetConfig(t, "cloudflare-zone-id", os.Getenv("CLOUDFLARE_ZONE_ID"))
	pt.SetConfig(t, "cloudflare-domain", "pulumi-cloudflare-demo.com")

	return pt
}

func testUpgrade(
	t *testing.T, dir1 string, opts ...optproviderupgrade.PreviewProviderUpgradeOpt,
) auto.PreviewResult {
	pt := testProgram(t, dir1)
	previewResult := providertest.PreviewProviderUpgrade(t, pt, providerName, defaultBaselineVersion, opts...)

	assertpreview.HasNoReplacements(t, previewResult)
	assertpreview.HasNoDeletes(t, previewResult)
	return previewResult
}

func TestZoneUpgrade(t *testing.T) {
	testUpgrade(
		t, "test-programs/zone/zonev5", optproviderupgrade.NewSourcePath("test-programs/zone"))
}

func TestWorkerKVNamespaceUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/index_workerskvnamespace")
}

func TestRecordUpgrade(t *testing.T) {
	testUpgrade(
		t, "test-programs/record/recordv5", optproviderupgrade.NewSourcePath("test-programs/record"))
}

func TestPageRuleUpgrade(t *testing.T) {
	testUpgrade(
		t, "test-programs/page_rule/page_rulev5", optproviderupgrade.NewSourcePath("test-programs/page_rule"))
}

func TestAccessPolicyUpgrade(t *testing.T) {
	testUpgrade(
		t, "test-programs/access_policy/access_policyv5", optproviderupgrade.NewSourcePath("test-programs/access_policy"))
}

func TestAccRecordGo(t *testing.T) {
	pt := testProgram(t, "test-programs/recordgo",
		opttest.GoModReplacement("github.com/pulumi/pulumi-cloudflare/sdk/v6", "..", "sdk"))
	pt.Up(t)
	pt.Refresh(t, optrefresh.ExpectNoChanges(), optrefresh.Diff())
	pt.Up(t, optup.ExpectNoChanges())
}

func TestWorkersRoute(t *testing.T) {
	// TODO[pulumi/pulumi-cloudflare#1130]: Destroy does not work on this resource
	t.Skip()
	pt := testProgram(t, "test-programs/workers_route")
	pt.Up(t)
}

func TestZoneSettings(t *testing.T) {
	pt := testProgram(t, "test-programs/zonesettings")
	pt.Up(t)
}
