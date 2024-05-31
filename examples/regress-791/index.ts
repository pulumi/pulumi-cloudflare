import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";

const config = new pulumi.Config();
const accountId = config.require("accountId");

new cloudflare.RiskBehavior("test", {
  accountId: accountId,
});
