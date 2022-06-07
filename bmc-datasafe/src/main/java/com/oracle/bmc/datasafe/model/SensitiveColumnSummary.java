/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a sensitive column present in a sensitive data model.
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
    builder = SensitiveColumnSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SensitiveColumnSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "sensitiveDataModelId",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "appName",
        "schemaName",
        "objectName",
        "columnName",
        "objectType",
        "dataType",
        "status",
        "sensitiveTypeId",
        "source",
        "parentColumnKeys",
        "relationType",
        "estimatedDataValueCount",
        "sampleDataValues"
    })
    public SensitiveColumnSummary(
            String key,
            String sensitiveDataModelId,
            SensitiveColumnLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String appName,
            String schemaName,
            String objectName,
            String columnName,
            ObjectType objectType,
            String dataType,
            Status status,
            String sensitiveTypeId,
            Source source,
            java.util.List<String> parentColumnKeys,
            RelationType relationType,
            Long estimatedDataValueCount,
            java.util.List<String> sampleDataValues) {
        super();
        this.key = key;
        this.sensitiveDataModelId = sensitiveDataModelId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.appName = appName;
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.columnName = columnName;
        this.objectType = objectType;
        this.dataType = dataType;
        this.status = status;
        this.sensitiveTypeId = sensitiveTypeId;
        this.source = source;
        this.parentColumnKeys = parentColumnKeys;
        this.relationType = relationType;
        this.estimatedDataValueCount = estimatedDataValueCount;
        this.sampleDataValues = sampleDataValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SensitiveColumnLifecycleState lifecycleState;

        public Builder lifecycleState(SensitiveColumnLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appName")
        private String appName;

        public Builder appName(String appName) {
            this.appName = appName;
            this.__explicitlySet__.add("appName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

        public Builder source(Source source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKeys")
        private java.util.List<String> parentColumnKeys;

        public Builder parentColumnKeys(java.util.List<String> parentColumnKeys) {
            this.parentColumnKeys = parentColumnKeys;
            this.__explicitlySet__.add("parentColumnKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relationType")
        private RelationType relationType;

        public Builder relationType(RelationType relationType) {
            this.relationType = relationType;
            this.__explicitlySet__.add("relationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedDataValueCount")
        private Long estimatedDataValueCount;

        public Builder estimatedDataValueCount(Long estimatedDataValueCount) {
            this.estimatedDataValueCount = estimatedDataValueCount;
            this.__explicitlySet__.add("estimatedDataValueCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampleDataValues")
        private java.util.List<String> sampleDataValues;

        public Builder sampleDataValues(java.util.List<String> sampleDataValues) {
            this.sampleDataValues = sampleDataValues;
            this.__explicitlySet__.add("sampleDataValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SensitiveColumnSummary build() {
            SensitiveColumnSummary __instance__ =
                    new SensitiveColumnSummary(
                            key,
                            sensitiveDataModelId,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            timeUpdated,
                            appName,
                            schemaName,
                            objectName,
                            columnName,
                            objectType,
                            dataType,
                            status,
                            sensitiveTypeId,
                            source,
                            parentColumnKeys,
                            relationType,
                            estimatedDataValueCount,
                            sampleDataValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SensitiveColumnSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .sensitiveDataModelId(o.getSensitiveDataModelId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .appName(o.getAppName())
                            .schemaName(o.getSchemaName())
                            .objectName(o.getObjectName())
                            .columnName(o.getColumnName())
                            .objectType(o.getObjectType())
                            .dataType(o.getDataType())
                            .status(o.getStatus())
                            .sensitiveTypeId(o.getSensitiveTypeId())
                            .source(o.getSource())
                            .parentColumnKeys(o.getParentColumnKeys())
                            .relationType(o.getRelationType())
                            .estimatedDataValueCount(o.getEstimatedDataValueCount())
                            .sampleDataValues(o.getSampleDataValues());

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
     * The unique key that identifies the sensitive column. It's numeric and unique within a sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * The OCID of the sensitive data model that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    private final String sensitiveDataModelId;

    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }

    /**
     * The current state of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SensitiveColumnLifecycleState lifecycleState;

    public SensitiveColumnLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the current state of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * the sensitive column was created in the sensitive data model.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * the sensitive column was last updated in the sensitive data model.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The name of the application associated with the sensitive column. It's useful when the application name is
     * different from the schema name. Otherwise, it can be ignored.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appName")
    private final String appName;

    public String getAppName() {
        return appName;
    }

    /**
     * The database schema that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    public String getSchemaName() {
        return schemaName;
    }

    /**
     * The database object that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    public String getObjectName() {
        return objectName;
    }

    /**
     * The name of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    public String getColumnName() {
        return columnName;
    }

    /**
     * The type of the database object that contains the sensitive column.
     **/
    public enum ObjectType {
        Table("TABLE"),
        EditioningView("EDITIONING_VIEW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ObjectType.class);

        private final String value;
        private static java.util.Map<String, ObjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (ObjectType v : ObjectType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ObjectType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ObjectType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ObjectType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the database object that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * The data type of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    public String getDataType() {
        return dataType;
    }

    /**
     * The status of the sensitive column. VALID means the column is considered sensitive. INVALID means the column
     * is not considered sensitive. Tracking invalid columns in a sensitive data model helps ensure that an
     * incremental data discovery job does not identify these columns as sensitive again.
     *
     **/
    public enum Status {
        Valid("VALID"),
        Invalid("INVALID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the sensitive column. VALID means the column is considered sensitive. INVALID means the column
     * is not considered sensitive. Tracking invalid columns in a sensitive data model helps ensure that an
     * incremental data discovery job does not identify these columns as sensitive again.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * The OCID of the sensitive type associated with the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /**
     * The source of the sensitive column. DISCOVERY indicates that the column was added to the sensitive data model
     * using a data discovery job. MANUAL indicates that the column was added manually.
     *
     **/
    public enum Source {
        Manual("MANUAL"),
        Discovery("DISCOVERY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Source.class);

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Source', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source of the sensitive column. DISCOVERY indicates that the column was added to the sensitive data model
     * using a data discovery job. MANUAL indicates that the column was added manually.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

    public Source getSource() {
        return source;
    }

    /**
     * Unique keys identifying the columns that are parents of the sensitive column. At present, it tracks a single parent only.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKeys")
    private final java.util.List<String> parentColumnKeys;

    public java.util.List<String> getParentColumnKeys() {
        return parentColumnKeys;
    }

    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the
     * sensitive column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database
     * dictionary. APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    public enum RelationType {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RelationType.class);

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RelationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RelationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RelationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the
     * sensitive column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database
     * dictionary. APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relationType")
    private final RelationType relationType;

    public RelationType getRelationType() {
        return relationType;
    }

    /**
     * The estimated number of data values the column has in the associated database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedDataValueCount")
    private final Long estimatedDataValueCount;

    public Long getEstimatedDataValueCount() {
        return estimatedDataValueCount;
    }

    /**
     * Original data values collected for the sensitive column from the associated database. Sample data helps review
     * the column and ensure that it actually contains sensitive data. Note that sample data is retrieved by a data
     * discovery job only if the isSampleDataCollectionEnabled attribute is set to true. At present, only one data
     * value is collected per sensitive column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleDataValues")
    private final java.util.List<String> sampleDataValues;

    public java.util.List<String> getSampleDataValues() {
        return sampleDataValues;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SensitiveColumnSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", appName=").append(String.valueOf(this.appName));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", parentColumnKeys=").append(String.valueOf(this.parentColumnKeys));
        sb.append(", relationType=").append(String.valueOf(this.relationType));
        sb.append(", estimatedDataValueCount=")
                .append(String.valueOf(this.estimatedDataValueCount));
        sb.append(", sampleDataValues=").append(String.valueOf(this.sampleDataValues));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SensitiveColumnSummary)) {
            return false;
        }

        SensitiveColumnSummary other = (SensitiveColumnSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.appName, other.appName)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.parentColumnKeys, other.parentColumnKeys)
                && java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(
                        this.estimatedDataValueCount, other.estimatedDataValueCount)
                && java.util.Objects.equals(this.sampleDataValues, other.sampleDataValues)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.appName == null ? 43 : this.appName.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result =
                (result * PRIME)
                        + (this.parentColumnKeys == null ? 43 : this.parentColumnKeys.hashCode());
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedDataValueCount == null
                                ? 43
                                : this.estimatedDataValueCount.hashCode());
        result =
                (result * PRIME)
                        + (this.sampleDataValues == null ? 43 : this.sampleDataValues.hashCode());
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
