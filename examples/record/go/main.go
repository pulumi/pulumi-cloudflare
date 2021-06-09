package main

import (
	"github.com/pulumi/pulumi-cloudflare/sdk/v3/go/cloudflare"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		c := config.New(ctx, "")
		zoneId := c.Require("zone_id")

		_, err := cloudflare.NewRecord(ctx, "my-record-go", &cloudflare.RecordArgs{
			Name:   pulumi.String("my-record-go"),
			ZoneId: pulumi.String(zoneId),
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
