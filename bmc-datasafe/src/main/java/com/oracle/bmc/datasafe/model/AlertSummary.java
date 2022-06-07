/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a Data Safe Alert.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AlertSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlertSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "status",
        "displayName",
        "description",
        "severity",
        "operationTime",
        "operation",
        "operationStatus",
        "targetIds",
        "targetNames",
        "policyId",
        "alertType",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "featureDetails",
        "freeformTags",
        "definedTags"
    })
    public AlertSummary(
            String id,
            AlertStatus status,
            String displayName,
            String description,
            AlertSeverity severity,
            java.util.Date operationTime,
            String operation,
            OperationStatus operationStatus,
            java.util.List<String> targetIds,
            java.util.List<String> targetNames,
            String policyId,
            AlertType alertType,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            AlertLifecycleState lifecycleState,
            java.util.Map<String, java.util.Map<String, Object>> featureDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.status = status;
        this.displayName = displayName;
        this.description = description;
        this.severity = severity;
        this.operationTime = operationTime;
        this.operation = operation;
        this.operationStatus = operationStatus;
        this.targetIds = targetIds;
        this.targetNames = targetNames;
        this.policyId = policyId;
        this.alertType = alertType;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.featureDetails = featureDetails;
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AlertStatus status;

        public Builder status(AlertStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AlertSeverity severity;

        public Builder severity(AlertSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
        private java.util.Date operationTime;

        public Builder operationTime(java.util.Date operationTime) {
            this.operationTime = operationTime;
            this.__explicitlySet__.add("operationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
        private java.util.List<String> targetIds;

        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            this.__explicitlySet__.add("targetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetNames")
        private java.util.List<String> targetNames;

        public Builder targetNames(java.util.List<String> targetNames) {
            this.targetNames = targetNames;
            this.__explicitlySet__.add("targetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyId")
        private String policyId;

        public Builder policyId(String policyId) {
            this.policyId = policyId;
            this.__explicitlySet__.add("policyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alertType")
        private AlertType alertType;

        public Builder alertType(AlertType alertType) {
            this.alertType = alertType;
            this.__explicitlySet__.add("alertType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        private AlertLifecycleState lifecycleState;

        public Builder lifecycleState(AlertLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("featureDetails")
        private java.util.Map<String, java.util.Map<String, Object>> featureDetails;

        public Builder featureDetails(
                java.util.Map<String, java.util.Map<String, Object>> featureDetails) {
            this.featureDetails = featureDetails;
            this.__explicitlySet__.add("featureDetails");
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

        public AlertSummary build() {
            AlertSummary __instance__ =
                    new AlertSummary(
                            id,
                            status,
                            displayName,
                            description,
                            severity,
                            operationTime,
                            operation,
                            operationStatus,
                            targetIds,
                            targetNames,
                            policyId,
                            alertType,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            featureDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlertSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .status(o.getStatus())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .severity(o.getSeverity())
                            .operationTime(o.getOperationTime())
                            .operation(o.getOperation())
                            .operationStatus(o.getOperationStatus())
                            .targetIds(o.getTargetIds())
                            .targetNames(o.getTargetNames())
                            .policyId(o.getPolicyId())
                            .alertType(o.getAlertType())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .featureDetails(o.getFeatureDetails())
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
     * The OCID of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The status of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final AlertStatus status;

    public AlertStatus getStatus() {
        return status;
    }

    /**
     * The display name of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The details of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Severity level of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final AlertSeverity severity;

    public AlertSeverity getSeverity() {
        return severity;
    }

    /**
     * Creation date and time of the operation that triggered alert, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
    private final java.util.Date operationTime;

    public java.util.Date getOperationTime() {
        return operationTime;
    }

    /**
     * The operation that triggered alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    public String getOperation() {
        return operation;
    }

    /**
     * The result of the operation (event) that triggered alert.
     **/
    public enum OperationStatus {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationStatus.class);

        private final String value;
        private static java.util.Map<String, OperationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationStatus v : OperationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The result of the operation (event) that triggered alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /**
     * Array of OCIDs of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
    private final java.util.List<String> targetIds;

    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /**
     * Array of names of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetNames")
    private final java.util.List<String> targetNames;

    public java.util.List<String> getTargetNames() {
        return targetNames;
    }

    /**
     * The OCID of the policy that triggered alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyId")
    private final String policyId;

    public String getPolicyId() {
        return policyId;
    }

    /**
     * Type of the alert. Indicates the Data Safe feature triggering the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alertType")
    private final AlertType alertType;

    public AlertType getAlertType() {
        return alertType;
    }

    /**
     * The OCID of the compartment that contains the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Creation date and time of the alert, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Last date and time the alert was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AlertLifecycleState lifecycleState;

    public AlertLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Map that contains maps of values.
     *  Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("featureDetails")
    private final java.util.Map<String, java.util.Map<String, Object>> featureDetails;

    public java.util.Map<String, java.util.Map<String, Object>> getFeatureDetails() {
        return featureDetails;
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
        sb.append("AlertSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", operationTime=").append(String.valueOf(this.operationTime));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", targetIds=").append(String.valueOf(this.targetIds));
        sb.append(", targetNames=").append(String.valueOf(this.targetNames));
        sb.append(", policyId=").append(String.valueOf(this.policyId));
        sb.append(", alertType=").append(String.valueOf(this.alertType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", featureDetails=").append(String.valueOf(this.featureDetails));
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
        if (!(o instanceof AlertSummary)) {
            return false;
        }

        AlertSummary other = (AlertSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.operationTime, other.operationTime)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.targetNames, other.targetNames)
                && java.util.Objects.equals(this.policyId, other.policyId)
                && java.util.Objects.equals(this.alertType, other.alertType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.featureDetails, other.featureDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.operationTime == null ? 43 : this.operationTime.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result = (result * PRIME) + (this.targetNames == null ? 43 : this.targetNames.hashCode());
        result = (result * PRIME) + (this.policyId == null ? 43 : this.policyId.hashCode());
        result = (result * PRIME) + (this.alertType == null ? 43 : this.alertType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.featureDetails == null ? 43 : this.featureDetails.hashCode());
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
