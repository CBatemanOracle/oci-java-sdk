/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListProjectsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListProjectsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class ListProjectsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment in which to list resources.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique identifier or OCID for listing a single resource by ID.
     */
    private String id;

    public String getId() {
        return id;
    }
    /**
     * A filter to return only Projects that matches the given lifecycleState.
     */
    private com.oracle.bmc.devops.model.Project.LifecycleState lifecycleState;

    public com.oracle.bmc.devops.model.Project.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the entire name given.
     */
    private String name;

    public String getName() {
        return name;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The sort order to use. Use either ascending or descending.
     */
    private com.oracle.bmc.devops.model.SortOrder sortOrder;

    public com.oracle.bmc.devops.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListProjectsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String compartmentId = null;

        /**
         * The OCID of the compartment in which to list resources.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private String id = null;

        /**
         * Unique identifier or OCID for listing a single resource by ID.
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        private com.oracle.bmc.devops.model.Project.LifecycleState lifecycleState = null;

        /**
         * A filter to return only Projects that matches the given lifecycleState.
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.devops.model.Project.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private String name = null;

        /**
         * A filter to return only resources that match the entire name given.
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private com.oracle.bmc.devops.model.SortOrder sortOrder = null;

        /**
         * The sort order to use. Use either ascending or descending.
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.devops.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListProjectsRequest o) {
            compartmentId(o.getCompartmentId());
            id(o.getId());
            lifecycleState(o.getLifecycleState());
            name(o.getName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListProjectsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListProjectsRequest
         */
        public ListProjectsRequest build() {
            ListProjectsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListProjectsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListProjectsRequest
         */
        public ListProjectsRequest buildWithoutInvocationCallback() {
            ListProjectsRequest request = new ListProjectsRequest();
            request.compartmentId = compartmentId;
            request.id = id;
            request.lifecycleState = lifecycleState;
            request.name = name;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListProjectsRequest(compartmentId, id, lifecycleState, name, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .id(id)
                .lifecycleState(lifecycleState)
                .name(name)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListProjectsRequest)) {
            return false;
        }

        ListProjectsRequest other = (ListProjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
