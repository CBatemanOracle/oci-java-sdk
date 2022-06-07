/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The settings used for protection rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProtectionSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProtectionSettings {
    @Deprecated
    @java.beans.ConstructorProperties({
        "blockAction",
        "blockResponseCode",
        "blockErrorPageMessage",
        "blockErrorPageCode",
        "blockErrorPageDescription",
        "maxArgumentCount",
        "maxNameLengthPerArgument",
        "maxTotalNameLengthOfArguments",
        "recommendationsPeriodInDays",
        "isResponseInspected",
        "maxResponseSizeInKiB",
        "allowedHttpMethods",
        "mediaTypes"
    })
    public ProtectionSettings(
            BlockAction blockAction,
            Integer blockResponseCode,
            String blockErrorPageMessage,
            String blockErrorPageCode,
            String blockErrorPageDescription,
            Integer maxArgumentCount,
            Integer maxNameLengthPerArgument,
            Integer maxTotalNameLengthOfArguments,
            Integer recommendationsPeriodInDays,
            Boolean isResponseInspected,
            Integer maxResponseSizeInKiB,
            java.util.List<AllowedHttpMethods> allowedHttpMethods,
            java.util.List<String> mediaTypes) {
        super();
        this.blockAction = blockAction;
        this.blockResponseCode = blockResponseCode;
        this.blockErrorPageMessage = blockErrorPageMessage;
        this.blockErrorPageCode = blockErrorPageCode;
        this.blockErrorPageDescription = blockErrorPageDescription;
        this.maxArgumentCount = maxArgumentCount;
        this.maxNameLengthPerArgument = maxNameLengthPerArgument;
        this.maxTotalNameLengthOfArguments = maxTotalNameLengthOfArguments;
        this.recommendationsPeriodInDays = recommendationsPeriodInDays;
        this.isResponseInspected = isResponseInspected;
        this.maxResponseSizeInKiB = maxResponseSizeInKiB;
        this.allowedHttpMethods = allowedHttpMethods;
        this.mediaTypes = mediaTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
        private BlockAction blockAction;

        public Builder blockAction(BlockAction blockAction) {
            this.blockAction = blockAction;
            this.__explicitlySet__.add("blockAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
        private String blockErrorPageMessage;

        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            this.blockErrorPageMessage = blockErrorPageMessage;
            this.__explicitlySet__.add("blockErrorPageMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
        private String blockErrorPageCode;

        public Builder blockErrorPageCode(String blockErrorPageCode) {
            this.blockErrorPageCode = blockErrorPageCode;
            this.__explicitlySet__.add("blockErrorPageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
        private String blockErrorPageDescription;

        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            this.blockErrorPageDescription = blockErrorPageDescription;
            this.__explicitlySet__.add("blockErrorPageDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxArgumentCount")
        private Integer maxArgumentCount;

        public Builder maxArgumentCount(Integer maxArgumentCount) {
            this.maxArgumentCount = maxArgumentCount;
            this.__explicitlySet__.add("maxArgumentCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxNameLengthPerArgument")
        private Integer maxNameLengthPerArgument;

        public Builder maxNameLengthPerArgument(Integer maxNameLengthPerArgument) {
            this.maxNameLengthPerArgument = maxNameLengthPerArgument;
            this.__explicitlySet__.add("maxNameLengthPerArgument");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalNameLengthOfArguments")
        private Integer maxTotalNameLengthOfArguments;

        public Builder maxTotalNameLengthOfArguments(Integer maxTotalNameLengthOfArguments) {
            this.maxTotalNameLengthOfArguments = maxTotalNameLengthOfArguments;
            this.__explicitlySet__.add("maxTotalNameLengthOfArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationsPeriodInDays")
        private Integer recommendationsPeriodInDays;

        public Builder recommendationsPeriodInDays(Integer recommendationsPeriodInDays) {
            this.recommendationsPeriodInDays = recommendationsPeriodInDays;
            this.__explicitlySet__.add("recommendationsPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResponseInspected")
        private Boolean isResponseInspected;

        public Builder isResponseInspected(Boolean isResponseInspected) {
            this.isResponseInspected = isResponseInspected;
            this.__explicitlySet__.add("isResponseInspected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxResponseSizeInKiB")
        private Integer maxResponseSizeInKiB;

        public Builder maxResponseSizeInKiB(Integer maxResponseSizeInKiB) {
            this.maxResponseSizeInKiB = maxResponseSizeInKiB;
            this.__explicitlySet__.add("maxResponseSizeInKiB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
        private java.util.List<AllowedHttpMethods> allowedHttpMethods;

        public Builder allowedHttpMethods(java.util.List<AllowedHttpMethods> allowedHttpMethods) {
            this.allowedHttpMethods = allowedHttpMethods;
            this.__explicitlySet__.add("allowedHttpMethods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mediaTypes")
        private java.util.List<String> mediaTypes;

        public Builder mediaTypes(java.util.List<String> mediaTypes) {
            this.mediaTypes = mediaTypes;
            this.__explicitlySet__.add("mediaTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionSettings build() {
            ProtectionSettings __instance__ =
                    new ProtectionSettings(
                            blockAction,
                            blockResponseCode,
                            blockErrorPageMessage,
                            blockErrorPageCode,
                            blockErrorPageDescription,
                            maxArgumentCount,
                            maxNameLengthPerArgument,
                            maxTotalNameLengthOfArguments,
                            recommendationsPeriodInDays,
                            isResponseInspected,
                            maxResponseSizeInKiB,
                            allowedHttpMethods,
                            mediaTypes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionSettings o) {
            Builder copiedBuilder =
                    blockAction(o.getBlockAction())
                            .blockResponseCode(o.getBlockResponseCode())
                            .blockErrorPageMessage(o.getBlockErrorPageMessage())
                            .blockErrorPageCode(o.getBlockErrorPageCode())
                            .blockErrorPageDescription(o.getBlockErrorPageDescription())
                            .maxArgumentCount(o.getMaxArgumentCount())
                            .maxNameLengthPerArgument(o.getMaxNameLengthPerArgument())
                            .maxTotalNameLengthOfArguments(o.getMaxTotalNameLengthOfArguments())
                            .recommendationsPeriodInDays(o.getRecommendationsPeriodInDays())
                            .isResponseInspected(o.getIsResponseInspected())
                            .maxResponseSizeInKiB(o.getMaxResponseSizeInKiB())
                            .allowedHttpMethods(o.getAllowedHttpMethods())
                            .mediaTypes(o.getMediaTypes());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * If {@code action} is set to {@code BLOCK}, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to {@code SET_RESPONSE_CODE}.
     **/
    public enum BlockAction {
        ShowErrorPage("SHOW_ERROR_PAGE"),
        SetResponseCode("SET_RESPONSE_CODE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BlockAction.class);

        private final String value;
        private static java.util.Map<String, BlockAction> map;

        static {
            map = new java.util.HashMap<>();
            for (BlockAction v : BlockAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BlockAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BlockAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BlockAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If {@code action} is set to {@code BLOCK}, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to {@code SET_RESPONSE_CODE}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
    private final BlockAction blockAction;

    public BlockAction getBlockAction() {
        return blockAction;
    }

    /**
     * The response code returned when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SET_RESPONSE_CODE}, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to {@code 403}. The list of available response codes: {@code 400}, {@code 401}, {@code 403}, {@code 405}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    private final Integer blockResponseCode;

    public Integer getBlockResponseCode() {
        return blockResponseCode;
    }

    /**
     * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to 'Access to the website is blocked.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
    private final String blockErrorPageMessage;

    public String getBlockErrorPageMessage() {
        return blockErrorPageMessage;
    }

    /**
     * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to {@code 403}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
    private final String blockErrorPageCode;

    public String getBlockErrorPageCode() {
        return blockErrorPageCode;
    }

    /**
     * The description text to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to {@code Access blocked by website owner. Please contact support.}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
    private final String blockErrorPageDescription;

    public String getBlockErrorPageDescription() {
        return blockErrorPageDescription;
    }

    /**
     * The maximum number of arguments allowed to be passed to your application before an action is taken. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to {@code 255}. This setting only applies if a corresponding protection rule is enabled, such as the "Number of Arguments Limits" rule (key: 960335).
     * <p>
     * Example: If {@code maxArgumentCount} to {@code 2} for the Max Number of Arguments protection rule (key: 960335), the following requests would be blocked:
     * {@code GET /myapp/path?query=one&query=two&query=three}
     * {@code POST /myapp/path} with Body {@code {"argument1":"one","argument2":"two","argument3":"three"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxArgumentCount")
    private final Integer maxArgumentCount;

    public Integer getMaxArgumentCount() {
        return maxArgumentCount;
    }

    /**
     * The maximum length allowed for each argument name, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to {@code 400}. This setting only applies if a corresponding protection rule is enabled, such as the "Values Limits" rule (key: 960208).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxNameLengthPerArgument")
    private final Integer maxNameLengthPerArgument;

    public Integer getMaxNameLengthPerArgument() {
        return maxNameLengthPerArgument;
    }

    /**
     * The maximum length allowed for the sum of the argument name and value, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to {@code 64000}. This setting only applies if a corresponding protection rule is enabled, such as the "Total Arguments Limits" rule (key: 960341).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalNameLengthOfArguments")
    private final Integer maxTotalNameLengthOfArguments;

    public Integer getMaxTotalNameLengthOfArguments() {
        return maxTotalNameLengthOfArguments;
    }

    /**
     * The length of time to analyze traffic traffic, in days. After the analysis period, {@code WafRecommendations} will be populated. If unspecified, defaults to {@code 10}.
     * <p>
     * Use {@code GET /waasPolicies/{waasPolicyId}/wafRecommendations} to view WAF recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationsPeriodInDays")
    private final Integer recommendationsPeriodInDays;

    public Integer getRecommendationsPeriodInDays() {
        return recommendationsPeriodInDays;
    }

    /**
     * Inspects the response body of origin responses. Can be used to detect leakage of sensitive data. If unspecified, defaults to {@code false}.
     * <p>
     **Note:** Only origin responses with a Content-Type matching a value in {@code mediaTypes} will be inspected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResponseInspected")
    private final Boolean isResponseInspected;

    public Boolean getIsResponseInspected() {
        return isResponseInspected;
    }

    /**
     * The maximum response size to be fully inspected, in binary kilobytes (KiB). Anything over this limit will be partially inspected. If unspecified, defaults to {@code 1024}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxResponseSizeInKiB")
    private final Integer maxResponseSizeInKiB;

    public Integer getMaxResponseSizeInKiB() {
        return maxResponseSizeInKiB;
    }

    /**
     **/
    public enum AllowedHttpMethods {
        Options("OPTIONS"),
        Get("GET"),
        Head("HEAD"),
        Post("POST"),
        Put("PUT"),
        Delete("DELETE"),
        Trace("TRACE"),
        Connect("CONNECT"),
        Patch("PATCH"),
        Propfind("PROPFIND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AllowedHttpMethods.class);

        private final String value;
        private static java.util.Map<String, AllowedHttpMethods> map;

        static {
            map = new java.util.HashMap<>();
            for (AllowedHttpMethods v : AllowedHttpMethods.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllowedHttpMethods(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllowedHttpMethods create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllowedHttpMethods', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of allowed HTTP methods. If unspecified, default to {@code [OPTIONS, GET, HEAD, POST]}. This setting only applies if a corresponding protection rule is enabled, such as the "Restrict HTTP Request Methods" rule (key: 911100).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
    private final java.util.List<AllowedHttpMethods> allowedHttpMethods;

    public java.util.List<AllowedHttpMethods> getAllowedHttpMethods() {
        return allowedHttpMethods;
    }

    /**
     * The list of media types to allow for inspection, if {@code isResponseInspected} is enabled. Only responses with MIME types in this list will be inspected. If unspecified, defaults to {@code ["text/html", "text/plain", "text/xml"]}.
     * <p>
     * Supported MIME types include:
     * <p>
     * - text/html
     *     - text/plain
     *     - text/asp
     *     - text/css
     *     - text/x-script
     *     - application/json
     *     - text/webviewhtml
     *     - text/x-java-source
     *     - application/x-javascript
     *     - application/javascript
     *     - application/ecmascript
     *     - text/javascript
     *     - text/ecmascript
     *     - text/x-script.perl
     *     - text/x-script.phyton
     *     - application/plain
     *     - application/xml
     *     - text/xml
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaTypes")
    private final java.util.List<String> mediaTypes;

    public java.util.List<String> getMediaTypes() {
        return mediaTypes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProtectionSettings(");
        sb.append("blockAction=").append(String.valueOf(this.blockAction));
        sb.append(", blockResponseCode=").append(String.valueOf(this.blockResponseCode));
        sb.append(", blockErrorPageMessage=").append(String.valueOf(this.blockErrorPageMessage));
        sb.append(", blockErrorPageCode=").append(String.valueOf(this.blockErrorPageCode));
        sb.append(", blockErrorPageDescription=")
                .append(String.valueOf(this.blockErrorPageDescription));
        sb.append(", maxArgumentCount=").append(String.valueOf(this.maxArgumentCount));
        sb.append(", maxNameLengthPerArgument=")
                .append(String.valueOf(this.maxNameLengthPerArgument));
        sb.append(", maxTotalNameLengthOfArguments=")
                .append(String.valueOf(this.maxTotalNameLengthOfArguments));
        sb.append(", recommendationsPeriodInDays=")
                .append(String.valueOf(this.recommendationsPeriodInDays));
        sb.append(", isResponseInspected=").append(String.valueOf(this.isResponseInspected));
        sb.append(", maxResponseSizeInKiB=").append(String.valueOf(this.maxResponseSizeInKiB));
        sb.append(", allowedHttpMethods=").append(String.valueOf(this.allowedHttpMethods));
        sb.append(", mediaTypes=").append(String.valueOf(this.mediaTypes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionSettings)) {
            return false;
        }

        ProtectionSettings other = (ProtectionSettings) o;
        return java.util.Objects.equals(this.blockAction, other.blockAction)
                && java.util.Objects.equals(this.blockResponseCode, other.blockResponseCode)
                && java.util.Objects.equals(this.blockErrorPageMessage, other.blockErrorPageMessage)
                && java.util.Objects.equals(this.blockErrorPageCode, other.blockErrorPageCode)
                && java.util.Objects.equals(
                        this.blockErrorPageDescription, other.blockErrorPageDescription)
                && java.util.Objects.equals(this.maxArgumentCount, other.maxArgumentCount)
                && java.util.Objects.equals(
                        this.maxNameLengthPerArgument, other.maxNameLengthPerArgument)
                && java.util.Objects.equals(
                        this.maxTotalNameLengthOfArguments, other.maxTotalNameLengthOfArguments)
                && java.util.Objects.equals(
                        this.recommendationsPeriodInDays, other.recommendationsPeriodInDays)
                && java.util.Objects.equals(this.isResponseInspected, other.isResponseInspected)
                && java.util.Objects.equals(this.maxResponseSizeInKiB, other.maxResponseSizeInKiB)
                && java.util.Objects.equals(this.allowedHttpMethods, other.allowedHttpMethods)
                && java.util.Objects.equals(this.mediaTypes, other.mediaTypes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.blockAction == null ? 43 : this.blockAction.hashCode());
        result =
                (result * PRIME)
                        + (this.blockResponseCode == null ? 43 : this.blockResponseCode.hashCode());
        result =
                (result * PRIME)
                        + (this.blockErrorPageMessage == null
                                ? 43
                                : this.blockErrorPageMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.blockErrorPageCode == null
                                ? 43
                                : this.blockErrorPageCode.hashCode());
        result =
                (result * PRIME)
                        + (this.blockErrorPageDescription == null
                                ? 43
                                : this.blockErrorPageDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.maxArgumentCount == null ? 43 : this.maxArgumentCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxNameLengthPerArgument == null
                                ? 43
                                : this.maxNameLengthPerArgument.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTotalNameLengthOfArguments == null
                                ? 43
                                : this.maxTotalNameLengthOfArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationsPeriodInDays == null
                                ? 43
                                : this.recommendationsPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.isResponseInspected == null
                                ? 43
                                : this.isResponseInspected.hashCode());
        result =
                (result * PRIME)
                        + (this.maxResponseSizeInKiB == null
                                ? 43
                                : this.maxResponseSizeInKiB.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedHttpMethods == null
                                ? 43
                                : this.allowedHttpMethods.hashCode());
        result = (result * PRIME) + (this.mediaTypes == null ? 43 : this.mediaTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
