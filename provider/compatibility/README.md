# v6.19 SDK compatibility manifest

`v6.19.0.json` records the public resource and function tokens from the v6.19.0 schema and maps them to their Terraform resources and data sources.

The provider uses this immutable snapshot to keep the old `index` SDK surface after inferred modules become canonical. Generate the snapshot from the committed v6.19.0 `schema.json` and `bridge-metadata.json`; do not update it during normal provider upgrades.
