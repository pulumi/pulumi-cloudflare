package migratetoken

import (
	"fmt"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	"github.com/pulumi/pulumi-tool-generate-migration/pkg/pvbind"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

type ApiTokenConditionRequestIp struct {
	Ins    []resource.PropertyValue `pulumi:"ins"`
	NotIns []resource.PropertyValue `pulumi:"notIns"`
}

type ApiTokenCondition struct {
	RequestIp ApiTokenConditionRequestIp `pulumi:"requestIp"`
}

type ApiTokenPolicy struct {
	Effect           resource.PropertyValue            `pulumi:"effect"`
	PermissionGroups []resource.PropertyValue          `pulumi:"permissionGroups"`
	Resources        map[string]resource.PropertyValue `pulumi:"resources"`
}

type R1State struct {
	Condition  ApiTokenCondition      `pulumi:"condition"`
	IssuedOn   resource.PropertyValue `pulumi:"issuedOn"`
	Name       resource.PropertyValue `pulumi:"name"`
	NotBefore  resource.PropertyValue `pulumi:"notBefore"`
	Status     resource.PropertyValue `pulumi:"status"`
	Value      resource.PropertyValue `pulumi:"value"`
	ExpiresOn  resource.PropertyValue `pulumi:"expiresOn"`
	ModifiedOn resource.PropertyValue `pulumi:"modifiedOn"`
	Policies   []ApiTokenPolicy       `pulumi:"policies"`
}

type ApiTokenPolicyPermissionGroupMeta struct {
	Key   resource.PropertyValue `pulumi:"key"`
	Value resource.PropertyValue `pulumi:"value"`
}

type ApiTokenPolicyPermissionGroup struct {
	Id   resource.PropertyValue            `pulumi:"id"`
	Meta ApiTokenPolicyPermissionGroupMeta `pulumi:"meta"`
	Name resource.PropertyValue            `pulumi:"name"`
}

type ApiTokenPolicy1 struct {
	PermissionGroups []ApiTokenPolicyPermissionGroup   `pulumi:"permissionGroups"`
	Resources        map[string]resource.PropertyValue `pulumi:"resources"`
	Effect           resource.PropertyValue            `pulumi:"effect"`
	Id               resource.PropertyValue            `pulumi:"id"`
}

type ApiTokenConditionRequestIp1 struct {
	NotIns []resource.PropertyValue `pulumi:"notIns"`
	Ins    []resource.PropertyValue `pulumi:"ins"`
}

type ApiTokenCondition1 struct {
	RequestIp ApiTokenConditionRequestIp1 `pulumi:"requestIp"`
}

type R2State struct {
	IssuedOn   resource.PropertyValue `pulumi:"issuedOn"`
	LastUsedOn resource.PropertyValue `pulumi:"lastUsedOn"`
	Name       resource.PropertyValue `pulumi:"name"`
	Policies   []ApiTokenPolicy1      `pulumi:"policies"`
	Condition  ApiTokenCondition1     `pulumi:"condition"`
	ExpiresOn  resource.PropertyValue `pulumi:"expiresOn"`
	Status     resource.PropertyValue `pulumi:"status"`
	Value      resource.PropertyValue `pulumi:"value"`
	ModifiedOn resource.PropertyValue `pulumi:"modifiedOn"`
	NotBefore  resource.PropertyValue `pulumi:"notBefore"`
}

func Migrate(r1 R1State) (R2State, error) {
	// Migrate policies
	var policies []ApiTokenPolicy1
	for _, p := range r1.Policies {
		// Convert permissionGroups from []resource.PropertyValue to []ApiTokenPolicyPermissionGroup
		var permissionGroups []ApiTokenPolicyPermissionGroup
		for _, pg := range p.PermissionGroups {
			permissionGroups = append(permissionGroups, ApiTokenPolicyPermissionGroup{
				Id: pg,
				// Meta and Name are optional, so we leave them unset
			})
		}

		policy1 := ApiTokenPolicy1{
			PermissionGroups: permissionGroups,
			Resources:        p.Resources,
			Effect:           p.Effect,
			// Id is optional, so we leave it unset
		}
		policies = append(policies, policy1)
	}

	// Migrate condition
	condition1 := ApiTokenCondition1{
		RequestIp: ApiTokenConditionRequestIp1{
			NotIns: r1.Condition.RequestIp.NotIns,
			Ins:    r1.Condition.RequestIp.Ins,
		},
	}

	return R2State{
		IssuedOn:   r1.IssuedOn,
		LastUsedOn: resource.PropertyValue{}, // New field, set to zero value
		Name:       r1.Name,
		Policies:   policies,
		Condition:  condition1,
		ExpiresOn:  r1.ExpiresOn,
		Status:     r1.Status,
		Value:      r1.Value,
		ModifiedOn: r1.ModifiedOn,
		NotBefore:  r1.NotBefore,
	}, nil
}

type PreStateUpgradeHook = func(
	args info.PreStateUpgradeHookArgs,
) (int64, resource.PropertyMap, error)

func needsMigration(st R1State) bool {
	if len(st.Policies) == 0 {
		return false
	}
	for _, p := range st.Policies {
		if len(p.PermissionGroups) > 0 {
			return true
		}
	}
	return false
}

func NewPreStateUpgradeHook() PreStateUpgradeHook {
	return func(args info.PreStateUpgradeHookArgs) (int64, resource.PropertyMap, error) {
		if args.PriorStateSchemaVersion != 0 || args.ResourceSchemaVersion != 0 {
			return args.ResourceSchemaVersion, args.PriorState, nil
		}

		old := resource.NewObjectProperty(args.PriorState)
		s, err := pvbind.Unmarshal[R1State](old, pvbind.UnmarshalOpts{})
		if err != nil {
			return args.ResourceSchemaVersion, args.PriorState, nil
		}

		if !needsMigration(s) {
			return args.ResourceSchemaVersion, args.PriorState, nil
		}

		new, err := Migrate(s)
		if err != nil {
			return args.ResourceSchemaVersion, args.PriorState, nil
		}

		newPV, err := pvbind.Marshal(new, pvbind.MarshalOpts{})
		if err != nil {
			return args.ResourceSchemaVersion, args.PriorState, nil
		}

		if !newPV.IsObject() {
			return args.ResourceSchemaVersion, nil, fmt.Errorf("Expected an Object PropertyValue here")
		}

		return 0, newPV.ObjectValue(), nil
	}
}
