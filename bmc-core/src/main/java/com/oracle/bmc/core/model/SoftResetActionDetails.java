/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Parameters for the softReset [instance action](https://docs.cloud.oracle.com/iaas/latest/Instance/InstanceAction). If omitted, default values are used.
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
    builder = SoftResetActionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "actionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoftResetActionDetails extends InstancePowerActionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("allowDenseRebootMigration")
        private Boolean allowDenseRebootMigration;

        public Builder allowDenseRebootMigration(Boolean allowDenseRebootMigration) {
            this.allowDenseRebootMigration = allowDenseRebootMigration;
            this.__explicitlySet__.add("allowDenseRebootMigration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftResetActionDetails build() {
            SoftResetActionDetails __instance__ =
                    new SoftResetActionDetails(allowDenseRebootMigration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftResetActionDetails o) {
            Builder copiedBuilder = allowDenseRebootMigration(o.getAllowDenseRebootMigration());

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

    @Deprecated
    public SoftResetActionDetails(Boolean allowDenseRebootMigration) {
        super();
        this.allowDenseRebootMigration = allowDenseRebootMigration;
    }

    /**
     * For instances with a date in the Maintenance reboot field, the flag denoting whether reboot migration is enabled for instances that use the DenseIO shape. The default value is 'false'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowDenseRebootMigration")
    private final Boolean allowDenseRebootMigration;

    public Boolean getAllowDenseRebootMigration() {
        return allowDenseRebootMigration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SoftResetActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", allowDenseRebootMigration=")
                .append(String.valueOf(this.allowDenseRebootMigration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftResetActionDetails)) {
            return false;
        }

        SoftResetActionDetails other = (SoftResetActionDetails) o;
        return java.util.Objects.equals(
                        this.allowDenseRebootMigration, other.allowDenseRebootMigration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.allowDenseRebootMigration == null
                                ? 43
                                : this.allowDenseRebootMigration.hashCode());
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
