// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccRecord(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "record"),
		})

	integration.ProgramTest(t, &test)
}

func getZoneId(t *testing.T) string {
	zoneId := os.Getenv("CLOUDFLARE_ZONE_ID")
	if zoneId == "" {
		t.Skipf("Skipping test due to missing CLOUDFLARE_ZONE_ID environment variable")
	}

	return zoneId
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{}
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	zoneId := getZoneId(t)
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Config: map[string]string{
			"zone_id": zoneId,
		},
		Dependencies: []string{
			"@pulumi/cloudflare",
		},
	})

	return baseJS
}
