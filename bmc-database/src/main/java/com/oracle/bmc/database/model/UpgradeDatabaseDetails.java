/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for upgrading a database to a specific Oracle Database version.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpgradeDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpgradeDatabaseDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "databaseUpgradeSourceDetails"})
    public UpgradeDatabaseDetails(
            Action action, DatabaseUpgradeSourceBase databaseUpgradeSourceDetails) {
        super();
        this.action = action;
        this.databaseUpgradeSourceDetails = databaseUpgradeSourceDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseUpgradeSourceDetails")
        private DatabaseUpgradeSourceBase databaseUpgradeSourceDetails;

        public Builder databaseUpgradeSourceDetails(
                DatabaseUpgradeSourceBase databaseUpgradeSourceDetails) {
            this.databaseUpgradeSourceDetails = databaseUpgradeSourceDetails;
            this.__explicitlySet__.add("databaseUpgradeSourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeDatabaseDetails build() {
            UpgradeDatabaseDetails __instance__ =
                    new UpgradeDatabaseDetails(action, databaseUpgradeSourceDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeDatabaseDetails o) {
            Builder copiedBuilder =
                    action(o.getAction())
                            .databaseUpgradeSourceDetails(o.getDatabaseUpgradeSourceDetails());

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
     * The database upgrade action.
     **/
    public enum Action {
        Precheck("PRECHECK"),
        Upgrade("UPGRADE"),
        Rollback("ROLLBACK"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /**
     * The database upgrade action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    public Action getAction() {
        return action;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseUpgradeSourceDetails")
    private final DatabaseUpgradeSourceBase databaseUpgradeSourceDetails;

    public DatabaseUpgradeSourceBase getDatabaseUpgradeSourceDetails() {
        return databaseUpgradeSourceDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpgradeDatabaseDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", databaseUpgradeSourceDetails=")
                .append(String.valueOf(this.databaseUpgradeSourceDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeDatabaseDetails)) {
            return false;
        }

        UpgradeDatabaseDetails other = (UpgradeDatabaseDetails) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(
                        this.databaseUpgradeSourceDetails, other.databaseUpgradeSourceDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseUpgradeSourceDetails == null
                                ? 43
                                : this.databaseUpgradeSourceDetails.hashCode());
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
