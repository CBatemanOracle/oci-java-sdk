/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * A dimension name and value.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DimensionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DimensionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "dimensionValue"})
    public DimensionDetails(String name, DimensionValueDetails dimensionValue) {
        super();
        this.name = name;
        this.dimensionValue = dimensionValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
        private DimensionValueDetails dimensionValue;

        public Builder dimensionValue(DimensionValueDetails dimensionValue) {
            this.dimensionValue = dimensionValue;
            this.__explicitlySet__.add("dimensionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DimensionDetails build() {
            DimensionDetails __instance__ = new DimensionDetails(name, dimensionValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DimensionDetails o) {
            Builder copiedBuilder = name(o.getName()).dimensionValue(o.getDimensionValue());

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
     * Dimension key. A valid dimension key includes only printable ASCII, excluding periods (.) and spaces.
     * Custom dimension keys are acceptable. Avoid entering confidential information.
     * Due to use by Service Connector Hub, the following dimension names are reserved: {@code connectorId}, {@code connectorName}, {@code connectorSourceType}.
     * For information on valid dimension keys and values, see {@link #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}.
     * Example: {@code type}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
    private final DimensionValueDetails dimensionValue;

    public DimensionValueDetails getDimensionValue() {
        return dimensionValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DimensionDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", dimensionValue=").append(String.valueOf(this.dimensionValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DimensionDetails)) {
            return false;
        }

        DimensionDetails other = (DimensionDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dimensionValue, other.dimensionValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionValue == null ? 43 : this.dimensionValue.hashCode());
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
