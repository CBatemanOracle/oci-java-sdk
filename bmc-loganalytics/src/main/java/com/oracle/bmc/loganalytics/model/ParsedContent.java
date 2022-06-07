/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Parsed representation of the log file.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParsedContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParsedContent {
    @Deprecated
    @java.beans.ConstructorProperties({
        "fieldNames",
        "fieldDisplayNames",
        "parsedFieldValues",
        "logContent",
        "sampleSize",
        "matchStatus"
    })
    public ParsedContent(
            java.util.List<String> fieldNames,
            java.util.List<String> fieldDisplayNames,
            java.util.List<ParsedField> parsedFieldValues,
            String logContent,
            Integer sampleSize,
            String matchStatus) {
        super();
        this.fieldNames = fieldNames;
        this.fieldDisplayNames = fieldDisplayNames;
        this.parsedFieldValues = parsedFieldValues;
        this.logContent = logContent;
        this.sampleSize = sampleSize;
        this.matchStatus = matchStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
        private java.util.List<String> fieldNames;

        public Builder fieldNames(java.util.List<String> fieldNames) {
            this.fieldNames = fieldNames;
            this.__explicitlySet__.add("fieldNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldDisplayNames")
        private java.util.List<String> fieldDisplayNames;

        public Builder fieldDisplayNames(java.util.List<String> fieldDisplayNames) {
            this.fieldDisplayNames = fieldDisplayNames;
            this.__explicitlySet__.add("fieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldValues")
        private java.util.List<ParsedField> parsedFieldValues;

        public Builder parsedFieldValues(java.util.List<ParsedField> parsedFieldValues) {
            this.parsedFieldValues = parsedFieldValues;
            this.__explicitlySet__.add("parsedFieldValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logContent")
        private String logContent;

        public Builder logContent(String logContent) {
            this.logContent = logContent;
            this.__explicitlySet__.add("logContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
        private Integer sampleSize;

        public Builder sampleSize(Integer sampleSize) {
            this.sampleSize = sampleSize;
            this.__explicitlySet__.add("sampleSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
        private String matchStatus;

        public Builder matchStatus(String matchStatus) {
            this.matchStatus = matchStatus;
            this.__explicitlySet__.add("matchStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParsedContent build() {
            ParsedContent __instance__ =
                    new ParsedContent(
                            fieldNames,
                            fieldDisplayNames,
                            parsedFieldValues,
                            logContent,
                            sampleSize,
                            matchStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParsedContent o) {
            Builder copiedBuilder =
                    fieldNames(o.getFieldNames())
                            .fieldDisplayNames(o.getFieldDisplayNames())
                            .parsedFieldValues(o.getParsedFieldValues())
                            .logContent(o.getLogContent())
                            .sampleSize(o.getSampleSize())
                            .matchStatus(o.getMatchStatus());

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
     * List of field names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
    private final java.util.List<String> fieldNames;

    public java.util.List<String> getFieldNames() {
        return fieldNames;
    }

    /**
     * List of field display names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDisplayNames")
    private final java.util.List<String> fieldDisplayNames;

    public java.util.List<String> getFieldDisplayNames() {
        return fieldDisplayNames;
    }

    /**
     * Parsed field values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldValues")
    private final java.util.List<ParsedField> parsedFieldValues;

    public java.util.List<ParsedField> getParsedFieldValues() {
        return parsedFieldValues;
    }

    /**
     * Sample log entries picked up from the given file for validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logContent")
    private final String logContent;

    public String getLogContent() {
        return logContent;
    }

    /**
     * Sample Size taken for validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
    private final Integer sampleSize;

    public Integer getSampleSize() {
        return sampleSize;
    }

    /**
     * Match Status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
    private final String matchStatus;

    public String getMatchStatus() {
        return matchStatus;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ParsedContent(");
        sb.append("fieldNames=").append(String.valueOf(this.fieldNames));
        sb.append(", fieldDisplayNames=").append(String.valueOf(this.fieldDisplayNames));
        sb.append(", parsedFieldValues=").append(String.valueOf(this.parsedFieldValues));
        sb.append(", logContent=").append(String.valueOf(this.logContent));
        sb.append(", sampleSize=").append(String.valueOf(this.sampleSize));
        sb.append(", matchStatus=").append(String.valueOf(this.matchStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParsedContent)) {
            return false;
        }

        ParsedContent other = (ParsedContent) o;
        return java.util.Objects.equals(this.fieldNames, other.fieldNames)
                && java.util.Objects.equals(this.fieldDisplayNames, other.fieldDisplayNames)
                && java.util.Objects.equals(this.parsedFieldValues, other.parsedFieldValues)
                && java.util.Objects.equals(this.logContent, other.logContent)
                && java.util.Objects.equals(this.sampleSize, other.sampleSize)
                && java.util.Objects.equals(this.matchStatus, other.matchStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldNames == null ? 43 : this.fieldNames.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldDisplayNames == null ? 43 : this.fieldDisplayNames.hashCode());
        result =
                (result * PRIME)
                        + (this.parsedFieldValues == null ? 43 : this.parsedFieldValues.hashCode());
        result = (result * PRIME) + (this.logContent == null ? 43 : this.logContent.hashCode());
        result = (result * PRIME) + (this.sampleSize == null ? 43 : this.sampleSize.hashCode());
        result = (result * PRIME) + (this.matchStatus == null ? 43 : this.matchStatus.hashCode());
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
