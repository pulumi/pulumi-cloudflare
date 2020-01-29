CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

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
