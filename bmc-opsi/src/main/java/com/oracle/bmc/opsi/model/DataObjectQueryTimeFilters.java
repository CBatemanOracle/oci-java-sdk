/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Time filters to be applied in the data object query.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataObjectQueryTimeFilters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataObjectQueryTimeFilters {
    @Deprecated
    @java.beans.ConstructorProperties({"timePeriod", "timeStart", "timeEnd"})
    public DataObjectQueryTimeFilters(
            String timePeriod, java.util.Date timeStart, java.util.Date timeEnd) {
        super();
        this.timePeriod = timePeriod;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timePeriod")
        private String timePeriod;

        public Builder timePeriod(String timePeriod) {
            this.timePeriod = timePeriod;
            this.__explicitlySet__.add("timePeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataObjectQueryTimeFilters build() {
            DataObjectQueryTimeFilters __instance__ =
                    new DataObjectQueryTimeFilters(timePeriod, timeStart, timeEnd);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataObjectQueryTimeFilters o) {
            Builder copiedBuilder =
                    timePeriod(o.getTimePeriod())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd());

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
     * Specify time period in ISO 8601 format with respect to current time.
     * Default is last 30 days represented by P30D.
     * If timePeriod is specified, then timeStart and timeEnd will be ignored.
     * Examples: P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePeriod")
    private final String timePeriod;

    public String getTimePeriod() {
        return timePeriod;
    }

    /**
     * Start time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
     * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is ignored.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * End time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
     * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is ignored.
     * If timeEnd is not specified, current time is used as timeEnd.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataObjectQueryTimeFilters(");
        sb.append("timePeriod=").append(String.valueOf(this.timePeriod));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectQueryTimeFilters)) {
            return false;
        }

        DataObjectQueryTimeFilters other = (DataObjectQueryTimeFilters) o;
        return java.util.Objects.equals(this.timePeriod, other.timePeriod)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timePeriod == null ? 43 : this.timePeriod.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
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
