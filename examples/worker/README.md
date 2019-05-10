# Cloudflare Worker

A Hello-World implementation of a Cloudflare Worker. Deploys a non-enterprise worker.

## Running the App

1.  Create a new stack:

    ```
    $ pulumi stack init dev
    ```

1.  Restore NPM dependencies:

    ```
    $ npm install
    ```

1. Define Cloudflare e-mail:

    ```
    pulumi config set cloudflare:email <value>
    ```

1. Define Cloudflare [API key](https://support.cloudflare.com/hc/en-us/articles/200167836-Where-do-I-find-my-Cloudflare-API-key-):

    ```
    pulumi config set --secret cloudflare:token <value>
    ```

1. Define the zone name (your website name):

    ```
    pulumi config set zone <value>
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
