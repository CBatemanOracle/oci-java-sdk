/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.model;

/**
 * Search request object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SearchLogsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchLogsDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "searchQuery", "isReturnFieldInfo"})
    public SearchLogsDetails(
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String searchQuery,
            Boolean isReturnFieldInfo) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.searchQuery = searchQuery;
        this.isReturnFieldInfo = isReturnFieldInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("searchQuery")
        private String searchQuery;

        public Builder searchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            this.__explicitlySet__.add("searchQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReturnFieldInfo")
        private Boolean isReturnFieldInfo;

        public Builder isReturnFieldInfo(Boolean isReturnFieldInfo) {
            this.isReturnFieldInfo = isReturnFieldInfo;
            this.__explicitlySet__.add("isReturnFieldInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchLogsDetails build() {
            SearchLogsDetails __instance__ =
                    new SearchLogsDetails(timeStart, timeEnd, searchQuery, isReturnFieldInfo);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchLogsDetails o) {
            Builder copiedBuilder =
                    timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .searchQuery(o.getSearchQuery())
                            .isReturnFieldInfo(o.getIsReturnFieldInfo());

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
     * Start filter log's date and time, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * End filter log's date and time, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Query corresponding to the search operation. This query is parsed and validated before execution and
     * should follow the specification. For more information on the query language specification, see
     * [Logging Query Language Specification](https://docs.cloud.oracle.com/Content/Logging/Reference/query_language_specification.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchQuery")
    private final String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Whether to return field schema information for the log stream specified in searchQuery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReturnFieldInfo")
    private final Boolean isReturnFieldInfo;

    public Boolean getIsReturnFieldInfo() {
        return isReturnFieldInfo;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchLogsDetails(");
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", searchQuery=").append(String.valueOf(this.searchQuery));
        sb.append(", isReturnFieldInfo=").append(String.valueOf(this.isReturnFieldInfo));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchLogsDetails)) {
            return false;
        }

        SearchLogsDetails other = (SearchLogsDetails) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.searchQuery, other.searchQuery)
                && java.util.Objects.equals(this.isReturnFieldInfo, other.isReturnFieldInfo)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.searchQuery == null ? 43 : this.searchQuery.hashCode());
        result =
                (result * PRIME)
                        + (this.isReturnFieldInfo == null ? 43 : this.isReturnFieldInfo.hashCode());
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
