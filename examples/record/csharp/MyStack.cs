using Pulumi;
using Cloudflare = Pulumi.Cloudflare;

class MyStack : Stack
{
    public MyStack()
    {
        var config = new Pulumi.Config();
        var accountId = config.Require("accountId");

        var zone = new Cloudflare.Zone("my-zone", new Cloudflare.ZoneArgs
        {
            ZoneName = "cs-test-cloudflare-pulumi.com",
            AccountId = accountId
        });

        var foobar = new Cloudflare.Record("foobar", new Cloudflare.RecordArgs
        {
            Name = "my-record-csharp",
            ZoneId = zone.Id,
            Value = "162.168.0.14",
            Type = "A",
            Ttl = 3600,
        });
    }
}
