/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The data to update an instance pool.
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
    builder = UpdateInstancePoolDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateInstancePoolDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "instanceConfigurationId",
        "placementConfigurations",
        "size"
    })
    public UpdateInstancePoolDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String instanceConfigurationId,
            java.util.List<UpdateInstancePoolPlacementConfigurationDetails> placementConfigurations,
            Integer size) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.instanceConfigurationId = instanceConfigurationId;
        this.placementConfigurations = placementConfigurations;
        this.size = size;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
        private String instanceConfigurationId;

        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
            this.__explicitlySet__.add("instanceConfigurationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("placementConfigurations")
        private java.util.List<UpdateInstancePoolPlacementConfigurationDetails>
                placementConfigurations;

        public Builder placementConfigurations(
                java.util.List<UpdateInstancePoolPlacementConfigurationDetails>
                        placementConfigurations) {
            this.placementConfigurations = placementConfigurations;
            this.__explicitlySet__.add("placementConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInstancePoolDetails build() {
            UpdateInstancePoolDetails __instance__ =
                    new UpdateInstancePoolDetails(
                            definedTags,
                            displayName,
                            freeformTags,
                            instanceConfigurationId,
                            placementConfigurations,
                            size);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInstancePoolDetails o) {
            Builder copiedBuilder =
                    definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .instanceConfigurationId(o.getInstanceConfigurationId())
                            .placementConfigurations(o.getPlacementConfigurations())
                            .size(o.getSize());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance configuration associated with the
     * instance pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
    private final String instanceConfigurationId;

    public String getInstanceConfigurationId() {
        return instanceConfigurationId;
    }

    /**
     * The placement configurations for the instance pool. Provide one placement configuration for
     * each availability domain.
     * <p>
     * To use the instance pool with a regional subnet, provide a placement configuration for
     * each availability domain, and include the regional subnet in each placement
     * configuration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("placementConfigurations")
    private final java.util.List<UpdateInstancePoolPlacementConfigurationDetails>
            placementConfigurations;

    public java.util.List<UpdateInstancePoolPlacementConfigurationDetails>
            getPlacementConfigurations() {
        return placementConfigurations;
    }

    /**
     * The number of instances that should be in the instance pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateInstancePoolDetails(");
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", instanceConfigurationId=")
                .append(String.valueOf(this.instanceConfigurationId));
        sb.append(", placementConfigurations=")
                .append(String.valueOf(this.placementConfigurations));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInstancePoolDetails)) {
            return false;
        }

        UpdateInstancePoolDetails other = (UpdateInstancePoolDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(
                        this.instanceConfigurationId, other.instanceConfigurationId)
                && java.util.Objects.equals(
                        this.placementConfigurations, other.placementConfigurations)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceConfigurationId == null
                                ? 43
                                : this.instanceConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.placementConfigurations == null
                                ? 43
                                : this.placementConfigurations.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
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
