// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationPolicyWebhooksResult {
    /**
     * @return The account id
     * 
     */
    private String accountId;
    /**
     * @return Timestamp of when the webhook destination was created.
     * 
     */
    private String createdAt;
    /**
     * @return The unique identifier of a webhook
     * 
     */
    private String id;
    /**
     * @return Timestamp of the last time an attempt to dispatch a notification to this webhook failed.
     * 
     */
    private String lastFailure;
    /**
     * @return Timestamp of the last time Cloudflare was able to successfully dispatch a notification using this webhook.
     * 
     */
    private String lastSuccess;
    /**
     * @return The name of the webhook destination. This will be included in the request body when you receive a webhook notification.
     * 
     */
    private String name;
    /**
     * @return Optional secret that will be passed in the `cf-webhook-auth` header when dispatching generic webhook notifications or formatted for supported destinations. Secrets are not returned in any API response body.
     * 
     */
    private String secret;
    /**
     * @return Type of webhook endpoint.
     * Available values: &#34;slack&#34;, &#34;generic&#34;, &#34;gchat&#34;.
     * 
     */
    private String type;
    /**
     * @return The POST endpoint to call when dispatching a notification.
     * 
     */
    private String url;
    /**
     * @return The unique identifier of a webhook
     * 
     */
    private @Nullable String webhookId;

    private GetNotificationPolicyWebhooksResult() {}
    /**
     * @return The account id
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Timestamp of when the webhook destination was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The unique identifier of a webhook
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Timestamp of the last time an attempt to dispatch a notification to this webhook failed.
     * 
     */
    public String lastFailure() {
        return this.lastFailure;
    }
    /**
     * @return Timestamp of the last time Cloudflare was able to successfully dispatch a notification using this webhook.
     * 
     */
    public String lastSuccess() {
        return this.lastSuccess;
    }
    /**
     * @return The name of the webhook destination. This will be included in the request body when you receive a webhook notification.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional secret that will be passed in the `cf-webhook-auth` header when dispatching generic webhook notifications or formatted for supported destinations. Secrets are not returned in any API response body.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return Type of webhook endpoint.
     * Available values: &#34;slack&#34;, &#34;generic&#34;, &#34;gchat&#34;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The POST endpoint to call when dispatching a notification.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return The unique identifier of a webhook
     * 
     */
    public Optional<String> webhookId() {
        return Optional.ofNullable(this.webhookId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationPolicyWebhooksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String createdAt;
        private String id;
        private String lastFailure;
        private String lastSuccess;
        private String name;
        private String secret;
        private String type;
        private String url;
        private @Nullable String webhookId;
        public Builder() {}
        public Builder(GetNotificationPolicyWebhooksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.lastFailure = defaults.lastFailure;
    	      this.lastSuccess = defaults.lastSuccess;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.webhookId = defaults.webhookId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastFailure(String lastFailure) {
            if (lastFailure == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "lastFailure");
            }
            this.lastFailure = lastFailure;
            return this;
        }
        @CustomType.Setter
        public Builder lastSuccess(String lastSuccess) {
            if (lastSuccess == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "lastSuccess");
            }
            this.lastSuccess = lastSuccess;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetNotificationPolicyWebhooksResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder webhookId(@Nullable String webhookId) {

            this.webhookId = webhookId;
            return this;
        }
        public GetNotificationPolicyWebhooksResult build() {
            final var _resultValue = new GetNotificationPolicyWebhooksResult();
            _resultValue.accountId = accountId;
            _resultValue.createdAt = createdAt;
            _resultValue.id = id;
            _resultValue.lastFailure = lastFailure;
            _resultValue.lastSuccess = lastSuccess;
            _resultValue.name = name;
            _resultValue.secret = secret;
            _resultValue.type = type;
            _resultValue.url = url;
            _resultValue.webhookId = webhookId;
            return _resultValue;
        }
    }
}
