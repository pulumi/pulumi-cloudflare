using Pulumi;
using Cloudflare = Pulumi.Cloudflare;

class MyStack : Stack
{
    public MyStack()
    {
        var config = new Pulumi.Config();
        var zoneId = config.Require("zone_id");

        var foobar = new Cloudflare.Record("foobar", new Cloudflare.RecordArgs
        {
            Name = "my-record-csharp",
            ZoneId = zoneId,
            Value = "162.168.0.14",
            Type = "A",
            Ttl = 3600,
        });
    }
}
