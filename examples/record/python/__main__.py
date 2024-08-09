import pulumi
import pulumi_cloudflare as cloudflare

config = pulumi.Config()

account_id = config.require('accountId')

zone = cloudflare.Zone("my-zone", zone="py-test-cloudflare-pulumi.com", account_id=account_id)

record = cloudflare.Record("my-record-py",
                           name="my-record-py", zone_id=zone.id,
                           type="A", content="192.168.0.11", ttl=3600)
