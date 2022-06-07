/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The attributes of a sensitive column that have been modified in the target database. It's populated only in the case
 * of MODIFIED discovery results and shows the new values of the modified attributes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModifiedAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModifiedAttributes {
    @Deprecated
    @java.beans.ConstructorProperties({"appDefinedChildColumnKeys", "dbDefinedChildColumnKeys"})
    public ModifiedAttributes(
            java.util.List<String> appDefinedChildColumnKeys,
            java.util.List<String> dbDefinedChildColumnKeys) {
        super();
        this.appDefinedChildColumnKeys = appDefinedChildColumnKeys;
        this.dbDefinedChildColumnKeys = dbDefinedChildColumnKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("appDefinedChildColumnKeys")
        private java.util.List<String> appDefinedChildColumnKeys;

        public Builder appDefinedChildColumnKeys(java.util.List<String> appDefinedChildColumnKeys) {
            this.appDefinedChildColumnKeys = appDefinedChildColumnKeys;
            this.__explicitlySet__.add("appDefinedChildColumnKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbDefinedChildColumnKeys")
        private java.util.List<String> dbDefinedChildColumnKeys;

        public Builder dbDefinedChildColumnKeys(java.util.List<String> dbDefinedChildColumnKeys) {
            this.dbDefinedChildColumnKeys = dbDefinedChildColumnKeys;
            this.__explicitlySet__.add("dbDefinedChildColumnKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifiedAttributes build() {
            ModifiedAttributes __instance__ =
                    new ModifiedAttributes(appDefinedChildColumnKeys, dbDefinedChildColumnKeys);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifiedAttributes o) {
            Builder copiedBuilder =
                    appDefinedChildColumnKeys(o.getAppDefinedChildColumnKeys())
                            .dbDefinedChildColumnKeys(o.getDbDefinedChildColumnKeys());

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
     * Unique keys identifying the columns that are application-level (non-dictionary) children of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appDefinedChildColumnKeys")
    private final java.util.List<String> appDefinedChildColumnKeys;

    public java.util.List<String> getAppDefinedChildColumnKeys() {
        return appDefinedChildColumnKeys;
    }

    /**
     * Unique keys identifying the columns that are database-level (dictionary-defined) children of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbDefinedChildColumnKeys")
    private final java.util.List<String> dbDefinedChildColumnKeys;

    public java.util.List<String> getDbDefinedChildColumnKeys() {
        return dbDefinedChildColumnKeys;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModifiedAttributes(");
        sb.append("appDefinedChildColumnKeys=")
                .append(String.valueOf(this.appDefinedChildColumnKeys));
        sb.append(", dbDefinedChildColumnKeys=")
                .append(String.valueOf(this.dbDefinedChildColumnKeys));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModifiedAttributes)) {
            return false;
        }

        ModifiedAttributes other = (ModifiedAttributes) o;
        return java.util.Objects.equals(
                        this.appDefinedChildColumnKeys, other.appDefinedChildColumnKeys)
                && java.util.Objects.equals(
                        this.dbDefinedChildColumnKeys, other.dbDefinedChildColumnKeys)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.appDefinedChildColumnKeys == null
                                ? 43
                                : this.appDefinedChildColumnKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.dbDefinedChildColumnKeys == null
                                ? 43
                                : this.dbDefinedChildColumnKeys.hashCode());
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
