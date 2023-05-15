import * as cloudflare from "@pulumi/cloudflare";

const zone = new cloudflare.Zone("my-zone", {
    "zone": "ts-test-cloudflare-pulumi.com",
    "plan": "free"
});

const record = new cloudflare.Record("my-record", {
    name: "my-record-ts",
    zoneId: zone.id,
    type: "A",
    value: "192.168.0.11",
    ttl: 3600,
})
