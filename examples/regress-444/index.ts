import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";

const config = new pulumi.Config();
const accountId = config.require("accountId");

const zone = new cloudflare.Zone("my-zone", {
    zone: "ts-test-cloudflare-zone.com",
    accountId: accountId,
});

new cloudflare.Ruleset("transform_uri_rule_query", {
    description: "change the URI query to a new static query",
    kind: "zone",
    name: "transform rule for URI query parameter",
    phase: "http_request_transform",
    rules: [
        {
            action: "rewrite",
            actionParameters: {
                uri: {
                    query: {
                        value: "old=new_again2",
                    },
                },
            },
            description: "URI transformation query example",
            enabled: true,
            expression: 'http.host eq "test"',
        },
    ],
    zoneId: zone.id,
});
