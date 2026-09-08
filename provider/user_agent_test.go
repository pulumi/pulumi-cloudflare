package cloudflare

import (
	"context"
	"fmt"
	"net/http"
	"net/http/httptest"
	"os"
	"strings"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"google.golang.org/protobuf/types/known/structpb"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	"github.com/pulumi/pulumi/sdk/v3/go/common/diag"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-cloudflare/provider/v6/pkg/version"
)

// userAgentOperatorSuffixKey is the Pulumi name of upstream's user_agent_operator_suffix.
const userAgentOperatorSuffixKey = resource.PropertyKey("userAgentOperatorSuffix")

const (
	testVersion      = "6.0.0"
	testPulumiSuffix = "pulumi/" + testVersion
)

func TestUserAgentOperatorSuffixDefault(t *testing.T) {
	version.Version = testVersion

	tests := []struct {
		name   string
		env    *string // nil means the env var is unset
		expect *string // nil means no default is computed
	}{
		{
			name:   "defaults to the Pulumi identifier",
			expect: ref(testPulumiSuffix),
		},
		{
			name:   "the environment variable overrides it",
			env:    ref("from-env/2.0"),
			expect: ref("from-env/2.0"),
		},
		{
			name: "an empty environment variable opts out",
			env:  ref(""),
		},
	}

	for _, tt := range tests {
		// No t.Parallel: these mutate package-level state and the environment.
		t.Run(tt.name, func(t *testing.T) {
			if tt.env != nil {
				t.Setenv(userAgentOperatorSuffixEnvVar, *tt.env)
			} else {
				unsetUserAgentEnv(t)
			}

			actual, err := pulumiUserAgentOperatorSuffix(context.Background(), info.ComputeDefaultOptions{})
			require.NoError(t, err)

			if tt.expect == nil {
				assert.Nil(t, actual)
				return
			}
			assert.Equal(t, *tt.expect, actual)
		})
	}
}

func TestCheckConfigDefaultsUserAgentOperatorSuffix(t *testing.T) {
	tests := []struct {
		name   string
		config resource.PropertyMap
		expect string
	}{
		{
			name:   "applies the default when the property is unset",
			config: resource.PropertyMap{},
			expect: testPulumiSuffix,
		},
		{
			name:   "leaves an explicit value alone",
			config: resource.PropertyMap{userAgentOperatorSuffixKey: resource.NewStringProperty("mycorp/1.0")},
			expect: "mycorp/1.0",
		},
		{
			// The empty string reaches upstream, where our patch treats it as unset. See
			// TestUserAgentHeader for what that produces on the wire.
			name:   "leaves an explicitly empty value alone",
			config: resource.PropertyMap{userAgentOperatorSuffixKey: resource.NewStringProperty("")},
			expect: "",
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			unsetUserAgentEnv(t)
			ctx := context.Background()

			inputs := checkUserAgentConfig(ctx, t, newUserAgentTestServer(t), tt.config)

			require.Contains(t, inputs, userAgentOperatorSuffixKey)
			assert.Equal(t, tt.expect, inputs[userAgentOperatorSuffixKey].StringValue())
		})
	}
}

