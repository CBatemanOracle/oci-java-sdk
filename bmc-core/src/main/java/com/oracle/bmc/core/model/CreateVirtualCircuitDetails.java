/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 *
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
    builder = CreateVirtualCircuitDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateVirtualCircuitDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bandwidthShapeName",
        "compartmentId",
        "crossConnectMappings",
        "routingPolicy",
        "bgpAdminState",
        "isBfdEnabled",
        "customerBgpAsn",
        "customerAsn",
        "definedTags",
        "displayName",
        "freeformTags",
        "gatewayId",
        "providerName",
        "providerServiceId",
        "providerServiceKeyName",
        "providerServiceName",
        "publicPrefixes",
        "region",
        "type",
        "ipMtu"
    })
    public CreateVirtualCircuitDetails(
            String bandwidthShapeName,
            String compartmentId,
            java.util.List<CrossConnectMapping> crossConnectMappings,
            java.util.List<RoutingPolicy> routingPolicy,
            BgpAdminState bgpAdminState,
            Boolean isBfdEnabled,
            Integer customerBgpAsn,
            Long customerAsn,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String gatewayId,
            String providerName,
            String providerServiceId,
            String providerServiceKeyName,
            String providerServiceName,
            java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes,
            String region,
            Type type,
            VirtualCircuitIpMtu ipMtu) {
        super();
        this.bandwidthShapeName = bandwidthShapeName;
        this.compartmentId = compartmentId;
        this.crossConnectMappings = crossConnectMappings;
        this.routingPolicy = routingPolicy;
        this.bgpAdminState = bgpAdminState;
        this.isBfdEnabled = isBfdEnabled;
        this.customerBgpAsn = customerBgpAsn;
        this.customerAsn = customerAsn;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.gatewayId = gatewayId;
        this.providerName = providerName;
        this.providerServiceId = providerServiceId;
        this.providerServiceKeyName = providerServiceKeyName;
        this.providerServiceName = providerServiceName;
        this.publicPrefixes = publicPrefixes;
        this.region = region;
        this.type = type;
        this.ipMtu = ipMtu;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        public Builder bandwidthShapeName(String bandwidthShapeName) {
            this.bandwidthShapeName = bandwidthShapeName;
            this.__explicitlySet__.add("bandwidthShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        public Builder crossConnectMappings(
                java.util.List<CrossConnectMapping> crossConnectMappings) {
            this.crossConnectMappings = crossConnectMappings;
            this.__explicitlySet__.add("crossConnectMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingPolicy")
        private java.util.List<RoutingPolicy> routingPolicy;

        public Builder routingPolicy(java.util.List<RoutingPolicy> routingPolicy) {
            this.routingPolicy = routingPolicy;
            this.__explicitlySet__.add("routingPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpAdminState")
        private BgpAdminState bgpAdminState;

        public Builder bgpAdminState(BgpAdminState bgpAdminState) {
            this.bgpAdminState = bgpAdminState;
            this.__explicitlySet__.add("bgpAdminState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBfdEnabled")
        private Boolean isBfdEnabled;

        public Builder isBfdEnabled(Boolean isBfdEnabled) {
            this.isBfdEnabled = isBfdEnabled;
            this.__explicitlySet__.add("isBfdEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        public Builder customerBgpAsn(Integer customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerAsn")
        private Long customerAsn;

        public Builder customerAsn(Long customerAsn) {
            this.customerAsn = customerAsn;
            this.__explicitlySet__.add("customerAsn");
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

        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            this.__explicitlySet__.add("gatewayId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
        private String providerServiceId;

        public Builder providerServiceId(String providerServiceId) {
            this.providerServiceId = providerServiceId;
            this.__explicitlySet__.add("providerServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceKeyName")
        private String providerServiceKeyName;

        public Builder providerServiceKeyName(String providerServiceKeyName) {
            this.providerServiceKeyName = providerServiceKeyName;
            this.__explicitlySet__.add("providerServiceKeyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        public Builder providerServiceName(String providerServiceName) {
            this.providerServiceName = providerServiceName;
            this.__explicitlySet__.add("providerServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
        private java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

        public Builder publicPrefixes(
                java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes) {
            this.publicPrefixes = publicPrefixes;
            this.__explicitlySet__.add("publicPrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipMtu")
        private VirtualCircuitIpMtu ipMtu;

        public Builder ipMtu(VirtualCircuitIpMtu ipMtu) {
            this.ipMtu = ipMtu;
            this.__explicitlySet__.add("ipMtu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVirtualCircuitDetails build() {
            CreateVirtualCircuitDetails __instance__ =
                    new CreateVirtualCircuitDetails(
                            bandwidthShapeName,
                            compartmentId,
                            crossConnectMappings,
                            routingPolicy,
                            bgpAdminState,
                            isBfdEnabled,
                            customerBgpAsn,
                            customerAsn,
                            definedTags,
                            displayName,
                            freeformTags,
                            gatewayId,
                            providerName,
                            providerServiceId,
                            providerServiceKeyName,
                            providerServiceName,
                            publicPrefixes,
                            region,
                            type,
                            ipMtu);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVirtualCircuitDetails o) {
            Builder copiedBuilder =
                    bandwidthShapeName(o.getBandwidthShapeName())
                            .compartmentId(o.getCompartmentId())
                            .crossConnectMappings(o.getCrossConnectMappings())
                            .routingPolicy(o.getRoutingPolicy())
                            .bgpAdminState(o.getBgpAdminState())
                            .isBfdEnabled(o.getIsBfdEnabled())
                            .customerBgpAsn(o.getCustomerBgpAsn())
                            .customerAsn(o.getCustomerAsn())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .gatewayId(o.getGatewayId())
                            .providerName(o.getProviderName())
                            .providerServiceId(o.getProviderServiceId())
                            .providerServiceKeyName(o.getProviderServiceKeyName())
                            .providerServiceName(o.getProviderServiceName())
                            .publicPrefixes(o.getPublicPrefixes())
                            .region(o.getRegion())
                            .type(o.getType())
                            .ipMtu(o.getIpMtu());

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
     * The provisioned data rate of the connection. To get a list of the
     * available bandwidth levels (that is, shapes), see
     * {@link #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest) listFastConnectProviderVirtualCircuitBandwidthShapes}.
     * <p>
     * Example: {@code 10 Gbps}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    private final String bandwidthShapeName;

    public String getBandwidthShapeName() {
        return bandwidthShapeName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Create a {@code CrossConnectMapping} for each cross-connect or cross-connect
     * group this virtual circuit will run on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    private final java.util.List<CrossConnectMapping> crossConnectMappings;

    public java.util.List<CrossConnectMapping> getCrossConnectMappings() {
        return crossConnectMappings;
    }

    /**
     **/
    public enum RoutingPolicy {
        OracleServiceNetwork("ORACLE_SERVICE_NETWORK"),
        Regional("REGIONAL"),
        MarketLevel("MARKET_LEVEL"),
        Global("GLOBAL"),
        ;

        private final String value;
        private static java.util.Map<String, RoutingPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (RoutingPolicy v : RoutingPolicy.values()) {
                map.put(v.getValue(), v);
            }
        }

        RoutingPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RoutingPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RoutingPolicy: " + key);
        }
    };
    /**
     * The routing policy sets how routing information about the Oracle cloud is shared over a public virtual circuit.
     * Policies available are: {@code ORACLE_SERVICE_NETWORK}, {@code REGIONAL}, {@code MARKET_LEVEL}, and {@code GLOBAL}.
     * See [Route Filtering](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/routingonprem.htm#route_filtering) for details.
     * By default, routing information is shared for all routes in the same market.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routingPolicy")
    private final java.util.List<RoutingPolicy> routingPolicy;

    public java.util.List<RoutingPolicy> getRoutingPolicy() {
        return routingPolicy;
    }

    /**
     * Set to {@code ENABLED} (the default) to activate the BGP session of the virtual circuit, set to {@code DISABLED} to deactivate the virtual circuit.
     *
     **/
    public enum BgpAdminState {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, BgpAdminState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpAdminState v : BgpAdminState.values()) {
                map.put(v.getValue(), v);
            }
        }

        BgpAdminState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpAdminState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BgpAdminState: " + key);
        }
    };
    /**
     * Set to {@code ENABLED} (the default) to activate the BGP session of the virtual circuit, set to {@code DISABLED} to deactivate the virtual circuit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpAdminState")
    private final BgpAdminState bgpAdminState;

    public BgpAdminState getBgpAdminState() {
        return bgpAdminState;
    }

    /**
     * Set to {@code true} to enable BFD for IPv4 BGP peering, or set to {@code false} to disable BFD. If this is not set, the default is {@code false}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBfdEnabled")
    private final Boolean isBfdEnabled;

    public Boolean getIsBfdEnabled() {
        return isBfdEnabled;
    }

    /**
     * Deprecated. Instead use {@code customerAsn}.
     * If you specify values for both, the request will be rejected.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    private final Integer customerBgpAsn;

    public Integer getCustomerBgpAsn() {
        return customerBgpAsn;
    }

    /**
     * Your BGP ASN (either public or private). Provide this value only if
     * there's a BGP session that goes from your edge router to Oracle.
     * Otherwise, leave this empty or null.
     * Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
     * <p>
     * Example: {@code 12345} (2-byte) or {@code 1587232876} (4-byte)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerAsn")
    private final Long customerAsn;

    public Long getCustomerAsn() {
        return customerAsn;
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
     * For private virtual circuits only. The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@link Drg}
     * that this virtual circuit uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    private final String gatewayId;

    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * Deprecated. Instead use {@code providerServiceId}.
     * To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    public String getProviderName() {
        return providerName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service offered by the provider (if you're connecting
     * via a provider). To get a list of the available service offerings, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
    private final String providerServiceId;

    public String getProviderServiceId() {
        return providerServiceId;
    }

    /**
     * The service key name offered by the provider (if the customer is connecting via a provider).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceKeyName")
    private final String providerServiceKeyName;

    public String getProviderServiceKeyName() {
        return providerServiceKeyName;
    }

    /**
     * Deprecated. Instead use {@code providerServiceId}.
     * To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest) listFastConnectProviderServices}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    private final String providerServiceName;

    public String getProviderServiceName() {
        return providerServiceName;
    }

    /**
     * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to
     * advertise across the connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
    private final java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

    public java.util.List<CreateVirtualCircuitPublicPrefixDetails> getPublicPrefixes() {
        return publicPrefixes;
    }

    /**
     * The Oracle Cloud Infrastructure region where this virtual
     * circuit is located.
     * Example: {@code phx}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    public String getRegion() {
        return region;
    }

    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE
     * means [RFC 1918](https://tools.ietf.org/html/rfc1918) addresses
     * (10.0.0.0/8, 172.16/12, and 192.168/16).
     *
     **/
    public enum Type {
        Public("PUBLIC"),
        Private("PRIVATE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE
     * means [RFC 1918](https://tools.ietf.org/html/rfc1918) addresses
     * (10.0.0.0/8, 172.16/12, and 192.168/16).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    public Type getType() {
        return type;
    }

    /**
     * The layer 3 IP MTU to use with this virtual circuit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipMtu")
    private final VirtualCircuitIpMtu ipMtu;

    public VirtualCircuitIpMtu getIpMtu() {
        return ipMtu;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateVirtualCircuitDetails(");
        sb.append("bandwidthShapeName=").append(String.valueOf(this.bandwidthShapeName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", crossConnectMappings=").append(String.valueOf(this.crossConnectMappings));
        sb.append(", routingPolicy=").append(String.valueOf(this.routingPolicy));
        sb.append(", bgpAdminState=").append(String.valueOf(this.bgpAdminState));
        sb.append(", isBfdEnabled=").append(String.valueOf(this.isBfdEnabled));
        sb.append(", customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", customerAsn=").append(String.valueOf(this.customerAsn));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", gatewayId=").append(String.valueOf(this.gatewayId));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerServiceId=").append(String.valueOf(this.providerServiceId));
        sb.append(", providerServiceKeyName=").append(String.valueOf(this.providerServiceKeyName));
        sb.append(", providerServiceName=").append(String.valueOf(this.providerServiceName));
        sb.append(", publicPrefixes=").append(String.valueOf(this.publicPrefixes));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", ipMtu=").append(String.valueOf(this.ipMtu));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVirtualCircuitDetails)) {
            return false;
        }

        CreateVirtualCircuitDetails other = (CreateVirtualCircuitDetails) o;
        return java.util.Objects.equals(this.bandwidthShapeName, other.bandwidthShapeName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.crossConnectMappings, other.crossConnectMappings)
                && java.util.Objects.equals(this.routingPolicy, other.routingPolicy)
                && java.util.Objects.equals(this.bgpAdminState, other.bgpAdminState)
                && java.util.Objects.equals(this.isBfdEnabled, other.isBfdEnabled)
                && java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.customerAsn, other.customerAsn)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.gatewayId, other.gatewayId)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerServiceId, other.providerServiceId)
                && java.util.Objects.equals(
                        this.providerServiceKeyName, other.providerServiceKeyName)
                && java.util.Objects.equals(this.providerServiceName, other.providerServiceName)
                && java.util.Objects.equals(this.publicPrefixes, other.publicPrefixes)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.ipMtu, other.ipMtu)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bandwidthShapeName == null
                                ? 43
                                : this.bandwidthShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectMappings == null
                                ? 43
                                : this.crossConnectMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.routingPolicy == null ? 43 : this.routingPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpAdminState == null ? 43 : this.bgpAdminState.hashCode());
        result = (result * PRIME) + (this.isBfdEnabled == null ? 43 : this.isBfdEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpAsn == null ? 43 : this.customerBgpAsn.hashCode());
        result = (result * PRIME) + (this.customerAsn == null ? 43 : this.customerAsn.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.gatewayId == null ? 43 : this.gatewayId.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceId == null ? 43 : this.providerServiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceKeyName == null
                                ? 43
                                : this.providerServiceKeyName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceName == null
                                ? 43
                                : this.providerServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.publicPrefixes == null ? 43 : this.publicPrefixes.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.ipMtu == null ? 43 : this.ipMtu.hashCode());
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
