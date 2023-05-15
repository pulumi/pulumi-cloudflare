// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getAccountId(t *testing.T) string {
	id := os.Getenv("CLOUDFLARE_ACCOUNT_ID")
	if id == "" {
		t.Skipf("Skipping test due to missing CLOUDFLARE_ACCOUNT_ID environment variable")
	}
	return id
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	accountId := getAccountId(t)
	return integration.ProgramTestOptions{
		Config: map[string]string{
			"accountId": accountId,
		},
	}
}