// TestUserAgentHeader asserts what actually goes out on the wire to the Cloudflare API.
func TestUserAgentHeader(t *testing.T) {
	tests := []struct {
		name   string
		config resource.PropertyMap
		assert func(t *testing.T, userAgent string)
	}{
		{
			name: "identifies Pulumi by default",
			assert: func(t *testing.T, userAgent string) {
				assert.True(t, strings.HasSuffix(userAgent, " "+testPulumiSuffix),
					"expected %q to end with the Pulumi identifier", userAgent)
				// Upstream drops the terraform/<version> token once an operator suffix is set.
				assert.NotContains(t, userAgent, "terraform/1.0.0")
			},
		},
		{
			name:   "honors an explicit suffix",
			config: resource.PropertyMap{userAgentOperatorSuffixKey: resource.NewStringProperty("mycorp/1.0")},
			assert: func(t *testing.T, userAgent string) {
				assert.True(t, strings.HasSuffix(userAgent, " mycorp/1.0"),
					"expected %q to end with the custom identifier", userAgent)
			},
		},
		{
			name:   "an empty suffix opts back out",
			config: resource.PropertyMap{userAgentOperatorSuffixKey: resource.NewStringProperty("")},
			assert: func(t *testing.T, userAgent string) {
				assert.True(t, strings.HasSuffix(userAgent, " terraform/1.0.0+pulumi-terraform-bridge"),
					"expected %q to fall back to the upstream default", userAgent)
				assert.NotContains(t, userAgent, testPulumiSuffix)
			},
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			unsetUserAgentEnv(t)
			ctx := context.Background()

			var userAgent string
			api := httptest.NewServer(http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
				userAgent = r.Header.Get("User-Agent")
				w.Header().Set("Content-Type", "application/json")
				fmt.Fprint(w, `{"success":true,"errors":[],"messages":[],"result":[]}`)
			}))
			defer api.Close()

			config := resource.PropertyMap{
				"baseUrl": resource.NewStringProperty(api.URL),
				// Upstream validates the token against ^[0-9A-Za-z\-_]{40,80}$.
				"apiToken": resource.NewStringProperty(strings.Repeat("a", 40)),
			}
			for k, v := range tt.config {
				config[k] = v
			}

			srv := newUserAgentTestServer(t)
			checked := checkUserAgentConfig(ctx, t, srv, config)

			_, err := srv.Configure(ctx, &pulumirpc.ConfigureRequest{Args: mustMarshalProperties(t, checked)})
			require.NoError(t, err)

			// getAccounts has no required inputs, so it is the cheapest way to force a single
			// request through the configured client. We do not care whether our stub response
			// decodes cleanly, only what went out on the wire.
			_, _ = srv.Invoke(ctx, &pulumirpc.InvokeRequest{
				Tok:  "cloudflare:index/getAccounts:getAccounts",
				Args: mustMarshalProperties(t, resource.PropertyMap{}),
			})

			require.NotEmpty(t, userAgent, "the provider never called the API")
			t.Logf("User-Agent: %s", userAgent)
			assert.True(t, strings.HasPrefix(userAgent, "terraform-provider-cloudflare/"),
				"expected %q to keep the upstream provider token", userAgent)
			// Regression guard: upstream formats the suffix with %q without our patch.
			assert.NotContains(t, userAgent, `"`)
			tt.assert(t, userAgent)
		})
	}
}

// unsetUserAgentEnv keeps a developer's shell from perturbing these tests. t.Setenv registers the
// cleanup that restores the original value.
func unsetUserAgentEnv(t *testing.T) {
	t.Helper()
	t.Setenv(userAgentOperatorSuffixEnvVar, "")
	require.NoError(t, os.Unsetenv(userAgentOperatorSuffixEnvVar))
}

type userAgentTestSink struct{}

func (userAgentTestSink) Log(context.Context, diag.Severity, resource.URN, string) error { return nil }

func (userAgentTestSink) LogStatus(context.Context, diag.Severity, resource.URN, string) error {
	return nil
}

func newUserAgentTestServer(t *testing.T) pulumirpc.ResourceProviderServer {
	t.Helper()
	version.Version = testVersion
	// The schema is never parsed here, but NewProviderServer requires exactly one of PackageSchema
	// and XGetSchema to be set.
	srv, err := pfbridge.NewProviderServer(context.Background(), userAgentTestSink{}, Provider(),
		pfbridge.ProviderMetadata{PackageSchema: []byte("{}")})
	require.NoError(t, err)
	return srv
}

func checkUserAgentConfig(
	ctx context.Context, t *testing.T, srv pulumirpc.ResourceProviderServer, config resource.PropertyMap,
) resource.PropertyMap {
	t.Helper()
	resp, err := srv.CheckConfig(ctx, &pulumirpc.CheckRequest{
		Urn:  "urn:pulumi:dev::test::pulumi:providers:cloudflare::p",
		News: mustMarshalProperties(t, config),
	})
	require.NoError(t, err)
	require.Empty(t, resp.GetFailures())

	inputs, err := plugin.UnmarshalProperties(resp.GetInputs(), plugin.MarshalOptions{})
	require.NoError(t, err)
	return inputs
}

func mustMarshalProperties(t *testing.T, props resource.PropertyMap) *structpb.Struct {
	t.Helper()
	s, err := plugin.MarshalProperties(props, plugin.MarshalOptions{})
	require.NoError(t, err)
	return s
}
