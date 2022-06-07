/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Full glossary details. A glossary of business terms, such as 'Customer', 'Account', 'Contact' , 'Address',
 * or 'Product', with definitions, used to provide common meaning across disparate data assets. Business glossaries
 * may be hierarchical where some terms may contain child terms to allow them to be used as 'taxonomies'.
 * By linking data assets, data entities, and attributes to glossaries and glossary terms, the glossary can act as a
 * way of organizing data catalog objects in a hierarchy to make a large number of objects more navigable and easier to
 * consume. Objects in the data aatalog, such as data assets or data entities, may be linked to any level in the
 * glossary, so that the glossary can be used to browse the available data according to the business model of the
 * organization.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Glossary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Glossary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "catalogId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "owner",
        "workflowStatus",
        "customPropertyMembers",
        "importJobDefinitionKey",
        "importJobKey",
        "latestImportJobExecutionKey",
        "latestImportJobExecutionStatus",
        "uri"
    })
    public Glossary(
            String key,
            String displayName,
            String description,
            String catalogId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            String owner,
            TermWorkflowStatus workflowStatus,
            java.util.List<CustomPropertyGetUsage> customPropertyMembers,
            String importJobDefinitionKey,
            String importJobKey,
            String latestImportJobExecutionKey,
            String latestImportJobExecutionStatus,
            String uri) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogId = catalogId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.owner = owner;
        this.workflowStatus = workflowStatus;
        this.customPropertyMembers = customPropertyMembers;
        this.importJobDefinitionKey = importJobDefinitionKey;
        this.importJobKey = importJobKey;
        this.latestImportJobExecutionKey = latestImportJobExecutionKey;
        this.latestImportJobExecutionStatus = latestImportJobExecutionStatus;
        this.uri = uri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
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

        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
        private TermWorkflowStatus workflowStatus;

        public Builder workflowStatus(TermWorkflowStatus workflowStatus) {
            this.workflowStatus = workflowStatus;
            this.__explicitlySet__.add("workflowStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertyGetUsage> customPropertyMembers;

        public Builder customPropertyMembers(
                java.util.List<CustomPropertyGetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
        private String importJobDefinitionKey;

        public Builder importJobDefinitionKey(String importJobDefinitionKey) {
            this.importJobDefinitionKey = importJobDefinitionKey;
            this.__explicitlySet__.add("importJobDefinitionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
        private String importJobKey;

        public Builder importJobKey(String importJobKey) {
            this.importJobKey = importJobKey;
            this.__explicitlySet__.add("importJobKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionKey")
        private String latestImportJobExecutionKey;

        public Builder latestImportJobExecutionKey(String latestImportJobExecutionKey) {
            this.latestImportJobExecutionKey = latestImportJobExecutionKey;
            this.__explicitlySet__.add("latestImportJobExecutionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionStatus")
        private String latestImportJobExecutionStatus;

        public Builder latestImportJobExecutionStatus(String latestImportJobExecutionStatus) {
            this.latestImportJobExecutionStatus = latestImportJobExecutionStatus;
            this.__explicitlySet__.add("latestImportJobExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Glossary build() {
            Glossary __instance__ =
                    new Glossary(
                            key,
                            displayName,
                            description,
                            catalogId,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            createdById,
                            updatedById,
                            owner,
                            workflowStatus,
                            customPropertyMembers,
                            importJobDefinitionKey,
                            importJobKey,
                            latestImportJobExecutionKey,
                            latestImportJobExecutionStatus,
                            uri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Glossary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .catalogId(o.getCatalogId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .createdById(o.getCreatedById())
                            .updatedById(o.getUpdatedById())
                            .owner(o.getOwner())
                            .workflowStatus(o.getWorkflowStatus())
                            .customPropertyMembers(o.getCustomPropertyMembers())
                            .importJobDefinitionKey(o.getImportJobDefinitionKey())
                            .importJobKey(o.getImportJobKey())
                            .latestImportJobExecutionKey(o.getLatestImportJobExecutionKey())
                            .latestImportJobExecutionStatus(o.getLatestImportJobExecutionStatus())
                            .uri(o.getUri());

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
     * Unique glossary key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    public String getCatalogId() {
        return catalogId;
    }

    /**
     * The current state of the glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the glossary was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the glossary. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * OCID of the user who created this metadata element.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    public String getCreatedById() {
        return createdById;
    }

    /**
     * OCID of the user who updated this metadata element.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * OCID of the user who is the owner of the glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    public String getOwner() {
        return owner;
    }

    /**
     * Status of the approval process workflow for this business glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
    private final TermWorkflowStatus workflowStatus;

    public TermWorkflowStatus getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertyGetUsage> customPropertyMembers;

    public java.util.List<CustomPropertyGetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * The unique key of the job definition resource that was used in the Glossary import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
    private final String importJobDefinitionKey;

    public String getImportJobDefinitionKey() {
        return importJobDefinitionKey;
    }

    /**
     * The unique key of the job policy for Glossary import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
    private final String importJobKey;

    public String getImportJobKey() {
        return importJobKey;
    }

    /**
     * The unique key of the parent job execution for which the log resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionKey")
    private final String latestImportJobExecutionKey;

    public String getLatestImportJobExecutionKey() {
        return latestImportJobExecutionKey;
    }

    /**
     * Status of the latest glossary import job execution, such as running, paused, or completed.
     * This may include additional information like time import started , import file size and % of completion
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionStatus")
    private final String latestImportJobExecutionStatus;

    public String getLatestImportJobExecutionStatus() {
        return latestImportJobExecutionStatus;
    }

    /**
     * URI to the tag instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Glossary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", workflowStatus=").append(String.valueOf(this.workflowStatus));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", importJobDefinitionKey=").append(String.valueOf(this.importJobDefinitionKey));
        sb.append(", importJobKey=").append(String.valueOf(this.importJobKey));
        sb.append(", latestImportJobExecutionKey=")
                .append(String.valueOf(this.latestImportJobExecutionKey));
        sb.append(", latestImportJobExecutionStatus=")
                .append(String.valueOf(this.latestImportJobExecutionStatus));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Glossary)) {
            return false;
        }

        Glossary other = (Glossary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.workflowStatus, other.workflowStatus)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(
                        this.importJobDefinitionKey, other.importJobDefinitionKey)
                && java.util.Objects.equals(this.importJobKey, other.importJobKey)
                && java.util.Objects.equals(
                        this.latestImportJobExecutionKey, other.latestImportJobExecutionKey)
                && java.util.Objects.equals(
                        this.latestImportJobExecutionStatus, other.latestImportJobExecutionStatus)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result =
                (result * PRIME)
                        + (this.workflowStatus == null ? 43 : this.workflowStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result =
                (result * PRIME)
                        + (this.importJobDefinitionKey == null
                                ? 43
                                : this.importJobDefinitionKey.hashCode());
        result = (result * PRIME) + (this.importJobKey == null ? 43 : this.importJobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.latestImportJobExecutionKey == null
                                ? 43
                                : this.latestImportJobExecutionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.latestImportJobExecutionStatus == null
                                ? 43
                                : this.latestImportJobExecutionStatus.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
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
