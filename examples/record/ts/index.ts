import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";

const config = new pulumi.Config();
const accountId = config.require("accountId");

const zone = new cloudflare.Zone("my-zone", {
    name: `ts-${pulumi.getStack()}-test-cloudflare-pulumi.com`,
    account: { id: accountId },
});

new cloudflare.Record("my-record", {
    name: zone.name.apply(name => `my-record-ts.${name}`),
    zoneId: zone.id,
    type: "A",
    content: "192.168.0.11",
    ttl: 3600,
})
