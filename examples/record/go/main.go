package main

import (
	"github.com/pulumi/pulumi-cloudflare/sdk/v3/go/cloudflare"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		zone, err := cloudflare.NewZone(ctx, "my-zone", &cloudflare.ZoneArgs{
			Zone: pulumi.String("go-test-cloudflare-pulumi.com"),
		})

		_, err := cloudflare.NewRecord(ctx, "my-record-go", &cloudflare.RecordArgs{
			Name:   pulumi.String("my-record-go"),
			ZoneId: zone.ID(),
			Type:   pulumi.String("A"),
			Value:  pulumi.String("162.168.0.13"),
			Ttl:    pulumi.Int(3600),
		})
		if err != nil {
			return err
		}

		return nil
	})
}
