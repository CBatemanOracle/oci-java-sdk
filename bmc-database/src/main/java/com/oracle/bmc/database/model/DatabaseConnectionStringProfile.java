/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The connection string profile to allow clients to group, filter and select connection string values based on structured metadata.
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
    builder = DatabaseConnectionStringProfile.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseConnectionStringProfile {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "value",
        "consumerGroup",
        "protocol",
        "tlsAuthentication",
        "hostFormat",
        "sessionMode",
        "syntaxFormat"
    })
    public DatabaseConnectionStringProfile(
            String displayName,
            String value,
            ConsumerGroup consumerGroup,
            Protocol protocol,
            TlsAuthentication tlsAuthentication,
            HostFormat hostFormat,
            SessionMode sessionMode,
            SyntaxFormat syntaxFormat) {
        super();
        this.displayName = displayName;
        this.value = value;
        this.consumerGroup = consumerGroup;
        this.protocol = protocol;
        this.tlsAuthentication = tlsAuthentication;
        this.hostFormat = hostFormat;
        this.sessionMode = sessionMode;
        this.syntaxFormat = syntaxFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
        private ConsumerGroup consumerGroup;

        public Builder consumerGroup(ConsumerGroup consumerGroup) {
            this.consumerGroup = consumerGroup;
            this.__explicitlySet__.add("consumerGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsAuthentication")
        private TlsAuthentication tlsAuthentication;

        public Builder tlsAuthentication(TlsAuthentication tlsAuthentication) {
            this.tlsAuthentication = tlsAuthentication;
            this.__explicitlySet__.add("tlsAuthentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostFormat")
        private HostFormat hostFormat;

        public Builder hostFormat(HostFormat hostFormat) {
            this.hostFormat = hostFormat;
            this.__explicitlySet__.add("hostFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
        private SessionMode sessionMode;

        public Builder sessionMode(SessionMode sessionMode) {
            this.sessionMode = sessionMode;
            this.__explicitlySet__.add("sessionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("syntaxFormat")
        private SyntaxFormat syntaxFormat;

        public Builder syntaxFormat(SyntaxFormat syntaxFormat) {
            this.syntaxFormat = syntaxFormat;
            this.__explicitlySet__.add("syntaxFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionStringProfile build() {
            DatabaseConnectionStringProfile __instance__ =
                    new DatabaseConnectionStringProfile(
                            displayName,
                            value,
                            consumerGroup,
                            protocol,
                            tlsAuthentication,
                            hostFormat,
                            sessionMode,
                            syntaxFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionStringProfile o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .value(o.getValue())
                            .consumerGroup(o.getConsumerGroup())
                            .protocol(o.getProtocol())
                            .tlsAuthentication(o.getTlsAuthentication())
                            .hostFormat(o.getHostFormat())
                            .sessionMode(o.getSessionMode())
                            .syntaxFormat(o.getSyntaxFormat());

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
     * A user-friendly name for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Connection string value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    public String getValue() {
        return value;
    }

    /**
     * Consumer group used by the connection.
     **/
    public enum ConsumerGroup {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Tp("TP"),
        Tpurgent("TPURGENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConsumerGroup.class);

        private final String value;
        private static java.util.Map<String, ConsumerGroup> map;

        static {
            map = new java.util.HashMap<>();
            for (ConsumerGroup v : ConsumerGroup.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConsumerGroup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConsumerGroup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConsumerGroup', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Consumer group used by the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
    private final ConsumerGroup consumerGroup;

    public ConsumerGroup getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * Protocol used by the connection.
     **/
    public enum Protocol {
        Tcp("TCP"),
        Tcps("TCPS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Protocol.class);

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Protocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Protocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Protocol used by the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * Specifies whether the TLS handshake is using one-way ({@code SERVER}) or mutual ({@code MUTUAL}) authentication.
     **/
    public enum TlsAuthentication {
        Server("SERVER"),
        Mutual("MUTUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TlsAuthentication.class);

        private final String value;
        private static java.util.Map<String, TlsAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (TlsAuthentication v : TlsAuthentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TlsAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TlsAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TlsAuthentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the TLS handshake is using one-way ({@code SERVER}) or mutual ({@code MUTUAL}) authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsAuthentication")
    private final TlsAuthentication tlsAuthentication;

    public TlsAuthentication getTlsAuthentication() {
        return tlsAuthentication;
    }

    /**
     * Host format used in connection string.
     **/
    public enum HostFormat {
        Fqdn("FQDN"),
        Ip("IP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HostFormat.class);

        private final String value;
        private static java.util.Map<String, HostFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (HostFormat v : HostFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HostFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HostFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HostFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Host format used in connection string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostFormat")
    private final HostFormat hostFormat;

    public HostFormat getHostFormat() {
        return hostFormat;
    }

    /**
     * Specifies whether the listener performs a direct hand-off of the session, or redirects the session. In RAC deployments where SCAN is used, sessions are redirected to a Node VIP. Use {@code DIRECT} for direct hand-offs. Use {@code REDIRECT} to redirect the session.
     **/
    public enum SessionMode {
        Direct("DIRECT"),
        Redirect("REDIRECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SessionMode.class);

        private final String value;
        private static java.util.Map<String, SessionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SessionMode v : SessionMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SessionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SessionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SessionMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the listener performs a direct hand-off of the session, or redirects the session. In RAC deployments where SCAN is used, sessions are redirected to a Node VIP. Use {@code DIRECT} for direct hand-offs. Use {@code REDIRECT} to redirect the session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
    private final SessionMode sessionMode;

    public SessionMode getSessionMode() {
        return sessionMode;
    }

    /**
     * Specifies whether the connection string is using the long ({@code LONG}), Easy Connect ({@code EZCONNECT}), or Easy Connect Plus ({@code EZCONNECTPLUS}) format.
     * Autonomous Databases on shared Exadata infrastructure always use the long format.
     *
     **/
    public enum SyntaxFormat {
        Long("LONG"),
        Ezconnect("EZCONNECT"),
        Ezconnectplus("EZCONNECTPLUS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SyntaxFormat.class);

        private final String value;
        private static java.util.Map<String, SyntaxFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (SyntaxFormat v : SyntaxFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SyntaxFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyntaxFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SyntaxFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the connection string is using the long ({@code LONG}), Easy Connect ({@code EZCONNECT}), or Easy Connect Plus ({@code EZCONNECTPLUS}) format.
     * Autonomous Databases on shared Exadata infrastructure always use the long format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syntaxFormat")
    private final SyntaxFormat syntaxFormat;

    public SyntaxFormat getSyntaxFormat() {
        return syntaxFormat;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseConnectionStringProfile(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", consumerGroup=").append(String.valueOf(this.consumerGroup));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", tlsAuthentication=").append(String.valueOf(this.tlsAuthentication));
        sb.append(", hostFormat=").append(String.valueOf(this.hostFormat));
        sb.append(", sessionMode=").append(String.valueOf(this.sessionMode));
        sb.append(", syntaxFormat=").append(String.valueOf(this.syntaxFormat));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConnectionStringProfile)) {
            return false;
        }

        DatabaseConnectionStringProfile other = (DatabaseConnectionStringProfile) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.consumerGroup, other.consumerGroup)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.tlsAuthentication, other.tlsAuthentication)
                && java.util.Objects.equals(this.hostFormat, other.hostFormat)
                && java.util.Objects.equals(this.sessionMode, other.sessionMode)
                && java.util.Objects.equals(this.syntaxFormat, other.syntaxFormat)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.consumerGroup == null ? 43 : this.consumerGroup.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.tlsAuthentication == null ? 43 : this.tlsAuthentication.hashCode());
        result = (result * PRIME) + (this.hostFormat == null ? 43 : this.hostFormat.hashCode());
        result = (result * PRIME) + (this.sessionMode == null ? 43 : this.sessionMode.hashCode());
        result = (result * PRIME) + (this.syntaxFormat == null ? 43 : this.syntaxFormat.hashCode());
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
