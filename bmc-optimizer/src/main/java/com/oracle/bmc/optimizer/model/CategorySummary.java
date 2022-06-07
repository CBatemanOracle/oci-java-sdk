/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the category summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CategorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CategorySummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "name",
        "description",
        "recommendationCounts",
        "resourceCounts",
        "lifecycleState",
        "estimatedCostSaving",
        "timeCreated",
        "timeUpdated",
        "extendedMetadata"
    })
    public CategorySummary(
            String id,
            String compartmentId,
            String name,
            String description,
            java.util.List<RecommendationCount> recommendationCounts,
            java.util.List<ResourceCount> resourceCounts,
            LifecycleState lifecycleState,
            Double estimatedCostSaving,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> extendedMetadata) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.recommendationCounts = recommendationCounts;
        this.resourceCounts = resourceCounts;
        this.lifecycleState = lifecycleState;
        this.estimatedCostSaving = estimatedCostSaving;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.extendedMetadata = extendedMetadata;
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationCounts")
        private java.util.List<RecommendationCount> recommendationCounts;

        public Builder recommendationCounts(
                java.util.List<RecommendationCount> recommendationCounts) {
            this.recommendationCounts = recommendationCounts;
            this.__explicitlySet__.add("recommendationCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceCounts")
        private java.util.List<ResourceCount> resourceCounts;

        public Builder resourceCounts(java.util.List<ResourceCount> resourceCounts) {
            this.resourceCounts = resourceCounts;
            this.__explicitlySet__.add("resourceCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
        private Double estimatedCostSaving;

        public Builder estimatedCostSaving(Double estimatedCostSaving) {
            this.estimatedCostSaving = estimatedCostSaving;
            this.__explicitlySet__.add("estimatedCostSaving");
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

        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CategorySummary build() {
            CategorySummary __instance__ =
                    new CategorySummary(
                            id,
                            compartmentId,
                            name,
                            description,
                            recommendationCounts,
                            resourceCounts,
                            lifecycleState,
                            estimatedCostSaving,
                            timeCreated,
                            timeUpdated,
                            extendedMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CategorySummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .recommendationCounts(o.getRecommendationCounts())
                            .resourceCounts(o.getResourceCounts())
                            .lifecycleState(o.getLifecycleState())
                            .estimatedCostSaving(o.getEstimatedCostSaving())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .extendedMetadata(o.getExtendedMetadata());

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
     * The unique OCID of the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the tenancy. The tenancy is the root compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name assigned to the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Text describing the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * An array of {@code RecommendationCount} objects grouped by the level of importance assigned to each recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationCounts")
    private final java.util.List<RecommendationCount> recommendationCounts;

    public java.util.List<RecommendationCount> getRecommendationCounts() {
        return recommendationCounts;
    }

    /**
     * An array of {@code ResourceCount} objects grouped by the status of each recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCounts")
    private final java.util.List<ResourceCount> resourceCounts;

    public java.util.List<ResourceCount> getResourceCounts() {
        return resourceCounts;
    }

    /**
     * The category's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The estimated cost savings, in dollars, for the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
    private final Double estimatedCostSaving;

    public Double getEstimatedCostSaving() {
        return estimatedCostSaving;
    }

    /**
     * The date and time the category details were created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the category details were last updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Additional metadata key/value pairs for the category summary.
     * <p>
     * For example:
     * <p>
     * {@code {"EstimatedSaving": "200"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CategorySummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", recommendationCounts=").append(String.valueOf(this.recommendationCounts));
        sb.append(", resourceCounts=").append(String.valueOf(this.resourceCounts));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", estimatedCostSaving=").append(String.valueOf(this.estimatedCostSaving));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CategorySummary)) {
            return false;
        }

        CategorySummary other = (CategorySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.recommendationCounts, other.recommendationCounts)
                && java.util.Objects.equals(this.resourceCounts, other.resourceCounts)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.estimatedCostSaving, other.estimatedCostSaving)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationCounts == null
                                ? 43
                                : this.recommendationCounts.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCounts == null ? 43 : this.resourceCounts.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedCostSaving == null
                                ? 43
                                : this.estimatedCostSaving.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
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
