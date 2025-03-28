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
            Name = "cs-test-cloudflare-pulumi.com",
            Account = new Cloudflare.ZoneAccountArgs { Id = accountId }
        });

        var foobar = new Cloudflare.DnsRecord("foobar", new Cloudflare.DnsRecordArgs
        {
            Name = "my-record-csharp",
            ZoneId = zone.Id,
            Content = "162.168.0.14",
            Type = "A",
            Ttl = 3600,
        });
    }
}
