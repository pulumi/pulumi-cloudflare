// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"github.com/stretchr/testify/assert"
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestExamples(t *testing.T) {
	token := os.Getenv("CLOUDFLARE_API_TOKEN")
	if token == "" {
		t.Skipf("Skipping test due to missing CLOUDFLARE_API_TOKEN variable")
	}
	email := os.Getenv("CLOUDFLARE_EMAIL")
	if email == "" {
		t.Skipf("Skipping test due to missing CLOUDFLARE_EMAIL variable")
	}
	account := os.Getenv("CLOUDFLARE_ACCOUNT_ID")
	if account == "" {
		t.Skipf("Skipping test due to missing CLOUDFLARE_ACCOUNT_ID variable")
	}
	zoneId := os.Getenv("CLOUDFLARE_ZONE_ID")
	if zoneId == "" {
		t.Skipf("Skipping test due to missing CLOUDFLARE_ZONE_ID variable")
	}
	cwd, err := os.Getwd()
	if !assert.NoError(t, err, "expected a valid working directory: %v", err) {
		return
	}

	// base options shared amongst all tests.
	base := integration.ProgramTestOptions{
		Config: map[string]string{
			"zone_id": zoneId,
		},
	}

	jsBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/cloudflare",
		},
	})

	shortTests := []integration.ProgramTestOptions{
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "record")}),
	}

	longTests := []integration.ProgramTestOptions{}

	tests := shortTests
	if !testing.Short() {
		tests = append(tests, longTests...)
	}

	for _, ex := range tests {
		t.Run(ex.Dir, func(t *testing.T) {
			integration.ProgramTest(t, &ex)
		})
	}
}
