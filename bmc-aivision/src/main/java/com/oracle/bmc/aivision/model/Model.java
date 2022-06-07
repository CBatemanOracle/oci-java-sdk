/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Machine-learned Model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Model.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Model {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "modelType",
        "isQuickMode",
        "maxTrainingDurationInHours",
        "trainedDurationInHours",
        "trainingDataset",
        "testingDataset",
        "validationDataset",
        "modelVersion",
        "projectId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "precision",
        "recall",
        "averagePrecision",
        "confidenceThreshold",
        "totalImageCount",
        "testImageCount",
        "metrics",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Model(
            String id,
            String displayName,
            String description,
            String compartmentId,
            ModelType modelType,
            Boolean isQuickMode,
            Double maxTrainingDurationInHours,
            Double trainedDurationInHours,
            Dataset trainingDataset,
            Dataset testingDataset,
            Dataset validationDataset,
            String modelVersion,
            String projectId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Float precision,
            Float recall,
            Float averagePrecision,
            Float confidenceThreshold,
            Integer totalImageCount,
            Integer testImageCount,
            String metrics,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.modelType = modelType;
        this.isQuickMode = isQuickMode;
        this.maxTrainingDurationInHours = maxTrainingDurationInHours;
        this.trainedDurationInHours = trainedDurationInHours;
        this.trainingDataset = trainingDataset;
        this.testingDataset = testingDataset;
        this.validationDataset = validationDataset;
        this.modelVersion = modelVersion;
        this.projectId = projectId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.precision = precision;
        this.recall = recall;
        this.averagePrecision = averagePrecision;
        this.confidenceThreshold = confidenceThreshold;
        this.totalImageCount = totalImageCount;
        this.testImageCount = testImageCount;
        this.metrics = metrics;
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private ModelType modelType;

        public Builder modelType(ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isQuickMode")
        private Boolean isQuickMode;

        public Builder isQuickMode(Boolean isQuickMode) {
            this.isQuickMode = isQuickMode;
            this.__explicitlySet__.add("isQuickMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxTrainingDurationInHours")
        private Double maxTrainingDurationInHours;

        public Builder maxTrainingDurationInHours(Double maxTrainingDurationInHours) {
            this.maxTrainingDurationInHours = maxTrainingDurationInHours;
            this.__explicitlySet__.add("maxTrainingDurationInHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainedDurationInHours")
        private Double trainedDurationInHours;

        public Builder trainedDurationInHours(Double trainedDurationInHours) {
            this.trainedDurationInHours = trainedDurationInHours;
            this.__explicitlySet__.add("trainedDurationInHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
        private Dataset trainingDataset;

        public Builder trainingDataset(Dataset trainingDataset) {
            this.trainingDataset = trainingDataset;
            this.__explicitlySet__.add("trainingDataset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testingDataset")
        private Dataset testingDataset;

        public Builder testingDataset(Dataset testingDataset) {
            this.testingDataset = testingDataset;
            this.__explicitlySet__.add("testingDataset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationDataset")
        private Dataset validationDataset;

        public Builder validationDataset(Dataset validationDataset) {
            this.validationDataset = validationDataset;
            this.__explicitlySet__.add("validationDataset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Float precision;

        public Builder precision(Float precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recall")
        private Float recall;

        public Builder recall(Float recall) {
            this.recall = recall;
            this.__explicitlySet__.add("recall");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("averagePrecision")
        private Float averagePrecision;

        public Builder averagePrecision(Float averagePrecision) {
            this.averagePrecision = averagePrecision;
            this.__explicitlySet__.add("averagePrecision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidenceThreshold")
        private Float confidenceThreshold;

        public Builder confidenceThreshold(Float confidenceThreshold) {
            this.confidenceThreshold = confidenceThreshold;
            this.__explicitlySet__.add("confidenceThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalImageCount")
        private Integer totalImageCount;

        public Builder totalImageCount(Integer totalImageCount) {
            this.totalImageCount = totalImageCount;
            this.__explicitlySet__.add("totalImageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testImageCount")
        private Integer testImageCount;

        public Builder testImageCount(Integer testImageCount) {
            this.testImageCount = testImageCount;
            this.__explicitlySet__.add("testImageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private String metrics;

        public Builder metrics(String metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
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

        public Model build() {
            Model __instance__ =
                    new Model(
                            id,
                            displayName,
                            description,
                            compartmentId,
                            modelType,
                            isQuickMode,
                            maxTrainingDurationInHours,
                            trainedDurationInHours,
                            trainingDataset,
                            testingDataset,
                            validationDataset,
                            modelVersion,
                            projectId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            precision,
                            recall,
                            averagePrecision,
                            confidenceThreshold,
                            totalImageCount,
                            testImageCount,
                            metrics,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Model o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .modelType(o.getModelType())
                            .isQuickMode(o.getIsQuickMode())
                            .maxTrainingDurationInHours(o.getMaxTrainingDurationInHours())
                            .trainedDurationInHours(o.getTrainedDurationInHours())
                            .trainingDataset(o.getTrainingDataset())
                            .testingDataset(o.getTestingDataset())
                            .validationDataset(o.getValidationDataset())
                            .modelVersion(o.getModelVersion())
                            .projectId(o.getProjectId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .precision(o.getPrecision())
                            .recall(o.getRecall())
                            .averagePrecision(o.getAveragePrecision())
                            .confidenceThreshold(o.getConfidenceThreshold())
                            .totalImageCount(o.getTotalImageCount())
                            .testImageCount(o.getTestImageCount())
                            .metrics(o.getMetrics())
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
     * A unique identifier that is immutable after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * A human-friendly name for the model, which can be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * An optional description of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The compartment identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * What type of Vision model this is.
     **/
    public enum ModelType {
        ImageClassification("IMAGE_CLASSIFICATION"),
        ObjectDetection("OBJECT_DETECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * What type of Vision model this is.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final ModelType modelType;

    public ModelType getModelType() {
        return modelType;
    }

    /**
     * Set to true when experimenting with a new model type or dataset, so model training is quick, with a predefined low number of passes through the training data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isQuickMode")
    private final Boolean isQuickMode;

    public Boolean getIsQuickMode() {
        return isQuickMode;
    }

    /**
     * The maximum model training duration in hours, expressed as a decimal fraction.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTrainingDurationInHours")
    private final Double maxTrainingDurationInHours;

    public Double getMaxTrainingDurationInHours() {
        return maxTrainingDurationInHours;
    }

    /**
     * The total hours actually used for model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainedDurationInHours")
    private final Double trainedDurationInHours;

    public Double getTrainedDurationInHours() {
        return trainedDurationInHours;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("trainingDataset")
    private final Dataset trainingDataset;

    public Dataset getTrainingDataset() {
        return trainingDataset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("testingDataset")
    private final Dataset testingDataset;

    public Dataset getTestingDataset() {
        return testingDataset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validationDataset")
    private final Dataset validationDataset;

    public Dataset getValidationDataset() {
        return validationDataset;
    }

    /**
     * The version of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project that contains the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    public String getProjectId() {
        return projectId;
    }

    /**
     * When the model was created, as an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the model was updated, as an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the model.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * The current state of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail, that can provide actionable information if training failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The precision of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    private final Float precision;

    public Float getPrecision() {
        return precision;
    }

    /**
     * Recall of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recall")
    private final Float recall;

    public Float getRecall() {
        return recall;
    }

    /**
     * The mean average precision of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("averagePrecision")
    private final Float averagePrecision;

    public Float getAveragePrecision() {
        return averagePrecision;
    }

    /**
     * The intersection over the union threshold used for calculating precision and recall.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidenceThreshold")
    private final Float confidenceThreshold;

    public Float getConfidenceThreshold() {
        return confidenceThreshold;
    }

    /**
     * The number of images in the dataset used to train, validate, and test the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalImageCount")
    private final Integer totalImageCount;

    public Integer getTotalImageCount() {
        return totalImageCount;
    }

    /**
     * The number of images set aside for evaluating model performance metrics after training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testImageCount")
    private final Integer testImageCount;

    public Integer getTestImageCount() {
        return testImageCount;
    }

    /**
     * The complete set of per-label metrics for successfully trained models.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final String metrics;

    public String getMetrics() {
        return metrics;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
     * For example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * For example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("Model(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", isQuickMode=").append(String.valueOf(this.isQuickMode));
        sb.append(", maxTrainingDurationInHours=")
                .append(String.valueOf(this.maxTrainingDurationInHours));
        sb.append(", trainedDurationInHours=").append(String.valueOf(this.trainedDurationInHours));
        sb.append(", trainingDataset=").append(String.valueOf(this.trainingDataset));
        sb.append(", testingDataset=").append(String.valueOf(this.testingDataset));
        sb.append(", validationDataset=").append(String.valueOf(this.validationDataset));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", recall=").append(String.valueOf(this.recall));
        sb.append(", averagePrecision=").append(String.valueOf(this.averagePrecision));
        sb.append(", confidenceThreshold=").append(String.valueOf(this.confidenceThreshold));
        sb.append(", totalImageCount=").append(String.valueOf(this.totalImageCount));
        sb.append(", testImageCount=").append(String.valueOf(this.testImageCount));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
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
        if (!(o instanceof Model)) {
            return false;
        }

        Model other = (Model) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.isQuickMode, other.isQuickMode)
                && java.util.Objects.equals(
                        this.maxTrainingDurationInHours, other.maxTrainingDurationInHours)
                && java.util.Objects.equals(
                        this.trainedDurationInHours, other.trainedDurationInHours)
                && java.util.Objects.equals(this.trainingDataset, other.trainingDataset)
                && java.util.Objects.equals(this.testingDataset, other.testingDataset)
                && java.util.Objects.equals(this.validationDataset, other.validationDataset)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.recall, other.recall)
                && java.util.Objects.equals(this.averagePrecision, other.averagePrecision)
                && java.util.Objects.equals(this.confidenceThreshold, other.confidenceThreshold)
                && java.util.Objects.equals(this.totalImageCount, other.totalImageCount)
                && java.util.Objects.equals(this.testImageCount, other.testImageCount)
                && java.util.Objects.equals(this.metrics, other.metrics)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.isQuickMode == null ? 43 : this.isQuickMode.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTrainingDurationInHours == null
                                ? 43
                                : this.maxTrainingDurationInHours.hashCode());
        result =
                (result * PRIME)
                        + (this.trainedDurationInHours == null
                                ? 43
                                : this.trainedDurationInHours.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingDataset == null ? 43 : this.trainingDataset.hashCode());
        result =
                (result * PRIME)
                        + (this.testingDataset == null ? 43 : this.testingDataset.hashCode());
        result =
                (result * PRIME)
                        + (this.validationDataset == null ? 43 : this.validationDataset.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.recall == null ? 43 : this.recall.hashCode());
        result =
                (result * PRIME)
                        + (this.averagePrecision == null ? 43 : this.averagePrecision.hashCode());
        result =
                (result * PRIME)
                        + (this.confidenceThreshold == null
                                ? 43
                                : this.confidenceThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.totalImageCount == null ? 43 : this.totalImageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.testImageCount == null ? 43 : this.testImageCount.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
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
