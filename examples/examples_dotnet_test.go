// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build dotnet || all
// +build dotnet all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccRecordCSharp(t *testing.T) {
	t.Skip("Temporarily skip while releasing new major version")

	test := getCsharpBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "record", "csharp"),
		})

	integration.ProgramTest(t, &test)
}

func getCsharpBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseCsharp := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"Pulumi.Cloudflare",
		},
	})

	return baseCsharp
}
