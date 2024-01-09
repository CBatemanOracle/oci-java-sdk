/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Specify metric extraction for SAVED_SEARCH scheduled task execution to post to OCI Monitoring.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetricExtraction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricExtraction
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "namespace", "metricName", "resourceGroup"})
    public MetricExtraction(
            String compartmentId, String namespace, String metricName, String resourceGroup) {
        super();
        this.compartmentId = compartmentId;
        this.namespace = namespace;
        this.metricName = metricName;
        this.resourceGroup = resourceGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
         * metric.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
         * metric.
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
         * The namespace of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters and underscores (_).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters and underscores (_).
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The metric name of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The metric name of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
         *
         * @param metricName the value to set
         * @return this builder
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricExtraction build() {
            MetricExtraction model =
                    new MetricExtraction(
                            this.compartmentId,
                            this.namespace,
                            this.metricName,
                            this.resourceGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricExtraction model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
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
     * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
     * metric.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
     * metric.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The namespace of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters and underscores (_).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters and underscores (_).
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * The metric name of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and
     * dollar signs ($).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The metric name of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and
     * dollar signs ($).
     *
     * @return the value
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
     * character and includes only alphanumeric characters, periods (.), underscores (_), hyphens
     * (-), and dollar signs ($).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
     * character and includes only alphanumeric characters, periods (.), underscores (_), hyphens
     * (-), and dollar signs ($).
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
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
        sb.append("MetricExtraction(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricExtraction)) {
            return false;
        }

        MetricExtraction other = (MetricExtraction) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
