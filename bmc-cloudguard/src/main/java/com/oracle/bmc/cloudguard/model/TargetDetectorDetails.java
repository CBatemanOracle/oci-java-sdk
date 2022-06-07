/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Overriden settings of a Detector Rule applied on target
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TargetDetectorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetDetectorDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "riskLevel",
        "configurations",
        "conditionGroups",
        "labels",
        "isConfigurationAllowed",
        "problemThreshold",
        "targetTypes",
        "sightingTypes"
    })
    public TargetDetectorDetails(
            Boolean isEnabled,
            RiskLevel riskLevel,
            java.util.List<DetectorConfiguration> configurations,
            java.util.List<ConditionGroup> conditionGroups,
            java.util.List<String> labels,
            Boolean isConfigurationAllowed,
            Integer problemThreshold,
            java.util.List<String> targetTypes,
            java.util.List<SightingType> sightingTypes) {
        super();
        this.isEnabled = isEnabled;
        this.riskLevel = riskLevel;
        this.configurations = configurations;
        this.conditionGroups = conditionGroups;
        this.labels = labels;
        this.isConfigurationAllowed = isConfigurationAllowed;
        this.problemThreshold = problemThreshold;
        this.targetTypes = targetTypes;
        this.sightingTypes = sightingTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<DetectorConfiguration> configurations;

        public Builder configurations(java.util.List<DetectorConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
        private java.util.List<ConditionGroup> conditionGroups;

        public Builder conditionGroups(java.util.List<ConditionGroup> conditionGroups) {
            this.conditionGroups = conditionGroups;
            this.__explicitlySet__.add("conditionGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
        private Boolean isConfigurationAllowed;

        public Builder isConfigurationAllowed(Boolean isConfigurationAllowed) {
            this.isConfigurationAllowed = isConfigurationAllowed;
            this.__explicitlySet__.add("isConfigurationAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
        private Integer problemThreshold;

        public Builder problemThreshold(Integer problemThreshold) {
            this.problemThreshold = problemThreshold;
            this.__explicitlySet__.add("problemThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
        private java.util.List<String> targetTypes;

        public Builder targetTypes(java.util.List<String> targetTypes) {
            this.targetTypes = targetTypes;
            this.__explicitlySet__.add("targetTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
        private java.util.List<SightingType> sightingTypes;

        public Builder sightingTypes(java.util.List<SightingType> sightingTypes) {
            this.sightingTypes = sightingTypes;
            this.__explicitlySet__.add("sightingTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetDetectorDetails build() {
            TargetDetectorDetails __instance__ =
                    new TargetDetectorDetails(
                            isEnabled,
                            riskLevel,
                            configurations,
                            conditionGroups,
                            labels,
                            isConfigurationAllowed,
                            problemThreshold,
                            targetTypes,
                            sightingTypes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDetectorDetails o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .riskLevel(o.getRiskLevel())
                            .configurations(o.getConfigurations())
                            .conditionGroups(o.getConditionGroups())
                            .labels(o.getLabels())
                            .isConfigurationAllowed(o.getIsConfigurationAllowed())
                            .problemThreshold(o.getProblemThreshold())
                            .targetTypes(o.getTargetTypes())
                            .sightingTypes(o.getSightingTypes());

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
     * Enables the control
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * Configuration details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<DetectorConfiguration> configurations;

    public java.util.List<DetectorConfiguration> getConfigurations() {
        return configurations;
    }

    /**
     * Condition group corresponding to each compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionGroups")
    private final java.util.List<ConditionGroup> conditionGroups;

    public java.util.List<ConditionGroup> getConditionGroups() {
        return conditionGroups;
    }

    /**
     * user defined labels for a detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * configuration allowed or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
    private final Boolean isConfigurationAllowed;

    public Boolean getIsConfigurationAllowed() {
        return isConfigurationAllowed;
    }

    /**
     * Cutover point for an elevated resource Risk Score to create a Problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
    private final Integer problemThreshold;

    public Integer getProblemThreshold() {
        return problemThreshold;
    }

    /**
     * List of target types for which the detector rule is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
    private final java.util.List<String> targetTypes;

    public java.util.List<String> getTargetTypes() {
        return targetTypes;
    }

    /**
     * List of sighting types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
    private final java.util.List<SightingType> sightingTypes;

    public java.util.List<SightingType> getSightingTypes() {
        return sightingTypes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetDetectorDetails(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", conditionGroups=").append(String.valueOf(this.conditionGroups));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", isConfigurationAllowed=").append(String.valueOf(this.isConfigurationAllowed));
        sb.append(", problemThreshold=").append(String.valueOf(this.problemThreshold));
        sb.append(", targetTypes=").append(String.valueOf(this.targetTypes));
        sb.append(", sightingTypes=").append(String.valueOf(this.sightingTypes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetectorDetails)) {
            return false;
        }

        TargetDetectorDetails other = (TargetDetectorDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.conditionGroups, other.conditionGroups)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(
                        this.isConfigurationAllowed, other.isConfigurationAllowed)
                && java.util.Objects.equals(this.problemThreshold, other.problemThreshold)
                && java.util.Objects.equals(this.targetTypes, other.targetTypes)
                && java.util.Objects.equals(this.sightingTypes, other.sightingTypes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionGroups == null ? 43 : this.conditionGroups.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.isConfigurationAllowed == null
                                ? 43
                                : this.isConfigurationAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.problemThreshold == null ? 43 : this.problemThreshold.hashCode());
        result = (result * PRIME) + (this.targetTypes == null ? 43 : this.targetTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.sightingTypes == null ? 43 : this.sightingTypes.hashCode());
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
