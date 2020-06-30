/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

/**
 * The API for the MySQL Database Service
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public interface Mysqlaas extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * Creates a new Configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request);

    /**
     * Deletes a Configuration.
     * The Configuration must not be in use by any DB Systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request);

    /**
     * Get the full details of the specified Configuration, including the list of MySQL Variables and their values.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConfigurationResponse getConfiguration(GetConfigurationRequest request);

    /**
     * Lists the Configurations available when creating a DB System.
     * <p>
     * This may include DEFAULT configurations per Shape and CUSTOM configurations.
     * <p>
     * The default sort order is a multi-part sort by:
     *   - shapeName, ascending
     *   - DEFAULT-before-CUSTOM
     *   - displayName ascending
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request);

    /**
     * Gets a list of the shapes you can use to create a new MySQL DB System.
     * The shape determines the resources allocated to the DB System:
     * CPU cores and memory for VM shapes; CPU cores, memory and
     * storage for non-VM (or bare metal) shapes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListShapesResponse listShapes(ListShapesRequest request);

    /**
     * Get a list of supported and available MySQL database major versions.
     * <p>
     * The list is sorted by version family.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVersionsResponse listVersions(ListVersionsRequest request);

    /**
     * Updates the Configuration details.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    MysqlaasWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    MysqlaasPaginators getPaginators();
}
