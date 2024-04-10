import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";

/*
 * This is a regression test for https://github.com/pulumi/pulumi-cloudflare/issues/554.
 *
 * #554 triggers when calling READ (importing) on a `cloudflare.Ruleset` with non-empty
 * rules values. We do this by creating a `cloudflare.Ruleset` (`ruleset`), and then
 * calling `cloudflare.Ruleset.get` with the ID from `ruleset`. We do it this way so we
 * *know* there is a valid cloudflare ruleset to import.
 *
 * We don't need to assert on the imported ruleset, since #554 presented as a panic, not
 * as incorrect data.
 */

const accountId = pulumi.secret(process.env["CLOUDFLARE_ACCOUNT_ID"]!);

const zone = cloudflare.getZoneOutput({
  accountId,
  name: "pulumi-cloudflare-demo.com",
})

const ruleset = new cloudflare.Ruleset("domain-rate-limit", {
  name: "domain-rate-limit",
  kind: "zone",
  zoneId: zone.zoneId,
  phase: "http_request_transform",

  rules: [{
    action: "rewrite",
    actionParameters: {
      uri: {
        path: {
          value: "/my-new-route"
        }
      }
    },

    expression: "(http.host eq \"example.com\" and http.request.uri.path eq \"/old-path\")",
    description: "example URI path transform rule",
    enabled: true,
  }],
});

export const importName = pulumi.interpolate`zone/${zone.id}/${ruleset.id}`;

cloudflare.Ruleset.get("imported", importName);
