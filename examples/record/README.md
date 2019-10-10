# Cloudflare Record

A simple addition of a DNS record to a CloudFlare zone.

## Running the App

1.  Create a new stack:

    ```
    $ pulumi stack init dev
    ```

1.  Restore NPM dependencies:

    ```
    $ npm install
    ```

1. Define the zone id:

    ```
    pulumi config set zone_id <value>
    ```

1.  Run `pulumi up` to preview and deploy changes:

    ``` 
    $ pulumi up
    Previewing changes:
    ...

    Performing changes:
    ...
    info: 3 changes performed:
        + 3 resources created
    Update duration: 8.59s
    ```

1.  Check the deployed website endpoint:

    ```
    $ pulumi stack output endpoint
    https://example.com/helloworld
    $ curl "$(pulumi stack output endpoint)"
    hello world!
    ```
