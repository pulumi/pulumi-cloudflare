package migratetoken

import (
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	"github.com/pulumi/pulumi-tool-generate-migration/pkg/bridge"
	"github.com/pulumi/pulumi-tool-generate-migration/pkg/pvbind"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

var (
	unmarshalOpts = pvbind.UnmarshalOpts{
		StrictModeIgnoreField: func(pk resource.PropertyKey) bool {
			return pk == "id"
		},
	}

	hook = bridge.NewPreStateUpgradeHook(Migrate, unmarshalOpts)
)

func PreStateUpgradeHook(args info.PreStateUpgradeHookArgs) (int64, resource.PropertyMap, error) {
	// Only apply speculative schema correction when prior state is v=0.
	if args.PriorStateSchemaVersion != 0 {
		return args.ResourceSchemaVersion, args.PriorState, nil
	}
	return hook(args)
}
