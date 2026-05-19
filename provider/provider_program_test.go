//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package cloudflare

import (
	"context"
	"encoding/json"
	"fmt"
	"os"
	"strings"
	"testing"

	_ "embed"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/providers"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/optnewstack"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optrefresh"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optup"
	"github.com/pulumi/pulumi/sdk/v3/go/common/apitype"
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
	if os.Getenv("CLOUDFLARE_ACCOUNT_ID") == "" {
		t.Skip("CLOUDFLARE_ACCOUNT_ID not set; recorded state baked-in IDs won't match the empty config " +
			"and produce confusing replace diffs")
	}

	rpFactory := providers.ResourceProviderFactory(providerFactory)
	opts = append(opts, opttest.AttachProvider(providerName, rpFactory))
	pt := pulumitest.NewPulumiTest(t, dir, opts...)
	pt.SetConfig(t, "cloudflare-account-id", os.Getenv("CLOUDFLARE_ACCOUNT_ID"))
	pt.SetConfig(t, "cloudflare-zone-id", os.Getenv("CLOUDFLARE_ZONE_ID"))
	domain := os.Getenv("CLOUDFLARE_DOMAIN")
	if domain == "" {
		domain = "pulumi-cloudflare-demo.com"
	}
	pt.SetConfig(t, "cloudflare-domain", domain)

	return pt
}

func testProgramNoCloudflareConfig(t *testing.T, dir string, opts ...opttest.Option) *pulumitest.PulumiTest {
	rpFactory := providers.ResourceProviderFactory(providerFactory)
	opts = append(opts, opttest.AttachProvider(providerName, rpFactory), opttest.SkipInstall())
	return pulumitest.NewPulumiTest(t, dir, opts...)
}

func pulumiCommandEnv(pt *pulumitest.PulumiTest) []string {
	workspace := pt.CurrentStack().Workspace()
	env := []string{"PULUMI_DEBUG_COMMANDS=true"}
	if pulumiHome := workspace.PulumiHome(); pulumiHome != "" {
		env = append(env, "PULUMI_HOME="+pulumiHome)
	}
	for k, v := range workspace.GetEnvVars() {
		env = append(env, strings.Join([]string{k, v}, "="))
	}
	return env
}

func importStackWithDisabledIntegrity(t *testing.T, pt *pulumitest.PulumiTest, source apitype.UntypedDeployment) {
	t.Helper()
	stack := pt.CurrentStack()
	require.NotNil(t, stack)

	f, err := os.CreateTemp(t.TempDir(), "stack-*.json")
	require.NoError(t, err)
	defer func() { require.NoError(t, f.Close()) }()

	require.NoError(t, json.NewEncoder(f).Encode(source))

	workspace := stack.Workspace()
	stdout, stderr, _, err := workspace.PulumiCommand().Run(
		pt.Context(),
		workspace.WorkDir(),
		nil,
		nil,
		nil,
		pulumiCommandEnv(pt),
		"--disable-integrity-checking",
		"stack",
		"import",
		"--file",
		f.Name(),
		"--stack",
		stack.Name(),
	)
	require.NoError(t, err, fmt.Sprintf("stdout:\n%s\nstderr:\n%s", stdout, stderr))
}

func previewWithDisabledIntegrity(t *testing.T, pt *pulumitest.PulumiTest) (string, string, error) {
	t.Helper()
	stack := pt.CurrentStack()
	require.NotNil(t, stack)

	workspace := stack.Workspace()
	stdout, stderr, _, err := workspace.PulumiCommand().Run(
		pt.Context(),
		workspace.WorkDir(),
		nil,
		nil,
		nil,
		pulumiCommandEnv(pt),
		"--disable-integrity-checking",
		"preview",
		"--non-interactive",
		"--diff",
		"--stack",
		stack.Name(),
	)
	return stdout, stderr, err
}

func withArgoTieredCachingSchemaVersion(
	t *testing.T, source apitype.UntypedDeployment, version string,
) apitype.UntypedDeployment {
	t.Helper()
	var deployment map[string]interface{}
	require.NoError(t, json.Unmarshal(source.Deployment, &deployment))
	resources, ok := deployment["resources"].([]interface{})
	require.True(t, ok)
	found := false
	for _, rawResource := range resources {
		res, ok := rawResource.(map[string]interface{})
		require.True(t, ok)
		if res["type"] != "cloudflare:index/argoTieredCaching:ArgoTieredCaching" {
			continue
		}
		found = true
		outputs, ok := res["outputs"].(map[string]interface{})
		require.True(t, ok)
		outputs["__meta"] = fmt.Sprintf(`{"schema_version":"%s"}`, version)
		break
	}
	require.True(t, found, "did not find ArgoTieredCaching resource in test state")
	updatedDeployment, err := json.Marshal(deployment)
	require.NoError(t, err)
	source.Deployment = updatedDeployment
	return source
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

func TestRuleSetUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/ruleset/ruleset_v5")
}

