import * as cloudflare from "@pulumi/cloudflare";
import * as pulumi from "@pulumi/pulumi";

const config = new pulumi.Config();
const zone_id = config.require("zone_id");

const record = new cloudflare.Record("my-record", {
    name: "my-record-ts",
    zoneId: zone_id,
    type: "A",
    value: "192.168.0.11",
    ttl: 3600,
})

