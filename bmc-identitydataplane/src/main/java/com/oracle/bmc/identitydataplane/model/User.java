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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class User {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "isOTP", "isMfaActivated", "isMfaVerified"})
    public User(
            String id, String name, Boolean isOTP, Boolean isMfaActivated, Boolean isMfaVerified) {
        super();
        this.id = id;
        this.name = name;
        this.isOTP = isOTP;
        this.isMfaActivated = isMfaActivated;
        this.isMfaVerified = isMfaVerified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOTP")
        private Boolean isOTP;

        public Builder isOTP(Boolean isOTP) {
            this.isOTP = isOTP;
            this.__explicitlySet__.add("isOTP");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
        private Boolean isMfaActivated;

        public Builder isMfaActivated(Boolean isMfaActivated) {
            this.isMfaActivated = isMfaActivated;
            this.__explicitlySet__.add("isMfaActivated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMfaVerified")
        private Boolean isMfaVerified;

        public Builder isMfaVerified(Boolean isMfaVerified) {
            this.isMfaVerified = isMfaVerified;
            this.__explicitlySet__.add("isMfaVerified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User __instance__ = new User(id, name, isOTP, isMfaActivated, isMfaVerified);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .isOTP(o.getIsOTP())
                            .isMfaActivated(o.getIsMfaActivated())
                            .isMfaVerified(o.getIsMfaVerified());

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
     * The user's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * If the provided password is a one-time password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOTP")
    private final Boolean isOTP;

    public Boolean getIsOTP() {
        return isOTP;
    }

    /**
     * If mfa is activated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
    private final Boolean isMfaActivated;

    public Boolean getIsMfaActivated() {
        return isMfaActivated;
    }

    /**
     * If the user has been mfa verified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaVerified")
    private final Boolean isMfaVerified;

    public Boolean getIsMfaVerified() {
        return isMfaVerified;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("User(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isOTP=").append(String.valueOf(this.isOTP));
        sb.append(", isMfaActivated=").append(String.valueOf(this.isMfaActivated));
        sb.append(", isMfaVerified=").append(String.valueOf(this.isMfaVerified));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User other = (User) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isOTP, other.isOTP)
                && java.util.Objects.equals(this.isMfaActivated, other.isMfaActivated)
                && java.util.Objects.equals(this.isMfaVerified, other.isMfaVerified)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isOTP == null ? 43 : this.isOTP.hashCode());
        result =
                (result * PRIME)
                        + (this.isMfaActivated == null ? 43 : this.isMfaActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.isMfaVerified == null ? 43 : this.isMfaVerified.hashCode());
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
