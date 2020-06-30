/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Use this API to manage the Oracle Cloud VMware Solution.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public interface SddcAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Moves an SDDC into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSddcCompartmentResponse> changeSddcCompartment(
            ChangeSddcCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeSddcCompartmentRequest, ChangeSddcCompartmentResponse>
                    handler);

    /**
     * Creates a software-defined data center (SDDC).
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * creation of the SDDC.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSddcResponse> createSddc(
            CreateSddcRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSddcRequest, CreateSddcResponse> handler);

    /**
     * Deletes the specified SDDC, along with the other resources that were
     * created with the SDDC. For example: the Compute instances, DNS records,
     * and so on.
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * deletion of the SDDC.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSddcResponse> deleteSddc(
            DeleteSddcRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSddcRequest, DeleteSddcResponse> handler);

    /**
     * Gets the specified SDDC's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSddcResponse> getSddc(
            GetSddcRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSddcRequest, GetSddcResponse> handler);

    /**
     * Lists the SDDCs in the specified compartment. The list can be
     * filtered by display name or availability domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSddcsResponse> listSddcs(
            ListSddcsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSddcsRequest, ListSddcsResponse> handler);

    /**
     * Lists the versions of bundled VMware software supported by the Oracle Cloud
     * VMware Solution.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSupportedVmwareSoftwareVersionsResponse>
            listSupportedVmwareSoftwareVersions(
                    ListSupportedVmwareSoftwareVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSupportedVmwareSoftwareVersionsRequest,
                                    ListSupportedVmwareSoftwareVersionsResponse>
                            handler);

    /**
     * Updates the specified SDDC.
     * <p>
     **Important:** Updating an SDDC affects only certain attributes in the `Sddc`
     * object and does not affect the VMware environment currently running in
     * the SDDC. For more information, see
     * {@link #updateSddcDetails(UpdateSddcDetailsRequest, Consumer, Consumer) updateSddcDetails}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSddcResponse> updateSddc(
            UpdateSddcRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSddcRequest, UpdateSddcResponse> handler);
}
