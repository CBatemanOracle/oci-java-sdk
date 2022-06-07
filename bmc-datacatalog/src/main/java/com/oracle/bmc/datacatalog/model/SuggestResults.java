/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The list of potential matches returned from the suggest operation for the given input text. The size of the list will be determined
 * by the limit parameter.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestResults.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SuggestResults {
    @Deprecated
    @java.beans.ConstructorProperties({"totalCount", "searchLatencyInMs", "inputText", "items"})
    public SuggestResults(
            Integer totalCount,
            Integer searchLatencyInMs,
            String inputText,
            java.util.List<SuggestListItem> items) {
        super();
        this.totalCount = totalCount;
        this.searchLatencyInMs = searchLatencyInMs;
        this.inputText = inputText;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchLatencyInMs")
        private Integer searchLatencyInMs;

        public Builder searchLatencyInMs(Integer searchLatencyInMs) {
            this.searchLatencyInMs = searchLatencyInMs;
            this.__explicitlySet__.add("searchLatencyInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputText")
        private String inputText;

        public Builder inputText(String inputText) {
            this.inputText = inputText;
            this.__explicitlySet__.add("inputText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SuggestListItem> items;

        public Builder items(java.util.List<SuggestListItem> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestResults build() {
            SuggestResults __instance__ =
                    new SuggestResults(totalCount, searchLatencyInMs, inputText, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestResults o) {
            Builder copiedBuilder =
                    totalCount(o.getTotalCount())
                            .searchLatencyInMs(o.getSearchLatencyInMs())
                            .inputText(o.getInputText())
                            .items(o.getItems());

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
     * Total number of items returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Time taken to compute the result, in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchLatencyInMs")
    private final Integer searchLatencyInMs;

    public Integer getSearchLatencyInMs() {
        return searchLatencyInMs;
    }

    /**
     * Input string for which the potential matches are computed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputText")
    private final String inputText;

    public String getInputText() {
        return inputText;
    }

    /**
     * List of suggestions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SuggestListItem> items;

    public java.util.List<SuggestListItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SuggestResults(");
        sb.append("totalCount=").append(String.valueOf(this.totalCount));
        sb.append(", searchLatencyInMs=").append(String.valueOf(this.searchLatencyInMs));
        sb.append(", inputText=").append(String.valueOf(this.inputText));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestResults)) {
            return false;
        }

        SuggestResults other = (SuggestResults) o;
        return java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.searchLatencyInMs, other.searchLatencyInMs)
                && java.util.Objects.equals(this.inputText, other.inputText)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.searchLatencyInMs == null ? 43 : this.searchLatencyInMs.hashCode());
        result = (result * PRIME) + (this.inputText == null ? 43 : this.inputText.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
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
