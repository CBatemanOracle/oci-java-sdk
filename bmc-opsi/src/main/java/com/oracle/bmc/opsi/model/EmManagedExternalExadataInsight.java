/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * EM-managed Exadata insight resource.
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
    builder = EmManagedExternalExadataInsight.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmManagedExternalExadataInsight extends ExadataInsight {
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

        @com.fasterxml.jackson.annotation.JsonProperty("exadataName")
        private String exadataName;

        public Builder exadataName(String exadataName) {
            this.exadataName = exadataName;
            this.__explicitlySet__.add("exadataName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
        private String exadataDisplayName;

        public Builder exadataDisplayName(String exadataDisplayName) {
            this.exadataDisplayName = exadataDisplayName;
            this.__explicitlySet__.add("exadataDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataType")
        private ExadataType exadataType;

        public Builder exadataType(ExadataType exadataType) {
            this.exadataType = exadataType;
            this.__explicitlySet__.add("exadataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataRackType")
        private ExadataRackType exadataRackType;

        public Builder exadataRackType(ExadataRackType exadataRackType) {
            this.exadataRackType = exadataRackType;
            this.__explicitlySet__.add("exadataRackType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVirtualizedExadata")
        private Boolean isVirtualizedExadata;

        public Builder isVirtualizedExadata(Boolean isVirtualizedExadata) {
            this.isVirtualizedExadata = isVirtualizedExadata;
            this.__explicitlySet__.add("isVirtualizedExadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ExadataInsightLifecycleState lifecycleState;

        public Builder lifecycleState(ExadataInsightLifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
        private String enterpriseManagerEntityName;

        public Builder enterpriseManagerEntityName(String enterpriseManagerEntityName) {
            this.enterpriseManagerEntityName = enterpriseManagerEntityName;
            this.__explicitlySet__.add("enterpriseManagerEntityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
        private String enterpriseManagerEntityType;

        public Builder enterpriseManagerEntityType(String enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = enterpriseManagerEntityType;
            this.__explicitlySet__.add("enterpriseManagerEntityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
        private String enterpriseManagerEntityIdentifier;

        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
            this.__explicitlySet__.add("enterpriseManagerEntityIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
        private String enterpriseManagerEntityDisplayName;

        public Builder enterpriseManagerEntityDisplayName(
                String enterpriseManagerEntityDisplayName) {
            this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
            this.__explicitlySet__.add("enterpriseManagerEntityDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
        private String enterpriseManagerBridgeId;

        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            this.__explicitlySet__.add("enterpriseManagerBridgeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoSyncEnabled")
        private Boolean isAutoSyncEnabled;

        public Builder isAutoSyncEnabled(Boolean isAutoSyncEnabled) {
            this.isAutoSyncEnabled = isAutoSyncEnabled;
            this.__explicitlySet__.add("isAutoSyncEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalExadataInsight build() {
            EmManagedExternalExadataInsight __instance__ =
                    new EmManagedExternalExadataInsight(
                            id,
                            compartmentId,
                            exadataName,
                            exadataDisplayName,
                            exadataType,
                            exadataRackType,
                            isVirtualizedExadata,
                            status,
                            freeformTags,
                            definedTags,
                            systemTags,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            enterpriseManagerIdentifier,
                            enterpriseManagerEntityName,
                            enterpriseManagerEntityType,
                            enterpriseManagerEntityIdentifier,
                            enterpriseManagerEntityDisplayName,
                            enterpriseManagerBridgeId,
                            isAutoSyncEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalExadataInsight o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .exadataName(o.getExadataName())
                            .exadataDisplayName(o.getExadataDisplayName())
                            .exadataType(o.getExadataType())
                            .exadataRackType(o.getExadataRackType())
                            .isVirtualizedExadata(o.getIsVirtualizedExadata())
                            .status(o.getStatus())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .enterpriseManagerIdentifier(o.getEnterpriseManagerIdentifier())
                            .enterpriseManagerEntityName(o.getEnterpriseManagerEntityName())
                            .enterpriseManagerEntityType(o.getEnterpriseManagerEntityType())
                            .enterpriseManagerEntityIdentifier(
                                    o.getEnterpriseManagerEntityIdentifier())
                            .enterpriseManagerEntityDisplayName(
                                    o.getEnterpriseManagerEntityDisplayName())
                            .enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId())
                            .isAutoSyncEnabled(o.getIsAutoSyncEnabled());

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

    @Deprecated
    public EmManagedExternalExadataInsight(
            String id,
            String compartmentId,
            String exadataName,
            String exadataDisplayName,
            ExadataType exadataType,
            ExadataRackType exadataRackType,
            Boolean isVirtualizedExadata,
            ResourceStatus status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ExadataInsightLifecycleState lifecycleState,
            String lifecycleDetails,
            String enterpriseManagerIdentifier,
            String enterpriseManagerEntityName,
            String enterpriseManagerEntityType,
            String enterpriseManagerEntityIdentifier,
            String enterpriseManagerEntityDisplayName,
            String enterpriseManagerBridgeId,
            Boolean isAutoSyncEnabled) {
        super(
                id,
                compartmentId,
                exadataName,
                exadataDisplayName,
                exadataType,
                exadataRackType,
                isVirtualizedExadata,
                status,
                freeformTags,
                definedTags,
                systemTags,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerEntityName = enterpriseManagerEntityName;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.isAutoSyncEnabled = isAutoSyncEnabled;
    }

    /**
     * Enterprise Manager Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    private final String enterpriseManagerIdentifier;

    public String getEnterpriseManagerIdentifier() {
        return enterpriseManagerIdentifier;
    }

    /**
     * Enterprise Manager Entity Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
    private final String enterpriseManagerEntityName;

    public String getEnterpriseManagerEntityName() {
        return enterpriseManagerEntityName;
    }

    /**
     * Enterprise Manager Entity Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
    private final String enterpriseManagerEntityType;

    public String getEnterpriseManagerEntityType() {
        return enterpriseManagerEntityType;
    }

    /**
     * Enterprise Manager Entity Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
    private final String enterpriseManagerEntityIdentifier;

    public String getEnterpriseManagerEntityIdentifier() {
        return enterpriseManagerEntityIdentifier;
    }

    /**
     * Enterprise Manager Entity Display Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
    private final String enterpriseManagerEntityDisplayName;

    public String getEnterpriseManagerEntityDisplayName() {
        return enterpriseManagerEntityDisplayName;
    }

    /**
     * OPSI Enterprise Manager Bridge OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
    private final String enterpriseManagerBridgeId;

    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }

    /**
     * Set to true to enable automatic enablement and disablement of related targets from Enterprise Manager. New resources (e.g. Database Insights) will be placed in the same compartment as the related Exadata Insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoSyncEnabled")
    private final Boolean isAutoSyncEnabled;

    public Boolean getIsAutoSyncEnabled() {
        return isAutoSyncEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EmManagedExternalExadataInsight(");
        sb.append("super=").append(super.toString());
        sb.append(", enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerEntityName=")
                .append(String.valueOf(this.enterpriseManagerEntityName));
        sb.append(", enterpriseManagerEntityType=")
                .append(String.valueOf(this.enterpriseManagerEntityType));
        sb.append(", enterpriseManagerEntityIdentifier=")
                .append(String.valueOf(this.enterpriseManagerEntityIdentifier));
        sb.append(", enterpriseManagerEntityDisplayName=")
                .append(String.valueOf(this.enterpriseManagerEntityDisplayName));
        sb.append(", enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(", isAutoSyncEnabled=").append(String.valueOf(this.isAutoSyncEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmManagedExternalExadataInsight)) {
            return false;
        }

        EmManagedExternalExadataInsight other = (EmManagedExternalExadataInsight) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityName, other.enterpriseManagerEntityName)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityType, other.enterpriseManagerEntityType)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityIdentifier,
                        other.enterpriseManagerEntityIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityDisplayName,
                        other.enterpriseManagerEntityDisplayName)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.isAutoSyncEnabled, other.isAutoSyncEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.enterpriseManagerIdentifier == null
                                ? 43
                                : this.enterpriseManagerIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityName == null
                                ? 43
                                : this.enterpriseManagerEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityType == null
                                ? 43
                                : this.enterpriseManagerEntityType.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityIdentifier == null
                                ? 43
                                : this.enterpriseManagerEntityIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityDisplayName == null
                                ? 43
                                : this.enterpriseManagerEntityDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoSyncEnabled == null ? 43 : this.isAutoSyncEnabled.hashCode());
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
