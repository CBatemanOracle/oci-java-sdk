/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Description of Transcription Job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TranscriptionJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TranscriptionJob {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "modelDetails",
        "normalization",
        "timeAccepted",
        "timeStarted",
        "timeFinished",
        "totalTasks",
        "outstandingTasks",
        "successfulTasks",
        "ttlInDays",
        "percentComplete",
        "inputLocation",
        "outputLocation",
        "createdBy",
        "additionalTranscriptionFormats",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public TranscriptionJob(
            String id,
            String displayName,
            String compartmentId,
            String description,
            TranscriptionModelDetails modelDetails,
            TranscriptionNormalization normalization,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Integer totalTasks,
            Integer outstandingTasks,
            Integer successfulTasks,
            Integer ttlInDays,
            Integer percentComplete,
            InputLocation inputLocation,
            OutputLocation outputLocation,
            String createdBy,
            java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.modelDetails = modelDetails;
        this.normalization = normalization;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.totalTasks = totalTasks;
        this.outstandingTasks = outstandingTasks;
        this.successfulTasks = successfulTasks;
        this.ttlInDays = ttlInDays;
        this.percentComplete = percentComplete;
        this.inputLocation = inputLocation;
        this.outputLocation = outputLocation;
        this.createdBy = createdBy;
        this.additionalTranscriptionFormats = additionalTranscriptionFormats;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
        private TranscriptionModelDetails modelDetails;

        public Builder modelDetails(TranscriptionModelDetails modelDetails) {
            this.modelDetails = modelDetails;
            this.__explicitlySet__.add("modelDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("normalization")
        private TranscriptionNormalization normalization;

        public Builder normalization(TranscriptionNormalization normalization) {
            this.normalization = normalization;
            this.__explicitlySet__.add("normalization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalTasks")
        private Integer totalTasks;

        public Builder totalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            this.__explicitlySet__.add("totalTasks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outstandingTasks")
        private Integer outstandingTasks;

        public Builder outstandingTasks(Integer outstandingTasks) {
            this.outstandingTasks = outstandingTasks;
            this.__explicitlySet__.add("outstandingTasks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("successfulTasks")
        private Integer successfulTasks;

        public Builder successfulTasks(Integer successfulTasks) {
            this.successfulTasks = successfulTasks;
            this.__explicitlySet__.add("successfulTasks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
        private Integer ttlInDays;

        public Builder ttlInDays(Integer ttlInDays) {
            this.ttlInDays = ttlInDays;
            this.__explicitlySet__.add("ttlInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private InputLocation inputLocation;

        public Builder inputLocation(InputLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
        private OutputLocation outputLocation;

        public Builder outputLocation(OutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            this.__explicitlySet__.add("outputLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalTranscriptionFormats")
        private java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats;

        public Builder additionalTranscriptionFormats(
                java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats) {
            this.additionalTranscriptionFormats = additionalTranscriptionFormats;
            this.__explicitlySet__.add("additionalTranscriptionFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TranscriptionJob build() {
            TranscriptionJob __instance__ =
                    new TranscriptionJob(
                            id,
                            displayName,
                            compartmentId,
                            description,
                            modelDetails,
                            normalization,
                            timeAccepted,
                            timeStarted,
                            timeFinished,
                            totalTasks,
                            outstandingTasks,
                            successfulTasks,
                            ttlInDays,
                            percentComplete,
                            inputLocation,
                            outputLocation,
                            createdBy,
                            additionalTranscriptionFormats,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranscriptionJob o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .modelDetails(o.getModelDetails())
                            .normalization(o.getNormalization())
                            .timeAccepted(o.getTimeAccepted())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .totalTasks(o.getTotalTasks())
                            .outstandingTasks(o.getOutstandingTasks())
                            .successfulTasks(o.getSuccessfulTasks())
                            .ttlInDays(o.getTtlInDays())
                            .percentComplete(o.getPercentComplete())
                            .inputLocation(o.getInputLocation())
                            .outputLocation(o.getOutputLocation())
                            .createdBy(o.getCreatedBy())
                            .additionalTranscriptionFormats(o.getAdditionalTranscriptionFormats())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * A user-friendly display name for the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A short description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDetails")
    private final TranscriptionModelDetails modelDetails;

    public TranscriptionModelDetails getModelDetails() {
        return modelDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("normalization")
    private final TranscriptionNormalization normalization;

    public TranscriptionNormalization getNormalization() {
        return normalization;
    }

    /**
     * Job accepted time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * Job started time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Job finished time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * Total tasks in a job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalTasks")
    private final Integer totalTasks;

    public Integer getTotalTasks() {
        return totalTasks;
    }

    /**
     * Total outstanding tasks in a job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outstandingTasks")
    private final Integer outstandingTasks;

    public Integer getOutstandingTasks() {
        return outstandingTasks;
    }

    /**
     * Total successful tasks in a job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("successfulTasks")
    private final Integer successfulTasks;

    public Integer getSuccessfulTasks() {
        return successfulTasks;
    }

    /**
     * Time to live duration in days for Job. Job will be available till max 90 days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
    private final Integer ttlInDays;

    public Integer getTtlInDays() {
        return ttlInDays;
    }

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    public Integer getPercentComplete() {
        return percentComplete;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final InputLocation inputLocation;

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final OutputLocation outputLocation;

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    /**
     **/
    public enum AdditionalTranscriptionFormats {
        Srt("SRT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AdditionalTranscriptionFormats.class);

        private final String value;
        private static java.util.Map<String, AdditionalTranscriptionFormats> map;

        static {
            map = new java.util.HashMap<>();
            for (AdditionalTranscriptionFormats v : AdditionalTranscriptionFormats.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AdditionalTranscriptionFormats(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AdditionalTranscriptionFormats create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AdditionalTranscriptionFormats', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Transcription format. JSON format will always be provided in addition to any formats in this list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalTranscriptionFormats")
    private final java.util.List<AdditionalTranscriptionFormats> additionalTranscriptionFormats;

    public java.util.List<AdditionalTranscriptionFormats> getAdditionalTranscriptionFormats() {
        return additionalTranscriptionFormats;
    }

    /**
     * The current state of the Job.
     **/
    public enum LifecycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TranscriptionJob(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelDetails=").append(String.valueOf(this.modelDetails));
        sb.append(", normalization=").append(String.valueOf(this.normalization));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", totalTasks=").append(String.valueOf(this.totalTasks));
        sb.append(", outstandingTasks=").append(String.valueOf(this.outstandingTasks));
        sb.append(", successfulTasks=").append(String.valueOf(this.successfulTasks));
        sb.append(", ttlInDays=").append(String.valueOf(this.ttlInDays));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", additionalTranscriptionFormats=")
                .append(String.valueOf(this.additionalTranscriptionFormats));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TranscriptionJob)) {
            return false;
        }

        TranscriptionJob other = (TranscriptionJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.modelDetails, other.modelDetails)
                && java.util.Objects.equals(this.normalization, other.normalization)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.totalTasks, other.totalTasks)
                && java.util.Objects.equals(this.outstandingTasks, other.outstandingTasks)
                && java.util.Objects.equals(this.successfulTasks, other.successfulTasks)
                && java.util.Objects.equals(this.ttlInDays, other.ttlInDays)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(
                        this.additionalTranscriptionFormats, other.additionalTranscriptionFormats)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.modelDetails == null ? 43 : this.modelDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.normalization == null ? 43 : this.normalization.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.totalTasks == null ? 43 : this.totalTasks.hashCode());
        result =
                (result * PRIME)
                        + (this.outstandingTasks == null ? 43 : this.outstandingTasks.hashCode());
        result =
                (result * PRIME)
                        + (this.successfulTasks == null ? 43 : this.successfulTasks.hashCode());
        result = (result * PRIME) + (this.ttlInDays == null ? 43 : this.ttlInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result =
                (result * PRIME)
                        + (this.inputLocation == null ? 43 : this.inputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalTranscriptionFormats == null
                                ? 43
                                : this.additionalTranscriptionFormats.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
