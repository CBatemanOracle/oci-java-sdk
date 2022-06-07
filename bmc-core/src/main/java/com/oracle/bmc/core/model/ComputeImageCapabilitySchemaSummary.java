/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for a compute image capability schema
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
    builder = ComputeImageCapabilitySchemaSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeImageCapabilitySchemaSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "computeGlobalImageCapabilitySchemaVersionName",
        "imageId",
        "displayName",
        "schemaData",
        "timeCreated",
        "definedTags",
        "freeformTags"
    })
    public ComputeImageCapabilitySchemaSummary(
            String id,
            String compartmentId,
            String computeGlobalImageCapabilitySchemaVersionName,
            String imageId,
            String displayName,
            java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData,
            java.util.Date timeCreated,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.computeGlobalImageCapabilitySchemaVersionName =
                computeGlobalImageCapabilitySchemaVersionName;
        this.imageId = imageId;
        this.displayName = displayName;
        this.schemaData = schemaData;
        this.timeCreated = timeCreated;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "computeGlobalImageCapabilitySchemaVersionName")
        private String computeGlobalImageCapabilitySchemaVersionName;

        public Builder computeGlobalImageCapabilitySchemaVersionName(
                String computeGlobalImageCapabilitySchemaVersionName) {
            this.computeGlobalImageCapabilitySchemaVersionName =
                    computeGlobalImageCapabilitySchemaVersionName;
            this.__explicitlySet__.add("computeGlobalImageCapabilitySchemaVersionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaData")
        private java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData;

        public Builder schemaData(
                java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData) {
            this.schemaData = schemaData;
            this.__explicitlySet__.add("schemaData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeImageCapabilitySchemaSummary build() {
            ComputeImageCapabilitySchemaSummary __instance__ =
                    new ComputeImageCapabilitySchemaSummary(
                            id,
                            compartmentId,
                            computeGlobalImageCapabilitySchemaVersionName,
                            imageId,
                            displayName,
                            schemaData,
                            timeCreated,
                            definedTags,
                            freeformTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeImageCapabilitySchemaSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .computeGlobalImageCapabilitySchemaVersionName(
                                    o.getComputeGlobalImageCapabilitySchemaVersionName())
                            .imageId(o.getImageId())
                            .displayName(o.getDisplayName())
                            .schemaData(o.getSchemaData())
                            .timeCreated(o.getTimeCreated())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags());

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
     * The compute image capability schema [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment containing the compute global image capability schema
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the compute global image capability schema version
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeGlobalImageCapabilitySchemaVersionName")
    private final String computeGlobalImageCapabilitySchemaVersionName;

    public String getComputeGlobalImageCapabilitySchemaVersionName() {
        return computeGlobalImageCapabilitySchemaVersionName;
    }

    /**
     * The OCID of the image associated with this compute image capability schema
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    public String getImageId() {
        return imageId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * A mapping of each capability name to its ImageCapabilityDescriptor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaData")
    private final java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData;

    public java.util.Map<String, ImageCapabilitySchemaDescriptor> getSchemaData() {
        return schemaData;
    }

    /**
     * The date and time the compute image capability schema was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComputeImageCapabilitySchemaSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", computeGlobalImageCapabilitySchemaVersionName=")
                .append(String.valueOf(this.computeGlobalImageCapabilitySchemaVersionName));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", schemaData=").append(String.valueOf(this.schemaData));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeImageCapabilitySchemaSummary)) {
            return false;
        }

        ComputeImageCapabilitySchemaSummary other = (ComputeImageCapabilitySchemaSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.computeGlobalImageCapabilitySchemaVersionName,
                        other.computeGlobalImageCapabilitySchemaVersionName)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schemaData, other.schemaData)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeGlobalImageCapabilitySchemaVersionName == null
                                ? 43
                                : this.computeGlobalImageCapabilitySchemaVersionName.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.schemaData == null ? 43 : this.schemaData.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
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
