import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";
import * as fs from "fs";

const config = new pulumi.Config();
const zone =  config.require("zone");

const pattern = `${zone}/helloworld`;
const content = fs.readFileSync("worker.js", { encoding: "utf-8" });

new cloudflare.WorkerScript("test", {
    zone,
    content 
});

new cloudflare.WorkerRoute("test", {
    enabled: true,
    pattern,
    zone,
});

export const endpoint = `https://${pattern}`;
