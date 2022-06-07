/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a specific job run.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobRun {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "compartmentId",
        "jobId",
        "jobName",
        "managedDatabaseGroupId",
        "managedDatabaseId",
        "runStatus",
        "timeSubmitted",
        "timeUpdated"
    })
    public JobRun(
            String id,
            String name,
            String compartmentId,
            String jobId,
            String jobName,
            String managedDatabaseGroupId,
            String managedDatabaseId,
            RunStatus runStatus,
            java.util.Date timeSubmitted,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.jobId = jobId;
        this.jobName = jobName;
        this.managedDatabaseGroupId = managedDatabaseGroupId;
        this.managedDatabaseId = managedDatabaseId;
        this.runStatus = runStatus;
        this.timeSubmitted = timeSubmitted;
        this.timeUpdated = timeUpdated;
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobId")
        private String jobId;

        public Builder jobId(String jobId) {
            this.jobId = jobId;
            this.__explicitlySet__.add("jobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobName")
        private String jobName;

        public Builder jobName(String jobName) {
            this.jobName = jobName;
            this.__explicitlySet__.add("jobName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
        private String managedDatabaseGroupId;

        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            this.__explicitlySet__.add("managedDatabaseGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
        private String managedDatabaseId;

        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            this.__explicitlySet__.add("managedDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runStatus")
        private RunStatus runStatus;

        public Builder runStatus(RunStatus runStatus) {
            this.runStatus = runStatus;
            this.__explicitlySet__.add("runStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSubmitted")
        private java.util.Date timeSubmitted;

        public Builder timeSubmitted(java.util.Date timeSubmitted) {
            this.timeSubmitted = timeSubmitted;
            this.__explicitlySet__.add("timeSubmitted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobRun build() {
            JobRun __instance__ =
                    new JobRun(
                            id,
                            name,
                            compartmentId,
                            jobId,
                            jobName,
                            managedDatabaseGroupId,
                            managedDatabaseId,
                            runStatus,
                            timeSubmitted,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobRun o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .jobId(o.getJobId())
                            .jobName(o.getJobName())
                            .managedDatabaseGroupId(o.getManagedDatabaseGroupId())
                            .managedDatabaseId(o.getManagedDatabaseId())
                            .runStatus(o.getRunStatus())
                            .timeSubmitted(o.getTimeSubmitted())
                            .timeUpdated(o.getTimeUpdated());

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
     * The identifier of the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The name of the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which the parent job resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the parent job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobId")
    private final String jobId;

    public String getJobId() {
        return jobId;
    }

    /**
     * The name of the parent job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

    public String getJobName() {
        return jobName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database Group where the parent job has to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
    private final String managedDatabaseGroupId;

    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Managed Database where the parent job has to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
    private final String managedDatabaseId;

    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }

    /**
     * The status of the job run.
     **/
    public enum RunStatus {
        Completed("COMPLETED"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RunStatus.class);

        private final String value;
        private static java.util.Map<String, RunStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (RunStatus v : RunStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RunStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RunStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RunStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runStatus")
    private final RunStatus runStatus;

    public RunStatus getRunStatus() {
        return runStatus;
    }

    /**
     * The date and time when the job run was submitted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSubmitted")
    private final java.util.Date timeSubmitted;

    public java.util.Date getTimeSubmitted() {
        return timeSubmitted;
    }

    /**
     * The date and time when the job run was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobRun(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", jobId=").append(String.valueOf(this.jobId));
        sb.append(", jobName=").append(String.valueOf(this.jobName));
        sb.append(", managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(", managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(", runStatus=").append(String.valueOf(this.runStatus));
        sb.append(", timeSubmitted=").append(String.valueOf(this.timeSubmitted));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobRun)) {
            return false;
        }

        JobRun other = (JobRun) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.jobName, other.jobName)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.runStatus, other.runStatus)
                && java.util.Objects.equals(this.timeSubmitted, other.timeSubmitted)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroupId == null
                                ? 43
                                : this.managedDatabaseGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result = (result * PRIME) + (this.runStatus == null ? 43 : this.runStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSubmitted == null ? 43 : this.timeSubmitted.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
