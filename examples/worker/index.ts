import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";
import * as fs from "fs";

const config = new pulumi.Config();
const zone =  config.require("zone_id");

new cloudflare.WorkerScript("test", {
    content: fs.readFileSync("worker.js", { encoding: 'utf-8' })
});

new cloudflare.WorkerRoute("test", {
    zone_id: zone,
    enabled: true,
    pattern: `${zone}/helloworld`,
});

export const endpoint = `https://${zone}/helloworld`;
