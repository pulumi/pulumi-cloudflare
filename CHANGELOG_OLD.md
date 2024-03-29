CHANGELOG
=========

## Notice (2022-01-06)

*As of this notice, using CHANGELOG.md is DEPRECATED. We will be using [GitHub Releases](https://github.com/pulumi/pulumi-cloudflare/releases) for this repository*

## HEAD (Unreleased)
_(none)_

---

## 4.2.0 (2021-12-31)
* Upgrade terraform-provider-cloudflare 3.6.0

## 4.1.0 (2021-12-20)
* Upgrade to terraform-provider-cloudflare 3.5.0
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0

## 4.0.0 (2021-09-27)
* Upgrade to v3.1.0 of the CloudFlare Terraform Provider
    **Please Note:** This includes some breaking changes as noted in the [upstream Terraform provider](https://github.com/cloudflare/terraform-provider-cloudflare/blob/master/CHANGELOG.md#300-september-20th-2021)

## 3.5.0 (2021-09-07)
* Upgrade to v2.26.1 of the CloudFlare Terraform Provider

## 3.4.0 (2021-08-09)
* Upgrade to v2.25.0 of the CloudFlare Terraform Provider

## 3.3.0 (2021-07-12)
* Upgrade to v2.23.0 of the CloudFlare Terraform Provider

## 3.2.0 (2021-06-14)
* Upgrade to v2.21.0 of the CloudFlare Terraform Provider

## 3.1.0 (2021-05-27)
* Upgrade to v3.2.1 of the pulumi-terraform-bridge

## 3.0.0 (2021-04-19)
* Upgrade to v2.20.0 of the CloudFlare Terraform Provider
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 2.15.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 2.14.2 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.14.1 (2021-03-19)
* Upgrade to v2.19.2 of the CloudFlare Terraform Provider

## 2.14.0 (2021-03-16)
* Upgrade to v2.19.1 of the CloudFlare Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.13.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.13.0 (2021-02-03)
* Upgrade to v2.18.0 of the CloudFlare Terraform Provider

## 2.12.0 (2021-01-29)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.11.1 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.11.0 (2021-01-05)
* Upgrade to v2.17.0 of the CloudFlare Terraform Provider

## 2.10.0 (2021-01-04)
* Upgrade to v2.15.0 of the CloudFlare Terraform Provider

## 2.9.0 (2020-12-08)
* Upgrade to v2.14.0 of the CloudFlare Terraform Provider

## 2.8.0 (2020-11-23)
* Upgrade to v2.13.2 of the CloudFlare Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.7.0 (2020-10-26)
* Upgrade to v2.12.0 of the CloudFlare Terraform Provider
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.6.0 (2020-09-14)
* Upgrade to v2.11.0 of the CloudFlare Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 2.5.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python
* Upgrade to v2.10.1 of the CloudFlare Terraform Provider

## 2.4.0 (2020-06-23)
* Upgrade to v2.8.0 of the CloudFlare Terraform Provider

## 2.3.2 (2020-06-12)
* Switch to GitHub actions for build

## 2.3.1 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.3.0 (2020-05-27)
* Upgrade to pulumi-terraform-bridge v2.3.3
* Upgrade to v2.7.0 of the CloudFlare Terraform Provider

## 2.2.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.2.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.1.0 (2020-04-23)
* Upgrade to v2.6.0 of the CloudFlare Terraform Provider

## 2.0.0 (2020-04-17)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.10.0 (2020-04-14)
* Refactor layout to support Go modules
* Upgrade to v2.5.1 of the Cloudflare Terraform Provider

## 1.9.0 (2020-03-31)
* Upgrade to v2.5.0 of the Cloudflare Terraform Provider

## 1.8.1 (2020-03-24)
* Upgrade to Pulumi v1.12.1 in DotNet dependency

## 1.8.0 (2020-03-23)
* Upgrade to v2.4.1 of the Cloudflare Terraform Provider
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.7.0 (2020-03-10)
* Upgrade to v2.4.0 of the Cloudflare Terraform Provider

## 1.6.0 (2020-01-29)
* Upgrade to pulumi-terraform-bridge v1.6.4

## 1.5.0 (2019-12-19)
* Upgrade to v2.3.0 of the Cloudflare Terraform Provider
* Upgrade to pulumi-terraform-bridge v1.5.2

## 1.4.0 (2019-12-10)
* Upgrade to v2.2.0 of the Cloudflare Terraform Provider

## 1.3.0 (2019-12-04)
* Upgrade to support go 1.13.x
* Upgrade to pulumi-terraform-bridge v1.4.3

## 1.2.0 (2019-11-15)
* Add support for DotNet SDK Generation
* Upgrade to v2.1.0 of the Cloudflare Terraform Provider

## 1.1.0 (2019-10-23)
* Upgrade to v2.0.1 of the Cloudflare Terraform Provider

## 1.0.0 (2019-10-03)
* Regenerate SDK based on tf2pulumi 0.6.0
* Upgrade to v2.0.0 of the Cloudflare Terraform Provider

  ### BREAKING CHANGES:

  * provider configuration option `token` has been renamed to `api_key`.
  * provider configuration option `org_id` has been renamed to `account_id` and is now required.
  * provider configuration option `use_org_from_zone` has been removed.
  * environment variable `CLOUDFLARE_TOKEN` has been renamed to `CLOUDFLARE_API_TOKEN`.
  * environment variable `CLOUDFLARE_ORG_ID` has been renamed to `CLOUDFLARE_ACCOUNT_ID`.
  * environment variable `CLOUDFLARE_ORG_ZONE` has been removed.
  * `zone_id` is now a required parameter in all resources

## 0.17.14 (2019-09-05)
* Upgrade to v1.18.1 of the Cloudflare Terraform Provider
* Upgrade to pulumi-terraform ed0b5c29ed

## 0.17.13 (2019-09-05)
* Upgrade to Pulumi v1.0.0
* Add missing support for `cloudflare.CustomSsl`

## 0.17.12 (2019-08-29)
* Upgrade pulumi-terraform to 3f206601e7

## 0.17.11 (2019-08-20)
* Upgrade to v1.17.0 of the Cloudflare Terraform Provider
* Depend on latest pulumi package

## 0.17.10 (2019-08-09)
* Upgrade to pulumi-terraform@9db2fc93cd

## 0.17.9 (2019-08-08)
* Update to pulumi-terraform@013b95b1c8

## 0.17.8 (2019-07-09)
* Fix detailed diffs with nested computed values.

## 0.17.7 (2019-07-08)
* Communicate detailed information about the difference between a resource's desired and actual state during a Pulumi update

## 0.17.6 (2019-06-27)
* Update to v1.16.1 of the Cloudflare Terraform Provider

## 0.17.5 (2019-06-21)
* Update to pulumi-terraform@3635bed3a5 which stops maps containing `.` being treated as nested maps.

## 0.17.4 (2019-06-20)
* Add TypeScript type guards for each resource class ([7ace3e9b5f](https://github.com/pulumi/pulumi-terraform/commit/7ace3e9b5f2dcd4692b029ba4b80360582d7949a))
* Update to v1.16.0 of the Cloudflare Terraform Provider

## 0.17.3 (2019-05-28)
* Fix a bug where configuration is erroneously required for default provider instances even in cases where only first-class provider instances are in use
* Update to v1.15.0 of the Cloudflare Terraform provider

## 0.17.2 (2019-05-16)
* Update to v1.14.0 of the Cloudflare Terraform provider
* Add an example of Cloudflare Workers

## 0.17.1 (2019-05-06)
* Update to v1.13.0 of the Cloudflare Terraform provider

## 0.17.0 (2019-03-08)
* Initial version of the Cloudflare provider, based on v1.12.0 of the Cloudflare Terraform provider
