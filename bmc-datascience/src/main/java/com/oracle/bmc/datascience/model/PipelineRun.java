/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Description of PipelineRun. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PipelineRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineRun extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeAccepted",
        "timeStarted",
        "timeUpdated",
        "timeFinished",
        "createdBy",
        "projectId",
        "compartmentId",
        "pipelineId",
        "displayName",
        "configurationDetails",
        "configurationOverrideDetails",
        "logConfigurationOverrideDetails",
        "stepOverrideDetails",
        "logDetails",
        "stepRuns",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public PipelineRun(
            String id,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeUpdated,
            java.util.Date timeFinished,
            String createdBy,
            String projectId,
            String compartmentId,
            String pipelineId,
            String displayName,
            PipelineConfigurationDetails configurationDetails,
            PipelineConfigurationDetails configurationOverrideDetails,
            PipelineLogConfigurationDetails logConfigurationOverrideDetails,
            java.util.List<PipelineStepOverrideDetails> stepOverrideDetails,
            PipelineRunLogDetails logDetails,
            java.util.List<PipelineStepRun> stepRuns,
            PipelineRunLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeUpdated = timeUpdated;
        this.timeFinished = timeFinished;
        this.createdBy = createdBy;
        this.projectId = projectId;
        this.compartmentId = compartmentId;
        this.pipelineId = pipelineId;
        this.displayName = displayName;
        this.configurationDetails = configurationDetails;
        this.configurationOverrideDetails = configurationOverrideDetails;
        this.logConfigurationOverrideDetails = logConfigurationOverrideDetails;
        this.stepOverrideDetails = stepOverrideDetails;
        this.logDetails = logDetails;
        this.stepRuns = stepRuns;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the pipeline run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the pipeline run.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The date and time the pipeline run was accepted in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The date and time the pipeline run was accepted in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeAccepted the value to set
         * @return this builder
         */
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * The date and time the pipeline run request was started in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the pipeline run request was started in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the pipeline run was updated in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the pipeline run was updated in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time the pipeline run request was finished in the timestamp format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the pipeline run request was finished in the timestamp format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the user who created the pipeline run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the user who created the pipeline run.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the project to associate the pipeline run with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the project to associate the pipeline run with.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment where you want to create the pipeline run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment where you want to create the pipeline run.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
        private String pipelineId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the pipeline.
         *
         * @param pipelineId the value to set
         * @return this builder
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            this.__explicitlySet__.add("pipelineId");
            return this;
        }
        /** A user-friendly display name for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
        private PipelineConfigurationDetails configurationDetails;

        public Builder configurationDetails(PipelineConfigurationDetails configurationDetails) {
            this.configurationDetails = configurationDetails;
            this.__explicitlySet__.add("configurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurationOverrideDetails")
        private PipelineConfigurationDetails configurationOverrideDetails;

        public Builder configurationOverrideDetails(
                PipelineConfigurationDetails configurationOverrideDetails) {
            this.configurationOverrideDetails = configurationOverrideDetails;
            this.__explicitlySet__.add("configurationOverrideDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logConfigurationOverrideDetails")
        private PipelineLogConfigurationDetails logConfigurationOverrideDetails;

        public Builder logConfigurationOverrideDetails(
                PipelineLogConfigurationDetails logConfigurationOverrideDetails) {
            this.logConfigurationOverrideDetails = logConfigurationOverrideDetails;
            this.__explicitlySet__.add("logConfigurationOverrideDetails");
            return this;
        }
        /** Array of step override details. Only Step Configuration is allowed to be overridden. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepOverrideDetails")
        private java.util.List<PipelineStepOverrideDetails> stepOverrideDetails;

        /**
         * Array of step override details. Only Step Configuration is allowed to be overridden.
         *
         * @param stepOverrideDetails the value to set
         * @return this builder
         */
        public Builder stepOverrideDetails(
                java.util.List<PipelineStepOverrideDetails> stepOverrideDetails) {
            this.stepOverrideDetails = stepOverrideDetails;
            this.__explicitlySet__.add("stepOverrideDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logDetails")
        private PipelineRunLogDetails logDetails;

        public Builder logDetails(PipelineRunLogDetails logDetails) {
            this.logDetails = logDetails;
            this.__explicitlySet__.add("logDetails");
            return this;
        }
        /** Array of StepRun object for each step. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepRuns")
        private java.util.List<PipelineStepRun> stepRuns;

        /**
         * Array of StepRun object for each step.
         *
         * @param stepRuns the value to set
         * @return this builder
         */
        public Builder stepRuns(java.util.List<PipelineStepRun> stepRuns) {
            this.stepRuns = stepRuns;
            this.__explicitlySet__.add("stepRuns");
            return this;
        }
        /** The current state of the pipeline run. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private PipelineRunLifecycleState lifecycleState;

        /**
         * The current state of the pipeline run.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(PipelineRunLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in 'Failed' state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in 'Failed' state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineRun build() {
            PipelineRun model =
                    new PipelineRun(
                            this.id,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeUpdated,
                            this.timeFinished,
                            this.createdBy,
                            this.projectId,
                            this.compartmentId,
                            this.pipelineId,
                            this.displayName,
                            this.configurationDetails,
                            this.configurationOverrideDetails,
                            this.logConfigurationOverrideDetails,
                            this.stepOverrideDetails,
                            this.logDetails,
                            this.stepRuns,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineRun model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("pipelineId")) {
                this.pipelineId(model.getPipelineId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("configurationDetails")) {
                this.configurationDetails(model.getConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("configurationOverrideDetails")) {
                this.configurationOverrideDetails(model.getConfigurationOverrideDetails());
            }
            if (model.wasPropertyExplicitlySet("logConfigurationOverrideDetails")) {
                this.logConfigurationOverrideDetails(model.getLogConfigurationOverrideDetails());
            }
            if (model.wasPropertyExplicitlySet("stepOverrideDetails")) {
                this.stepOverrideDetails(model.getStepOverrideDetails());
            }
            if (model.wasPropertyExplicitlySet("logDetails")) {
                this.logDetails(model.getLogDetails());
            }
            if (model.wasPropertyExplicitlySet("stepRuns")) {
                this.stepRuns(model.getStepRuns());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the pipeline run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the pipeline run.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The date and time the pipeline run was accepted in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The date and time the pipeline run was accepted in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The date and time the pipeline run request was started in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the pipeline run request was started in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the pipeline run was updated in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the pipeline run was updated in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the pipeline run request was finished in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the pipeline run request was finished in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the user who created the pipeline run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the user who created the pipeline run.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the project to associate the pipeline run with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the project to associate the pipeline run with.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment where you want to create the pipeline run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment where you want to create the pipeline run.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
    private final String pipelineId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the pipeline.
     *
     * @return the value
     */
    public String getPipelineId() {
        return pipelineId;
    }

    /** A user-friendly display name for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    private final PipelineConfigurationDetails configurationDetails;

    public PipelineConfigurationDetails getConfigurationDetails() {
        return configurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configurationOverrideDetails")
    private final PipelineConfigurationDetails configurationOverrideDetails;

    public PipelineConfigurationDetails getConfigurationOverrideDetails() {
        return configurationOverrideDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logConfigurationOverrideDetails")
    private final PipelineLogConfigurationDetails logConfigurationOverrideDetails;

    public PipelineLogConfigurationDetails getLogConfigurationOverrideDetails() {
        return logConfigurationOverrideDetails;
    }

    /** Array of step override details. Only Step Configuration is allowed to be overridden. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepOverrideDetails")
    private final java.util.List<PipelineStepOverrideDetails> stepOverrideDetails;

    /**
     * Array of step override details. Only Step Configuration is allowed to be overridden.
     *
     * @return the value
     */
    public java.util.List<PipelineStepOverrideDetails> getStepOverrideDetails() {
        return stepOverrideDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logDetails")
    private final PipelineRunLogDetails logDetails;

    public PipelineRunLogDetails getLogDetails() {
        return logDetails;
    }

    /** Array of StepRun object for each step. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepRuns")
    private final java.util.List<PipelineStepRun> stepRuns;

    /**
     * Array of StepRun object for each step.
     *
     * @return the value
     */
    public java.util.List<PipelineStepRun> getStepRuns() {
        return stepRuns;
    }

    /** The current state of the pipeline run. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final PipelineRunLifecycleState lifecycleState;

    /**
     * The current state of the pipeline run.
     *
     * @return the value
     */
    public PipelineRunLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in 'Failed' state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in 'Failed' state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PipelineRun(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append(", configurationOverrideDetails=")
                .append(String.valueOf(this.configurationOverrideDetails));
        sb.append(", logConfigurationOverrideDetails=")
                .append(String.valueOf(this.logConfigurationOverrideDetails));
        sb.append(", stepOverrideDetails=").append(String.valueOf(this.stepOverrideDetails));
        sb.append(", logDetails=").append(String.valueOf(this.logDetails));
        sb.append(", stepRuns=").append(String.valueOf(this.stepRuns));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineRun)) {
            return false;
        }

        PipelineRun other = (PipelineRun) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && java.util.Objects.equals(
                        this.configurationOverrideDetails, other.configurationOverrideDetails)
                && java.util.Objects.equals(
                        this.logConfigurationOverrideDetails, other.logConfigurationOverrideDetails)
                && java.util.Objects.equals(this.stepOverrideDetails, other.stepOverrideDetails)
                && java.util.Objects.equals(this.logDetails, other.logDetails)
                && java.util.Objects.equals(this.stepRuns, other.stepRuns)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationDetails == null
                                ? 43
                                : this.configurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationOverrideDetails == null
                                ? 43
                                : this.configurationOverrideDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.logConfigurationOverrideDetails == null
                                ? 43
                                : this.logConfigurationOverrideDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.stepOverrideDetails == null
                                ? 43
                                : this.stepOverrideDetails.hashCode());
        result = (result * PRIME) + (this.logDetails == null ? 43 : this.logDetails.hashCode());
        result = (result * PRIME) + (this.stepRuns == null ? 43 : this.stepRuns.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
