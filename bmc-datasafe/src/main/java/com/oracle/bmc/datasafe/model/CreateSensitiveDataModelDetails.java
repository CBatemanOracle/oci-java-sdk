/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new sensitive data model. If schemas and sensitive types are provided, it automatically runs
 * data discovery and adds the discovered columns to the sensitive data model. Otherwise, it creates an empty sensitive
 * data model that can be updated later.
 * To specify some schemas and sensitive types for data discovery, use schemasForDiscovery and sensitiveTypeIdsForDiscovery
 * attributes. But if you want to include all schemas and sensitive types, you can set isIncludeAllSchemas and
 * isIncludeAllSensitiveTypes attributes to true. In the latter case, you do not need to list all schemas and
 * sensitive types.
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
    builder = CreateSensitiveDataModelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSensitiveDataModelDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "targetId",
        "appSuiteName",
        "description",
        "schemasForDiscovery",
        "sensitiveTypeIdsForDiscovery",
        "isSampleDataCollectionEnabled",
        "isAppDefinedRelationDiscoveryEnabled",
        "isIncludeAllSchemas",
        "isIncludeAllSensitiveTypes",
        "freeformTags",
        "definedTags"
    })
    public CreateSensitiveDataModelDetails(
            String displayName,
            String compartmentId,
            String targetId,
            String appSuiteName,
            String description,
            java.util.List<String> schemasForDiscovery,
            java.util.List<String> sensitiveTypeIdsForDiscovery,
            Boolean isSampleDataCollectionEnabled,
            Boolean isAppDefinedRelationDiscoveryEnabled,
            Boolean isIncludeAllSchemas,
            Boolean isIncludeAllSensitiveTypes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.appSuiteName = appSuiteName;
        this.description = description;
        this.schemasForDiscovery = schemasForDiscovery;
        this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
        this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
        this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
        this.isIncludeAllSchemas = isIncludeAllSchemas;
        this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
        private String appSuiteName;

        public Builder appSuiteName(String appSuiteName) {
            this.appSuiteName = appSuiteName;
            this.__explicitlySet__.add("appSuiteName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
        private java.util.List<String> schemasForDiscovery;

        public Builder schemasForDiscovery(java.util.List<String> schemasForDiscovery) {
            this.schemasForDiscovery = schemasForDiscovery;
            this.__explicitlySet__.add("schemasForDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
        private java.util.List<String> sensitiveTypeIdsForDiscovery;

        public Builder sensitiveTypeIdsForDiscovery(
                java.util.List<String> sensitiveTypeIdsForDiscovery) {
            this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
            this.__explicitlySet__.add("sensitiveTypeIdsForDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
        private Boolean isSampleDataCollectionEnabled;

        public Builder isSampleDataCollectionEnabled(Boolean isSampleDataCollectionEnabled) {
            this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
            this.__explicitlySet__.add("isSampleDataCollectionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
        private Boolean isAppDefinedRelationDiscoveryEnabled;

        public Builder isAppDefinedRelationDiscoveryEnabled(
                Boolean isAppDefinedRelationDiscoveryEnabled) {
            this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
            this.__explicitlySet__.add("isAppDefinedRelationDiscoveryEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
        private Boolean isIncludeAllSchemas;

        public Builder isIncludeAllSchemas(Boolean isIncludeAllSchemas) {
            this.isIncludeAllSchemas = isIncludeAllSchemas;
            this.__explicitlySet__.add("isIncludeAllSchemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
        private Boolean isIncludeAllSensitiveTypes;

        public Builder isIncludeAllSensitiveTypes(Boolean isIncludeAllSensitiveTypes) {
            this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
            this.__explicitlySet__.add("isIncludeAllSensitiveTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSensitiveDataModelDetails build() {
            CreateSensitiveDataModelDetails __instance__ =
                    new CreateSensitiveDataModelDetails(
                            displayName,
                            compartmentId,
                            targetId,
                            appSuiteName,
                            description,
                            schemasForDiscovery,
                            sensitiveTypeIdsForDiscovery,
                            isSampleDataCollectionEnabled,
                            isAppDefinedRelationDiscoveryEnabled,
                            isIncludeAllSchemas,
                            isIncludeAllSensitiveTypes,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSensitiveDataModelDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .targetId(o.getTargetId())
                            .appSuiteName(o.getAppSuiteName())
                            .description(o.getDescription())
                            .schemasForDiscovery(o.getSchemasForDiscovery())
                            .sensitiveTypeIdsForDiscovery(o.getSensitiveTypeIdsForDiscovery())
                            .isSampleDataCollectionEnabled(o.getIsSampleDataCollectionEnabled())
                            .isAppDefinedRelationDiscoveryEnabled(
                                    o.getIsAppDefinedRelationDiscoveryEnabled())
                            .isIncludeAllSchemas(o.getIsIncludeAllSchemas())
                            .isIncludeAllSensitiveTypes(o.getIsIncludeAllSensitiveTypes())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The display name of the sensitive data model. The name does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the compartment where the sensitive data model should be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the reference target database to be associated with the sensitive data model. All operations such
     * as performing data discovery and adding columns manually are done in the context of the associated target database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    public String getTargetId() {
        return targetId;
    }

    /**
     * The application suite name identifying a collection of applications. It's useful only if maintaining a sensitive data model for a suite of applications.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
    private final String appSuiteName;

    public String getAppSuiteName() {
        return appSuiteName;
    }

    /**
     * The description of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The schemas to be scanned by data discovery jobs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    private final java.util.List<String> schemasForDiscovery;

    public java.util.List<String> getSchemasForDiscovery() {
        return schemasForDiscovery;
    }

    /**
     * The OCIDs of the sensitive types to be used by data discovery jobs. If OCID of a sensitive category is provided,
     * all its child sensitive types are used for data discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    private final java.util.List<String> sensitiveTypeIdsForDiscovery;

    public java.util.List<String> getSensitiveTypeIdsForDiscovery() {
        return sensitiveTypeIdsForDiscovery;
    }

    /**
     * Indicates if data discovery jobs should collect and store sample data values for the discovered columns.
     * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
     * As it collects original data from the target database, it's disabled by default and should be used only
     * if it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data values
     * are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    private final Boolean isSampleDataCollectionEnabled;

    public Boolean getIsSampleDataCollectionEnabled() {
        return isSampleDataCollectionEnabled;
    }

    /**
     * Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential relationships
     * between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined) relationships.
     * This option helps identify application-level relationships that are not defined in the database dictionary, which in turn,
     * helps identify additional sensitive columns and preserve referential integrity during data masking. It's disabled by default
     * and should be used only if there is a need to identify application-level relationships.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
    private final Boolean isAppDefinedRelationDiscoveryEnabled;

    public Boolean getIsAppDefinedRelationDiscoveryEnabled() {
        return isAppDefinedRelationDiscoveryEnabled;
    }

    /**
     * Indicates if all the schemas in the associated target database should be scanned by data discovery jobs.
     * If it's set to true, the schemasForDiscovery attribute is ignored and all schemas are used for data discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
    private final Boolean isIncludeAllSchemas;

    public Boolean getIsIncludeAllSchemas() {
        return isIncludeAllSchemas;
    }

    /**
     * Indicates if all the existing sensitive types should be used by data discovery jobs. If it's set to true,
     * the sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
    private final Boolean isIncludeAllSensitiveTypes;

    public Boolean getIsIncludeAllSensitiveTypes() {
        return isIncludeAllSensitiveTypes;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateSensitiveDataModelDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", appSuiteName=").append(String.valueOf(this.appSuiteName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", schemasForDiscovery=").append(String.valueOf(this.schemasForDiscovery));
        sb.append(", sensitiveTypeIdsForDiscovery=")
                .append(String.valueOf(this.sensitiveTypeIdsForDiscovery));
        sb.append(", isSampleDataCollectionEnabled=")
                .append(String.valueOf(this.isSampleDataCollectionEnabled));
        sb.append(", isAppDefinedRelationDiscoveryEnabled=")
                .append(String.valueOf(this.isAppDefinedRelationDiscoveryEnabled));
        sb.append(", isIncludeAllSchemas=").append(String.valueOf(this.isIncludeAllSchemas));
        sb.append(", isIncludeAllSensitiveTypes=")
                .append(String.valueOf(this.isIncludeAllSensitiveTypes));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSensitiveDataModelDetails)) {
            return false;
        }

        CreateSensitiveDataModelDetails other = (CreateSensitiveDataModelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.appSuiteName, other.appSuiteName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.schemasForDiscovery, other.schemasForDiscovery)
                && java.util.Objects.equals(
                        this.sensitiveTypeIdsForDiscovery, other.sensitiveTypeIdsForDiscovery)
                && java.util.Objects.equals(
                        this.isSampleDataCollectionEnabled, other.isSampleDataCollectionEnabled)
                && java.util.Objects.equals(
                        this.isAppDefinedRelationDiscoveryEnabled,
                        other.isAppDefinedRelationDiscoveryEnabled)
                && java.util.Objects.equals(this.isIncludeAllSchemas, other.isIncludeAllSchemas)
                && java.util.Objects.equals(
                        this.isIncludeAllSensitiveTypes, other.isIncludeAllSensitiveTypes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.appSuiteName == null ? 43 : this.appSuiteName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.schemasForDiscovery == null
                                ? 43
                                : this.schemasForDiscovery.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeIdsForDiscovery == null
                                ? 43
                                : this.sensitiveTypeIdsForDiscovery.hashCode());
        result =
                (result * PRIME)
                        + (this.isSampleDataCollectionEnabled == null
                                ? 43
                                : this.isSampleDataCollectionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAppDefinedRelationDiscoveryEnabled == null
                                ? 43
                                : this.isAppDefinedRelationDiscoveryEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeAllSchemas == null
                                ? 43
                                : this.isIncludeAllSchemas.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeAllSensitiveTypes == null
                                ? 43
                                : this.isIncludeAllSensitiveTypes.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
