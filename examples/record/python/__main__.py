import pulumi
import pulumi_cloudflare as cloudflare

config = pulumi.Config()

account_id = config.require("accountId")

zone = cloudflare.Zone(
    "my-zone", name="py-test-cloudflare-pulumi.com", account={"id": account_id}
)

record = cloudflare.DnsRecord(
    "my-record-py",
    name=zone.name.apply(lambda name: f"my-record-py.{name}"),
    zone_id=zone.id,
    type="A",
    content="192.168.0.11",
    ttl=3600,
)
