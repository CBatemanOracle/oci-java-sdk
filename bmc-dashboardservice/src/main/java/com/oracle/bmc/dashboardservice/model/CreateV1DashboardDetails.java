/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice.model;

/**
 * Details for creating a version 1 dashboard.
 * The interpretation of the {@code config} and {@code widgets} fields depends on the runtime behavior of the Oracle Cloud Infrastructure Console.
 * The sum of the {@code config} and {@code widget} fields JSON text representation cannot exceed 200 KB.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateV1DashboardDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "schemaVersion"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateV1DashboardDetails extends CreateDashboardDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dashboardGroupId")
        private String dashboardGroupId;

        public Builder dashboardGroupId(String dashboardGroupId) {
            this.dashboardGroupId = dashboardGroupId;
            this.__explicitlySet__.add("dashboardGroupId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private Object config;

        public Builder config(Object config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("widgets")
        private java.util.List<Object> widgets;

        public Builder widgets(java.util.List<Object> widgets) {
            this.widgets = widgets;
            this.__explicitlySet__.add("widgets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateV1DashboardDetails build() {
            CreateV1DashboardDetails __instance__ =
                    new CreateV1DashboardDetails(
                            dashboardGroupId,
                            displayName,
                            description,
                            freeformTags,
                            definedTags,
                            config,
                            widgets);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateV1DashboardDetails o) {
            Builder copiedBuilder =
                    dashboardGroupId(o.getDashboardGroupId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .config(o.getConfig())
                            .widgets(o.getWidgets());

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
    public CreateV1DashboardDetails(
            String dashboardGroupId,
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Object config,
            java.util.List<Object> widgets) {
        super(dashboardGroupId, displayName, description, freeformTags, definedTags);
        this.config = config;
        this.widgets = widgets;
    }

    /**
     * The layout and widget placement for the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final Object config;

    public Object getConfig() {
        return config;
    }

    /**
     * The basic visualization building blocks of a dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("widgets")
    private final java.util.List<Object> widgets;

    public java.util.List<Object> getWidgets() {
        return widgets;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateV1DashboardDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", widgets=").append(String.valueOf(this.widgets));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateV1DashboardDetails)) {
            return false;
        }

        CreateV1DashboardDetails other = (CreateV1DashboardDetails) o;
        return java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.widgets, other.widgets)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.widgets == null ? 43 : this.widgets.hashCode());
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
