CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

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