func TestListUpgrade(t *testing.T) {
	testUpgrade(
		t, "test-programs/list/listv5", optproviderupgrade.NewSourcePath("test-programs/list"))
}

func TestZeroTrustAccessApplicationUpgrade(t *testing.T) {
	testUpgrade(
		t, "test-programs/zero_trust_access_application/zero_trust_access_application_v5",
		optproviderupgrade.NewSourcePath("test-programs/zero_trust_access_application"))
}

// Exercises the populated-array migration branches against a hand-crafted v5 state:
// corsHeaders [{...}] → object, and policies ["id"] → [{id}]. The recorded
// TestZeroTrustAccessApplicationUpgrade only covers the default-empty case.
func TestZeroTrustAccessApplicationFromState(t *testing.T) {
	state, err := os.ReadFile("testdata/zta_app_state_v5_self_hosted.json")
	require.NoError(t, err)
	depl := apitype.UntypedDeployment{}
	require.NoError(t, json.Unmarshal(state, &depl))
	pt := testProgram(t, "test-programs/zero_trust_access_application_state",
		opttest.NewStackOptions(optnewstack.DisableAutoDestroy()))
	pt.ImportStack(t, depl)
	pt.Preview(t)
}

func TestArgoTieredCachingFromV612State(t *testing.T) {
	state, err := os.ReadFile("testdata/argo_tiered_caching_state_v6_12.json")
	require.NoError(t, err)
	depl := apitype.UntypedDeployment{}
	require.NoError(t, json.Unmarshal(state, &depl))

	t.Run("direct upgrade skips legacy argo migration for Pulumi state", func(t *testing.T) {
		pt := testProgramNoCloudflareConfig(t, "test-programs/argo_tiered_caching_state",
			opttest.NewStackOptions(optnewstack.DisableAutoDestroy()))
		importStackWithDisabledIntegrity(t, pt, depl)
		stdout, stderr, err := previewWithDisabledIntegrity(t, pt)
		require.NoError(t, err, fmt.Sprintf("stdout:\n%s\nstderr:\n%s", stdout, stderr))
	})

	t.Run("schema version bump avoids legacy argo migration", func(t *testing.T) {
		pt := testProgramNoCloudflareConfig(t, "test-programs/argo_tiered_caching_state",
			opttest.NewStackOptions(optnewstack.DisableAutoDestroy()))
		importStackWithDisabledIntegrity(t, pt, withArgoTieredCachingSchemaVersion(t, depl, "500"))
		stdout, stderr, err := previewWithDisabledIntegrity(t, pt)
		require.NoError(t, err, fmt.Sprintf("stdout:\n%s\nstderr:\n%s", stdout, stderr))
	})
}

func TestRuleSetHeadersUpgrade(t *testing.T) {
	testUpgrade(
		t, "test-programs/ruleset_headers/ruleset_headers_v5",
		optproviderupgrade.NewSourcePath("test-programs/ruleset_headers"))
}

func TestAccRecordGo(t *testing.T) {
	pt := testProgram(t, "test-programs/recordgo",
		opttest.TestInPlace(), /* to use the parent directory's module */
		opttest.SkipInstall(), /* https://github.com/pulumi/pulumi/issues/21086 */
	)
	pt.Up(t)
	pt.Refresh(t, optrefresh.ExpectNoChanges(), optrefresh.Diff())
	pt.Up(t, optup.ExpectNoChanges())
}

// Regression test for [pulumi/pulumi-cloudflare#1180]
func TestIssue1180(t *testing.T) {
	pt := testProgram(t, "test-programs/issue_1180")
	pt.Up(t)
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

// Regression test for [pulumi/pulumi-cloudflare#1213]
func TestRuleSetNonEmptyRulesUpgrade(t *testing.T) {
	for _, stateFile := range []string{
		"testdata/ruleset_state_v6.json",
		"testdata/ruleset_state_v5.json",
		"testdata/ruleset_state_v4.json",
	} {
		t.Run(stateFile, func(t *testing.T) {
			state, err := os.ReadFile(stateFile)
			require.NoError(t, err)
			depl := apitype.UntypedDeployment{}
			err = json.Unmarshal(state, &depl)
			require.NoError(t, err)
			pt := testProgram(t, "test-programs/ruleset_non_empty_rules",
				opttest.NewStackOptions(optnewstack.DisableAutoDestroy()))
			pt.ImportStack(t, depl)
			pt.Preview(t)
		})
	}
}
