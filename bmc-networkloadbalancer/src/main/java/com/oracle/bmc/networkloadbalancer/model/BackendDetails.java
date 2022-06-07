/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The network network load balancing configuration details of a backend server.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackendDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "ipAddress",
        "targetId",
        "port",
        "weight",
        "isBackup",
        "isDrain",
        "isOffline"
    })
    public BackendDetails(
            String name,
            String ipAddress,
            String targetId,
            Integer port,
            Integer weight,
            Boolean isBackup,
            Boolean isDrain,
            Boolean isOffline) {
        super();
        this.name = name;
        this.ipAddress = ipAddress;
        this.targetId = targetId;
        this.port = port;
        this.weight = weight;
        this.isBackup = isBackup;
        this.isDrain = isDrain;
        this.isOffline = isOffline;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBackup")
        private Boolean isBackup;

        public Builder isBackup(Boolean isBackup) {
            this.isBackup = isBackup;
            this.__explicitlySet__.add("isBackup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDrain")
        private Boolean isDrain;

        public Builder isDrain(Boolean isDrain) {
            this.isDrain = isDrain;
            this.__explicitlySet__.add("isDrain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOffline")
        private Boolean isOffline;

        public Builder isOffline(Boolean isOffline) {
            this.isOffline = isOffline;
            this.__explicitlySet__.add("isOffline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendDetails build() {
            BackendDetails __instance__ =
                    new BackendDetails(
                            name, ipAddress, targetId, port, weight, isBackup, isDrain, isOffline);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .ipAddress(o.getIpAddress())
                            .targetId(o.getTargetId())
                            .port(o.getPort())
                            .weight(o.getWeight())
                            .isBackup(o.getIsBackup())
                            .isDrain(o.getIsDrain())
                            .isOffline(o.getIsOffline());

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
     * A read-only field showing the IP address/OCID and port that uniquely identify this backend server in the backend set.
     * <p>
     * Example: {@code 10.0.0.3:8080}, or {@code ocid1.privateip..oc1.<var>&lt;unique_ID&gt;</var>:443} or {@code 10.0.0.3:0}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The IP address of the backend server.
     * <p>
     * Example: {@code 10.0.0.3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The IP OCID/Instance OCID associated with the backend server.
     * Example: {@code ocid1.privateip..oc1.<var>&lt;unique_ID&gt;</var>}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    public String getTargetId() {
        return targetId;
    }

    /**
     * The communication port for the backend server.
     * <p>
     * Example: {@code 8080}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    public Integer getPort() {
        return port;
    }

    /**
     * The network load balancing policy weight assigned to the server. Backend servers with a higher weight receive a larger
     * proportion of incoming traffic. For example, a server weighted '3' receives three times the number of new connections
     * as a server weighted '1'.
     * For more information about load balancing policies, see
     * [How Network Load Balancing Policies Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
     * <p>
     * Example: {@code 3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    public Integer getWeight() {
        return weight;
    }

    /**
     * Whether the network load balancer should treat this server as a backup unit. If {@code true}, then the network load balancer forwards no ingress
     * traffic to this backend server unless all other backend servers not marked as "isBackup" fail the health check policy.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBackup")
    private final Boolean isBackup;

    public Boolean getIsBackup() {
        return isBackup;
    }

    /**
     * Whether the network load balancer should drain this server. Servers marked "isDrain" receive no
     * incoming traffic.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDrain")
    private final Boolean isDrain;

    public Boolean getIsDrain() {
        return isDrain;
    }

    /**
     * Whether the network load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOffline")
    private final Boolean isOffline;

    public Boolean getIsOffline() {
        return isOffline;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BackendDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append(", isBackup=").append(String.valueOf(this.isBackup));
        sb.append(", isDrain=").append(String.valueOf(this.isDrain));
        sb.append(", isOffline=").append(String.valueOf(this.isOffline));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackendDetails)) {
            return false;
        }

        BackendDetails other = (BackendDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.isBackup, other.isBackup)
                && java.util.Objects.equals(this.isDrain, other.isDrain)
                && java.util.Objects.equals(this.isOffline, other.isOffline)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result = (result * PRIME) + (this.isBackup == null ? 43 : this.isBackup.hashCode());
        result = (result * PRIME) + (this.isDrain == null ? 43 : this.isDrain.hashCode());
        result = (result * PRIME) + (this.isOffline == null ? 43 : this.isOffline.hashCode());
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
