/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in folder create operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateFolderDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateFolderDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "businessName",
        "description",
        "customPropertyMembers",
        "properties",
        "parentFolderKey",
        "timeExternal",
        "lastJobKey",
        "harvestStatus",
        "typeKey"
    })
    public CreateFolderDetails(
            String displayName,
            String businessName,
            String description,
            java.util.List<CustomPropertySetUsage> customPropertyMembers,
            java.util.Map<String, java.util.Map<String, String>> properties,
            String parentFolderKey,
            java.util.Date timeExternal,
            String lastJobKey,
            HarvestStatus harvestStatus,
            String typeKey) {
        super();
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.customPropertyMembers = customPropertyMembers;
        this.properties = properties;
        this.parentFolderKey = parentFolderKey;
        this.timeExternal = timeExternal;
        this.lastJobKey = lastJobKey;
        this.harvestStatus = harvestStatus;
        this.typeKey = typeKey;
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

        @com.fasterxml.jackson.annotation.JsonProperty("businessName")
        private String businessName;

        public Builder businessName(String businessName) {
            this.businessName = businessName;
            this.__explicitlySet__.add("businessName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
        private String parentFolderKey;

        public Builder parentFolderKey(String parentFolderKey) {
            this.parentFolderKey = parentFolderKey;
            this.__explicitlySet__.add("parentFolderKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
        private java.util.Date timeExternal;

        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            this.__explicitlySet__.add("timeExternal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
        private String lastJobKey;

        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            this.__explicitlySet__.add("lastJobKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
        private HarvestStatus harvestStatus;

        public Builder harvestStatus(HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            this.__explicitlySet__.add("harvestStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFolderDetails build() {
            CreateFolderDetails __instance__ =
                    new CreateFolderDetails(
                            displayName,
                            businessName,
                            description,
                            customPropertyMembers,
                            properties,
                            parentFolderKey,
                            timeExternal,
                            lastJobKey,
                            harvestStatus,
                            typeKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFolderDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .businessName(o.getBusinessName())
                            .description(o.getDescription())
                            .customPropertyMembers(o.getCustomPropertyMembers())
                            .properties(o.getProperties())
                            .parentFolderKey(o.getParentFolderKey())
                            .timeExternal(o.getTimeExternal())
                            .lastJobKey(o.getLastJobKey())
                            .harvestStatus(o.getHarvestStatus())
                            .typeKey(o.getTypeKey());

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
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Optional user friendly business name of the folder. If set, this supplements the harvested display name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    private final String businessName;

    public String getBusinessName() {
        return businessName;
    }

    /**
     * Detailed description of a folder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertySetUsage> customPropertyMembers;

    public java.util.List<CustomPropertySetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * A map of maps that contains the properties which are specific to the folder type. Each folder type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * folders have required properties within the "default" category. To determine the set of optional and
     * required properties for a folder type, a query can be done on '/types?type=folder' that returns a
     * collection of all folder types. The appropriate folder type, which includes definitions of all of
     * it's properties, can be identified from this collection.
     * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    /**
     * The key of the containing folder or null if there isn't a parent folder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
    private final String parentFolderKey;

    public String getParentFolderKey() {
        return parentFolderKey;
    }

    /**
     * Last modified timestamp of this object in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    private final java.util.Date timeExternal;

    public java.util.Date getTimeExternal() {
        return timeExternal;
    }

    /**
     * The job key of the harvest process that updated the folder definition from the source system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
    private final String lastJobKey;

    public String getLastJobKey() {
        return lastJobKey;
    }

    /**
     * Folder harvesting status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
    private final HarvestStatus harvestStatus;

    public HarvestStatus getHarvestStatus() {
        return harvestStatus;
    }

    /**
     * Type key of the object. Type keys can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    public String getTypeKey() {
        return typeKey;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateFolderDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", parentFolderKey=").append(String.valueOf(this.parentFolderKey));
        sb.append(", timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(", lastJobKey=").append(String.valueOf(this.lastJobKey));
        sb.append(", harvestStatus=").append(String.valueOf(this.harvestStatus));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFolderDetails)) {
            return false;
        }

        CreateFolderDetails other = (CreateFolderDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.parentFolderKey, other.parentFolderKey)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.lastJobKey, other.lastJobKey)
                && java.util.Objects.equals(this.harvestStatus, other.harvestStatus)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.parentFolderKey == null ? 43 : this.parentFolderKey.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result = (result * PRIME) + (this.lastJobKey == null ? 43 : this.lastJobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.harvestStatus == null ? 43 : this.harvestStatus.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
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
