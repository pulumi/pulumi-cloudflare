// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ListItemHostnameArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListItemHostnameArgs Empty = new ListItemHostnameArgs();

    @Import(name="urlHostname", required=true)
    private Output<String> urlHostname;

    public Output<String> urlHostname() {
        return this.urlHostname;
    }

    private ListItemHostnameArgs() {}

    private ListItemHostnameArgs(ListItemHostnameArgs $) {
        this.urlHostname = $.urlHostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListItemHostnameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListItemHostnameArgs $;

        public Builder() {
            $ = new ListItemHostnameArgs();
        }

        public Builder(ListItemHostnameArgs defaults) {
            $ = new ListItemHostnameArgs(Objects.requireNonNull(defaults));
        }

        public Builder urlHostname(Output<String> urlHostname) {
            $.urlHostname = urlHostname;
            return this;
        }

        public Builder urlHostname(String urlHostname) {
            return urlHostname(Output.of(urlHostname));
        }

        public ListItemHostnameArgs build() {
            if ($.urlHostname == null) {
                throw new MissingRequiredPropertyException("ListItemHostnameArgs", "urlHostname");
            }
            return $;
        }
    }

}
