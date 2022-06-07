/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ThickAuthorizationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ThickAuthorizationResponse {
    @Deprecated
    @java.beans.ConstructorProperties({
        "policy",
        "policyCacheDuration",
        "groups",
        "groupMembershipCacheDuration",
        "flushAllCaches"
    })
    public ThickAuthorizationResponse(
            String policy,
            String policyCacheDuration,
            java.util.List<String> groups,
            String groupMembershipCacheDuration,
            Boolean flushAllCaches) {
        super();
        this.policy = policy;
        this.policyCacheDuration = policyCacheDuration;
        this.groups = groups;
        this.groupMembershipCacheDuration = groupMembershipCacheDuration;
        this.flushAllCaches = flushAllCaches;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private String policy;

        public Builder policy(String policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyCacheDuration")
        private String policyCacheDuration;

        public Builder policyCacheDuration(String policyCacheDuration) {
            this.policyCacheDuration = policyCacheDuration;
            this.__explicitlySet__.add("policyCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<String> groups;

        public Builder groups(java.util.List<String> groups) {
            this.groups = groups;
            this.__explicitlySet__.add("groups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipCacheDuration")
        private String groupMembershipCacheDuration;

        public Builder groupMembershipCacheDuration(String groupMembershipCacheDuration) {
            this.groupMembershipCacheDuration = groupMembershipCacheDuration;
            this.__explicitlySet__.add("groupMembershipCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flushAllCaches")
        private Boolean flushAllCaches;

        public Builder flushAllCaches(Boolean flushAllCaches) {
            this.flushAllCaches = flushAllCaches;
            this.__explicitlySet__.add("flushAllCaches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThickAuthorizationResponse build() {
            ThickAuthorizationResponse __instance__ =
                    new ThickAuthorizationResponse(
                            policy,
                            policyCacheDuration,
                            groups,
                            groupMembershipCacheDuration,
                            flushAllCaches);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThickAuthorizationResponse o) {
            Builder copiedBuilder =
                    policy(o.getPolicy())
                            .policyCacheDuration(o.getPolicyCacheDuration())
                            .groups(o.getGroups())
                            .groupMembershipCacheDuration(o.getGroupMembershipCacheDuration())
                            .flushAllCaches(o.getFlushAllCaches());

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
     * The policy string related to the request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final String policy;

    public String getPolicy() {
        return policy;
    }

    /**
     * The duration of how long this policy should be cached. Note that the type is of type java.time.Duration, not
     * string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyCacheDuration")
    private final String policyCacheDuration;

    public String getPolicyCacheDuration() {
        return policyCacheDuration;
    }

    /**
     * The policy string related to the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<String> groups;

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * The duration of how long the user's group membership should be cached. Note that the type is of type
     * java.time.Duration, not string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipCacheDuration")
    private final String groupMembershipCacheDuration;

    public String getGroupMembershipCacheDuration() {
        return groupMembershipCacheDuration;
    }

    /**
     * If set to true, the SDK should clear the caches.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flushAllCaches")
    private final Boolean flushAllCaches;

    public Boolean getFlushAllCaches() {
        return flushAllCaches;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ThickAuthorizationResponse(");
        sb.append("policy=").append(String.valueOf(this.policy));
        sb.append(", policyCacheDuration=").append(String.valueOf(this.policyCacheDuration));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", groupMembershipCacheDuration=")
                .append(String.valueOf(this.groupMembershipCacheDuration));
        sb.append(", flushAllCaches=").append(String.valueOf(this.flushAllCaches));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThickAuthorizationResponse)) {
            return false;
        }

        ThickAuthorizationResponse other = (ThickAuthorizationResponse) o;
        return java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.policyCacheDuration, other.policyCacheDuration)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(
                        this.groupMembershipCacheDuration, other.groupMembershipCacheDuration)
                && java.util.Objects.equals(this.flushAllCaches, other.flushAllCaches)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result =
                (result * PRIME)
                        + (this.policyCacheDuration == null
                                ? 43
                                : this.policyCacheDuration.hashCode());
        result = (result * PRIME) + (this.groups == null ? 43 : this.groups.hashCode());
        result =
                (result * PRIME)
                        + (this.groupMembershipCacheDuration == null
                                ? 43
                                : this.groupMembershipCacheDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.flushAllCaches == null ? 43 : this.flushAllCaches.hashCode());
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
