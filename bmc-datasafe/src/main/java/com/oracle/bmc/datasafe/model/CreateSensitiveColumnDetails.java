/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new sensitive column in a sensitive data model.
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
    builder = CreateSensitiveColumnDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSensitiveColumnDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "appName",
        "schemaName",
        "objectName",
        "columnName",
        "objectType",
        "dataType",
        "status",
        "sensitiveTypeId",
        "parentColumnKeys",
        "relationType",
        "appDefinedChildColumnKeys",
        "dbDefinedChildColumnKeys"
    })
    public CreateSensitiveColumnDetails(
            String appName,
            String schemaName,
            String objectName,
            String columnName,
            ObjectType objectType,
            String dataType,
            Status status,
            String sensitiveTypeId,
            java.util.List<String> parentColumnKeys,
            RelationType relationType,
            java.util.List<String> appDefinedChildColumnKeys,
            java.util.List<String> dbDefinedChildColumnKeys) {
        super();
        this.appName = appName;
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.columnName = columnName;
        this.objectType = objectType;
        this.dataType = dataType;
        this.status = status;
        this.sensitiveTypeId = sensitiveTypeId;
        this.parentColumnKeys = parentColumnKeys;
        this.relationType = relationType;
        this.appDefinedChildColumnKeys = appDefinedChildColumnKeys;
        this.dbDefinedChildColumnKeys = dbDefinedChildColumnKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        public CreateSensitiveColumnDetails build() {
            CreateSensitiveColumnDetails __instance__ =
                    new CreateSensitiveColumnDetails(
                            appName,
                            schemaName,
                            objectName,
                            columnName,
                            objectType,
                            dataType,
                            status,
                            sensitiveTypeId,
                            parentColumnKeys,
                            relationType,
                            appDefinedChildColumnKeys,
                            dbDefinedChildColumnKeys);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSensitiveColumnDetails o) {
            Builder copiedBuilder =
                    appName(o.getAppName())
                            .schemaName(o.getSchemaName())
                            .objectName(o.getObjectName())
                            .columnName(o.getColumnName())
                            .objectType(o.getObjectType())
                            .dataType(o.getDataType())
                            .status(o.getStatus())
                            .sensitiveTypeId(o.getSensitiveTypeId())
                            .parentColumnKeys(o.getParentColumnKeys())
                            .relationType(o.getRelationType())
                            .appDefinedChildColumnKeys(o.getAppDefinedChildColumnKeys())
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
     * The name of the application associated with the sensitive column. It's useful when the application name is
     * different from the schema name. Otherwise, it can be ignored. If this attribute is not provided, it's automatically
     * populated with the value provided for the schemaName attribute.
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
        ;

        private final String value;
        private static java.util.Map<String, ObjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (ObjectType v : ObjectType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ObjectType: " + key);
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
     * is not considered sensitive. Tracking invalid columns in a sensitive data model helps ensure that an incremental
     * data discovery job does not identify these columns as sensitive.
     *
     **/
    public enum Status {
        Valid("VALID"),
        Invalid("INVALID"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /**
     * The status of the sensitive column. VALID means the column is considered sensitive. INVALID means the column
     * is not considered sensitive. Tracking invalid columns in a sensitive data model helps ensure that an incremental
     * data discovery job does not identify these columns as sensitive.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * The OCID of the sensitive type to be associated with the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /**
     * Unique keys identifying the columns that are parents of the sensitive column. At present, it accepts only one
     * parent column key. This attribute can be used to establish relationship between columns in a sensitive data model.
     * Note that the parent column must be added to the sensitive data model before its key can be specified here.
     * If this attribute is provided, the appDefinedChildColumnKeys or dbDefinedChildColumnKeys attribute of the parent
     * column is automatically updated to reflect the relationship.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKeys")
    private final java.util.List<String> parentColumnKeys;

    public java.util.List<String> getParentColumnKeys() {
        return parentColumnKeys;
    }

    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the sensitive
     * column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database dictionary.
     * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    public enum RelationType {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),
        ;

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid RelationType: " + key);
        }
    };
    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the sensitive
     * column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database dictionary.
     * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relationType")
    private final RelationType relationType;

    public RelationType getRelationType() {
        return relationType;
    }

    /**
     * Unique keys identifying the columns that are application-level (non-dictionary) children of the sensitive column.
     * This attribute can be used to establish relationship between columns in a sensitive data model. Note that the
     * child columns must be added to the sensitive data model before their keys can be specified here. If this attribute
     * is provided, the parentColumnKeys and relationType attributes of the child columns are automatically updated to reflect the relationship.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appDefinedChildColumnKeys")
    private final java.util.List<String> appDefinedChildColumnKeys;

    public java.util.List<String> getAppDefinedChildColumnKeys() {
        return appDefinedChildColumnKeys;
    }

    /**
     * Unique keys identifying the columns that are database-level (dictionary-defined) children of the sensitive column.
     * This attribute can be used to establish relationship between columns in a sensitive data model. Note that the
     * child columns must be added to the sensitive data model before their keys can be specified here. If this attribute
     * is provided, the parentColumnKeys and relationType attributes of the child columns are automatically updated to reflect the relationship.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbDefinedChildColumnKeys")
    private final java.util.List<String> dbDefinedChildColumnKeys;

    public java.util.List<String> getDbDefinedChildColumnKeys() {
        return dbDefinedChildColumnKeys;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateSensitiveColumnDetails(");
        sb.append("appName=").append(String.valueOf(this.appName));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", parentColumnKeys=").append(String.valueOf(this.parentColumnKeys));
        sb.append(", relationType=").append(String.valueOf(this.relationType));
        sb.append(", appDefinedChildColumnKeys=")
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
        if (!(o instanceof CreateSensitiveColumnDetails)) {
            return false;
        }

        CreateSensitiveColumnDetails other = (CreateSensitiveColumnDetails) o;
        return java.util.Objects.equals(this.appName, other.appName)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.parentColumnKeys, other.parentColumnKeys)
                && java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(
                        this.appDefinedChildColumnKeys, other.appDefinedChildColumnKeys)
                && java.util.Objects.equals(
                        this.dbDefinedChildColumnKeys, other.dbDefinedChildColumnKeys)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result =
                (result * PRIME)
                        + (this.parentColumnKeys == null ? 43 : this.parentColumnKeys.hashCode());
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
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
