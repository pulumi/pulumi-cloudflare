---
# *** WARNING: This file was auto-generated. Do not edit by hand unless you're certain you know what you are doing! ***
title: Cloudflare Provider
meta_desc: Provides an overview on how to configure the Pulumi Cloudflare provider.
layout: package
---

## Installation

The Cloudflare provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/cloudflare`](https://www.npmjs.com/package/@pulumi/cloudflare)
* Python: [`pulumi-cloudflare`](https://pypi.org/project/pulumi-cloudflare/)
* Go: [`github.com/pulumi/pulumi-cloudflare/sdk/v6/go/cloudflare`](https://github.com/pulumi/pulumi-cloudflare)
* .NET: [`Pulumi.Cloudflare`](https://www.nuget.org/packages/Pulumi.Cloudflare)
* Java: [`com.pulumi/cloudflare`](https://central.sonatype.com/artifact/com.pulumi/cloudflare)

## Overview

The Cloudflare provider is used to interact with resources supported by
Cloudflare. The provider needs to be configured with the proper credentials
before it can be used.
## Example Usage

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    cloudflare:apiToken:
        value: 'TODO: var.cloudflare_api_token'

```
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";

// Create a DNS record
const www = new cloudflare.DnsRecord("www", {});
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    cloudflare:apiToken:
        value: 'TODO: var.cloudflare_api_token'

```
```python
import pulumi
import pulumi_cloudflare as cloudflare

# Create a DNS record
www = cloudflare.DnsRecord("www")
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    cloudflare:apiToken:
        value: 'TODO: var.cloudflare_api_token'

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Cloudflare = Pulumi.Cloudflare;

return await Deployment.RunAsync(() =>
{
    // Create a DNS record
    var www = new Cloudflare.DnsRecord("www");

});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    cloudflare:apiToken:
        value: 'TODO: var.cloudflare_api_token'

```
```go
package main

import (
	"github.com/pulumi/pulumi-cloudflare/sdk/v6/go/cloudflare"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		// Create a DNS record
		_, err := cloudflare.NewDnsRecord(ctx, "www", nil)
		if err != nil {
			return err
		}
		return nil
	})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    cloudflare:apiToken:
        value: 'TODO: var.cloudflare_api_token'

```
```yaml
resources:
  # Create a DNS record
  www:
    type: cloudflare:DnsRecord
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    cloudflare:apiToken:
        value: 'TODO: var.cloudflare_api_token'

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.cloudflare.DnsRecord;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        // Create a DNS record
        var www = new DnsRecord("www");

    }
}
```
{{% /choosable %}}
{{< /chooser >}}
## Configuration Reference

- `apiKey` (String) The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used instead. Must provide only one of `apiKey`, `apiToken`, `apiUserServiceKey`.
- `apiToken` (String) The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable. Must provide only one of `apiKey`, `apiToken`, `apiUserServiceKey`.
- `apiUserServiceKey` (String) A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `apiKey`, `apiToken`, `apiUserServiceKey`.
- `baseUrl` (String) Value to override the default HTTP client base URL. Alternatively, can be configured using the `baseUrl` environment variable.
- `email` (String) A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment variable. Required when using `apiKey`. Conflicts with `apiToken`.
- `userAgentOperatorSuffix` (String) A value to append to the HTTP User Agent for all API calls. This value is not something most users need to modify however, if you are using a non-standard provider or operator configuration, this is recommended to assist in uniquely identifying your traffic. **Setting this value will remove the Pulumi version from the HTTP User Agent string and may have unintended consequences**. Alternatively, can be configured using the `CLOUDFLARE_USER_AGENT_OPERATOR_SUFFIX` environment variable.