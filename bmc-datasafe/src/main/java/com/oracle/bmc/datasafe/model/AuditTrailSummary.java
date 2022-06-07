/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of an audit trail.
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
    builder = AuditTrailSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditTrailSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "auditProfileId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "status",
        "description",
        "trailLocation",
        "compartmentId",
        "targetId",
        "lifecycleState",
        "lifecycleDetails",
        "isAutoPurgeEnabled",
        "auditCollectionStartTime",
        "freeformTags",
        "definedTags"
    })
    public AuditTrailSummary(
            String id,
            String auditProfileId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            AuditTrailStatus status,
            String description,
            String trailLocation,
            String compartmentId,
            String targetId,
            AuditTrailLifecycleState lifecycleState,
            String lifecycleDetails,
            Boolean isAutoPurgeEnabled,
            java.util.Date auditCollectionStartTime,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.auditProfileId = auditProfileId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.status = status;
        this.description = description;
        this.trailLocation = trailLocation;
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.isAutoPurgeEnabled = isAutoPurgeEnabled;
        this.auditCollectionStartTime = auditCollectionStartTime;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
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

        @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
        private String auditProfileId;

        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = auditProfileId;
            this.__explicitlySet__.add("auditProfileId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AuditTrailStatus status;

        public Builder status(AuditTrailStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
        private String trailLocation;

        public Builder trailLocation(String trailLocation) {
            this.trailLocation = trailLocation;
            this.__explicitlySet__.add("trailLocation");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditTrailLifecycleState lifecycleState;

        public Builder lifecycleState(AuditTrailLifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurgeEnabled")
        private Boolean isAutoPurgeEnabled;

        public Builder isAutoPurgeEnabled(Boolean isAutoPurgeEnabled) {
            this.isAutoPurgeEnabled = isAutoPurgeEnabled;
            this.__explicitlySet__.add("isAutoPurgeEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
        private java.util.Date auditCollectionStartTime;

        public Builder auditCollectionStartTime(java.util.Date auditCollectionStartTime) {
            this.auditCollectionStartTime = auditCollectionStartTime;
            this.__explicitlySet__.add("auditCollectionStartTime");
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

        public AuditTrailSummary build() {
            AuditTrailSummary __instance__ =
                    new AuditTrailSummary(
                            id,
                            auditProfileId,
                            displayName,
                            timeCreated,
                            timeUpdated,
                            status,
                            description,
                            trailLocation,
                            compartmentId,
                            targetId,
                            lifecycleState,
                            lifecycleDetails,
                            isAutoPurgeEnabled,
                            auditCollectionStartTime,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditTrailSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .auditProfileId(o.getAuditProfileId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .status(o.getStatus())
                            .description(o.getDescription())
                            .trailLocation(o.getTrailLocation())
                            .compartmentId(o.getCompartmentId())
                            .targetId(o.getTargetId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .isAutoPurgeEnabled(o.getIsAutoPurgeEnabled())
                            .auditCollectionStartTime(o.getAuditCollectionStartTime())
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
     * The OCID of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the  parent audit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
    private final String auditProfileId;

    public String getAuditProfileId() {
        return auditProfileId;
    }

    /**
     * The display name of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the audit trail was created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the audit trail was updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current sub-state of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final AuditTrailStatus status;

    public AuditTrailStatus getStatus() {
        return status;
    }

    /**
     * The description of audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * An audit trail location represents the source of audit records that provides documentary evidence of the sequence of activities in the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
    private final String trailLocation;

    public String getTrailLocation() {
        return trailLocation;
    }

    /**
     * The OCID of the compartment that contains the audit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the Data Safe target for which the audit trail is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    public String getTargetId() {
        return targetId;
    }

    /**
     * The current state of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AuditTrailLifecycleState lifecycleState;

    public AuditTrailLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the current state of the audit trail in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
     * target database every seven days so that the database's audit trail does not become too large.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurgeEnabled")
    private final Boolean isAutoPurgeEnabled;

    public Boolean getIsAutoPurgeEnabled() {
        return isAutoPurgeEnabled;
    }

    /**
     * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
    private final java.util.Date auditCollectionStartTime;

    public java.util.Date getAuditCollectionStartTime() {
        return auditCollectionStartTime;
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
        sb.append("AuditTrailSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", auditProfileId=").append(String.valueOf(this.auditProfileId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", trailLocation=").append(String.valueOf(this.trailLocation));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", isAutoPurgeEnabled=").append(String.valueOf(this.isAutoPurgeEnabled));
        sb.append(", auditCollectionStartTime=")
                .append(String.valueOf(this.auditCollectionStartTime));
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
        if (!(o instanceof AuditTrailSummary)) {
            return false;
        }

        AuditTrailSummary other = (AuditTrailSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.auditProfileId, other.auditProfileId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.trailLocation, other.trailLocation)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.isAutoPurgeEnabled, other.isAutoPurgeEnabled)
                && java.util.Objects.equals(
                        this.auditCollectionStartTime, other.auditCollectionStartTime)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.auditProfileId == null ? 43 : this.auditProfileId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.trailLocation == null ? 43 : this.trailLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoPurgeEnabled == null
                                ? 43
                                : this.isAutoPurgeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.auditCollectionStartTime == null
                                ? 43
                                : this.auditCollectionStartTime.hashCode());
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
