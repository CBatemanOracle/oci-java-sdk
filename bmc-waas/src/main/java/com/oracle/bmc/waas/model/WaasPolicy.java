/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The details of a Web Application Acceleration and Security (WAAS) policy. A policy describes how the WAAS service should operate for the configured web application.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WaasPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WaasPolicy {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "domain",
        "additionalDomains",
        "cname",
        "lifecycleState",
        "timeCreated",
        "origins",
        "originGroups",
        "policyConfig",
        "wafConfig",
        "freeformTags",
        "definedTags"
    })
    public WaasPolicy(
            String id,
            String compartmentId,
            String displayName,
            String domain,
            java.util.List<String> additionalDomains,
            String cname,
            LifecycleStates lifecycleState,
            java.util.Date timeCreated,
            java.util.Map<String, Origin> origins,
            java.util.Map<String, OriginGroup> originGroups,
            PolicyConfig policyConfig,
            WafConfig wafConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.domain = domain;
        this.additionalDomains = additionalDomains;
        this.cname = cname;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.origins = origins;
        this.originGroups = originGroups;
        this.policyConfig = policyConfig;
        this.wafConfig = wafConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
        private java.util.List<String> additionalDomains;

        public Builder additionalDomains(java.util.List<String> additionalDomains) {
            this.additionalDomains = additionalDomains;
            this.__explicitlySet__.add("additionalDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cname")
        private String cname;

        public Builder cname(String cname) {
            this.cname = cname;
            this.__explicitlySet__.add("cname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("origins")
        private java.util.Map<String, Origin> origins;

        public Builder origins(java.util.Map<String, Origin> origins) {
            this.origins = origins;
            this.__explicitlySet__.add("origins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
        private java.util.Map<String, OriginGroup> originGroups;

        public Builder originGroups(java.util.Map<String, OriginGroup> originGroups) {
            this.originGroups = originGroups;
            this.__explicitlySet__.add("originGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
        private PolicyConfig policyConfig;

        public Builder policyConfig(PolicyConfig policyConfig) {
            this.policyConfig = policyConfig;
            this.__explicitlySet__.add("policyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
        private WafConfig wafConfig;

        public Builder wafConfig(WafConfig wafConfig) {
            this.wafConfig = wafConfig;
            this.__explicitlySet__.add("wafConfig");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WaasPolicy build() {
            WaasPolicy __instance__ =
                    new WaasPolicy(
                            id,
                            compartmentId,
                            displayName,
                            domain,
                            additionalDomains,
                            cname,
                            lifecycleState,
                            timeCreated,
                            origins,
                            originGroups,
                            policyConfig,
                            wafConfig,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WaasPolicy o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .domain(o.getDomain())
                            .additionalDomains(o.getAdditionalDomains())
                            .cname(o.getCname())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .origins(o.getOrigins())
                            .originGroups(o.getOriginGroups())
                            .policyConfig(o.getPolicyConfig())
                            .wafConfig(o.getWafConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy's compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly name of the WAAS policy. The name can be changed and does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The web application domain that the WAAS policy protects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    public String getDomain() {
        return domain;
    }

    /**
     * An array of additional domains for this web application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
    private final java.util.List<String> additionalDomains;

    public java.util.List<String> getAdditionalDomains() {
        return additionalDomains;
    }

    /**
     * The CNAME record to add to your DNS configuration to route traffic for the domain, and all additional domains, through the WAF.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cname")
    private final String cname;

    public String getCname() {
        return cname;
    }

    /**
     * The current lifecycle state of the WAAS policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the policy was created, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * A map of host servers (origins) and their keys for the web application. Origin keys are used to associate origins to specific protection rules. The key should be a user-friendly name for the host. **Examples:** {@code primary} or {@code secondary}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("origins")
    private final java.util.Map<String, Origin> origins;

    public java.util.Map<String, Origin> getOrigins() {
        return origins;
    }

    /**
     * The map of origin groups and their keys used to associate origins to the {@code wafConfig}. Origin groups allow you to apply weights to groups of origins for load balancing purposes. Origins with higher weights will receive larger proportions of client requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
    private final java.util.Map<String, OriginGroup> originGroups;

    public java.util.Map<String, OriginGroup> getOriginGroups() {
        return originGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
    private final PolicyConfig policyConfig;

    public PolicyConfig getPolicyConfig() {
        return policyConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
    private final WafConfig wafConfig;

    public WafConfig getWafConfig() {
        return wafConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WaasPolicy(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", additionalDomains=").append(String.valueOf(this.additionalDomains));
        sb.append(", cname=").append(String.valueOf(this.cname));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", origins=").append(String.valueOf(this.origins));
        sb.append(", originGroups=").append(String.valueOf(this.originGroups));
        sb.append(", policyConfig=").append(String.valueOf(this.policyConfig));
        sb.append(", wafConfig=").append(String.valueOf(this.wafConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaasPolicy)) {
            return false;
        }

        WaasPolicy other = (WaasPolicy) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.additionalDomains, other.additionalDomains)
                && java.util.Objects.equals(this.cname, other.cname)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.origins, other.origins)
                && java.util.Objects.equals(this.originGroups, other.originGroups)
                && java.util.Objects.equals(this.policyConfig, other.policyConfig)
                && java.util.Objects.equals(this.wafConfig, other.wafConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDomains == null ? 43 : this.additionalDomains.hashCode());
        result = (result * PRIME) + (this.cname == null ? 43 : this.cname.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.origins == null ? 43 : this.origins.hashCode());
        result = (result * PRIME) + (this.originGroups == null ? 43 : this.originGroups.hashCode());
        result = (result * PRIME) + (this.policyConfig == null ? 43 : this.policyConfig.hashCode());
        result = (result * PRIME) + (this.wafConfig == null ? 43 : this.wafConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
