import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";

const config = new pulumi.Config();
const accountId = config.require("accountId");

const zone = new cloudflare.Zone("my-zone", {
    zone: "ts-test-cloudflare-pulumi.com",
    accountId: accountId,
});

const record = new cloudflare.Record("my-record", {
    name: "my-record-ts",
    zoneId: zone.id,
    type: "A",
    value: "192.168.0.11",
    ttl: 3600,
})
