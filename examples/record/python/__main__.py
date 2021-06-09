"""A Python Pulumi program"""

import pulumi
import pulumi_cloudflare as cloudflare

config = pulumi.Config()
zone_id = config.require('zone_id')

record = cloudflare.Record("my-record-py",
                           name="my-record-py", zone_id=zone_id,
                           type="A", value="192.168.0.11", ttl=3600)
