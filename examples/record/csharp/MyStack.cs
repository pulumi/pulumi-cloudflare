using Pulumi;
using Cloudflare = Pulumi.Cloudflare;

class MyStack : Stack
{
    public MyStack()
    {
        var zone = new Cloudflare.Zone("my-zone", new Cloudflare.ZoneArgs
        {
            Name = "cs-test-cloudflare-pulumi.com"
        });

        var foobar = new Cloudflare.Record("foobar", new Cloudflare.RecordArgs
        {
            Name = "my-record-csharp",
            ZoneId = zone.ID,
            Value = "162.168.0.14",
            Type = "A",
            Ttl = 3600,
        });
    }
}
