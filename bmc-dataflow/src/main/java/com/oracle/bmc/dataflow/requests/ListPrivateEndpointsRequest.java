/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.requests;

import com.oracle.bmc.dataflow.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataflow/ListPrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPrivateEndpointsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class ListPrivateEndpointsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment.
     *
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this value.
     * Otherwise, a random request ID will be generated by the service.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of results to return in a paginated {@code List} call.
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the last {@code List} call
     * to sent back to server for getting the next page of results.
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The LifecycleState of the private endpoint.
     *
     */
    private com.oracle.bmc.dataflow.model.PrivateEndpointLifecycleState lifecycleState;

    public com.oracle.bmc.dataflow.model.PrivateEndpointLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The field used to sort the results. Multiple fields are not supported.
     *
     */
    private SortBy sortBy;

    /**
     * The field used to sort the results. Multiple fields are not supported.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The ordering of results in ascending or descending order.
     *
     */
    private SortOrder sortOrder;

    /**
     * The ordering of results in ascending or descending order.
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The query parameter for the Spark application name.
     *
     */
    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
    /**
     * The OCID of the user who created the resource.
     *
     */
    private String ownerPrincipalId;

    public String getOwnerPrincipalId() {
        return ownerPrincipalId;
    }
    /**
     * The displayName prefix.
     *
     */
    private String displayNameStartsWith;

    public String getDisplayNameStartsWith() {
        return displayNameStartsWith;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPrivateEndpointsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this value.
         * Otherwise, a random request ID will be generated by the service.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of results to return in a paginated {@code List} call.
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the last {@code List} call
         * to sent back to server for getting the next page of results.
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private com.oracle.bmc.dataflow.model.PrivateEndpointLifecycleState lifecycleState = null;

        /**
         * The LifecycleState of the private endpoint.
         *
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.dataflow.model.PrivateEndpointLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field used to sort the results. Multiple fields are not supported.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The ordering of results in ascending or descending order.
         *
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private String displayName = null;

        /**
         * The query parameter for the Spark application name.
         *
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        private String ownerPrincipalId = null;

        /**
         * The OCID of the user who created the resource.
         *
         * @return this builder instance
         */
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }

        private String displayNameStartsWith = null;

        /**
         * The displayName prefix.
         *
         * @return this builder instance
         */
        public Builder displayNameStartsWith(String displayNameStartsWith) {
            this.displayNameStartsWith = displayNameStartsWith;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPrivateEndpointsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            displayName(o.getDisplayName());
            ownerPrincipalId(o.getOwnerPrincipalId());
            displayNameStartsWith(o.getDisplayNameStartsWith());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPrivateEndpointsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPrivateEndpointsRequest
         */
        public ListPrivateEndpointsRequest build() {
            ListPrivateEndpointsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPrivateEndpointsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPrivateEndpointsRequest
         */
        public ListPrivateEndpointsRequest buildWithoutInvocationCallback() {
            ListPrivateEndpointsRequest request = new ListPrivateEndpointsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.displayName = displayName;
            request.ownerPrincipalId = ownerPrincipalId;
            request.displayNameStartsWith = displayNameStartsWith;
            return request;
            // new ListPrivateEndpointsRequest(compartmentId, opcRequestId, limit, page, lifecycleState, sortBy, sortOrder, displayName, ownerPrincipalId, displayNameStartsWith);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .displayName(displayName)
                .ownerPrincipalId(ownerPrincipalId)
                .displayNameStartsWith(displayNameStartsWith);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",ownerPrincipalId=").append(String.valueOf(this.ownerPrincipalId));
        sb.append(",displayNameStartsWith=").append(String.valueOf(this.displayNameStartsWith));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPrivateEndpointsRequest)) {
            return false;
        }

        ListPrivateEndpointsRequest other = (ListPrivateEndpointsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.ownerPrincipalId, other.ownerPrincipalId)
                && java.util.Objects.equals(
                        this.displayNameStartsWith, other.displayNameStartsWith);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerPrincipalId == null ? 43 : this.ownerPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameStartsWith == null
                                ? 43
                                : this.displayNameStartsWith.hashCode());
        return result;
    }
}
