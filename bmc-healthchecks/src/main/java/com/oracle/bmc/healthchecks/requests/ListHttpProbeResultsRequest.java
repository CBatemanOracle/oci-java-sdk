/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.requests;

import com.oracle.bmc.healthchecks.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ListHttpProbeResultsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListHttpProbeResultsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class ListHttpProbeResultsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of a monitor or on-demand probe.
     */
    private String probeConfigurationId;

    public String getProbeConfigurationId() {
        return probeConfigurationId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header
     * from the previous "List" call.
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * Returns results with a {@code startTime} equal to or greater than the specified value.
     */
    private Double startTimeGreaterThanOrEqualTo;

    public Double getStartTimeGreaterThanOrEqualTo() {
        return startTimeGreaterThanOrEqualTo;
    }
    /**
     * Returns results with a {@code startTime} equal to or less than the specified value.
     */
    private Double startTimeLessThanOrEqualTo;

    public Double getStartTimeLessThanOrEqualTo() {
        return startTimeLessThanOrEqualTo;
    }
    /**
     * Controls the sort order of results.
     */
    private SortOrder sortOrder;

    /**
     * Controls the sort order of results.
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
     * Filters results that match the {@code target}.
     */
    private String target;

    public String getTarget() {
        return target;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListHttpProbeResultsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String probeConfigurationId = null;

        /**
         * The OCID of a monitor or on-demand probe.
         * @return this builder instance
         */
        public Builder probeConfigurationId(String probeConfigurationId) {
            this.probeConfigurationId = probeConfigurationId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header
         * from the previous "List" call.
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private Double startTimeGreaterThanOrEqualTo = null;

        /**
         * Returns results with a {@code startTime} equal to or greater than the specified value.
         * @return this builder instance
         */
        public Builder startTimeGreaterThanOrEqualTo(Double startTimeGreaterThanOrEqualTo) {
            this.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            return this;
        }

        private Double startTimeLessThanOrEqualTo = null;

        /**
         * Returns results with a {@code startTime} equal to or less than the specified value.
         * @return this builder instance
         */
        public Builder startTimeLessThanOrEqualTo(Double startTimeLessThanOrEqualTo) {
            this.startTimeLessThanOrEqualTo = startTimeLessThanOrEqualTo;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * Controls the sort order of results.
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private String target = null;

        /**
         * Filters results that match the {@code target}.
         * @return this builder instance
         */
        public Builder target(String target) {
            this.target = target;
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
        public Builder copy(ListHttpProbeResultsRequest o) {
            probeConfigurationId(o.getProbeConfigurationId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            startTimeGreaterThanOrEqualTo(o.getStartTimeGreaterThanOrEqualTo());
            startTimeLessThanOrEqualTo(o.getStartTimeLessThanOrEqualTo());
            sortOrder(o.getSortOrder());
            target(o.getTarget());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListHttpProbeResultsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListHttpProbeResultsRequest
         */
        public ListHttpProbeResultsRequest build() {
            ListHttpProbeResultsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListHttpProbeResultsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListHttpProbeResultsRequest
         */
        public ListHttpProbeResultsRequest buildWithoutInvocationCallback() {
            ListHttpProbeResultsRequest request = new ListHttpProbeResultsRequest();
            request.probeConfigurationId = probeConfigurationId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            request.startTimeLessThanOrEqualTo = startTimeLessThanOrEqualTo;
            request.sortOrder = sortOrder;
            request.target = target;
            return request;
            // new ListHttpProbeResultsRequest(probeConfigurationId, opcRequestId, limit, page, startTimeGreaterThanOrEqualTo, startTimeLessThanOrEqualTo, sortOrder, target);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .probeConfigurationId(probeConfigurationId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .startTimeGreaterThanOrEqualTo(startTimeGreaterThanOrEqualTo)
                .startTimeLessThanOrEqualTo(startTimeLessThanOrEqualTo)
                .sortOrder(sortOrder)
                .target(target);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",probeConfigurationId=").append(String.valueOf(this.probeConfigurationId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",startTimeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.startTimeGreaterThanOrEqualTo));
        sb.append(",startTimeLessThanOrEqualTo=")
                .append(String.valueOf(this.startTimeLessThanOrEqualTo));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",target=").append(String.valueOf(this.target));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListHttpProbeResultsRequest)) {
            return false;
        }

        ListHttpProbeResultsRequest other = (ListHttpProbeResultsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.probeConfigurationId, other.probeConfigurationId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.startTimeGreaterThanOrEqualTo, other.startTimeGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.startTimeLessThanOrEqualTo, other.startTimeLessThanOrEqualTo)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.target, other.target);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.probeConfigurationId == null
                                ? 43
                                : this.probeConfigurationId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeGreaterThanOrEqualTo == null
                                ? 43
                                : this.startTimeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeLessThanOrEqualTo == null
                                ? 43
                                : this.startTimeLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        return result;
    }
}
