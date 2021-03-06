// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;

namespace Pulumi.Cloudflare
{
    public static class Config
    {
        private static readonly Pulumi.Config __config = new Pulumi.Config("cloudflare");
        /// <summary>
        /// Configure API client to always use that account
        /// </summary>
        public static string? AccountId { get; set; } = __config.Get("accountId");

        /// <summary>
        /// Whether to print logs from the API client (using the default log library logger)
        /// </summary>
        public static bool? ApiClientLogging { get; set; } = __config.GetBoolean("apiClientLogging") ?? Utilities.GetEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") ?? false;

        /// <summary>
        /// The API key for operations.
        /// </summary>
        public static string? ApiKey { get; set; } = __config.Get("apiKey");

        /// <summary>
        /// The API Token for operations.
        /// </summary>
        public static string? ApiToken { get; set; } = __config.Get("apiToken");

        /// <summary>
        /// A special Cloudflare API key good for a restricted set of endpoints
        /// </summary>
        public static string? ApiUserServiceKey { get; set; } = __config.Get("apiUserServiceKey");

        /// <summary>
        /// A registered Cloudflare email address
        /// </summary>
        public static string? Email { get; set; } = __config.Get("email");

        /// <summary>
        /// Maximum backoff period in seconds after failed API calls
        /// </summary>
        public static int? MaxBackoff { get; set; } = __config.GetInt32("maxBackoff") ?? Utilities.GetEnvInt32("CLOUDFLARE_MAX_BACKOFF") ?? 30;

        /// <summary>
        /// Minimum backoff period in seconds after failed API calls
        /// </summary>
        public static int? MinBackoff { get; set; } = __config.GetInt32("minBackoff") ?? Utilities.GetEnvInt32("CLOUDFLARE_MIN_BACKOFF") ?? 1;

        /// <summary>
        /// Maximum number of retries to perform when an API request fails
        /// </summary>
        public static int? Retries { get; set; } = __config.GetInt32("retries") ?? Utilities.GetEnvInt32("CLOUDFLARE_RETRIES") ?? 3;

        /// <summary>
        /// RPS limit to apply when making calls to the API
        /// </summary>
        public static int? Rps { get; set; } = __config.GetInt32("rps") ?? Utilities.GetEnvInt32("CLOUDFLARE_RPS") ?? 4;

    }
}
