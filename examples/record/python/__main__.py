import pulumi_cloudflare as cloudflare

zone = cloudflare.Zone("my-zone", zone="py-test-cloudflare-pulumi.com")

record = cloudflare.Record("my-record-py",
                           name="my-record-py", zone_id=zone.id,
                           type="A", value="192.168.0.11", ttl=3600)
