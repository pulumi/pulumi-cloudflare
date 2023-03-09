import * as pulumi from "@pulumi/pulumi";
import * as cloudflare from "@pulumi/cloudflare";

const ruleset = new cloudflare.Ruleset(`CloudflareManagedRuleset`, {
    zoneId: "8e924cb86194f76c50c8a365da16f98e",
    kind: "zone",
    name: "managedruleset",
    phase: "http_request_firewall_managed",
    rules: [{
        action: "execute",
        actionParameters: {
            // Cloudflare Managed Ruleset
            id: "efb7b8c949ac4650a09736fc376e9aee",
            version: "latest",
            overrides: {
                rules: [{
                    action: "log",
                    id: "ef21b0a932ae422790f9249d213b85e6",
		    status: "",
                }]
            }
        },
        expression: "true",
        enabled: true,
    }]
});
